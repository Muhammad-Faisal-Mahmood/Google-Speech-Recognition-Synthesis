/*
 * Decompiled with CFR 0.152.
 */
public final class igy
extends hwv
implements hyg {
    public static final igy a;
    private static volatile hym c;
    public hxk b = hyp.b;

    static {
        igy igy2;
        a = igy2 = new igy();
        hwv.z(igy.class, igy2);
    }

    private igy() {
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
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
        }
        if (n2 == 3) {
            return new igy();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (igy.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final void c() {
        hxk hxk2 = this.b;
        if (!hxk2.c()) {
            this.b = hwv.s(hxk2);
        }
    }
}

