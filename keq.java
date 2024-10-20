/*
 * Decompiled with CFR 0.152.
 */
public final class keq
extends hwv
implements hyg {
    public static final keq a;
    private static volatile hym g;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public hwg f;

    static {
        keq keq2;
        a = keq2 = new keq();
        hwv.z(keq.class, keq2);
    }

    private keq() {
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
            return new hyq(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u1009\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", "f", ken.class, keo.class, kem.class});
        }
        if (n2 == 3) {
            return new keq();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (keq.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

