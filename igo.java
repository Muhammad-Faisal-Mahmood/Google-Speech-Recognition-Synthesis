/*
 * Decompiled with CFR 0.152.
 */
public final class igo
extends hwv
implements hyg {
    public static final igo a;
    private static volatile hym d;
    public int b;
    public String c;

    static {
        igo igo2;
        a = igo2 = new igo();
        hwv.z(igo.class, igo2);
    }

    private igo() {
        hvu hvu2 = hvu.b;
        this.c = "";
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new igo();
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
            synchronized (igo.class) {
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

