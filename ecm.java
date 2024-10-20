/*
 * Decompiled with CFR 0.152.
 */
public final class ecm
extends hws
implements hwt {
    public static final ecm a;
    private static volatile hym f;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte g = (byte)2;

    static {
        ecm ecm2;
        a = ecm2 = new ecm();
        hwv.z(ecm.class, ecm2);
    }

    private ecm() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.g;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new ecm();
        }
        if (n2 == 4) {
            return new hwr(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.g = by2;
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (ecm.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

