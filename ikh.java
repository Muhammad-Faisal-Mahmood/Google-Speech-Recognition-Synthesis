/*
 * Decompiled with CFR 0.152.
 */
public final class ikh
extends hwv
implements hyg {
    public static final ikh a;
    private static volatile hym d;
    public String b = "";
    public hxk c = hyp.b;
    private int e;

    static {
        ikh ikh2;
        a = ikh2 = new ikh();
        hwv.z(ikh.class, ikh2);
    }

    private ikh() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[]{"e", "b", "c", ikg.class});
        }
        if (n2 == 3) {
            return new ikh();
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
            synchronized (ikh.class) {
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

