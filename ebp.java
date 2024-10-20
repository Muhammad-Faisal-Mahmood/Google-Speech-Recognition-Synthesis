/*
 * Decompiled with CFR 0.152.
 */
public final class ebp
extends Enum
implements hwx {
    public static final /* enum */ ebp A;
    public static final /* enum */ ebp B;
    public static final /* enum */ ebp C;
    public static final /* enum */ ebp D;
    public static final /* enum */ ebp E;
    public static final /* enum */ ebp F;
    public static final /* enum */ ebp G;
    public static final /* enum */ ebp H;
    public static final /* enum */ ebp I;
    public static final /* enum */ ebp J;
    public static final /* enum */ ebp K;
    public static final /* enum */ ebp L;
    private static final ebp[] N;
    public static final /* enum */ ebp a;
    public static final /* enum */ ebp b;
    public static final /* enum */ ebp c;
    public static final /* enum */ ebp d;
    public static final /* enum */ ebp e;
    public static final /* enum */ ebp f;
    public static final /* enum */ ebp g;
    public static final /* enum */ ebp h;
    public static final /* enum */ ebp i;
    public static final /* enum */ ebp j;
    public static final /* enum */ ebp k;
    public static final /* enum */ ebp l;
    public static final /* enum */ ebp m;
    public static final /* enum */ ebp n;
    public static final /* enum */ ebp o;
    public static final /* enum */ ebp p;
    public static final /* enum */ ebp q;
    public static final /* enum */ ebp r;
    public static final /* enum */ ebp s;
    public static final /* enum */ ebp t;
    public static final /* enum */ ebp u;
    public static final /* enum */ ebp v;
    public static final /* enum */ ebp w;
    public static final /* enum */ ebp x;
    public static final /* enum */ ebp y;
    public static final /* enum */ ebp z;
    public final int M;

    static {
        ebp ebp2;
        ebp ebp3;
        ebp ebp4;
        ebp ebp5;
        ebp ebp6;
        ebp ebp7;
        ebp ebp8;
        ebp ebp9;
        ebp ebp10;
        ebp ebp11;
        ebp ebp12;
        ebp ebp13;
        ebp ebp14;
        ebp ebp15;
        ebp ebp16;
        ebp ebp17;
        ebp ebp18;
        ebp ebp19;
        ebp ebp20;
        ebp ebp21;
        ebp ebp22;
        ebp ebp23;
        ebp ebp24;
        ebp ebp25;
        ebp ebp26;
        ebp ebp27;
        ebp ebp28;
        ebp ebp29;
        ebp ebp30;
        ebp ebp31;
        ebp ebp32;
        ebp ebp33;
        ebp ebp34;
        ebp ebp35;
        ebp ebp36;
        ebp ebp37;
        ebp ebp38;
        ebp ebp39;
        a = ebp39 = new ebp("UNKNOWN_CLOSING_FAILURE", 0, 0);
        b = ebp38 = new ebp("FAILED_CLOSING_DUE_TO_INACTIVE_CLIENT", 1, 100);
        c = ebp37 = new ebp("FAILED_CLOSING_DUE_TO_INACTIVE_SESSION", 2, 101);
        d = ebp36 = new ebp("FAILED_CLOSING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING", 3, 102);
        e = ebp35 = new ebp("FAILED_TO_KEEP_MIC_OPEN_FOR_SEAMLESS_HANDOVER", 4, 103);
        f = ebp34 = new ebp("FAILED_CLOSING_NO_AUDIO_SOURCE", 5, 104);
        g = ebp33 = new ebp("FAILED_CLOSING_NO_AUDIO_RECORD", 6, 105);
        h = ebp32 = new ebp("FAILED_CLOSING_NO_AUDIO_URI_STREAM", 7, 106);
        i = ebp31 = new ebp("FAILED_CLOSING_WAS_NOT_OPENED", 8, 107);
        j = ebp30 = new ebp("FAILED_CLOSING_DUE_TO_FAILED_OPENING_AUDIO_SOURCE", 9, 108);
        k = ebp29 = new ebp("FAILED_CLOSING_MICROPHONE_PERMISSION_DENIED", 10, 109);
        l = ebp28 = new ebp("FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS", 11, 110);
        m = ebp27 = new ebp("FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_STREAM", 12, 111);
        n = ebp26 = new ebp("FAILED_CLOSING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE", 13, 112);
        o = ebp25 = new ebp("FAILED_CLOSING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION", 14, 113);
        p = ebp24 = new ebp("FAILED_CLOSING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE", 15, 114);
        q = ebp23 = new ebp("FAILED_CLOSING_OP_NOT_ALLOWED", 16, 115);
        r = ebp22 = new ebp("FAILED_CLOSING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE", 17, 116);
        s = ebp21 = new ebp("FAILED_CLOSING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED", 18, 117);
        t = ebp20 = new ebp("FAILED_CLOSING_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING", 19, 118);
        u = ebp19 = new ebp("FAILED_CLOSING_NO_AUDIO_PFD_STREAM", 20, 119);
        v = ebp18 = new ebp("FAILED_CLOSING_MIC_OCCUPIED", 21, 120);
        w = ebp17 = new ebp("FAILED_CLOSING_VOICE_DSP_HOTWORD_MIC_AEC_IS_SET", 22, 121);
        x = ebp16 = new ebp("FAILED_CLOSING_DUE_TO_INACTIVE_PARENT", 23, 122);
        y = ebp15 = new ebp("FAILED_CLOSING_AUDIO_RECORD_ERROR", 24, 200);
        z = ebp14 = new ebp("FAILED_CLOSING_AUDIO_URI_STREAM_ERROR", 25, 201);
        A = ebp13 = new ebp("FAILED_CLOSING_AUDIO_PFD_STREAM_ERROR", 26, 202);
        B = ebp12 = new ebp("FAILED_CLOSING_BISTO_MIC_NOT_REGISTERED", 27, 300);
        C = ebp11 = new ebp("FAILED_CLOSING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA", 28, 302);
        D = ebp10 = new ebp("FAILED_CLOSING_CALLED_WITHOUT_PRECACHED_BUFFER_ID", 29, 304);
        E = ebp9 = new ebp("FAILED_CLOSING_CALLED_UNEXPECTED_PRECACHED_BUFFER_ID", 30, 305);
        F = ebp8 = new ebp("FAILED_CLOSING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND", 31, 306);
        G = ebp7 = new ebp("FAILED_CLOSING_NO_AUDIO_ADAPTER_FOUND", 32, 307);
        H = ebp6 = new ebp("FAILED_CLOSING_GRPC_STOP_LISTENING_STATUS_NOT_RECEIVED", 33, 401);
        I = ebp5 = new ebp("FAILED_CLOSING_ERROR_RETRIEVING_STATUS", 34, 500);
        J = ebp4 = new ebp("FAILED_CLOSING_HOTWORD_ERROR_RETRIEVING_STATUS", 35, 501);
        K = ebp3 = new ebp("FAILED_CLOSING_NO_AUDIO_STREAM_IN_STORE", 36, 600);
        L = ebp2 = new ebp("FAILED_CLOSING_CONCURRENCY_CONFLICT", 37, 601);
        N = new ebp[]{ebp39, ebp38, ebp37, ebp36, ebp35, ebp34, ebp33, ebp32, ebp31, ebp30, ebp29, ebp28, ebp27, ebp26, ebp25, ebp24, ebp23, ebp22, ebp21, ebp20, ebp19, ebp18, ebp17, ebp16, ebp15, ebp14, ebp13, ebp12, ebp11, ebp10, ebp9, ebp8, ebp7, ebp6, ebp5, ebp4, ebp3, ebp2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ebp() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.M = var3_2;
    }

    public static ebp b(int n2) {
        if (n2 != 0) {
            if (n2 != 300) {
                if (n2 != 302) {
                    if (n2 != 401) {
                        if (n2 != 500) {
                            if (n2 != 501) {
                                if (n2 != 600) {
                                    if (n2 != 601) {
                                        switch (n2) {
                                            default: {
                                                switch (n2) {
                                                    default: {
                                                        switch (n2) {
                                                            default: {
                                                                return null;
                                                            }
                                                            case 307: {
                                                                return G;
                                                            }
                                                            case 306: {
                                                                return F;
                                                            }
                                                            case 305: {
                                                                return E;
                                                            }
                                                            case 304: 
                                                        }
                                                        return D;
                                                    }
                                                    case 202: {
                                                        return A;
                                                    }
                                                    case 201: {
                                                        return z;
                                                    }
                                                    case 200: 
                                                }
                                                return y;
                                            }
                                            case 122: {
                                                return x;
                                            }
                                            case 121: {
                                                return w;
                                            }
                                            case 120: {
                                                return v;
                                            }
                                            case 119: {
                                                return u;
                                            }
                                            case 118: {
                                                return t;
                                            }
                                            case 117: {
                                                return s;
                                            }
                                            case 116: {
                                                return r;
                                            }
                                            case 115: {
                                                return q;
                                            }
                                            case 114: {
                                                return p;
                                            }
                                            case 113: {
                                                return o;
                                            }
                                            case 112: {
                                                return n;
                                            }
                                            case 111: {
                                                return m;
                                            }
                                            case 110: {
                                                return l;
                                            }
                                            case 109: {
                                                return k;
                                            }
                                            case 108: {
                                                return j;
                                            }
                                            case 107: {
                                                return i;
                                            }
                                            case 106: {
                                                return h;
                                            }
                                            case 105: {
                                                return g;
                                            }
                                            case 104: {
                                                return f;
                                            }
                                            case 103: {
                                                return e;
                                            }
                                            case 102: {
                                                return d;
                                            }
                                            case 101: {
                                                return c;
                                            }
                                            case 100: 
                                        }
                                        return b;
                                    }
                                    return L;
                                }
                                return K;
                            }
                            return J;
                        }
                        return I;
                    }
                    return H;
                }
                return C;
            }
            return B;
        }
        return a;
    }

    public static ebp[] values() {
        return (ebp[])N.clone();
    }

    @Override
    public final int a() {
        return this.M;
    }

    public final String toString() {
        return Integer.toString(this.M);
    }
}

