/*
 * Decompiled with CFR 0.152.
 */
public final class ker
extends hwv
implements hyg {
    public static final ker a;
    private static volatile hym i;
    public int b;
    public long c;
    public boolean d;
    public int e;
    public String f = "";
    public int g;
    public String h = "";

    static {
        ker ker2;
        a = ker2 = new ker();
        hwv.z(ker.class, ker2);
    }

    private ker() {
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
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new ker();
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
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (ker.class) {
                hym2 = i;
                object = hym2;
                if (hym2 == null) {
                    i = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

