/*
 * Decompiled with CFR 0.152.
 */
public final class ijp
extends hwv
implements hyg {
    public static final ijp a;
    private static volatile hym e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ijp ijp2;
        a = ijp2 = new ijp();
        hwv.z(ijp.class, ijp2);
    }

    private ijp() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new ijp();
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
            synchronized (ijp.class) {
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

