/*
 * Decompiled with CFR 0.152.
 */
public final class ebn
extends hwv
implements hyg {
    public static final ebn a;
    private static volatile hym c;
    public ebm b;
    private int d;

    static {
        ebn ebn2;
        a = ebn2 = new ebn();
        hwv.z(ebn.class, ebn2);
    }

    private ebn() {
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
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[]{"d", "b"});
        }
        if (n2 == 3) {
            return new ebn();
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
            synchronized (ebn.class) {
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

