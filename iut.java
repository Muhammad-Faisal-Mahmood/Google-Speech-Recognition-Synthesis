/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class iut
implements Comparable {
    public static final kmp c;
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public final kmp b;
    private volatile boolean g;

    static {
        long l2;
        c = new kmp();
        d = l2 = TimeUnit.DAYS.toNanos(36500L);
        e = -l2;
        f = TimeUnit.SECONDS.toNanos(1L);
    }

    private iut(kmp kmp2, long l2, long l3) {
        this.b = kmp2;
        l3 = Math.min(d, Math.max(e, l3));
        this.a = l2 + l3;
        boolean bl2 = l3 <= 0L;
        this.g = bl2;
    }

    public static iut c(long l2, TimeUnit timeUnit) {
        return iut.g(l2, timeUnit, c);
    }

    public static iut g(long l2, TimeUnit timeUnit, kmp kmp2) {
        a.s((Object)timeUnit, "units");
        l2 = timeUnit.toNanos(l2);
        return new iut(kmp2, System.nanoTime(), l2);
    }

    public final int a(iut iut2) {
        this.d(iut2);
        long l2 = this.a - iut2.a - 0L;
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (l3 < 0) {
            return -1;
        }
        if (l3 > 0) {
            return 1;
        }
        return 0;
    }

    public final long b(TimeUnit timeUnit) {
        long l2 = System.nanoTime();
        if (!this.g && this.a - l2 <= 0L) {
            this.g = true;
        }
        return timeUnit.convert(this.a - l2, TimeUnit.NANOSECONDS);
    }

    public final void d(iut object) {
        Object object2 = this.b;
        if (object2 == ((iut)object).b) {
            return;
        }
        object2 = object2.toString();
        object = ((iut)object).b.toString();
        StringBuilder stringBuilder = new StringBuilder("Tickers (");
        stringBuilder.append((String)object2);
        stringBuilder.append(" and ");
        stringBuilder.append((String)object);
        stringBuilder.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError((Object)stringBuilder.toString());
    }

    public final boolean e(iut iut2) {
        this.d(iut2);
        return this.a - iut2.a < 0L;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iut)) {
            return false;
        }
        object = (iut)object;
        if (this.b == ((iut)object).b) {
            return this.a == ((iut)object).a;
        }
        return false;
    }

    public final boolean f() {
        if (!this.g) {
            if (this.a - System.nanoTime() <= 0L) {
                this.g = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.asList(this.b, this.a).hashCode();
    }

    public final String toString() {
        long l2 = this.b(TimeUnit.NANOSECONDS);
        long l3 = Math.abs(l2);
        long l4 = f;
        l3 /= l4;
        l4 = Math.abs(l2) % l4;
        StringBuilder stringBuilder = new StringBuilder();
        if (l2 < 0L) {
            stringBuilder.append('-');
        }
        stringBuilder.append(l3);
        if (l4 > 0L) {
            stringBuilder.append(String.format(Locale.US, ".%09d", l4));
        }
        stringBuilder.append("s from now");
        kmp kmp2 = this.b;
        if (kmp2 != c) {
            stringBuilder.append(a.ar(kmp2, " (ticker=", ")"));
        }
        return stringBuilder.toString();
    }
}

