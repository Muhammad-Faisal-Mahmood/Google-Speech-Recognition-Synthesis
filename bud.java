/*
 * Decompiled with CFR 0.152.
 */
public final class bud
extends hwv
implements hyg {
    public static final bud a;
    private static volatile hym g;
    public int b;
    public hxk c;
    public hxk d;
    public hxk e;
    public hxk f;
    private int h;

    static {
        bud bud2;
        a = bud2 = new bud();
        hwv.z(bud.class, bud2);
    }

    private bud() {
        hyp hyp2 = hyp.b;
        this.c = hyp2;
        this.d = hyp2;
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
            return (byte)1;
        }
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\f\u0005\u0000\u0004\u0000\u0001\u1004\u0000\u0002\u001b\u0005\u001a\b\u001a\f\u001b", new Object[]{"h", "b", "c", buc.class, "d", "e", "f", btw.class});
        }
        if (n2 == 3) {
            return new bud();
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
            synchronized (bud.class) {
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

