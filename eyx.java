/*
 * Decompiled with CFR 0.152.
 */
public final class eyx
extends Enum {
    public static final /* enum */ eyx a;
    public static final /* enum */ eyx b;
    public static final /* enum */ eyx c;
    public static final /* enum */ eyx d;
    private static final eyx[] g;
    public final String e;
    public final icq f;

    static {
        eyx eyx2;
        eyx eyx3;
        eyx eyx4;
        eyx eyx5;
        a = eyx5 = new eyx("AMR", 0, "audio/AMR", icq.d);
        b = eyx4 = new eyx("AMRWB", 1, "audio/amr-wb", icq.j);
        c = eyx3 = new eyx("PCM", 2, "audio/wav", icq.a);
        d = eyx2 = new eyx("OGGOPUS", 3, "audio/ogg", icq.k);
        g = new eyx[]{eyx5, eyx4, eyx3, eyx2};
    }

    /*
     * WARNING - void declaration
     */
    private eyx() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
        this.f = var4_1;
    }

    public static eyx[] values() {
        return (eyx[])g.clone();
    }
}

