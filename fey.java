/*
 * Decompiled with CFR 0.152.
 */
public final class fey
extends hwv
implements hyg {
    public static final hxc a;
    public static final fey b;
    private static volatile hym d;
    public hxb c = hww.a;

    static {
        fey fey2;
        a = new dvg(5);
        b = fey2 = new fey();
        hwv.z(fey.class, fey2);
    }

    private fey() {
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
            return new hyq(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
        }
        if (n2 == 3) {
            return new fey();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (fey.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

