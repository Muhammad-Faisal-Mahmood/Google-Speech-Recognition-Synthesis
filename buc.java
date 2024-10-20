/*
 * Decompiled with CFR 0.152.
 */
public final class buc
extends hwv
implements hyg {
    public static final buc a;
    private static volatile hym h;
    public int b;
    public String c = "";
    public hxk d;
    public int e;
    public int f;
    public hxk g;

    static {
        buc buc2;
        a = buc2 = new buc();
        hwv.z(buc.class, buc2);
    }

    private buc() {
        hyp hyp2 = hyp.b;
        this.d = hyp2;
        this.g = hyp2;
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
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0003\u0017\u0005\u0000\u0002\u0000\u0003\u1004\u0002\t\u1008\u0000\u000f\u1004\u0004\u0011\u001a\u0017\u001b", new Object[]{"b", "e", "c", "f", "d", "g", bub.class});
        }
        if (n2 == 3) {
            return new buc();
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
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (buc.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

