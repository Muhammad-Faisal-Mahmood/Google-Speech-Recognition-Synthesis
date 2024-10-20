/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.health.HealthStats
 */
import android.os.health.HealthStats;

final class dmh
extends dmg {
    public static final dmh a = new dmh();

    private dmh() {
    }

    @Override
    public final /* synthetic */ hyf a(String object, Object object2) {
        hwv hwv2;
        HealthStats healthStats = ag$$ExternalSyntheticApiModelOutline1.m(object2);
        object2 = kdk.a.l();
        int n2 = (int)dly.k(healthStats, 50001);
        if (n2 != 0) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            hwv2 = (kdk)((hwp)object2).b;
            ((kdk)hwv2).b |= 1;
            ((kdk)hwv2).c = n2;
        }
        if ((n2 = (int)dly.k(healthStats, 50002)) != 0) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            hwv2 = (kdk)((hwp)object2).b;
            ((kdk)hwv2).b |= 2;
            ((kdk)hwv2).d = n2;
        }
        if (object != null) {
            hwv2 = dly.n((String)object);
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object = (kdk)((hwp)object2).b;
            hwv2.getClass();
            ((kdk)object).e = hwv2;
            ((kdk)object).b |= 4;
        }
        object = object2 = (kdk)((hwp)object2).o();
        if (dly.u((kdk)object2)) {
            object = null;
        }
        return object;
    }

    @Override
    public final /* synthetic */ hyf b(hyf hyf2, hyf hyf3) {
        kdk kdk2 = (kdk)hyf2;
        hyf3 = (kdk)hyf3;
        hyf2 = kdk2;
        if (kdk2 != null) {
            hyf2 = kdk2;
            if (hyf3 != null) {
                int n2;
                hwp hwp2 = kdk.a.l();
                if ((kdk2.b & 1) != 0 && (n2 = kdk2.c - ((kdk)hyf3).c) != 0) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdk)hwp2.b;
                    ((kdk)hyf2).b |= 1;
                    ((kdk)hyf2).c = n2;
                }
                if ((kdk2.b & 2) != 0 && (n2 = kdk2.d - ((kdk)hyf3).d) != 0) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdk)hwp2.b;
                    ((kdk)hyf2).b |= 2;
                    ((kdk)hyf2).d = n2;
                }
                hyf2 = hyf3 = kdk2.e;
                if (hyf3 == null) {
                    hyf2 = kdg.a;
                }
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                hyf3 = (kdk)hwp2.b;
                hyf2.getClass();
                ((kdk)hyf3).e = hyf2;
                ((kdk)hyf3).b |= 4;
                hyf2 = hyf3 = (kdk)hwp2.o();
                if (dly.u((kdk)hyf3)) {
                    hyf2 = null;
                }
            }
        }
        return hyf2;
    }
}

