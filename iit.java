/*
 * Decompiled with CFR 0.152.
 */
public final class iit
extends hwv
implements hyg {
    public static final iit a;
    private static volatile hym d;
    public int b = 0;
    public Object c;
    private byte e = (byte)2;

    static {
        iit iit2;
        a = iit2 = new iit();
        hwv.z(iit.class, iit2);
    }

    private iit() {
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
            return new hyq(a, "\u0001\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0002\u0002\u043c\u0000\u0003\u043c\u0000\u0004<\u0000", new Object[]{"c", "b", iix.class, iiv.class, ijb.class});
        }
        if (n2 == 3) {
            return new iit();
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
            synchronized (iit.class) {
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

