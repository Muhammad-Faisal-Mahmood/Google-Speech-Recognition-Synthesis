/*
 * Decompiled with CFR 0.152.
 */
public final class ici
extends hwv
implements hyg {
    public static final ici a;
    private static volatile hym e;
    public int b;
    public String c = "";
    public double d;
    private byte f = (byte)2;

    static {
        ici ici2;
        a = ici2 = new ici();
        hwv.z(ici.class, ici2);
    }

    private ici() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1000\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new ici();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.f = by2;
            return null;
        }
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (ici.class) {
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

