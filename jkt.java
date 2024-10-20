/*
 * Decompiled with CFR 0.152.
 */
public final class jkt
extends Enum {
    public static final /* enum */ jkt a;
    public static final /* enum */ jkt b;
    public static final /* enum */ jkt c;
    public static final /* enum */ jkt d;
    public static final /* enum */ jkt e;
    public static final /* enum */ jkt f;
    private static final jkt[] h;
    public final int g;

    static {
        jkt jkt2;
        jkt jkt3;
        jkt jkt4;
        jkt jkt5;
        jkt jkt6;
        jkt jkt7;
        a = jkt7 = new jkt("HEADER_TABLE_SIZE", 0, 1);
        b = jkt6 = new jkt("ENABLE_PUSH", 1, 2);
        c = jkt5 = new jkt("MAX_CONCURRENT_STREAMS", 2, 4);
        d = jkt4 = new jkt("MAX_FRAME_SIZE", 3, 5);
        e = jkt3 = new jkt("MAX_HEADER_LIST_SIZE", 4, 6);
        f = jkt2 = new jkt("INITIAL_WINDOW_SIZE", 5, 7);
        h = new jkt[]{jkt7, jkt6, jkt5, jkt4, jkt3, jkt2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jkt() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static jkt[] values() {
        return (jkt[])h.clone();
    }
}

