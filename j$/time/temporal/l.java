/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.util.Objects;
import java.io.Serializable;

public abstract class l {
    static final r a = new q(0);
    static final r b = new q(1);
    static final r c = new q(2);
    static final r d = new q(3);
    static final r e = new q(4);
    static final r f = new q(5);
    static final r g = new q(6);

    public static int a(m object, p object2) {
        Serializable serializable = object.t((p)object2);
        if (((t)serializable).h()) {
            long l2 = object.B((p)object2);
            if (((t)serializable).i(l2)) {
                return (int)l2;
            }
            object = String.valueOf(object2);
            object2 = String.valueOf(serializable);
            serializable = new StringBuilder("Invalid value for ");
            ((StringBuilder)serializable).append((String)object);
            ((StringBuilder)serializable).append(" (valid values ");
            ((StringBuilder)serializable).append((String)object2);
            ((StringBuilder)serializable).append("): ");
            ((StringBuilder)serializable).append(l2);
            throw new RuntimeException(((StringBuilder)serializable).toString());
        }
        object2 = String.valueOf(object2);
        object = new StringBuilder("Invalid field ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" for get() method, use getLong() instead");
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static k b(k k2, long l2, TemporalUnit temporalUnit) {
        if (l2 == Long.MIN_VALUE) {
            k2 = k2.f(Long.MAX_VALUE, temporalUnit);
            l2 = 1L;
            return k2.f(l2, temporalUnit);
        }
        l2 = -l2;
        return k2.f(l2, temporalUnit);
    }

    public static Object c(m m2, r r2) {
        if (r2 != a && r2 != b && r2 != c) {
            return r2.a(m2);
        }
        return null;
    }

    public static t d(m m2, p p2) {
        if (p2 instanceof a) {
            if (m2.e(p2)) {
                return ((a)p2).m();
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
        }
        Objects.requireNonNull(p2, "field");
        return p2.t(m2);
    }

    public static r e() {
        return b;
    }

    public static r f() {
        return f;
    }

    public static r g() {
        return g;
    }

    public static r h() {
        return d;
    }

    public static r i() {
        return c;
    }

    public static r j() {
        return e;
    }

    public static r k() {
        return a;
    }
}

