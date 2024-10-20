/*
 * Decompiled with CFR 0.152.
 */
public final class dtm
extends hwv
implements hyg {
    public static final dtm a;
    private static volatile hym l;
    public int b;
    public kdm c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public String i = "";
    public kdo j;
    public int k;
    private byte m = (byte)2;

    static {
        dtm dtm2;
        a = dtm2 = new dtm();
        hwv.z(dtm.class, dtm2);
    }

    private dtm() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.m;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1005\u0004\u0006\u1004\u0005\u0007\u1008\u0006\t\u1409\b\n\u1004\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (n2 == 3) {
            return new dtm();
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
            this.m = by2;
            return null;
        }
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (dtm.class) {
                hym2 = l;
                object = hym2;
                if (hym2 == null) {
                    l = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

