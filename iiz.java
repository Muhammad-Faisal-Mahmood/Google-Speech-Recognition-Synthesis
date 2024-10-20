/*
 * Decompiled with CFR 0.152.
 */
public final class iiz
extends hwv
implements hyg {
    public static final iiz a;
    private static volatile hym d;
    public int b;
    public ian c;

    static {
        iiz iiz2;
        a = iiz2 = new iiz();
        hwv.z(iiz.class, iiz2);
    }

    private iiz() {
        Object object = hyp.a;
        object = hww.a;
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new iiz();
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
            synchronized (iiz.class) {
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

