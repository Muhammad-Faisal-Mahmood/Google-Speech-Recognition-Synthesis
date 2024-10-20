/*
 * Decompiled with CFR 0.152.
 */
public final class ibm
extends hws
implements hwt {
    public static final ibm a;
    private static volatile hym c;
    public hxk b;
    private int d;
    private ktb e;
    private byte f = (byte)2;

    static {
        ibm ibm2;
        a = ibm2 = new ibm();
        hwv.z(ibm.class, ibm2);
    }

    private ibm() {
        this.b = hyp.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0016\u001d\u0002\u0000\u0001\u0001\u0016\u041b\u001d\u1009\u001c", new Object[]{"d", "b", ibq.class, "e"});
        }
        if (n2 == 3) {
            return new ibm();
        }
        if (n2 == 4) {
            return new hwr(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.f = by2;
            return null;
        }
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (ibm.class) {
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

