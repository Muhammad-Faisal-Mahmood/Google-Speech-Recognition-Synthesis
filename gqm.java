/*
 * Decompiled with CFR 0.152.
 */
public final class gqm
extends hwv
implements hyg {
    public static final gqm a;
    private static volatile hym k;
    public int b;
    public long c;
    public long d;
    public hxk e = hyp.b;
    public long f;
    public long g;
    public int h;
    public gmv i;
    public int j;

    static {
        gqm gqm2;
        a = gqm2 = new gqm();
        hwv.z(gqm.class, gqm2);
    }

    private gqm() {
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
            object = fhn.m;
            return new hyq(a, "\u0004\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001\u1005\u0000\u0002\u1005\u0001\u0003\u001b\u0004\u1002\u0002\u0005\u1002\u0003\u0006\u1004\u0004\n\u1009\u0005\u000b\u180c\u0006", new Object[]{"b", "c", "d", "e", gok.class, "f", "g", "h", "i", "j", object});
        }
        if (n2 == 3) {
            return new gqm();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (gqm.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

