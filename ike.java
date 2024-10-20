/*
 * Decompiled with CFR 0.152.
 */
public final class ike
extends hwv
implements hyg {
    public static final ike a;
    private static volatile hym e;
    public int b;
    public float c;
    public float d;
    private byte f = (byte)2;

    static {
        ike ike2;
        a = ike2 = new ike();
        hwv.z(ike.class, ike2);
    }

    private ike() {
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
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1001\u0000\u0003\u1001\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new ike();
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
            this.f = by2;
            return null;
        }
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (ike.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

