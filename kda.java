/*
 * Decompiled with CFR 0.152.
 */
public final class kda
extends hwv
implements hyg {
    public static final kda a;
    private static volatile hym f;
    public int b;
    public hxk c;
    public kdb d;
    public int e;
    private byte g = (byte)2;

    static {
        kda kda2;
        a = kda2 = new kda();
        hwv.z(kda.class, kda2);
    }

    private kda() {
        this.c = hyp.b;
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u041b\u0002\u1009\u0000\u0003\u1004\u0001", new Object[]{"b", "c", kcz.class, "d", "e"});
        }
        if (n2 == 3) {
            return new kda();
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
            synchronized (kda.class) {
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

