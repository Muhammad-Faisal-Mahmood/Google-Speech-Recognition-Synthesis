/*
 * Decompiled with CFR 0.152.
 */
public final class huy
extends hwv
implements hyg {
    public static final huy a;
    private static volatile hym b;

    static {
        huy huy2;
        a = huy2 = new huy();
        hwv.z(huy.class, huy2);
    }

    private huy() {
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
            return new hyq(a, "\u0000\u0000", null);
        }
        if (n2 == 3) {
            return new huy();
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
            synchronized (huy.class) {
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

