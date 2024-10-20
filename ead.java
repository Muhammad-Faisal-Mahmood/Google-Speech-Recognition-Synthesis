/*
 * Decompiled with CFR 0.152.
 */
public final class ead
extends hwv
implements hyg {
    public static final ead a;
    private static volatile hym d;
    public int b;
    public int c = 10000;

    static {
        ead ead2;
        a = ead2 = new ead();
        hwv.z(ead.class, ead2);
    }

    private ead() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100b\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new ead();
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
            synchronized (ead.class) {
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

