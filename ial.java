/*
 * Decompiled with CFR 0.152.
 */
public final class ial
extends hwv
implements hyg {
    public static final ial a;
    private static volatile hym e;
    public int b;
    public long c;
    public long d;

    static {
        ial ial2;
        a = ial2 = new ial();
        hwv.z(ial.class, ial2);
    }

    private ial() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1005\u0000\u0002\u1005\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new ial();
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
            synchronized (ial.class) {
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

