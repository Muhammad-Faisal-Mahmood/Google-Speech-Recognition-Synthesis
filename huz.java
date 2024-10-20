/*
 * Decompiled with CFR 0.152.
 */
public final class huz
extends hwv
implements hyg {
    public static final huz a;
    private static volatile hym e;
    public int b;
    public String c = "";
    public huy d;

    static {
        huz huz2;
        a = huz2 = new huz();
        hwv.z(huz.class, huz2);
    }

    private huz() {
        hvu hvu2 = hvu.b;
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
            return new hyq(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new huz();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (huz.class) {
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

