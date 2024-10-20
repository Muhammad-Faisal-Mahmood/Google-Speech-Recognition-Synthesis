/*
 * Decompiled with CFR 0.152.
 */
public final class anq {
    public long a;
    public long b;
    public anq c;
    public hti d;

    public anq(long l2) {
        this.c(l2);
    }

    public final int a(long l2) {
        long l3 = this.a;
        int n2 = this.d.a;
        return (int)(l2 - l3);
    }

    public final anq b() {
        this.d = null;
        anq anq2 = this.c;
        this.c = null;
        return anq2;
    }

    public final void c(long l2) {
        boolean bl2 = this.d == null;
        abr.f(bl2);
        this.a = l2;
        this.b = l2 + 65536L;
    }
}

