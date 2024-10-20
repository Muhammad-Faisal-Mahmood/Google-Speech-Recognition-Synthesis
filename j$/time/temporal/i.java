/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.t;

final class i
extends Enum
implements p {
    public static final /* enum */ i JULIAN_DAY;
    public static final /* enum */ i MODIFIED_JULIAN_DAY;
    public static final /* enum */ i RATA_DIE;
    private static final i[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    private final transient String a;
    private final transient t b;
    private final transient long c;

    static {
        i i2;
        i i3;
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        Enum enum_ = ChronoUnit.FOREVER;
        JULIAN_DAY = i3 = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, enum_, 2440588L);
        MODIFIED_JULIAN_DAY = i2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, enum_, 40587L);
        enum_ = new i("RATA_DIE", 2, "RataDie", chronoUnit, enum_, 719163L);
        RATA_DIE = enum_;
        d = new i[]{i3, i2, enum_};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private i(ChronoUnit chronoUnit, long l2) {
        void var6_4;
        void var2_-1;
        void var1_-1;
        this.a = chronoUnit;
        this.b = t.j(-365243219162L + var6_4, 365241780471L + var6_4);
        this.c = var6_4;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public static i[] values() {
        return (i[])d.clone();
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public final long g(m m2) {
        return m2.B(j$.time.temporal.a.EPOCH_DAY) + this.c;
    }

    @Override
    public final t m() {
        return this.b;
    }

    @Override
    public final boolean p(m m2) {
        return m2.e(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override
    public final k s(k object, long l2) {
        if (this.b.i(l2)) {
            a a2 = j$.time.temporal.a.EPOCH_DAY;
            return object.d(j$.nio.file.attribute.a.k(l2, this.c), a2);
        }
        object = new StringBuilder("Invalid value: ");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append(" ");
        ((StringBuilder)object).append(l2);
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    @Override
    public final t t(m m2) {
        if (m2.e(j$.time.temporal.a.EPOCH_DAY)) {
            return this.b;
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(this)));
    }

    public final String toString() {
        return this.a;
    }
}

