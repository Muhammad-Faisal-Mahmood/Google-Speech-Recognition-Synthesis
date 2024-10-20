/*
 * Decompiled with CFR 0.152.
 */
public final class ifp
extends hwv
implements hyg {
    public static final ifp a;
    private static volatile hym c;
    public String b = "";
    private int d;

    static {
        ifp ifp2;
        a = ifp2 = new ifp();
        hwv.z(ifp.class, ifp2);
    }

    private ifp() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[]{"d", "b"});
        }
        if (n2 == 3) {
            return new ifp();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (ifp.class) {
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

