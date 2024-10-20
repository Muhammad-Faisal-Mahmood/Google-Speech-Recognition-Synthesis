/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class dra
extends dly
implements dmw,
dle {
    private final dli a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final AtomicBoolean e = new AtomicBoolean();
    private final jnu f;
    private final gui g;
    private final jnu h;
    private final jnu i;

    public dra(dli dli2, jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, iku iku2) {
        super((byte[])null);
        this.g = fvd.ap(new aim(jnu5, 17));
        this.h = jnu6;
        this.i = jnu7;
        this.a = dli2;
        this.b = jnu2;
        this.c = jnu3;
        this.d = jnu4;
        this.f = new dan(iku2, 3);
    }

    private static long a(Long l2, long l3) {
        if (l2 == null) {
            return l3;
        }
        return Math.min(l2, l3);
    }

    private static ked b(dqt object) {
        long l2;
        Object object2;
        hwp hwp2 = ked.a.l();
        if (((dqt)object).a != null) {
            object2 = ((dqt)object).a;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ked ked2 = (ked)hwp2.b;
            object2.getClass();
            ked2.b |= 1;
            ked2.c = object2;
        }
        if (((dqt)object).b != null) {
            l2 = ((dqt)object).b.a;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ked)hwp2.b;
            ((ked)object2).b |= 2;
            ((ked)object2).d = l2;
        }
        if (((dqt)object).c != null) {
            l2 = ((dqt)object).c.a;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ked)hwp2.b;
            ((ked)object2).b |= 4;
            ((ked)object2).e = l2;
        }
        if (((dqt)object).d != null) {
            l2 = ((dqt)object).d.a;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (ked)hwp2.b;
            ((ked)object).b |= 8;
            ((ked)object).f = l2;
        }
        return (ked)hwp2.o();
    }

    @Override
    public final void L() {
        this.a.a(this);
    }

    @Override
    public final void i(djt object) {
        this.a.b(this);
        dqy dqy2 = dqy.a;
        Object object2 = dqy2.n;
        Object object3 = dqy2.o;
        ((Boolean)this.f.b()).booleanValue();
        if (object2 != null && ((dmz)object2).a > 0L || object3 != null && ((dmz)object3).a > 0L) {
            long l2;
            object = dqy2.b((Boolean)this.h.b(), (Long)this.i.b(), (drc)this.g.a()) ? dqy2.g : dqy2.l;
            if (object != null && (l2 = ((dmz)object).a) > 0L && (object2 != null && ((dmz)object2).a >= l2 || object3 != null && ((dmz)object3).a >= l2)) {
                ((Boolean)this.f.b()).booleanValue();
                hwp hwp2 = kef.a.l();
                boolean bl2 = dqy2.b((Boolean)this.h.b(), (Long)this.i.b(), (drc)this.g.a());
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (kef)hwp2.b;
                ((kef)object).b |= 0x10000;
                ((kef)object).r = bl2;
                if (dqy2.b((Boolean)this.h.b(), (Long)this.i.b(), (drc)this.g.a())) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object = (kef)hwp2.b;
                    ((kef)object).s = 1;
                    ((kef)object).b = 0x20000 | ((kef)object).b;
                } else {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object = (kef)hwp2.b;
                    ((kef)object).s = 2;
                    ((kef)object).b = 0x20000 | ((kef)object).b;
                }
                object = dqy2.g;
                if (object != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object2 = (kef)hwp2.b;
                    ((kef)object2).b |= 0x10;
                    ((kef)object2).f = l2 = ((dmz)object).a;
                    object2 = l2;
                } else {
                    object2 = null;
                }
                object3 = dqy2.h;
                object = object2;
                if (object3 != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object = (kef)hwp2.b;
                    ((kef)object).b |= 0x80;
                    ((kef)object).i = l2 = ((dmz)object3).a;
                    object = dra.a((Long)object2, l2);
                }
                object2 = dqy2.i;
                object2 = dqy2.j;
                object2 = dqy2.k;
                object3 = dqy2.l;
                object2 = object;
                if (object3 != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object2 = (kef)hwp2.b;
                    ((kef)object2).b |= 0x200;
                    ((kef)object2).k = l2 = ((dmz)object3).a;
                    object2 = dra.a((Long)object, l2);
                }
                dmz dmz2 = dqy2.o;
                dmz dmz3 = dqy2.p;
                dmz dmz4 = dqy2.n;
                dmz dmz5 = dqy2.m;
                int n2 = ((Long)this.d.b()).intValue();
                object = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? null : dmz5) : dmz4) : dmz3) : dmz2;
                object3 = object2;
                if (object != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object3 = (kef)hwp2.b;
                    ((kef)object3).b |= 0x400;
                    ((kef)object3).l = l2 = ((dmz)object).a;
                    object3 = dra.a((Long)object2, l2);
                }
                object = object3;
                if (dmz4 != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object = (kef)hwp2.b;
                    ((kef)object).b |= 0x2000;
                    ((kef)object).o = l2 = dmz4.a;
                    object = dra.a((Long)object3, l2);
                }
                object2 = object;
                if (dmz5 != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object2 = (kef)hwp2.b;
                    ((kef)object2).b |= 0x4000;
                    ((kef)object2).p = l2 = dmz5.a;
                    object2 = dra.a((Long)object, l2);
                }
                object = object2;
                if (dmz2 != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object = (kef)hwp2.b;
                    ((kef)object).b |= 0x800;
                    ((kef)object).m = l2 = dmz2.a;
                    object = dra.a((Long)object2, l2);
                }
                object2 = object;
                if (dmz3 != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object2 = (kef)hwp2.b;
                    ((kef)object2).b |= 0x1000;
                    ((kef)object2).n = l2 = dmz3.a;
                    object2 = dra.a((Long)object, l2);
                }
                object = dqy2.q;
                object = object2;
                if (dqy2.s.b != null) {
                    object3 = dra.b(dqy2.s);
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object = (kef)hwp2.b;
                    object3.getClass();
                    ((kef)object).u = object3;
                    ((kef)object).b |= 0x80000;
                    object = object2;
                    if ((((ked)object3).b & 2) != 0) {
                        object = dra.a((Long)object2, ((ked)object3).d);
                    }
                    object2 = object;
                    if ((((ked)object3).b & 4) != 0) {
                        object2 = dra.a((Long)object, ((ked)object3).e);
                    }
                    object = object2;
                    if ((((ked)object3).b & 8) != 0) {
                        object = dra.a((Long)object2, ((ked)object3).f);
                    }
                }
                object2 = object;
                if (dqy2.t.b != null) {
                    object3 = dra.b(dqy2.t);
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object2 = (kef)hwp2.b;
                    object3.getClass();
                    ((kef)object2).v = object3;
                    ((kef)object2).b |= 0x100000;
                    object2 = object;
                    if ((((ked)object3).b & 2) != 0) {
                        object2 = dra.a((Long)object, ((ked)object3).d);
                    }
                    object = object2;
                    if ((((ked)object3).b & 4) != 0) {
                        object = dra.a((Long)object2, ((ked)object3).e);
                    }
                    object2 = object;
                    if ((((ked)object3).b & 8) != 0) {
                        object2 = dra.a((Long)object, ((ked)object3).f);
                    }
                }
                object3 = drb.a();
                object = object2;
                if (((gto)object3).g()) {
                    object3 = (Long)((gto)object3).c();
                    l2 = (Long)object3;
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object = (kef)hwp2.b;
                    ((kef)object).b |= 2;
                    ((kef)object).d = l2;
                    object = dra.a((Long)object2, (Long)object3);
                }
                l2 = ag$$ExternalSyntheticApiModelOutline1.m();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (kef)hwp2.b;
                ((kef)object2).b |= 4;
                ((kef)object2).e = l2;
                l2 = dra.a((Long)object, l2);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (kef)hwp2.b;
                ((kef)object).b |= 0x40000;
                ((kef)object).t = true;
                Long.valueOf(l2).getClass();
                bl2 = (Boolean)this.c.b();
                if (l2 != 0L) {
                    long l3;
                    if (!bl2) {
                        if (!hwp2.b.B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 1;
                        ((kef)object).c = l2;
                    }
                    object2 = hwp2.b;
                    object = (kef)object2;
                    if ((((kef)object).b & 0x10) != 0) {
                        l3 = ((kef)object).f;
                        if (!((hwv)object2).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x10;
                        ((kef)object).f = l3 - l2;
                    }
                    object2 = hwp2.b;
                    object = (kef)object2;
                    if ((((kef)object).b & 0x80) != 0) {
                        l3 = ((kef)object).i;
                        if (!((hwv)object2).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x80;
                        ((kef)object).i = l3 - l2;
                    }
                    object2 = hwp2.b;
                    object = (kef)object2;
                    if ((((kef)object).b & 0x100) != 0) {
                        l3 = ((kef)object).j;
                        if (!((hwv)object2).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x100;
                        ((kef)object).j = l3 - l2;
                    }
                    object2 = hwp2.b;
                    object = (kef)object2;
                    if ((((kef)object).b & 0x20) != 0) {
                        l3 = ((kef)object).g;
                        if (!((hwv)object2).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x20;
                        ((kef)object).g = l3 - l2;
                    }
                    object2 = hwp2.b;
                    object = (kef)object2;
                    if ((((kef)object).b & 0x40) != 0) {
                        l3 = ((kef)object).h;
                        if (!((hwv)object2).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x40;
                        ((kef)object).h = l3 - l2;
                    }
                    object = hwp2.b;
                    object2 = (kef)object;
                    if ((((kef)object2).b & 0x200) != 0) {
                        l3 = ((kef)object2).k;
                        if (!((hwv)object).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x200;
                        ((kef)object).k = l3 - l2;
                    }
                    object = hwp2.b;
                    object2 = (kef)object;
                    if ((((kef)object2).b & 0x400) != 0) {
                        l3 = ((kef)object2).l;
                        if (!((hwv)object).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x400;
                        ((kef)object).l = l3 - l2;
                    }
                    object2 = hwp2.b;
                    object = (kef)object2;
                    if ((((kef)object).b & 0x800) != 0) {
                        l3 = ((kef)object).m;
                        if (!((hwv)object2).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x800;
                        ((kef)object).m = l3 - l2;
                    }
                    object = hwp2.b;
                    object2 = (kef)object;
                    if ((((kef)object2).b & 0x1000) != 0) {
                        l3 = ((kef)object2).n;
                        if (!((hwv)object).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x1000;
                        ((kef)object).n = l3 - l2;
                    }
                    object = hwp2.b;
                    object2 = (kef)object;
                    if ((((kef)object2).b & 0x2000) != 0) {
                        l3 = ((kef)object2).o;
                        if (!((hwv)object).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x2000;
                        ((kef)object).o = l3 - l2;
                    }
                    object2 = hwp2.b;
                    object = (kef)object2;
                    if ((((kef)object).b & 0x4000) != 0) {
                        l3 = ((kef)object).p;
                        if (!((hwv)object2).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 0x4000;
                        ((kef)object).p = l3 - l2;
                    }
                    object = hwp2.b;
                    object2 = (kef)object;
                    if ((((kef)object2).b & 0x8000) != 0) {
                        l3 = ((kef)object2).q;
                        if (!((hwv)object).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b = 0x8000 | ((kef)object).b;
                        ((kef)object).q = l3 - l2;
                    }
                    object = (kef)hwp2.b;
                    if ((((kef)object).b & 0x80000) != 0) {
                        object = object2 = ((kef)object).u;
                        if (object2 == null) {
                            object = ked.a;
                        }
                        object = dly.w((ked)object, l2);
                        if (!hwp2.b.B()) {
                            hwp2.u();
                        }
                        object2 = (kef)hwp2.b;
                        object.getClass();
                        ((kef)object2).u = object;
                        ((kef)object2).b = 0x80000 | ((kef)object2).b;
                    }
                    object = (kef)hwp2.b;
                    if ((((kef)object).b & 0x100000) != 0) {
                        object = object2 = ((kef)object).v;
                        if (object2 == null) {
                            object = ked.a;
                        }
                        object = dly.w((ked)object, l2);
                        if (!hwp2.b.B()) {
                            hwp2.u();
                        }
                        object2 = (kef)hwp2.b;
                        object.getClass();
                        ((kef)object2).v = object;
                        ((kef)object2).b |= 0x100000;
                    }
                    object = hwp2.b;
                    object2 = (kef)object;
                    if ((((kef)object2).b & 4) != 0) {
                        l3 = ((kef)object2).e;
                        if (!((hwv)object).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 4;
                        ((kef)object).e = l3 - l2;
                    }
                    object = hwp2.b;
                    object2 = (kef)object;
                    if ((((kef)object2).b & 2) != 0) {
                        l3 = ((kef)object2).d;
                        if (!((hwv)object).B()) {
                            hwp2.u();
                        }
                        object = (kef)hwp2.b;
                        ((kef)object).b |= 2;
                        ((kef)object).d = l3 - l2;
                    }
                }
                object = dqy2.r;
                if (!this.e.getAndSet(true)) {
                    object = (dqz)this.b.b();
                    hhk.P(new ctz(object, hwp2, 13, null), ((dqz)object).c);
                    return;
                }
                object = hpj.a;
            }
            return;
        }
        ((heg)((heg)dkc.a.f()).j("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 318, "StartupMetricServiceImpl.java")).r("missing firstDraw timestamp");
    }

    @Override
    public final /* synthetic */ void j(djt djt2) {
    }
}

