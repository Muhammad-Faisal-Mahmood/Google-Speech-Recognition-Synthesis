/*
 * Decompiled with CFR 0.152.
 */
public final class bvu
extends hwv
implements hyg {
    public static final bvu a;
    private static volatile hym g;
    public ktd b;
    public hxk c;
    public ibd d;
    public hxk e;
    public hxk f;
    private int h;
    private byte i = (byte)2;

    static {
        bvu bvu2;
        a = bvu2 = new bvu();
        hwv.z(bvu.class, bvu2);
    }

    private bvu() {
        hyp hyp2 = hyp.b;
        this.c = hyp2;
        this.e = hyp2;
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
            return this.i;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0006\n\u0005\u0000\u0003\u0001\u0006\u001b\u0007\u1409\u0000\b\u1009\u0002\t\u001b\n\u001b", new Object[]{"h", "c", btw.class, "b", "d", "e", ibb.class, "f", ibg.class});
        }
        if (n2 == 3) {
            return new bvu();
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
            this.i = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (bvu.class) {
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

