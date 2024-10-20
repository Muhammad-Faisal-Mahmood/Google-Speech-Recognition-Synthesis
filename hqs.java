/*
 * Decompiled with CFR 0.152.
 */
public final class hqs
extends hwv
implements hyg {
    public static final hqs a;
    public static final gpm c;
    private static volatile hym d;
    public hxk b = hyp.b;

    static {
        hqs hqs2;
        a = hqs2 = new hqs();
        hwv.z(hqs.class, hqs2);
        c = hwv.F(iax.a, hqs2, hqs2, 198889211, hzm.k);
    }

    private hqs() {
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
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
        }
        if (n2 == 3) {
            return new hqs();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (hqs.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

