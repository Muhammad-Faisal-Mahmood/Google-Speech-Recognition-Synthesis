/*
 * Decompiled with CFR 0.152.
 */
public final class kfm
extends hwv
implements hyg {
    public static final kfm a;
    private static volatile hym e;
    public int b;
    public long c;
    public int d;

    static {
        kfm kfm2;
        a = kfm2 = new kfm();
        hwv.z(kfm.class, kfm2);
    }

    private kfm() {
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
            object = iko.s;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u180c\u0001", new Object[]{"b", "c", "d", object});
        }
        if (n2 == 3) {
            return new kfm();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (kfm.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

