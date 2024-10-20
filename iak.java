/*
 * Decompiled with CFR 0.152.
 */
public final class iak
extends hwv
implements hyg {
    public static final iak a;
    private static volatile hym b;
    private byte c = (byte)2;

    static {
        iak iak2;
        a = iak2 = new iak();
        hwv.z(iak.class, iak2);
    }

    private iak() {
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
            return new hyq(a, "\u0004\u0000", null);
        }
        if (n2 == 3) {
            return new iak();
        }
        if (n2 == 4) {
            return new hwp(a);
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
            synchronized (iak.class) {
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

