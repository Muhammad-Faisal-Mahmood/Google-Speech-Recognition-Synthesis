/*
 * Decompiled with CFR 0.152.
 */
public final class dvn
extends hwv
implements hyg {
    public static final dvn a;
    private static volatile hym c;
    public hya b = hya.a;

    static {
        dvn dvn2;
        a = dvn2 = new dvn();
        hwv.z(dvn.class, dvn2);
    }

    private dvn() {
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
            object = dvm.a;
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", object});
        }
        if (n2 == 3) {
            return new dvn();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (dvn.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

