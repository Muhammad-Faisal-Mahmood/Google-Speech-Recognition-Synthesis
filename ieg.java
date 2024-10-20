/*
 * Decompiled with CFR 0.152.
 */
public final class ieg
extends hwv
implements hyg {
    public static final ieg a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        ieg ieg2;
        a = ieg2 = new ieg();
        hwv.z(ieg.class, ieg2);
    }

    private ieg() {
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
            object = hqj.t;
            return new hyq(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u083f\u0000\u0002;\u0000", new Object[]{"c", "b", object});
        }
        if (n2 == 3) {
            return new ieg();
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
            synchronized (ieg.class) {
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

