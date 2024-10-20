/*
 * Decompiled with CFR 0.152.
 */
public final class ibr
extends hwv
implements hyg {
    public static final ibr a;
    private static volatile hym e;
    public hxk b;
    public hxk c;
    public ibt d;
    private int f;

    static {
        ibr ibr2;
        a = ibr2 = new ibr();
        hwv.z(ibr.class, ibr2);
    }

    private ibr() {
        hyp hyp2 = hyp.b;
        this.b = hyp2;
        this.c = hyp2;
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
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003\u1009\u0000", new Object[]{"f", "b", "c", "d"});
        }
        if (n2 == 3) {
            return new ibr();
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
            synchronized (ibr.class) {
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

