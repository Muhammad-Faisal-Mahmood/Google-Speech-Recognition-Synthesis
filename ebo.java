/*
 * Decompiled with CFR 0.152.
 */
public final class ebo
extends Enum
implements hwx {
    private static final ebo[] A;
    public static final /* enum */ ebo a;
    public static final /* enum */ ebo b;
    public static final /* enum */ ebo c;
    public static final /* enum */ ebo d;
    public static final /* enum */ ebo e;
    public static final /* enum */ ebo f;
    public static final /* enum */ ebo g;
    public static final /* enum */ ebo h;
    public static final /* enum */ ebo i;
    public static final /* enum */ ebo j;
    public static final /* enum */ ebo k;
    public static final /* enum */ ebo l;
    public static final /* enum */ ebo m;
    public static final /* enum */ ebo n;
    public static final /* enum */ ebo o;
    public static final /* enum */ ebo p;
    public static final /* enum */ ebo q;
    public static final /* enum */ ebo r;
    public static final /* enum */ ebo s;
    public static final /* enum */ ebo t;
    public static final /* enum */ ebo u;
    public static final /* enum */ ebo v;
    public static final /* enum */ ebo w;
    public static final /* enum */ ebo x;
    public static final /* enum */ ebo y;
    public final int z;

    static {
        ebo ebo2;
        ebo ebo3;
        ebo ebo4;
        ebo ebo5;
        ebo ebo6;
        ebo ebo7;
        ebo ebo8;
        ebo ebo9;
        ebo ebo10;
        ebo ebo11;
        ebo ebo12;
        ebo ebo13;
        ebo ebo14;
        ebo ebo15;
        ebo ebo16;
        ebo ebo17;
        ebo ebo18;
        ebo ebo19;
        ebo ebo20;
        ebo ebo21;
        ebo ebo22;
        ebo ebo23;
        ebo ebo24;
        ebo ebo25;
        ebo ebo26;
        a = ebo26 = new ebo("UNKNOWN_ROUTING_STATUS", 0, 0);
        b = ebo25 = new ebo("UPDATED", 1, 1);
        c = ebo24 = new ebo("FAILED_ROUTING_DUE_TO_INACTIVE_CLIENT", 2, 2);
        d = ebo23 = new ebo("FAILED_ROUTING_DUE_TO_UNSUPPORTED_HOTWORD_ROUTE_PARAMS", 3, 4);
        e = ebo22 = new ebo("FAILED_ROUTING_TO_BUILTIN_DUE_TO_AUDIO_REQUEST_CLIENT_CONNECTED_TO_BLUETOOTH", 4, 5);
        f = ebo21 = new ebo("FAILED_ROUTING_DUE_TO_DISCONNECT_ALREADY_CALLED", 5, 6);
        g = ebo20 = new ebo("FAILED_ROUTING_DUE_TO_AUDIO_ADAPTER_NOT_REGISTERED", 6, 7);
        h = ebo19 = new ebo("FAILED_ROUTING_DUE_TO_HANDOVER_ROUTE_NOT_MAPPED", 7, 8);
        i = ebo18 = new ebo("FAILED_ROUTING_DUE_TO_START_SCO_FAILED", 8, 9);
        j = ebo17 = new ebo("FAILED_ROUTING_DUE_TO_AUDIO_ROUTE_LOST", 9, 10);
        k = ebo16 = new ebo("FAILED_ROUTING_DUE_TO_SCO_TIMEOUT", 10, 11);
        l = ebo15 = new ebo("FAILED_ROUTING_DUE_TO_BLUETOOTH_NOT_AVAILABLE", 11, 12);
        m = ebo14 = new ebo("FAILED_ROUTING_DUE_TO_NO_BLUETOOTH_HEADSET_FOUND", 12, 13);
        n = ebo13 = new ebo("FAILED_ROUTING_DUE_TO_NO_BLUETOOTH_PROFILE_FOUND", 13, 14);
        o = ebo12 = new ebo("FAILED_ROUTING_DUE_TO_GETTING_BLUETOOTH_HEADSET_FAILED", 14, 15);
        p = ebo11 = new ebo("FAILED_ROUTING_DUE_TO_BLUETOOTH_PERMISSION_DENIED", 15, 16);
        q = ebo10 = new ebo("FAILED_ROUTING_DUE_TO_CANNOT_CONNECT_TO_AUDIO_ADAPTER", 16, 17);
        r = ebo9 = new ebo("FAILED_ROUTING_UNEXPECTED_AUDIO_ADAPTER_CONNECTION", 17, 18);
        s = ebo8 = new ebo("FAILED_ROUTING_START_BLUETOOTH_HEADSET_AUDIO_CONNECTION_FAILED", 18, 19);
        t = ebo7 = new ebo("FAILED_ROUTING_BLUETOOTH_HEADSET_AUDIO_CONNECTION_TIMEOUT", 19, 20);
        u = ebo6 = new ebo("FAILED_ROUTING_DUE_TO_CONCURRENCY_CONFLICT", 20, 21);
        v = ebo5 = new ebo("FAILED_ROUTING_DUE_TO_BLUETOOTH_DEVICE_DENYLISTED", 21, 22);
        w = ebo4 = new ebo("FAILED_ROUTING_DUE_TO_AAP_CONNECTED", 22, 23);
        x = ebo3 = new ebo("FAILED_ROUTING_DUE_TO_INCOMPATIBLE_SDK", 23, 24);
        y = ebo2 = new ebo("FAILED_GETTING_ROUTING_STATUS_FUTURE", 24, 101);
        A = new ebo[]{ebo26, ebo25, ebo24, ebo23, ebo22, ebo21, ebo20, ebo19, ebo18, ebo17, ebo16, ebo15, ebo14, ebo13, ebo12, ebo11, ebo10, ebo9, ebo8, ebo7, ebo6, ebo5, ebo4, ebo3, ebo2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ebo() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.z = var3_2;
    }

    public static ebo b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 101) {
                        switch (n2) {
                            default: {
                                return null;
                            }
                            case 24: {
                                return x;
                            }
                            case 23: {
                                return w;
                            }
                            case 22: {
                                return v;
                            }
                            case 21: {
                                return u;
                            }
                            case 20: {
                                return t;
                            }
                            case 19: {
                                return s;
                            }
                            case 18: {
                                return r;
                            }
                            case 17: {
                                return q;
                            }
                            case 16: {
                                return p;
                            }
                            case 15: {
                                return o;
                            }
                            case 14: {
                                return n;
                            }
                            case 13: {
                                return m;
                            }
                            case 12: {
                                return l;
                            }
                            case 11: {
                                return k;
                            }
                            case 10: {
                                return j;
                            }
                            case 9: {
                                return i;
                            }
                            case 8: {
                                return h;
                            }
                            case 7: {
                                return g;
                            }
                            case 6: {
                                return f;
                            }
                            case 5: {
                                return e;
                            }
                            case 4: 
                        }
                        return d;
                    }
                    return y;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static ebo[] values() {
        return (ebo[])A.clone();
    }

    @Override
    public final int a() {
        return this.z;
    }

    public final String toString() {
        return Integer.toString(this.z);
    }
}

