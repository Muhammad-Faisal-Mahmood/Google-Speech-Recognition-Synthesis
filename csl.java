/*
 * Decompiled with CFR 0.152.
 */
public final class csl
extends hwv
implements hyg {
    public static final csl a;
    private static volatile hym i;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public ikm f;
    public String g = "";
    public hvi h;

    static {
        csl csl2;
        a = csl2 = new csl();
        hwv.z(csl.class, csl2);
    }

    private csl() {
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
            return (byte)1;
        }
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0002\u0015\u0006\u0000\u0000\u0000\u0002\u1008\u0001\u0004\u1004\u0002\u0007\u1008\u0000\u000b\u1009\u0005\u000e\u1008\u0006\u0015\u1009\r", new Object[]{"b", "d", "e", "c", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new csl();
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
            synchronized (csl.class) {
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

