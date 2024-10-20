/*
 * Decompiled with CFR 0.152.
 */
public final class dzn
extends hwv
implements hyg {
    public static final dzn a;
    private static volatile hym h;
    public int b;
    public int c = 0;
    public Object d;
    public dzs e;
    public long f;
    public int g;

    static {
        dzn dzn2;
        a = dzn2 = new dzn();
        hwv.z(dzn.class, dzn2);
    }

    private dzn() {
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
            return new hyq(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u1009\u0000\u0004\u1002\u0001\u0005\u1004\u0002", new Object[]{"d", "c", "b", dzm.class, dzt.class, "e", "f", "g"});
        }
        if (n2 == 3) {
            return new dzn();
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
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (dzn.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

