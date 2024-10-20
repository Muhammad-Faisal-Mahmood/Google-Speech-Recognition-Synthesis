/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.health.HealthStats
 */
import android.os.health.HealthStats;

final class dmf
extends dmg {
    public static final dmf a = new dmf();

    private dmf() {
    }

    @Override
    public final /* synthetic */ hyf a(String object, Object object2) {
        kdj kdj2;
        Object object3 = ag$$ExternalSyntheticApiModelOutline1.m(object2);
        object2 = kdj.a.l();
        long l2 = dly.k((HealthStats)object3, 30001);
        if (l2 != 0L) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            kdj2 = (kdj)((hwp)object2).b;
            kdj2.b |= 1;
            kdj2.c = l2;
        }
        if ((l2 = dly.k((HealthStats)object3, 30002)) != 0L) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            kdj2 = (kdj)((hwp)object2).b;
            kdj2.b |= 2;
            kdj2.d = l2;
        }
        if ((l2 = dly.k((HealthStats)object3, 30003)) != 0L) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            kdj2 = (kdj)((hwp)object2).b;
            kdj2.b |= 4;
            kdj2.e = l2;
        }
        if ((l2 = dly.k((HealthStats)object3, 30004)) != 0L) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            kdj2 = (kdj)((hwp)object2).b;
            kdj2.b |= 8;
            kdj2.f = l2;
        }
        if ((l2 = dly.k((HealthStats)object3, 30005)) != 0L) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            kdj2 = (kdj)((hwp)object2).b;
            kdj2.b |= 0x10;
            kdj2.g = l2;
        }
        if ((l2 = dly.k((HealthStats)object3, 30006)) != 0L) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object3 = (kdj)((hwp)object2).b;
            ((kdj)object3).b |= 0x20;
            ((kdj)object3).h = l2;
        }
        if (object != null) {
            object3 = dly.n((String)object);
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object = (kdj)((hwp)object2).b;
            object3.getClass();
            ((kdj)object).i = object3;
            ((kdj)object).b |= 0x40;
        }
        object = object2 = (kdj)((hwp)object2).o();
        if (dly.t((kdj)object2)) {
            object = null;
        }
        return object;
    }

    @Override
    public final /* synthetic */ hyf b(hyf hyf2, hyf hyf3) {
        kdj kdj2 = (kdj)hyf2;
        hyf3 = (kdj)hyf3;
        hyf2 = kdj2;
        if (kdj2 != null) {
            hyf2 = kdj2;
            if (hyf3 != null) {
                long l2;
                hwp hwp2 = kdj.a.l();
                if ((kdj2.b & 1) != 0 && (l2 = kdj2.c - ((kdj)hyf3).c) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdj)hwp2.b;
                    ((kdj)hyf2).b |= 1;
                    ((kdj)hyf2).c = l2;
                }
                if ((kdj2.b & 2) != 0 && (l2 = kdj2.d - ((kdj)hyf3).d) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdj)hwp2.b;
                    ((kdj)hyf2).b |= 2;
                    ((kdj)hyf2).d = l2;
                }
                if ((kdj2.b & 4) != 0 && (l2 = kdj2.e - ((kdj)hyf3).e) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdj)hwp2.b;
                    ((kdj)hyf2).b |= 4;
                    ((kdj)hyf2).e = l2;
                }
                if ((kdj2.b & 8) != 0 && (l2 = kdj2.f - ((kdj)hyf3).f) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdj)hwp2.b;
                    ((kdj)hyf2).b |= 8;
                    ((kdj)hyf2).f = l2;
                }
                if ((kdj2.b & 0x10) != 0 && (l2 = kdj2.g - ((kdj)hyf3).g) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdj)hwp2.b;
                    ((kdj)hyf2).b |= 0x10;
                    ((kdj)hyf2).g = l2;
                }
                if ((kdj2.b & 0x20) != 0 && (l2 = kdj2.h - ((kdj)hyf3).h) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdj)hwp2.b;
                    ((kdj)hyf2).b |= 0x20;
                    ((kdj)hyf2).h = l2;
                }
                hyf2 = hyf3 = kdj2.i;
                if (hyf3 == null) {
                    hyf2 = kdg.a;
                }
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                hyf3 = (kdj)hwp2.b;
                hyf2.getClass();
                ((kdj)hyf3).i = hyf2;
                ((kdj)hyf3).b |= 0x40;
                hyf2 = hyf3 = (kdj)hwp2.o();
                if (dly.t((kdj)hyf3)) {
                    hyf2 = null;
                }
            }
        }
        return hyf2;
    }
}

