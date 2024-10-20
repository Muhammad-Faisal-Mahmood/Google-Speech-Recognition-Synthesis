/*
 * Decompiled with CFR 0.152.
 */
public final class ifq
extends hwv
implements hyg {
    public static final hxc a;
    public static final ifq b;
    private static volatile hym g;
    public int c;
    public ifp d;
    public igd e;
    public hxb f = hww.a;

    static {
        ifq ifq2;
        a = new dvg(10);
        b = ifq2 = new ifq();
        hwv.z(ifq.class, ifq2);
    }

    private ifq() {
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
            object = hqj.t;
            return new hyq(b, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001\u1009\u0000\u0003\u1009\u0002\u0006\u081e", new Object[]{"c", "d", "e", "f", object});
        }
        if (n2 == 3) {
            return new ifq();
        }
        if (n2 == 4) {
            return new hwp(b);
        }
        if (n2 == 5) {
            return b;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (ifq.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

