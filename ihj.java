/*
 * Decompiled with CFR 0.152.
 */
public final class ihj
extends hwv
implements hyg {
    public static final ihj a;
    private static volatile hym e;
    public int b;
    public String c = "";
    public int d;
    private int f;

    static {
        ihj ihj2;
        a = ihj2 = new ihj();
        hwv.z(ihj.class, ihj2);
    }

    private ihj() {
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
            object = hqj.p;
            hwz hwz2 = hqj.q;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u180c\u0000\u0003\u1008\u0001\u0004\u180c\u0002", new Object[]{"f", "b", object, "c", "d", hwz2});
        }
        if (n2 == 3) {
            return new ihj();
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
            synchronized (ihj.class) {
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

