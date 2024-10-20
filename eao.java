/*
 * Decompiled with CFR 0.152.
 */
public final class eao
extends hwv
implements hyg {
    public static final eao a;
    private static volatile hym l;
    public int b;
    public int c = 0;
    public Object d;
    public int e = 0;
    public Object f;
    public eae g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;

    static {
        eao eao2;
        a = eao2 = new eao();
        hwv.z(eao.class, eao2);
    }

    private eao() {
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
            object = eck.m;
            hwz hwz2 = eck.d;
            return new hyq(a, "\u0001\f\u0002\u0001\u0001\u0011\f\u0000\u0000\u0000\u0001\u1009\u0000\u0003<\u0000\u0004\u1007\u0001\u0005;\u0000\u0006\u1007\u0002\n:\u0000\u000b\u1007\u0003\f<\u0001\r<\u0000\u000e\u083f\u0001\u0010\u180c\u0004\u0011:\u0000", new Object[]{"d", "c", "f", "e", "b", "g", ecq.class, "h", "i", "j", edk.class, edg.class, object, "k", hwz2});
        }
        if (n2 == 3) {
            return new eao();
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
            synchronized (eao.class) {
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

