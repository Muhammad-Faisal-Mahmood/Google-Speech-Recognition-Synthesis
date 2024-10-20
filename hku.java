/*
 * Decompiled with CFR 0.152.
 */
public final class hku
extends hwv
implements hyg {
    public static final hku a;
    private static volatile hym b;
    private int c;
    private hli d;
    private byte e = (byte)2;

    static {
        hku hku2;
        a = hku2 = new hku();
        hwv.z(hku.class, hku2);
    }

    private hku() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0001", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new hku();
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
            synchronized (hku.class) {
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

