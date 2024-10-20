/*
 * Decompiled with CFR 0.152.
 */
public final class dxw
extends Enum
implements dyg {
    public static final /* enum */ dxw a;
    public static final /* enum */ dxw b;
    public static final /* enum */ dxw c;
    public static final /* enum */ dxw d;
    public static final /* enum */ dxw e;
    public static final /* enum */ dxw f;
    public static final /* enum */ dxw g;
    public static final /* enum */ dxw h;
    public static final /* enum */ dxw i;
    public static final /* enum */ dxw j;
    public static final /* enum */ dxw k;
    public static final /* enum */ dxw l;
    public static final /* enum */ dxw m;
    public static final /* enum */ dxw n;
    public static final /* enum */ dxw o;
    public static final /* enum */ dxw p;
    public static final /* enum */ dxw q;
    private static final dxw[] r;
    private final int s;
    private final int t;

    static {
        dxw dxw2;
        dxw dxw3;
        dxw dxw4;
        dxw dxw5;
        dxw dxw6;
        dxw dxw7;
        dxw dxw8;
        dxw dxw9;
        dxw dxw10;
        dxw dxw11;
        dxw dxw12;
        dxw dxw13;
        dxw dxw14;
        dxw dxw15;
        dxw dxw16;
        dxw dxw17;
        dxw dxw18;
        a = dxw18 = new dxw("FLOW_TYPE_UNKNOWN", 0, 0, 1);
        b = dxw17 = new dxw("NONE", 1, 1, 1);
        c = dxw16 = new dxw("TRANSCRIPTION_INTENT_API", 2, 101, 1);
        d = dxw15 = new dxw("TRANSCRIPTION_RECOGNITION_SERVICE", 3, 102, 1);
        e = dxw14 = new dxw("TRANSCRIPTION_VOICE_IME", 4, 103, 1);
        f = dxw13 = new dxw("BACKGROUND_SYNC", 5, 104, 100);
        g = dxw12 = new dxw("INTENT_DOWNLOAD_LANGUAGE", 6, 105, 1);
        h = dxw11 = new dxw("INTENT_GET_LANGUAGE_DETAILS", 7, 106, 1);
        i = dxw10 = new dxw("SETTINGS_DOWNLOAD_CONDITION", 8, 107, 1);
        j = dxw9 = new dxw("SETTINGS_LOAD_AVAILABLE_PACK_LIST", 9, 108, 1);
        k = dxw8 = new dxw("SETTINGS_LOAD_DOWNLOADED_PACK_LIST", 10, 109, 1);
        l = dxw7 = new dxw("SETTINGS_PACK_DIALOG", 11, 110, 1);
        m = dxw6 = new dxw("DICTATION_QUALITY_METRICS", 12, 111, 1);
        n = dxw5 = new dxw("MODEL_MANAGER_CHECK_RECOGNITION_SUPPORT", 13, 112, 1);
        o = dxw4 = new dxw("MODEL_MANAGER_TRIGGER_MODEL_DOWNLOAD", 14, 113, 1);
        p = dxw3 = new dxw("TRANSCRIPTION_RECOGNITION_GRPC_SERVICE", 15, 114, 1);
        q = dxw2 = new dxw("TRANSCRIPTION_INTENT_API_COUNT", 16, 115, 1);
        r = new dxw[]{dxw18, dxw17, dxw16, dxw15, dxw14, dxw13, dxw12, dxw11, dxw10, dxw9, dxw8, dxw7, dxw6, dxw5, dxw4, dxw3, dxw2};
    }

    /*
     * WARNING - void declaration
     */
    private dxw() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.s = var3_2;
        new dyf(1673, 1);
        this.t = var4_1;
    }

    public static dxw[] values() {
        return (dxw[])r.clone();
    }

    @Override
    public final int a() {
        return this.t;
    }

    @Override
    public final int b() {
        return this.s;
    }
}

