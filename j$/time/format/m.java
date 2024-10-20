/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.chrono.i_0;
import j$.time.format.A;
import j$.time.format.j;
import j$.time.format.u;
import j$.time.g;
import j$.time.temporal.p;
import j$.time.temporal.t;
import j$.util.Objects;

final class m
extends j {
    static final g h = j$.time.g.T(2000, 1, 1);
    private final g g;

    private m(p p2, int n2, int n3, g g2, int n4) {
        super(p2, n2, n3, A.NOT_NEGATIVE, n4);
        this.g = g2;
    }

    m(p object, g g2) {
        this((p)object, 2, 2, g2, 0);
        if (g2 == null) {
            long l2;
            if (((t)(object = object.m())).i(l2 = (long)0)) {
                if (l2 + j.f[2] > Integer.MAX_VALUE) {
                    throw new RuntimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            } else {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
        }
    }

    /* synthetic */ m(p p2, g g2, int n2) {
        this(p2, 2, 2, g2, n2);
    }

    @Override
    final long b(u object, long l2) {
        Object object2;
        long l3 = Math.abs(l2);
        g g2 = this.g;
        int n2 = g2 != null ? i_0.p(((u)object).d()).r(g2).p(this.a) : 0;
        long l4 = n2;
        object = j.f;
        if (l2 >= l4 && l2 < l4 + (object2 = object[this.b])) {
            return l3 % object2;
        }
        return l3 % object[this.c];
    }

    @Override
    final j c() {
        Object object;
        if (this.e == -1) {
            object = this;
        } else {
            object = this.g;
            object = new m(this.a, this.b, this.c, (g)object, -1);
        }
        return object;
    }

    @Override
    final j d(int n2) {
        int n3 = this.e;
        int n4 = this.b;
        int n5 = this.c;
        return new m(this.a, n4, n5, this.g, n3 + n2);
    }

    @Override
    public final String toString() {
        String string = String.valueOf(this.a);
        Object object = this.g;
        if (object == null) {
            object = Objects.requireNonNull(0, "defaultObj");
        }
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("ReducedValue(");
        stringBuilder.append(string);
        stringBuilder.append(",");
        stringBuilder.append(this.b);
        stringBuilder.append(",");
        stringBuilder.append(this.c);
        stringBuilder.append(",");
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

