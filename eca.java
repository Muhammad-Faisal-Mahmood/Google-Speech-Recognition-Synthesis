/*
 * Decompiled with CFR 0.152.
 */
public final class eca
extends hwv
implements hyg {
    public static final eca a;
    private static volatile hym f;
    public int b;
    public int c;
    public eaf d;
    public String e = "";
    private byte g = (byte)2;

    static {
        eca eca2;
        a = eca2 = new eca();
        hwv.z(eca.class, eca2);
    }

    private eca() {
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
            object = eck.g;
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002\u180c\u0000\u0003\u1409\u0001\u0004\u1008\u0002", new Object[]{"b", "c", object, "d", "e"});
        }
        if (n2 == 3) {
            return new eca();
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
            this.g = by2;
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (eca.class) {
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

