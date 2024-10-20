/*
 * Decompiled with CFR 0.152.
 */
public final class kfq
extends hwv
implements hyg {
    public static final kfq a;
    private static volatile hym d;
    public int b;
    public long c;
    private int e;

    static {
        kfq kfq2;
        a = kfq2 = new kfq();
        hwv.z(kfq.class, kfq2);
    }

    private kfq() {
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
            object = kei.i;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1002\u0001", new Object[]{"e", "b", object, "c"});
        }
        if (n2 == 3) {
            return new kfq();
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
            synchronized (kfq.class) {
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

