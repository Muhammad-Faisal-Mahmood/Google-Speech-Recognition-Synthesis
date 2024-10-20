/*
 * Decompiled with CFR 0.152.
 */
public final class ieq
extends hwv
implements hyg {
    public static final ieq a;
    private static volatile hym d;
    public int b = 0;
    public Object c;
    private int e;
    private igk f;

    static {
        ieq ieq2;
        a = ieq2 = new ieq();
        hwv.z(ieq.class, ieq2);
    }

    private ieq() {
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
            return new hyq(a, "\u0001\u0004\u0001\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002=\u0000\u0003\u1009\u0002\u0005;\u0000\u0006;\u0000", new Object[]{"c", "b", "e", "f"});
        }
        if (n2 == 3) {
            return new ieq();
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
            synchronized (ieq.class) {
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

