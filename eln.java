/*
 * Decompiled with CFR 0.152.
 */
public final class eln
extends hwv
implements hyg {
    public static final eln a;
    private static volatile hym d;
    public int b;
    public String c = "";

    static {
        eln eln2;
        a = eln2 = new eln();
        hwv.z(eln.class, eln2);
    }

    private eln() {
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
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new eln();
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
            synchronized (eln.class) {
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

