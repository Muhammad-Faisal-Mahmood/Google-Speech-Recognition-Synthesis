/*
 * Decompiled with CFR 0.152.
 */
public final class igk
extends hwv
implements hyg {
    public static final igk a;
    private static volatile hym b;
    private hya c = hya.a;

    static {
        igk igk2;
        a = igk2 = new igk();
        hwv.z(igk.class, igk2);
    }

    private igk() {
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
            object = igj.a;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new igk();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (igk.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

