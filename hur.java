/*
 * Decompiled with CFR 0.152.
 */
public final class hur
extends Enum {
    public static final /* enum */ hur a;
    public static final /* enum */ hur b;
    public static final /* enum */ hur c;
    private static final hur[] d;

    static {
        hur hur2;
        hur hur3;
        hur hur4;
        a = hur4 = new hur("LENIENT", 0);
        b = hur3 = new hur("LEGACY_STRICT", 1);
        c = hur2 = new hur("STRICT", 2);
        d = new hur[]{hur4, hur3, hur2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hur() {
        void var2_-1;
        void var1_-1;
    }

    public static hur[] values() {
        return (hur[])d.clone();
    }
}

