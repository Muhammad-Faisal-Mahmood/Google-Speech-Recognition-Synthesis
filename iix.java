/*
 * Decompiled with CFR 0.152.
 */
public final class iix
extends hws
implements hwt {
    public static final iix a;
    private static volatile hym f;
    public int b;
    public hxk c;
    public iis d;
    public boolean e;
    private byte g = (byte)2;

    static {
        iix iix2;
        a = iix2 = new iix();
        hwv.z(iix.class, iix2);
    }

    private iix() {
        this.c = hyp.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.g;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0004\u1007\u0001", new Object[]{"b", "c", iiw.class, "d", "e"});
        }
        if (n2 == 3) {
            return new iix();
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
            this.g = by2;
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (iix.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

