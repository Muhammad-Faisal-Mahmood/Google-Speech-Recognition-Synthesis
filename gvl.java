/*
 * Decompiled with CFR 0.152.
 */
class gvl
extends Enum {
    public static final /* enum */ gvl a;
    public static final /* enum */ gvl b;
    public static final /* enum */ gvl c;
    public static final /* enum */ gvl d;
    public static final /* enum */ gvl e;
    public static final /* enum */ gvl f;
    public static final /* enum */ gvl g;
    public static final /* enum */ gvl h;
    static final gvl[] i;
    private static final gvl[] j;

    static {
        gvl gvl2;
        gvl gvl3;
        a = gvl3 = new gvl("STRONG", 0);
        gvf gvf2 = new gvf();
        b = gvf2;
        gvg gvg2 = new gvg();
        c = gvg2;
        gvh gvh2 = new gvh();
        d = gvh2;
        e = gvl2 = new gvl("WEAK", 4);
        gvi gvi2 = new gvi();
        f = gvi2;
        gvj gvj2 = new gvj();
        g = gvj2;
        gvk gvk2 = new gvk();
        h = gvk2;
        j = new gvl[]{gvl3, gvf2, gvg2, gvh2, gvl2, gvi2, gvj2, gvk2};
        i = new gvl[]{gvl3, gvf2, gvg2, gvh2, gvl2, gvi2, gvj2, gvk2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public gvl() {
        void var2_-1;
        void var1_-1;
    }

    static final void c(gws gws2, gws gws3) {
        gws3.k(gws2.b());
        gwr.c(gws2.h(), gws3);
        gwr.c(gws3, gws2.f());
        gwr.e(gws2);
    }

    static final void d(gws gws2, gws gws3) {
        gws3.q(gws2.c());
        gwr.d(gws2.i(), gws3);
        gwr.d(gws3, gws2.g());
        gwr.f(gws2);
    }

    public static gvl[] values() {
        return (gvl[])j.clone();
    }

    public gws a(gvu gvu2, gws gws2, gws gws3, Object object) {
        return this.b(gvu2, object, gws2.a(), gws3);
    }

    final gws b(gvu gvu2, Object object, int n2, gws gws2) {
        switch (this.ordinal()) {
            default: {
                throw null;
            }
            case 7: {
                return new gwg(gvu2.h, object, n2, gws2);
            }
            case 6: {
                return new gwj(gvu2.h, object, n2, gws2);
            }
            case 5: {
                return new gwf(gvu2.h, object, n2, gws2);
            }
            case 4: {
                return new gwh(gvu2.h, object, n2, gws2);
            }
            case 3: {
                return new gvy(object, n2, gws2);
            }
            case 2: {
                return new gwb(object, n2, gws2);
            }
            case 1: {
                return new gvx(object, n2, gws2);
            }
            case 0: 
        }
        return new gvz(object, n2, gws2);
    }
}

