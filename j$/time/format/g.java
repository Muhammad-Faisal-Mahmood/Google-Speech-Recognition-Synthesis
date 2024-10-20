/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.A;
import j$.time.format.j;
import j$.time.format.u;
import j$.time.format.y;
import j$.time.temporal.a;
import j$.time.temporal.p;
import j$.time.temporal.t;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

final class g
extends j {
    private final boolean g;

    g(a object, int n2, int n3, boolean bl2) {
        this((p)object, n2, n3, bl2, 0);
        Objects.requireNonNull(object, "field");
        if (((a)object).m().g()) {
            if (n2 >= 0 && n2 <= 9) {
                if (n3 >= 1 && n3 <= 9) {
                    if (n3 >= n2) {
                        return;
                    }
                    object = new StringBuilder("Maximum width must exceed or equal the minimum width but ");
                    ((StringBuilder)object).append(n3);
                    ((StringBuilder)object).append(" < ");
                    ((StringBuilder)object).append(n2);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                object = new StringBuilder("Maximum width must be from 1 to 9 inclusive but was ");
                ((StringBuilder)object).append(n3);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            object = new StringBuilder("Minimum width must be from 0 to 9 inclusive but was ");
            ((StringBuilder)object).append(n2);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(object)));
    }

    g(p p2, int n2, int n3, boolean bl2, int n4) {
        super(p2, n2, n3, A.NOT_NEGATIVE, n4);
        this.g = bl2;
    }

    @Override
    final j c() {
        g g2;
        if (this.e == -1) {
            g2 = this;
        } else {
            boolean bl2 = this.g;
            g2 = new g(this.a, this.b, this.c, bl2, -1);
        }
        return g2;
    }

    @Override
    final j d(int n2) {
        int n3 = this.e;
        return new g(this.a, this.b, this.c, this.g, n3 + n2);
    }

    @Override
    public final boolean g(u object, StringBuilder stringBuilder) {
        Object object2 = this.a;
        Number number = ((u)object).e((p)object2);
        int n2 = 0;
        if (number == null) {
            return false;
        }
        y y2 = ((u)object).b();
        long l2 = (Long)number;
        object = object2.m();
        ((t)object).b(l2, (p)object2);
        object2 = BigDecimal.valueOf(((t)object).e());
        object = BigDecimal.valueOf(((t)object).d()).subtract((BigDecimal)object2).add(BigDecimal.ONE);
        number = BigDecimal.valueOf(l2).subtract((BigDecimal)object2);
        object2 = RoundingMode.FLOOR;
        number = ((BigDecimal)number).divide((BigDecimal)object, 9, (RoundingMode)((Object)object2));
        object = BigDecimal.ZERO;
        if (((BigDecimal)number).compareTo((BigDecimal)object) != 0) {
            object = ((BigDecimal)number).signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : ((BigDecimal)number).stripTrailingZeros();
        }
        int n3 = ((BigDecimal)object).scale();
        boolean bl2 = this.g;
        int n4 = this.b;
        if (n3 == 0) {
            if (n4 > 0) {
                n3 = n2;
                if (bl2) {
                    y2.getClass();
                    stringBuilder.append('.');
                    n3 = n2;
                }
                while (n3 < n4) {
                    y2.getClass();
                    stringBuilder.append('0');
                    ++n3;
                }
            }
        } else {
            object = ((BigDecimal)object).setScale(Math.min(Math.max(((BigDecimal)object).scale(), n4), this.c), (RoundingMode)((Object)object2)).toPlainString().substring(2);
            y2.getClass();
            if (bl2) {
                stringBuilder.append('.');
            }
            stringBuilder.append((String)object);
        }
        return true;
    }

    @Override
    public final String toString() {
        String string = this.g ? ",DecimalPoint" : "";
        String string2 = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("Fraction(");
        stringBuilder.append(string2);
        stringBuilder.append(",");
        stringBuilder.append(this.b);
        stringBuilder.append(",");
        stringBuilder.append(this.c);
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

