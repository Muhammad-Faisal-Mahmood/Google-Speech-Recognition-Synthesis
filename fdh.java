/*
 * Decompiled with CFR 0.152.
 */
public final class fdh
extends hwv
implements hyg {
    public static final fdh a;
    private static volatile hym d;
    public String b = "";
    public long c;
    private int e;

    static {
        fdh fdh2;
        a = fdh2 = new fdh();
        hwv.z(fdh.class, fdh2);
    }

    private fdh() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1002\u0002", new Object[]{"e", "b", "c"});
        }
        if (n2 == 3) {
            return new fdh();
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
            synchronized (fdh.class) {
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

