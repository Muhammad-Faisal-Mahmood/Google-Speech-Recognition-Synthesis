/*
 * Decompiled with CFR 0.152.
 */
public final class dxt {
    private static final hav A;
    private static final String B;
    public static final dyo a;
    public static final dyn b;
    public static final dyo c;
    public static final dyn d;
    public static final dyo e;
    public static final dyo f;
    public static final dyo g;
    public static final dyo h;
    public static final dyn i;
    public static final dyo j;
    public static final dyo k;
    public static final dyo l;
    public static final dyo m;
    public static final dyo n;
    public static final dyo o;
    public static final dyn p;
    public static final dyo q;
    public static final dyn r;
    public static final dyo s;
    public static final dyn t;
    public static final dyo u;
    public static final dyn v;
    public static final dyo w;
    public static final dyo x;
    public static final dyo y;
    private static final dyf z;

    static {
        z = new dyf(2759, a.z(0));
        A = hav.s(6, 7, 1673, 1770, 1827, 1855, 1856, 1870, 1909, 2369, 2512, 2711, 2734, 2759, 2895, 2974);
        B = "com.google.android.libraries.search.appflows.apps.audiolibraryandroid.FlowEventsProto.FlowEvent";
        dxt.a("UNKNOWN_EVENT", 0, dxu.b, false, gsl.a);
        dxt.a("META_START_EVENT", 1, dxu.b, false, gsl.a);
        dxt.a("META_END_EVENT", 2, dxu.b, false, gsl.a);
        Object object = dxu.c;
        Object object2 = 120000L;
        a = dxt.a("AUDIO_ROUTE_CONNECT_STARTED", 101, (dyg)object, true, gto.i(object2));
        object = dxu.c;
        Object object3 = gsl.a;
        b = dxt.b("AUDIO_ROUTE_CONNECT_DONE", 102, (dyg)object, new int[]{101}, (gto)object3);
        c = dxt.a("AUDIO_ROUTE_DISCONNECT_STARTED", 103, dxu.d, true, gto.i(object2));
        object3 = dxu.d;
        object = gsl.a;
        d = dxt.b("AUDIO_ROUTE_DISCONNECT_DONE", 104, (dyg)object3, new int[]{103}, (gto)object);
        object3 = dxu.e;
        object = 3600000L;
        e = dxt.a("AUDIO_START_LISTENING_STARTED", 105, (dyg)object3, true, gto.i(object));
        f = dxt.a("AUDIO_START_LISTENING_DONE", 106, dxu.b, false, gsl.a);
        g = dxt.a("AUDIO_LISTENING_FIRST_BYTE_RECEIVED", 107, dxu.b, false, gsl.a);
        h = dxt.a("AUDIO_STOP_LISTENING_STARTED", 108, dxu.b, false, gsl.a);
        dxu dxu2 = dxu.e;
        object3 = gsl.a;
        i = dxt.b("AUDIO_STOP_LISTENING_DONE", 109, dxu2, new int[]{105}, (gto)object3);
        j = dxt.a("AUDIO_BUFFER_CREATED", 110, dxu.f, true, gto.i(object));
        k = dxt.a("AUDIO_BYTES_RECEIVER_REGISTERED", 111, dxu.b, false, gsl.a);
        l = dxt.a("AUDIO_BUFFER_COPY_INTERRUPTED", 112, dxu.b, false, gsl.a);
        m = dxt.a("AUDIO_BUFFER_READ_ERROR", 113, dxu.b, false, gsl.a);
        n = dxt.a("AUDIO_BUFFER_OVERFLOW", 114, dxu.b, false, gsl.a);
        o = dxt.a("AUDIO_BUFFER_COUNTER_OVERFLOW", 115, dxu.b, false, gsl.a);
        object = dxu.f;
        object3 = gsl.a;
        p = dxt.b("AUDIO_BUFFER_CLOSED", 116, (dyg)object, new int[]{110}, (gto)object3);
        dxt.a("AUDIOTACTILE_FEEDBACK_STARTED", 117, dxu.g, true, gto.i(object2));
        dxt.a("AUDIOTACTILE_FEEDBACK_LOAD_TRACK_STARTED", 118, dxu.b, false, gsl.a);
        dxt.a("AUDIOTACTILE_FEEDBACK_LOAD_TRACK_DONE", 119, dxu.b, false, gsl.a);
        dxt.a("AUDIOTACTILE_FEEDBACK_PLAY_STARTED", 120, dxu.b, false, gsl.a);
        dxt.a("AUDIOTACTILE_FEEDBACK_PLAY_INTERRUPTED", 121, dxu.b, false, gsl.a);
        dxt.a("AUDIOTACTILE_FEEDBACK_PLAY_STOPPED", 122, dxu.b, false, gsl.a);
        object = dxu.g;
        object3 = gsl.a;
        dxt.b("AUDIOTACTILE_FEEDBACK_DONE", 123, (dyg)object, new int[]{117}, (gto)object3);
        q = dxt.a("AUDIO_FOCUS_ACQUIRE_STARTED", 124, dxu.h, true, gto.i(object2));
        object3 = dxu.h;
        object = gsl.a;
        r = dxt.b("AUDIO_FOCUS_ACQUIRE_DONE", 125, (dyg)object3, new int[]{124}, (gto)object);
        s = dxt.a("AUDIO_FOCUS_RELEASE_STARTED", 126, dxu.i, true, gto.i(object2));
        object = dxu.i;
        object3 = gsl.a;
        t = dxt.b("AUDIO_FOCUS_RELEASE_DONE", 127, (dyg)object, new int[]{126}, (gto)object3);
        u = dxt.a("AUDIO_ROUTE_INNER_CONNECT_STARTED", 128, dxu.j, true, gto.i(object2));
        object2 = dxu.j;
        object = gsl.a;
        v = dxt.b("AUDIO_ROUTE_INNER_CONNECT_DONE", 129, (dyg)object2, new int[]{128}, (gto)object);
        w = dxt.a("ZLM_AUDIO_SOURCE_OPEN_DONE", 130, dxu.b, false, gsl.a);
        x = dxt.a("CONNECTING_AUDIO_FOR_AUDIO_DEVICE_WITH_NULL_ADDRESS", 131, dxu.b, false, gsl.a);
        y = dxt.a("CONNECTING_BLE_AUDIO_DEVICE", 132, dxu.b, false, gsl.a);
        dxt.a("AUDIO_PLAYBACK_PLAYER_INITIALIZED", 133, dxu.b, false, gsl.a);
        dxt.a("AUDIO_PLAYBACK_FIRST_CHUNK_RECEIVED", 134, dxu.b, false, gsl.a);
        dxt.a("AUDIO_PLAYBACK_PLAYER_READY_TO_PLAY", 135, dxu.b, false, gsl.a);
        dxt.a("AUDIO_PLAYBACK_PLAY_REQUESTED", 136, dxu.b, false, gsl.a);
        dxt.a("AUDIO_PLAYBACK_STARTED", 137, dxu.b, false, gsl.a);
        dxt.a("AUDIO_PLAYBACK_ENDED", 138, dxu.b, false, gsl.a);
        object2 = dxu.k;
        object = gsl.a;
        dxt.b("AUDIO_PLAYBACK_SESSION_CLOSED", 139, (dyg)object2, new int[]{140}, (gto)object);
        dxt.a("AUDIO_PLAYBACK_SESSION_CREATED", 140, dxu.k, true, gto.i(600000L));
    }

    private static dyo a(String string, int n2, dyg dyg2, boolean bl2, gto gto2) {
        dyf dyf2 = z;
        hav hav2 = A;
        String string2 = B;
        return new dyo(new dxx(string, bl2, gto2, n2, dyg2, new int[0], dyf2, hav2, string2));
    }

    private static dyn b(String string, int n2, dyg dyg2, int[] nArray, gto gto2) {
        return new dyn(new dxx(string, false, gto2, n2, dyg2, nArray, z, A, B));
    }
}

