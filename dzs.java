/*
 * Decompiled with CFR 0.152.
 */
public final class dzs
extends hwv
implements hyg {
    public static final dzs a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        dzs dzs2;
        a = dzs2 = new dzs();
        hwv.z(dzs.class, dzs2);
    }

    private dzs() {
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
            return new hyq(a, "\u0004\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", dzq.class, dzp.class, dzo.class});
        }
        if (n2 == 3) {
            return new dzs();
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
            synchronized (dzs.class) {
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

