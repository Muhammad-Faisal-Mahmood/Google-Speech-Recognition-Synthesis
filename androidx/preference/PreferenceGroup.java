/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.Log
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PreferenceGroup
extends Preference {
    public final pa a = new pa();
    public final List b;
    public boolean c = true;
    public int d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private int f = 0;
    private boolean g = false;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, null);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int n2, byte[] byArray) {
        super(context, attributeSet, n2, 0);
        this.d = Integer.MAX_VALUE;
        this.h = new akt(this, 9, null);
        this.b = new ArrayList();
        context = context.obtainStyledAttributes(attributeSet, atn.i, n2, 0);
        this.c = kt.s((TypedArray)context, 2, 2, true);
        if (context.hasValue(1)) {
            this.e(kt.v((TypedArray)context, 1, 1));
        }
        context.recycle();
    }

    public final int a() {
        return this.b.size();
    }

    public final Preference b(CharSequence charSequence) {
        if (charSequence != null) {
            if (TextUtils.equals((CharSequence)this.getKey(), (CharSequence)charSequence)) {
                return this;
            }
            int n2 = this.a();
            for (int i2 = 0; i2 < n2; ++i2) {
                Preference preference = this.c(i2);
                if (TextUtils.equals((CharSequence)preference.getKey(), (CharSequence)charSequence)) {
                    return preference;
                }
                if (!(preference instanceof PreferenceGroup) || (preference = ((PreferenceGroup)preference).b(charSequence)) == null) continue;
                return preference;
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public final Preference c(int n2) {
        return (Preference)this.b.get(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d() {
        // MONITORENTER : this
        List list = this.b;
        int n2 = list.size();
        while (true) {
            if (--n2 < 0) {
                // MONITOREXIT : this
                this.notifyHierarchyChanged();
                return;
            }
            Preference preference = (Preference)list.get(0);
            // MONITORENTER : this
            preference.onPrepareForRemoval();
            if (preference.getParent() == this) {
                preference.assignParent(null);
            }
            if (this.b.remove(preference)) {
                String string = preference.getKey();
                if (string != null) {
                    this.a.put(string, preference.getId());
                    this.e.removeCallbacks(this.h);
                    this.e.post(this.h);
                }
                if (this.g) {
                    preference.onDetached();
                }
            }
            // MONITOREXIT : this
        }
    }

    @Override
    public final void dispatchRestoreInstanceState(Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.c(i2).dispatchRestoreInstanceState(bundle);
        }
    }

    @Override
    public final void dispatchSaveInstanceState(Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.c(i2).dispatchSaveInstanceState(bundle);
        }
    }

    public final void e(int n2) {
        if (n2 != Integer.MAX_VALUE && !this.hasKey()) {
            Log.e((String)"PreferenceGroup", (String)String.valueOf(this.getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.d = n2;
    }

    public boolean f() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(Preference preference) {
        long l2;
        int n2;
        int n3;
        String string;
        Object object;
        if (this.b.contains(preference)) {
            return;
        }
        if (preference.getKey() != null) {
            object = this;
            while (((Preference)object).getParent() != null) {
                object = ((Preference)object).getParent();
            }
            string = preference.getKey();
            if (((PreferenceGroup)object).b(string) != null) {
                Log.e((String)"PreferenceGroup", (String)a.aj(string, "Found duplicated key: \"", "\". This can cause unintended behaviour, please use unique keys for every preference."));
            }
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.c) {
                n3 = this.f;
                this.f = n3 + 1;
                preference.setOrder(n3);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup)preference).c = this.c;
            }
        }
        n3 = n2 = Collections.binarySearch(this.b, preference);
        if (n2 < 0) {
            n3 = -n2 - 1;
        }
        preference.onParentChanged(this, this.shouldDisableDependents());
        synchronized (this) {
            this.b.add(n3, preference);
        }
        object = this.getPreferenceManager();
        string = preference.getKey();
        if (string != null && this.a.containsKey(string)) {
            l2 = (Long)this.a.get(string);
            this.a.remove(string);
        } else {
            l2 = ((atj)object).a();
        }
        preference.onAttachedToHierarchy((atj)object, l2);
        preference.assignParent(this);
        if (this.g) {
            preference.onAttached();
        }
        this.notifyHierarchyChanged();
    }

    @Override
    public final void notifyDependencyChange(boolean bl2) {
        super.notifyDependencyChange(bl2);
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.c(i2).onParentChanged(this, bl2);
        }
    }

    @Override
    public final void onAttached() {
        super.onAttached();
        this.g = true;
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.c(i2).onAttached();
        }
    }

    @Override
    public final void onDetached() {
        super.onDetached();
        this.g = false;
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.c(i2).onDetached();
        }
    }

    @Override
    protected final void onRestoreInstanceState(Parcelable object) {
        if (object != null && object.getClass().equals(atb.class)) {
            object = (atb)((Object)object);
            this.d = object.a;
            super.onRestoreInstanceState(object.getSuperState());
            return;
        }
        super.onRestoreInstanceState((Parcelable)object);
    }

    @Override
    protected final Parcelable onSaveInstanceState() {
        return new atb(super.onSaveInstanceState(), this.d);
    }
}

