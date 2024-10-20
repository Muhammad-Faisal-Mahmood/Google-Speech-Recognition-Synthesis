/*
 * Decompiled with CFR 0.152.
 */
public final class ifm
extends hws
implements hwt {
    public static final ifm a;
    private static volatile hym g;
    public int b;
    public hxk c;
    public hxk d;
    public igd e;
    public igf f;
    private ifq h;
    private byte i = (byte)2;

    static {
        ifm ifm2;
        a = ifm2 = new ifm();
        hwv.z(ifm.class, ifm2);
    }

    private ifm() {
        hyp hyp2 = hyp.b;
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
            return this.i;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\r\u0005\u0000\u0002\u0001\u0001\u001a\u0004\u1009\u0005\u0007\u1009\u0007\n\u041b\r\u1009\u0004", new Object[]{"b", "c", "e", "f", "d", ifr.class, "h"});
        }
        if (n2 == 3) {
            return new ifm();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (ifm.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

