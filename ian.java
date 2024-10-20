/*
 * Decompiled with CFR 0.152.
 */
public final class ian
extends hwv
implements hyg {
    public static final ian a;
    private static volatile hym e;
    public int b;
    public iam c;
    public ial d;

    static {
        ian ian2;
        a = ian2 = new ian();
        hwv.z(ian.class, ian2);
    }

    private ian() {
        Object[] objectArray = hww.a;
        objectArray = hyp.a;
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0005\n\u0002\u0000\u0000\u0000\u0005\u1009\u0004\n\u1009\t", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new ian();
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
            synchronized (ian.class) {
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

