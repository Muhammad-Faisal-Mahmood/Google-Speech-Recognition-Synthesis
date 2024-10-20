/*
 * Decompiled with CFR 0.152.
 */
public final class bmp
extends Enum {
    public static final /* enum */ bmp a;
    public static final /* enum */ bmp b;
    public static final /* enum */ bmp c;
    public static final /* enum */ bmp d;
    private static final bmp[] e;

    static {
        bmp bmp2;
        bmp bmp3;
        bmp bmp4;
        bmp bmp5;
        a = bmp5 = new bmp("BACK", 0);
        b = bmp4 = new bmp("CLOSE", 1);
        c = bmp3 = new bmp("DOWN", 2);
        d = bmp2 = new bmp("DISABLED", 3);
        e = new bmp[]{bmp5, bmp4, bmp3, bmp2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bmp() {
        void var2_-1;
        void var1_-1;
    }

    public static bmp[] values() {
        return (bmp[])e.clone();
    }
}

