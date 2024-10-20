/*
 * Decompiled with CFR 0.152.
 */
public final class ll {
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public final void a(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.h = true;
        boolean bl2 = this.g;
        boolean bl3 = false;
        boolean bl4 = n3 == Integer.MIN_VALUE;
        if (n2 == Integer.MIN_VALUE) {
            bl3 = true;
        }
        boolean bl5 = true != bl2 ? bl3 : bl4;
        int n4 = true != bl2 ? n2 : n3;
        if (bl2) {
            bl4 = bl3;
        }
        if (!bl2) {
            n2 = n3;
        }
        if (!bl5) {
            this.a = n4;
        }
        if (!bl4) {
            this.b = n2;
        }
    }
}

