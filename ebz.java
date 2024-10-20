/*
 * Decompiled with CFR 0.152.
 */
public final class ebz
extends hwv
implements hyg {
    public static final ebz a;
    private static volatile hym d;
    public int b;
    public int c;

    static {
        ebz ebz2;
        a = ebz2 = new ebz();
        hwv.z(ebz.class, ebz2);
    }

    private ebz() {
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
            object = dpn.s;
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"b", "c", object});
        }
        if (n2 == 3) {
            return new ebz();
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
            synchronized (ebz.class) {
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

