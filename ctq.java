/*
 * Decompiled with CFR 0.152.
 */
public final class ctq
extends hwv
implements hyg {
    public static final ctq a;
    private static volatile hym h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public String g = "";

    static {
        ctq ctq2;
        a = ctq2 = new ctq();
        hwv.z(ctq.class, ctq2);
    }

    private ctq() {
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
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0004\u1007\u0003\u0005\u1008\u0002\u0006\u1008\u0004", new Object[]{"b", "c", "d", "f", "e", "g"});
        }
        if (n2 == 3) {
            return new ctq();
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
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (ctq.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

