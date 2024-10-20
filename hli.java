/*
 * Decompiled with CFR 0.152.
 */
public final class hli
extends hwv
implements hyg {
    public static final hli a;
    private static volatile hym b;
    private int c;
    private long d;
    private int e;
    private int f;
    private byte g = (byte)2;

    static {
        hli hli2;
        a = hli2 = new hli();
        hwv.z(hli.class, hli2);
    }

    private hli() {
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1502\u0000\u0002\u1506\u0001\u0003\u1506\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (n2 == 3) {
            return new hli();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (hli.class) {
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

