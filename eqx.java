/*
 * Decompiled with CFR 0.152.
 */
public final class eqx
extends hwv
implements hyg {
    public static final eqx a;
    private static volatile hym g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f = -1;

    static {
        eqx eqx2;
        a = eqx2 = new eqx();
        hwv.z(eqx.class, eqx2);
    }

    private eqx() {
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
            object = eck.k;
            hwz hwz2 = eck.j;
            return new hyq(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002<\u0000\u0003\u083f\u0000\u0004\u1004\u0001", new Object[]{"d", "c", "b", "e", object, ebt.class, hwz2, "f"});
        }
        if (n2 == 3) {
            return new eqx();
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
            synchronized (eqx.class) {
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

