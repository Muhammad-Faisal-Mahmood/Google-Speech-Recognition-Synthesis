/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class aeh {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Boolean k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public Integer w;
    public final gzx x;

    public aeh() {
        int n2 = gzx.d;
        this.x = hct.a;
    }

    public aeh(aei aei2) {
        this.a = aei2.b;
        this.b = aei2.c;
        this.c = aei2.d;
        this.d = aei2.e;
        this.e = aei2.f;
        this.f = aei2.g;
        this.g = aei2.h;
        this.h = aei2.i;
        this.i = aei2.j;
        this.j = aei2.k;
        this.k = aei2.l;
        this.l = aei2.n;
        this.m = aei2.o;
        this.n = aei2.p;
        this.o = aei2.q;
        this.p = aei2.r;
        this.q = aei2.s;
        this.r = aei2.t;
        this.s = aei2.u;
        this.t = aei2.v;
        this.u = aei2.w;
        this.v = aei2.x;
        this.w = aei2.y;
        this.x = aei2.z;
    }

    public final void a(byte[] byArray, int n2) {
        if (this.f != null) {
            Integer n3 = 3;
            if (!Objects.equals(n2, n3) && Objects.equals(this.g, n3)) {
                return;
            }
        }
        this.f = (byte[])byArray.clone();
        this.g = n2;
    }
}

