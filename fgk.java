/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import java.io.InputStream;
import java.util.function.Supplier;

public final class fgk
implements hny {
    public final fgo a;
    public final Supplier b;
    public final int c;
    public final int d;

    public /* synthetic */ fgk(fgo fgo2, Supplier supplier, int n2, int n3) {
        this.a = fgo2;
        this.b = supplier;
        this.c = n2;
        this.d = n3;
    }

    @Override
    public final hpn a(Object object) {
        fgo fgo2 = this.a;
        cmz cmz2 = fgo2.w = (cmz)object;
        if (fgo2.v.get()) {
            ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startDetection", 345, "SodaSpeechRecognizer.java")).r("Transcription already cancelled - not start detection");
            cmz2.f();
            object = hpj.a;
        } else if (cmz2.g() && ((cnd)((gtt)cmz2.f).a).q()) {
            ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startDetection", 353, "SodaSpeechRecognizer.java")).r("Soda already running!");
            fgo2.l.c(new fed(2));
            object = hpj.a;
        } else {
            int n2;
            int n3;
            Object object2;
            Object object3;
            ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startDetection", 359, "SodaSpeechRecognizer.java")).r("Offline recognizer - start detection");
            if (fgo2.k.J.isPresent()) {
                object = gto.i(fgo2.k.J.get());
            } else {
                Object object4;
                hyg hyg2;
                object3 = (hwr)ihi.a.l();
                hyg hyg3 = ihf.a.l();
                object = fgo2.n;
                if (((gto)object).g()) {
                    object = (cnl)((gto)object).c();
                    ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "getRecognitionContext", 726, "SodaSpeechRecognizer.java")).u("Adding device context biasing for %s", object.b());
                    object2 = ihd.a.l();
                    hyg2 = igy.a.l();
                    object4 = hvu.t(object.b());
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    igy igy2 = (igy)((hwp)hyg2).b;
                    igy2.c();
                    igy2.b.add(object4);
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object4 = (ihd)((hwp)object2).b;
                    hyg2 = (igy)((hwp)hyg2).o();
                    hyg2.getClass();
                    ((ihd)object4).c = hyg2;
                    ((ihd)object4).b = 1;
                    ((hwp)hyg3).S("client-id", (ihd)((hwp)object2).o());
                    ((hwr)object3).aD(object.a());
                }
                object = object2 = fgo2.j.b;
                if (object2 == null) {
                    object = ibr.a;
                }
                if (!((ibr)object).b.isEmpty()) {
                    hyg2 = ihd.a.l();
                    object4 = igy.a.l();
                    object = object2 = fgo2.j.b;
                    if (object2 == null) {
                        object = ibr.a;
                    }
                    object = Collection$_EL.stream(((ibr)object).b).map(new fcx(3));
                    n3 = gzx.d;
                    object = (Iterable)object.collect(gye.a);
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object2 = (igy)((hwp)object4).b;
                    ((igy)object2).c();
                    hvc.g((Iterable)object, ((igy)object2).b);
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    object = (ihd)((hwp)hyg2).b;
                    object2 = (igy)((hwp)object4).o();
                    object2.getClass();
                    ((ihd)object).c = object2;
                    ((ihd)object).b = 1;
                    ((hwp)hyg3).S("experiment-labels", (ihd)((hwp)hyg2).o());
                }
                object = fgo2.m.k();
                while (object.hasNext()) {
                    object2 = (cnk)object.next();
                    object4 = object2.b();
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    hyg2 = (ihi)((hwr)object3).b;
                    object4.getClass();
                    ((ihi)hyg2).G();
                    ((ihi)hyg2).c.add(object4);
                    object2 = object2.a();
                    if (!((hwp)hyg3).b.B()) {
                        ((hwp)hyg3).u();
                    }
                    ((ihf)((hwp)hyg3).b).c().putAll(object2);
                }
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object = (ihi)((hwr)object3).b;
                object2 = (ihf)((hwp)hyg3).o();
                object2.getClass();
                ((ihi)object).d = object2;
                ((ihi)object).b |= 1;
                object = object2 = fgo2.j.b;
                if (object2 == null) {
                    object = ibr.a;
                }
                object = object2 = ((ibr)object).d;
                if (object2 == null) {
                    object = ibt.a;
                }
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object2 = (ihi)((hwr)object3).b;
                object.getClass();
                ((ihi)object2).f = object;
                ((ihi)object2).b |= 4;
                object = object2 = fgo2.j.b;
                if (object2 == null) {
                    object = ibr.a;
                }
                if (!((ibr)object).c.isEmpty()) {
                    object = object2 = fgo2.j.b;
                    if (object2 == null) {
                        object = ibr.a;
                    }
                    ((hwr)object3).aD(((ibr)object).c);
                }
                if (!fgo2.k.x.isEmpty()) {
                    ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "getRecognitionContext", 771, "SodaSpeechRecognizer.java")).r("Adding phrases biasing...");
                    object = ihb.a.l();
                    object2 = fgo2.k.x;
                    n2 = object2.size();
                    for (n3 = 0; n3 < n2; ++n3) {
                        object4 = (String)object2.get(n3);
                        hyg3 = iha.a.l();
                        if (!((hwp)hyg3).b.B()) {
                            ((hwp)hyg3).u();
                        }
                        hyg2 = (iha)((hwp)hyg3).b;
                        object4.getClass();
                        ((iha)hyg2).b |= 1;
                        ((iha)hyg2).c = object4;
                        if (!((hwp)object).b.B()) {
                            ((hwp)object).u();
                        }
                        hyg2 = (ihb)((hwp)object).b;
                        hyg3 = (iha)((hwp)hyg3).o();
                        hyg3.getClass();
                        object4 = ((ihb)hyg2).b;
                        if (!object4.c()) {
                            ((ihb)hyg2).b = hwv.s((hxk)object4);
                        }
                        ((ihb)hyg2).b.add(hyg3);
                    }
                    object2 = ihc.a.l();
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    hyg2 = ((hwp)object2).b;
                    hyg3 = (ihc)hyg2;
                    ((ihc)hyg3).b |= 1;
                    ((ihc)hyg3).e = "android-speech-api-generic-phrases";
                    if (!((hwv)hyg2).B()) {
                        ((hwp)object2).u();
                    }
                    hyg3 = (ihc)((hwp)object2).b;
                    object = (ihb)((hwp)object).o();
                    object.getClass();
                    ((ihc)hyg3).d = object;
                    ((ihc)hyg3).c = 2;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (ihi)((hwr)object3).b;
                    object2 = (ihc)((hwp)object2).o();
                    object2.getClass();
                    ((ihi)object).G();
                    ((ihi)object).c.add(object2);
                }
                boolean bl2 = fgo2.j.c;
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object = (ihi)((hwr)object3).b;
                ((ihi)object).b |= 0x10;
                ((ihi)object).g = bl2;
                object = gto.i((ihi)((hwp)object3).o());
            }
            object2 = fgo2.p;
            if (((gto)object2).g() && ((fgf)((gto)object2).c()).e()) {
                ((fgf)fgo2.p.c()).f();
            }
            n3 = this.d;
            n2 = this.c;
            object3 = (InputStream)ag$$ExternalSyntheticApiModelOutline1.m(this.b);
            object2 = gsl.a;
            fxf.al(fxf.ai(new cmv(cmz2, n2, n3, (InputStream)object3, (gto)object2, (gto)object, (gto)object2), cmz2.h), new fgl(fgo2, 0), fgo2.d);
            object = hpj.a;
        }
        return object;
    }
}

