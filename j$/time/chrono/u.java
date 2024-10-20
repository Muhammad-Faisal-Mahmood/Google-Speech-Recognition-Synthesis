/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.G;
import j$.time.chrono.a_0;
import j$.time.chrono.b_0;
import j$.time.chrono.e_0;
import j$.time.chrono.o;
import j$.time.chrono.v;
import j$.time.g;
import j$.time.i;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class u
extends a_0
implements Serializable {
    public static final u d = new u();
    private static final long serialVersionUID = -1440403870442975015L;

    private u() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final boolean D(long l2) {
        boolean bl2 = (3L & l2) == 0L && (l2 % 100L != 0L || l2 % 400L == 0L);
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final o G(int n2) {
        if (n2 == 0) return v.BCE;
        if (n2 == 1) {
            return v.CE;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid era: ");
        stringBuilder.append(n2);
        throw new RuntimeException(stringBuilder.toString());
    }

    @Override
    public final b_0 k(int n2) {
        return g.T(n2, 1, 1);
    }

    @Override
    public final String l() {
        return "ISO";
    }

    @Override
    public final t q(a a2) {
        return a2.m();
    }

    @Override
    public final b_0 r(m m2) {
        return g.K(m2);
    }

    @Override
    public final e_0 u(i i2) {
        return i.J(i2);
    }

    Object writeReplace() {
        return new G(1, this);
    }

    @Override
    public final String z() {
        return "iso8601";
    }
}

