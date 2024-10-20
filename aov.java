/*
 * Decompiled with CFR 0.152.
 */
abstract class aov {
    public final int a;
    public final aex b;
    public final int c;
    public final adu d;

    public aov(int n2, aex aex2, int n3) {
        this.a = 0;
        this.b = aex2;
        this.c = n3;
        this.d = aex2.a(n3);
    }

    public abstract int b();

    public abstract boolean c(aov var1);
}

