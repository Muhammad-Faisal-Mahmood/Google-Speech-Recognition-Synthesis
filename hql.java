/*
 * Decompiled with CFR 0.152.
 */
public final class hql
extends hwv
implements hyg {
    public static final hql a;
    private static volatile hym c;
    public long b = -1L;
    private int d;

    static {
        hql hql2;
        a = hql2 = new hql();
        hwv.z(hql.class, hql2);
    }

    private hql() {
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
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u1002\u0003", new Object[]{"d", "b"});
        }
        if (n2 == 3) {
            return new hql();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (hql.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

