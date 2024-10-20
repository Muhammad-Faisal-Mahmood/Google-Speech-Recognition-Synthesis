/*
 * Decompiled with CFR 0.152.
 */
public final class hkx
extends hwv
implements hyg {
    public static final hkx a;
    public static final gpm k;
    private static volatile hym l;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public int h;
    public long i;
    public long j;

    static {
        hkx hkx2;
        a = hkx2 = new hkx();
        hwv.z(hkx.class, hkx2);
        k = hwv.F(bos.a, hkx2, hkx2, 295747467, hzm.k);
    }

    private hkx() {
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
            object = eck.r;
            return new hyq(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1007\u0004\u0006\u180c\u0005\u0007\u1002\u0006\b\u1002\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", object, "i", "j"});
        }
        if (n2 == 3) {
            return new hkx();
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
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (hkx.class) {
                hym2 = l;
                object = hym2;
                if (hym2 == null) {
                    l = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

