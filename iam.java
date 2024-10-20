/*
 * Decompiled with CFR 0.152.
 */
public final class iam
extends hwv
implements hyg {
    public static final iam a;
    private static volatile hym e;
    public int b;
    public int c;
    public int d;

    static {
        iam iam2;
        a = iam2 = new iam();
        hwv.z(iam.class, iam2);
    }

    private iam() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100d\u0000\u0002\u100d\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new iam();
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
            synchronized (iam.class) {
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

