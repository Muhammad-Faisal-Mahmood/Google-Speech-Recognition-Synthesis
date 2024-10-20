/*
 * Decompiled with CFR 0.152.
 */
public final class hkj
extends hwv
implements hyg {
    public static final hkj a;
    public static final gpm h;
    private static volatile hym i;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public hxb f = hww.a;
    public boolean g;

    static {
        hkj hkj2;
        a = hkj2 = new hkj();
        hwv.z(hkj.class, hkj2);
        h = hwv.F(bos.a, hkj2, hkj2, 524000015, hzm.k);
    }

    private hkj() {
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
            hwz hwz2 = hqj.n;
            object = hqj.s;
            hwz hwz3 = hqj.f;
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u180c\u0002\u0004\u082c\u0005\u1007\u0003", new Object[]{"b", "c", hwz2, "d", "e", object, "f", hwz3, "g"});
        }
        if (n2 == 3) {
            return new hkj();
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
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (hkj.class) {
                hym2 = i;
                object = hym2;
                if (hym2 == null) {
                    i = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

