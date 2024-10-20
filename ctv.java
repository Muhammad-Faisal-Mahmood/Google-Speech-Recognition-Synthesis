/*
 * Decompiled with CFR 0.152.
 */
public final class ctv
extends hwv
implements hyg {
    public static final ctv a;
    private static volatile hym i;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public long f;
    public String g = "";
    public int h;

    static {
        ctv ctv2;
        a = ctv2 = new ctv();
        hwv.z(ctv.class, ctv2);
    }

    private ctv() {
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
            object = bqk.u;
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004\u1008\u0000\u0005\u180c\u0001\b\u1007\u0002\t\u1002\u0003\n\u1008\u0004\u000b\u1004\u0005", new Object[]{"b", "c", "d", object, "e", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new ctv();
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
            synchronized (ctv.class) {
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

