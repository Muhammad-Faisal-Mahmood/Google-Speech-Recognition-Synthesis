/*
 * Decompiled with CFR 0.152.
 */
public final class fhv
extends hwv
implements hyg {
    public static final hxc a;
    public static final hxc b;
    public static final fhv c;
    private static volatile hym g;
    public int d;
    public hxb e;
    public hxb f;
    private int h;

    static {
        fhv fhv2;
        a = new dvg(6);
        b = new dvg(7);
        c = fhv2 = new fhv();
        hwv.z(fhv.class, fhv2);
    }

    private fhv() {
        hww hww2 = hww.a;
        this.e = hww2;
        this.f = hww2;
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
            hwz hwz2 = hqj.f;
            return new hyq(c, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u180c\u0001\u0003\u082c\u0004\u082c", new Object[]{"h", "d", object, "e", hwz2, "f", hwz2});
        }
        if (n2 == 3) {
            return new fhv();
        }
        if (n2 == 4) {
            return new hwp(c);
        }
        if (n2 == 5) {
            return c;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (fhv.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(c);
                }
            }
        }
        return object;
    }
}

