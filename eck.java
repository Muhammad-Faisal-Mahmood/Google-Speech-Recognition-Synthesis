/*
 * Decompiled with CFR 0.152.
 */
public final class eck
implements hwz {
    static final hwz a;
    static final hwz b;
    static final hwz c;
    static final hwz d;
    static final hwz e;
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
        u = new eck(20);
        t = new eck(19);
        s = new eck(18);
        r = new eck(17);
        q = new eck(16);
        p = new eck(15);
        o = new eck(14);
        n = new eck(13);
        m = new eck(12);
        l = new eck(11);
        k = new eck(10);
        j = new eck(9);
        i = new eck(8);
        h = new eck(7);
        g = new eck(6);
        f = new eck(5);
        e = new eck(4);
        d = new eck(3);
        c = new eck(2);
        b = new eck(1);
        a = new eck(0);
    }

    private eck(int n2) {
        this.v = n2;
    }

    @Override
    public final boolean a(int n2) {
        switch (this.v) {
            default: {
                return a.G(n2);
            }
            case 19: {
                return a.I(n2);
            }
            case 18: {
                return fhq.g(n2) != 0;
            }
            case 17: {
                return a.H(n2);
            }
            case 16: {
                return a.J(n2);
            }
            case 15: {
                return a.I(n2);
            }
            case 14: {
                return a.I(n2);
            }
            case 13: {
                return fao.b(n2) != null;
            }
            case 12: {
                return eyf.b(n2) != null;
            }
            case 11: {
                return ews.b(n2) != null;
            }
            case 10: {
                return eqz.b(n2) != null;
            }
            case 9: {
                return eqw.b(n2) != null;
            }
            case 8: {
                return elz.b(n2) != null;
            }
            case 7: {
                Object object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? null : efw.e) : efw.d) : efw.c) : efw.b) : efw.a;
                return object != null;
            }
            case 6: {
                return efs.b(n2) != null;
            }
            case 5: {
                return edo.b(n2) != null;
            }
            case 4: {
                return n2 == 0 || n2 == 1 || n2 == 2 || n2 == 3 || n2 == 10;
            }
            case 3: {
                return edc.b(n2) != null;
            }
            case 2: {
                return a.G(n2);
            }
            case 1: {
                return ech.b(n2) != null;
            }
            case 0: 
        }
        return a.I(n2);
    }
}

