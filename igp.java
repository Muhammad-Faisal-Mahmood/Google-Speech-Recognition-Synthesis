/*
 * Decompiled with CFR 0.152.
 */
public final class igp
extends hws
implements hwt {
    public static final igp a;
    private static volatile hym b;
    private int c;
    private igk d;
    private byte e = (byte)2;

    static {
        igp igp2;
        a = igp2 = new igp();
        hwv.z(igp.class, igp2);
    }

    private igp() {
        hww hww2 = hww.a;
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0003", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new igp();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (igp.class) {
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

