/*
 * Decompiled with CFR 0.152.
 */
public final class hup
extends hwv
implements hyg {
    public static final hup a;
    private static volatile hym f;
    public int b;
    public long c;
    public hxe d;
    public hxk e;

    static {
        hup hup2;
        a = hup2 = new hup();
        hwv.z(hup.class, hup2);
    }

    private hup() {
        Object[] objectArray = hyp.a;
        this.d = hxw.a;
        this.e = hyp.b;
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005\u1005\u0001\u0006\u0017", new Object[]{"b", "e", huo.class, "c", "d"});
        }
        if (n2 == 3) {
            return new hup();
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
            synchronized (hup.class) {
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

