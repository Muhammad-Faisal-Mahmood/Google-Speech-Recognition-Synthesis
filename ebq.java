/*
 * Decompiled with CFR 0.152.
 */
public final class ebq
extends hwv
implements hyg {
    public static final ebq a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        ebq ebq2;
        a = ebq2 = new ebq();
        hwv.z(ebq.class, ebq2);
    }

    private ebq() {
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
            object = dpn.o;
            hwz hwz2 = dpn.n;
            return new hyq(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000", new Object[]{"c", "b", object, hwz2});
        }
        if (n2 == 3) {
            return new ebq();
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
            synchronized (ebq.class) {
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

