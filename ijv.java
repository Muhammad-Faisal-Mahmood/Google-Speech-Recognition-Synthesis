/*
 * Decompiled with CFR 0.152.
 */
public final class ijv
extends hwv
implements hyg {
    public static final ijv a;
    private static volatile hym f;
    public int b;
    public String c = "";
    public hxk d = hyp.b;
    public String e = "";

    static {
        ijv ijv2;
        a = ijv2 = new ijv();
        hwv.z(ijv.class, ijv2);
    }

    private ijv() {
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a\u0003\u1008\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new ijv();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (ijv.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

