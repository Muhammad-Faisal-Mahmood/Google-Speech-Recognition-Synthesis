/*
 * Decompiled with CFR 0.152.
 */
public final class iip
extends hwv
implements hyg {
    public static final iip a;
    private static volatile hym d;
    public hya b = hya.a;
    public hya c = hya.a;

    static {
        iip iip2;
        a = iip2 = new iip();
        hwv.z(iip.class, iip2);
    }

    private iip() {
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
            object = iin.a;
            dlm dlm2 = iio.a;
            return new hyq(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", object, "c", dlm2});
        }
        if (n2 == 3) {
            return new iip();
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
            synchronized (iip.class) {
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

