/*
 * Decompiled with CFR 0.152.
 */
public final class ict
extends hwv
implements hyg {
    public static final ict a;
    public static final gpm d;
    private static volatile hym e;
    public int b;
    public hvu c = hvu.b;

    static {
        ict ict2;
        a = ict2 = new ict();
        hwv.z(ict.class, ict2);
        d = hwv.F(ida.a, ict2, ict2, 293101, hzm.k);
    }

    private ict() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new ict();
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
            synchronized (ict.class) {
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

