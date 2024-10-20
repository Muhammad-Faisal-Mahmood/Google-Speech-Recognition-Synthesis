/*
 * Decompiled with CFR 0.152.
 */
public final class apt {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;
    public final aek i;
    public final awg j;

    public apt(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2, awg awg2, aek aek2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
        this.f = n7;
        this.g = n8;
        this.h = l2;
        this.j = awg2;
        this.i = null;
    }

    public apt(byte[] object, int n2) {
        object = new jgs((byte[])object);
        ((jgs)object).j(136);
        this.a = ((jgs)object).h(16);
        this.b = ((jgs)object).h(16);
        this.c = ((jgs)object).h(24);
        this.d = ((jgs)object).h(24);
        this.e = ((jgs)object).h(20);
        this.f = ((jgs)object).h(3) + 1;
        this.g = ((jgs)object).h(5) + 1;
        n2 = ((jgs)object).h(4);
        int n3 = ((jgs)object).h(32);
        long l2 = agf.l(n2);
        this.h = agf.l(n3) | l2 << 32;
        this.j = null;
        this.i = null;
    }
}

