/*
 * Decompiled with CFR 0.152.
 */
public final class mf {
    int a = 0;
    int b;
    int c;
    int d;
    int e;

    static final int e(int n2, int n3) {
        if (n2 > n3) {
            return 1;
        }
        if (n2 == n3) {
            return 2;
        }
        return 4;
    }

    public final void a(int n2) {
        this.a = n2 | this.a;
    }

    public final void b() {
        this.a = 0;
    }

    public final void c(int n2, int n3, int n4, int n5) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
    }

    public final boolean d() {
        int n2 = this.a;
        if ((n2 & 7) != 0 && (mf.e(this.d, this.b) & n2) == 0) {
            return false;
        }
        if ((n2 & 0x70) != 0 && (mf.e(this.d, this.c) << 4 & n2) == 0) {
            return false;
        }
        if ((n2 & 0x700) != 0 && (mf.e(this.e, this.b) << 8 & n2) == 0) {
            return false;
        }
        return (n2 & 0x7000) == 0 || (n2 & mf.e(this.e, this.c) << 12) != 0;
    }
}

