/*
 * Decompiled with CFR 0.152.
 */
public final class bvv
extends hwv
implements hyg {
    public static final bvv a;
    private static volatile hym f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    private byte g = (byte)2;

    static {
        bvv bvv2;
        a = bvv2 = new bvv();
        hwv.z(bvv.class, bvv2);
    }

    private bvv() {
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
            return new hyq(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001;\u0000\u0002\u043c\u0000\u0003\u1004\u0000", new Object[]{"d", "c", "b", bvu.class, "e"});
        }
        if (n2 == 3) {
            return new bvv();
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
            synchronized (bvv.class) {
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

