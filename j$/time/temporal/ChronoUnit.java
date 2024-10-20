/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.Duration;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.k;

public final class ChronoUnit
extends Enum<ChronoUnit>
implements TemporalUnit {
    public static final /* enum */ ChronoUnit CENTURIES;
    public static final /* enum */ ChronoUnit DAYS;
    public static final /* enum */ ChronoUnit DECADES;
    public static final /* enum */ ChronoUnit ERAS;
    public static final /* enum */ ChronoUnit FOREVER;
    public static final /* enum */ ChronoUnit HALF_DAYS;
    public static final /* enum */ ChronoUnit HOURS;
    public static final /* enum */ ChronoUnit MICROS;
    public static final /* enum */ ChronoUnit MILLENNIA;
    public static final /* enum */ ChronoUnit MILLIS;
    public static final /* enum */ ChronoUnit MINUTES;
    public static final /* enum */ ChronoUnit MONTHS;
    public static final /* enum */ ChronoUnit NANOS;
    public static final /* enum */ ChronoUnit SECONDS;
    public static final /* enum */ ChronoUnit WEEKS;
    public static final /* enum */ ChronoUnit YEARS;
    private static final ChronoUnit[] c;
    private final String a;
    private final Duration b;

    static {
        ChronoUnit chronoUnit;
        ChronoUnit chronoUnit2;
        ChronoUnit chronoUnit3;
        ChronoUnit chronoUnit4;
        ChronoUnit chronoUnit5;
        ChronoUnit chronoUnit6;
        ChronoUnit chronoUnit7;
        ChronoUnit chronoUnit8;
        ChronoUnit chronoUnit9;
        ChronoUnit chronoUnit10;
        ChronoUnit chronoUnit11;
        ChronoUnit chronoUnit12;
        ChronoUnit chronoUnit13;
        ChronoUnit chronoUnit14;
        ChronoUnit chronoUnit15;
        ChronoUnit chronoUnit16;
        NANOS = chronoUnit16 = new ChronoUnit("Nanos", Duration.ofNanos(1L));
        MICROS = chronoUnit15 = new ChronoUnit("Micros", Duration.ofNanos(1000L));
        MILLIS = chronoUnit14 = new ChronoUnit("Millis", Duration.ofNanos(1000000L));
        SECONDS = chronoUnit13 = new ChronoUnit("Seconds", Duration.ofSeconds(1L));
        MINUTES = chronoUnit12 = new ChronoUnit("Minutes", Duration.ofSeconds(60L));
        HOURS = chronoUnit11 = new ChronoUnit("Hours", Duration.ofSeconds(3600L));
        HALF_DAYS = chronoUnit10 = new ChronoUnit("HalfDays", Duration.ofSeconds(43200L));
        DAYS = chronoUnit9 = new ChronoUnit("Days", Duration.ofSeconds(86400L));
        WEEKS = chronoUnit8 = new ChronoUnit("Weeks", Duration.ofSeconds(604800L));
        MONTHS = chronoUnit7 = new ChronoUnit("Months", Duration.ofSeconds(2629746L));
        YEARS = chronoUnit6 = new ChronoUnit("Years", Duration.ofSeconds(31556952L));
        DECADES = chronoUnit5 = new ChronoUnit("Decades", Duration.ofSeconds(315569520L));
        CENTURIES = chronoUnit4 = new ChronoUnit("Centuries", Duration.ofSeconds(3155695200L));
        MILLENNIA = chronoUnit3 = new ChronoUnit("Millennia", Duration.ofSeconds(31556952000L));
        ERAS = chronoUnit2 = new ChronoUnit("Eras", Duration.ofSeconds(31556952000000000L));
        FOREVER = chronoUnit = new ChronoUnit("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999L));
        c = new ChronoUnit[]{chronoUnit16, chronoUnit15, chronoUnit14, chronoUnit13, chronoUnit12, chronoUnit11, chronoUnit10, chronoUnit9, chronoUnit8, chronoUnit7, chronoUnit6, chronoUnit5, chronoUnit4, chronoUnit3, chronoUnit2, chronoUnit};
    }

    private ChronoUnit(String string2, Duration duration) {
        this.a = string2;
        this.b = duration;
    }

    public static ChronoUnit valueOf(String string) {
        return Enum.valueOf(ChronoUnit.class, string);
    }

    public static ChronoUnit[] values() {
        return (ChronoUnit[])c.clone();
    }

    @Override
    public final Duration g() {
        return this.b;
    }

    @Override
    public final k m(k k2, long l2) {
        return k2.f(l2, this);
    }

    public final String toString() {
        return this.a;
    }
}

