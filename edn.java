/*
 * Decompiled with CFR 0.152.
 */
public final class edn
extends Enum
implements hwx {
    public static final /* enum */ edn a;
    public static final /* enum */ edn b;
    private static final edn[] c;
    private final int d;

    static {
        edn edn2;
        edn edn3;
        a = edn3 = new edn("AUDIO_ADAPTER_DISCONNECT_STATUS_UNKNOWN", 0, 0);
        b = edn2 = new edn("AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS", 1, 1);
        c = new edn[]{edn3, edn2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private edn() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static edn[] values() {
        return (edn[])c.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

