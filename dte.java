/*
 * Decompiled with CFR 0.152.
 */
public final class dte
extends hwv
implements hyg {
    public static final dte a;
    public static final gpm j;
    private static volatile hym k;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;
    public String f = "";
    public String g = "";
    public hxb h = hww.a;
    public boolean i;

    static {
        dte dte2;
        a = dte2 = new dte();
        hwv.z(dte.class, dte2);
        j = hwv.F(dsy.a, dte2, dte2, 334728578, hzm.k);
    }

    private dte() {
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
            return new hyq(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006'\u0007\u1007\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (n2 == 3) {
            return new dte();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (dte.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

