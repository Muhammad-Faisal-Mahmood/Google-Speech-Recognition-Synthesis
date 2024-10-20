/*
 * Decompiled with CFR 0.152.
 */
public final class dvj
extends hwv
implements hyg {
    public static final dvj a;
    private static volatile hym e;
    public int b;
    public String c = "";
    public long d;

    static {
        dvj dvj2;
        a = dvj2 = new dvj();
        hwv.z(dvj.class, dvj2);
    }

    private dvj() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new dvj();
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
            synchronized (dvj.class) {
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

