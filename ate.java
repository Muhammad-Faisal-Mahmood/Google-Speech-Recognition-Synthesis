/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ate
extends kf
implements asn {
    private final PreferenceGroup a;
    private List b;
    private List c;
    private final List d;
    private final Handler e;
    private final Runnable f = new akt(this, 10, null);

    public ate(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
        this.e = new Handler(Looper.getMainLooper());
        preferenceGroup.setOnPreferenceChangeInternalListener(this);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            this.setHasStableIds(((PreferenceScreen)preferenceGroup).e);
        } else {
            this.setHasStableIds(true);
        }
        this.f();
    }

    private final List g(PreferenceGroup preferenceGroup) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = new ArrayList();
        int n2 = preferenceGroup.a();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = preferenceGroup.c(i2);
            int n4 = n3;
            if (((Preference)object2).isVisible()) {
                if (ate.i(preferenceGroup) && n3 >= preferenceGroup.d) {
                    object.add(object2);
                } else {
                    arrayList.add(object2);
                }
                if (!(object2 instanceof PreferenceGroup)) {
                    n4 = n3 + 1;
                } else {
                    object2 = (PreferenceGroup)object2;
                    n4 = n3;
                    if (((PreferenceGroup)object2).f()) {
                        if (ate.i(preferenceGroup) && ate.i((PreferenceGroup)object2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        object2 = this.g((PreferenceGroup)object2).iterator();
                        while (true) {
                            n4 = ++n3;
                            if (!object2.hasNext()) break;
                            Preference preference = (Preference)object2.next();
                            if (ate.i(preferenceGroup) && n3 >= preferenceGroup.d) {
                                object.add(preference);
                                continue;
                            }
                            arrayList.add(preference);
                        }
                    }
                }
            }
            n3 = n4;
        }
        if (ate.i(preferenceGroup) && n3 > preferenceGroup.d) {
            object = new asf(preferenceGroup.getContext(), (List)object, preferenceGroup.getId());
            ((Preference)object).setOnPreferenceClickListener(new atc(this, preferenceGroup));
            arrayList.add(object);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void h(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int n2 = preferenceGroup.a();
        int n3 = 0;
        while (n3 < n2) {
            Preference preference = preferenceGroup.c(n3);
            list.add(preference);
            Object object = new atd(preference);
            if (!this.d.contains(object)) {
                this.d.add(object);
            }
            if (preference instanceof PreferenceGroup && ((PreferenceGroup)(object = (PreferenceGroup)preference)).f()) {
                this.h(list, (PreferenceGroup)object);
            }
            preference.setOnPreferenceChangeInternalListener(this);
            ++n3;
        }
        return;
    }

    private static final boolean i(PreferenceGroup preferenceGroup) {
        return preferenceGroup.d != Integer.MAX_VALUE;
    }

    @Override
    public final void a(Preference preference) {
        int n2 = this.c.indexOf(preference);
        if (n2 != -1) {
            this.notifyItemChanged(n2, preference);
        }
    }

    @Override
    public final void b() {
        this.e.removeCallbacks(this.f);
        this.e.post(this.f);
    }

    @Override
    public final void c() {
        this.b();
    }

    public final int d(String string) {
        int n2 = this.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!TextUtils.equals((CharSequence)string, (CharSequence)((Preference)this.c.get(i2)).getKey())) continue;
            return i2;
        }
        return -1;
    }

    public final Preference e(int n2) {
        if (n2 >= 0 && n2 < this.getItemCount()) {
            return (Preference)this.c.get(n2);
        }
        return null;
    }

    public final void f() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((Preference)iterator.next()).setOnPreferenceChangeInternalListener(null);
        }
        iterator = new ArrayList(this.b.size());
        this.b = iterator;
        this.h((List)((Object)iterator), this.a);
        this.c = this.g(this.a);
        this.a.getPreferenceManager();
        this.notifyDataSetChanged();
        iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((Preference)iterator.next()).clearWasDetached();
        }
    }

    @Override
    public final int getItemCount() {
        return this.c.size();
    }

    @Override
    public final long getItemId(int n2) {
        if (!this.hasStableIds()) {
            return -1L;
        }
        return this.e(n2).getId();
    }

    @Override
    public final int getItemViewType(int n2) {
        atd atd2 = new atd(this.e(n2));
        if ((n2 = this.d.indexOf(atd2)) != -1) {
            return n2;
        }
        List list = this.d;
        n2 = list.size();
        list.add(atd2);
        return n2;
    }
}

