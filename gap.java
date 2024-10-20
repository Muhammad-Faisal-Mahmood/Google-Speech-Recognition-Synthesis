/*
 * Decompiled with CFR 0.152.
 */
public final class gap
extends hwv
implements hyg {
    public static final gap a;
    private static volatile hym f;
    public int b;
    public int c;
    public fze d;
    public int e;
    private byte g = (byte)2;

    static {
        gap gap2;
        a = gap2 = new gap();
        hwv.z(gap.class, gap2);
    }

    private gap() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.g;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = fhn.k;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1409\u0001\u0003\u180c\u0002", new Object[]{"b", "c", "d", "e", object});
        }
        if (n2 == 3) {
            return new gap();
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
            this.g = by2;
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (gap.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

