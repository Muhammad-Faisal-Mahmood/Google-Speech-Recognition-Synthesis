/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$_CC;
import j$.util.stream.B0;
import j$.util.stream.I;
import j$.util.stream.b_0;
import j$.util.stream.c_0;
import j$.util.stream.g;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.stream.d0
 */
abstract class d0_0
extends CountedCompleter
implements B0 {
    protected final Spliterator a;
    protected final b_0 b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    d0_0(Spliterator spliterator, b_0 b_02, int n2) {
        this.a = spliterator;
        this.b = b_02;
        this.c = j$.util.stream.g.f(spliterator.d());
        this.d = 0L;
        this.e = n2;
    }

    d0_0(d0_0 d0_02, Spliterator spliterator, long l2, long l3, int n2) {
        super(d0_02);
        this.a = spliterator;
        this.b = d0_02.b;
        this.c = d0_02.c;
        this.d = l2;
        this.e = l3;
        if (l2 >= 0L && l3 >= 0L && l2 + l3 - 1L < (long)n2) {
            return;
        }
        throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", l2, l2, l3, n2));
    }

    abstract d0_0 a(Spliterator var1, long var2, long var4);

    @Override
    public /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final /* synthetic */ void c() {
    }

    @Override
    public final void compute() {
        Spliterator spliterator;
        Spliterator spliterator2 = this.a;
        d0_0 d0_02 = this;
        while (spliterator2.d() > d0_02.c && (spliterator = spliterator2.b()) != null) {
            c_0.h(d0_02);
            long l2 = spliterator.d();
            d0_02.a(spliterator, d0_02.d, l2).fork();
            d0_02 = d0_02.a(spliterator2, d0_02.d + l2, d0_02.e - l2);
        }
        d0_02.b.u(spliterator2, d0_02);
        c_0.o(d0_02);
    }

    @Override
    public final void e(long l2) {
        long l3 = this.e;
        if (l2 <= l3) {
            int n2;
            this.f = n2 = (int)this.d;
            this.g = n2 + (int)l3;
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }
}

