/*
 * Decompiled with CFR 0.152.
 */
public final class esq
extends hwv
implements hyg {
    public static final esq a;
    private static volatile hym d;
    public int b;
    public ecq c;

    static {
        esq esq2;
        a = esq2 = new esq();
        hwv.z(esq.class, esq2);
    }

    private esq() {
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
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new esq();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (esq.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

