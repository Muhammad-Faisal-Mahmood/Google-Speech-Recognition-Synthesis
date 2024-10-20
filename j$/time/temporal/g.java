/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.nio.file.attribute.a;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.h;
import j$.time.temporal.k;
import j$.time.temporal.p;

final class g
extends Enum
implements TemporalUnit {
    public static final /* enum */ g QUARTER_YEARS;
    public static final /* enum */ g WEEK_BASED_YEARS;
    private static final g[] c;
    private final String a;
    private final Duration b;

    static {
        g g2;
        g g3;
        WEEK_BASED_YEARS = g3 = new g("WEEK_BASED_YEARS", 0, "WeekBasedYears", Duration.ofSeconds(31556952L));
        QUARTER_YEARS = g2 = new g("QUARTER_YEARS", 1, "QuarterYears", Duration.ofSeconds(7889238L));
        c = new g[]{g3, g2};
    }

    /*
     * WARNING - void declaration
     */
    private g() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
        this.b = var4_1;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static g[] values() {
        return (g[])c.clone();
    }

    @Override
    public final Duration g() {
        return this.b;
    }

    @Override
    public final k m(k k2, long l2) {
        int n2 = this.ordinal();
        if (n2 != 0) {
            if (n2 == 1) {
                return k2.f(l2 / 4L, ChronoUnit.YEARS).f(l2 % 4L * 3L, ChronoUnit.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }
        p p2 = h.c;
        return k2.d(j$.nio.file.attribute.a.i(k2.p(p2), l2), p2);
    }

    public final String toString() {
        return this.a;
    }
}

