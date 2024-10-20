/*
 * Decompiled with CFR 0.152.
 */
public final class diy
extends Enum {
    public static final /* enum */ diy a;
    public static final /* enum */ diy b;
    public static final /* enum */ diy c;
    public static final /* enum */ diy d;
    public static final /* enum */ diy e;
    public static final /* enum */ diy f;
    public static final /* enum */ diy g;
    public static final /* enum */ diy h;
    public static final /* enum */ diy i;
    public static final /* enum */ diy j;
    public static final /* enum */ diy k;
    public static final /* enum */ diy l;
    private static final diy[] m;

    static {
        diy diy2;
        diy diy3;
        diy diy4;
        diy diy5;
        diy diy6;
        diy diy7;
        diy diy8;
        diy diy9;
        diy diy10;
        diy diy11;
        diy diy12;
        diy diy13;
        a = diy13 = new diy("UNKNOWN", 0);
        b = diy12 = new diy("CANCELED", 1);
        c = diy11 = new diy("INVALID_REQUEST", 2);
        d = diy10 = new diy("HTTP_ERROR", 3);
        e = diy9 = new diy("REQUEST_ERROR", 4);
        f = diy8 = new diy("RESPONSE_OPEN_ERROR", 5);
        g = diy7 = new diy("RESPONSE_CLOSE_ERROR", 6);
        h = diy6 = new diy("NETWORK_IO_ERROR", 7);
        i = diy5 = new diy("DISK_IO_ERROR", 8);
        j = diy4 = new diy("FILE_SYSTEM_ERROR", 9);
        k = diy3 = new diy("UNKNOWN_IO_ERROR", 10);
        l = diy2 = new diy("OAUTH_ERROR", 11);
        m = new diy[]{diy13, diy12, diy11, diy10, diy9, diy8, diy7, diy6, diy5, diy4, diy3, diy2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private diy() {
        void var2_-1;
        void var1_-1;
    }

    public static diy[] values() {
        return (diy[])m.clone();
    }
}

