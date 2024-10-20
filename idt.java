/*
 * Decompiled with CFR 0.152.
 */
public final class idt
extends hwv
implements hyg {
    public static final idt a;
    private static volatile hym j;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        idt idt2;
        a = idt2 = new idt();
        hwv.z(idt.class, idt2);
    }

    private idt() {
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
            hwz hwz2 = hqj.p;
            hwz hwz3 = hqj.q;
            object = hqj.r;
            return new hyq(a, "\u0004\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0000\u0002\u1008\u0004\u0003\u1008\u0005\u0004\u1008\u0006\u0006\u180c\u0000\u0007\u1008\u0003\t\u180c\u0001\n\u180c\u0002", new Object[]{"b", "g", "h", "i", "c", hwz2, "f", "d", hwz3, "e", object});
        }
        if (n2 == 3) {
            return new idt();
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
        hym hym2 = j;
        object = hym2;
        if (hym2 == null) {
            synchronized (idt.class) {
                hym2 = j;
                object = hym2;
                if (hym2 == null) {
                    j = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

