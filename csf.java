/*
 * Decompiled with CFR 0.152.
 */
public final class csf
extends hwv
implements hyg {
    public static final csf a;
    private static volatile hym i;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public hvi g;
    public boolean h;

    static {
        csf csf2;
        a = csf2 = new csf();
        hwv.z(csf.class, csf2);
    }

    private csf() {
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
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1009\u0004\u0006\u1007\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new csf();
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
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (csf.class) {
                hym2 = i;
                object = hym2;
                if (hym2 == null) {
                    i = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

