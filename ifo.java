/*
 * Decompiled with CFR 0.152.
 */
public final class ifo
extends hwv
implements hyg {
    public static final ifo a;
    private static volatile hym b;
    private hya c = hya.a;

    static {
        ifo ifo2;
        a = ifo2 = new ifo();
        hwv.z(ifo.class, ifo2);
    }

    private ifo() {
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
            object = ifn.a;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0001\u0000\u0000\u00072", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new ifo();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (ifo.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

