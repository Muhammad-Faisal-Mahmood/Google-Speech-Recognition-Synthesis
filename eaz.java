/*
 * Decompiled with CFR 0.152.
 */
public final class eaz
extends hwv
implements hyg {
    public static final eaz a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        eaz eaz2;
        a = eaz2 = new eaz();
        hwv.z(eaz.class, eaz2);
    }

    private eaz() {
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
            return new hyq(a, "\u0004\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"c", "b", ebd.class, ebe.class, ebh.class, eba.class, ebj.class, ebn.class, ebf.class, ebi.class});
        }
        if (n2 == 3) {
            return new eaz();
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
            synchronized (eaz.class) {
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

