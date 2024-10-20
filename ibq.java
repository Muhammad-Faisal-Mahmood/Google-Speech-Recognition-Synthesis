/*
 * Decompiled with CFR 0.152.
 */
public final class ibq
extends hws
implements hwt {
    public static final ibq a;
    private static volatile hym d;
    public int b;
    public ibp c;
    private byte e = (byte)2;

    static {
        ibq ibq2;
        a = ibq2 = new ibq();
        hwv.z(ibq.class, ibq2);
    }

    private ibq() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.e;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007\u1009\u0007", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new ibq();
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
            this.e = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (ibq.class) {
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

