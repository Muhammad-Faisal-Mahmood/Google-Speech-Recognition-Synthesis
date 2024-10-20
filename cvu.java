/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public final class cvu
implements hny {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;

    public /* synthetic */ cvu(cwj cwj2, ctf ctf2, cth cth2, ctv ctv2, ctt ctt2, int n2) {
        this.f = n2;
        this.a = cwj2;
        this.b = ctf2;
        this.c = cth2;
        this.d = ctv2;
        this.e = ctt2;
    }

    public /* synthetic */ cvu(cwj cwj2, ctf ctf2, cth cth2, hpn hpn2, ctt ctt2, int n2) {
        this.f = n2;
        this.d = cwj2;
        this.b = ctf2;
        this.c = cth2;
        this.a = hpn2;
        this.e = ctt2;
    }

    public /* synthetic */ cvu(cwj cwj2, ctq ctq2, AtomicReference atomicReference, ctj ctj2, hny hny2, int n2) {
        this.f = n2;
        this.e = cwj2;
        this.c = ctq2;
        this.a = atomicReference;
        this.b = ctj2;
        this.d = hny2;
    }

    public /* synthetic */ cvu(kpo kpo2, AmbientDelegate ambientDelegate, den den2, ddn ddn2, ddn ddn3, int n2) {
        this.f = n2;
        this.a = kpo2;
        this.d = ambientDelegate;
        this.e = den2;
        this.b = ddn2;
        this.c = ddn3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a(Object object) {
        int n2 = this.f;
        int n3 = 0;
        if (n2 != 0) {
            Object object2;
            if (n2 != 1) {
                if (n2 != 2) {
                    object = (Void)object;
                    ((dcx)((AmbientDelegate)this.d).c).a();
                    Object object3 = this.c;
                    object = this.b;
                    Object object4 = this.e;
                    kpo kpo2 = (kpo)this.a;
                    den den2 = (den)object4;
                    kpo2.c(den2, (ddn)object, (ddn)object3);
                    return kpo.e(den2);
                }
                object = (cwh)((Object)object);
                Object object5 = ((Enum)object).name();
                ctf ctf2 = (ctf)this.b;
                Object object6 = ctf2.c;
                cth cth2 = (cth)this.c;
                cyr.e("%s: Android sharing CASE: %s for file %s, filegroup %s", "FileGroupManager", object5, object6, cth2.d);
                object6 = (ctv)hhk.S((Future)this.a);
                n3 = ((Enum)object).ordinal();
                Object object7 = this.d;
                Object object8 = this.e;
                if (n3 != 1) {
                    if (n3 != 3) {
                        if (n3 == 4) {
                            object = object5 = ctp.b(((ctv)object6).d);
                            if (object5 == null) {
                                object = ctp.a;
                            }
                            if (object == ctp.e && (n3 = a.w(ctf2.m)) != 0 && n3 == 2) {
                                object = (ctt)object8;
                                return ((cwj)object7).x(cth2, ctf2, (ctt)object, (ctv)object6, 6);
                            }
                        }
                        cyr.e("%s: File couldn't be shared before download %s, filegroup %s", "FileGroupManager", ctf2.c, cth2.d);
                        return hpj.a;
                    }
                    object = (ctt)object8;
                    return ((cwj)object7).w(cth2, ctf2, (ctt)object, (ctv)object6, 4);
                }
                object = ((ctv)object6).g;
                long l2 = cth2.l;
                object5 = (ctt)object8;
                object7 = (cwj)object7;
                return ((cwj)object7).q(((cwj)object7).y(cth2, ctf2, (ctv)object6, (ctt)object5, (String)object, l2, 3), new buf(8));
            }
            Object object9 = (cth)object;
            object = this.a;
            Object object10 = this.c;
            Object object11 = this.e;
            if (object9 == null) {
                cwj cwj2 = (cwj)object11;
                return cwj2.q(cwj2.g((ctq)object10, true), new cvy(object10, object, 4));
            }
            ((AtomicReference)object).set(object9);
            object = object2 = ((cth)object9).c;
            if (object2 == null) {
                object = ctg.a;
            }
            n2 = ((ctg)object).g;
            object2 = (hwp)((hwv)object9).C(5);
            ((hwp)object2).x((hwv)object9);
            object9 = (hwp)((hwv)object).C(5);
            ((hwp)object9).x((hwv)object);
            if (!((hwp)object9).b.B()) {
                ((hwp)object9).u();
            }
            Object object122 = (ctg)((hwp)object9).b;
            ((ctg)object122).b |= 0x10;
            ((ctg)object122).g = n2 + 1;
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object122 = (cth)((hwp)object2).b;
            object9 = (ctg)((hwp)object9).o();
            object9.getClass();
            ((cth)object122).c = object9;
            ((cth)object122).b |= 1;
            object2 = (cth)((hwp)object2).o();
            if ((((ctg)object).b & 8) != 0) {
                n3 = 1;
            }
            object = object2;
            if (n3 == 0) {
                long l3 = cqq.x();
                object = object9 = ((cth)object2).c;
                if (object9 == null) {
                    object = ctg.a;
                }
                object9 = (hwp)((hwv)object).C(5);
                ((hwp)object9).x((hwv)object);
                if (!((hwp)object9).b.B()) {
                    ((hwp)object9).u();
                }
                object = (ctg)((hwp)object9).b;
                ((ctg)object).b = 8 | ((ctg)object).b;
                ((ctg)object).f = l3;
                object = (ctg)((hwp)object9).o();
                object9 = (hwp)((hwv)object2).C(5);
                ((hwp)object9).x((hwv)object2);
                if (!((hwp)object9).b.B()) {
                    ((hwp)object9).u();
                }
                object2 = (cth)((hwp)object9).b;
                object.getClass();
                ((cth)object2).c = object;
                ((cth)object2).b |= 1;
                object = (cth)((hwp)object9).o();
            }
            object2 = hhk.K(object);
            if (n3 == 0) {
                object9 = new ArrayList();
                for (Object object122 : ((cth)object).o) {
                    object9.add(((cwj)object11).j((ctf)object122, (cth)object));
                }
                object2 = crh.y((Iterable)object9);
                object9 = new bdr(object9, 6);
                object122 = (cwj)object11;
                object2 = dah.e(((bzq)object2).u((Callable)object9, ((cwj)object122).e)).f(new brk(object, 16), ((cwj)object122).e);
            }
            Object object13 = this.d;
            object9 = this.b;
            object122 = dah.e(object2);
            bpu bpu2 = new bpu(object11, object10, 19, null);
            object = (cwj)object11;
            return dah.e(((dah)object122).g(bpu2, ((cwj)object).e).g(new cvw(object11, (n3 ^ 1) != 0, object2, 1), ((cwj)object).e)).d(IOException.class, new buf(7), ((cwj)object).e).g(new cvq((cwj)object, (ctj)object9, (ctq)object10, (hny)object13, 7), ((cwj)object).e);
        }
        cwh cwh2 = (cwh)((Object)object);
        Object object14 = cwh2.name();
        object = (ctf)this.b;
        Object object15 = ((ctf)object).c;
        cth cth3 = (cth)this.c;
        cyr.e("%s: Android sharing CASE: %s for file %s, filegroup %s", "FileGroupManager", object14, object15, cth3.d);
        n3 = cwh2.ordinal();
        object14 = this.a;
        Object object16 = this.d;
        Object object17 = this.e;
        if (n3 != 1) {
            if (n3 != 3) {
                if (n3 == 4 && (n3 = a.w(((ctf)object).m)) != 0 && n3 == 2) {
                    object15 = (ctt)object17;
                    ctv ctv2 = (ctv)object16;
                    return ((cwj)object14).x(cth3, (ctf)object, (ctt)object15, ctv2, 7);
                }
                n3 = a.w(((ctf)object).m);
                if (n3 != 0 && n3 == 2) {
                    cwj.A(((cwj)object14).i, cth3, (ctf)object, 16);
                }
                cyr.e("%s: File couldn't be shared after download %s, filegroup %s", "FileGroupManager", ((ctf)object).c, cth3.d);
                long l4 = cth3.l;
                ctt ctt2 = (ctt)object17;
                return ((cwj)object14).r(cth3, (ctf)object, ctt2, l4);
            }
            object15 = (ctt)object17;
            ctv ctv3 = (ctv)object16;
            return ((cwj)object14).w(cth3, (ctf)object, (ctt)object15, ctv3, 5);
        }
        ctv ctv4 = (ctv)object16;
        long l5 = cth3.l;
        if (!cwj.u(ctv4, l5)) return hpj.a;
        cyr.e("%s: File already shared after downloaded but lease has to be updated for file %s, filegroup %s", "FileGroupManager", ((ctf)object).c, cth3.d);
        object15 = ctv4.g;
        object17 = (ctt)object17;
        object14 = (cwj)object14;
        return ((cwj)object14).q(((cwj)object14).y(cth3, (ctf)object, ctv4, (ctt)object17, (String)object15, l5, 27), new cwa((cwj)object14, cth3, (ctf)object, (ctt)object17, l5));
    }
}

