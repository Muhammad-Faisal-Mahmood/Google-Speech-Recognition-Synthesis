/*
 * Decompiled with CFR 0.152.
 */
public final class nh {
    public final int a;
    public final int b;
    public final Object c;

    public nh() {
        this.c = new nh[256];
        this.b = 0;
        this.a = 0;
    }

    public nh(int n2, int n3) {
        this.c = null;
        this.b = n2;
        n2 = n3 &= 7;
        if (n3 == 0) {
            n2 = 8;
        }
        this.a = n2;
    }

    public nh(int n2, int n3, jrk jrk2) {
        this.a = n2;
        this.b = n3;
        this.c = jrk2;
    }

    public final int a(boolean bl2) {
        int n2 = bl2 ? this.b : this.a;
        return n2;
    }
}

