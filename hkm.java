/*
 * Decompiled with CFR 0.152.
 */
public final class hkm
extends hwv
implements hyg {
    public static final hkm a;
    private static volatile hym b;
    private int c;
    private hlh d;
    private byte e = (byte)2;

    static {
        hkm hkm2;
        a = hkm2 = new hkm();
        hwv.z(hkm.class, hkm2);
    }

    private hkm() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new hkm();
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
            synchronized (hkm.class) {
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

