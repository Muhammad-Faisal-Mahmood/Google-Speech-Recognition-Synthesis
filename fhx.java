/*
 * Decompiled with CFR 0.152.
 */
public final class fhx
extends hwv
implements hyg {
    public static final fhx a;
    private static volatile hym e;
    public hxk b;
    public hxk c;
    public hxk d;

    static {
        fhx fhx2;
        a = fhx2 = new fhx();
        hwv.z(fhx.class, fhx2);
    }

    private fhx() {
        hyp hyp2 = hyp.b;
        this.b = hyp2;
        this.c = hyp2;
        this.d = hyp2;
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
            return new hyq(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"b", fhw.class, "c", fhw.class, "d", fhw.class});
        }
        if (n2 == 3) {
            return new fhx();
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
            synchronized (fhx.class) {
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

