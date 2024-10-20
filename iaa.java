/*
 * Decompiled with CFR 0.152.
 */
public final class iaa
extends hwv
implements hyg {
    public static final iaa a;
    private static volatile hym e;
    public int b = 0;
    public Object c;
    public int d;
    private byte f = (byte)2;

    static {
        iaa iaa2;
        a = iaa2 = new iaa();
        hwv.z(iaa.class, iaa2);
    }

    private iaa() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\f\u0005\u043c\u0000", new Object[]{"c", "b", iad.class, iaf.class, iae.class, "d", kcw.class});
        }
        if (n2 == 3) {
            return new iaa();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.f = by2;
            return null;
        }
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (iaa.class) {
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

