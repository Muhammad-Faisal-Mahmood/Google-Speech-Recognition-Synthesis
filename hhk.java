/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class hhk {
    public hhk() {
    }

    public hhk(char[] cArray) {
    }

    public static void A(Object object, int n2) {
        if (object != null) {
            return;
        }
        throw new NullPointerException(a.af(n2, "at index "));
    }

    public static void B(Object ... objectArray) {
        hhk.C(objectArray, objectArray.length);
    }

    public static void C(Object[] objectArray, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            hhk.A(objectArray[i2], i2);
        }
    }

    public static void D(Throwable throwable) {
        if (throwable instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static hpq E(ExecutorService executorService) {
        executorService = executorService instanceof hpq ? (hpq)executorService : (executorService instanceof ScheduledExecutorService ? new hpv((ScheduledExecutorService)executorService) : new hps(executorService));
        return executorService;
    }

    public static hpr F(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService = scheduledExecutorService instanceof hpr ? (hpr)scheduledExecutorService : new hpv(scheduledExecutorService);
        return scheduledExecutorService;
    }

    public static Executor G(Executor executor, hnk hnk2) {
        fxf.K(executor);
        if (executor == hom.a) {
            return executor;
        }
        return new gaj((Object)executor, hnk2, 4);
    }

    public static hpn H(Iterable iterable) {
        return new hoh(gzx.n(iterable), true);
    }

    public static hpn I() {
        hpi hpi2 = hpi.a;
        if (hpi2 != null) {
            return hpi2;
        }
        return new hpi();
    }

    public static hpn J(Throwable throwable) {
        fxf.K(throwable);
        return new hqa(throwable);
    }

    public static hpn K(Object object) {
        if (object == null) {
            return hpj.a;
        }
        return new hpj(object);
    }

    public static hpn L(hpn hpn2) {
        if (hpn2.isDone()) {
            return hpn2;
        }
        hpg hpg2 = new hpg(hpn2);
        hpn2.c(hpg2, (Executor)hom.a);
        return hpg2;
    }

    public static hpn M(hnx object, long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        object = new hqh((hnx)object);
        ((hnk)object).c(new gjf(scheduledExecutorService.schedule((Runnable)object, l2, timeUnit), 16), (Executor)hom.a);
        return object;
    }

    public static hpn N(Runnable runnable, Executor executor) {
        runnable = hqh.d(runnable, null);
        executor.execute(runnable);
        return runnable;
    }

    public static hpn O(Callable object, Executor executor) {
        object = new hqh((Callable)object);
        executor.execute((Runnable)object);
        return object;
    }

    public static hpn P(hnx object, Executor executor) {
        object = new hqh((hnx)object);
        executor.execute((Runnable)object);
        return object;
    }

    public static hpn Q(Iterable iterable) {
        return new hoh(gzx.n(iterable), false);
    }

    public static hpn R(hpn hpn2, long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (hpn2.isDone()) {
            return hpn2;
        }
        hqe hqe2 = new hqe(hpn2);
        hqc hqc2 = new hqc(hqe2);
        hqe2.b = scheduledExecutorService.schedule(hqc2, l2, timeUnit);
        hpn2.c(hqc2, (Executor)hom.a);
        return hqe2;
    }

    public static Object S(Future future) {
        fxf.E(future.isDone(), "Future was expected to be done: %s", future);
        return a.h(future);
    }

    public static void T(hpn hpn2, hpb hpb2, Executor executor) {
        fxf.K(hpb2);
        hpn2.c(new hpc(hpn2, hpb2), executor);
    }

    public static void U(hpn hpn2, Future future) {
        if (hpn2 instanceof hnk) {
            ((hnk)hpn2).l(future);
            return;
        }
        if (hpn2 != null && hpn2.isCancelled() && future != null) {
            future.cancel(false);
        }
    }

    public static void V(hpn hpn2, Future future) {
        fxf.K(hpn2);
        if (!future.isDone()) {
            if (hpn2.isDone()) {
                hhk.U(hpn2, future);
                return;
            }
            hpd hpd2 = new hpd(hpn2, future, 0);
            hpn2.c(hpd2, (Executor)hom.a);
            if (future instanceof hpn) {
                future.c(hpd2, (Executor)hom.a);
            }
        }
    }

    public static Duration W(long l2) {
        Duration duration = Duration.ofMillis(l2);
        jse.d(duration, "ofMillis(...)");
        return duration;
    }

    public static Duration X() {
        Duration duration = Duration.ofMinutes(10L);
        jse.d(duration, "ofMinutes(...)");
        return duration;
    }

    public static iuv Y(Iterable iterable) {
        return new iuv(false, gzx.n(iterable));
    }

    @SafeVarargs
    public static iuv Z(hpn ... hpnArray) {
        return new iuv(false, gzx.p(hpnArray));
    }

    public static int aA(int n2) {
        if (n2 != 1) {
            return n2 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static iuv aa(Iterable iterable) {
        return new iuv(true, gzx.n(iterable));
    }

    @SafeVarargs
    public static iuv ab(hpn ... hpnArray) {
        return new iuv(true, gzx.p(hpnArray));
    }

    public static byte ac(long l2) {
        boolean bl2 = l2 >> 8 == 0L;
        fxf.u(bl2, "out of range: %s", l2);
        return (byte)l2;
    }

    public static int ad(byte by2) {
        return by2 & 0xFF;
    }

    public static int ae(long l2) {
        int n2 = (int)l2;
        boolean bl2 = (long)n2 == l2;
        fxf.u(bl2, "Out of range: %s", l2);
        return n2;
    }

    public static int af(int ... nArray) {
        fxf.q(true);
        int n2 = nArray[0];
        for (int i2 = 1; i2 < 3; ++i2) {
            int n3 = nArray[i2];
            int n4 = n2;
            if (n3 < n2) {
                n4 = n3;
            }
            n2 = n4;
        }
        return n2;
    }

    public static int ag(long l2) {
        if (l2 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)l2;
    }

    public static int[] ah(Collection object) {
        if (!(object instanceof hmo)) {
            Object[] objectArray = object.toArray();
            int n2 = objectArray.length;
            int[] nArray = new int[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                object = objectArray[i2];
                fxf.K(object);
                nArray[i2] = ((Number)object).intValue();
            }
            return nArray;
        }
        object = (hmo)object;
        throw null;
    }

    public static int ai(int n2, int n3) {
        fxf.w(true, "min (%s) must be less than or equal to max (%s)", n3, 0x3FFFFFFF);
        return Math.min(Math.max(n2, n3), 0x3FFFFFFF);
    }

    public static int aj(float[] fArray, float f2, int n2, int n3) {
        while (n2 < n3) {
            if (fArray[n2] == f2) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static float[] ak(Collection objectArray) {
        objectArray = objectArray.toArray();
        int n2 = objectArray.length;
        float[] fArray = new float[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectArray[i2];
            fxf.K(object);
            fArray[i2] = ((Number)object).floatValue();
        }
        return fArray;
    }

    public static void al(boolean bl2, String string, long l2, long l3) {
        if (bl2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("overflow: ");
        stringBuilder.append(string);
        stringBuilder.append("(");
        stringBuilder.append(l2);
        stringBuilder.append(", ");
        stringBuilder.append(l3);
        stringBuilder.append(")");
        throw new ArithmeticException(stringBuilder.toString());
    }

    public static void am(boolean bl2) {
        if (bl2) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }

    public static void an(String string, long l2) {
        if (l2 >= 0L) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" (");
        stringBuilder.append(l2);
        stringBuilder.append(") must be >= 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int ao(long l2, int n2) {
        long l3 = n2;
        if ((l2 %= l3) < 0L) {
            l2 += l3;
        }
        return (int)l2;
    }

    public static long ap(long l2, long l3) {
        boolean bl2 = true;
        boolean bl3 = (l2 ^ l3) < 0L;
        long l4 = l2 + l3;
        if ((l2 ^ l4) < 0L) {
            bl2 = false;
        }
        hhk.al(bl3 | bl2, "checkedAdd", l2, l3);
        return l4;
    }

    public static long aq(long l2, long l3) {
        int n2 = Long.numberOfLeadingZeros(l2) + Long.numberOfLeadingZeros(l2 ^ 0xFFFFFFFFFFFFFFFFL) + Long.numberOfLeadingZeros(l3) + Long.numberOfLeadingZeros(l3 ^ 0xFFFFFFFFFFFFFFFFL);
        long l4 = l2 * l3;
        if (n2 > 65) {
            return l4;
        }
        boolean bl2 = n2 >= 64;
        hhk.al(bl2, "checkedMultiply", l2, l3);
        hhk.al(true, "checkedMultiply", l2, l3);
        bl2 = l2 == 0L || l4 / l2 == l3;
        hhk.al(bl2, "checkedMultiply", l2, l3);
        return l4;
    }

    public static long ar(long l2, long l3) {
        boolean bl2 = true;
        boolean bl3 = (l2 ^ l3) >= 0L;
        long l4 = l2 - l3;
        if ((l2 ^ l4) < 0L) {
            bl2 = false;
        }
        hhk.al(bl3 | bl2, "checkedSubtract", l2, l3);
        return l4;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static long as(long l2, long l3, RoundingMode roundingMode) {
        fxf.K((Object)roundingMode);
        long l4 = l2 / l3;
        long l5 = l2 - l3 * l4;
        if (l5 == 0L) {
            return l4;
        }
        int n2 = hml.a[roundingMode.ordinal()];
        int n3 = (int)((l2 ^ l3) >> 63) | 1;
        int n4 = 0;
        block8: do {
            switch (n4 == 0 ? n2 : n4) {
                default: {
                    throw new AssertionError();
                }
                case 6: 
                case 7: 
                case 8: {
                    l2 = Math.abs(l5);
                    long l6 = l2 - (Math.abs(l3) - l2) - 0L;
                    n2 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                    if (n2 == 0) {
                        if (roundingMode == RoundingMode.HALF_UP) return l4 + (long)n3;
                        if (roundingMode != RoundingMode.HALF_EVEN) return l4;
                        if ((1L & l4) == 0L) return l4;
                        n4 = 4;
                        continue block8;
                    }
                    if (n2 <= 0) return l4;
                    n4 = 4;
                    continue block8;
                }
                case 5: {
                    if (n3 <= 0) return l4;
                    n4 = 4;
                    continue block8;
                }
                case 3: {
                    if (n3 >= 0) return l4;
                }
                case 4: {
                    return l4 + (long)n3;
                }
                case 1: {
                    hhk.am(false);
                    return l4;
                }
                case 2: 
            }
            return l4;
        } while (true);
        return l4;
    }

    public static long at(long l2, long l3) {
        hhk.an("a", l2);
        hhk.an("b", l3);
        if (l2 == 0L) {
            return l3;
        }
        if (l3 == 0L) {
            return l2;
        }
        int n2 = Long.numberOfTrailingZeros(l2);
        long l4 = l2 >> n2;
        int n3 = Long.numberOfTrailingZeros(l3);
        l2 = l3 >> n3;
        for (l3 = l4; l3 != l2; l3 >>= Long.numberOfTrailingZeros(l3), l2 += l4) {
            l4 = (l3 -= l2) >> 63 & l3;
            l3 = l3 - l4 - l4;
        }
        return l3 << Math.min(n2, n3);
    }

    public static long au(long l2, long l3) {
        int n2 = Long.numberOfLeadingZeros(l2) + Long.numberOfLeadingZeros(l2 ^ 0xFFFFFFFFFFFFFFFFL) + Long.numberOfLeadingZeros(l3) + Long.numberOfLeadingZeros(l3 ^ 0xFFFFFFFFFFFFFFFFL);
        if (n2 > 65) {
            return l2 * l3;
        }
        int n3 = 1;
        n2 = n2 < 64 ? 1 : 0;
        long l4 = l2 - 0L;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        int n4 = l5 < 0 ? 1 : 0;
        if (l3 != Long.MIN_VALUE) {
            n3 = 0;
        }
        long l6 = ((l2 ^ l3) >>> 63) + Long.MAX_VALUE;
        if ((n2 | n3 & n4) != 0) {
            return l6;
        }
        long l7 = l2 * l3;
        if (l5 != false && l7 / l2 != l3) {
            return l6;
        }
        return l7;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static int av(int n2, int n3, RoundingMode roundingMode) {
        fxf.K((Object)roundingMode);
        if (n3 == 0) throw new ArithmeticException("/ by zero");
        int n4 = n2 / n3;
        int n5 = n2 - n3 * n4;
        if (n5 == 0) {
            return n4;
        }
        int n6 = hmk.a[roundingMode.ordinal()];
        int n7 = 1;
        int n8 = (n2 ^ n3) >> 31 | 1;
        int n9 = 0;
        block8: do {
            switch (n9 == 0 ? n6 : n9) {
                default: {
                    throw new AssertionError();
                }
                case 6: 
                case 7: 
                case 8: {
                    n2 = Math.abs(n5);
                    n2 -= Math.abs(n3) - n2;
                    if (n2 == 0) {
                        if (roundingMode == RoundingMode.HALF_UP) return n4 + n8;
                        n2 = roundingMode == RoundingMode.HALF_EVEN ? n7 : 0;
                        if ((n4 & 1 & n2) == 0) return n4;
                        n9 = 4;
                        continue block8;
                    }
                    if (n2 <= 0) return n4;
                    n9 = 4;
                    continue block8;
                }
                case 5: {
                    if (n8 <= 0) return n4;
                    n9 = 4;
                    continue block8;
                }
                case 3: {
                    if (n8 >= 0) return n4;
                }
                case 4: {
                    return n4 + n8;
                }
                case 1: {
                    hhk.am(false);
                    return n4;
                }
                case 2: 
            }
            return n4;
        } while (true);
        return n4;
    }

    public static int aw(int n2, int n3) {
        return hhk.ag((long)n2 + (long)n3);
    }

    public static boolean ax(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static hwp ay(Throwable object) {
        hwp hwp2 = hln.a.l();
        hyg hyg2 = hll.a.l();
        Object object2 = object.getClass().getName();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        Object object3 = (hll)((hwp)hyg2).b;
        object2.getClass();
        ((hll)object3).b |= 1;
        ((hll)object3).c = object2;
        if (object.getMessage() != null) {
            object2 = object.getMessage();
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object3 = (hll)((hwp)hyg2).b;
            object2.getClass();
            ((hll)object3).b |= 2;
            ((hll)object3).d = object2;
        }
        try {
            object = object.getStackTrace();
        }
        catch (NullPointerException nullPointerException) {
            object = null;
        }
        if (object != null) {
            for (int i2 = 0; i2 < ((StackTraceElement[])object).length; ++i2) {
                Object object4;
                object3 = object[i2];
                object2 = hlk.a.l();
                if (object3 != null) {
                    Object object5 = ((StackTraceElement)object3).getClassName();
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object4 = (hlk)((hwp)object2).b;
                    object5.getClass();
                    ((hlk)object4).b |= 1;
                    ((hlk)object4).c = object5;
                    object4 = ((StackTraceElement)object3).getMethodName();
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object5 = (hlk)((hwp)object2).b;
                    object4.getClass();
                    ((hlk)object5).b |= 2;
                    ((hlk)object5).d = object4;
                    int n2 = ((StackTraceElement)object3).getLineNumber();
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object4 = (hlk)((hwp)object2).b;
                    ((hlk)object4).b |= 8;
                    ((hlk)object4).f = n2;
                    if (((StackTraceElement)object3).getFileName() != null) {
                        object3 = ((StackTraceElement)object3).getFileName();
                        if (!((hwp)object2).b.B()) {
                            ((hwp)object2).u();
                        }
                        object4 = (hlk)((hwp)object2).b;
                        object3.getClass();
                        ((hlk)object4).b |= 4;
                        ((hlk)object4).e = object3;
                    }
                }
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                object3 = (hll)((hwp)hyg2).b;
                object2 = (hlk)((hwp)object2).o();
                object2.getClass();
                object4 = ((hll)object3).f;
                if (!object4.c()) {
                    ((hll)object3).f = hwv.s((hxk)object4);
                }
                ((hll)object3).f.add(object2);
            }
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (hln)hwp2.b;
        hyg2 = (hll)((hwp)hyg2).o();
        hyg2.getClass();
        object.c = hyg2;
        object.b |= 1;
        return hwp2;
    }

    public static int az(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 200) {
                        if (n2 != 4000) {
                            switch (n2) {
                                default: {
                                    switch (n2) {
                                        default: {
                                            switch (n2) {
                                                default: {
                                                    switch (n2) {
                                                        default: {
                                                            switch (n2) {
                                                                default: {
                                                                    switch (n2) {
                                                                        default: {
                                                                            switch (n2) {
                                                                                default: {
                                                                                    switch (n2) {
                                                                                        default: {
                                                                                            return 0;
                                                                                        }
                                                                                        case 4106: {
                                                                                            return 4108;
                                                                                        }
                                                                                        case 4105: {
                                                                                            return 4107;
                                                                                        }
                                                                                        case 4104: {
                                                                                            return 4106;
                                                                                        }
                                                                                        case 4103: {
                                                                                            return 4105;
                                                                                        }
                                                                                        case 4102: {
                                                                                            return 4104;
                                                                                        }
                                                                                        case 4101: {
                                                                                            return 4103;
                                                                                        }
                                                                                        case 4100: 
                                                                                    }
                                                                                    return 4102;
                                                                                }
                                                                                case 3004: {
                                                                                    return 3006;
                                                                                }
                                                                                case 3003: {
                                                                                    return 3005;
                                                                                }
                                                                                case 3002: {
                                                                                    return 3004;
                                                                                }
                                                                                case 3001: {
                                                                                    return 3003;
                                                                                }
                                                                                case 3000: 
                                                                            }
                                                                            return 3002;
                                                                        }
                                                                        case 2014: {
                                                                            return 2016;
                                                                        }
                                                                        case 2013: {
                                                                            return 2015;
                                                                        }
                                                                        case 2012: {
                                                                            return 2014;
                                                                        }
                                                                        case 2011: {
                                                                            return 2013;
                                                                        }
                                                                        case 2010: {
                                                                            return 2012;
                                                                        }
                                                                        case 2009: {
                                                                            return 2011;
                                                                        }
                                                                        case 2008: {
                                                                            return 2010;
                                                                        }
                                                                        case 2007: {
                                                                            return 2009;
                                                                        }
                                                                        case 2006: {
                                                                            return 2008;
                                                                        }
                                                                        case 2005: {
                                                                            return 2007;
                                                                        }
                                                                        case 2004: {
                                                                            return 2006;
                                                                        }
                                                                        case 2003: {
                                                                            return 2005;
                                                                        }
                                                                        case 2002: {
                                                                            return 2004;
                                                                        }
                                                                        case 2001: {
                                                                            return 2003;
                                                                        }
                                                                        case 2000: 
                                                                    }
                                                                    return 2002;
                                                                }
                                                                case 1011: {
                                                                    return 1013;
                                                                }
                                                                case 1010: {
                                                                    return 1012;
                                                                }
                                                                case 1009: {
                                                                    return 1011;
                                                                }
                                                                case 1008: {
                                                                    return 1010;
                                                                }
                                                                case 1007: {
                                                                    return 1009;
                                                                }
                                                                case 1006: {
                                                                    return 1008;
                                                                }
                                                                case 1005: {
                                                                    return 1007;
                                                                }
                                                                case 1004: {
                                                                    return 1006;
                                                                }
                                                                case 1003: {
                                                                    return 1005;
                                                                }
                                                                case 1002: {
                                                                    return 1004;
                                                                }
                                                                case 1001: {
                                                                    return 1003;
                                                                }
                                                                case 1000: 
                                                            }
                                                            return 1002;
                                                        }
                                                        case 506: {
                                                            return 508;
                                                        }
                                                        case 505: {
                                                            return 507;
                                                        }
                                                        case 504: {
                                                            return 506;
                                                        }
                                                        case 503: {
                                                            return 505;
                                                        }
                                                        case 502: {
                                                            return 504;
                                                        }
                                                        case 501: {
                                                            return 503;
                                                        }
                                                        case 500: 
                                                    }
                                                    return 502;
                                                }
                                                case 404: {
                                                    return 406;
                                                }
                                                case 403: {
                                                    return 405;
                                                }
                                                case 402: {
                                                    return 404;
                                                }
                                                case 401: {
                                                    return 403;
                                                }
                                                case 400: 
                                            }
                                            return 402;
                                        }
                                        case 331: {
                                            return 333;
                                        }
                                        case 330: {
                                            return 332;
                                        }
                                        case 329: {
                                            return 331;
                                        }
                                        case 328: {
                                            return 330;
                                        }
                                        case 327: {
                                            return 329;
                                        }
                                        case 326: {
                                            return 328;
                                        }
                                        case 325: {
                                            return 327;
                                        }
                                        case 324: {
                                            return 326;
                                        }
                                        case 323: {
                                            return 325;
                                        }
                                        case 322: {
                                            return 324;
                                        }
                                        case 321: {
                                            return 323;
                                        }
                                        case 320: {
                                            return 322;
                                        }
                                        case 319: {
                                            return 321;
                                        }
                                        case 318: {
                                            return 320;
                                        }
                                        case 317: {
                                            return 319;
                                        }
                                        case 316: {
                                            return 318;
                                        }
                                        case 315: {
                                            return 317;
                                        }
                                        case 314: {
                                            return 316;
                                        }
                                        case 313: {
                                            return 315;
                                        }
                                        case 312: {
                                            return 314;
                                        }
                                        case 311: {
                                            return 313;
                                        }
                                        case 310: {
                                            return 312;
                                        }
                                        case 309: {
                                            return 311;
                                        }
                                        case 308: {
                                            return 310;
                                        }
                                        case 307: {
                                            return 309;
                                        }
                                        case 306: {
                                            return 308;
                                        }
                                        case 305: {
                                            return 307;
                                        }
                                        case 304: {
                                            return 306;
                                        }
                                        case 303: {
                                            return 305;
                                        }
                                        case 302: {
                                            return 304;
                                        }
                                        case 301: {
                                            return 303;
                                        }
                                        case 300: 
                                    }
                                    return 302;
                                }
                                case 111: {
                                    return 113;
                                }
                                case 110: {
                                    return 112;
                                }
                                case 109: {
                                    return 111;
                                }
                                case 108: {
                                    return 110;
                                }
                                case 107: {
                                    return 109;
                                }
                                case 106: {
                                    return 108;
                                }
                                case 105: {
                                    return 107;
                                }
                                case 104: {
                                    return 106;
                                }
                                case 103: {
                                    return 105;
                                }
                                case 102: {
                                    return 104;
                                }
                                case 101: {
                                    return 103;
                                }
                                case 100: 
                            }
                            return 102;
                        }
                        return 4002;
                    }
                    return 202;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    public static int d(Level level) {
        int n2 = level.intValue();
        if (n2 >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (n2 >= Level.WARNING.intValue()) {
            return 5;
        }
        if (n2 >= Level.INFO.intValue()) {
            return 4;
        }
        if (n2 >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }

    public static String e(String string) {
        String string2 = string;
        if (string.length() > 23) {
            int n2;
            block2: {
                int n3 = string.length();
                int n4 = -1;
                --n3;
                while (true) {
                    n2 = n4;
                    if (n3 < 0) break block2;
                    n2 = string.charAt(n3);
                    if (n2 == 46 || n2 == 36) break;
                    --n3;
                }
                n2 = n3;
            }
            string2 = string.substring(n2 + 1);
        }
        string = "".concat(String.valueOf(string2));
        return string.substring(0, Math.min(string.length(), 23));
    }

    public static void f(boolean bl2, String string) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean g(char c2) {
        boolean bl2 = true;
        if (c2 >= 'a') {
            boolean bl3 = bl2;
            if (c2 <= 'z') return bl3;
        }
        if (c2 < 'A') return false;
        if (c2 > 'Z') return false;
        return bl2;
    }

    public static void h(Object object, String string) {
        if (object != null) {
            return;
        }
        throw new NullPointerException(string.concat(" must not be null"));
    }

    public static /* synthetic */ int i(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 7: {
                return 9;
            }
            case 6: {
                return 8;
            }
            case 5: {
                return 7;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 5;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 0: 
        }
        return 2;
    }

    public static /* bridge */ /* synthetic */ Iterable j(Object object) {
        if ((object = (File)object).isDirectory() && (object = object.listFiles()) != null) {
            object = DesugarCollections.unmodifiableList(Arrays.asList(object));
        } else {
            int n2 = gzx.d;
            object = hct.a;
        }
        return object;
    }

    public static Object k(Deque deque) {
        Iterator iterator = (Iterator)deque.getFirst();
        if (iterator.hasNext()) {
            deque = iterator.next();
            fxf.K(deque);
            return deque;
        }
        deque.removeFirst();
        return null;
    }

    public static /* synthetic */ boolean l(int n2, her her2, StringBuilder stringBuilder) {
        if (n2 - 1 != 0) {
            return false;
        }
        if (her2 == her.a) {
            return false;
        }
        stringBuilder.append(her2.b());
        stringBuilder.append('.');
        stringBuilder.append(her2.d());
        stringBuilder.append(':');
        stringBuilder.append(her2.a());
        return true;
    }

    public static boolean m(Comparator comparator, Iterable object) {
        block7: {
            block6: {
                block5: {
                    fxf.K(comparator);
                    fxf.K(object);
                    if (!(object instanceof SortedSet)) break block5;
                    Comparator comparator2 = ((SortedSet)object).comparator();
                    object = comparator2;
                    if (comparator2 == null) {
                        object = hcm.a;
                    }
                    break block6;
                }
                if (!(object instanceof hdr)) break block7;
                object = ((hdr)object).comparator();
            }
            return comparator.equals(object);
        }
        return false;
    }

    public static int n(Set object) {
        object = object.iterator();
        int n2 = 0;
        while (object.hasNext()) {
            Object e2 = object.next();
            int n3 = e2 != null ? e2.hashCode() : 0;
            n2 += n3;
        }
        return n2;
    }

    public static hdp o(Set set, Set set2) {
        a.s(set, "set1");
        a.s(set2, "set2");
        return new hdl(set, set2);
    }

    public static hdp p(Set set, Set set2) {
        a.s(set, "set1");
        a.s(set2, "set2");
        return new hdj(set, set2);
    }

    public static HashSet q(int n2) {
        if (n2 < 3) {
            fvd.al(n2, "expectedSize");
            ++n2;
        } else {
            n2 = n2 < 0x40000000 ? (int)Math.ceil((double)n2 / 0.75) : Integer.MAX_VALUE;
        }
        return new HashSet(n2);
    }

    public static Set r(Set set, gtq gtq2) {
        if (set instanceof SortedSet) {
            if ((set = (SortedSet)set) instanceof hdm) {
                set = (hdm)set;
                gtq2 = fvd.ar(((hdm)set).b, gtq2);
                set = new hdn((SortedSet)((hdm)set).a, gtq2);
            } else {
                fxf.K(set);
                set = new hdn((SortedSet)set, gtq2);
            }
            return set;
        }
        if (set instanceof hdm) {
            set = (hdm)set;
            gtq2 = fvd.ar(((hdm)set).b, gtq2);
            return new hdm((Set)((hdm)set).a, gtq2);
        }
        fxf.K(set);
        return new hdm(set, gtq2);
    }

    public static Set s() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set t() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean u(Set set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            if (set.size() != object.size()) return false;
            boolean bl2 = set.containsAll((Collection<?>)object);
            if (!bl2) return false;
            return true;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public static boolean v(Set object, Collection collection) {
        fxf.K(collection);
        Collection collection2 = collection;
        if (collection instanceof hch) {
            collection2 = ((hch)collection).i();
        }
        if (collection2 instanceof Set && collection2.size() > object.size()) {
            object = object.iterator();
            fxf.K(collection2);
            boolean bl2 = false;
            while (object.hasNext()) {
                if (!collection2.contains(object.next())) continue;
                object.remove();
                bl2 = true;
            }
            return bl2;
        }
        return hhk.w((Set)object, collection2.iterator());
    }

    public static boolean w(Set set, Iterator iterator) {
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= set.remove(iterator.next());
        }
        return bl2;
    }

    public static void x(hce hce2, ObjectInputStream objectInputStream, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            Collection collection = hce2.b(objectInputStream.readObject());
            int n3 = objectInputStream.readInt();
            for (int i3 = 0; i3 < n3; ++i3) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static void y(hce object, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(object.o().size());
        for (Map.Entry entry : object.o().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection)entry.getValue()).size());
            Iterator object2 = ((Collection)entry.getValue()).iterator();
            while (object2.hasNext()) {
                objectOutputStream.writeObject(object2.next());
            }
        }
    }

    public static Object[] z(Object[] objectArray, int n2) {
        Object[] objectArray2 = objectArray;
        if (objectArray.length != 0) {
            objectArray2 = Arrays.copyOf(objectArray, 0);
        }
        return Arrays.copyOf(objectArray2, n2);
    }

    public hfz a() {
        return hfy.a;
    }

    public hhr b() {
        return hhr.b;
    }

    public void c(String string, Level level, boolean bl2) {
    }
}

