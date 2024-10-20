/*
 * Decompiled with CFR 0.152.
 */
public final class icw
extends hwv
implements hyg {
    public static final icw a;
    private static volatile hym d;
    public int b;
    public String c = "";
    private int e;

    static {
        icw icw2;
        a = icw2 = new icw();
        hwv.z(icw.class, icw2);
    }

    private icw() {
    }

    public static /* synthetic */ void c(icw icw2) {
        icw2.b |= 2;
        icw2.e = 1;
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001", new Object[]{"b", "c", "e"});
        }
        if (n2 == 3) {
            return new icw();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (icw.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

