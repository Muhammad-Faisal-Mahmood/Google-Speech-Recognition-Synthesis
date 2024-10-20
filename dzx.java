/*
 * Decompiled with CFR 0.152.
 */
public final class dzx
extends hwv
implements hyg {
    public static final dzx a;
    private static volatile hym h;
    public int b;
    public int c = 4;
    public int d = 3;
    public boolean e = true;
    public eip f;
    public int g;

    static {
        dzx dzx2;
        a = dzx2 = new dzx();
        hwv.z(dzx.class, dzx2);
    }

    private dzx() {
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
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0005\u1009\u0003\u0006\u1004\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new dzx();
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
            synchronized (dzx.class) {
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

