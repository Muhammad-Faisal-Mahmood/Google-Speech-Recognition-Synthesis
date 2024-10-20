/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.B0;
import j$.util.stream.BaseStream;
import j$.util.stream.H;
import j$.util.stream.L;
import j$.util.stream.M0;
import j$.util.stream.V0;
import j$.util.stream.a_0;
import j$.util.stream.h_0;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/*
 * Renamed from j$.util.stream.b
 */
abstract class b_0
implements BaseStream {
    private final b_0 a;
    private final b_0 b;
    protected final int c;
    private b_0 d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private boolean j;

    b_0(Spliterator spliterator, int n2, boolean bl2) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        this.c = n2 = M0.g & n2;
        this.f = ~(n2 << 1) & M0.l;
        this.e = 0;
        this.j = bl2;
    }

    b_0(b_0 b_02, int n2) {
        if (!b_02.h) {
            b_0 b_03;
            b_02.h = true;
            b_02.d = this;
            this.b = b_02;
            this.c = M0.h & n2;
            this.f = M0.g(n2, b_02.f);
            this.a = b_03 = b_02.a;
            if (this.p()) {
                b_03.i = true;
            }
            this.e = b_02.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private Spliterator r(int n2) {
        b_0 b_02 = this.a;
        Spliterator spliterator = b_02.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        b_02.g = null;
        Spliterator spliterator2 = spliterator;
        if (b_02.j) {
            spliterator2 = spliterator;
            if (b_02.i) {
                b_0 b_03 = b_02.d;
                int n3 = 1;
                while (true) {
                    spliterator2 = spliterator;
                    if (b_02 == this) break;
                    int n4 = b_03.c;
                    spliterator2 = spliterator;
                    int n5 = n3;
                    n3 = n4;
                    if (b_03.p()) {
                        n3 = n4;
                        if (M0.SHORT_CIRCUIT.s(n4)) {
                            n3 = n4 & ~M0.t;
                        }
                        if ((spliterator2 = b_03.o(b_02, spliterator)).k(64)) {
                            n4 = ~M0.s & n3;
                            n3 = M0.r;
                        } else {
                            n4 = ~M0.r & n3;
                            n3 = M0.s;
                        }
                        n3 = n4 | n3;
                        n5 = 0;
                    }
                    b_03.e = n5;
                    b_03.f = M0.g(n3, b_02.f);
                    b_0 b_04 = b_03.d;
                    n3 = n5 + 1;
                    b_02 = b_03;
                    spliterator = spliterator2;
                    b_03 = b_04;
                }
            }
        }
        if (n2 != 0) {
            this.f = M0.g(n2, this.f);
        }
        return spliterator2;
    }

    @Override
    public final BaseStream a() {
        this.a.j = false;
        return this;
    }

    final void b(Spliterator spliterator, B0 b0) {
        Objects.requireNonNull(b0);
        if (!M0.SHORT_CIRCUIT.s(this.f)) {
            b0.e(spliterator.l());
            spliterator.forEachRemaining(b0);
            b0.c();
        } else {
            b_0 b_02 = this;
            while (b_02.e > 0) {
                b_02 = b_02.b;
            }
            b0.e(spliterator.l());
            b_02.h(spliterator, b0);
            b0.c();
        }
    }

    final L c(Spliterator spliterator, boolean bl2, IntFunction object) {
        if (this.a.j) {
            return this.f(this, spliterator, bl2, (IntFunction)object);
        }
        object = this.m(this.g(spliterator), (IntFunction)object);
        this.u(spliterator, (B0)object);
        return object.p();
    }

    @Override
    public final void close() {
        this.h = true;
        this.g = null;
        this.a.getClass();
    }

    final Object d(V0 object) {
        if (!this.h) {
            this.h = true;
            object = this.a.j ? object.b(this, this.r(object.d())) : object.a(this, this.r(object.d()));
            return object;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    final L e(IntFunction intFunction) {
        if (!this.h) {
            b_0 b_02;
            this.h = true;
            if (this.a.j && (b_02 = this.b) != null && this.p()) {
                this.e = 0;
                return this.n(b_02, b_02.r(0), intFunction);
            }
            return this.c(this.r(0), true, intFunction);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    abstract L f(b_0 var1, Spliterator var2, boolean var3, IntFunction var4);

    final long g(Spliterator spliterator) {
        long l2 = M0.SIZED.s(this.f) ? spliterator.l() : -1L;
        return l2;
    }

    abstract boolean h(Spliterator var1, B0 var2);

    final int i() {
        return this.f;
    }

    final boolean j() {
        return M0.ORDERED.s(this.f);
    }

    public final boolean k() {
        return this.a.j;
    }

    final /* synthetic */ Spliterator l() {
        return this.r(0);
    }

    abstract H m(long var1, IntFunction var3);

    L n(b_0 b_02, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator o(b_0 b_02, Spliterator spliterator) {
        return this.n(b_02, spliterator, new h_0(7)).spliterator();
    }

    abstract boolean p();

    abstract B0 q(int var1, B0 var2);

    final Spliterator s() {
        b_0 b_02 = this.a;
        if (this == b_02) {
            if (!this.h) {
                this.h = true;
                Spliterator spliterator = b_02.g;
                if (spliterator != null) {
                    b_02.g = null;
                    return spliterator;
                }
                throw new IllegalStateException("source already consumed or closed");
            }
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        throw new IllegalStateException();
    }

    @Override
    public final Spliterator spliterator() {
        if (!this.h) {
            this.h = true;
            b_0 b_02 = this.a;
            if (this == b_02) {
                Spliterator spliterator = b_02.g;
                if (spliterator != null) {
                    b_02.g = null;
                    return spliterator;
                }
                throw new IllegalStateException("source already consumed or closed");
            }
            return this.t(this, new a_0(0, this), b_02.j);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    abstract Spliterator t(b_0 var1, Supplier var2, boolean var3);

    final B0 u(Spliterator spliterator, B0 b0) {
        this.b(spliterator, this.v(Objects.requireNonNull(b0)));
        return b0;
    }

    final B0 v(B0 b0) {
        Objects.requireNonNull(b0);
        b_0 b_02 = this;
        while (b_02.e > 0) {
            b_0 b_03 = b_02.b;
            b0 = b_02.q(b_03.f, b0);
            b_02 = b_03;
        }
        return b0;
    }

    final Spliterator w(Spliterator spliterator) {
        if (this.e == 0) {
            return spliterator;
        }
        return this.t(this, new a_0(7, spliterator), this.a.j);
    }
}

