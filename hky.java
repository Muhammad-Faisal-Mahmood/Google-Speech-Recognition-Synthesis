/*
 * Decompiled with CFR 0.152.
 */
public final class hky
extends hwv
implements hyg {
    public static final hky a;
    public static final gpm i;
    private static volatile hym j;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public boolean f;
    public String g = "";
    public boolean h;

    static {
        hky hky2;
        a = hky2 = new hky();
        hwv.z(hky.class, hky2);
        i = hwv.F(bos.a, hky2, hky2, 524000016, hzm.k);
    }

    private hky() {
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
            hwz hwz2 = hqj.n;
            object = hqj.s;
            return new hyq(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u180c\u0002\u0004\u1007\u0003\u0005\u1008\u0004\u0006\u1007\u0005", new Object[]{"b", "c", hwz2, "d", "e", object, "f", "g", "h"});
        }
        if (n2 == 3) {
            return new hky();
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
        hym hym2 = j;
        object = hym2;
        if (hym2 == null) {
            synchronized (hky.class) {
                hym2 = j;
                object = hym2;
                if (hym2 == null) {
                    j = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

