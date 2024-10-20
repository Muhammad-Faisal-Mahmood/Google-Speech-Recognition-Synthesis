/*
 * Decompiled with CFR 0.152.
 */
public final class apw {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public apw() {
    }

    public apw(apw apw2) {
        this.a = apw2.a;
        this.b = apw2.b;
        this.c = apw2.c;
        this.d = apw2.d;
        this.e = apw2.e;
        this.f = apw2.f;
        this.g = apw2.g;
    }

    public final void a(int n2) {
        if (apx.b(n2)) {
            int n3;
            int n4;
            int n5;
            int n6 = n2 >>> 19 & 3;
            int n7 = 1;
            if (n6 != 1 && (n5 = n2 >>> 17 & 3) != 0 && (n4 = n2 >>> 12 & 0xF) != 0 && n4 != 15 && (n3 = n2 >>> 10 & 3) != 3) {
                int n8 = n4 - 1;
                this.a = n6;
                this.b = apx.a[3 - n5];
                this.d = n4 = apx.b[n3];
                if (n6 == 2) {
                    this.d = n3 = n4 / 2;
                } else {
                    n3 = n4;
                    if (n6 == 0) {
                        this.d = n3 = n4 / 4;
                    }
                }
                int n9 = n2 >>> 9 & 1;
                n4 = 1152;
                if (n5 != 1) {
                    if (n5 != 2) {
                        n4 = 384;
                    }
                } else if (n6 != 3) {
                    n4 = 576;
                }
                this.g = n4;
                if (n5 == 3) {
                    n4 = n6 == 3 ? apx.c[n8] : apx.d[n8];
                    this.f = n4;
                    this.c = (n4 * 12 / n3 + n9) * 4;
                } else {
                    n4 = 144;
                    if (n6 == 3) {
                        n4 = n5 == 2 ? apx.e[n8] : apx.f[n8];
                        this.f = n4;
                        this.c = n4 * 144 / n3 + n9;
                    } else {
                        this.f = n6 = apx.g[n8];
                        if (n5 == 1) {
                            n4 = 72;
                        }
                        this.c = n4 * n6 / n3 + n9;
                    }
                }
                n2 = (n2 >> 6 & 3) == 3 ? n7 : 2;
                this.e = n2;
            }
        }
    }
}

