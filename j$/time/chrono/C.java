/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.B;
import j$.time.chrono.E;
import j$.time.chrono.F;
import j$.time.chrono.G;
import j$.time.chrono.a_0;
import j$.time.chrono.b_0;
import j$.time.chrono.o;
import j$.time.chrono.u;
import j$.time.g;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class C
extends a_0
implements Serializable {
    public static final C d = new C();
    private static final long serialVersionUID = 1039765215346859963L;

    private C() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final boolean D(long l2) {
        return u.d.D(l2 + 1911L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final o G(int n2) {
        if (n2 == 0) return F.BEFORE_ROC;
        if (n2 == 1) {
            return F.ROC;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid era: ");
        stringBuilder.append(n2);
        throw new RuntimeException(stringBuilder.toString());
    }

    @Override
    public final b_0 k(int n2) {
        return new E(g.T(n2 + 1911, 1, 1));
    }

    @Override
    public final String l() {
        return "Minguo";
    }

    @Override
    public final t q(a object) {
        int n2 = B.a[((Enum)object).ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return ((a)object).m();
                }
                object = a.YEAR.m();
                return t.j(((t)object).e() - 1911L, ((t)object).d() - 1911L);
            }
            object = a.YEAR.m();
            return t.k(1L, ((t)object).d() - 1911L, -((t)object).e() + 1912L);
        }
        object = a.PROLEPTIC_MONTH.m();
        return t.j(((t)object).e() - 22932L, ((t)object).d() - 22932L);
    }

    @Override
    public final b_0 r(m m2) {
        m2 = m2 instanceof E ? (E)m2 : new E(g.K(m2));
        return m2;
    }

    Object writeReplace() {
        return new G(1, this);
    }

    @Override
    public final String z() {
        return "roc";
    }
}

