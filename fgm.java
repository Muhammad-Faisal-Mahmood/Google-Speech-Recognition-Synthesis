/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences$Editor
 */
import android.content.SharedPreferences;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class fgm
implements Callable {
    public final Object a;
    private final int b;

    public /* synthetic */ fgm(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object = this.b;
        int n2 = 0;
        switch (object) {
            default: {
                return hhk.S((Future)this.a);
            }
            case 19: {
                Object object2 = this.a;
                File file = (File)object2;
                if (!file.exists()) {
                    return null;
                }
                Object object3 = new AmbientModeSupport$AmbientController(hjl.a);
                Serializable serializable = hav.n(new hdq(object2));
                hdx hdx2 = ((hav)serializable).k();
                while (hdx2.hasNext()) {
                    hhk.j(hdx2.next());
                }
                object3 = new hih((AmbientModeSupport$AmbientController)object3, (hav)serializable).iterator();
                n2 = 1;
                while (object3.hasNext()) {
                    serializable = (File)object3.next();
                    if (file.equals(serializable) || !((File)serializable).exists()) continue;
                    ((File)serializable).setWritable(true, true);
                    n2 &= ((File)serializable).delete();
                }
                if (n2 != 0 && file.setWritable(false, false) && file.list().length == 0) {
                    return null;
                }
                file.setWritable(true, true);
                throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(object2))));
            }
            case 18: {
                Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    hhk.S((hpn)iterator.next());
                }
                return null;
            }
            case 17: {
                hth hth2 = ((gae)this.a).b;
                SharedPreferences.Editor editor = hth2.b.edit();
                Object object4 = hth2.a;
                object = object4.size();
                while (true) {
                    if (n2 >= object) {
                        ((ArrayList)hth2.a).clear();
                        return editor.commit();
                    }
                    editor.remove((String)object4.get(n2));
                    ++n2;
                }
            }
            case 16: {
                gzs gzs2 = new gzs();
                Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    gzs2.j((Iterable)hhk.S((hpn)iterator.next()));
                }
                return gzs2.g();
            }
            case 15: {
                Object object5 = this.a;
                Object object6 = ((frq)object5).b.c;
                synchronized (object6) {
                    ((frq)object5).a = null;
                    return null;
                }
            }
            case 14: {
                frk frk2 = (frk)this.a;
                String string = frk2.b;
                frk2.c = frk2.a.getSharedPreferences(string, 0);
                return frk2.c.getAll().isEmpty() ^ true;
            }
            case 13: {
                frk frk3 = (frk)this.a;
                Object object7 = frk3.c.getAll().keySet();
                SharedPreferences.Editor editor = frk3.c.edit();
                object7 = object7.iterator();
                while (true) {
                    if (!object7.hasNext()) {
                        if (!editor.commit()) throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(frk3.b)));
                        return null;
                    }
                    editor.remove((String)object7.next());
                }
            }
            case 12: {
                Object object8 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onMicrophoneDeactivated", 502, "RecognitionSession.java");
                fjj fjj2 = (fjj)this.a;
                object8.u("[%s] onMicrophoneDeactivated", fjj2.g);
                object8 = fjj2.g;
                fjj2.f.h((String)object8);
                return null;
            }
            case 11: {
                Object object9 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onEndOfSpeech", 280, "RecognitionSession.java");
                Object object10 = (fjj)this.a;
                object9.u("[%s] onEndOfSpeech", ((fjj)object10).g);
                object9 = (hwr)fiq.a.l();
                hyg hyg2 = fip.a.l();
                if (!hyg2.b.B()) {
                    hyg2.u();
                }
                fip fip2 = (fip)hyg2.b;
                fip2.c = 3;
                fip2.b |= 1;
                fip2 = (fip)hyg2.o();
                if (!((hwp)object9).b.B()) {
                    ((hwp)object9).u();
                }
                object10 = ((fjj)object10).l;
                hyg2 = (fiq)((hwr)object9).b;
                fip2.getClass();
                ((fiq)hyg2).c = fip2;
                ((fiq)hyg2).b = 1;
                ((AmbientModeSupport$AmbientController)object10).f((fiq)((hwp)object9).o());
                return null;
            }
            case 10: {
                Object object11 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onRecognitionFinished", 423, "RecognitionSession.java");
                fjj fjj3 = (fjj)this.a;
                object11.u("[%s] #onRecognitionFinished", fjj3.g);
                object11 = (hwr)fiq.a.l();
                hyg hyg3 = fip.a.l();
                if (!((hwp)hyg3).b.B()) {
                    ((hwp)hyg3).u();
                }
                hwv hwv2 = (fip)((hwp)hyg3).b;
                hwv2.c = 4;
                hwv2.b |= 1;
                hyg3 = (fip)((hwp)hyg3).o();
                if (!((hwp)object11).b.B()) {
                    ((hwp)object11).u();
                }
                AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = fjj3.l;
                hwv2 = (fiq)((hwr)object11).b;
                hyg3.getClass();
                ((fiq)hwv2).c = hyg3;
                ((fiq)hwv2).b = 1;
                ambientModeSupport$AmbientController.f((fiq)((hwp)object11).o());
                fjj3.l.e();
                fjj3.h = false;
                fjj3.f.c(fjj3.g);
                return null;
            }
            case 9: {
                heg heg2 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "stopRecognition", 212, "RecognitionSession.java");
                fjj fjj4 = (fjj)this.a;
                heg2.u("[%s] #stopRecognition for client request.", fjj4.g);
                if (fjj4.j.isEmpty()) {
                    ((heg)((heg)fjj.a.g()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "stopRecognition", 214, "RecognitionSession.java")).u("[%s] RecognitionClient is null, ignore #stopRecognition", fjj4.g);
                    return null;
                }
                ((ffv)fjj4.j.get()).c();
                return null;
            }
            case 8: {
                Object object12 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onMicrophoneCloseRequested", 513, "RecognitionSession.java");
                fjj fjj5 = (fjj)this.a;
                object12.u("[%s] onMicrophoneCloseRequested", fjj5.g);
                object12 = fjj5.g;
                fjj5.f.g((String)object12);
                return null;
            }
            case 7: {
                Object object13 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onMicrophoneOpened", 486, "RecognitionSession.java");
                fjj fjj6 = (fjj)this.a;
                object13.u("[%s] onMicrophoneOpened", fjj6.g);
                object13 = (hwr)fiq.a.l();
                Object object14 = fip.a.l();
                if (!((hwp)object14).b.B()) {
                    ((hwp)object14).u();
                }
                fip fip3 = (fip)((hwp)object14).b;
                fip3.c = 1;
                fip3.b |= 1;
                fip3 = (fip)((hwp)object14).o();
                if (!((hwp)object13).b.B()) {
                    ((hwp)object13).u();
                }
                object14 = fjj6.l;
                fiq fiq2 = (fiq)((hwr)object13).b;
                fip3.getClass();
                fiq2.c = fip3;
                fiq2.b = 1;
                ((AmbientModeSupport$AmbientController)object14).f((fiq)((hwp)object13).o());
                fjj6.f.i(fjj6.g);
                return null;
            }
            case 6: {
                Object object15 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onStartOfSpeech", 262, "RecognitionSession.java");
                fjj fjj7 = (fjj)this.a;
                object15.u("[%s] onStartOfSpeech", fjj7.g);
                object15 = (hwr)fiq.a.l();
                hyg hyg4 = fip.a.l();
                if (!((hwp)hyg4).b.B()) {
                    ((hwp)hyg4).u();
                }
                Object object16 = (fip)((hwp)hyg4).b;
                ((fip)object16).c = 2;
                ((fip)object16).b |= 1;
                hyg4 = (fip)((hwp)hyg4).o();
                if (!((hwp)object15).b.B()) {
                    ((hwp)object15).u();
                }
                object16 = fjj7.l;
                fiq fiq3 = (fiq)((hwr)object15).b;
                hyg4.getClass();
                fiq3.c = hyg4;
                fiq3.b = 1;
                ((AmbientModeSupport$AmbientController)object16).f((fiq)((hwp)object15).o());
                fjj7.e.l(fjj7.g);
                return null;
            }
            case 5: {
                ((fha)this.a).h.c();
                return null;
            }
            case 4: {
                ((fha)this.a).h.a();
                return null;
            }
            case 3: {
                ((fha)this.a).h.b();
                return null;
            }
            case 2: {
                Object object17 = (fgw)this.a;
                ffk ffk2 = ((fgw)object17).c;
                InputStream inputStream = ((fgw)object17).d();
                object17 = ((fgw)object17).c();
                Objects.requireNonNull(ffk2);
                n2 = ((eae)object17).d;
                object = Integer.bitCount(((eae)object17).e);
                object17 = new byte[(n2 + n2) / 1000 * 20 * object];
                float f2 = 75.0f;
                while (true) {
                    float f3;
                    float f4;
                    double d2;
                    float f5;
                    if ((n2 = inputStream.read((byte[])object17)) == -1) {
                        fhq.h(0, ffk2);
                        return null;
                    }
                    if (n2 == 0) continue;
                    if (n2 <= 0) {
                        f5 = 0.0f;
                    } else {
                        d2 = n2;
                        long l2 = 0L;
                        long l3 = 0L;
                        while (n2 >= 2) {
                            object = object17[n2 - 1];
                            object = (object << 8) + (object17[n2 -= 2] & 0xFF);
                            l3 += (long)object;
                            l2 += (long)(object * object);
                        }
                        f5 = (float)Math.sqrt(((double)l2 * (d2 /= 2.0) - (double)(l3 * l3)) / (d2 * d2));
                    }
                    if (f2 < f5) {
                        f2 *= 0.999f;
                        f4 = 0.001f;
                    } else {
                        f2 *= 0.95f;
                        f4 = 0.05f;
                    }
                    f4 = f2 + f4 * f5;
                    d2 = f4;
                    f2 = f3 = -120.0f;
                    if (d2 > 0.0) {
                        d2 = f5 / f4;
                        f2 = f3;
                        if (d2 > 1.0E-6) {
                            f2 = (float)Math.log10(d2) * 10.0f;
                        }
                    }
                    n2 = (int)((Math.min(Math.max(f2, -2.0f), 10.0f) + 2.0f) * 100.0f / 12.0f);
                    fhq.h(n2, ffk2);
                    f2 = f4;
                }
            }
            case 1: {
                ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "cancel", 270, "SodaSpeechRecognizer.java")).r("Offline recognizer - stop detection");
                Object object18 = (fgo)this.a;
                if (!((fgo)object18).v.compareAndSet(false, true)) return null;
                ((fgo)object18).l.c(new fds());
                object18 = ((fgo)object18).w;
                if (object18 == null) return null;
                ((cmz)object18).f();
                return null;
            }
            case 0: 
        }
        ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleStart", 839, "SodaSpeechRecognizer.java")).r("#handleStart");
        Object object19 = (fgn)this.a;
        Object object20 = ((fgn)object19).b.w;
        if (object20 != null) {
            ((cmz)object20).d();
        }
        if (((gto)(object20 = ((fgn)object19).b.e)).g()) {
            ((feg)((gto)object20).c()).a();
        }
        if (!((gto)(object19 = ((fgn)object19).a)).g()) return null;
        ((fgf)((gto)object19).c()).c();
        return null;
    }
}

