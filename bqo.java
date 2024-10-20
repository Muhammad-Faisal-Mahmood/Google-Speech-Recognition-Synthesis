/*
 * Decompiled with CFR 0.152.
 */
public final class bqo
extends hwv
implements hyg {
    public static final bqo a;
    private static volatile hym b;
    private int c;
    private hya d = hya.a;
    private bqq e;

    static {
        bqo bqo2;
        a = bqo2 = new bqo();
        hwv.z(bqo.class, bqo2);
    }

    private bqo() {
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
            object = bqn.a;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0001\u0000\u0000\u00042\u0005\u1009\u0003", new Object[]{"c", "d", object, "e"});
        }
        if (n2 == 3) {
            return new bqo();
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
            synchronized (bqo.class) {
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

