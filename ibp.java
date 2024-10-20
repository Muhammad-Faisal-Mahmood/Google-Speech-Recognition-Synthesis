/*
 * Decompiled with CFR 0.152.
 */
public final class ibp
extends hwv
implements hyg {
    public static final ibp a;
    private static volatile hym c;
    public hxk b = hyp.b;

    static {
        ibp ibp2;
        a = ibp2 = new ibp();
        hwv.z(ibp.class, ibp2);
    }

    private ibp() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ibo.class});
        }
        if (n2 == 3) {
            return new ibp();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (ibp.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

