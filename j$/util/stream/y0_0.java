/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.nio.file.attribute.a;
import j$.util.Objects;
import j$.util.function.Consumer$_CC;
import j$.util.stream.A0;
import j$.util.stream.B0;
import j$.util.stream.I;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/*
 * Renamed from j$.util.stream.y0
 */
public abstract class y0_0
implements A0 {
    protected final B0 a;

    public y0_0(B0 b0) {
        this.a = Objects.requireNonNull(b0);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }

    @Override
    public final void c() {
        this.a.c();
    }

    @Override
    public void e(long l2) {
        this.a.e(l2);
    }

    @Override
    public final /* synthetic */ void f(Integer n2) {
        I.e(this, n2);
    }

    @Override
    public final boolean j() {
        return this.a.j();
    }
}

