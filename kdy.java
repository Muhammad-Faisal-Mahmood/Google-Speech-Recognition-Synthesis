/*
 * Decompiled with CFR 0.152.
 */
public final class kdy
extends hwv
implements hyg {
    public static final kdy a;
    private static volatile hym d;
    public hxk b;
    public hxk c;
    private byte e = (byte)2;

    static {
        kdy kdy2;
        a = kdy2 = new kdy();
        hwv.z(kdy.class, kdy2);
    }

    private kdy() {
        hyp hyp2 = hyp.b;
        this.b = hyp2;
        this.c = hyp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.e;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001\u041b\u0003\u001b", new Object[]{"b", kdx.class, "c", kea.class});
        }
        if (n2 == 3) {
            return new kdy();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.e = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (kdy.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
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

