/*
 * Decompiled with CFR 0.152.
 */
public final class kcp
extends hwv
implements hyg {
    public static final kcp a;
    private static volatile hym f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        kcp kcp2;
        a = kcp2 = new kcp();
        hwv.z(kcp.class, kcp2);
    }

    private kcp() {
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
            hwz hwz2 = dpn.r;
            object = iko.f;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u1004\u0002", new Object[]{"b", "c", hwz2, "d", object, "e"});
        }
        if (n2 == 3) {
            return new kcp();
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
            synchronized (kcp.class) {
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

