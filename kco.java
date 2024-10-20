/*
 * Decompiled with CFR 0.152.
 */
public final class kco
extends Enum
implements hwx {
    public static final /* enum */ kco a;
    public static final /* enum */ kco b;
    public static final /* enum */ kco c;
    private static final kco[] e;
    public final int d;

    static {
        kco kco2;
        kco kco3;
        kco kco4;
        a = kco4 = new kco("UNKNOWN_CLIENT_TYPE", 0, 0);
        b = kco3 = new kco("HOTWORD", 1, 1);
        c = kco2 = new kco("AUDIO_REQUEST", 2, 2);
        e = new kco[]{kco4, kco3, kco2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kco() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static kco[] values() {
        return (kco[])e.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

