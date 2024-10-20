/*
 * Decompiled with CFR 0.152.
 */
public final class hlz
extends hwv
implements hyg {
    public static final hlz a;
    private static volatile hym i;
    public int b;
    public hlq c;
    public int d;
    public long e;
    public long f;
    public String g = "";
    public int h;

    static {
        hlz hlz2;
        a = hlz2 = new hlz();
        hwv.z(hlz.class, hlz2);
    }

    private hlz() {
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
            object = fhn.q;
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u180c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1004\u0005", new Object[]{"b", "c", "d", object, "e", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new hlz();
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
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (hlz.class) {
                hym2 = i;
                object = hym2;
                if (hym2 == null) {
                    i = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

