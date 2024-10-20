/*
 * Decompiled with CFR 0.152.
 */
public final class hlu
extends hwv
implements hyg {
    public static final hlu a;
    private static volatile hym g;
    public int b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        hlu hlu2;
        a = hlu2 = new hlu();
        hwv.z(hlu.class, hlu2);
    }

    private hlu() {
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
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1007\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (n2 == 3) {
            return new hlu();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (hlu.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

