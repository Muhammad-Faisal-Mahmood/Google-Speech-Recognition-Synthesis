/*
 * Decompiled with CFR 0.152.
 */
public final class idu
extends hwv
implements hyg {
    public static final idu a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        idu idu2;
        a = idu2 = new idu();
        hwv.z(idu.class, idu2);
    }

    private idu() {
        Object[] objectArray = hyp.a;
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
            return new hyq(a, "\u0001\u0002\u0001\u0000\b\t\u0002\u0000\u0000\u0000\b;\u0000\t\u083f\u0000", new Object[]{"c", "b", object});
        }
        if (n2 == 3) {
            return new idu();
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
            synchronized (idu.class) {
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

