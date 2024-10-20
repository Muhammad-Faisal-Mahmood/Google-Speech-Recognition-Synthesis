/*
 * Decompiled with CFR 0.152.
 */
public final class ksn {
    public final Object a;
    public int b;
    public long c;

    public ksn() {
        this.a = new Object();
        this.c = Long.MIN_VALUE;
    }

    public ksn(grz grz2) {
        this.b = 0;
        this.c = 0L;
        this.a = grz2;
    }

    public final int a() {
        grz grz2 = (grz)this.a;
        long l2 = grz2.a();
        long l3 = this.c;
        return (int)Math.min((long)grz2.c, l2 - l3);
    }

    public final void b(int n2) {
        this.b = (this.b + n2) % ((grz)this.a).c;
    }
}

