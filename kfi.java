/*
 * Decompiled with CFR 0.152.
 */
public final class kfi
extends hwv
implements hyg {
    public static final kfi a;
    private static volatile hym d;
    public hxb b;
    public hxb c;

    static {
        kfi kfi2;
        a = kfi2 = new kfi();
        hwv.z(kfi.class, kfi2);
    }

    private kfi() {
        hww hww2 = hww.a;
        this.b = hww2;
        this.c = hww2;
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
            return new hyq(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new kfi();
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
            synchronized (kfi.class) {
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

