/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.chrono.i_0;
import j$.time.chrono.u;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;

public final class l
extends Enum
implements m,
n {
    public static final /* enum */ l APRIL;
    public static final /* enum */ l AUGUST;
    public static final /* enum */ l DECEMBER;
    public static final /* enum */ l FEBRUARY;
    public static final /* enum */ l JANUARY;
    public static final /* enum */ l JULY;
    public static final /* enum */ l JUNE;
    public static final /* enum */ l MARCH;
    public static final /* enum */ l MAY;
    public static final /* enum */ l NOVEMBER;
    public static final /* enum */ l OCTOBER;
    public static final /* enum */ l SEPTEMBER;
    private static final l[] a;
    private static final l[] b;

    static {
        Enum enum_ = new Enum("JANUARY", 0);
        JANUARY = enum_;
        Enum enum_2 = new Enum("FEBRUARY", 1);
        FEBRUARY = enum_2;
        Enum enum_3 = new Enum("MARCH", 2);
        MARCH = enum_3;
        Enum enum_4 = new Enum("APRIL", 3);
        APRIL = enum_4;
        Enum enum_5 = new Enum("MAY", 4);
        MAY = enum_5;
        Enum enum_6 = new Enum("JUNE", 5);
        JUNE = enum_6;
        Enum enum_7 = new Enum("JULY", 6);
        JULY = enum_7;
        Enum enum_8 = new Enum("AUGUST", 7);
        AUGUST = enum_8;
        Enum enum_9 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = enum_9;
        Enum enum_10 = new Enum("OCTOBER", 9);
        OCTOBER = enum_10;
        Enum enum_11 = new Enum("NOVEMBER", 10);
        NOVEMBER = enum_11;
        Enum enum_12 = new Enum("DECEMBER", 11);
        DECEMBER = enum_12;
        b = new l[]{enum_, enum_2, enum_3, enum_4, enum_5, enum_6, enum_7, enum_8, enum_9, enum_10, enum_11, enum_12};
        a = l.values();
    }

    public static l L(int n2) {
        if (n2 >= 1 && n2 <= 12) {
            return a[n2 - 1];
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid value for MonthOfYear: ");
        stringBuilder.append(n2);
        throw new RuntimeException(stringBuilder.toString());
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    public static l[] values() {
        return (l[])b.clone();
    }

    @Override
    public final long B(p p2) {
        if (p2 == j$.time.temporal.a.MONTH_OF_YEAR) {
            return this.getValue();
        }
        if (!(p2 instanceof a)) {
            return p2.g(this);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
    }

    @Override
    public final Object F(r r2) {
        if (r2 == j$.time.temporal.l.e()) {
            return u.d;
        }
        if (r2 == j$.time.temporal.l.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.l.c(this, r2);
    }

    public final int I(boolean bl2) {
        switch (this.ordinal()) {
            default: {
                return bl2 + 335;
            }
            case 10: {
                return bl2 + 305;
            }
            case 9: {
                return bl2 + 274;
            }
            case 8: {
                return bl2 + 244;
            }
            case 7: {
                return bl2 + 213;
            }
            case 6: {
                return bl2 + 182;
            }
            case 5: {
                return bl2 + 152;
            }
            case 4: {
                return bl2 + 121;
            }
            case 3: {
                return bl2 + 91;
            }
            case 2: {
                return bl2 + 60;
            }
            case 1: {
                return 32;
            }
            case 0: 
        }
        return 1;
    }

    public final int J(boolean bl2) {
        int n2 = this.ordinal();
        if (n2 != 1) {
            if (n2 != 3 && n2 != 5 && n2 != 8 && n2 != 10) {
                return 31;
            }
            return 30;
        }
        n2 = bl2 ? 29 : 28;
        return n2;
    }

    public final int K() {
        int n2 = this.ordinal();
        if (n2 != 1) {
            if (n2 != 3 && n2 != 5 && n2 != 8 && n2 != 10) {
                return 31;
            }
            return 30;
        }
        return 29;
    }

    public final l M() {
        int n2 = (int)1L;
        int n3 = this.ordinal();
        return a[(n2 + 12 + n3) % 12];
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof a;
        boolean bl3 = false;
        boolean bl4 = false;
        if (bl2) {
            if (p2 == j$.time.temporal.a.MONTH_OF_YEAR) {
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
        if (i_0.p(k2).equals(u.d)) {
            a a2 = j$.time.temporal.a.MONTH_OF_YEAR;
            return k2.d(this.getValue(), a2);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int getValue() {
        return this.ordinal() + 1;
    }

    @Override
    public final int p(p p2) {
        if (p2 == j$.time.temporal.a.MONTH_OF_YEAR) {
            return this.getValue();
        }
        return j$.time.temporal.l.a(this, p2);
    }

    @Override
    public final t t(p p2) {
        if (p2 == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p2.m();
        }
        return j$.time.temporal.l.d(this, p2);
    }
}

