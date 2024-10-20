/*
 * Decompiled with CFR 0.152.
 */
public final class icg
extends hws
implements hwt {
    public static final icg a;
    private static volatile hym f;
    public String b = "";
    public float c;
    public ibv d;
    public ibx e;
    private int g;
    private ibv h;
    private ibv i;
    private ibv j;
    private ibl k;
    private byte l = (byte)2;

    static {
        icg icg2;
        a = icg2 = new icg();
        hwv.z(icg.class, icg2);
    }

    private icg() {
        Object[] objectArray = hyp.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.l;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\b\u0000\u0001\u0001\u0016\b\u0000\u0000\u0005\u0001\u1008\u0000\u0002\u1001\u0003\u0003\u1409\u0007\u0004\u1409\b\u0006\u1409\u000b\n\u1409\u0006\u0015\u1409\t\u0016\u1009\n", new Object[]{"g", "b", "c", "i", "j", "k", "h", "d", "e"});
        }
        if (n2 == 3) {
            return new icg();
        }
        if (n2 == 4) {
            return new hwr(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.l = by2;
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (icg.class) {
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

