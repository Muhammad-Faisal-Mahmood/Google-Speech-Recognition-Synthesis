/*
 * Decompiled with CFR 0.152.
 */
public final class key
extends hwv
implements hyg {
    public static final key a;
    private static volatile hym e;
    public int b;
    public int c;
    public int d;

    static {
        key key2;
        a = key2 = new key();
        hwv.z(key.class, key2);
    }

    private key() {
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
            object = kei.f;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1004\u0001", new Object[]{"b", "c", object, "d"});
        }
        if (n2 == 3) {
            return new key();
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
            synchronized (key.class) {
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

