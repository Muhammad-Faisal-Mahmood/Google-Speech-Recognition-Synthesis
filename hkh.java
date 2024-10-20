/*
 * Decompiled with CFR 0.152.
 */
public final class hkh
extends hwv
implements hyg {
    public static final hkh a;
    private static volatile hym b;
    private hya c = hya.a;
    private hya d;
    private hya e;

    static {
        hkh hkh2;
        a = hkh2 = new hkh();
        hwv.z(hkh.class, hkh2);
    }

    private hkh() {
        Object[] objectArray = hya.a;
        this.d = objectArray;
        this.e = objectArray;
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
            dlm dlm2 = hkf.a;
            dlm dlm3 = hkg.a;
            object = hke.a;
            return new hyq(a, "\u0001\u0003\u0000\u0000\u0003\f\u0003\u0003\u0000\u0000\u00032\u00072\f2", new Object[]{"c", dlm2, "d", dlm3, "e", object});
        }
        if (n2 == 3) {
            return new hkh();
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
            synchronized (hkh.class) {
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

