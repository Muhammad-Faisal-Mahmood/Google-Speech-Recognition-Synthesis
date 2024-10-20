/*
 * Decompiled with CFR 0.152.
 */
public final class dnh
extends hwv
implements hyg {
    public static final dnh a;
    private static volatile hym g;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public float f;
    private int h;

    static {
        dnh dnh2;
        a = dnh2 = new dnh();
        hwv.z(dnh.class, dnh2);
    }

    private dnh() {
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
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1001\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (n2 == 3) {
            return new dnh();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (dnh.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

