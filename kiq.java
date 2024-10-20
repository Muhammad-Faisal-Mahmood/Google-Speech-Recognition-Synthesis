/*
 * Decompiled with CFR 0.152.
 */
public final class kiq
extends Enum {
    public static final /* enum */ kiq a;
    public static final /* enum */ kiq b;
    public static final /* enum */ kiq c;
    public static final /* enum */ kiq d;
    public static final /* enum */ kiq e;
    public static final /* enum */ kiq f;
    public static final /* enum */ kiq g;
    public static final /* enum */ kiq h;
    public static final /* enum */ kiq i;
    public static final /* enum */ kiq j;
    public static final /* enum */ kiq k;
    public static final /* enum */ kiq l;
    public static final /* enum */ kiq m;
    public static final /* enum */ kiq n;
    private static final kiq[] p;
    public final int o;

    static {
        kiq kiq2;
        kiq kiq3;
        kiq kiq4;
        kiq kiq5;
        kiq kiq6;
        kiq kiq7;
        kiq kiq8;
        kiq kiq9;
        kiq kiq10;
        kiq kiq11;
        kiq kiq12;
        kiq kiq13;
        kiq kiq14;
        kiq kiq15;
        a = kiq15 = new kiq("NO_ERROR", 0, 0);
        b = kiq14 = new kiq("PROTOCOL_ERROR", 1, 1);
        c = kiq13 = new kiq("INTERNAL_ERROR", 2, 2);
        d = kiq12 = new kiq("FLOW_CONTROL_ERROR", 3, 3);
        e = kiq11 = new kiq("SETTINGS_TIMEOUT", 4, 4);
        f = kiq10 = new kiq("STREAM_CLOSED", 5, 5);
        g = kiq9 = new kiq("FRAME_SIZE_ERROR", 6, 6);
        h = kiq8 = new kiq("REFUSED_STREAM", 7, 7);
        i = kiq7 = new kiq("CANCEL", 8, 8);
        j = kiq6 = new kiq("COMPRESSION_ERROR", 9, 9);
        k = kiq5 = new kiq("CONNECT_ERROR", 10, 10);
        l = kiq4 = new kiq("ENHANCE_YOUR_CALM", 11, 11);
        m = kiq3 = new kiq("INADEQUATE_SECURITY", 12, 12);
        n = kiq2 = new kiq("HTTP_1_1_REQUIRED", 13, 13);
        Enum[] enumArray = new kiq[]{kiq15, kiq14, kiq13, kiq12, kiq11, kiq10, kiq9, kiq8, kiq7, kiq6, kiq5, kiq4, kiq3, kiq2};
        p = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kiq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o = var3_2;
    }

    public static kiq[] values() {
        return (kiq[])p.clone();
    }
}

