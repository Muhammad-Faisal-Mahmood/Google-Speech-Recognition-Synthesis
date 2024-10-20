/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$_CC;
import j$.util.stream.B0;
import j$.util.stream.I;
import java.util.function.Consumer;

public abstract class z0
implements B0 {
    protected final B0 a;

    public z0(B0 b0) {
        this.a = Objects.requireNonNull(b0);
    }

    @Override
    public final /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public void c() {
        this.a.c();
    }

    @Override
    public void e(long l2) {
        this.a.e(l2);
    }

    @Override
    public boolean j() {
        return this.a.j();
    }
}

