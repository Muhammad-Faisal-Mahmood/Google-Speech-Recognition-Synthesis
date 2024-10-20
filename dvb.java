/*
 * Decompiled with CFR 0.152.
 */
public final class dvb
extends hwv
implements hyg {
    public static final dvb a;
    private static volatile hym g;
    public String b = "";
    public hvu c;
    public String d = "";
    public long e;
    public hya f = hya.a;
    private int h;

    static {
        dvb dvb2;
        a = dvb2 = new dvb();
        hwv.z(dvb.class, dvb2);
    }

    private dvb() {
        this.c = hvu.b;
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
            object = dva.a;
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", object});
        }
        if (n2 == 3) {
            return new dvb();
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
            synchronized (dvb.class) {
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

