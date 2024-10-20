/*
 * Decompiled with CFR 0.152.
 */
public final class fiq
extends hws
implements hwt {
    public static final fiq a;
    private static volatile hym d;
    public int b = 0;
    public Object c;
    private byte e = (byte)2;

    static {
        fiq fiq2;
        a = fiq2 = new fiq();
        hwv.z(fiq.class, fiq2);
    }

    private fiq() {
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
            return new hyq(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u00057\u0000\u0006\u043c\u0000", new Object[]{"c", "b", fip.class, fin.class, fil.class, fim.class, iga.class});
        }
        if (n2 == 3) {
            return new fiq();
        }
        if (n2 == 4) {
            return new hwr(a);
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
            synchronized (fiq.class) {
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

