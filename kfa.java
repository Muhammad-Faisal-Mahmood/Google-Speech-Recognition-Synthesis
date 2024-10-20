/*
 * Decompiled with CFR 0.152.
 */
public final class kfa
extends hwv
implements hyg {
    public static final kfa a;
    private static volatile hym g;
    public int b;
    public int c;
    public int d;
    public hxb e;
    public hxb f;

    static {
        kfa kfa2;
        a = kfa2 = new kfa();
        hwv.z(kfa.class, kfa2);
    }

    private kfa() {
        hww hww2 = hww.a;
        this.e = hww2;
        this.f = hww2;
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
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003'\u0004'", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (n2 == 3) {
            return new kfa();
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
            synchronized (kfa.class) {
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

