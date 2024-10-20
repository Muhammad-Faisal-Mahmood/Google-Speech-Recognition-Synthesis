/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.A;
import j$.time.chrono.G;
import j$.time.chrono.a_0;
import j$.time.chrono.b_0;
import j$.time.chrono.o;
import j$.time.chrono.u;
import j$.time.chrono.w;
import j$.time.chrono.z;
import j$.time.g;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class x
extends a_0
implements Serializable {
    public static final x d = new x();
    private static final long serialVersionUID = 459996390165777884L;

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final boolean D(long l2) {
        return u.d.D(l2);
    }

    @Override
    public final o G(int n2) {
        return A.u(n2);
    }

    @Override
    public final b_0 k(int n2) {
        return new z(g.T(n2, 1, 1));
    }

    @Override
    public final String l() {
        return "Japanese";
    }

    @Override
    public final t q(a a2) {
        switch (w.a[a2.ordinal()]) {
            default: {
                return a2.m();
            }
            case 8: {
                return t.j(A.d.getValue(), A.l().getValue());
            }
            case 7: {
                return t.j(z.d.P(), 999999999L);
            }
            case 6: {
                return t.k(1L, A.z(), a.DAY_OF_YEAR.m().d());
            }
            case 5: {
                int n2 = A.l().q().P();
                return t.k(1L, A.D(), 999999999 - n2);
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(a2)));
    }

    @Override
    public final b_0 r(m m2) {
        m2 = m2 instanceof z ? (z)m2 : new z(g.K(m2));
        return m2;
    }

    Object writeReplace() {
        return new G(1, this);
    }

    @Override
    public final String z() {
        return "japanese";
    }
}

