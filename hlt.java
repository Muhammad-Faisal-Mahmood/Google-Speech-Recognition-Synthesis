/*
 * Decompiled with CFR 0.152.
 */
public final class hlt
extends hwv
implements hyg {
    public static final hlt a;
    private static volatile hym k;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public String f = "";
    public boolean g;
    public long h;
    public long i;
    public String j = "";

    static {
        hlt hlt2;
        a = hlt2 = new hlt();
        hwv.z(hlt.class, hlt2);
    }

    private hlt() {
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
            object = fhn.n;
            return new hyq(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1008\u0003\u0005\u1007\u0004\u0006\u1002\u0005\b\u1002\u0007\t\u1008\b", new Object[]{"b", "c", object, "d", "e", "f", "g", "h", "i", "j"});
        }
        if (n2 == 3) {
            return new hlt();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (hlt.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

