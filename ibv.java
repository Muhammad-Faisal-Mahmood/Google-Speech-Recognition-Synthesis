/*
 * Decompiled with CFR 0.152.
 */
public final class ibv
extends hws
implements hwt {
    public static final ibv a;
    private static volatile hym d;
    public float b;
    public hxk c;
    private int e;
    private float f;
    private float g;
    private float h;
    private byte i = (byte)2;

    static {
        ibv ibv2;
        a = ibv2 = new ibv();
        hwv.z(ibv.class, ibv2);
    }

    private ibv() {
        this.c = hyp.b;
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
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001\u1501\u0000\u0002\u1501\u0001\u0003\u1501\u0002\u0004\u1501\u0003\u0005\u0431", new Object[]{"e", "b", "f", "g", "h", "c", ibu.class});
        }
        if (n2 == 3) {
            return new ibv();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (ibv.class) {
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

