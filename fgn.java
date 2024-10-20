/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fgn
implements cmt {
    public final gto a;
    public final fgo b;

    public fgn(fgo object, gto gto2) {
        block3: {
            block2: {
                this.b = object;
                if (!gto2.g()) break block2;
                object = gto2;
                if (((fgf)gto2.c()).e()) break block3;
            }
            object = gsl.a;
        }
        this.a = object;
    }

    @Override
    public final void a() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(iga object) {
        gof gof2;
        block56: {
            gof2 = this.b.f.d("handleSodaEvent");
            try {
                boolean bl2;
                Object object2;
                Object object3;
                Object object4;
                Object object52;
                int n2;
                block62: {
                    hyg hyg2;
                    block60: {
                        int n3;
                        block61: {
                            block63: {
                                block57: {
                                    block58: {
                                        block59: {
                                            ((heg)((heg)fgo.a.c()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleSodaEvent", 799, "SodaSpeechRecognizer.java")).u("#handleSodaEvent: %s", object);
                                            n2 = ((iga)object).b;
                                            if ((n2 & 2) == 0) break block57;
                                            object4 = object52 = ((iga)object).d;
                                            if (object52 == null) {
                                                object4 = ifz.a;
                                            }
                                            if ((n2 = ((ifz)object4).b) != 1) break block58;
                                            object52 = (ifm)((ifz)object4).c;
                                            ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleFinalResult", 905, "SodaSpeechRecognizer.java")).s("#handleFinalResult: %d hyp", ((ifm)object52).c.size());
                                            hyg2 = fex.a.l();
                                            object3 = ((ifz)object4).f;
                                            if (!((hwp)hyg2).b.B()) {
                                                ((hwp)hyg2).u();
                                            }
                                            object4 = ((hwp)hyg2).b;
                                            object2 = (fex)object4;
                                            object3.getClass();
                                            ((fex)object2).b |= 1;
                                            ((fex)object2).f = object3;
                                            object3 = ((ifm)object52).c;
                                            if (!((hwv)object4).B()) {
                                                ((hwp)hyg2).u();
                                            }
                                            object4 = (fex)((hwp)hyg2).b;
                                            ((fex)object4).c();
                                            hvc.g((Iterable)object3, ((fex)object4).c);
                                            n2 = ((ifm)object52).c.size();
                                            object4 = new float[n2];
                                            object4 = n2 == 0 ? Collections.emptyList() : new hmn((float[])object4, 0, n2);
                                            if (!((hwp)hyg2).b.B()) {
                                                ((hwp)hyg2).u();
                                            }
                                            object3 = (fex)((hwp)hyg2).b;
                                            ((fex)object3).b();
                                            hvc.g((Iterable)object4, ((fex)object3).d);
                                            object3 = idp.c;
                                            ((hws)object52).h((gpm)object3);
                                            object4 = ((hws)object52).r;
                                            object3 = ((gpm)object3).a;
                                            if (!((hwu)object3).d) break block59;
                                            if ((object4 = ((hwl)object4).l((hwu)object3)) != null && ((List)object4).size() != 0) {
                                                object3 = idp.c;
                                                ((hws)object52).h((gpm)object3);
                                                object4 = ((hws)object52).r.l((hwu)((gpm)object3).a);
                                                object4 = object4 == null ? ((gpm)object3).d : ((gpm)object3).k(object4);
                                                object3 = (Iterable)object4;
                                                if (!((hwp)hyg2).b.B()) {
                                                    ((hwp)hyg2).u();
                                                }
                                                object4 = (fex)((hwp)hyg2).b;
                                                object2 = ((fex)object4).e;
                                                if (!object2.c()) {
                                                    ((fex)object4).e = hwv.s((hxk)object2);
                                                }
                                                hvc.g((Iterable)object3, ((fex)object4).e);
                                            }
                                            object4 = this.b.k;
                                            if (!((fgu)object4).C && !((fgu)object4).D && !((fgu)object4).v.isPresent()) break block60;
                                            object4 = ((ifm)object52).d.iterator();
                                            break block61;
                                        }
                                        object = new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
                                        throw object;
                                    }
                                    if (n2 == 2) {
                                        ((heg)((heg)((heg)fgo.a.f()).g(5, TimeUnit.SECONDS)).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handlePartialResult", 993, "SodaSpeechRecognizer.java")).r("#handlePartialResult");
                                        object52 = ((ifz)object4).b == 2 ? (ifw)((ifz)object4).c : ifw.a;
                                        object3 = fgd.a.l();
                                        object2 = (String)((ifw)object52).b.get(0);
                                        if (!((hwp)object3).b.B()) {
                                            ((hwp)object3).u();
                                        }
                                        object52 = ((hwp)object3).b;
                                        hyg2 = (fgd)object52;
                                        object2.getClass();
                                        ((fgd)hyg2).b |= 1;
                                        ((fgd)hyg2).c = object2;
                                        object4 = ((ifz)object4).f;
                                        if (!((hwv)object52).B()) {
                                            ((hwp)object3).u();
                                        }
                                        object52 = (fgd)((hwp)object3).b;
                                        object4.getClass();
                                        ((fgd)object52).b |= 4;
                                        ((fgd)object52).e = object4;
                                        object4 = (fgd)((hwp)object3).o();
                                        this.b.l.g((fgd)object4);
                                    }
                                    break block62;
                                }
                                if ((n2 & 8) == 0) break block63;
                                object4 = object52 = ((iga)object).e;
                                if (object52 == null) {
                                    object4 = ifl.a;
                                }
                                if ((((ifl)object4).b & 1) != 0) {
                                    object4 = object52 = ((iga)object).e;
                                    if (object52 == null) {
                                        object4 = ifl.a;
                                    }
                                    n2 = n3 = a.v(((ifl)object4).c);
                                    if (n3 == 0) {
                                        n2 = 1;
                                    }
                                    if (n2 == 1) {
                                        this.b.l.k();
                                        break block62;
                                    } else if (n2 == 2 || n2 == 4) {
                                        this.b.l.b();
                                    }
                                }
                                break block62;
                            }
                            if ((0x1000000 & n2) != 0) {
                                object4 = object52 = ((iga)object).i;
                                if (object52 == null) {
                                    object4 = ifs.a;
                                }
                                if (object4 != null && ((ifs)object4).c.size() > 0) {
                                    this.b.l.f((ifs)object4);
                                }
                            }
                            break block62;
                        }
                        while (object4.hasNext()) {
                            hwp hwp2;
                            ifr ifr2;
                            block55: {
                                ifr2 = (ifr)object4.next();
                                hwp2 = ffx.a.l();
                                object2 = ifr2.c;
                                if (!hwp2.b.B()) {
                                    hwp2.u();
                                }
                                object3 = (ffx)hwp2.b;
                                ((ffx)object3).b();
                                hvc.g((Iterable)object2, ((ffx)object3).c);
                                if (this.b.k.C) {
                                    object3 = object2 = ((ifm)object52).f;
                                    if (object2 == null) {
                                        object3 = igf.a;
                                    }
                                    long l2 = ((igf)object3).b / 1000L;
                                    long l3 = ifr2.d;
                                    if (!hwp2.b.B()) {
                                        hwp2.u();
                                    }
                                    object3 = (ffx)hwp2.b;
                                    ((ffx)object3).b |= 1;
                                    ((ffx)object3).d = l3 + l2;
                                }
                                object3 = this.b;
                                if (((fgo)object3).i != 0 && ((fgo)object3).k.D && ifr2.f.size() != 0) {
                                    object3 = ifr2.f.iterator();
                                    while (object3.hasNext()) {
                                        object2 = (igg)object3.next();
                                        if (((igg)object2).b != this.b.i) continue;
                                        n2 = n3 = a.F(((igg)object2).c);
                                        if (n3 == 0) {
                                            n2 = 1;
                                        }
                                        n2 = --n2 != 0 ? (n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? 6 : 5) : 4) : 3) : 2) : 1;
                                        if (!hwp2.b.B()) {
                                            hwp2.u();
                                        }
                                        object3 = (ffx)hwp2.b;
                                        ((ffx)object3).e = n2 - 1;
                                        ((ffx)object3).b |= 2;
                                        break block55;
                                    }
                                    if (!hwp2.b.B()) {
                                        hwp2.u();
                                    }
                                    object3 = (ffx)hwp2.b;
                                    ((ffx)object3).e = 0;
                                    ((ffx)object3).b |= 2;
                                }
                            }
                            if ((ifr2.b & 2) != 0 && this.b.k.v.isPresent() && (n2 = a.t(((iep)this.b.k.v.get()).c)) != 0 && n2 != 1) {
                                ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleFinalResult", 945, "SodaSpeechRecognizer.java")).r("Setting diarization info in soda response");
                                hwp hwp3 = few.a.l();
                                object3 = object2 = ifr2.e;
                                if (object2 == null) {
                                    object3 = ifk.a;
                                }
                                object3 = ((ifk)object3).b;
                                if (!hwp3.b.B()) {
                                    hwp3.u();
                                }
                                hwv hwv2 = hwp3.b;
                                object2 = (few)hwv2;
                                object3.getClass();
                                ((few)object2).b |= 1;
                                ((few)object2).c = object3;
                                object3 = object2 = ifr2.e;
                                if (object2 == null) {
                                    object3 = ifk.a;
                                }
                                bl2 = ((ifk)object3).c;
                                if (!hwv2.B()) {
                                    hwp3.u();
                                }
                                object3 = (few)hwp3.b;
                                ((few)object3).b |= 2;
                                ((few)object3).d = bl2;
                                object3 = (few)hwp3.o();
                                if (!hwp2.b.B()) {
                                    hwp2.u();
                                }
                                object2 = (ffx)hwp2.b;
                                object3.getClass();
                                ((ffx)object2).f = object3;
                                ((ffx)object2).b |= 4;
                            }
                            ((hwp)hyg2).J((ffx)hwp2.o());
                        }
                    }
                    this.b.l.i((fex)((hwp)hyg2).o());
                }
                if ((((iga)object).b & 0x100000) != 0) {
                    object3 = this.b.x;
                    object4 = object52 = ((iga)object).h;
                    if (object52 == null) {
                        object4 = idz.a;
                    }
                    object52 = ((idz)object4).c.iterator();
                    while (object52.hasNext()) {
                        object2 = (iea)object52.next();
                        ((cnu)object3).d.t((iea)object2);
                    }
                    bl2 = ((cnu)object3).b.isPresent();
                    if (bl2) {
                        for (Object object52 : ((idz)object4).d) {
                            ((cns)((cnu)object3).b.get()).a();
                        }
                    } else if (!((idz)object4).d.isEmpty()) {
                        ((heg)((heg)((heg)cnu.a.f()).g(30, TimeUnit.SECONDS)).j("com/google/android/libraries/assistant/soda/metrics/SodaMetricsLoggerTiktok", "logBatchMetricsEvent", 61, "SodaMetricsLoggerTiktok.java")).r("Dropping Soda generic appflow logs due to missing SodaMetricsAppFlow.");
                    }
                    if (((cnu)object3).c.isPresent()) {
                        object52 = ((idz)object4).b.iterator();
                        while (object52.hasNext()) {
                            object4 = (ied)object52.next();
                            ((cnv)((cnu)object3).c.get()).a();
                        }
                    } else if (!((idz)object4).b.isEmpty()) {
                        ((heg)((heg)((heg)cnu.a.f()).g(30, TimeUnit.SECONDS)).j("com/google/android/libraries/assistant/soda/metrics/SodaMetricsLoggerTiktok", "logBatchMetricsEvent", 72, "SodaMetricsLoggerTiktok.java")).r("Dropping Soda streamz events due to missing SodaMetricsStreamz.");
                    }
                }
                object4 = this.b;
                if (((fgo)object4).k.p && (((n2 = ((iga)object).b) & 2) != 0 || (n2 & 8) != 0 || (0x8000 & n2) != 0 || (n2 & 0x4000000) != 0)) {
                    ((fgo)object4).l.j((iga)object);
                }
                if (this.b.k.m.isPresent() && (((iga)object).b & 0x20) != 0) {
                    object4 = object52 = ((iga)object).f;
                    if (object52 == null) {
                        object4 = ifj.a;
                    }
                    float f2 = ((ifj)object4).b;
                    this.b.s.q((int)(f2 * 100.0f));
                }
                if (!((gto)(object4 = this.a)).g() || (((iga)object).b & 0x20) != 0) break block56;
                ((fgf)((gto)object4).c()).b((iga)object);
            }
            catch (Throwable throwable) {
                try {
                    gof2.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
        }
        gof2.close();
    }

    @Override
    public final void c() {
        throw null;
    }

    @Override
    public final void d() {
        throw null;
    }
}

