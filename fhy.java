/*
 * Decompiled with CFR 0.152.
 */
public final class fhy
extends hwv
implements hyg {
    public static final fhy a;
    private static volatile hym h;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public boolean f = true;
    public fhi g;

    static {
        fhy fhy2;
        a = fhy2 = new fhy();
        hwv.z(fhy.class, fhy2);
    }

    private fhy() {
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
            object = hqj.n;
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1009\u0004", new Object[]{"b", "c", "d", object, "e", "f", "g"});
        }
        if (n2 == 3) {
            return new fhy();
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
            synchronized (fhy.class) {
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

