/*
 * Decompiled with CFR 0.152.
 */
public final class fil
extends hwv
implements hyg {
    public static final fil a;
    private static volatile hym g;
    public int b;
    public String c = "";
    public hxk d = hyp.b;
    public hxa e = hwn.b;
    public hxk f = hyp.b;

    static {
        fil fil2;
        a = fil2 = new fil();
        hwv.z(fil.class, fil2);
    }

    private fil() {
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
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u1008\u0000\u0002\u001a\u0003$\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", fio.class});
        }
        if (n2 == 3) {
            return new fil();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (fil.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

