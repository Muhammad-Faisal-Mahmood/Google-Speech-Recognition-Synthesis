/*
 * Decompiled with CFR 0.152.
 */
public final class geq
extends hwv
implements hyg {
    public static final geq a;
    private static volatile hym j;
    public int b;
    public String c = "";
    public String d = "";
    public hvu e = hvu.b;
    public hxk f;
    public hxk g;
    public int h;
    public long i;

    static {
        geq geq2;
        a = geq2 = new geq();
        hwv.z(geq.class, geq2);
    }

    private geq() {
        hyp hyp2 = hyp.b;
        this.f = hyp2;
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
            return new hyq(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100a\u0002\u0004\u001b\u0005\u001a\u0006\u1006\u0003\u0007\u1005\u0004", new Object[]{"b", "c", "d", "e", "f", ges.class, "g", "h", "i"});
        }
        if (n2 == 3) {
            return new geq();
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
        hym hym2 = j;
        object = hym2;
        if (hym2 == null) {
            synchronized (geq.class) {
                hym2 = j;
                object = hym2;
                if (hym2 == null) {
                    j = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

