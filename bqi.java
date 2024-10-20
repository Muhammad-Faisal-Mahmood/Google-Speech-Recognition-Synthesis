/*
 * Decompiled with CFR 0.152.
 */
public final class bqi
extends hwv
implements hyg {
    public static final bqi a;
    private static volatile hym f;
    public long b;
    public hxk c = hyp.b;
    public hwg d;
    public float e;
    private int g;

    static {
        bqi bqi2;
        a = bqi2 = new bqi();
        hwv.z(bqi.class, bqi2);
    }

    private bqi() {
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
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1003\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u1001\u0002", new Object[]{"g", "b", "c", bqh.class, "d", "e"});
        }
        if (n2 == 3) {
            return new bqi();
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
            synchronized (bqi.class) {
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

