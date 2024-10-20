/*
 * Decompiled with CFR 0.152.
 */
public final class ehb
extends Enum {
    public static final /* enum */ ehb a;
    public static final /* enum */ ehb b;
    public static final /* enum */ ehb c;
    public static final /* enum */ ehb d;
    private static final ehb[] f;
    public final int e;

    static {
        ehb ehb2;
        ehb ehb3;
        ehb ehb4;
        ehb ehb5;
        a = ehb5 = new ehb("STATE_UNKNOWN", 0, -1);
        b = ehb4 = new ehb("STATE_AUDIO_DISCONNECTED", 1, 10);
        c = ehb3 = new ehb("STATE_AUDIO_CONNECTING", 2, 11);
        d = ehb2 = new ehb("STATE_AUDIO_CONNECTED", 3, 12);
        Enum[] enumArray = new ehb[]{ehb5, ehb4, ehb3, ehb2};
        f = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ehb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static ehb[] values() {
        return (ehb[])f.clone();
    }
}

