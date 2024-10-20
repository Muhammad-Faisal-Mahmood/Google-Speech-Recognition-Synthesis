/*
 * Decompiled with CFR 0.152.
 */
public final class ech
extends Enum
implements hwx {
    public static final /* enum */ ech a;
    public static final /* enum */ ech b;
    public static final /* enum */ ech c;
    public static final /* enum */ ech d;
    public static final /* enum */ ech e;
    public static final /* enum */ ech f;
    public static final /* enum */ ech g;
    public static final /* enum */ ech h;
    public static final /* enum */ ech i;
    public static final /* enum */ ech j;
    public static final /* enum */ ech k;
    public static final /* enum */ ech l;
    public static final /* enum */ ech m;
    public static final /* enum */ ech n;
    public static final /* enum */ ech o;
    public static final /* enum */ ech p;
    public static final /* enum */ ech q;
    public static final /* enum */ ech r;
    public static final /* enum */ ech s;
    private static final ech[] u;
    public final int t;

    static {
        ech ech2;
        ech ech3;
        ech ech4;
        ech ech5;
        ech ech6;
        ech ech7;
        ech ech8;
        ech ech9;
        ech ech10;
        ech ech11;
        ech ech12;
        ech ech13;
        ech ech14;
        ech ech15;
        ech ech16;
        ech ech17;
        ech ech18;
        ech ech19;
        ech ech20;
        a = ech20 = new ech("UNKNOWN_EVENT", 0, 0);
        b = ech19 = new ech("ACTIVATE_AUDIO_REQUEST_CLIENT", 1, 1);
        c = ech18 = new ech("DEACTIVATE_AUDIO_REQUEST_CLIENT", 2, 2);
        d = ech17 = new ech("AUDIO_REQUEST_START_LISTENING", 3, 100);
        e = ech16 = new ech("AUDIO_REQUEST_STOP_LISTENING", 4, 101);
        f = ech15 = new ech("ACQUIRE_AUDIO_FOCUS", 5, 104);
        g = ech14 = new ech("RELEASE_AUDIO_FOCUS", 6, 105);
        h = ech13 = new ech("AUDIO_REQUEST_UPDATE_AUDIO_ROUTE", 7, 106);
        i = ech12 = new ech("UPDATE_AUDIO_ROUTE_TO_SEAMLESS_HANDOVER", 8, 107);
        j = ech11 = new ech("AUDIO_REQUEST_VERIFY_ROUTE_AND_START_LISTENING", 9, 108);
        k = ech10 = new ech("HOTWORD_START_LISTENING", 10, 200);
        l = ech9 = new ech("HOTWORD_STOP_LISTENING", 11, 201);
        m = ech8 = new ech("HOTWORD_STOP_LISTENING_SEAMLESS", 12, 202);
        n = ech7 = new ech("HOTWORD_UPDATE_AUDIO_ROUTE", 13, 203);
        o = ech6 = new ech("HOTWORD_VERIFY_ROUTE_AND_START_LISTENING", 14, 204);
        p = ech5 = new ech("DISCONNECT_AUDIO_ADAPTER_ROUTE", 15, 400);
        q = ech4 = new ech("DISCONNECT_AUDIO_ADAPTER_ROUTE_WITH_TIMEOUT", 16, 401);
        r = ech3 = new ech("REGISTER_AUDIO_ADAPTER", 17, 402);
        s = ech2 = new ech("UNREGISTER_AUDIO_ADAPTER", 18, 403);
        u = new ech[]{ech20, ech19, ech18, ech17, ech16, ech15, ech14, ech13, ech12, ech11, ech10, ech9, ech8, ech7, ech6, ech5, ech4, ech3, ech2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ech() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.t = var3_2;
    }

    public static ech b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 100) {
                        if (n2 != 101) {
                            switch (n2) {
                                default: {
                                    switch (n2) {
                                        default: {
                                            switch (n2) {
                                                default: {
                                                    return null;
                                                }
                                                case 403: {
                                                    return s;
                                                }
                                                case 402: {
                                                    return r;
                                                }
                                                case 401: {
                                                    return q;
                                                }
                                                case 400: 
                                            }
                                            return p;
                                        }
                                        case 204: {
                                            return o;
                                        }
                                        case 203: {
                                            return n;
                                        }
                                        case 202: {
                                            return m;
                                        }
                                        case 201: {
                                            return l;
                                        }
                                        case 200: 
                                    }
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
                                case 104: 
                            }
                            return f;
                        }
                        return e;
                    }
                    return d;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static ech[] values() {
        return (ech[])u.clone();
    }

    @Override
    public final int a() {
        return this.t;
    }

    public final String toString() {
        return Integer.toString(this.t);
    }
}

