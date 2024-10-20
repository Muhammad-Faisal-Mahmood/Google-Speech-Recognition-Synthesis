/*
 * Decompiled with CFR 0.152.
 */
public final class euj
extends hwv
implements hyg {
    public static final euj a;
    private static volatile hym e;
    public int b = 0;
    public Object c;
    public eao d;
    private int f;

    static {
        euj euj2;
        a = euj2 = new euj();
        hwv.z(euj.class, euj2);
    }

    private euj() {
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
            return new hyq(a, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002<\u0000\u0004<\u0000", new Object[]{"c", "b", "f", "d", eco.class, eau.class});
        }
        if (n2 == 3) {
            return new euj();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (euj.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

