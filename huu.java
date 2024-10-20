/*
 * Decompiled with CFR 0.152.
 */
public final class huu
extends hwv
implements hyg {
    public static final huu a;
    private static volatile hym d;
    public String b = "";
    public hxk c;
    private int e;
    private byte f = (byte)2;

    static {
        huu huu2;
        a = huu2 = new huu();
        hwv.z(huu.class, huu2);
    }

    private huu() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0001\u0001\u0001\u1508\u0000\u0006\u001b", new Object[]{"e", "b", "c", huw.class});
        }
        if (n2 == 3) {
            return new huu();
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
            this.f = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (huu.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

