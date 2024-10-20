/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.View$OnKeyListener
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

public class SeekBarPreference
extends Preference {
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public final boolean e;
    public final boolean f;
    private int g;
    private int h;
    private TextView i;
    private final boolean j;
    private final SeekBar.OnSeekBarChangeListener k = new ato(this);
    private final View.OnKeyListener l = new atp(this);

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969793, 0);
        context = context.obtainStyledAttributes(attributeSet, atn.k, 2130969793, 0);
        this.b = context.getInt(3, 0);
        int n2 = context.getInt(1, 100);
        int n3 = this.b;
        int n4 = n2;
        if (n2 < n3) {
            n4 = n3;
        }
        if (n4 != this.g) {
            this.g = n4;
            this.notifyChanged();
        }
        if ((n4 = context.getInt(4, 0)) != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(n4));
            this.notifyChanged();
        }
        this.e = context.getBoolean(2, true);
        this.j = context.getBoolean(5, false);
        this.f = context.getBoolean(6, false);
        context.recycle();
    }

    private final void c(int n2, boolean bl2) {
        int n3 = this.b;
        int n4 = n2;
        if (n2 < n3) {
            n4 = n3;
        }
        n3 = this.g;
        n2 = n4;
        if (n4 > n3) {
            n2 = n3;
        }
        if (n2 != this.a) {
            this.a = n2;
            this.b(n2);
            this.persistInt(n2);
            if (bl2) {
                this.notifyChanged();
            }
        }
    }

    public final void a(SeekBar seekBar) {
        int n2 = this.b + seekBar.getProgress();
        if (n2 != this.a) {
            if (this.callChangeListener(n2)) {
                this.c(n2, false);
                return;
            }
            seekBar.setProgress(this.a - this.b);
            this.b(this.a);
        }
    }

    public final void b(int n2) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText((CharSequence)String.valueOf(n2));
        }
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        atm2.itemView.setOnKeyListener(this.l);
        this.d = (SeekBar)atm2.a(2131427863);
        atm2 = (TextView)atm2.a(2131427864);
        this.i = atm2;
        if (this.j) {
            atm2.setVisibility(0);
        } else {
            atm2.setVisibility(8);
            this.i = null;
        }
        atm2 = this.d;
        if (atm2 == null) {
            Log.e((String)"SeekBarPreference", (String)"SeekBar view is null in onBindViewHolder.");
            return;
        }
        atm2.setOnSeekBarChangeListener(this.k);
        this.d.setMax(this.g - this.b);
        int n2 = this.h;
        if (n2 != 0) {
            this.d.setKeyProgressIncrement(n2);
        } else {
            this.h = this.d.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        this.b(this.a);
        this.d.setEnabled(this.isEnabled());
    }

    @Override
    protected final Object onGetDefaultValue(TypedArray typedArray, int n2) {
        return typedArray.getInt(n2, 0);
    }

    @Override
    protected final void onRestoreInstanceState(Parcelable object) {
        if (object != null && object.getClass().equals(atq.class)) {
            object = (atq)((Object)object);
            super.onRestoreInstanceState(object.getSuperState());
            this.a = object.a;
            this.b = object.b;
            this.g = object.c;
            this.notifyChanged();
            return;
        }
        super.onRestoreInstanceState((Parcelable)object);
    }

    @Override
    protected final Parcelable onSaveInstanceState() {
        Object object = super.onSaveInstanceState();
        if (this.isPersistent()) {
            return object;
        }
        object = new atq((Parcelable)object);
        object.a = this.a;
        object.b = this.b;
        object.c = this.g;
        return object;
    }

    @Override
    protected final void onSetInitialValue(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = 0;
        }
        this.c(this.getPersistedInt((Integer)object2), true);
    }
}

