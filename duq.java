/*
 * Decompiled with CFR 0.152.
 */
public final class duq
extends hwv
implements hyg {
    public static final duq a;
    private static volatile hym j;
    public int b;
    public String c = "";
    public hvu d = hvu.b;
    public String e = "";
    public hxk f;
    public hxk g;
    public boolean h;
    public long i;

    static {
        duq duq2;
        a = duq2 = new duq();
        hwv.z(duq.class, duq2);
    }

    private duq() {
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
            return new hyq(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001\u1008\u0002\u0002\u1008\u0000\u0003\u100a\u0001\u0004\u001b\u0005\u001a\b\u1007\u0003\t\u1002\u0004", new Object[]{"b", "e", "c", "d", "f", dur.class, "g", "h", "i"});
        }
        if (n2 == 3) {
            return new duq();
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
            synchronized (duq.class) {
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

