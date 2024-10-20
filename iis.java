/*
 * Decompiled with CFR 0.152.
 */
public final class iis
extends hws
implements hwt {
    public static final iis a;
    private static volatile hym h;
    public int b;
    public iiz c;
    public ijy d;
    public iiy e;
    public ika f;
    public ikb g;
    private byte i = (byte)2;

    static {
        iis iis2;
        a = iis2 = new iis();
        hwv.z(iis.class, iis2);
    }

    private iis() {
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
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0007\u1009\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new iis();
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
            synchronized (iis.class) {
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

