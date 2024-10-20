/*
 * Decompiled with CFR 0.152.
 */
public final class dxu
extends Enum
implements dyg {
    public static final /* enum */ dxu a;
    public static final /* enum */ dxu b;
    public static final /* enum */ dxu c;
    public static final /* enum */ dxu d;
    public static final /* enum */ dxu e;
    public static final /* enum */ dxu f;
    public static final /* enum */ dxu g;
    public static final /* enum */ dxu h;
    public static final /* enum */ dxu i;
    public static final /* enum */ dxu j;
    public static final /* enum */ dxu k;
    private static final dxu[] l;
    private final int m;
    private final int n;

    static {
        dxu dxu2;
        dxu dxu3;
        dxu dxu4;
        dxu dxu5;
        dxu dxu6;
        dxu dxu7;
        dxu dxu8;
        dxu dxu9;
        dxu dxu10;
        dxu dxu11;
        dxu dxu12;
        a = dxu12 = new dxu("FLOW_TYPE_UNKNOWN", 0, 0, 1);
        b = dxu11 = new dxu("NONE", 1, 1, 1);
        c = dxu10 = new dxu("AUDIO_ROUTE_CONNECT", 2, 101, 1000);
        d = dxu9 = new dxu("AUDIO_ROUTE_DISCONNECT", 3, 102, 1000);
        e = dxu8 = new dxu("AUDIO_LISTENING", 4, 103, 1000);
        f = dxu7 = new dxu("AUDIO_BUFFER", 5, 104, 1000);
        g = dxu6 = new dxu("AUDIOTACTILE_FEEDBACK", 6, 105, 1000);
        h = dxu5 = new dxu("AUDIO_FOCUS_ACQUIRE", 7, 106, 1000);
        i = dxu4 = new dxu("AUDIO_FOCUS_RELEASE", 8, 107, 1000);
        j = dxu3 = new dxu("AUDIO_ROUTE_INNER_CONNECT", 9, 108, 1000);
        k = dxu2 = new dxu("AUDIO_PLAYBACK", 10, 109, 1);
        l = new dxu[]{dxu12, dxu11, dxu10, dxu9, dxu8, dxu7, dxu6, dxu5, dxu4, dxu3, dxu2};
    }

    /*
     * WARNING - void declaration
     */
    private dxu() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.m = var3_2;
        new dyf(2759, 1);
        this.n = var4_1;
    }

    public static dxu[] values() {
        return (dxu[])l.clone();
    }

    @Override
    public final int a() {
        return this.n;
    }

    @Override
    public final int b() {
        return this.m;
    }
}

