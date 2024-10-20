/*
 * Decompiled with CFR 0.152.
 */
@Deprecated
public final class bqs
extends hwv
implements hyg {
    public static final bqs a;
    public static final hxf c;
    private static volatile hym d;
    public hya b = hya.a;

    static {
        bqs bqs2;
        c = new hxf(idq.l, idq.a);
        a = bqs2 = new bqs();
        hwv.z(bqs.class, bqs2);
    }

    private bqs() {
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
            dlm dlm2 = bqr.a;
            object = hqj.n;
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0832", new Object[]{"b", dlm2, object});
        }
        if (n2 == 3) {
            return new bqs();
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
            synchronized (bqs.class) {
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

