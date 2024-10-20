/*
 * Decompiled with CFR 0.152.
 */
public final class cts
extends hwv
implements hyg {
    public static final cts a;
    private static volatile hym g;
    public int b;
    public hzb c;
    public hxk d = hyp.b;
    public boolean e;
    public ctu f;

    static {
        cts cts2;
        a = cts2 = new cts();
        hwv.z(cts.class, cts2);
    }

    private cts() {
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
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u1007\u0001\u0004\u1009\u0002", new Object[]{"b", "c", "d", ctl.class, "e", "f"});
        }
        if (n2 == 3) {
            return new cts();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (cts.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final void b() {
        hxk hxk2 = this.d;
        if (!hxk2.c()) {
            this.d = hwv.s(hxk2);
        }
    }
}

