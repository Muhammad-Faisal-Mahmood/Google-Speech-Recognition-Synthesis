/*
 * Decompiled with CFR 0.152.
 */
public final class dpn
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
        u = new dpn(20);
        t = new dpn(19);
        s = new dpn(18);
        r = new dpn(17);
        q = new dpn(16);
        p = new dpn(15);
        o = new dpn(14);
        n = new dpn(13);
        m = new dpn(12);
        l = new dpn(11);
        k = new dpn(10);
        j = new dpn(9);
        i = new dpn(8);
        h = new dpn(7);
        g = new dpn(6);
        f = new dpn(5);
        e = new dpn(4);
        d = new dpn(3);
        c = new dpn(2);
        b = new dpn(1);
        a = new dpn(0);
    }

    private dpn(int n2) {
        this.v = n2;
    }

    @Override
    public final boolean a(int n2) {
        int n3 = this.v;
        Object object = null;
        Object var4_4 = null;
        switch (n3) {
            default: {
                if (ecd.b(n2) == null) break;
                return true;
            }
            case 19: {
                return ecb.b(n2) != null;
            }
            case 18: {
                return a.I(n2);
            }
            case 17: {
                return ebv.b(n2) != null;
            }
            case 16: {
                return ebu.b(n2) != null;
            }
            case 15: {
                return ebs.b(n2) != null;
            }
            case 14: {
                return ebr.b(n2) != null;
            }
            case 13: {
                return ebp.b(n2) != null;
            }
            case 12: {
                return ebo.b(n2) != null;
            }
            case 11: {
                return ebg.b(n2) != null;
            }
            case 10: {
                return ebc.b(n2) != null;
            }
            case 9: {
                return eap.b(n2) != null;
            }
            case 8: {
                return eal.b(n2) != null;
            }
            case 7: {
                return dzz.b(n2) != null;
            }
            case 6: {
                return dox.c(n2) != 0;
            }
            case 5: {
                return dzw.b(n2) != null;
            }
            case 4: {
                return dox.e(n2) != 0;
            }
            case 3: {
                object = n2 != 0 ? (n2 != 1 ? var4_4 : dzu.b) : dzu.a;
                return object != null;
            }
            case 2: {
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 == 2) {
                            object = dzr.c;
                        }
                    } else {
                        object = dzr.b;
                    }
                } else {
                    object = dzr.a;
                }
                return object != null;
            }
            case 1: {
                return cqq.y(n2) != 0;
            }
            case 0: {
                if (a.B(n2) == 0) break;
                return true;
            }
        }
        return false;
    }
}

