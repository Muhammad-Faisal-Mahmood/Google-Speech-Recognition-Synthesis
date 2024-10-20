/*
 * Decompiled with CFR 0.152.
 */
public final class icj
extends hwv
implements hyg {
    public static final icj a;
    private static volatile hym c;
    public hxk b;
    private int d;
    private ibv e;
    private ibv f;
    private ibv g;
    private byte h = (byte)2;

    static {
        icj icj2;
        a = icj2 = new icj();
        hwv.z(icj.class, icj2);
    }

    private icj() {
        this.b = hyp.b;
        hvu hvu2 = hvu.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0004\u0001\u041b\u0004\u1409\u0003\u0005\u1409\u0004\n\u1409\u0005", new Object[]{"d", "b", ici.class, "e", "f", "g"});
        }
        if (n2 == 3) {
            return new icj();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.h = by2;
            return null;
        }
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (icj.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

