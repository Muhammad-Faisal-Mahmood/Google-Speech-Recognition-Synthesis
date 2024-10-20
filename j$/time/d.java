/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;

public final class d
extends Enum
implements m,
n {
    public static final /* enum */ d FRIDAY;
    public static final /* enum */ d MONDAY;
    public static final /* enum */ d SATURDAY;
    public static final /* enum */ d SUNDAY;
    public static final /* enum */ d THURSDAY;
    public static final /* enum */ d TUESDAY;
    public static final /* enum */ d WEDNESDAY;
    private static final d[] a;
    private static final d[] b;

    static {
        Enum enum_ = new Enum("MONDAY", 0);
        MONDAY = enum_;
        Enum enum_2 = new Enum("TUESDAY", 1);
        TUESDAY = enum_2;
        Enum enum_3 = new Enum("WEDNESDAY", 2);
        WEDNESDAY = enum_3;
        Enum enum_4 = new Enum("THURSDAY", 3);
        THURSDAY = enum_4;
        Enum enum_5 = new Enum("FRIDAY", 4);
        FRIDAY = enum_5;
        Enum enum_6 = new Enum("SATURDAY", 5);
        SATURDAY = enum_6;
        Enum enum_7 = new Enum("SUNDAY", 6);
        SUNDAY = enum_7;
        b = new d[]{enum_, enum_2, enum_3, enum_4, enum_5, enum_6, enum_7};
        a = d.values();
    }

    public static d I(int n2) {
        if (n2 >= 1 && n2 <= 7) {
            return a[n2 - 1];
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid value for DayOfWeek: ");
        stringBuilder.append(n2);
        throw new RuntimeException(stringBuilder.toString());
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])b.clone();
    }

    @Override
    public final long B(p p2) {
        if (p2 == j$.time.temporal.a.DAY_OF_WEEK) {
            return this.getValue();
        }
        if (!(p2 instanceof a)) {
            return p2.g(this);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
    }

    @Override
    public final Object F(r r2) {
        if (r2 == l.i()) {
            return ChronoUnit.DAYS;
        }
        return l.c(this, r2);
    }

    public final d J(long l2) {
        int n2 = (int)(l2 % 7L);
        int n3 = this.ordinal();
        return a[(n2 + 7 + n3) % 7];
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof a;
        boolean bl3 = false;
        boolean bl4 = false;
        if (bl2) {
            if (p2 == j$.time.temporal.a.DAY_OF_WEEK) {
                bl4 = true;
            }
            return bl4;
        }
        bl4 = bl3;
        if (p2 != null) {
            bl4 = bl3;
            if (p2.p(this)) {
                bl4 = true;
            }
        }
        return bl4;
    }

    @Override
    public final k g(k k2) {
        a a2 = j$.time.temporal.a.DAY_OF_WEEK;
        return k2.d(this.getValue(), a2);
    }

    public final int getValue() {
        return this.ordinal() + 1;
    }

    @Override
    public final int p(p p2) {
        if (p2 == j$.time.temporal.a.DAY_OF_WEEK) {
            return this.getValue();
        }
        return l.a(this, p2);
    }

    @Override
    public final t t(p p2) {
        if (p2 == j$.time.temporal.a.DAY_OF_WEEK) {
            return p2.m();
        }
        return l.d(this, p2);
    }
}

