/*
 * Decompiled with CFR 0.152.
 */
public final class idg
extends hwv
implements hyg {
    public static final idg a;
    public static final gpm b;
    private static volatile hym c;

    static {
        idg idg2;
        a = idg2 = new idg();
        hwv.z(idg.class, idg2);
        b = hwv.F(idb.a, idg2, idg2, 29737259, hzm.k);
    }

    private idg() {
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
            return new hyq(a, "\u0004\u0000", null);
        }
        if (n2 == 3) {
            return new idg();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (idg.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

