/*
 * Decompiled with CFR 0.152.
 */
public final class hmb
extends hwv
implements hyg {
    public static final hmb a;
    private static volatile hym f;
    public int b;
    public hxk c = hyp.b;
    public long d;
    public long e;

    static {
        hmb hmb2;
        a = hmb2 = new hmb();
        hwv.z(hmb.class, hmb2);
    }

    private hmb() {
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1003\u0000\u0003\u1003\u0001", new Object[]{"b", "c", hma.class, "d", "e"});
        }
        if (n2 == 3) {
            return new hmb();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (hmb.class) {
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

