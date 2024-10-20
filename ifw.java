/*
 * Decompiled with CFR 0.152.
 */
public final class ifw
extends hws
implements hwt {
    public static final ifw a;
    private static volatile hym c;
    public hxk b;
    private int d;
    private igd e;
    private byte f = (byte)2;

    static {
        ifw ifw2;
        a = ifw2 = new ifw();
        hwv.z(ifw.class, ifw2);
    }

    private ifw() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\u1009\u0000", new Object[]{"d", "b", "e"});
        }
        if (n2 == 3) {
            return new ifw();
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
            synchronized (ifw.class) {
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

