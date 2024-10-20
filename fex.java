/*
 * Decompiled with CFR 0.152.
 */
public final class fex
extends hwv
implements hyg {
    public static final fex a;
    private static volatile hym h;
    public int b;
    public hxk c = hyp.b;
    public hxa d = hwn.b;
    public hxk e;
    public String f;
    public hxk g;

    static {
        fex fex2;
        a = fex2 = new fex();
        hwv.z(fex.class, fex2);
    }

    private fex() {
        hyp hyp2 = hyp.b;
        this.e = hyp2;
        this.f = "";
        this.g = hyp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return (byte)1;
        }
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001a\u0002\u0013\u0003\u001b\u0004\u1008\u0000\u0005\u001b", new Object[]{"b", "c", "d", "e", idp.class, "f", "g", ffx.class});
        }
        if (n2 == 3) {
            return new fex();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (fex.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final void b() {
        hxa hxa2 = this.d;
        if (!hxa2.c()) {
            this.d = hwv.p(hxa2);
        }
    }

    public final void c() {
        hxk hxk2 = this.c;
        if (!hxk2.c()) {
            this.c = hwv.s(hxk2);
        }
    }
}

