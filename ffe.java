/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 */
import android.os.CancellationSignal;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import j$.util.Map$_EL;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class ffe
implements Runnable {
    public final Object a;
    public final Object b;
    private final int c;

    public ffe(gpc gpc2, Runnable runnable, int n2) {
        this.c = n2;
        this.b = gpc2;
        this.a = runnable;
    }

    public /* synthetic */ ffe(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ ffe(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public ffe(Object object, Object object2, int n2, char[] cArray) {
        this.c = n2;
        this.b = object2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        bzq bzq2;
        int n2 = this.c;
        int n3 = 0;
        switch (n2) {
            default: {
                bzq2 = new bzq(this.a, null);
                Object object = ((AmbientModeSupport$AmbientController)this.b).a;
                Object object2 = ((ivu)object).b;
                synchronized (object2) {
                    break;
                }
            }
            case 19: {
                Object object = this.b;
                ((het)this.a).a.remove(object);
                return;
            }
            case 18: {
                Object object = this.b;
                goz goz2 = gno.a();
                object = gno.g(goz2, (gpc)object);
                Object object3 = this.a;
                try {
                    object3.run();
                }
                catch (Throwable throwable) {
                    try {
                        gne.c(throwable);
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        gno.g(goz2, (gpc)object);
                        throw throwable2;
                    }
                }
                gno.g(goz2, (gpc)object);
                return;
            }
            case 17: {
                Object object = this.a;
                jse.e(object, "$runnable");
                object.run();
                gdj gdj2 = (gdj)this.b;
                object = (Throwable)gdj2.a.get();
                gdj2.a.remove();
                if (object != null) throw object;
                return;
            }
            case 16: {
                Object object = this.a;
                TikTokListenableWorker.c((hpn)this.b, (hue)object);
                return;
            }
            case 15: {
                if (!this.b.isCancelled()) return;
                this.a.cancel(true);
                return;
            }
            case 14: {
                this.a.cancel(true);
                Object object = this.b;
                if (object.isCancelled()) {
                    return;
                }
                try {
                    hhk.S((Future)object);
                    return;
                }
                catch (ExecutionException executionException) {
                    gqq.k(executionException.getCause());
                    return;
                }
            }
            case 13: {
                Object object = this.b;
                if (object.isDone()) return;
                Object object4 = this.a;
                ((heg)((heg)((heg)gax.a.g()).i(gqq.c())).j("com/google/apps/tiktok/concurrent/AndroidFutures", "crashApplicationOnFailure", 359, "AndroidFutures.java")).G("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", 30L, object4, object);
                return;
            }
            case 12: {
                Object object = this.b;
                this.a.execute((Runnable)object);
                return;
            }
            case 11: {
                if (!((hpo)this.a).isCancelled()) return;
                ((CancellationSignal)((hth)this.b).a).cancel();
                return;
            }
            case 10: {
                Object object = (flz)this.b;
                Object object5 = ((flz)object).b.k;
                if (!((flz)object).a.equals(object5)) return;
                object5 = this.a;
                ((flz)object).b.h((String)object5);
                object = ((flz)object).b;
                ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "commitText", 443, "VoiceInputMethodManager.java")).r("commitText");
                fma.d();
                if (((fma)object).h == null) {
                    return;
                }
                ((fma)object).f = ((fma)object).g = new fly(((fma)object).b().b, ((fma)object).b().b);
                ((fma)object).h.finishComposingText();
                ((fma)object).l = "";
                return;
            }
            case 9: {
                flz flz2 = (flz)this.a;
                Object object = flz2.b.k;
                if (!flz2.a.equals(object)) return;
                object = this.b;
                flz2.b.h(((fgd)object).c);
                return;
            }
            case 8: {
                Object object = this.a;
                ((fju)this.b).b((Runnable)object);
                return;
            }
            case 7: {
                Object object = this.a;
                ((fju)this.b).b((Runnable)object);
                return;
            }
            case 6: {
                Object object = cmy.a();
                ((cmx)object).i("");
                Object object6 = (fix)this.b;
                boolean bl2 = ((fix)object6).d > 1L;
                ((cmx)object).b(bl2);
                object = ((cmx)object).j(((fix)object6).f);
                ((heg)((heg)cmz.a.f()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "getSodaCount", 178, "SodaDetectionHandler.java")).u("#getSodaCount: enableConcurrency: %b", ((cmz)object).e);
                if (((cmz)object).e) {
                    n3 = ((cmz)object).g.a();
                } else if (((cmz)object).g()) {
                    n3 = 1;
                }
                long l2 = ((fix)object6).d;
                long l3 = n3;
                l2 = Math.max(0L, l2 - l3);
                ((heg)((heg)fix.a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "queryServiceStatus", 128, "GoogleAsrServiceImpl.java")).y("currentSodaCount: %d, availableSodaSlot: %d", l3, l2);
                object6 = fis.a.l();
                if (!((hwp)object6).b.B()) {
                    ((hwp)object6).u();
                }
                Object object7 = this.a;
                object = (fis)((hwp)object6).b;
                ((fis)object).b = 1 | ((fis)object).b;
                ((fis)object).c = l2;
                object7.c((fis)((hwp)object6).o());
                object7.a();
                ((heg)((heg)fix.a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "queryServiceStatus", 136, "GoogleAsrServiceImpl.java")).r("query service status returned");
                return;
            }
            case 5: {
                ((heg)((heg)fix.a.h().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "recognitionSession", 278, "GoogleAsrServiceImpl.java")).u("[%s] RecognitionSession cancelled from client.", this.a);
                Object object = this.b;
                Optional optional = Optional.empty();
                ((fjj)object).r(optional);
                return;
            }
            case 4: {
                Object object = this.a;
                ffy ffy2 = (ffy)this.b;
                String string = (String)object;
                Object object8 = ffy2.m(string) ? dxv.aR : dxv.i;
                dyp dyp2 = ((dyn)object8).b("recognition_session", string);
                object8 = hkx.k;
                hwp hwp2 = hkx.a.l();
                Object object9 = ffy2.a;
                Long l4 = 0L;
                long l5 = (Long)Map$_EL.getOrDefault((Map)object9, object, l4);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object9 = (hkx)hwp2.b;
                ((hkx)object9).b |= 0x40;
                ((hkx)object9).i = l5;
                l5 = (Long)Map$_EL.getOrDefault(ffy2.b, object, l4);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (hkx)hwp2.b;
                ((hkx)object).b = 0x80 | ((hkx)object).b;
                ((hkx)object).j = l5;
                dyp2.n((gpm)object8, (hkx)hwp2.o());
                ffy2.a(string, dyp2.j());
                return;
            }
            case 3: {
                Object object = (idb)this.a;
                n2 = ((idb)object).c;
                n3 = a.v(n2);
                if (n3 != 0 && n3 == 2) {
                    return;
                }
                Object object10 = this.b;
                n3 = a.v(n2);
                if (n3 != 0 && n3 == 3) {
                    object = new feb(((idb)object).d, ((idb)object).e);
                    ((ffn)object10).b((Throwable)object);
                    return;
                }
                ffn ffn2 = (ffn)object10;
                object10 = ((gzx)ffn2.a).v();
                while (object10.hasNext()) {
                    ((fjt)object10.next()).a((idb)object, ffn2.b.d);
                }
                return;
            }
            case 2: {
                Object object = this.a;
                Throwable throwable = (Throwable)object;
                Object object11 = ffo.b(throwable, fef.class);
                Object object12 = this.b;
                if (object11 != null) {
                    a.as(ffo.a.h(), "Transcription error", "com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$2", "onError", '\u0101', "NetworkSpeechRecognizer.java", (Throwable)object11);
                    object = ((ffn)object12).b;
                    object11 = (fef)object11;
                    ((ffo)object).d.c((fef)object11);
                    return;
                }
                if (object instanceof iyj) {
                    a.as(ffo.a.h(), "Recognizer network error", "com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$2", "onError", '\u0104', "NetworkSpeechRecognizer.java", throwable);
                    object11 = ((ffn)object12).b;
                    object = new fdv(((iyj)object).a.n);
                    ((ffo)object11).d.c((fef)object);
                    return;
                }
                if (object instanceof iyi) {
                    a.as(ffo.a.h(), "Recognizer network error", "com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$2", "onError", '\u0108', "NetworkSpeechRecognizer.java", throwable);
                    object11 = ((ffn)object12).b;
                    object = new fdv(((iyi)object).a.n);
                    ((ffo)object11).d.c((fef)object);
                    return;
                }
                a.as(ffo.a.h(), "Recognizer generic error", "com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$2", "onError", '\u010c', "NetworkSpeechRecognizer.java", throwable);
                object11 = ((ffn)object12).b;
                object = new fdu();
                ((ffo)object11).d.c((fef)object);
                return;
            }
            case 1: {
                Object object = (heg)((heg)ffg.a.c()).j("com/google/android/libraries/speech/transcription/recognition/HybridSpeechRecognizer", "processCallback", 103, "HybridSpeechRecognizer.java");
                Object object13 = this.a;
                ffg ffg2 = ((fff)object13).a;
                boolean bl3 = object13 == ffg2.f;
                Object object14 = this.b;
                object13 = (bmu)object14;
                object.E("#onCallback(isFromNetwork=%s, type=%s)", bl3, ((bmu)object13).a);
                if (bl3) {
                    object = ffg2.k;
                    if (object != null) {
                        object.cancel(false);
                    }
                    if (((bmu)object13).a == ffc.e) {
                        ffg2.d((fef)((bmu)object13).b);
                    }
                    if (ffg2.i) {
                        return;
                    }
                    ffg2.g.add(((bmu)object13).a);
                    ((bmu)object13).c.run();
                    object13 = ((bmu)object13).a;
                    if (object13 == ffc.g) {
                        if (ffg2.j) return;
                        ffg2.d.a();
                        return;
                    }
                    if (object13 == ffc.e) return;
                    ffg2.b();
                    return;
                }
                if (!ffg2.i) {
                    ffg2.h.add(object14);
                    if (((bmu)object13).a != ffc.e) return;
                    ffg2.j = true;
                    return;
                }
                if (ffg2.g.contains(((bmu)object13).a)) {
                    if (((bmu)object13).a != ffc.c) return;
                }
                ((bmu)object13).c.run();
                return;
            }
            case 0: {
                ffg ffg3 = ((fff)this.a).a;
                Object object = this.b;
                ffg3.c.c((fef)object);
                return;
            }
        }
        {
            ((ivu)object).c = bzq2;
            return;
        }
    }
}

