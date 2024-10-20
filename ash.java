/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

public final class ash
implements asr {
    public static ash a;
    public static ash b;
    private final int c;

    public ash(int n2) {
        this.c = n2;
    }

    @Override
    public final /* synthetic */ CharSequence a(Preference object) {
        if (this.c != 0) {
            object = TextUtils.isEmpty((CharSequence)((EditTextPreference)(object = (EditTextPreference)object)).getText()) ? ((Preference)object).getContext().getString(2132017430) : ((EditTextPreference)object).getText();
            return object;
        }
        object = TextUtils.isEmpty((CharSequence)((ListPreference)(object = (ListPreference)object)).getEntry()) ? ((Preference)object).getContext().getString(2132017430) : ((ListPreference)object).getEntry();
        return object;
    }
}

