/*
 * Decompiled with CFR 0.152.
 */
public final class esg
extends hwv
implements hyg {
    public static final esg a;
    private static volatile hym g;
    public int b;
    public int c = 0;
    public Object d;
    public esf e;
    public hxk f;
    private byte h = (byte)2;

    static {
        esg esg2;
        a = esg2 = new esg();
        hwv.z(esg.class, esg2);
    }

    private esg() {
        this.f = hyp.b;
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
            object = eck.m;
            return new hyq(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b\u0003<\u0000\u0004\u083f\u0000", new Object[]{"d", "c", "b", "e", "f", esf.class, edk.class, object});
        }
        if (n2 == 3) {
            return new esg();
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
            this.h = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (esg.class) {
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

