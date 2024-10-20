/*
 * Decompiled with CFR 0.152.
 */
public final class igd
extends hwv
implements hyg {
    public static final igd a;
    private static volatile hym c;
    public String b = "";
    private int d;
    private hya e = hya.a;
    private hya f = hya.a;

    static {
        igd igd2;
        a = igd2 = new igd();
        hwv.z(igd.class, igd2);
    }

    private igd() {
        Object[] objectArray = hyp.a;
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
            dlm dlm2 = igc.a;
            object = igb.a;
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0002\u0007\u0003\u0002\u0000\u0000\u0002\u1008\u0001\u00062\u00072", new Object[]{"d", "b", "e", dlm2, "f", object});
        }
        if (n2 == 3) {
            return new igd();
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
            synchronized (igd.class) {
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

