/*
 * Decompiled with CFR 0.152.
 */
public final class ecn
extends hwv
implements hyg {
    public static final ecn a;
    private static volatile hym f;
    public int b;
    public ecl c;
    public hvu d;
    public ecm e;
    private byte g = (byte)2;

    static {
        ecn ecn2;
        a = ecn2 = new ecn();
        hwv.z(ecn.class, ecn2);
    }

    private ecn() {
        this.d = hvu.b;
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
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u100a\u0001\u0002\u1409\u0002\u0003\u1009\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (n2 == 3) {
            return new ecn();
        }
        if (n2 == 4) {
            return new hwp(a);
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
            synchronized (ecn.class) {
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

