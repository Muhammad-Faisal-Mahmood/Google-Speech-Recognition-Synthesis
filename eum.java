/*
 * Decompiled with CFR 0.152.
 */
public final class eum
extends hwv
implements hyg {
    public static final eum a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        eum eum2;
        a = eum2 = new eum();
        hwv.z(eum.class, eum2);
    }

    private eum() {
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
            return new hyq(a, "\u0004\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", eco.class, eaq.class, hwh.class});
        }
        if (n2 == 3) {
            return new eum();
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
            synchronized (eum.class) {
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

