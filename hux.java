/*
 * Decompiled with CFR 0.152.
 */
public final class hux
extends hwv
implements hyg {
    public static final hxc a;
    public static final hux b;
    private static volatile hym e;
    public int c;
    public hxb d = hww.a;
    private int f;

    static {
        hux hux2;
        a = new dvg(9);
        b = hux2 = new hux();
        hwv.z(hux.class, hux2);
    }

    private hux() {
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
            object = hqj.g;
            hwz hwz2 = hqj.f;
            return new hyq(b, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u081e", new Object[]{"f", "c", object, "d", hwz2});
        }
        if (n2 == 3) {
            return new hux();
        }
        if (n2 == 4) {
            return new hwp(b);
        }
        if (n2 == 5) {
            return b;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (hux.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

