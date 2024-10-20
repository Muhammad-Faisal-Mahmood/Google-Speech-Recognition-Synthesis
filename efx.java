/*
 * Decompiled with CFR 0.152.
 */
public final class efx
extends hwv
implements hyg {
    public static final efx a;
    private static volatile hym l;
    public int b;
    public int c = 0;
    public Object d;
    public eae e;
    public int f;
    public boolean g;
    public boolean h;
    public ecz i;
    public int j;
    public int k;

    static {
        efx efx2;
        a = efx2 = new efx();
        hwv.z(efx.class, efx2);
    }

    private efx() {
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
            return new hyq(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0004<\u0000\u0005\u1009\u0004\u0006\u083f\u0000\u0007\u1007\u0003\b\u1004\u0005\t\u1004\u0006", new Object[]{"d", "c", "b", "e", "f", "g", edk.class, "i", object, "h", "j", "k"});
        }
        if (n2 == 3) {
            return new efx();
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
            synchronized (efx.class) {
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

