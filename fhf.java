/*
 * Decompiled with CFR 0.152.
 */
public final class fhf
extends hwv
implements hyg {
    public static final fhf a;
    private static volatile hym f;
    public int b;
    public int c;
    public int d = 2;
    public boolean e = true;
    private int g;

    static {
        fhf fhf2;
        a = fhf2 = new fhf();
        hwv.z(fhf.class, fhf2);
    }

    private fhf() {
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
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0004\u1007\u0003\u0005\u1004\u0002", new Object[]{"g", "b", "c", "e", "d"});
        }
        if (n2 == 3) {
            return new fhf();
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
            synchronized (fhf.class) {
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

