/*
 * Decompiled with CFR 0.152.
 */
public final class ifr
extends hws
implements hwt {
    public static final ifr a;
    private static volatile hym g;
    public int b;
    public hxk c;
    public long d;
    public ifk e;
    public hxk f;
    private byte h = (byte)2;

    static {
        ifr ifr2;
        a = ifr2 = new ifr();
        hwv.z(ifr.class, ifr2);
    }

    private ifr() {
        hyp hyp2 = hyp.b;
        this.c = hyp2;
        this.f = hyp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0012\u0004\u0000\u0002\u0000\u0001\u001a\u0002\u1002\u0000\u0003\u1009\u0001\u0012\u001b", new Object[]{"b", "c", "d", "e", "f", igg.class});
        }
        if (n2 == 3) {
            return new ifr();
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
            this.h = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (ifr.class) {
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

