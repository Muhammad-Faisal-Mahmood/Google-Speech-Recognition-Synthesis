/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ApplicationErrorReport
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.apps.speech.tts.googletts.settings.AaeAnalyticsActivity;
import com.google.android.apps.speech.tts.googletts.settings.AnalyticsActivity;
import com.google.android.apps.speech.tts.googletts.settings.GeneralSettingsFragment;
import com.google.android.apps.speech.tts.googletts.settings.asr.AddLanguagesActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public final class bww
implements asp {
    public final Object a;
    private final int b;

    public /* synthetic */ bww(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(Preference object) {
        switch (this.b) {
            default: {
                ((hfk)((hfk)byl.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper", "onCreatePreferences", 239, "SettingsFragmentHelper.java")).r("'Add a language' preference clicked");
                object = (byl)this.a;
                Context context = ((byl)object).b.getContext();
                fxf.K(context);
                context = new Intent(context, AddLanguagesActivity.class);
                ((byl)object).b.startActivity((Intent)context);
                return;
            }
            case 6: {
                object = new Intent("android.speech.tts.engine.INSTALL_TTS_DATA");
                GeneralSettingsFragment generalSettingsFragment = (GeneralSettingsFragment)this.a;
                object.setPackage(generalSettingsFragment.d.getPackageName());
                gqk.m(generalSettingsFragment.d, (Intent)object);
                return;
            }
            case 5: {
                object = ((GeneralSettingsFragment)this.a).d;
                gqk.m((Context)object, new Intent((Context)object, LicenseMenuActivity.class));
                return;
            }
            case 4: {
                long l2;
                object = (GeneralSettingsFragment)this.a;
                Object object2 = new ccs(((GeneralSettingsFragment)object).d.getApplicationContext());
                cmj.b(((GeneralSettingsFragment)object).d.getApplicationContext());
                Object object3 = new Bundle();
                ArrayList arrayList = new ArrayList();
                new ApplicationErrorReport();
                try {
                    if (((Boolean)cie.a.a()).booleanValue()) {
                        long l3 = System.currentTimeMillis();
                        object = new SecureRandom();
                        l2 = Math.abs(((Random)object).nextLong());
                        object = new StringBuilder();
                        ((StringBuilder)object).append(l3);
                        ((StringBuilder)object).append("_");
                        ((StringBuilder)object).append(l2);
                        object = ((StringBuilder)object).toString();
                    } else {
                        object = cgw.f();
                    }
                }
                catch (SecurityException securityException) {
                    object = cgw.f();
                }
                cht cht2 = new cht(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null);
                cht2.m = null;
                cht2.f = null;
                cht2.a = null;
                cht2.c = null;
                cht2.b = object3;
                cht2.e = null;
                cht2.h = arrayList;
                cht2.i = false;
                cht2.j = null;
                cht2.k = null;
                cht2.l = false;
                cht2.n = object;
                cht2.o = false;
                cht2.p = 0L;
                cht2.q = false;
                cht2.r = null;
                cht2.s = null;
                object3 = ((ccs)object2).h;
                l2 = System.nanoTime();
                object = (cdu)object3;
                object2 = ((cdu)object).a;
                object2 = new chr((ccv)object3, cht2, l2);
                ((cdu)object).a.e(0, (cdl)object2);
                kl.au((ccx)object2);
                return;
            }
            case 3: {
                object = ((GeneralSettingsFragment)this.a).d;
                gqk.m((Context)object, new Intent((Context)object, AnalyticsActivity.class));
                return;
            }
            case 2: {
                object = new Intent("android.speech.tts.engine.INSTALL_TTS_DATA");
                bwy bwy2 = (bwy)this.a;
                object.setPackage(bwy2.ai.getPackageName());
                gqk.m(bwy2.ai, (Intent)object);
                return;
            }
            case 1: {
                object = ((bwy)this.a).ai;
                gqk.m((Context)object, new Intent((Context)object, AaeAnalyticsActivity.class));
                return;
            }
            case 0: 
        }
        object = ((bwy)this.a).ai;
        gqk.m((Context)object, new Intent((Context)object, LicenseMenuActivity.class));
    }
}

