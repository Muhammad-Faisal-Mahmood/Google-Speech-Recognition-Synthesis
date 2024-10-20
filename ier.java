/*
 * Decompiled with CFR 0.152.
 */
public final class ier
extends hws
implements hwt {
    public static final ier a;
    private static volatile hym e;
    public int b;
    public hxk c;
    public boolean d = true;
    private byte f = (byte)2;

    static {
        ier ier2;
        a = ier2 = new ier();
        hwv.z(ier.class, ier2);
    }

    private ier() {
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
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0002\t\u0002\u0000\u0001\u0000\u0002\u001b\t\u1007\f", new Object[]{"b", "c", ieq.class, "d"});
        }
        if (n2 == 3) {
            return new ier();
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
            synchronized (ier.class) {
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

