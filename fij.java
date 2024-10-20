/*
 * Decompiled with CFR 0.152.
 */
public final class fij
extends hwv
implements hyg {
    public static final fij a;
    private static volatile hym d;
    public int b = 0;
    public Object c;
    private byte e = (byte)2;

    static {
        fij fij2;
        a = fij2 = new fij();
        hwv.z(fij.class, fij2);
    }

    private fij() {
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
            return new hyq(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u043c\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", fig.class, fih.class, fie.class, fif.class, fii.class});
        }
        if (n2 == 3) {
            return new fij();
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
            synchronized (fij.class) {
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

