/*
 * Decompiled with CFR 0.152.
 */
public final class icy
extends hwv
implements hyg {
    public static final icy a;
    public static final gpm c;
    private static volatile hym d;
    public hxb b = hww.a;

    static {
        icy icy2;
        a = icy2 = new icy();
        hwv.z(icy.class, icy2);
        c = hwv.F(ida.a, icy2, icy2, 313216766, hzm.k);
    }

    private icy() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"b"});
        }
        if (n2 == 3) {
            return new icy();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (icy.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

