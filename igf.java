/*
 * Decompiled with CFR 0.152.
 */
public final class igf
extends hwv
implements hyg {
    public static final igf a;
    private static volatile hym c;
    public long b;
    private int d;

    static {
        igf igf2;
        a = igf2 = new igf();
        hwv.z(igf.class, igf2);
    }

    private igf() {
        hxw hxw2 = hxw.a;
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007\u1002\u0002", new Object[]{"d", "b"});
        }
        if (n2 == 3) {
            return new igf();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (igf.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

