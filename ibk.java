/*
 * Decompiled with CFR 0.152.
 */
public final class ibk
extends hws
implements hwt {
    public static final ibk a;
    private static volatile hym e;
    public int b;
    public hzb c;
    public ibj d;
    private byte f = (byte)2;

    static {
        ibk ibk2;
        a = ibk2 = new ibk();
        hwv.z(ibk.class, ibk2);
    }

    private ibk() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0006\u1009\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new ibk();
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
            synchronized (ibk.class) {
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

