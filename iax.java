/*
 * Decompiled with CFR 0.152.
 */
public final class iax
extends hws
implements hwt {
    public static final iax a;
    private static volatile hym b;
    private byte c = (byte)2;

    static {
        iax iax2;
        a = iax2 = new iax();
        hwv.z(iax.class, iax2);
    }

    private iax() {
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
            return new hyq(a, "\u0003\u0000", null);
        }
        if (n2 == 3) {
            return new iax();
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
            synchronized (iax.class) {
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

