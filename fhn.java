/*
 * Decompiled with CFR 0.152.
 */
public final class fhn
implements hwz {
    static final hwz a;
    static final hwz b;
    static final hwz c;
    static final hwz d;
    static final hwz e;
    static final hwz f;
    static final hwz g;
    static final hwz h;
    static final hwz i;
    static final hwz j;
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
        u = new fhn(20);
        t = new fhn(19);
        s = new fhn(18);
        r = new fhn(17);
        q = new fhn(16);
        p = new fhn(15);
        o = new fhn(14);
        n = new fhn(13);
        m = new fhn(12);
        l = new fhn(11);
        k = new fhn(10);
        j = new fhn(9);
        i = new fhn(8);
        h = new fhn(7);
        g = new fhn(6);
        f = new fhn(5);
        e = new fhn(4);
        d = new fhn(3);
        c = new fhn(2);
        b = new fhn(1);
        a = new fhn(0);
    }

    private fhn(int n2) {
        this.v = n2;
    }

    @Override
    public final boolean a(int n2) {
        switch (this.v) {
            default: {
                switch (n2) {
                    default: {
                        return false;
                    }
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: {
                        return true;
                    }
                }
            }
            case 19: {
                switch (n2) {
                    default: {
                        return false;
                    }
                    case 0: 
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
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                }
                return true;
            }
            case 18: {
                return n2 == 0 || n2 == 1 || n2 == 2 || n2 == 3;
            }
            case 17: {
                return hhk.i(n2) != 0;
            }
            case 16: {
                return n2 == 0 || n2 == 1 || n2 == 2 || n2 == 3;
            }
            case 15: {
                return hhk.az(n2) != 0;
            }
            case 14: {
                return hhk.i(n2) != 0;
            }
            case 13: {
                switch (n2) {
                    default: {
                        return false;
                    }
                    case 0: 
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
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                }
                return true;
            }
            case 12: {
                Object object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? null : gql.c) : gql.b) : gql.a;
                return object != null;
            }
            case 11: {
                return a.H(n2);
            }
            case 10: {
                return a.I(n2);
            }
            case 9: {
                return a.G(n2);
            }
            case 8: {
                return a.J(n2);
            }
            case 7: {
                return a.C(n2) != 0;
            }
            case 6: {
                return a.H(n2);
            }
            case 5: {
                return a.K(n2);
            }
            case 4: {
                return a.H(n2);
            }
            case 3: {
                return a.J(n2);
            }
            case 2: {
                return a.K(n2);
            }
            case 1: {
                return a.G(n2);
            }
            case 0: 
        }
        return a.G(n2);
    }
}

