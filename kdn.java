/*
 * Decompiled with CFR 0.152.
 */
public final class kdn
extends hwv
implements hyg {
    public static final kdn a;
    private static volatile hym g;
    public int b;
    public int c;
    public hwg d;
    public long e;
    public int f;

    static {
        kdn kdn2;
        a = kdn2 = new kdn();
        hwv.z(kdn.class, kdn2);
    }

    private kdn() {
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
            object = iko.k;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1005\u0002\u0004\u180c\u0003", new Object[]{"b", "c", "d", "e", "f", object});
        }
        if (n2 == 3) {
            return new kdn();
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
            synchronized (kdn.class) {
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

