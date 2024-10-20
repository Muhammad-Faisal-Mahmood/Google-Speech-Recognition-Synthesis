/*
 * Decompiled with CFR 0.152.
 */
public final class ked
extends hwv
implements hyg {
    public static final ked a;
    private static volatile hym g;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public long f;

    static {
        ked ked2;
        a = ked2 = new ked();
        hwv.z(ked.class, ked2);
    }

    private ked() {
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
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (n2 == 3) {
            return new ked();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (ked.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

