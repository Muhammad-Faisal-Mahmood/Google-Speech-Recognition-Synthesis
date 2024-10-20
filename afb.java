/*
 * Decompiled with CFR 0.152.
 */
public class afb {
    public final int a;
    public final int b;
    public final boolean c;
    public final gzx d;
    public final gzx e;
    public final gzx f;
    public final aez g;
    public final gzx h;
    public final int i;
    public final hac j;
    public final hav k;

    static {
        new afb(new afa());
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
        agf.z(5);
        agf.z(6);
        agf.z(7);
        agf.z(8);
        agf.z(9);
        agf.z(10);
        agf.z(11);
        agf.z(12);
        agf.z(13);
        agf.z(14);
        agf.z(15);
        agf.z(16);
        agf.z(17);
        agf.z(18);
        agf.z(19);
        agf.z(20);
        agf.z(21);
        agf.z(22);
        agf.z(23);
        agf.z(24);
        agf.z(25);
        agf.z(26);
        agf.z(27);
        agf.z(28);
        agf.z(29);
        agf.z(30);
        agf.z(31);
    }

    protected afb(afa afa2) {
        this.a = afa2.a;
        this.b = afa2.b;
        this.c = afa2.c;
        this.d = afa2.d;
        this.e = afa2.e;
        this.f = afa2.f;
        this.g = afa2.g;
        this.h = afa2.h;
        this.i = afa2.i;
        this.j = hac.i(afa2.j);
        this.k = hav.n(afa2.k);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (afb)object;
            if (this.c == ((afb)object).c && this.a == ((afb)object).a && this.b == ((afb)object).b && fvd.z(this.d, ((afb)object).d) && fvd.z(this.e, ((afb)object).e) && fvd.z(this.f, ((afb)object).f) && this.g.equals(((afb)object).g) && fvd.z(this.h, ((afb)object).h) && this.i == ((afb)object).i && this.j.equals(((afb)object).j) && this.k.equals(((afb)object).k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.c;
        gzx gzx2 = this.d;
        return ((((((((((((n2 - 1048002209) * 31 + this.a) * 31 + this.b) * 31 + gzx2.hashCode()) * 961 + this.e.hashCode()) * 961 + Integer.MAX_VALUE) * 31 + Integer.MAX_VALUE) * 31 + this.f.hashCode()) * 31 + 29791) * 31 + this.h.hashCode()) * 31 + this.i) * 887503681 + this.j.hashCode()) * 31 + this.k.hashCode();
    }
}

