/*
 * Decompiled with CFR 0.152.
 */
public final class dvh
extends hwv
implements hyg {
    public static final hxc a;
    public static final dvh b;
    private static volatile hym n;
    public int c;
    public hvu d = hvu.b;
    public boolean e;
    public String f = "";
    public long g;
    public hxk h;
    public hxk i;
    public hxb j;
    public dvj k;
    public boolean l;
    public boolean m;

    static {
        dvh dvh2;
        a = new dvg(0);
        b = dvh2 = new dvh();
        hwv.z(dvh.class, dvh2);
    }

    private dvh() {
        hyp hyp2 = hyp.b;
        this.h = hyp2;
        this.i = hyp2;
        this.j = hww.a;
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
            return new hyq(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001\u100a\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u001a\u0006\u001a\u0007\u082c\b\u1009\u0004\n\u1007\u0005\u000b\u1007\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", object, "k", "l", "m"});
        }
        if (n2 == 3) {
            return new dvh();
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
        hym hym2 = n;
        object = hym2;
        if (hym2 == null) {
            synchronized (dvh.class) {
                hym2 = n;
                object = hym2;
                if (hym2 == null) {
                    n = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

