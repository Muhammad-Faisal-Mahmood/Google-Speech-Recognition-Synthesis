/*
 * Decompiled with CFR 0.152.
 */
public final class hlq
extends hwv
implements hyg {
    public static final hlq a;
    private static volatile hym l;
    public int b;
    public String c = "";
    public int d;
    public String e = "";
    public int f;
    public int g;
    public boolean h;
    public long i;
    public String j = "";
    public boolean k;

    static {
        hlq hlq2;
        a = hlq2 = new hlq();
        hwv.z(hlq.class, hlq2);
    }

    private hlq() {
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
            return new hyq(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1004\u0003\u0005\u1007\u0005\u0006\u1002\u0006\u0007\u1008\u0007\b\u1004\u0004\t\u1007\b", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k"});
        }
        if (n2 == 3) {
            return new hlq();
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
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (hlq.class) {
                hym2 = l;
                object = hym2;
                if (hym2 == null) {
                    l = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

