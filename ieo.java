/*
 * Decompiled with CFR 0.152.
 */
public final class ieo
implements hwz {
    static final hwz a;
    static final hwz b;
    static final hwz c;
    public static final hwz d;
    public static final hwz e;
    static final hwz f;
    static final hwz g;
    static final hwz h;
    static final hwz i;
    static final hwz j;
    static final hwz k;
    static final hwz l;
    public static final hwz m;
    static final hwz n;
    static final hwz o;
    public static final hwz p;
    public static final hwz q;
    public static final hwz r;
    public static final hwz s;
    public static final hwz t;
    public static final hwz u;
    private final int v;

    static {
        u = new ieo(20);
        t = new ieo(19);
        s = new ieo(18);
        r = new ieo(17);
        q = new ieo(16);
        p = new ieo(15);
        o = new ieo(14);
        n = new ieo(13);
        m = new ieo(12);
        l = new ieo(11);
        k = new ieo(10);
        j = new ieo(9);
        i = new ieo(8);
        h = new ieo(7);
        g = new ieo(6);
        f = new ieo(5);
        e = new ieo(4);
        d = new ieo(3);
        c = new ieo(2);
        b = new ieo(1);
        a = new ieo(0);
    }

    private ieo(int n2) {
        this.v = n2;
    }

    @Override
    public final boolean a(int n2) {
        switch (this.v) {
            default: {
                return a.F(n2) != 0;
            }
            case 19: {
                return a.B(n2) != 0;
            }
            case 18: {
                switch (n2) {
                    default: {
                        return false;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                }
                return true;
            }
            case 17: {
                return a.I(n2);
            }
            case 16: {
                return a.I(n2);
            }
            case 15: {
                return a.K(n2);
            }
            case 14: {
                return a.I(n2);
            }
            case 13: {
                return idi.g(n2) != 0;
            }
            case 12: {
                return igr.b(n2) != null;
            }
            case 11: {
                return a.I(n2);
            }
            case 10: {
                return a.J(n2);
            }
            case 9: {
                return a.H(n2);
            }
            case 8: {
                return a.H(n2);
            }
            case 7: {
                return a.K(n2);
            }
            case 6: {
                return a.H(n2);
            }
            case 5: {
                Object object = n2 != 0 ? (n2 != 1 ? null : iex.b) : iex.a;
                return object != null;
            }
            case 4: {
                return a.G(n2);
            }
            case 3: {
                return a.I(n2);
            }
            case 2: {
                return a.I(n2);
            }
            case 1: {
                return idi.a(n2) != 0;
            }
            case 0: {
                return a.I(n2);
            }
        }
    }
}

