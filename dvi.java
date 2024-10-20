/*
 * Decompiled with CFR 0.152.
 */
public final class dvi
extends hwv
implements hyg {
    public static final hxc a;
    public static final dvi b;
    private static volatile hym l;
    public int c;
    public hvu d = hvu.b;
    public boolean e;
    public String f = "";
    public hxk g;
    public hxk h;
    public hxb i;
    public dvj j;
    public boolean k;

    static {
        dvi dvi2;
        a = new dvg(2);
        b = dvi2 = new dvi();
        hwv.z(dvi.class, dvi2);
    }

    private dvi() {
        hyp hyp2 = hyp.b;
        this.g = hyp2;
        this.h = hyp2;
        this.i = hww.a;
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
            object = hqj.c;
            return new hyq(b, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001\u100a\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u001a\u0005\u001a\u0007\u082c\b\u1009\u0003\n\u1007\u0004", new Object[]{"c", "d", "e", "f", "g", "h", "i", object, "j", "k"});
        }
        if (n2 == 3) {
            return new dvi();
        }
        if (n2 == 4) {
            return new hwp(b);
        }
        if (n2 == 5) {
            return b;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (dvi.class) {
                hym2 = l;
                object = hym2;
                if (hym2 == null) {
                    l = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

