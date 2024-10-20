/*
 * Decompiled with CFR 0.152.
 */
public final class hhq
extends Enum {
    public static final /* enum */ hhq a;
    public static final /* enum */ hhq b;
    public static final /* enum */ hhq c;
    public static final /* enum */ hhq d;
    private static final hhq[] e;

    static {
        hhq hhq2;
        hhq hhq3;
        hhq hhq4;
        hhq hhq5;
        a = hhq5 = new hhq("BOOLEAN", 0);
        b = hhq4 = new hhq("STRING", 1);
        c = hhq3 = new hhq("LONG", 2);
        d = hhq2 = new hhq("DOUBLE", 3);
        e = new hhq[]{hhq5, hhq4, hhq3, hhq2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hhq() {
        void var2_-1;
        void var1_-1;
    }

    public static hhq a(Object object) {
        if (object instanceof String) {
            return b;
        }
        if (object instanceof Boolean) {
            return a;
        }
        if (object instanceof Long) {
            return c;
        }
        if (object instanceof Double) {
            return d;
        }
        throw new AssertionError((Object)"invalid tag type: ".concat(String.valueOf(String.valueOf(object.getClass()))));
    }

    public static hhq[] values() {
        return (hhq[])e.clone();
    }
}

