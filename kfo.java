/*
 * Decompiled with CFR 0.152.
 */
public final class kfo
extends hwv
implements hyg {
    public static final kfo a;
    private static volatile hym f;
    public int b;
    public hxk c;
    public hwg d;
    public boolean e;
    private byte g = (byte)2;

    static {
        kfo kfo2;
        a = kfo2 = new kfo();
        hwv.z(kfo.class, kfo2);
    }

    private kfo() {
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u041b\u0002\u1009\u0000\u0003\u1007\u0001", new Object[]{"b", "c", kfn.class, "d", "e"});
        }
        if (n2 == 3) {
            return new kfo();
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
            synchronized (kfo.class) {
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

