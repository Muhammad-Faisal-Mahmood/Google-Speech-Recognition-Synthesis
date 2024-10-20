/*
 * Decompiled with CFR 0.152.
 */
public final class icu
extends hwv
implements hyg {
    public static final icu a;
    public static final gpm f;
    private static volatile hym g;
    public int b;
    public int c;
    public float d;
    public int e = 1;

    static {
        icu icu2;
        a = icu2 = new icu();
        hwv.z(icu.class, icu2);
        f = hwv.F(ida.a, icu2, icu2, 293100, hzm.k);
    }

    private icu() {
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
            object = hqj.j;
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1001\u0001\u0003\u180c\u0000\u0004\u1004\u0002", new Object[]{"b", "d", "c", object, "e"});
        }
        if (n2 == 3) {
            return new icu();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (icu.class) {
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

