/*
 * Decompiled with CFR 0.152.
 */
public final class iao
extends hwv
implements hyg {
    public static final iao a;
    private static volatile hym b;
    private int c;
    private hlh d;
    private byte e = (byte)2;

    static {
        iao iao2;
        a = iao2 = new iao();
        hwv.z(iao.class, iao2);
    }

    private iao() {
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
            return this.e;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0011\u0011\u0001\u0000\u0000\u0001\u0011\u1409\u0002", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new iao();
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
            this.e = by2;
            return null;
        }
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (iao.class) {
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

