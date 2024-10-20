/*
 * Decompiled with CFR 0.152.
 */
public final class ifd
extends hwv
implements hyg {
    public static final ifd a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        ifd ifd2;
        a = ifd2 = new ifd();
        hwv.z(ifd.class, ifd2);
    }

    private ifd() {
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
            return new hyq(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", ifa.class, ifc.class, ifb.class, iei.class});
        }
        if (n2 == 3) {
            return new ifd();
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
            synchronized (ifd.class) {
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

