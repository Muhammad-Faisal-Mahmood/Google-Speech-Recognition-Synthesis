/*
 * Decompiled with CFR 0.152.
 */
public final class ido
extends hwv
implements hyg {
    public static final ido a;
    private static volatile hym e;
    public int b;
    public int c;
    public hxk d = hyp.b;
    private int f;

    static {
        ido ido2;
        a = ido2 = new ido();
        hwv.z(ido.class, ido2);
    }

    private ido() {
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u001a", new Object[]{"f", "b", "c", "d"});
        }
        if (n2 == 3) {
            return new ido();
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
            synchronized (ido.class) {
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

