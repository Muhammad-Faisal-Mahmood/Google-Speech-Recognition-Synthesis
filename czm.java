/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.io.IOException;
import java.util.Collection;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

public final class czm
implements Callable {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ czm(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ czm(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object;
        gky gky2;
        Object object2;
        int n2 = this.c;
        int n3 = 6;
        switch (n2) {
            default: {
                object2 = this.a;
                gky2 = (gky)object2;
                gky2.b.writeLock().lock();
                object = this.b;
                break;
            }
            case 19: {
                Object object3 = this.a;
                Object object4 = this.b;
                try {
                    object4 = (geq)hhk.S((Future)object4);
                }
                catch (ExecutionException executionException) {
                    if (!(executionException.getCause() instanceof IOException)) throw executionException;
                    if (((gfv)object3).m) {
                        if (executionException.getCause() instanceof fpx) throw executionException;
                    }
                    object4 = fvc.O(geq.a.l()).v();
                }
                hyg hyg2 = duo.a.l();
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                Object object5 = ((hwp)hyg2).b;
                hyg hyg3 = (duo)object5;
                ((duo)hyg3).c = a.A(4);
                ((duo)hyg3).b |= 1;
                if (!((hwv)object5).B()) {
                    ((hwp)hyg2).u();
                }
                object5 = (duo)((hwp)hyg2).b;
                ((duo)object5).d = dpg.a(15);
                ((duo)object5).b |= 2;
                try {
                    object5 = ((gfv)object3).a((geq)object4);
                }
                catch (RuntimeException runtimeException) {
                    Log.e((String)"MendelPackageState", (String)"Failed to parse flag", (Throwable)runtimeException);
                    object4 = fvc.O(geq.a.l()).v();
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    object5 = ((hwp)hyg2).b;
                    hyg3 = (duo)object5;
                    ((duo)hyg3).c = a.A(3);
                    ((duo)hyg3).b |= 1;
                    if (!((hwv)object5).B()) {
                        ((hwp)hyg2).u();
                    }
                    object5 = (duo)((hwp)hyg2).b;
                    ((duo)object5).d = dpg.a(11);
                    ((duo)object5).b |= 2;
                    object5 = ((gfv)object3).a((geq)object4);
                }
                catch (hxn hxn2) {
                    Log.e((String)"MendelPackageState", (String)"Failed to parse flag", (Throwable)hxn2);
                    object4 = fvc.O(geq.a.l()).v();
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    object5 = ((hwp)hyg2).b;
                    hyg3 = (duo)object5;
                    ((duo)hyg3).c = a.A(3);
                    ((duo)hyg3).b |= 1;
                    if (!((hwv)object5).B()) {
                        ((hwp)hyg2).u();
                    }
                    object5 = (duo)((hwp)hyg2).b;
                    ((duo)object5).d = dpg.a(13);
                    ((duo)object5).b |= 2;
                    object5 = ((gfv)object3).a((geq)object4);
                }
                object3 = ((gfv)object3).f;
                hyg3 = dup.a.l();
                String string = ((geq)object4).d;
                if (!((hwp)hyg3).b.B()) {
                    ((hwp)hyg3).u();
                }
                hwv hwv2 = ((hwp)hyg3).b;
                dup dup2 = (dup)hwv2;
                string.getClass();
                dup2.b = 1 | dup2.b;
                dup2.c = string;
                if (!hwv2.B()) {
                    ((hwp)hyg3).u();
                }
                dup dup3 = (dup)((hwp)hyg3).b;
                hyg2 = (duo)((hwp)hyg2).o();
                hyg2.getClass();
                dup3.d = hyg2;
                dup3.b = 2 | dup3.b;
                hyg2 = ((hwp)hyg3).o();
                jse.d(hyg2, "build(...)");
                return (gfo)object3.b(object5, fvc.u((geq)object4, (dup)hyg2));
            }
            case 18: {
                Object object6 = this.b;
                jse.e(object6, "$callable");
                Object object7 = this.a;
                object6 = object6.call();
                gdj gdj2 = (gdj)object7;
                object7 = (Throwable)gdj2.a.get();
                gdj2.a.remove();
                if (object7 != null) throw object7;
                return object6;
            }
            case 17: {
                this.b.run();
                return this.a;
            }
            case 16: {
                fsc fsc2 = (fsc)this.a;
                fsc2.e.d();
                Object object8 = this.b;
                try {
                    object8 = object8.call();
                    return object8;
                }
                finally {
                    fsc2.e.c();
                }
            }
            case 15: {
                hwp hwp2 = fml.a.l();
                Object object9 = (fmg)hhk.S((Future)this.a);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                Object object10 = this.b;
                Object object11 = (fml)hwp2.b;
                object9.getClass();
                ((fml)object11).c = object9;
                ((fml)object11).b |= 1;
                object9 = ((feo)hhk.S((Future)object10)).b;
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object10 = (fml)hwp2.b;
                object11 = ((fml)object10).d;
                if (!object11.c()) {
                    ((fml)object10).d = hwv.s((hxk)object11);
                }
                hvc.g((Iterable)object9, ((fml)object10).d);
                return (fml)hwp2.o();
            }
            case 14: {
                Object object15;
                Object object12 = (heg)((heg)fjj.a.c()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "startRecognition", 146, "RecognitionSession.java");
                Object object13 = this.b;
                Object object14 = (fjj)object13;
                object12.u("[%s] #startRecognition", ((fjj)object14).g);
                if (((fjj)object14).h) {
                    ((heg)((heg)fjj.a.h()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "startRecognition", 148, "RecognitionSession.java")).u("[%s] Recognition already started, ignore start request.", ((fjj)object14).g);
                    return null;
                }
                Object object16 = (fji)this.a;
                fig fig2 = ((fji)object16).a;
                object12 = object15 = idq.b(fig2.c);
                if (object15 == null) {
                    object12 = idq.a;
                }
                if (object12 == idq.a) {
                    ((heg)((heg)fjj.a.h()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "startRecognition", 155, "RecognitionSession.java")).r("Can't start recognition without application domain.");
                    object12 = ((fjj)object14).l;
                    object15 = (hwr)fiq.a.l();
                    object14 = fip.a.l();
                    if (!((hwp)object14).b.B()) {
                        ((hwp)object14).u();
                    }
                    object13 = ((hwp)object14).b;
                    object16 = (fip)object13;
                    ((fip)object16).c = 5;
                    ((fip)object16).b |= 1;
                    if (!((hwv)object13).B()) {
                        ((hwp)object14).u();
                    }
                    object13 = (fip)((hwp)object14).b;
                    ((fip)object13).d = 1;
                    ((fip)object13).b = 2 | ((fip)object13).b;
                    object13 = (fip)((hwp)object14).o();
                    if (!((hwp)object15).b.B()) {
                        ((hwp)object15).u();
                    }
                    object14 = (fiq)((hwr)object15).b;
                    object13.getClass();
                    ((fiq)object14).c = object13;
                    ((fiq)object14).b = 1;
                    ((AmbientModeSupport$AmbientController)object12).f((fiq)((hwp)object15).o());
                    return null;
                }
                Optional optional = ((fji)object16).b;
                ((heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "startRecognition", 171, "RecognitionSession.java")).G("[%s] Start recognition with external audio source: %b, attr: %s", ((fjj)object14).g, ((fji)object16).b.isPresent(), ((fji)object16).c);
                fga fga2 = ((fjj)object14).f;
                String string = ((fjj)object14).g;
                fgb fgb2 = fgc.a();
                fgb2.d(fgs.e);
                object12 = object15 = fig2.b;
                if (object15 == null) {
                    object12 = fhi.a;
                }
                fgb2.b(((fhi)object12).b);
                fgb2.h(fig2.d);
                n2 = n3 = a.v(fig2.f);
                if (n3 == 0) {
                    n2 = 1;
                }
                fgb2.j(n2);
                fgb2.f(optional.isPresent());
                fgb2.e(fig2.h);
                fga2.k(string, fgb2.a());
                object12 = object15 = ((fjj)object14).b.a(fig2, optional);
                if (Build.VERSION.SDK_INT >= 35) {
                    object12 = new fgt((fgu)object15);
                    ((fgt)object12).e(((fji)object16).c);
                    object12 = ((fgt)object12).a();
                }
                object12 = ((fjj)object14).k.k((fgu)object12, (ffk)object13, (fgr)object13);
                ((ffv)object12).b();
                ((fjj)object14).j = Optional.of(object12);
                ((fjj)object14).h = true;
                ((fjj)object14).i = -1;
                return null;
            }
            case 13: {
                Object object17 = (heg)fjj.a.h();
                Object object18 = this.a;
                Object object19 = (heg)((heg)object17.i((Throwable)object18)).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onFallback", 455, "RecognitionSession.java");
                object17 = (fjj)this.b;
                object19.u("[%s] onFallback", ((fjj)object17).g);
                object19 = ((fjj)object17).g;
                ((fjj)object17).f.e((String)object19, (fef)object18);
                return null;
            }
            case 12: {
                Object object20 = (Optional)this.b;
                boolean bl2 = ((Optional)object20).isPresent();
                Object object21 = this.a;
                if (bl2) {
                    ((heg)((heg)((heg)fjj.a.h()).i((Throwable)((Optional)object20).get())).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "cancelRecognition", 229, "RecognitionSession.java")).u("[%s] #cancelRecognition due to error.", ((fjj)object21).g);
                } else {
                    ((heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "cancelRecognition", 232, "RecognitionSession.java")).u("[%s] #cancelRecognition for client request.", ((fjj)object21).g);
                }
                object20 = (fjj)object21;
                if (((fjj)object20).j.isEmpty()) {
                    ((heg)((heg)fjj.a.g()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "cancelRecognition", 236, "RecognitionSession.java")).u("[%s] RecognitionClient is null, ignore #cancelRecognition", ((fjj)object20).g);
                } else {
                    ((ffv)((fjj)object20).j.get()).a();
                    ((fjj)object20).j = Optional.empty();
                }
                ((fjj)object20).l.e();
                ((fjj)object20).h = false;
                ((fjj)object20).i = -1;
                ((fjj)object20).f.n(((fjj)object20).g, new fds());
                return null;
            }
            case 11: {
                Object object22 = (heg)((heg)fjj.a.b()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onSodaEvent", 443, "RecognitionSession.java");
                Object object23 = (fjj)this.a;
                object22.u("[%s] onSodaEvent", ((fjj)object23).g);
                object22 = (hwr)fiq.a.l();
                if (!((hwp)object22).b.B()) {
                    ((hwp)object22).u();
                }
                object23 = ((fjj)object23).l;
                Object object24 = this.b;
                fiq fiq2 = (fiq)((hwr)object22).b;
                object24.getClass();
                fiq2.c = object24;
                fiq2.b = 6;
                ((AmbientModeSupport$AmbientController)object23).f((fiq)((hwp)object22).o());
                return null;
            }
            case 10: {
                Object object25 = (heg)((heg)fjj.a.h()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onError", 295, "RecognitionSession.java");
                Object object26 = this.b;
                fjj fjj2 = (fjj)object26;
                object25.u("[%s] onError", fjj2.g);
                Object object27 = this.a;
                object25 = (fef)object27;
                Object object28 = ((fef)object25).a;
                int n4 = ((fdr)object28).b;
                if (n4 == 0) throw null;
                n2 = n3;
                switch (n4 - 1) {
                    default: {
                        n2 = 1;
                        break;
                    }
                    case 11: {
                        if (((fdr)object28).a == 2) {
                            n2 = 9;
                            break;
                        }
                        n2 = 8;
                        break;
                    }
                    case 7: {
                        n2 = 3;
                        break;
                    }
                    case 5: 
                    case 12: {
                        n2 = 4;
                        break;
                    }
                    case 3: {
                        n2 = 7;
                        break;
                    }
                    case 2: {
                        n2 = n3;
                        if (((fdr)object28).a != 102) break;
                        n2 = 5;
                        break;
                    }
                    case 1: {
                        n2 = 10;
                        break;
                    }
                    case 0: 
                    case 4: 
                    case 6: 
                    case 9: 
                    case 10: 
                    case 13: 
                    case 14: {
                        n2 = 2;
                        break;
                    }
                    case 8: 
                }
                fjj2.h = false;
                object28 = (hwr)fiq.a.l();
                hwp hwp3 = fip.a.l();
                if (!hwp3.b.B()) {
                    hwp3.u();
                }
                hwv hwv3 = hwp3.b;
                fip fip2 = (fip)hwv3;
                fip2.c = 5;
                fip2.b |= 1;
                if (!hwv3.B()) {
                    hwp3.u();
                }
                fip2 = (fip)hwp3.b;
                fip2.d = n2 - 1;
                fip2.b |= 2;
                fip2 = (fip)hwp3.o();
                if (!((hwp)object28).b.B()) {
                    ((hwp)object28).u();
                }
                fiq fiq3 = (fiq)((hwr)object28).b;
                fip2.getClass();
                fiq3.c = fip2;
                fiq3.b = 1;
                object28 = (fiq)((hwp)object28).o();
                if (n4 == 2) {
                    fjj2.l.f((fiq)object28);
                    fjj2.l.e();
                    fjj2.f.n(fjj2.g, (fef)object25);
                    fjj2.h = false;
                    return null;
                }
                fjj2.d.a(new fbx(object26, object28, object27, 4));
                return null;
            }
            case 9: {
                Object object29;
                Object object30;
                Object object31 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onResults", 383, "RecognitionSession.java");
                fex fex2 = (fex)this.a;
                n2 = fex2.c.size();
                fjj fjj3 = (fjj)this.b;
                object31.A("[%s] #onFinalRecognitionResults: %d hypothesis", fjj3.g, n2);
                n2 = fje.a;
                object31 = fil.a.l();
                if ((fex2.b & 1) != 0) {
                    object30 = fex2.f;
                    if (!((hwp)object31).b.B()) {
                        ((hwp)object31).u();
                    }
                    object29 = (fil)((hwp)object31).b;
                    object30.getClass();
                    ((fil)object29).b = 1 | ((fil)object29).b;
                    ((fil)object29).c = object30;
                }
                if (fex2.c.size() > 0) {
                    object30 = fex2.c;
                    if (!((hwp)object31).b.B()) {
                        ((hwp)object31).u();
                    }
                    object29 = (fil)((hwp)object31).b;
                    hxk hxk2 = ((fil)object29).d;
                    if (!hxk2.c()) {
                        ((fil)object29).d = hwv.s(hxk2);
                    }
                    hvc.g((Iterable)object30, ((fil)object29).d);
                }
                if (fex2.d.size() > 0) {
                    object29 = fex2.d;
                    if (!((hwp)object31).b.B()) {
                        ((hwp)object31).u();
                    }
                    object30 = (fil)((hwp)object31).b;
                    hxa hxa2 = ((fil)object30).e;
                    if (!hxa2.c()) {
                        ((fil)object30).e = hwv.p(hxa2);
                    }
                    hvc.g(object29, ((fil)object30).e);
                }
                if (fex2.g.size() > 0) {
                    object29 = Collection$_EL.stream(fex2.g).filter(new fay(11)).map(new fcx(8));
                    n2 = gzx.d;
                    gzx gzx2 = (gzx)object29.collect(gye.a);
                    if (!((hwp)object31).b.B()) {
                        ((hwp)object31).u();
                    }
                    object30 = (fil)((hwp)object31).b;
                    object29 = ((fil)object30).f;
                    if (!object29.c()) {
                        ((fil)object30).f = hwv.s((hxk)object29);
                    }
                    hvc.g(gzx2, ((fil)object30).f);
                }
                object29 = (hwr)fiq.a.l();
                object31 = (fil)((hwp)object31).o();
                if (!((hwp)object29).b.B()) {
                    ((hwp)object29).u();
                }
                object30 = fjj3.l;
                fiq fiq4 = (fiq)((hwr)object29).b;
                object31.getClass();
                fiq4.c = object31;
                fiq4.b = 3;
                ((AmbientModeSupport$AmbientController)object30).f((fiq)((hwp)object29).o());
                fjj3.e.f(fjj3.g, fex2);
                return null;
            }
            case 8: {
                fin fin2;
                Object object32;
                Object object33 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onPartialResults", 398, "RecognitionSession.java");
                fjj fjj4 = (fjj)this.b;
                object33.u("[%s] #onPartialResults", fjj4.g);
                n2 = fje.a;
                Object object34 = fin.a.l();
                object33 = (fgd)this.a;
                if ((((fgd)object33).b & 4) != 0) {
                    object32 = ((fgd)object33).e;
                    if (!((hwp)object34).b.B()) {
                        ((hwp)object34).u();
                    }
                    fin2 = (fin)((hwp)object34).b;
                    object32.getClass();
                    fin2.b |= 1;
                    fin2.c = object32;
                }
                if ((((fgd)object33).b & 1) != 0) {
                    object32 = ((fgd)object33).c;
                    if (!((hwp)object34).b.B()) {
                        ((hwp)object34).u();
                    }
                    fin2 = (fin)((hwp)object34).b;
                    object32.getClass();
                    fin2.b |= 2;
                    fin2.d = object32;
                }
                if ((((fgd)object33).b & 2) != 0) {
                    object32 = ((fgd)object33).d;
                    if (!((hwp)object34).b.B()) {
                        ((hwp)object34).u();
                    }
                    fin2 = (fin)((hwp)object34).b;
                    object32.getClass();
                    fin2.b |= 4;
                    fin2.e = object32;
                }
                object32 = (hwr)fiq.a.l();
                fin2 = (fin)((hwp)object34).o();
                if (!((hwp)object32).b.B()) {
                    ((hwp)object32).u();
                }
                object34 = fjj4.l;
                fiq fiq5 = (fiq)((hwr)object32).b;
                fin2.getClass();
                fiq5.c = fin2;
                fiq5.b = 2;
                ((AmbientModeSupport$AmbientController)object34).f((fiq)((hwp)object32).o());
                fjj4.e.j(fjj4.g, (fgd)object33);
                return null;
            }
            case 7: {
                Object object35 = (heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleStop", 863, "SodaSpeechRecognizer.java");
                Object object36 = this.a;
                object35.u("#handleStop: %s", object36);
                object35 = this.b;
                if (object36 == cnf.d) {
                    object36 = ((fgn)object35).b;
                    fed fed2 = new fed(3);
                    ((fgo)object36).l.c(fed2);
                } else {
                    ((fgn)object35).b.l.h();
                }
                object35 = (fgn)object35;
                object36 = ((fgn)object35).b.e;
                if (((gto)object36).g()) {
                    ((feg)((gto)object36).c()).b();
                }
                if (((gto)(object36 = ((fgn)object35).a)).g()) {
                    ((fgf)((gto)object36).c()).d();
                }
                if (((fgn)object35).b.w == null) return null;
                ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleStop", 878, "SodaSpeechRecognizer.java")).r("#handleStop: scheduleSodaTimeout");
                object35 = ((fgn)object35).b;
                object36 = ((fgo)object35).g;
                if (((hwg)object36).b == -1L) {
                    object35 = ((fgo)object35).w;
                    object36 = hzu.a;
                    hzu.d((hwg)object36);
                    ((cmz)object35).e((hwg)object36);
                    return null;
                }
                ((fgo)object35).w.e((hwg)object36);
                return null;
            }
            case 6: {
                Object object37 = ((adf)this.a).a;
                efi efi2 = (efi)this.b;
                if (ag$$ExternalSyntheticApiModelOutline0.m$1(efi2.c, ag$$ExternalSyntheticApiModelOutline0.m(object37)) == 1) {
                    return elb.l(2);
                }
                n2 = efi2.c.getMode();
                if (n2 == 2) return elb.l(7);
                if (n2 == 1) return elb.l(7);
                return elb.l(4);
            }
            case 5: {
                void var5_51;
                Object object38 = new hcc(null);
                Object object39 = this.b;
                Object object40 = this.a;
                try {
                    bmu bmu2 = ((dua)((dwm)object40).b).g();
                    Object object41 = ((dwm)object40).c;
                    fqt fqt2 = new fqt((hyf)object39);
                    fqt2.a = new hcc[]{object38};
                    object38 = (Void)bmu2.w((Uri)object41, fqt2);
                    return null;
                }
                catch (RuntimeException runtimeException) {
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                dwm dwm2 = (dwm)object40;
                object40 = dwm2.b;
                dpf.c(Level.WARNING, ((dua)object40).d(), (Throwable)var5_51, "Failed to update snapshot for %s flags may be stale.", dwm2.d);
                return null;
            }
            case 4: {
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/PacksRequest", "requestNewPacks", 288, "PacksRequest.java")).s("Done Requesting %d slices", this.a.size());
                return this.b;
            }
            case 3: {
                Object object42 = this.a;
                dcu.a((Collection)this.b, "Cancellation request for pack '%s' failed", object42);
                return null;
            }
            case 2: {
                Object object43 = this.b;
                return gto.h((hpn)((czh)this.a).d.get(object43));
            }
            case 1: {
                Object object44 = this.a;
                Object object45 = this.b;
                return ((cqm)object44).a((hnx)object45);
            }
            case 0: {
                Object object46 = this.b;
                return ((czh)this.a).d.containsKey(object46);
            }
        }
        try {
            Object object47;
            hyg hyg4;
            block110: {
                hyg4 = gmk.a;
                try {
                    object47 = ((gky)object2).a();
                }
                catch (IOException iOException) {
                    object47 = hyg4;
                    if (((gky)object2).h(iOException)) break block110;
                    a.as(gky.a.g(), "Unable to read or clear store, will not update scheduled account ids. ", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", '\u01b3', "SyncManagerDataStore.java", iOException);
                    object47 = hyg4;
                }
            }
            hyg4 = (hwp)((hwv)object47).C(5);
            ((hwp)hyg4).x((hwv)object47);
            if (!((hwp)hyg4).b.B()) {
                ((hwp)hyg4).u();
            }
            ((gmk)((hwp)hyg4).b).f = hww.a;
            object47 = new TreeSet();
            object = object.iterator();
            while (object.hasNext()) {
                gli gli2 = (gli)object.next();
                if (!gli2.a()) continue;
                object47.add(gli2.c.a);
            }
            if (!((hwp)hyg4).b.B()) {
                ((hwp)hyg4).u();
            }
            gmk gmk2 = (gmk)((hwp)hyg4).b;
            object = gmk2.f;
            if (!object.c()) {
                gmk2.f = hwv.q((hxb)object);
            }
            hvc.g(object47, gmk2.f);
            try {
                object47 = (gmk)((hwp)hyg4).o();
                ((gky)object2).g((gmk)object47);
                return null;
            }
            catch (IOException iOException) {
                a.as(gky.a.g(), "Error writing scheduled account ids", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", '\u01c8', "SyncManagerDataStore.java", iOException);
                return null;
            }
        }
        finally {
            gky2.b.writeLock().unlock();
            return null;
        }
    }
}

