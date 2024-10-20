/*
 * Decompiled with CFR 0.152.
 */
public final class iik
extends hwv
implements hyg {
    public static final iik a;
    private static volatile hym g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    private byte h = (byte)2;

    static {
        iik iik2;
        a = iik2 = new iik();
        hwv.z(iik.class, iik2);
    }

    private iik() {
        Object[] objectArray = hyp.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = ieo.u;
            hwz hwz2 = hqj.e;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0001\u0001\u1508\u0000\u0003\u1008\u0003\u0007\u180c\u0007\t\u180c\t", new Object[]{"b", "c", "d", "e", object, "f", hwz2});
        }
        if (n2 == 3) {
            return new iik();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.h = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (iik.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

