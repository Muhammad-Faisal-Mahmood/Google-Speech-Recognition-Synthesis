/*
 * Decompiled with CFR 0.152.
 */
public final class bvl {
    public int a;
    public int b;

    public bvl() {
    }

    public bvl(int n2) {
        this.a = n2;
        this.b = 1;
    }

    public final int a() {
        return this.a | this.b;
    }

    public final void b(int n2, int n3) {
        if (n3 == 1) {
            this.b = n2;
            return;
        }
        this.a = n2;
    }

    public final void c(int n2) {
        if (n2 == 1) {
            this.b = 0;
            return;
        }
        this.a = 0;
    }

    public final void d(lg lg2) {
        lg2 = lg2.itemView;
        this.b = lg2.getLeft();
        this.a = lg2.getTop();
        lg2.getRight();
        lg2.getBottom();
    }
}

