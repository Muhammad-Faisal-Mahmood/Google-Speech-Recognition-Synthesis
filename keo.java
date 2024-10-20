/*
 * Decompiled with CFR 0.152.
 */
public final class keo
extends hwv
implements hyg {
    public static final keo a;
    private static volatile hym d;
    public int b;
    public hwg c;

    static {
        keo keo2;
        a = keo2 = new keo();
        hwv.z(keo.class, keo2);
    }

    private keo() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new keo();
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
            synchronized (keo.class) {
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

