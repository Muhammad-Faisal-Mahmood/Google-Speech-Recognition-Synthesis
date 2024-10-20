/*
 * Decompiled with CFR 0.152.
 */
public final class hmd
extends hwv
implements hyg {
    public static final hmd a;
    private static volatile hym d;
    public int b;
    public int c;

    static {
        hmd hmd2;
        a = hmd2 = new hmd();
        hwv.z(hmd.class, hmd2);
    }

    private hmd() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new hmd();
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
            synchronized (hmd.class) {
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

