/*
 * Decompiled with CFR 0.152.
 */
public final class iiy
extends hwv
implements hyg {
    public static final iiy a;
    private static volatile hym f;
    public int b;
    public int c = 0;
    public Object d;
    public float e;

    static {
        iiy iiy2;
        a = iiy2 = new iiy();
        hwv.z(iiy.class, iiy2);
    }

    private iiy() {
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
            object = iko.b;
            return new hyq(a, "\u0001\u0003\u0001\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u00014\u0000\u0004\u083f\u0000\u0006\u1001\u0003", new Object[]{"d", "c", "b", object, "e"});
        }
        if (n2 == 3) {
            return new iiy();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (iiy.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

