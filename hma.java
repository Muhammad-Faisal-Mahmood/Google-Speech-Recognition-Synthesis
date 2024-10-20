/*
 * Decompiled with CFR 0.152.
 */
public final class hma
extends hwv
implements hyg {
    public static final hma a;
    private static volatile hym f;
    public int b;
    public hlq c;
    public long d;
    public long e;

    static {
        hma hma2;
        a = hma2 = new hma();
        hwv.z(hma.class, hma2);
    }

    private hma() {
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1003\u0001\u0003\u1003\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new hma();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (hma.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

