/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.apps.speech.tts.googletts.settings.asr.AddLanguagesActivity;
import com.google.android.apps.speech.tts.googletts.settings.asr.ForceEnableTntComponentsActivity;
import com.google.android.apps.speech.tts.googletts.settings.asr.SettingsActivity;
import com.google.android.apps.speech.tts.googletts.settings.asr.voiceime.ui.VoiceImeSettingsActivity;
import com.google.android.apps.speech.tts.googletts.settings.privacydashboard.PrivacyDashboardActivity;
import com.google.android.libraries.speech.modelmanager.languagepack.ui.DownloadActivity;
import com.google.android.libraries.speech.transcription.ui.TranscriptionActivity;
import com.google.android.libraries.speech.transcription.voiceime.permissions.PermissionsActivity;
import java.io.Serializable;
import java.util.ArrayList;

public final class mn
implements nj {
    public final mr a;
    private final int b;

    public mn(bh bh2, int n2) {
        this.b = n2;
        this.a = bh2;
    }

    public /* synthetic */ mn(mr mr2, int n2) {
        this.b = n2;
        this.a = mr2;
    }

    @Override
    public final void a(Context object) {
        switch (this.b) {
            default: {
                object = this.a;
                fmc fmc2 = (fmc)object;
                if (fmc2.k) break;
                fmc2.k = true;
                fmc2.bn();
                object = (PermissionsActivity)object;
                return;
            }
            case 14: {
                mr mr2 = this.a;
                object = (fkl)mr2;
                if (!((fkl)object).k) {
                    ((fkl)object).k = true;
                    ((fkl)object).bn();
                    object = (TranscriptionActivity)mr2;
                }
                return;
            }
            case 13: {
                mr mr3 = this.a;
                object = (fdb)mr3;
                if (!((fdb)object).q) {
                    ((fdb)object).q = true;
                    object = ((fdb)object).bn();
                    mr3 = (DownloadActivity)mr3;
                    object = (brb)object;
                    ((DownloadActivity)mr3).n = (jmm)((brb)object).a.b();
                    ((DownloadActivity)mr3).l = (hpr)((brb)object).c.b.b();
                }
                return;
            }
            case 12: {
                object = this.a;
                fcu fcu2 = (fcu)object;
                if (!fcu2.k) {
                    fcu2.k = true;
                    fcu2.bn();
                    object = (com.google.android.libraries.speech.modelmanager.languagepack.legacy.DownloadActivity)object;
                }
                return;
            }
            case 11: {
                ((PrivacyDashboardActivity)this.a).t();
                ((bzm)this.a).bn().b().a();
                return;
            }
            case 10: {
                mr mr4 = this.a;
                object = (bzm)mr4;
                if (!((bzm)object).k) {
                    ((bzm)object).k = true;
                    ((bzm)object).bn();
                    object = (PrivacyDashboardActivity)mr4;
                }
                return;
            }
            case 9: {
                ((VoiceImeSettingsActivity)this.a).u();
                ((bzc)this.a).bn().b().a();
                return;
            }
            case 8: {
                mr mr5 = this.a;
                object = (bzc)mr5;
                if (!((bzc)object).k) {
                    ((bzc)object).k = true;
                    ((bzc)object).bn();
                    object = (VoiceImeSettingsActivity)mr5;
                }
                return;
            }
            case 7: {
                ((SettingsActivity)this.a).u();
                ((bya)this.a).bn().b().a();
                return;
            }
            case 6: {
                mr mr6 = this.a;
                object = (bya)mr6;
                if (!((bya)object).k) {
                    ((bya)object).k = true;
                    ((bya)object).bn();
                    object = (SettingsActivity)mr6;
                }
                return;
            }
            case 5: {
                object = this.a;
                bxy bxy2 = (bxy)object;
                if (!bxy2.k) {
                    bxy2.k = true;
                    bxy2.bn();
                    object = (ForceEnableTntComponentsActivity)object;
                }
                return;
            }
            case 4: {
                mr mr7 = this.a;
                object = (bxu)mr7;
                if (!((bxu)object).k) {
                    ((bxu)object).k = true;
                    ((bxu)object).bn();
                    object = (AddLanguagesActivity)mr7;
                }
                return;
            }
            case 3: {
                ((ForceEnableTntComponentsActivity)this.a).t();
                ((bxy)this.a).bn().b().a();
                return;
            }
            case 2: {
                ((AddLanguagesActivity)this.a).t();
                ((bxu)this.a).bn().b().a();
                return;
            }
            case 1: {
                ((bh)this.a).e.aj();
                return;
            }
            case 0: {
                jse.e(object, "it");
                object = this.a;
                Object object2 = ((mr)object).getSavedStateRegistry().a("android:support:activity-result");
                if (object2 == null) break;
                nq nq2 = ((mr)object).h;
                ArrayList arrayList = object2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                object = object2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (object == null || arrayList == null) break;
                Serializable serializable = object2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (serializable != null) {
                    nq2.d.addAll(serializable);
                }
                if ((object2 = object2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT")) != null) {
                    nq2.g.putAll(object2);
                }
                int n2 = object.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    object2 = (String)((ArrayList)object).get(i2);
                    if (nq2.b.containsKey(object2)) {
                        serializable = (Integer)nq2.b.remove(object2);
                        if (!nq2.g.containsKey((String)object2)) {
                            nq2.a.remove(serializable);
                        }
                    }
                    object2 = arrayList.get(i2);
                    jse.d(object2, "rcs[i]");
                    int n3 = ((Number)object2).intValue();
                    object2 = ((ArrayList)object).get(i2);
                    jse.d(object2, "keys[i]");
                    nq2.b(n3, (String)object2);
                }
            }
        }
    }
}

