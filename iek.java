/*
 * Decompiled with CFR 0.152.
 */
public final class iek
extends hwv
implements hyg {
    public static final iek a;
    public static final gpm e;
    private static volatile hym f;
    public int b;
    public int c;
    public boolean d = true;

    static {
        iek iek2;
        a = iek2 = new iek();
        hwv.z(iek.class, iek2);
        e = hwv.F(iep.a, iek2, iek2, 462237659, hzm.k);
    }

    private iek() {
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
            object = hqj.u;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1007\u0001", new Object[]{"b", "c", object, "d"});
        }
        if (n2 == 3) {
            return new iek();
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
            synchronized (iek.class) {
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

