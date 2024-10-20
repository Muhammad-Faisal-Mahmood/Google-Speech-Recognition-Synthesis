/*
 * Decompiled with CFR 0.152.
 */
public final class kdt
extends hws
implements hwt {
    public static final kdt a;
    private static volatile hym h;
    public int b;
    public kds c;
    public kes d;
    public int e;
    public kdr f;
    public String g = "";
    private byte i = (byte)2;

    static {
        kdt kdt2;
        a = kdt2 = new kdt();
        hwv.z(kdt.class, kdt2);
    }

    private kdt() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.i;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = iko.l;
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u180c\u0002\u0004\u1009\u0003\u0005\u1008\u0004", new Object[]{"b", "c", "d", "e", object, "f", "g"});
        }
        if (n2 == 3) {
            return new kdt();
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
            this.i = by2;
            return null;
        }
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (kdt.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

