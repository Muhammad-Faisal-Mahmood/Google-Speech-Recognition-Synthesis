/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class cyx
implements cys {
    public static final int d = 0;
    private static final TimeZone e = DesugarTimeZone.getTimeZone("UTC");
    public final Executor a;
    public final Random b;
    public final frr c;

    public cyx(frr frr2, Executor executor, Random random) {
        this.c = frr2;
        this.a = executor;
        this.b = random;
    }

    public static long e(long l2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e);
        gregorianCalendar.setTimeInMillis(l2);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Override
    public final hpn a() {
        int n2 = gzx.d;
        AtomicReference<gzx> atomicReference = new AtomicReference<gzx>(hct.a);
        cym cym2 = new cym(atomicReference, 7);
        return fxf.aj(this.c.b(cym2, this.a), gqk.b(new cym(atomicReference, 8)), this.a);
    }

    @Override
    public final hpn b() {
        AtomicReference<gsl> atomicReference = new AtomicReference<gsl>(gsl.a);
        cym cym2 = new cym(atomicReference, 5);
        return fxf.aj(this.c.b(cym2, (Executor)hom.a), new cym(atomicReference, 6), (Executor)hom.a);
    }

    @Override
    public final hpn c() {
        return fxf.ak(this.c.a(), new cyc(this, 4), this.a);
    }

    @Override
    public final hpn d(ctl object) {
        cym cym2 = new cym(object, 9);
        object = this.a;
        return this.c.b(cym2, (Executor)object);
    }
}

