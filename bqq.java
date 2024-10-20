/*
 * Decompiled with CFR 0.152.
 */
public final class bqq
extends hwv
implements hyg {
    public static final bqq a;
    private static volatile hym b;
    private hya c = hya.a;

    static {
        bqq bqq2;
        a = bqq2 = new bqq();
        hwv.z(bqq.class, bqq2);
    }

    private bqq() {
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
            object = bqp.a;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0001\u0000\u0000\u00052", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new bqq();
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
            synchronized (bqq.class) {
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

