/*
 * Decompiled with CFR 0.152.
 */
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.speech.tts.googletts.settings.GeneralSettingsFragment;

public final class bxc
implements aso {
    public final GeneralSettingsFragment a;
    public final Preference b;
    private final int c;

    public /* synthetic */ bxc(GeneralSettingsFragment generalSettingsFragment, Preference preference, int n2) {
        this.c = n2;
        this.a = generalSettingsFragment;
        this.b = preference;
    }

    @Override
    public final boolean a(Preference object, Object object2) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                boolean bl2 = (Boolean)object2;
                ((TwoStatePreference)this.b).setChecked(bl2);
                this.a.ag.f(bl2);
                return true;
            }
            boolean bl3 = (Boolean)object2;
            ((TwoStatePreference)this.b).setChecked(bl3);
            object2 = this.a.ag;
            object = ((bxf)object2).b;
            object2 = ((bxf)object2).c.edit();
            object2.putBoolean(object.getString(2132017315), bl3);
            object2.apply();
            return true;
        }
        object = object2.toString();
        Object object3 = this.b;
        object2 = (ListPreference)object3;
        n2 = ((ListPreference)object2).findIndexOfValue((String)object);
        ((Preference)object3).setSummary(((ListPreference)object2).getEntries()[n2]);
        ((ListPreference)object2).setValueIndex(n2);
        object3 = this.a.ag;
        object2 = ((bxf)object3).b;
        object3 = ((bxf)object3).c.edit();
        object3.putString(object2.getString(2132017311), (String)object);
        object3.apply();
        return true;
    }
}

