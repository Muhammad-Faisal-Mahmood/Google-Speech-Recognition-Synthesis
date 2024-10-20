/*
 * Decompiled with CFR 0.152.
 */
public final class igq
extends hwv
implements hyg {
    public static final igq a;
    private static volatile hym e;
    public int b;
    public int c;
    public String d = "";

    static {
        igq igq2;
        a = igq2 = new igq();
        hwv.z(igq.class, igq2);
    }

    private igq() {
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
            object = ieo.m;
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001", new Object[]{"b", "c", object, "d"});
        }
        if (n2 == 3) {
            return new igq();
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
            synchronized (igq.class) {
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

