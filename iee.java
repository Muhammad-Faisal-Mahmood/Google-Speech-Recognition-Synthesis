/*
 * Decompiled with CFR 0.152.
 */
public final class iee
extends hwv
implements hyg {
    public static final iee a;
    private static volatile hym b;
    private int c;
    private iec d;

    static {
        iee iee2;
        a = iee2 = new iee();
        hwv.z(iee.class, iee2);
    }

    private iee() {
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
            return (byte)1;
        }
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0002", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new iee();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (iee.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

