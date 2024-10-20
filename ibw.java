/*
 * Decompiled with CFR 0.152.
 */
public final class ibw
extends hwv
implements hyg {
    public static final ibw a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        ibw ibw2;
        a = ibw2 = new ibw();
        hwv.z(ibw.class, ibw2);
    }

    private ibw() {
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
            return new hyq(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002:\u0000", new Object[]{"c", "b"});
        }
        if (n2 == 3) {
            return new ibw();
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
            synchronized (ibw.class) {
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

