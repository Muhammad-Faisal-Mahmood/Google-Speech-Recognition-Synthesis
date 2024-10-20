/*
 * Decompiled with CFR 0.152.
 */
package j$.time.zone;

import j$.desugar.sun.nio.fs.c;
import j$.time.Duration;
import j$.time.chrono.i_0;
import j$.time.i;
import j$.time.x;
import j$.time.zone.a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public final class b
implements Comparable,
Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final long a;
    private final i b;
    private final x c;
    private final x d;

    b(long l2, x x2, x x3) {
        this.a = l2;
        this.b = i.R(l2, 0, x2);
        this.c = x2;
        this.d = x3;
    }

    b(i i2, x x2, x x3) {
        i2.getClass();
        this.a = i_0.n(i2, x2);
        this.b = i2;
        this.c = x2;
        this.d = x3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(2, this);
    }

    final List B() {
        if (this.F()) {
            return Collections.emptyList();
        }
        return j$.desugar.sun.nio.fs.c.a(new Object[]{this.c, this.d});
    }

    public final boolean F() {
        boolean bl2 = this.d.O() > this.c.O();
        return bl2;
    }

    public final long H() {
        return this.a;
    }

    public final int compareTo(Object object) {
        object = (b)object;
        return Long.compare(this.a, ((b)object).a);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (object instanceof b) {
            object = (b)object;
            long l2 = ((b)object).a;
            if (this.a != l2 || !this.c.equals(((b)object).c) || !this.d.equals(((b)object).d)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final i g() {
        long l2 = this.d.O() - this.c.O();
        return this.b.T(l2);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode() ^ Integer.rotateLeft(this.d.hashCode(), 16);
    }

    public final i m() {
        return this.b;
    }

    public final Duration p() {
        return Duration.ofSeconds(this.d.O() - this.c.O());
    }

    public final x s() {
        return this.d;
    }

    public final x t() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Transition[");
        String string = this.F() ? "Gap" : "Overlap";
        stringBuilder.append(string);
        stringBuilder.append(" at ");
        stringBuilder.append(this.b);
        stringBuilder.append(this.c);
        stringBuilder.append(" to ");
        stringBuilder.append(this.d);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        j$.time.zone.a.c(this.a, objectOutput);
        j$.time.zone.a.d(this.c, objectOutput);
        j$.time.zone.a.d(this.d, objectOutput);
    }
}

