/*
 * Decompiled with CFR 0.152.
 */
public final class ibl
extends hwv
implements hyg {
    public static final ibl a;
    private static volatile hym b;
    private int c;
    private int d;
    private byte e = (byte)2;

    static {
        ibl ibl2;
        a = ibl2 = new ibl();
        hwv.z(ibl.class, ibl2);
    }

    private ibl() {
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
            return this.e;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1504\u0000", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new ibl();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.e = by2;
            return null;
        }
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (ibl.class) {
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

