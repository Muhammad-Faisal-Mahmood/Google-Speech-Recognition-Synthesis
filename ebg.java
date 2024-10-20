/*
 * Decompiled with CFR 0.152.
 */
public final class ebg
extends Enum
implements hwx {
    public static final /* enum */ ebg A;
    public static final /* enum */ ebg B;
    public static final /* enum */ ebg C;
    public static final /* enum */ ebg D;
    public static final /* enum */ ebg E;
    public static final /* enum */ ebg F;
    public static final /* enum */ ebg G;
    public static final /* enum */ ebg H;
    public static final /* enum */ ebg I;
    private static final ebg[] K;
    public static final /* enum */ ebg a;
    public static final /* enum */ ebg b;
    public static final /* enum */ ebg c;
    public static final /* enum */ ebg d;
    public static final /* enum */ ebg e;
    public static final /* enum */ ebg f;
    public static final /* enum */ ebg g;
    public static final /* enum */ ebg h;
    public static final /* enum */ ebg i;
    public static final /* enum */ ebg j;
    public static final /* enum */ ebg k;
    public static final /* enum */ ebg l;
    public static final /* enum */ ebg m;
    public static final /* enum */ ebg n;
    public static final /* enum */ ebg o;
    public static final /* enum */ ebg p;
    public static final /* enum */ ebg q;
    public static final /* enum */ ebg r;
    public static final /* enum */ ebg s;
    public static final /* enum */ ebg t;
    public static final /* enum */ ebg u;
    public static final /* enum */ ebg v;
    public static final /* enum */ ebg w;
    public static final /* enum */ ebg x;
    public static final /* enum */ ebg y;
    public static final /* enum */ ebg z;
    public final int J;

    static {
        ebg ebg2;
        ebg ebg3;
        ebg ebg4;
        ebg ebg5;
        ebg ebg6;
        ebg ebg7;
        ebg ebg8;
        ebg ebg9;
        ebg ebg10;
        ebg ebg11;
        ebg ebg12;
        ebg ebg13;
        ebg ebg14;
        ebg ebg15;
        ebg ebg16;
        ebg ebg17;
        ebg ebg18;
        ebg ebg19;
        ebg ebg20;
        ebg ebg21;
        ebg ebg22;
        ebg ebg23;
        ebg ebg24;
        ebg ebg25;
        ebg ebg26;
        ebg ebg27;
        ebg ebg28;
        ebg ebg29;
        ebg ebg30;
        ebg ebg31;
        ebg ebg32;
        ebg ebg33;
        ebg ebg34;
        ebg ebg35;
        ebg ebg36;
        a = ebg36 = new ebg("UNKNOWN_DISCONNECT_REASON", 0, 0);
        b = ebg35 = new ebg("DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ROUTE", 1, 1);
        c = ebg34 = new ebg("DISCONNECT_REASON_AUDIO_ROUTE_LOST", 2, 2);
        d = ebg33 = new ebg("DISCONNECT_REASON_CLIENT_REQUESTED_ROUTE_UPDATE", 3, 3);
        e = ebg32 = new ebg("DISCONNECT_REASON_MISSING_AUDIO_ROUTE_IMPLEMENTATION", 4, 4);
        f = ebg31 = new ebg("DISCONNECT_REASON_CLIENT_DEACTIVATED", 5, 5);
        g = ebg30 = new ebg("DISCONNECT_REASON_AUDIO_ADAPTER_UNREGISTERED", 6, 6);
        h = ebg29 = new ebg("DISCONNECT_REASON_AUDIO_ADAPTER_NOT_REGISTERED", 7, 7);
        i = ebg28 = new ebg("DISCONNECT_REASON_INACTIVE_CLIENT", 8, 8);
        j = ebg27 = new ebg("DISCONNECT_REASON_START_SCO_FAILED", 9, 9);
        k = ebg26 = new ebg("DISCONNECT_REASON_START_SCO_TIMEOUT", 10, 10);
        l = ebg25 = new ebg("DISCONNECT_REASON_NO_BLUETOOTH_HEADSET_CONNECTED", 11, 11);
        m = ebg24 = new ebg("DISCONNECT_REASON_NO_BLUETOOTH_PROFILE_FOUND", 12, 12);
        n = ebg23 = new ebg("DISCONNECT_REASON_FAILED_GETTING_BLUETOOTH_HEADSET", 13, 13);
        o = ebg22 = new ebg("DISCONNECT_REASON_BLUETOOTH_NOT_AVAILABLE", 14, 14);
        p = ebg21 = new ebg("DISCONNECT_REASON_BLUETOOTH_PERMISSION_DENIED", 15, 15);
        q = ebg20 = new ebg("DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ADAPTER", 16, 16);
        r = ebg19 = new ebg("DISCONNECT_REASON_UNEXPECTED_AUDIO_ADAPTER_CONNECTION", 17, 17);
        s = ebg18 = new ebg("DISCONNECT_REASON_BLUETOOTH_HEADSET_DISCONNECTED", 18, 18);
        t = ebg17 = new ebg("DISCONNECT_REASON_BLUETOOTH_HEADSET_PROFILE_DISCONNECTED", 19, 19);
        u = ebg16 = new ebg("DISCONNECT_REASON_BLUETOOTH_HEADSET_AUDIO_DISCONNECTED", 20, 20);
        v = ebg15 = new ebg("DISCONNECT_REASON_START_BLUETOOTH_HEADSET_AUDIO_CONNECTION_FAILED", 21, 21);
        w = ebg14 = new ebg("DISCONNECT_REASON_BLUETOOTH_HEADSET_AUDIO_CONNECTION_TIMEOUT", 22, 22);
        x = ebg13 = new ebg("DISCONNECT_REASON_UNSUPPORTED_HOTWORD_ROUTE_PARAMS", 23, 24);
        y = ebg12 = new ebg("DISCONNECT_REASON_ROUTE_NOT_MAPPED", 24, 25);
        z = ebg11 = new ebg("DISCONNECT_REASON_CONCURRENCY_CONFLICT", 25, 26);
        A = ebg10 = new ebg("DISCONNECT_REASON_NEW_CLIENT_ACTIVATING", 26, 27);
        B = ebg9 = new ebg("DISCONNECT_REASON_BLUETOOTH_DEVICE_DENYLISTED", 27, 28);
        C = ebg8 = new ebg("DISCONNECT_REASON_AAP_CONNECTED", 28, 29);
        D = ebg7 = new ebg("DISCONNECT_REASON_INCOMPATIBLE_SDK", 29, 30);
        E = ebg6 = new ebg("DISCONNECT_REASON_DYNAMIC_SWITCHING_NO_NEXT_SOURCE", 30, 31);
        F = ebg5 = new ebg("DISCONNECT_REASON_INACTIVE_PARENT", 31, 32);
        G = ebg4 = new ebg("FAILED_GETTING_DISCONNECT_REASON", 32, 100);
        H = ebg3 = new ebg("FAILED_GETTING_GRPC_DISCONNECT_REASON", 33, 200);
        I = ebg2 = new ebg("DISCONNECT_REASON_REMOTE_COMMUNICATION_CHANNEL_SHUTDOWN", 34, 201);
        K = new ebg[]{ebg36, ebg35, ebg34, ebg33, ebg32, ebg31, ebg30, ebg29, ebg28, ebg27, ebg26, ebg25, ebg24, ebg23, ebg22, ebg21, ebg20, ebg19, ebg18, ebg17, ebg16, ebg15, ebg14, ebg13, ebg12, ebg11, ebg10, ebg9, ebg8, ebg7, ebg6, ebg5, ebg4, ebg3, ebg2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ebg() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.J = var3_2;
    }

    public static ebg b(int n2) {
        if (n2 != 100) {
            if (n2 != 200) {
                if (n2 != 201) {
                    switch (n2) {
                        default: {
                            switch (n2) {
                                default: {
                                    return null;
                                }
                                case 32: {
                                    return F;
                                }
                                case 31: {
                                    return E;
                                }
                                case 30: {
                                    return D;
                                }
                                case 29: {
                                    return C;
                                }
                                case 28: {
                                    return B;
                                }
                                case 27: {
                                    return A;
                                }
                                case 26: {
                                    return z;
                                }
                                case 25: {
                                    return y;
                                }
                                case 24: 
                            }
                            return x;
                        }
                        case 22: {
                            return w;
                        }
                        case 21: {
                            return v;
                        }
                        case 20: {
                            return u;
                        }
                        case 19: {
                            return t;
                        }
                        case 18: {
                            return s;
                        }
                        case 17: {
                            return r;
                        }
                        case 16: {
                            return q;
                        }
                        case 15: {
                            return p;
                        }
                        case 14: {
                            return o;
                        }
                        case 13: {
                            return n;
                        }
                        case 12: {
                            return m;
                        }
                        case 11: {
                            return l;
                        }
                        case 10: {
                            return k;
                        }
                        case 9: {
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
                return I;
            }
            return H;
        }
        return G;
    }

    public static ebg[] values() {
        return (ebg[])K.clone();
    }

    @Override
    public final int a() {
        return this.J;
    }

    public final String toString() {
        return Integer.toString(this.J);
    }
}

