/*
 * Decompiled with CFR 0.152.
 */
public final class eit
extends hwv
implements hyg {
    public static final eit a;
    private static volatile hym b;

    static {
        eit eit2;
        a = eit2 = new eit();
        hwv.z(eit.class, eit2);
    }

    private eit() {
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
            return new hyq(a, "\u0001\u0000", null);
        }
        if (n2 == 3) {
            return new eit();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (eit.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

