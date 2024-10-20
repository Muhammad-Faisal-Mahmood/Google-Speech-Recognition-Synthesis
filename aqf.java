/*
 * Decompiled with CFR 0.152.
 */
public final class aqf {
    public int a;
    public int b;
    private final byte[] c;
    private final int d;

    public aqf(byte[] byArray) {
        this.c = byArray;
        this.d = byArray.length;
    }

    public final int a(int n2) {
        int n3 = this.a;
        int n4 = this.b;
        int n5 = n3 + 1;
        byte[] byArray = this.c;
        n4 = Math.min(n2, 8 - n4);
        n3 = (byArray[n3] & 0xFF) >> this.b & 255 >> 8 - n4;
        while (n4 < n2) {
            n3 |= (this.c[n5] & 0xFF) << n4;
            n4 += 8;
            ++n5;
        }
        this.b(n2);
        return n3 & -1 >>> 32 - n2;
    }

    public final void b(int n2) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3;
                int n3;
                int n4 = this.a;
                int n5 = n2 / 8;
                this.a = n4 += n5;
                this.b = n3 = this.b + (n2 - n5 * 8);
                n5 = n4;
                n2 = n3;
                if (n3 > 7) {
                    this.a = n5 = n4 + 1;
                    this.b = n2 = n3 - 8;
                }
                bl2 = bl3 = false;
                if (n5 < 0) break block4;
                n4 = this.d;
                if (n5 < n4) break block5;
                bl2 = bl3;
                if (n5 != n4) break block4;
                bl2 = bl3;
                if (n2 != 0) break block4;
            }
            bl2 = true;
        }
        abr.f(bl2);
    }

    public final boolean c() {
        byte by2 = this.c[this.a];
        int n2 = this.b;
        this.b(1);
        return 1 == ((by2 & 0xFF) >> n2 & 1);
    }
}

