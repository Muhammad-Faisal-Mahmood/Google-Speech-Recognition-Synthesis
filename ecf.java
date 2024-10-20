/*
 * Decompiled with CFR 0.152.
 */
public final class ecf
extends hwv
implements hyg {
    public static final ecf a;
    private static volatile hym i;
    public int b;
    public int c = 0;
    public Object d;
    public eip e;
    public long f;
    public int g;
    public int h;
    private byte j = (byte)2;

    static {
        ecf ecf2;
        a = ecf2 = new ecf();
        hwv.z(ecf.class, ecf2);
    }

    private ecf() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.j;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\t\u0001\u0001\u0001g\t\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u043c\u0000\u0005<\u0000d\u1009\u0000e\u1002\u0001f\u1004\u0002g\u1004\u0003", new Object[]{"d", "c", "b", ebz.class, ecj.class, ebw.class, eca.class, ecc.class, "e", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new ecf();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.j = by2;
            return null;
        }
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (ecf.class) {
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

