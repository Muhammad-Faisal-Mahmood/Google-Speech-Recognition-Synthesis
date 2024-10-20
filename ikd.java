/*
 * Decompiled with CFR 0.152.
 */
public final class ikd
extends hws
implements hwt {
    public static final ikd a;
    private static volatile hym d;
    public int b;
    public iiu c;
    private byte e = (byte)2;

    static {
        ikd ikd2;
        a = ikd2 = new ikd();
        hwv.z(ikd.class, ikd2);
    }

    private ikd() {
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
            return this.e;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new ikd();
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
            this.e = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (ikd.class) {
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

