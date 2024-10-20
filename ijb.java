/*
 * Decompiled with CFR 0.152.
 */
public final class ijb
extends hwv
implements hyg {
    public static final ijb a;
    private static volatile hym c;
    public int b = 0;
    private Object d;

    static {
        ijb ijb2;
        a = ijb2 = new ijb();
        hwv.z(ijb.class, ijb2);
    }

    private ijb() {
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
            return new hyq(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"d", "b", ijc.class, ija.class});
        }
        if (n2 == 3) {
            return new ijb();
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
            synchronized (ijb.class) {
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

