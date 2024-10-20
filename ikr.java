/*
 * Decompiled with CFR 0.152.
 */
public final class ikr
extends hws
implements hwt {
    public static final ikr a;
    private static volatile hym f;
    public int b;
    public ias c;
    public int d;
    public huz e;
    private byte g = (byte)2;

    static {
        ikr ikr2;
        a = ikr2 = new ikr();
        hwv.z(ikr.class, ikr2);
    }

    private ikr() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.g;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = iko.c;
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u180c\u0001\u0003\u1009\u0002", new Object[]{"b", "c", "d", object, "e"});
        }
        if (n2 == 3) {
            return new ikr();
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
            this.g = by2;
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (ikr.class) {
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

