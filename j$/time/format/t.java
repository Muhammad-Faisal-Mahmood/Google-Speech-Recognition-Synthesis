/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.b_0;
import j$.time.chrono.n;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.r;
import java.io.Serializable;

final class t
implements m {
    final b_0 a;
    final Object b;
    final n c;
    final ZoneId d;

    t(b_0 b_02, m m2, n n2, ZoneId zoneId) {
        this.a = b_02;
        this.b = m2;
        this.c = n2;
        this.d = zoneId;
    }

    @Override
    public final long B(p p2) {
        b_0 b_02 = this.a;
        if (b_02 != null && p2.B()) {
            return b_02.B(p2);
        }
        return this.b.B(p2);
    }

    @Override
    public final Object F(r r2) {
        if (r2 == l.e()) {
            return this.c;
        }
        if (r2 == l.k()) {
            return this.d;
        }
        if (r2 == l.i()) {
            return this.b.F(r2);
        }
        return r2.a(this);
    }

    @Override
    public final boolean e(p p2) {
        b_0 b_02 = this.a;
        if (b_02 != null && p2.B()) {
            return b_02.e(p2);
        }
        return this.b.e(p2);
    }

    @Override
    public final /* synthetic */ int p(p p2) {
        return l.a(this, p2);
    }

    @Override
    public final j$.time.temporal.t t(p p2) {
        b_0 b_02 = this.a;
        if (b_02 != null && p2.B()) {
            return b_02.t(p2);
        }
        return this.b.t(p2);
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        String string2 = "";
        Object object = this.c;
        object = object != null ? " with chronology ".concat(String.valueOf(object)) : "";
        Serializable serializable = this.d;
        if (serializable != null) {
            string2 = " with zone ".concat(String.valueOf(serializable));
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(string2);
        return ((StringBuilder)serializable).toString();
    }
}

