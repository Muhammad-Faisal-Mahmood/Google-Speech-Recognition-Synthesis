/*
 * Decompiled with CFR 0.152.
 */
public final class bqk
implements hwz {
    static final hwz a;
    public static final hwz b;
    public static final hwz c;
    public static final hwz d;
    public static final hwz e;
    public static final hwz f;
    public static final hwz g;
    public static final hwz h;
    public static final hwz i;
    public static final hwz j;
    public static final hwz k;
    public static final hwz l;
    public static final hwz m;
    public static final hwz n;
    public static final hwz o;
    public static final hwz p;
    public static final hwz q;
    public static final hwz r;
    public static final hwz s;
    public static final hwz t;
    public static final hwz u;
    private final int v;

    static {
        u = new bqk(20);
        t = new bqk(19);
        s = new bqk(18);
        r = new bqk(17);
        q = new bqk(16);
        p = new bqk(15);
        o = new bqk(14);
        n = new bqk(13);
        m = new bqk(12);
        l = new bqk(11);
        k = new bqk(10);
        j = new bqk(9);
        i = new bqk(8);
        h = new bqk(7);
        g = new bqk(6);
        f = new bqk(5);
        e = new bqk(4);
        d = new bqk(3);
        c = new bqk(2);
        b = new bqk(1);
        a = new bqk(0);
    }

    private bqk(int n2) {
        this.v = n2;
    }

    @Override
    public final boolean a(int n2) {
        switch (this.v) {
            default: {
                if (ctp.b(n2) == null) break;
                return true;
            }
            case 19: {
                return a.I(n2);
            }
            case 18: {
                return a.I(n2);
            }
            case 17: {
                return a.G(n2);
            }
            case 16: {
                return a.G(n2);
            }
            case 15: {
                return a.I(n2);
            }
            case 14: {
                return a.G(n2);
            }
            case 13: {
                return a.G(n2);
            }
            case 12: {
                return a.G(n2);
            }
            case 11: {
                return ctc.b(n2) != null;
            }
            case 10: {
                Object object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? null : cso.c) : cso.b) : cso.a;
                return object != null;
            }
            case 9: {
                return csn.b(n2) != null;
            }
            case 8: {
                return a.H(n2);
            }
            case 7: {
                return bua.b(n2) != null;
            }
            case 6: {
                return btz.b(n2) != null;
            }
            case 5: {
                return bty.b(n2) != null;
            }
            case 4: {
                return blf.f(n2) != 0;
            }
            case 3: {
                return btx.b(n2) != null;
            }
            case 2: {
                return a.H(n2);
            }
            case 1: {
                return a.G(n2);
            }
            case 0: {
                if (bql.b(n2) == null) break;
                return true;
            }
        }
        return false;
    }
}

