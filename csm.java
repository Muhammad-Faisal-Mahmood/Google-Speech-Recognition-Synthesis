/*
 * Decompiled with CFR 0.152.
 */
public final class csm
extends hwv
implements hyg {
    public static final csm a;
    private static volatile hym k;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public long f;
    public csp g;
    public hxk h = hyp.b;
    public long i;
    public String j = "";

    static {
        csm csm2;
        a = csm2 = new csm();
        hwv.z(csm.class, csm2);
    }

    private csm() {
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
            return new hyq(a, "\u0001\b\u0000\u0001\u0001\u001a\b\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1002\t\u0006\u1008\u0001\n\u1004\u0002\r\u1009\u000b\u0017\u1002\u000f\u001a\u1008\u0010", new Object[]{"b", "c", "h", csl.class, "f", "d", "e", "g", "i", "j"});
        }
        if (n2 == 3) {
            return new csm();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (csm.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

