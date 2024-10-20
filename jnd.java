/*
 * Decompiled with CFR 0.152.
 */
final class jnd
extends kmp {
    final jne a;
    private final ixx b;
    private boolean c;
    private boolean d;
    private Object e;
    private final jmy f;

    public jnd(jne jne2, jmy jmy2, ixx ixx2) {
        this.a = jne2;
        super(null);
        this.c = true;
        this.b = ixx2;
        this.f = jmy2;
    }

    @Override
    public final void W() {
        jmy jmy2 = this.f;
        Runnable runnable = jmy2.d;
        if (runnable != null) {
            runnable.run();
            return;
        }
        jmy2.b = true;
    }

    @Override
    public final void X() {
    }

    @Override
    public final void e() {
        if (this.c) {
            Object object = this.e;
            if (object == null) {
                this.b.a(iyh.j.e("Half-closed without a request"), new iwx());
                return;
            }
            jne jne2 = this.a;
            jmy jmy2 = this.f;
            jne2.a.a(object, jmy2);
            this.e = null;
            this.f.d();
            if (this.d) {
                ((kmp)this).g();
            }
        }
    }

    @Override
    public final void f(Object object) {
        if (this.e != null) {
            this.b.a(iyh.j.e("Too many requests"), new iwx());
            this.c = false;
            return;
        }
        this.e = object;
    }

    @Override
    public final void g() {
        this.d = true;
    }
}

