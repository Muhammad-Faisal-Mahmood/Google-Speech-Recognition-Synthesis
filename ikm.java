/*
 * Decompiled with CFR 0.152.
 */
public final class ikm
extends hwv
implements hyg {
    public static final ikm a;
    private static volatile hym c;
    public hxk b = hyp.b;

    static {
        ikm ikm2;
        a = ikm2 = new ikm();
        hwv.z(ikm.class, ikm2);
    }

    private ikm() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ikl.class});
        }
        if (n2 == 3) {
            return new ikm();
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
            synchronized (ikm.class) {
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

