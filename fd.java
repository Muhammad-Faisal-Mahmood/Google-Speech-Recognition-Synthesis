/*
 * Decompiled with CFR 0.152.
 */
final class fd
extends wr {
    final fe a;
    private boolean b;
    private int c;

    public fd(fe fe2) {
        this.a = fe2;
        this.b = false;
        this.c = 0;
    }

    @Override
    public final void a() {
        int n2;
        this.c = n2 = this.c + 1;
        if (n2 == this.a.a.size()) {
            wq wq2 = this.a.b;
            if (wq2 != null) {
                wq2.a();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override
    public final void b() {
        if (!this.b) {
            this.b = true;
            wq wq2 = this.a.b;
            if (wq2 != null) {
                wq2.b();
            }
        }
    }
}

