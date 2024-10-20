/*
 * Decompiled with CFR 0.152.
 */
public final class ihl
extends hwv
implements hyg {
    public static final ihl a;
    private static volatile hym g;
    public int b;
    public String c = "";
    public int d;
    public hxk e = hyp.b;
    public boolean f;

    static {
        ihl ihl2;
        a = ihl2 = new ihl();
        hwv.z(ihl.class, ihl2);
    }

    private ihl() {
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
            object = ieo.m;
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u001a\u0004\u1007\u0002", new Object[]{"b", "c", "d", object, "e", "f"});
        }
        if (n2 == 3) {
            return new ihl();
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
            synchronized (ihl.class) {
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

