/*
 * Decompiled with CFR 0.152.
 */
public final class hkr
extends hwv
implements hyg {
    public static final hkr a;
    private static volatile hym b;
    private int c;
    private hli d;
    private byte e = (byte)2;

    static {
        hkr hkr2;
        a = hkr2 = new hkr();
        hwv.z(hkr.class, hkr2);
    }

    private hkr() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004\u1409\u0003", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new hkr();
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
            synchronized (hkr.class) {
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

