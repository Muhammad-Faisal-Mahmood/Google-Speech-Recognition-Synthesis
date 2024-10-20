/*
 * Decompiled with CFR 0.152.
 */
public final class ihd
extends hwv
implements hyg {
    public static final ihd a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        ihd ihd2;
        a = ihd2 = new ihd();
        hwv.z(ihd.class, ihd2);
    }

    private ihd() {
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
            return new hyq(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", igy.class, ihg.class, ihh.class});
        }
        if (n2 == 3) {
            return new ihd();
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
            synchronized (ihd.class) {
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

