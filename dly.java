/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.health.HealthStats
 *  android.os.health.TimerStat
 */
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public class dly {
    public dly() {
    }

    public dly(byte[] byArray) {
    }

    public /* synthetic */ dly(char[] cArray) {
    }

    public dly(short[] sArray) {
        fxf.w(true, "%s expected to have the %s least significant bits equal to 0", 0, 14);
        fxf.w(true, "%s expected to be at least %s", 16383, 16383);
    }

    public static dds A(int n2) {
        boolean bl2 = true;
        boolean bl3 = (n2 & 8) > 0;
        dya dya2 = dds.e();
        dya2.j(bl3);
        bl3 = (n2 & 0x10) > 0;
        dya2.h(bl3);
        bl3 = (n2 & 0x20) > 0;
        dya2.i(bl3);
        bl3 = (n2 & 0x40) > 0 ? bl2 : false;
        dya2.g(bl3);
        return dya2.f();
    }

    public static boolean B(int n2) {
        return (n2 & 3) == 0;
    }

    public static int C(dds dds2, int n2) {
        dds2 = (dcr)dds2;
        int n3 = n2;
        if (((dcr)dds2).a) {
            n3 = n2 | 8;
        }
        n2 = n3;
        if (((dcr)dds2).b) {
            n2 = n3 | 0x10;
        }
        n3 = n2;
        if (((dcr)dds2).c) {
            n3 = n2 | 0x20;
        }
        if (((dcr)dds2).d) {
            return n3 | 0x40;
        }
        return n3;
    }

    public static long D(den den2) {
        long l2 = den2.k() == null ? den2.d() : den2.c();
        return l2;
    }

    public static dgv E(ScheduledExecutorService scheduledExecutorService, List list) {
        if (scheduledExecutorService != null) {
            if (!list.isEmpty()) {
                return new dgv(scheduledExecutorService, list);
            }
            throw new IllegalStateException("At least one download protocol must be added.");
        }
        throw new IllegalStateException("Control executor must be set.");
    }

    public static dgi F(String string) {
        int n2;
        block10: {
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 94921523: {
                    if (!string.equals("crc32")) break;
                    n2 = 1;
                    break block10;
                }
                case 107902: {
                    if (!string.equals("md5")) break;
                    n2 = 2;
                    break block10;
                }
                case -903629273: {
                    if (!string.equals("sha256")) break;
                    n2 = 3;
                    break block10;
                }
                case -1140680715: {
                    if (!string.equals("adler32")) break;
                    n2 = 0;
                    break block10;
                }
            }
            n2 = -1;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return null;
                    }
                    return dgo.a;
                }
                return dgm.a;
            }
            return dgk.a;
        }
        return dgj.a;
    }

    public static long G(Collection object) {
        object = object.iterator();
        long l2 = 0L;
        while (object.hasNext()) {
            dfr dfr2 = (dfr)object.next();
            dez dez2 = dfr2.c();
            int n2 = dez2.b();
            if (n2 != 1 && n2 != 2) continue;
            l2 += Math.max(dfr2.b(), dez2.e());
        }
        return l2;
    }

    public static long H(Collection object) {
        Iterator iterator = object.iterator();
        long l2 = 0L;
        while (iterator.hasNext()) {
            object = (dfr)iterator.next();
            if (!((dfr)object).b.exists()) continue;
            l2 += ((dfr)object).b();
        }
        return l2;
    }

    public static long k(HealthStats healthStats, int n2) {
        if (healthStats != null && ag$$ExternalSyntheticApiModelOutline1.m$3(healthStats, n2)) {
            return ag$$ExternalSyntheticApiModelOutline1.m(healthStats, n2);
        }
        return 0L;
    }

    public static List l(HealthStats object, int n2) {
        object = object != null && ag$$ExternalSyntheticApiModelOutline1.m$1(object, n2) ? dmi.a.d(ag$$ExternalSyntheticApiModelOutline1.m$1(object, n2)) : Collections.emptyList();
        return object;
    }

    public static Map m(HealthStats object, int n2) {
        object = object != null && ag$$ExternalSyntheticApiModelOutline1.m(object, n2) ? ag$$ExternalSyntheticApiModelOutline1.m(object, n2) : Collections.emptyMap();
        return object;
    }

    public static kdg n(String string) {
        hwp hwp2 = kdg.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        kdg kdg2 = (kdg)hwp2.b;
        kdg2.b |= 2;
        kdg2.d = string;
        return (kdg)hwp2.o();
    }

    public static kdl o(HealthStats healthStats, int n2) {
        if (healthStats != null && ag$$ExternalSyntheticApiModelOutline1.m$2(healthStats, n2)) {
            return dly.q(null, ag$$ExternalSyntheticApiModelOutline1.m(healthStats, n2));
        }
        return null;
    }

    static kdl p(kdl hwv2, kdl hwv3) {
        hyg hyg2 = hwv2;
        if (hwv2 != null) {
            if (hwv3 == null) {
                hyg2 = hwv2;
            } else {
                int n2 = ((kdl)hwv2).c - hwv3.c;
                long l2 = ((kdl)hwv2).d - hwv3.d;
                int n3 = n2;
                if (n2 == 0) {
                    if (l2 != 0L) {
                        n3 = 0;
                    } else {
                        return null;
                    }
                }
                hyg2 = kdl.a.l();
                if ((((kdl)hwv2).b & 4) != 0) {
                    hwv3 = ((kdl)hwv2).e;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdg.a;
                    }
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    hwv3 = (kdl)((hwp)hyg2).b;
                    hwv2.getClass();
                    hwv3.e = hwv2;
                    hwv3.b |= 4;
                }
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                hwv2 = ((hwp)hyg2).b;
                hwv3 = hwv2;
                hwv3.b |= 1;
                hwv3.c = n3;
                if (!hwv2.B()) {
                    ((hwp)hyg2).u();
                }
                hwv2 = (kdl)((hwp)hyg2).b;
                ((kdl)hwv2).b |= 2;
                ((kdl)hwv2).d = l2;
                hyg2 = (kdl)((hwp)hyg2).o();
            }
        }
        return hyg2;
    }

    public static kdl q(String object, TimerStat object2) {
        hwp hwp2 = kdl.a.l();
        int n2 = ag$$ExternalSyntheticApiModelOutline1.m((TimerStat)object2);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = (kdl)hwp2.b;
        ((kdl)hwv2).b |= 1;
        ((kdl)hwv2).c = n2;
        long l2 = ag$$ExternalSyntheticApiModelOutline1.m((TimerStat)object2);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        object2 = hwv2;
        ((kdl)object2).b |= 2;
        ((kdl)object2).d = l2;
        if (((kdl)object2).c < 0) {
            if (!hwv2.B()) {
                hwp2.u();
            }
            object2 = (kdl)hwp2.b;
            ((kdl)object2).b |= 1;
            ((kdl)object2).c = 0;
        }
        if (object != null) {
            object2 = dly.n((String)object);
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (kdl)hwp2.b;
            object2.getClass();
            ((kdl)object).e = object2;
            ((kdl)object).b |= 4;
        }
        object = (kdl)hwp2.b;
        if (((kdl)object).c == 0 && ((kdl)object).d == 0L) {
            return null;
        }
        return (kdl)hwp2.o();
    }

    static kdm r(kdm kdm2, kdm kdm3) {
        hwv hwv2 = kdm2;
        if (kdm2 != null) {
            if (kdm3 == null) {
                hwv2 = kdm2;
            } else {
                kdl kdl2;
                hwv hwv3;
                long l2;
                hwp hwp2 = kdm.a.l();
                if ((kdm2.b & 1) != 0 && (l2 = kdm2.d - kdm3.d) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 1;
                    hwv2.d = l2;
                }
                if ((kdm2.b & 2) != 0 && (l2 = kdm2.e - kdm3.e) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 2;
                    hwv2.e = l2;
                }
                if ((kdm2.b & 4) != 0 && (l2 = kdm2.f - kdm3.f) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 4;
                    hwv2.f = l2;
                }
                if ((kdm2.b & 8) != 0 && (l2 = kdm2.g - kdm3.g) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 8;
                    hwv2.g = l2;
                }
                hwp2.an(dmi.a.e(kdm2.h, kdm3.h));
                hwp2.ao(dmi.a.e(kdm2.i, kdm3.i));
                hwp2.ap(dmi.a.e(kdm2.j, kdm3.j));
                hwp2.am(dmi.a.e(kdm2.k, kdm3.k));
                hwp2.al(dmi.a.e(kdm2.l, kdm3.l));
                hwp2.ah(dmi.a.e(kdm2.m, kdm3.m));
                if ((kdm2.b & 0x10) != 0) {
                    hwv3 = kdm2.n;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x10) != 0) {
                    hwv3 = kdl2 = kdm3.n;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv2 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv3 = (kdm)hwp2.b;
                    ((kdm)hwv3).n = hwv2;
                    ((kdm)hwv3).b |= 0x10;
                }
                hwp2.ai(dmi.a.e(kdm2.o, kdm3.o));
                hwp2.ak(dmf.a.e(kdm2.q, kdm3.q));
                hwp2.aj(dme.a.e(kdm2.r, kdm3.r));
                if ((kdm2.b & 0x20) != 0 && (l2 = kdm2.s - kdm3.s) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x20;
                    hwv2.s = l2;
                }
                if ((kdm2.b & 0x40) != 0 && (l2 = kdm2.t - kdm3.t) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x40;
                    hwv2.t = l2;
                }
                if ((kdm2.b & 0x80) != 0 && (l2 = kdm2.u - kdm3.u) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x80;
                    hwv2.u = l2;
                }
                if ((kdm2.b & 0x100) != 0 && (l2 = kdm2.v - kdm3.v) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x100;
                    hwv2.v = l2;
                }
                if ((kdm2.b & 0x200) != 0 && (l2 = kdm2.w - kdm3.w) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x200;
                    hwv2.w = l2;
                }
                if ((kdm2.b & 0x400) != 0 && (l2 = kdm2.x - kdm3.x) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x400;
                    hwv2.x = l2;
                }
                if ((kdm2.b & 0x800) != 0 && (l2 = kdm2.y - kdm3.y) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x800;
                    hwv2.y = l2;
                }
                if ((kdm2.b & 0x1000) != 0 && (l2 = kdm2.z - kdm3.z) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x1000;
                    hwv2.z = l2;
                }
                if ((kdm2.b & 0x2000) != 0 && (l2 = kdm2.A - kdm3.A) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x2000;
                    hwv2.A = l2;
                }
                if ((kdm2.b & 0x4000) != 0 && (l2 = kdm2.B - kdm3.B) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x4000;
                    hwv2.B = l2;
                }
                if ((kdm2.b & 0x8000) != 0 && (l2 = kdm2.C - kdm3.C) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x8000;
                    hwv2.C = l2;
                }
                if ((kdm2.b & 0x10000) != 0 && (l2 = kdm2.D - kdm3.D) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x10000;
                    hwv2.D = l2;
                }
                if ((kdm2.b & 0x20000) != 0 && (l2 = kdm2.E - kdm3.E) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x20000;
                    hwv2.E = l2;
                }
                if ((kdm2.b & 0x40000) != 0 && (l2 = kdm2.F - kdm3.F) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x40000;
                    hwv2.F = l2;
                }
                if ((kdm2.b & 0x80000) != 0) {
                    hwv3 = kdm2.G;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x80000) != 0) {
                    hwv3 = kdl2 = kdm3.G;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.G = hwv3;
                    hwv2.b |= 0x80000;
                }
                if ((kdm2.b & 0x100000) != 0 && (l2 = kdm2.H - kdm3.H) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.b |= 0x100000;
                    hwv2.H = l2;
                }
                if ((kdm2.b & 0x200000) != 0) {
                    hwv3 = kdm2.I;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x200000) != 0) {
                    hwv3 = kdl2 = kdm3.I;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv2 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv3 = (kdm)hwp2.b;
                    ((kdm)hwv3).I = hwv2;
                    ((kdm)hwv3).b |= 0x200000;
                }
                if ((kdm2.b & 0x400000) != 0) {
                    hwv3 = kdm2.J;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x400000) != 0) {
                    hwv3 = kdl2 = kdm3.J;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.J = hwv3;
                    hwv2.b |= 0x400000;
                }
                if ((kdm2.b & 0x800000) != 0) {
                    hwv3 = kdm2.K;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x800000) != 0) {
                    hwv3 = kdl2 = kdm3.K;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv2 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv3 = (kdm)hwp2.b;
                    ((kdm)hwv3).K = hwv2;
                    ((kdm)hwv3).b |= 0x800000;
                }
                if ((kdm2.b & 0x1000000) != 0) {
                    hwv3 = kdm2.L;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x1000000) != 0) {
                    hwv3 = kdl2 = kdm3.L;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.L = hwv3;
                    hwv2.b |= 0x1000000;
                }
                if ((kdm2.b & 0x2000000) != 0) {
                    hwv3 = kdm2.M;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x2000000) != 0) {
                    hwv3 = kdl2 = kdm3.M;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv2 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv3 = (kdm)hwp2.b;
                    ((kdm)hwv3).M = hwv2;
                    ((kdm)hwv3).b |= 0x2000000;
                }
                if ((kdm2.b & 0x4000000) != 0) {
                    hwv3 = kdm2.N;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x4000000) != 0) {
                    hwv3 = kdl2 = kdm3.N;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.N = hwv3;
                    hwv2.b |= 0x4000000;
                }
                if ((kdm2.b & 0x8000000) != 0) {
                    hwv3 = kdm2.O;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x8000000) != 0) {
                    hwv3 = kdl2 = kdm3.O;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.O = hwv3;
                    hwv2.b |= 0x8000000;
                }
                if ((kdm2.b & 0x10000000) != 0) {
                    hwv3 = kdm2.P;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x10000000) != 0) {
                    hwv3 = kdl2 = kdm3.P;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.P = hwv3;
                    hwv2.b |= 0x10000000;
                }
                if ((kdm2.b & 0x20000000) != 0) {
                    hwv3 = kdm2.Q;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x20000000) != 0) {
                    hwv3 = kdl2 = kdm3.Q;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.Q = hwv3;
                    hwv2.b |= 0x20000000;
                }
                if ((kdm2.b & 0x40000000) != 0) {
                    hwv3 = kdm2.R;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & 0x40000000) != 0) {
                    hwv3 = kdl2 = kdm3.R;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.R = hwv3;
                    hwv2.b |= 0x40000000;
                }
                if ((kdm2.b & Integer.MIN_VALUE) != 0) {
                    hwv3 = kdm2.S;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.b & Integer.MIN_VALUE) != 0) {
                    hwv3 = kdl2 = kdm3.S;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv2 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv3 = (kdm)hwp2.b;
                    ((kdm)hwv3).S = hwv2;
                    ((kdm)hwv3).b |= Integer.MIN_VALUE;
                }
                if ((kdm2.c & 1) != 0) {
                    hwv3 = kdm2.T;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.c & 1) != 0) {
                    hwv3 = kdl2 = kdm3.T;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv2 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv3 = (kdm)hwp2.b;
                    ((kdm)hwv3).T = hwv2;
                    ((kdm)hwv3).c |= 1;
                }
                if ((kdm2.c & 2) != 0) {
                    hwv3 = kdm2.U;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.c & 2) != 0) {
                    hwv3 = kdl2 = kdm3.U;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv2 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv3 = (kdm)hwp2.b;
                    ((kdm)hwv3).U = hwv2;
                    ((kdm)hwv3).c |= 2;
                }
                if ((kdm2.c & 4) != 0 && (l2 = kdm2.V - kdm3.V) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 4;
                    hwv2.V = l2;
                }
                if ((kdm2.c & 8) != 0 && (l2 = kdm2.W - kdm3.W) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 8;
                    hwv2.W = l2;
                }
                if ((kdm2.c & 0x10) != 0 && (l2 = kdm2.X - kdm3.X) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x10;
                    hwv2.X = l2;
                }
                if ((kdm2.c & 0x20) != 0 && (l2 = kdm2.Y - kdm3.Y) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x20;
                    hwv2.Y = l2;
                }
                if ((kdm2.c & 0x40) != 0 && (l2 = kdm2.Z - kdm3.Z) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x40;
                    hwv2.Z = l2;
                }
                if ((kdm2.c & 0x80) != 0 && (l2 = kdm2.aa - kdm3.aa) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x80;
                    hwv2.aa = l2;
                }
                if ((kdm2.c & 0x100) != 0 && (l2 = kdm2.ab - kdm3.ab) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x100;
                    hwv2.ab = l2;
                }
                if ((kdm2.c & 0x200) != 0 && (l2 = kdm2.ac - kdm3.ac) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x200;
                    hwv2.ac = l2;
                }
                if ((kdm2.c & 0x400) != 0 && (l2 = kdm2.ad - kdm3.ad) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x400;
                    hwv2.ad = l2;
                }
                if ((kdm2.c & 0x800) != 0 && (l2 = kdm2.ae - kdm3.ae) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x800;
                    hwv2.ae = l2;
                }
                if ((kdm2.c & 0x1000) != 0 && (l2 = kdm2.af - kdm3.af) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x1000;
                    hwv2.af = l2;
                }
                if ((kdm2.c & 0x2000) != 0 && (l2 = kdm2.ag - kdm3.ag) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x2000;
                    hwv2.ag = l2;
                }
                if ((kdm2.c & 0x4000) != 0 && (l2 = kdm2.ah - kdm3.ah) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x4000;
                    hwv2.ah = l2;
                }
                if ((kdm2.c & 0x8000) != 0 && (l2 = kdm2.ai - kdm3.ai) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c = 0x8000 | hwv2.c;
                    hwv2.ai = l2;
                }
                if ((kdm2.c & 0x10000) != 0 && (l2 = kdm2.aj - kdm3.aj) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x10000;
                    hwv2.aj = l2;
                }
                if ((kdm2.c & 0x20000) != 0) {
                    hwv3 = kdm2.ak;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = kdl.a;
                    }
                } else {
                    hwv2 = null;
                }
                if ((kdm3.c & 0x20000) != 0) {
                    hwv3 = kdl2 = kdm3.ak;
                    if (kdl2 == null) {
                        hwv3 = kdl.a;
                    }
                } else {
                    hwv3 = null;
                }
                if ((hwv3 = dly.p((kdl)hwv2, hwv3)) != null) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.ak = hwv3;
                    hwv2.c |= 0x20000;
                }
                if ((kdm2.c & 0x40000) != 0 && (l2 = kdm2.al - kdm3.al) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x40000;
                    hwv2.al = l2;
                }
                if ((kdm2.c & 0x80000) != 0 && (l2 = kdm2.am - kdm3.am) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv2 = (kdm)hwp2.b;
                    hwv2.c |= 0x80000;
                    hwv2.am = l2;
                }
                if ((kdm2.c & 0x100000) != 0 && (l2 = kdm2.an - kdm3.an) != 0L) {
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    kdm2 = (kdm)hwp2.b;
                    kdm2.c |= 0x100000;
                    kdm2.an = l2;
                }
                hwv2 = kdm2 = (kdm)hwp2.o();
                if (dly.v(kdm2)) {
                    return null;
                }
            }
        }
        return hwv2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean s(kdh kdh2) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (kdh2 == null) return bl3;
        if (kdh2.c.size() != 0) return false;
        if (kdh2.d.size() != 0) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean t(kdj kdj2) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (kdj2 == null) return bl3;
        if (kdj2.c > 0L) return false;
        if (kdj2.d > 0L) return false;
        if (kdj2.e > 0L) return false;
        if (kdj2.f > 0L) return false;
        if (kdj2.g > 0L) return false;
        if (kdj2.h > 0L) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean u(kdk kdk2) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (kdk2 == null) return bl3;
        if ((long)kdk2.c > 0L) return false;
        if ((long)kdk2.d > 0L) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean v(kdm kdm2) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (kdm2 == null) return bl3;
        if (kdm2.d > 0L) return false;
        if (kdm2.e > 0L) return false;
        if (kdm2.f > 0L) return false;
        if (kdm2.g > 0L) return false;
        if (kdm2.h.size() != 0) return false;
        if (kdm2.i.size() != 0) return false;
        if (kdm2.j.size() != 0) return false;
        if (kdm2.k.size() != 0) return false;
        if (kdm2.l.size() != 0) return false;
        if (kdm2.m.size() != 0) return false;
        if (kdm2.o.size() != 0) return false;
        if (kdm2.p.size() != 0) return false;
        if (kdm2.q.size() != 0) return false;
        if (kdm2.r.size() != 0) return false;
        if (kdm2.s > 0L) return false;
        if (kdm2.t > 0L) return false;
        if (kdm2.u > 0L) return false;
        if (kdm2.v > 0L) return false;
        if (kdm2.w > 0L) return false;
        if (kdm2.x > 0L) return false;
        if (kdm2.y > 0L) return false;
        if (kdm2.z > 0L) return false;
        if (kdm2.A > 0L) return false;
        if (kdm2.B > 0L) return false;
        if (kdm2.C > 0L) return false;
        if (kdm2.D > 0L) return false;
        if (kdm2.E > 0L) return false;
        if (kdm2.F > 0L) return false;
        if (kdm2.H > 0L) return false;
        if (kdm2.V > 0L) return false;
        if (kdm2.W > 0L) return false;
        if (kdm2.X > 0L) return false;
        if (kdm2.Y > 0L) return false;
        if (kdm2.Z > 0L) return false;
        if (kdm2.aa > 0L) return false;
        if (kdm2.ab > 0L) return false;
        if (kdm2.ac > 0L) return false;
        if (kdm2.ad > 0L) return false;
        if (kdm2.ae > 0L) return false;
        if (kdm2.af > 0L) return false;
        if (kdm2.ag > 0L) return false;
        if (kdm2.ah > 0L) return false;
        if (kdm2.ai > 0L) return false;
        if (kdm2.aj > 0L) return false;
        if (kdm2.al > 0L) return false;
        if (kdm2.am > 0L) return false;
        if (kdm2.an > 0L) return false;
        return bl2;
    }

    public static ked w(ked hwv2, long l2) {
        long l3;
        hwp hwp2 = (hwp)hwv2.C(5);
        hwp2.x(hwv2);
        hwv hwv3 = hwv2 = hwp2.b;
        if ((((ked)hwv3).b & 2) != 0) {
            l3 = ((ked)hwv3).d;
            if (!hwv2.B()) {
                hwp2.u();
            }
            hwv2 = (ked)hwp2.b;
            ((ked)hwv2).b |= 2;
            ((ked)hwv2).d = l3 - l2;
        }
        hwv2 = hwv3 = hwp2.b;
        if ((((ked)hwv2).b & 4) != 0) {
            l3 = ((ked)hwv2).e;
            if (!hwv3.B()) {
                hwp2.u();
            }
            hwv2 = (ked)hwp2.b;
            ((ked)hwv2).b |= 4;
            ((ked)hwv2).e = l3 - l2;
        }
        hwv2 = hwp2.b;
        hwv3 = (ked)hwv2;
        if ((((ked)hwv3).b & 8) != 0) {
            l3 = ((ked)hwv3).f;
            if (!hwv2.B()) {
                hwp2.u();
            }
            hwv2 = (ked)hwp2.b;
            ((ked)hwv2).b |= 8;
            ((ked)hwv2).f = l3 - l2;
        }
        return (ked)hwp2.o();
    }

    static dmk x(Long l2, Long l3, HealthStats object, kdc kdc2, dpi object2) {
        Object object3;
        Object object4;
        Object object5 = kdm.a.l();
        long l4 = dly.k((HealthStats)object, 10001);
        long l5 = 0L;
        if (l4 != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 1;
            object4.d = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10002)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 2;
            object4.e = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10003)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 4;
            object4.f = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10004)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 8;
            object4.g = l4;
        }
        ((hwp)object5).an(dly.l((HealthStats)object, 10005));
        ((hwp)object5).ao(dly.l((HealthStats)object, 10006));
        ((hwp)object5).ap(dly.l((HealthStats)object, 10007));
        ((hwp)object5).am(dly.l((HealthStats)object, 10008));
        ((hwp)object5).al(dly.l((HealthStats)object, 10009));
        ((hwp)object5).ah(dly.l((HealthStats)object, 10010));
        object4 = dly.o((HealthStats)object, 10011);
        if (object4 != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.n = object4;
            object3.b |= 0x10;
        }
        ((hwp)object5).ai(dly.l((HealthStats)object, 10012));
        ((hwp)object5).ak(dmf.a.d(dly.m((HealthStats)object, 10014)));
        ((hwp)object5).aj(dme.a.d(dly.m((HealthStats)object, 10015)));
        l4 = dly.k((HealthStats)object, 10016);
        if (l4 != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x20;
            object4.s = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10017)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x40;
            object4.t = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10018)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x80;
            object4.u = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10019)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x100;
            object4.v = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10020)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x200;
            object4.w = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10021)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x400;
            object4.x = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10022)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x800;
            object4.y = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10023)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x1000;
            object4.z = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10024)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x2000;
            object4.A = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10025)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x4000;
            object4.B = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10026)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x8000;
            object4.C = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10027)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x10000;
            object4.D = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10028)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x20000;
            object4.E = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10029)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x40000;
            object4.F = l4;
        }
        if ((object4 = dly.o((HealthStats)object, 10030)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.G = object4;
            object3.b |= 0x80000;
        }
        if ((l4 = dly.k((HealthStats)object, 10031)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.b |= 0x100000;
            object4.H = l4;
        }
        if ((object4 = dly.o((HealthStats)object, 10032)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.I = object4;
            object3.b |= 0x200000;
        }
        if ((object4 = dly.o((HealthStats)object, 10033)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.J = object4;
            object3.b |= 0x400000;
        }
        if ((object4 = dly.o((HealthStats)object, 10034)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.K = object4;
            object3.b |= 0x800000;
        }
        if ((object3 = dly.o((HealthStats)object, 10035)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.L = object3;
            object4.b |= 0x1000000;
        }
        if ((object4 = dly.o((HealthStats)object, 10036)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.M = object4;
            object3.b |= 0x2000000;
        }
        if ((object4 = dly.o((HealthStats)object, 10037)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.N = object4;
            object3.b |= 0x4000000;
        }
        if ((object3 = dly.o((HealthStats)object, 10038)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.O = object3;
            object4.b |= 0x8000000;
        }
        if ((object4 = dly.o((HealthStats)object, 10039)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.P = object4;
            object3.b |= 0x10000000;
        }
        if ((object4 = dly.o((HealthStats)object, 10040)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.Q = object4;
            object3.b |= 0x20000000;
        }
        if ((object4 = dly.o((HealthStats)object, 10041)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.R = object4;
            object3.b |= 0x40000000;
        }
        if ((object3 = dly.o((HealthStats)object, 10042)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.S = object3;
            object4.b |= Integer.MIN_VALUE;
        }
        if ((object4 = dly.o((HealthStats)object, 10043)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.T = object4;
            object3.c |= 1;
        }
        if ((object4 = dly.o((HealthStats)object, 10044)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object3 = (kdm)((hwp)object5).b;
            object3.U = object4;
            object3.c |= 2;
        }
        if ((l4 = dly.k((HealthStats)object, 10045)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 4;
            object4.V = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10046)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 8;
            object4.W = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10047)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x10;
            object4.X = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10048)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x20;
            object4.Y = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10049)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x40;
            object4.Z = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10050)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x80;
            object4.aa = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10051)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x100;
            object4.ab = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10052)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x200;
            object4.ac = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10053)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x400;
            object4.ad = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10054)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x800;
            object4.ae = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10055)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x1000;
            object4.af = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10056)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x2000;
            object4.ag = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10057)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x4000;
            object4.ah = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10058)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x8000;
            object4.ai = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10059)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c = 0x10000 | object4.c;
            object4.aj = l4;
        }
        if ((object3 = dly.o((HealthStats)object, 10061)) != null) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.ak = object3;
            object4.c |= 0x20000;
        }
        if ((l4 = dly.k((HealthStats)object, 10062)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c |= 0x40000;
            object4.al = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10063)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (kdm)((hwp)object5).b;
            object4.c = 0x80000 | object4.c;
            object4.am = l4;
        }
        if ((l4 = dly.k((HealthStats)object, 10064)) != 0L) {
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object = (kdm)((hwp)object5).b;
            ((kdm)object).c |= 0x100000;
            ((kdm)object).an = l4;
        }
        object5 = (kdm)((hwp)object5).o();
        object = (hwp)((hwv)object5).C(5);
        ((hwp)object).x((hwv)object5);
        DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).h);
        int n2 = 0;
        int n3 = 0;
        while (true) {
            object5 = ((dpi)object2).c;
            int n4 = ((kdm)((hwp)object).b).h.size();
            object5 = ((dpq)object5).a;
            if (n3 >= n4) break;
            object3 = dmb.a;
            object4 = ((hwp)object).ae(n3);
            ((hwp)object).au(n3, ((dmc)object5).b((dmb)((Object)object3), (kdl)object4));
            ++n3;
        }
        DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).i);
        for (n3 = 0; n3 < ((kdm)((hwp)object).b).i.size(); ++n3) {
            object4 = dmb.a;
            object3 = ((hwp)object).af(n3);
            ((hwp)object).av(n3, ((dmc)object5).b((dmb)((Object)object4), (kdl)object3));
        }
        DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).j);
        for (n3 = 0; n3 < ((kdm)((hwp)object).b).j.size(); ++n3) {
            object3 = dmb.a;
            object4 = ((hwp)object).ag(n3);
            ((hwp)object).aw(n3, ((dmc)object5).b((dmb)((Object)object3), (kdl)object4));
        }
        DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).k);
        for (n3 = 0; n3 < ((kdm)((hwp)object).b).k.size(); ++n3) {
            object4 = dmb.a;
            object3 = ((hwp)object).ad(n3);
            ((hwp)object).at(n3, ((dmc)object5).b((dmb)((Object)object4), (kdl)object3));
        }
        DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).l);
        for (n3 = 0; n3 < ((kdm)((hwp)object).b).l.size(); ++n3) {
            object4 = dmb.b;
            object3 = ((hwp)object).ac(n3);
            ((hwp)object).as(n3, ((dmc)object5).b((dmb)((Object)object4), (kdl)object3));
        }
        DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).m);
        for (n3 = 0; n3 < ((kdm)((hwp)object).b).m.size(); ++n3) {
            object3 = dmb.c;
            object4 = ((hwp)object).aa(n3);
            ((hwp)object).aq(n3, ((dmc)object5).b((dmb)((Object)object3), (kdl)object4));
        }
        DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).o);
        for (n3 = n2; n3 < ((kdm)((hwp)object).b).o.size(); ++n3) {
            object4 = dmb.e;
            object3 = ((hwp)object).ab(n3);
            ((hwp)object).ar(n3, ((dmc)object5).b((dmb)((Object)object4), (kdl)object3));
        }
        object = (kdm)((hwp)object).o();
        object2 = ((dpi)object2).b;
        if (object2 != null) {
            l5 = ((String)object2).hashCode();
        }
        return new dmk((kdm)object, l2, l3, 680716794L, l5, kdc2, null, null, null);
    }

    public static dlv y(gto gto2, jnu jnu2) {
        return (dlv)((jnu)gto2.e(jnu2)).b();
    }

    public static /* synthetic */ String z(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return "INVALID_PAYLOAD";
                }
                return "INVALID_ENCODING";
            }
            return "UNKNOWN_OPTION";
        }
        return "MALFORMED";
    }
}

