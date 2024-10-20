/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;

final class jfv
extends ixi {
    final jfw a;

    public jfv(jfw jfw2) {
        this.a = jfw2;
    }

    @Override
    public final String a() {
        return this.a.b;
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(ixf ixf2) {
        bmt bmt2 = new bmt(null);
        bmt2.c = Collections.singletonList(new iux(this.a.a));
        bmt2.b = its.a;
        ixf2.c(bmt2.c());
    }
}

