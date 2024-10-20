/*
 * Decompiled with CFR 0.152.
 */
public final class ekr {
    public static final jrk a = wl.n;
    public static final jrk b = wl.o;
    public static final jrk c = wl.l;
    public static final jrk d = wl.m;

    public static final eah a(ebs ebs2) {
        jse.e(ebs2, "failure");
        bzb bzb2 = dww.k(ebt.a.l());
        bzb2.q(ebs2);
        return ekr.h(null, null, bzb2.p(), 27);
    }

    public static final eah b(gto gto2, gto gto3, ebt ebt2, gto gto4, hpn hpn2) {
        jse.e(gto2, "audioAccessorOptional");
        jse.e(gto3, "audioBytesReceiverRegistryOptional");
        jse.e(ebt2, "status");
        return ekr.c(gto2, gto3, gsl.a, ebt2, gto4, hpn2);
    }

    public static final eah c(gto gto2, gto gto3, gto gto4, ebt ebt2, gto gto5, hpn hpn2) {
        jse.e(gto2, "audioAccessorOptional");
        jse.e(gto3, "audioBytesReceiverRegistryOptional");
        jse.e(ebt2, "status");
        jse.e(gto5, "firstByteReadResultFutureOptional");
        jse.e(hpn2, "audioStartTimeFuture");
        return new ekp(gto2, gto4, gto3, gto5, hpn2, ebt2, 1);
    }

    public static final ecs d(ebs object) {
        jse.e(object, "failure");
        Object object2 = dww.k(ebt.a.l());
        ((bzb)object2).q((ebs)object);
        object = ((bzb)object2).p();
        object2 = gsl.a;
        return ekr.e((gto)object2, (gto)object2, (ebt)object, (gto)object2, hhk.K(doc.m((hwr)eaf.a.l()).n()));
    }

    public static final ecs e(gto gto2, gto gto3, ebt ebt2, gto gto4, hpn hpn2) {
        jse.e(ebt2, "status");
        return new ekq(gto2, gto3, gto4, hpn2, ebt2, 1);
    }

    public static final ebq f(ebp ebp2) {
        jse.e(ebp2, "failure");
        bzb bzb2 = dww.l(ebq.a.l());
        bzb2.t(ebp2);
        return bzb2.s();
    }

    public static final ebt g(ebs ebs2) {
        jse.e(ebs2, "failure");
        bzb bzb2 = dww.k(ebt.a.l());
        bzb2.q(ebs2);
        return bzb2.p();
    }

    public static /* synthetic */ eah h(gto gto2, gto gto3, ebt ebt2, int n2) {
        if ((n2 & 1) != 0) {
            gto2 = gsl.a;
        }
        if ((n2 & 2) != 0) {
            gto3 = gsl.a;
        }
        return ekr.b(gto2, gto3, ebt2, gsl.a, hhk.K(doc.m((hwr)eaf.a.l()).n()));
    }

    public static final eas i(ebq ebq2, ebv ebv2) {
        jse.e(ebq2, "status");
        jse.e(ebv2, "stopListeningReason");
        cxt cxt2 = dpf.t(eas.a.l());
        cxt2.v(ebq2);
        cxt2.w(ebv2);
        return cxt2.u();
    }

    public static final ebv j(ebg enum_) {
        jse.e(enum_, "<this>");
        switch (enum_.ordinal()) {
            default: {
                throw new joa();
            }
            case 34: {
                enum_ = ebv.r;
                break;
            }
            case 32: 
            case 33: {
                enum_ = ebv.n;
                break;
            }
            case 26: {
                enum_ = ebv.i;
                break;
            }
            case 17: {
                enum_ = ebv.q;
                break;
            }
            case 7: {
                enum_ = ebv.p;
                break;
            }
            case 5: {
                enum_ = ebv.f;
                break;
            }
            case 4: 
            case 24: {
                enum_ = ebv.m;
                break;
            }
            case 3: {
                enum_ = ebv.l;
                break;
            }
            case 2: 
            case 6: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 25: 
            case 30: {
                enum_ = ebv.k;
                break;
            }
            case 1: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 21: 
            case 22: 
            case 23: 
            case 27: 
            case 28: 
            case 29: 
            case 31: {
                enum_ = ebv.j;
                break;
            }
            case 0: {
                enum_ = ebv.o;
            }
        }
        return enum_;
    }

    public static final eas k(ebp ebp2, ebv ebv2) {
        jse.e(ebp2, "failure");
        jse.e(ebv2, "stopListeningReason");
        return ekr.i(ekr.f(ebp2), ebv2);
    }
}

