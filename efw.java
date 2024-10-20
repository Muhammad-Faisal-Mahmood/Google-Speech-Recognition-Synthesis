/*
 * Decompiled with CFR 0.152.
 */
public final class efw
extends Enum
implements hwx {
    public static final /* enum */ efw a;
    public static final /* enum */ efw b;
    public static final /* enum */ efw c;
    public static final /* enum */ efw d;
    public static final /* enum */ efw e;
    private static final efw[] g;
    public final int f;

    static {
        efw efw2;
        efw efw3;
        efw efw4;
        efw efw5;
        efw efw6;
        a = efw6 = new efw("UNKNOWN_EVENT", 0, 0);
        b = efw5 = new efw("STARTED_RECORDING", 1, 1);
        c = efw4 = new efw("STOPPED_RECORDING", 2, 2);
        d = efw3 = new efw("START_RECORDING_FAILED", 3, 3);
        e = efw2 = new efw("STOP_RECORDING_FAILED", 4, 4);
        g = new efw[]{efw6, efw5, efw4, efw3, efw2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private efw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static efw[] values() {
        return (efw[])g.clone();
    }

    @Override
    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}

