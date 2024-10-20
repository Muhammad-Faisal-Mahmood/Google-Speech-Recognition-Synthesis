/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.t;

public final class a
extends Enum
implements p {
    public static final /* enum */ a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final /* enum */ a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final /* enum */ a ALIGNED_WEEK_OF_MONTH;
    public static final /* enum */ a ALIGNED_WEEK_OF_YEAR;
    public static final /* enum */ a AMPM_OF_DAY;
    public static final /* enum */ a CLOCK_HOUR_OF_AMPM;
    public static final /* enum */ a CLOCK_HOUR_OF_DAY;
    public static final /* enum */ a DAY_OF_MONTH;
    public static final /* enum */ a DAY_OF_WEEK;
    public static final /* enum */ a DAY_OF_YEAR;
    public static final /* enum */ a EPOCH_DAY;
    public static final /* enum */ a ERA;
    public static final /* enum */ a HOUR_OF_AMPM;
    public static final /* enum */ a HOUR_OF_DAY;
    public static final /* enum */ a INSTANT_SECONDS;
    public static final /* enum */ a MICRO_OF_DAY;
    public static final /* enum */ a MICRO_OF_SECOND;
    public static final /* enum */ a MILLI_OF_DAY;
    public static final /* enum */ a MILLI_OF_SECOND;
    public static final /* enum */ a MINUTE_OF_DAY;
    public static final /* enum */ a MINUTE_OF_HOUR;
    public static final /* enum */ a MONTH_OF_YEAR;
    public static final /* enum */ a NANO_OF_DAY;
    public static final /* enum */ a NANO_OF_SECOND;
    public static final /* enum */ a OFFSET_SECONDS;
    public static final /* enum */ a PROLEPTIC_MONTH;
    public static final /* enum */ a SECOND_OF_DAY;
    public static final /* enum */ a SECOND_OF_MINUTE;
    public static final /* enum */ a YEAR;
    public static final /* enum */ a YEAR_OF_ERA;
    private static final a[] c;
    private final String a;
    private final t b;

    static {
        a a2;
        a a3;
        a a4;
        a a5;
        a a6;
        a a7;
        a a8;
        a a9;
        a a10;
        a a11;
        a a12;
        a a13;
        a a14;
        a a15;
        a a16;
        a a17;
        a a18;
        a a19;
        a a20;
        Enum enum_ = ChronoUnit.NANOS;
        Enum enum_2 = ChronoUnit.SECONDS;
        NANO_OF_SECOND = a20 = new a("NANO_OF_SECOND", 0, "NanoOfSecond", enum_, enum_2, t.j(0L, 999999999L));
        Enum enum_3 = ChronoUnit.DAYS;
        NANO_OF_DAY = a19 = new a("NANO_OF_DAY", 1, "NanoOfDay", enum_, enum_3, t.j(0L, 86399999999999L));
        Enum enum_4 = ChronoUnit.MICROS;
        enum_ = new a("MICRO_OF_SECOND", 2, "MicroOfSecond", enum_4, enum_2, t.j(0L, 999999L));
        MICRO_OF_SECOND = enum_;
        enum_4 = new a("MICRO_OF_DAY", 3, "MicroOfDay", enum_4, enum_3, t.j(0L, 86399999999L));
        MICRO_OF_DAY = enum_4;
        Enum enum_5 = ChronoUnit.MILLIS;
        MILLI_OF_SECOND = a18 = new a("MILLI_OF_SECOND", 4, "MilliOfSecond", enum_5, enum_2, t.j(0L, 999L));
        MILLI_OF_DAY = a17 = new a("MILLI_OF_DAY", 5, "MilliOfDay", enum_5, enum_3, t.j(0L, 86399999L));
        Enum enum_6 = ChronoUnit.MINUTES;
        enum_5 = new a("SECOND_OF_MINUTE", 6, "SecondOfMinute", enum_2, enum_6, t.j(0L, 59L), 0);
        SECOND_OF_MINUTE = enum_5;
        SECOND_OF_DAY = a16 = new a("SECOND_OF_DAY", 7, "SecondOfDay", enum_2, enum_3, t.j(0L, 86399L));
        Enum enum_7 = ChronoUnit.HOURS;
        MINUTE_OF_HOUR = a15 = new a("MINUTE_OF_HOUR", 8, "MinuteOfHour", enum_6, enum_7, t.j(0L, 59L), 0);
        MINUTE_OF_DAY = a14 = new a("MINUTE_OF_DAY", 9, "MinuteOfDay", enum_6, enum_3, t.j(0L, 1439L));
        Enum enum_8 = ChronoUnit.HALF_DAYS;
        enum_6 = new a("HOUR_OF_AMPM", 10, "HourOfAmPm", enum_7, enum_8, t.j(0L, 11L));
        HOUR_OF_AMPM = enum_6;
        CLOCK_HOUR_OF_AMPM = a13 = new a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", enum_7, enum_8, t.j(1L, 12L));
        HOUR_OF_DAY = a12 = new a("HOUR_OF_DAY", 12, "HourOfDay", enum_7, enum_3, t.j(0L, 23L), 0);
        enum_7 = new a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", enum_7, enum_3, t.j(1L, 24L));
        CLOCK_HOUR_OF_DAY = enum_7;
        AMPM_OF_DAY = a11 = new a("AMPM_OF_DAY", 14, "AmPmOfDay", enum_8, enum_3, t.j(0L, 1L), 0);
        Enum enum_9 = ChronoUnit.WEEKS;
        DAY_OF_WEEK = a10 = new a("DAY_OF_WEEK", 15, "DayOfWeek", enum_3, enum_9, t.j(1L, 7L), 0);
        ALIGNED_DAY_OF_WEEK_IN_MONTH = a9 = new a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", enum_3, enum_9, t.j(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = a8 = new a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", enum_3, enum_9, t.j(1L, 7L));
        Enum enum_10 = ChronoUnit.MONTHS;
        DAY_OF_MONTH = a7 = new a("DAY_OF_MONTH", 18, "DayOfMonth", enum_3, enum_10, t.k(1L, 28L, 31L), 0);
        Enum enum_11 = ChronoUnit.YEARS;
        enum_8 = new a("DAY_OF_YEAR", 19, "DayOfYear", enum_3, enum_11, t.k(1L, 365L, 366L));
        DAY_OF_YEAR = enum_8;
        ChronoUnit chronoUnit = ChronoUnit.FOREVER;
        EPOCH_DAY = a6 = new a("EPOCH_DAY", 20, "EpochDay", enum_3, chronoUnit, t.j(-365243219162L, 365241780471L));
        enum_3 = new a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", enum_9, enum_10, t.k(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enum_3;
        ALIGNED_WEEK_OF_YEAR = a5 = new a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", enum_9, enum_11, t.j(1L, 53L));
        enum_9 = new a("MONTH_OF_YEAR", 23, "MonthOfYear", enum_10, enum_11, t.j(1L, 12L), 0);
        MONTH_OF_YEAR = enum_9;
        enum_10 = new a("PROLEPTIC_MONTH", 24, "ProlepticMonth", enum_10, chronoUnit, t.j(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enum_10;
        YEAR_OF_ERA = a4 = new a("YEAR_OF_ERA", 25, "YearOfEra", enum_11, chronoUnit, t.k(1L, 999999999L, 1000000000L));
        YEAR = a3 = new a("YEAR", 26, "Year", enum_11, chronoUnit, t.j(-999999999L, 999999999L), 0);
        enum_11 = new a("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit, t.j(0L, 1L), 0);
        ERA = enum_11;
        INSTANT_SECONDS = a2 = new a("INSTANT_SECONDS", 28, "InstantSeconds", enum_2, chronoUnit, t.j(Long.MIN_VALUE, Long.MAX_VALUE));
        enum_2 = new a("OFFSET_SECONDS", 29, "OffsetSeconds", enum_2, chronoUnit, t.j(-64800L, 64800L));
        OFFSET_SECONDS = enum_2;
        c = new a[]{a20, a19, enum_, enum_4, a18, a17, enum_5, a16, a15, a14, enum_6, a13, a12, enum_7, a11, a10, a9, a8, a7, enum_8, a6, enum_3, a5, enum_9, enum_10, a4, a3, enum_11, a2, enum_2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a(ChronoUnit chronoUnit2, t t2) {
        void var6_-1;
        void var1_-1;
        this.a = chronoUnit2;
        this.b = var6_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a(ChronoUnit chronoUnit2, t t2, int n2) {
        void var6_5;
        void var1_-1;
        this.a = chronoUnit2;
        this.b = var6_5;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])c.clone();
    }

    @Override
    public final boolean B() {
        boolean bl2 = this.ordinal() >= DAY_OF_WEEK.ordinal() && this.ordinal() <= ERA.ordinal();
        return bl2;
    }

    public final int F(long l2) {
        return this.b.a(l2, this);
    }

    public final void I(long l2) {
        this.b.b(l2, this);
    }

    public final boolean J() {
        boolean bl2 = this.ordinal() < DAY_OF_WEEK.ordinal();
        return bl2;
    }

    @Override
    public final long g(m m2) {
        return m2.B(this);
    }

    @Override
    public final t m() {
        return this.b;
    }

    @Override
    public final boolean p(m m2) {
        return m2.e(this);
    }

    @Override
    public final k s(k k2, long l2) {
        return k2.d(l2, this);
    }

    @Override
    public final t t(m m2) {
        return m2.t(this);
    }

    public final String toString() {
        return this.a;
    }
}

