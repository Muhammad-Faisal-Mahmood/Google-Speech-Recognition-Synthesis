/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;

public final class fgl
implements hpb {
    final Object a;
    private final int b;

    public fgl(int n2) {
        this.b = n2;
        this.a = "Event logging failed.";
    }

    public fgl(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(Throwable throwable) {
        Throwable throwable2;
        block8: {
            int n2 = this.b;
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            jse.e(throwable, "e");
                            Log.e((String)"MendelPackageState", (String)((String)this.a), (Throwable)throwable);
                            return;
                        }
                        if (throwable instanceof TimeoutException) {
                            ((heg)((heg)((heg)gax.a.h()).i(throwable)).j("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 190, "AndroidFutures.java")).u("exceeded timeout: %s", this.a);
                        }
                    }
                    return;
                }
                ((heg)((heg)((heg)dxm.a.g()).i(throwable)).j("com/google/android/libraries/search/appflows/GenericAppFlowLogger$1", "onFailure", 386, "GenericAppFlowLogger.java")).r((String)this.a);
                return;
            }
            a.as(fgo.a.h(), "startDetection failed", "com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleDetectionError", '\u019d', "SodaSpeechRecognizer.java", throwable);
            for (throwable2 = throwable; throwable2 != null; throwable2 = throwable2.getCause()) {
                if (!fef.class.isInstance(throwable2)) {
                    continue;
                }
                break block8;
            }
            throwable2 = null;
        }
        Object object = this.a;
        if (throwable2 instanceof fef) {
            a.as(fgo.a.h(), "Transcription error", "com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleDetectionError", '\u01a1', "SodaSpeechRecognizer.java", throwable);
            ((fgo)object).l.c((fef)throwable2);
            return;
        }
        a.as(fgo.a.h(), "Recognizer generic error", "com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleDetectionError", '\u01a4', "SodaSpeechRecognizer.java", throwable);
        ((fgo)object).l.c(new fed(1));
    }

    @Override
    public final void b(Object object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 2) {
                return;
            }
            Iterator iterator = ((imj)((fzp)this.a).a).a().iterator();
            while (iterator.hasNext()) {
                object = ((AmbientModeSupport$AmbientController)iterator.next()).a;
                hpn hpn2 = hhk.K(null);
                ((bmu)object).P(hpn2, "com.google.apps.tiktok.account.data.AllAccounts");
                gax.c(hpn2, "AvailableAccountsInvalidatedObserver failed", new Object[0]);
            }
            return;
        }
        ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$1", "onSuccess", 379, "SodaSpeechRecognizer.java")).r("Audio process finished, transcription completed.");
    }
}

