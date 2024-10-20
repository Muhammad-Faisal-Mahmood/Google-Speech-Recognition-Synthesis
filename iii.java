/*
 * Decompiled with CFR 0.152.
 */
public final class iii
extends hwv
implements hyg {
    public static final iii a;
    public static final gpm d;
    private static volatile hym e;
    public int b;
    public String c = "";

    static {
        iii iii2;
        a = iii2 = new iii();
        hwv.z(iii.class, iii2);
        d = hwv.F(ikd.a, iii2, iii2, 131098250, hzm.k);
    }

    private iii() {
        hww hww2 = hww.a;
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new iii();
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
            synchronized (iii.class) {
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

