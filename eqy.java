/*
 * Decompiled with CFR 0.152.
 */
public final class eqy
extends hwv
implements hyg {
    public static final eqy a;
    private static volatile hym g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f = -1;

    static {
        eqy eqy2;
        a = eqy2 = new eqy();
        hwv.z(eqy.class, eqy2);
    }

    private eqy() {
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
            return new hyq(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002<\u0000\u0003<\u0000\u0004\u1004\u0001", new Object[]{"d", "c", "b", "e", object, ebt.class, ebq.class, "f"});
        }
        if (n2 == 3) {
            return new eqy();
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
            synchronized (eqy.class) {
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

