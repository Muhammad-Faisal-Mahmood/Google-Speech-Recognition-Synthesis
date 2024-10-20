/*
 * Decompiled with CFR 0.152.
 */
public final class ihi
extends hws
implements hwt {
    public static final ihi a;
    private static volatile hym h;
    public int b;
    public hxk c;
    public ihf d;
    public hxk e;
    public ibt f;
    public boolean g;
    private byte i = (byte)2;

    static {
        ihi ihi2;
        a = ihi2 = new ihi();
        hwv.z(ihi.class, ihi2);
    }

    private ihi() {
        hyp hyp2 = hyp.b;
        this.c = hyp2;
        this.e = hyp2;
    }

    public final void G() {
        hxk hxk2 = this.c;
        if (!hxk2.c()) {
            this.c = hwv.s(hxk2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.i;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u1009\u0000\u0004\u001a\u0005\u1009\u0002\u0007\u1007\u0004", new Object[]{"b", "c", ihc.class, "d", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new ihi();
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
            this.i = by2;
            return null;
        }
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (ihi.class) {
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

