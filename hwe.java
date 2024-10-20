/*
 * Decompiled with CFR 0.152.
 */
public final class hwe
extends hws
implements hwt {
    public static final hwe a;
    private static volatile hym b;
    private byte c = (byte)2;

    static {
        hwe hwe2;
        a = hwe2 = new hwe();
        hwv.z(hwe.class, hwe2);
    }

    private hwe() {
        Object[] objectArray = hyp.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.c;
        }
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0000", null);
        }
        if (n2 == 3) {
            return new hwe();
        }
        if (n2 == 4) {
            return new hwr(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            byte by2 = object == null ? (byte)0 : 1;
            this.c = by2;
            return null;
        }
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (hwe.class) {
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

