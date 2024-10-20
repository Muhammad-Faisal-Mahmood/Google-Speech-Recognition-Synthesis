/*
 * Decompiled with CFR 0.152.
 */
public final class kcu
extends hwv
implements hyg {
    public static final kcu a;
    public static final gpm e;
    private static volatile hym f;
    public int b;
    public long c;
    public long d;

    static {
        kcu kcu2;
        a = kcu2 = new kcu();
        hwv.z(kcu.class, kcu2);
        e = hwv.F(bos.a, kcu2, kcu2, 465529016, hzm.k);
    }

    private kcu() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new kcu();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (kcu.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

