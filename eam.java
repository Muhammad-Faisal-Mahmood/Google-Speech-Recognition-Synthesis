/*
 * Decompiled with CFR 0.152.
 */
public final class eam
extends hws
implements hwt {
    public static final eam a;
    private static volatile hym e;
    public int b;
    public eip c;
    public int d;
    private byte f = (byte)2;

    static {
        eam eam2;
        a = eam2 = new eam();
        hwv.z(eam.class, eam2);
    }

    private eam() {
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
            object = dpn.i;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0000\u0003\u180c\u0001", new Object[]{"b", "c", "d", object});
        }
        if (n2 == 3) {
            return new eam();
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
            this.f = by2;
            return null;
        }
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (eam.class) {
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

