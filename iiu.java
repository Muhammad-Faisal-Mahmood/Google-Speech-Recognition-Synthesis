/*
 * Decompiled with CFR 0.152.
 */
public final class iiu
extends hws
implements hwt {
    public static final iiu a;
    private static volatile hym e;
    public int b;
    public hxk c;
    public iis d;
    private byte f = (byte)2;

    static {
        iiu iiu2;
        a = iiu2 = new iiu();
        hwv.z(iiu.class, iiu2);
    }

    private iiu() {
        this.c = hyp.b;
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
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[]{"b", "c", iit.class, "d"});
        }
        if (n2 == 3) {
            return new iiu();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (iiu.class) {
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

