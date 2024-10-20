/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.provider.Settings$Global
 *  hom
 */
import android.content.ContentResolver;
import android.provider.Settings;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.util.Set;
import java.util.concurrent.Executor;

public final class byi
implements aso {
    final Object a;
    private final int b;

    public /* synthetic */ byi(bzk bzk2, int n2) {
        this.b = n2;
        this.a = bzk2;
    }

    public byi(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final boolean a(Preference object, Object object2) {
        Object object3;
        block8: {
            block7: {
                int n2 = this.b;
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                object = (String)object2;
                                ((heg)((heg)fmj.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/settings/datastore/VoiceImeSettingsDataService", "setLanguage", 81, "VoiceImeSettingsDataService.java")).u("#setLanguage: %s", object);
                                object2 = new fmi(object, 1);
                                object = (bzk)this.a;
                                Object object4 = ((bzk)object).c;
                                object2 = bzb.H(fxf.ak(((fmj)object4).c.b((gte)object2, ((fmj)object4).b), new ezz(object4, 17), ((fmj)object4).b));
                                bzb bzb2 = new bzb((Object)"primary_language");
                                object4 = ((bzk)object).j;
                                ((bzk)object).d.d((bzb)object2, bzb2, (gbv)object4);
                                return false;
                            }
                            object = hav.n((Set)object2);
                            ((heg)((heg)fmj.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/settings/datastore/VoiceImeSettingsDataService", "setAdditionalLanguages", 107, "VoiceImeSettingsDataService.java")).u("#setAdditionalLanguages: %s", object);
                            Object object5 = new fmi(object, 0);
                            object = (bzk)this.a;
                            object2 = ((bzk)object).c;
                            bzb bzb3 = bzb.H(fxf.ak(((fmj)object2).c.b((gte)object5, ((fmj)object2).b), new ezz(object2, 18), ((fmj)object2).b));
                            object2 = new bzb((Object)"voice_languages");
                            object5 = ((bzk)object).j;
                            ((bzk)object).d.d(bzb3, (bzb)object2, (gbv)object5);
                            return false;
                        }
                        boolean bl2 = Boolean.TRUE.equals(object2);
                        Object object6 = new fmh(bl2);
                        object = (bzk)this.a;
                        object2 = ((bzk)object).c;
                        object6 = ((fmj)object2).c.b((gte)object6, ((fmj)object2).b);
                        ((fmj)object2).e.P((hpn)object6, "Transcription:VoiceImeSettings");
                        object6 = new bzb(hno.f((hpn)object6, new gtf(), (Executor)hom.a));
                        bzb bzb4 = new bzb(bl2);
                        object2 = ((bzk)object).i;
                        ((bzk)object).d.d((bzb)object6, bzb4, (gbv)object2);
                        return false;
                    }
                    object = this.a;
                    object2 = object2.toString();
                    n2 = ((ListPreference)object).findIndexOfValue((String)object2);
                    object = ((ListPreference)this.a).getEntries()[n2];
                    ((Preference)this.a).setSummary((CharSequence)object);
                    ((ListPreference)this.a).setValueIndex(n2);
                    return true;
                }
                ((hfk)((hfk)byl.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper$DownloadSettingChangeListener", "onPreferenceChange", 311, "SettingsFragmentHelper.java")).u("DownloadSettingChangeListener#onPreferenceChange: %s", object2);
                object3 = fao.b(Integer.parseInt(object2.toString()));
                if (object3 == null) break block7;
                object = object3;
                if (!((Enum)object3).equals(fao.a)) break block8;
            }
            object = Settings.Global.getInt((ContentResolver)((byl)this.a).f.getContentResolver(), (String)"repair_mode_active", (int)0) > 0 ? fao.b : fao.c;
            ((hfk)((hfk)byl.a.h()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper$DownloadSettingChangeListener", "onPreferenceChange", 319, "SettingsFragmentHelper.java")).C("AutoUpdate Setting did not resolve to a valid value: '%s'. Defaulting to %s.", object2, object);
        }
        object3 = (byl)this.a;
        object2 = new bzb(((byl)object3).c.b((fao)object));
        object = new bzb((Object)Integer.toString(((fao)object).e));
        gbv gbv2 = ((byl)this.a).k;
        ((byl)object3).d.d((bzb)object2, (bzb)object, gbv2);
        return false;
    }
}

