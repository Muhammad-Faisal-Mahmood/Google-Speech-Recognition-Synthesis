/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.G;
import j$.time.chrono.i_0;
import j$.time.chrono.o;
import j$.time.chrono.x;
import j$.time.chrono.z;
import j$.time.g;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class A
implements o,
Serializable {
    public static final A d;
    private static final A[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient g b;
    private final transient String c;

    static {
        A a2;
        d = a2 = new A(-1, g.T(1868, 1, 1), "Meiji");
        A a3 = new A(0, g.T(1912, 7, 30), "Taisho");
        A a4 = new A(1, g.T(1926, 12, 25), "Showa");
        A a5 = new A(2, g.T(1989, 1, 8), "Heisei");
        A a6 = new A(3, g.T(2019, 5, 1), "Reiwa");
        A[] aArray = new A[5];
        e = aArray;
        aArray[0] = a2;
        aArray[1] = a3;
        aArray[2] = a4;
        aArray[3] = a5;
        aArray[4] = a6;
    }

    private A(int n2, g g2, String string) {
        this.a = n2;
        this.b = g2;
        this.c = string;
    }

    static long D() {
        int n2 = 1000000000 - A.l().b.P();
        A[] aArray = e;
        int n3 = aArray[0].b.P();
        for (int i2 = 1; i2 < aArray.length; ++i2) {
            A a2 = aArray[i2];
            n2 = Math.min(n2, a2.b.P() - n3 + 1);
            n3 = a2.b.P();
        }
        return n2;
    }

    static A k(g g2) {
        if (!g2.Q(z.d)) {
            A[] aArray = e;
            for (int i2 = aArray.length - 1; i2 >= 0; --i2) {
                A a2 = aArray[i2];
                if (g2.A(a2.b) < 0) continue;
                return a2;
            }
            return null;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 are not supported");
    }

    static A l() {
        A[] aArray = e;
        return aArray[aArray.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static A u(int n2) {
        Object object;
        int n3 = n2 + 1;
        if (n3 >= 0 && n3 < ((A[])(object = e)).length) {
            return object[n3];
        }
        object = new StringBuilder("Invalid era: ");
        ((StringBuilder)object).append(n2);
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    private Object writeReplace() {
        return new G(5, this);
    }

    static long z() {
        long l2 = j$.time.temporal.a.DAY_OF_YEAR.m().f();
        for (A a2 : e) {
            long l3;
            l2 = l3 = Math.min(l2, (long)(a2.b.x() - a2.b.N() + 1));
            if (a2.r() == null) continue;
            l2 = Math.min(l3, (long)(a2.r().b.N() - 1));
        }
        return l2;
    }

    @Override
    public final /* synthetic */ long B(p p2) {
        return i_0.g(this, p2);
    }

    @Override
    public final /* synthetic */ Object F(r r2) {
        return i_0.m(this, r2);
    }

    final void G(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }

    @Override
    public final /* synthetic */ boolean e(p p2) {
        return i_0.i(this, p2);
    }

    @Override
    public final k g(k k2) {
        a a2 = j$.time.temporal.a.ERA;
        return k2.d(this.getValue(), a2);
    }

    @Override
    public final int getValue() {
        return this.a;
    }

    @Override
    public final /* synthetic */ int p(p p2) {
        return i_0.f(this, (a)p2);
    }

    final g q() {
        return this.b;
    }

    final A r() {
        A a2 = this == A.l() ? null : A.u(this.a + 1);
        return a2;
    }

    @Override
    public final t t(p p2) {
        a a2 = j$.time.temporal.a.ERA;
        if (p2 == a2) {
            return x.d.q(a2);
        }
        return l.d(this, p2);
    }

    public final String toString() {
        return this.c;
    }
}

