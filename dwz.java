/*
 * Decompiled with CFR 0.152.
 */
public final class dwz
extends Enum {
    public static final /* enum */ dwz a;
    public static final /* enum */ dwz b;
    public static final /* enum */ dwz c;
    public static final /* enum */ dwz d;
    public static final /* enum */ dwz e;
    public static final /* enum */ dwz f;
    public static final /* enum */ dwz g;
    public static final /* enum */ dwz h;
    public static final /* enum */ dwz i;
    public static final /* enum */ dwz j;
    private static final dwz[] k;

    static {
        dwz dwz2;
        dwz dwz3;
        dwz dwz4;
        dwz dwz5;
        dwz dwz6;
        dwz dwz7;
        dwz dwz8;
        dwz dwz9;
        dwz dwz10;
        dwz dwz11;
        a = dwz11 = new dwz("ASYNC_TASK", 0);
        b = dwz10 = new dwz("UNCAUGHT_EXCEPTION_HANDLER", 1);
        c = dwz9 = new dwz("PRIMES", 2);
        d = dwz8 = new dwz("APP_DOCTOR", 3);
        e = dwz7 = new dwz("JVM_LOG_FORMAT", 4);
        f = dwz6 = new dwz("LOGGING", 5);
        g = dwz5 = new dwz("STRICT_MODE", 6);
        h = dwz4 = new dwz("SSLGUARD", 7);
        i = dwz3 = new dwz("CRONET_URLSTREAMHANDLER", 8);
        j = dwz2 = new dwz("STARTUP_LISTENERS", 9);
        k = new dwz[]{dwz11, dwz10, dwz9, dwz8, dwz7, dwz6, dwz5, dwz4, dwz3, dwz2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dwz() {
        void var2_-1;
        void var1_-1;
    }

    public static dwz[] values() {
        return (dwz[])k.clone();
    }
}

