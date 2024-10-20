/*
 * Decompiled with CFR 0.152.
 */
public final class eun
extends hwv
implements hyg {
    public static final eun a;
    private static volatile hym d;
    public int b = 0;
    public Object c;
    private byte e = (byte)2;

    static {
        eun eun2;
        a = eun2 = new eun();
        hwv.z(eun.class, eun2);
    }

    private eun() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.e;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0007\u0001\u0000\u0001\n\u0007\u0000\u0000\u0001\u0001<\u0000\u0004<\u0000\u0006<\u0000\u0007<\u0000\b\u043c\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", euk.class, eag.class, dzn.class, eas.class, eaf.class, hwh.class, dzn.class});
        }
        if (n2 == 3) {
            return new eun();
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
            this.e = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (eun.class) {
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

