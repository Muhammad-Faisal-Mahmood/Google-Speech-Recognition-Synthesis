/*
 * Decompiled with CFR 0.152.
 */
public final class eba
extends hwv
implements ebb {
    public static final eba a;
    private static volatile hym e;
    public int b;
    public edb c;
    public ebm d;

    static {
        eba eba2;
        a = eba2 = new eba();
        hwv.z(eba.class, eba2);
    }

    private eba() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new eba();
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
            synchronized (eba.class) {
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

