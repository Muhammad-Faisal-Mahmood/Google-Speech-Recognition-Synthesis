/*
 * Decompiled with CFR 0.152.
 */
public final class ibg
extends hwv
implements hyg {
    public static final ibg a;
    private static volatile hym b;
    private hya c = hya.a;
    private hya d = hya.a;

    static {
        ibg ibg2;
        a = ibg2 = new ibg();
        hwv.z(ibg.class, ibg2);
    }

    private ibg() {
        Object[] objectArray = hww.a;
        objectArray = hyp.a;
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
            dlm dlm2 = ibf.a;
            object = hqj.e;
            dlm dlm3 = ibe.a;
            hwz hwz2 = ieo.u;
            return new hyq(a, "\u0004\u0002\u0000\u0000\u0005\u0007\u0002\u0002\u0000\u0000\u0005\u0832\u0007\u0832", new Object[]{"c", dlm2, object, "d", dlm3, hwz2});
        }
        if (n2 == 3) {
            return new ibg();
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
            synchronized (ibg.class) {
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

