/*
 * Decompiled with CFR 0.152.
 */
public final class ebv
extends Enum
implements hwx {
    public static final /* enum */ ebv a;
    public static final /* enum */ ebv b;
    public static final /* enum */ ebv c;
    public static final /* enum */ ebv d;
    public static final /* enum */ ebv e;
    public static final /* enum */ ebv f;
    public static final /* enum */ ebv g;
    public static final /* enum */ ebv h;
    public static final /* enum */ ebv i;
    public static final /* enum */ ebv j;
    public static final /* enum */ ebv k;
    public static final /* enum */ ebv l;
    public static final /* enum */ ebv m;
    public static final /* enum */ ebv n;
    public static final /* enum */ ebv o;
    public static final /* enum */ ebv p;
    public static final /* enum */ ebv q;
    public static final /* enum */ ebv r;
    private static final ebv[] t;
    public final int s;

    static {
        ebv ebv2;
        ebv ebv3;
        ebv ebv4;
        ebv ebv5;
        ebv ebv6;
        ebv ebv7;
        ebv ebv8;
        ebv ebv9;
        ebv ebv10;
        ebv ebv11;
        ebv ebv12;
        ebv ebv13;
        ebv ebv14;
        ebv ebv15;
        ebv ebv16;
        ebv ebv17;
        ebv ebv18;
        ebv ebv19;
        a = ebv19 = new ebv("UNSET", 0, 0);
        b = ebv18 = new ebv("CLIENT_REQUESTED", 1, 1);
        c = ebv17 = new ebv("NEW_AUDIO_REQUEST_CLIENT_LISTENING", 2, 2);
        d = ebv16 = new ebv("NEW_HOTWORD_CLIENT_LISTENING", 3, 3);
        e = ebv15 = new ebv("TIMEOUT", 4, 4);
        f = ebv14 = new ebv("CLIENT_DEACTIVATED", 5, 5);
        g = ebv13 = new ebv("FAILED_START_LISTENING", 6, 6);
        h = ebv12 = new ebv("SEAMLESS_HANDOVER_TIMEOUT", 7, 7);
        i = ebv11 = new ebv("NEW_CLIENT_ACTIVATING", 8, 8);
        j = ebv10 = new ebv("FAILED_TO_CONNECT_TO_AUDIO_ROUTE", 9, 100);
        k = ebv9 = new ebv("AUDIO_ROUTE_LOST", 10, 101);
        l = ebv8 = new ebv("AUDIO_ROUTE_DISCONNECT_CLIENT_REQUESTED", 11, 102);
        m = ebv7 = new ebv("MISSING_AUDIO_ROUTE_IMPLEMENTATION", 12, 103);
        n = ebv6 = new ebv("ERROR_IN_GETTING_AUDIO_ROUTE_DISCONNECT_STATUS", 13, 104);
        o = ebv5 = new ebv("UNKNOWN_AUDIO_ROUTE_DISCONNECT_STATUS", 14, 105);
        p = ebv4 = new ebv("AUDIO_ADAPTER_NOT_REGISTERED", 15, 106);
        q = ebv3 = new ebv("UNEXPECTED_AUDIO_SOURCE_OPENED", 16, 107);
        r = ebv2 = new ebv("REMOTE_COMMUNICATION_CHANNEL_SHUTDOWN", 17, 108);
        t = new ebv[]{ebv19, ebv18, ebv17, ebv16, ebv15, ebv14, ebv13, ebv12, ebv11, ebv10, ebv9, ebv8, ebv7, ebv6, ebv5, ebv4, ebv3, ebv2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ebv() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.s = var3_2;
    }

    public static ebv b(int n2) {
        switch (n2) {
            default: {
                switch (n2) {
                    default: {
                        return null;
                    }
                    case 108: {
                        return r;
                    }
                    case 107: {
                        return q;
                    }
                    case 106: {
                        return p;
                    }
                    case 105: {
                        return o;
                    }
                    case 104: {
                        return n;
                    }
                    case 103: {
                        return m;
                    }
                    case 102: {
                        return l;
                    }
                    case 101: {
                        return k;
                    }
                    case 100: 
                }
                return j;
            }
            case 8: {
                return i;
            }
            case 7: {
                return h;
            }
            case 6: {
                return g;
            }
            case 5: {
                return f;
            }
            case 4: {
                return e;
            }
            case 3: {
                return d;
            }
            case 2: {
                return c;
            }
            case 1: {
                return b;
            }
            case 0: 
        }
        return a;
    }

    public static ebv[] values() {
        return (ebv[])t.clone();
    }

    @Override
    public final int a() {
        return this.s;
    }

    public final String toString() {
        return Integer.toString(this.s);
    }
}

