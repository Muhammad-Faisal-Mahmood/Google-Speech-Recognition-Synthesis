/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class asf
extends Preference {
    private long a;

    public asf(Context object, List object2, long l2) {
        super((Context)object);
        this.setLayoutResource(2131624050);
        this.setIcon(2131231014);
        this.setTitle(2132017282);
        this.setOrder(999);
        ArrayList<PreferenceGroup> arrayList = new ArrayList<PreferenceGroup>();
        Iterator iterator = object2.iterator();
        object = null;
        while (iterator.hasNext()) {
            Preference preference = (Preference)iterator.next();
            object2 = preference.getTitle();
            boolean bl2 = preference instanceof PreferenceGroup;
            if (bl2 && !TextUtils.isEmpty((CharSequence)object2)) {
                arrayList.add((PreferenceGroup)preference);
            }
            if (arrayList.contains(preference.getParent())) {
                if (!bl2) continue;
                arrayList.add((PreferenceGroup)preference);
                continue;
            }
            if (TextUtils.isEmpty((CharSequence)object2)) continue;
            if (object == null) {
                object = object2;
                continue;
            }
            object = this.getContext().getString(2132017465, new Object[]{object, object2});
        }
        this.setSummary((CharSequence)object);
        this.a = l2 + 1000000L;
    }

    @Override
    public final long getId() {
        return this.a;
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        atm2.c = false;
    }
}

