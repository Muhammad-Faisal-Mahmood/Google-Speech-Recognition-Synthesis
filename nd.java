/*
 * Decompiled with CFR 0.152.
 */
final class nd
implements ml {
    final nf a;
    private final my b;

    public nd(nf nf2, my my2) {
        jse.e(my2, "onBackPressedCallback");
        this.a = nf2;
        this.b = my2;
    }

    @Override
    public final void b() {
        this.a.a.remove(this.b);
        if (jse.i(this.a.b, this.b)) {
            this.b.a();
            this.a.b = null;
        }
        this.b.f(this);
        jqz jqz2 = this.b.d;
        if (jqz2 != null) {
            jqz2.a();
        }
        this.b.d = null;
    }
}

