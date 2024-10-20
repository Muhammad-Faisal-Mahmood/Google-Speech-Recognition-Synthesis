/*
 * Decompiled with CFR 0.152.
 */
public final class icm
extends hwv
implements hyg {
    public static final icm a;
    private static volatile hym b;
    private hya c = hya.a;

    static {
        icm icm2;
        a = icm2 = new icm();
        hwv.z(icm.class, icm2);
    }

    private icm() {
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
            object = icl.a;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0001\u0000\u0000\u00052", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new icm();
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
            synchronized (icm.class) {
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

