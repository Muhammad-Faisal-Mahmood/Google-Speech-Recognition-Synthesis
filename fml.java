/*
 * Decompiled with CFR 0.152.
 */
public final class fml
extends hwv
implements hyg {
    public static final fml a;
    private static volatile hym e;
    public int b;
    public fmg c;
    public hxk d = hyp.b;

    static {
        fml fml2;
        a = fml2 = new fml();
        hwv.z(fml.class, fml2);
    }

    private fml() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[]{"b", "c", "d", fen.class});
        }
        if (n2 == 3) {
            return new fml();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (fml.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

