/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.B0;
import j$.util.stream.M0;
import j$.util.stream.b_0;
import j$.util.stream.f_0;
import j$.util.z;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

abstract class O0
implements Spliterator {
    final boolean a;
    final b_0 b;
    private Supplier c;
    Spliterator d;
    B0 e;
    BooleanSupplier f;
    long g;
    f_0 h;
    boolean i;

    O0(b_0 b_02, Spliterator spliterator, boolean bl2) {
        this.b = b_02;
        this.c = null;
        this.d = spliterator;
        this.a = bl2;
    }

    O0(b_0 b_02, Supplier supplier, boolean bl2) {
        this.b = b_02;
        this.c = supplier;
        this.d = null;
        this.a = bl2;
    }

    private boolean e() {
        while (this.h.count() == 0L) {
            if (!this.e.j() && this.f.getAsBoolean()) continue;
            if (this.i) {
                return false;
            }
            this.e.c();
            this.i = true;
        }
        return true;
    }

    @Override
    public final int a() {
        int n2;
        this.f();
        int n3 = n2 = M0.B(this.b.i()) & M0.f;
        if ((n2 & 0x40) != 0) {
            n3 = n2 & 0xFFFFBFBF | this.d.a() & 0x4040;
        }
        return n3;
    }

    @Override
    public Spliterator b() {
        Spliterator spliterator;
        boolean bl2 = this.a;
        Spliterator spliterator2 = spliterator = null;
        if (bl2) {
            spliterator2 = spliterator;
            if (this.h == null) {
                spliterator2 = spliterator;
                if (!this.i) {
                    this.f();
                    spliterator2 = this.d.b();
                    spliterator2 = spliterator2 == null ? spliterator : this.j(spliterator2);
                }
            }
        }
        return spliterator2;
    }

    final boolean c() {
        long l2;
        f_0 f_02 = this.h;
        boolean bl2 = false;
        if (f_02 == null) {
            if (this.i) {
                return false;
            }
            this.f();
            this.i();
            this.g = 0L;
            this.e.e(this.d.l());
            return this.e();
        }
        this.g = l2 = this.g + 1L;
        if (l2 < f_02.count()) {
            bl2 = true;
        }
        boolean bl3 = bl2;
        if (!bl2) {
            this.g = 0L;
            this.h.clear();
            bl3 = this.e();
        }
        return bl3;
    }

    @Override
    public final long d() {
        this.f();
        return this.d.d();
    }

    final void f() {
        if (this.d == null) {
            this.d = (Spliterator)this.c.get();
            this.c = null;
        }
    }

    abstract void i();

    abstract O0 j(Spliterator var1);

    @Override
    public final /* synthetic */ boolean k(int n2) {
        return z.f(this, n2);
    }

    @Override
    public final long l() {
        this.f();
        long l2 = M0.SIZED.s(this.b.i()) ? this.d.l() : -1L;
        return l2;
    }

    @Override
    public final Comparator m() {
        if (z.f(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", this.getClass().getName(), this.d);
    }
}

