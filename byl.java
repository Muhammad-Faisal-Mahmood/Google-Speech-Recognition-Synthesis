/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.speech.tts.googletts.settings.asr.AutoUpdateDialogPreference;
import com.google.android.apps.speech.tts.googletts.settings.asr.DownloadedLanguageDialogPreference;

public final class byl {
    public static final hfn a = hfn.o("SettingsFragmentHelper");
    public final for b;
    public final byp c;
    public final gbu d;
    public final dxi e;
    public final Context f;
    public gto g;
    public gto h;
    public final byk i = new byk(this);
    public final geg j = new byg(this);
    public final gbv k = new byh(this);
    private final grn l;

    public byl(for for_, grn grn2, byp byp2, gbu gbu2, dxi dxi2, Context context) {
        this.b = for_;
        this.l = grn2;
        this.c = byp2;
        this.d = gbu2;
        this.e = dxi2;
        this.f = context;
    }

    public final AutoUpdateDialogPreference a() {
        Object object = this.b;
        fxf.K(object);
        object = (AutoUpdateDialogPreference)((ata)object).e().b(((be)object).getString(2132017196));
        fxf.K(object);
        return object;
    }

    public final boolean b(Preference preference) {
        Object object = a;
        ((hfk)((hfk)((hdz)object).b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper", "onDisplayPreferenceDialog", 282, "SettingsFragmentHelper.java")).u("#onDisplayPreferenceDialog: %s", preference);
        if (this.b.getParentFragmentManager().e(preference.getKey()) != null) {
            ((hfk)((hfk)((hdz)object).f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper", "onDisplayPreferenceDialog", 285, "SettingsFragmentHelper.java")).u("onDisplayPreferenceDialog did not find fragment with tag %s", preference.getKey());
            return false;
        }
        if (preference instanceof AutoUpdateDialogPreference) {
            String string = preference.getKey();
            object = new bxo();
            iln.e((be)object);
            Bundle bundle = new Bundle();
            bundle.putString("key", string);
            ((be)object).setArguments(bundle);
            ((be)object).setTargetFragment(this.b, 0);
            ((at)object).f(this.b.getParentFragmentManager(), preference.getKey());
            return true;
        }
        if (preference instanceof DownloadedLanguageDialogPreference) {
            ((hfk)((hfk)((hdz)object).b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper", "onDisplayPreferenceDialog", 297, "SettingsFragmentHelper.java")).r("onDisplayPreferenceDialog DownloadedLanguageDialogPreference");
            object = bxs.a(preference.getKey());
            ((be)object).setTargetFragment(this.b, 0);
            ((at)object).f(this.b.getParentFragmentManager(), preference.getKey());
            return true;
        }
        return false;
    }

    public final void c() {
        ((hfk)((hfk)a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper", "onCreatePreferences", 230, "SettingsFragmentHelper.java")).r("#onCreatePreferences");
        Object object = this.b;
        Preference preference = ((ata)object).e();
        object = ((PreferenceGroup)preference).b(((be)object).getString(2132017184));
        if (object != null) {
            ((Preference)object).setOnPreferenceClickListener(new grm(this.l, new bww(this, 7)));
        }
        if (kh.r(this.f)) {
            this.h = object = gto.i((PreferenceCategory)((PreferenceGroup)preference).b(this.b.getString(2132017461)));
            ((PreferenceGroup)((gtt)object).a).c = false;
        }
        this.g = object = gto.i((PreferenceCategory)((PreferenceGroup)preference).b(this.b.getString(2132017269)));
        ((PreferenceGroup)((gtt)object).a).c = false;
        object = this.b;
        fxf.K(object);
        preference = ((PreferenceGroup)preference).b(((be)object).getString(2132017196));
        fxf.K(preference);
        preference = (AutoUpdateDialogPreference)preference;
        ((ListPreference)preference).setEntryValues((CharSequence[])bxp.a.toArray(new String[((hct)bxp.a).c]));
        preference.setOnPreferenceChangeListener(new byi(this, 0));
    }
}

