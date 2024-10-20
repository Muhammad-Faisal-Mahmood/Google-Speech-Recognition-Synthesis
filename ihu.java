/*
 * Decompiled with CFR 0.152.
 */
public final class ihu
extends hwv
implements hyg {
    public static final ihu a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        ihu ihu2;
        a = ihu2 = new ihu();
        hwv.z(ihu.class, ihu2);
    }

    private ihu() {
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
            return new hyq(a, "\u0004\t\u0001\u0000\u0002\n\t\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", ihq.class, iho.class, ihr.class, ihp.class, ihm.class, iht.class, ihn.class, ihk.class, ihs.class});
        }
        if (n2 == 3) {
            return new ihu();
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
            synchronized (ihu.class) {
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

