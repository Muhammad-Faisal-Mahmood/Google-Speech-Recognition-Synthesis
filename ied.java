/*
 * Decompiled with CFR 0.152.
 */
public final class ied
extends hwv
implements hyg {
    public static final ied a;
    private static volatile hym b;
    private int c;
    private iec d;

    static {
        ied ied2;
        a = ied2 = new ied();
        hwv.z(ied.class, ied2);
    }

    private ied() {
        Object[] objectArray = hyp.a;
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u1009\u0003", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new ied();
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
            synchronized (ied.class) {
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

