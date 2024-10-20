/*
 * Decompiled with CFR 0.152.
 */
public final class ikp
extends hws
implements hwt {
    public static final ikp a;
    private static volatile hym k;
    public int b;
    public long c;
    public long d;
    public int e;
    public hvu f;
    public long g;
    public boolean h;
    public String i;
    public ikr j;
    private byte l = (byte)2;

    static {
        ikp ikp2;
        a = ikp2 = new ikp();
        hwv.z(ikp.class, ikp2);
    }

    private ikp() {
        Object object = hyp.a;
        object = hvu.b;
        this.f = hvu.b;
        this.g = 180000L;
        object = hww.a;
        this.i = "";
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
            return new hyq(a, "\u0001\b\u0000\u0001\u0001!\b\u0000\u0000\u0001\u0001\u1002\u0000\u0006\u100a\u000b\u000b\u1004\u0005\u000f\u1010\u0011\u0011\u1002\u0001\u0019\u1007\u0017\u001c\u1008\u0018!\u1409\u001b", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j"});
        }
        if (n2 == 3) {
            return new ikp();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (ikp.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

