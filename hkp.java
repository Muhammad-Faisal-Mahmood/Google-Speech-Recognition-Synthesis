/*
 * Decompiled with CFR 0.152.
 */
public final class hkp
extends hws
implements hwt {
    public static final hkp a;
    private static volatile hym b;
    private hkw A;
    private iaq B;
    private byte C = (byte)2;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private hko j;
    private hkq k;
    private hkq l;
    private hkk m;
    private kfl n;
    private hkt o;
    private iao p;
    private hkr q;
    private hks s;
    private hlf t;
    private hkh u;
    private hkc v;
    private gry w;
    private hkv x;
    private hld y;
    private kcw z;

    static {
        hkp hkp2;
        a = hkp2 = new hkp();
        hwv.z(hkp.class, hkp2);
    }

    private hkp() {
        Object object = hvu.b;
        object = hyp.a;
        object = hww.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.C;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0012\u0000\u0007/\u013e\u0012\u0000\u0000\u0011/\u1409\u00167\u1409)8\u1409*l\u1409Jv\u1409R\u0081\u1409_\u0088\u1409g\u0093\u1409o\u00c0\u1409p\u00c3\u1009\u009b\u00df\u1409\u00b2\u00e4\u1409\u0095\u0120\u1409\u00c4\u0121\u1409\u00c7\u0124\u1409\u00cf\u0127\u1409\u00d3\u013b\u1409\u00ca\u013e\u1409\u00df", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "s", "u", "v", "t", "w", "x", "z", "A", "y", "B"});
        }
        if (n2 == 3) {
            return new hkp();
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
            this.C = by2;
            return null;
        }
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (hkp.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

