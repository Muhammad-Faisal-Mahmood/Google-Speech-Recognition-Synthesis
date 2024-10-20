/*
 * Decompiled with CFR 0.152.
 */
public final class ijj
extends hwv
implements hyg {
    public static final ijj a;
    private static volatile hym k;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        ijj ijj2;
        a = ijj2 = new ijj();
        hwv.z(ijj.class, ijj2);
    }

    private ijj() {
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
            return new hyq(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1008\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (n2 == 3) {
            return new ijj();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (ijj.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

