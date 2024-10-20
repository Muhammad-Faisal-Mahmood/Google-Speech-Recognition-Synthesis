/*
 * Decompiled with CFR 0.152.
 */
final class md
extends wr {
    final int a;
    final me b;
    private boolean c;

    public md(me me2, int n2) {
        this.b = me2;
        this.a = n2;
        this.c = false;
    }

    @Override
    public final void a() {
        if (!this.c) {
            me me2 = this.b;
            int n2 = this.a;
            me2.a.setVisibility(n2);
        }
    }

    @Override
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override
    public final void c() {
        this.c = true;
    }
}

