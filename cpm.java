/*
 * Decompiled with CFR 0.152.
 */
public final class cpm
extends Enum {
    public static final /* enum */ cpm a;
    public static final /* enum */ cpm b;
    public static final /* enum */ cpm c;
    private static final cpm[] d;

    static {
        cpm cpm2;
        cpm cpm3;
        cpm cpm4;
        a = cpm4 = new cpm("LOG_ERROR", 0);
        b = cpm3 = new cpm("REPORT_STRICT_MODE_VIOLATION", 1);
        c = cpm2 = new cpm("CRASH_APP", 2);
        d = new cpm[]{cpm4, cpm3, cpm2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cpm() {
        void var2_-1;
        void var1_-1;
    }

    public static cpm[] values() {
        return (cpm[])d.clone();
    }
}

