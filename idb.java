/*
 * Decompiled with CFR 0.152.
 */
public final class idb
extends hws
implements hwt {
    public static final idb a;
    private static volatile hym g;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public iba f;
    private byte h = (byte)2;

    static {
        idb idb2;
        a = idb2 = new idb();
        hwv.z(idb.class, idb2);
    }

    private idb() {
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
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = hqj.m;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0006\u1009\u0003", new Object[]{"b", "c", object, "d", "e", "f"});
        }
        if (n2 == 3) {
            return new idb();
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
            this.h = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (idb.class) {
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

