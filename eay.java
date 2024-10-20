/*
 * Decompiled with CFR 0.152.
 */
public final class eay
extends Enum {
    public static final /* enum */ eay a;
    public static final /* enum */ eay b;
    public static final /* enum */ eay c;
    public static final /* enum */ eay d;
    public static final /* enum */ eay e;
    public static final /* enum */ eay f;
    public static final /* enum */ eay g;
    public static final /* enum */ eay h;
    public static final /* enum */ eay i;
    private static final eay[] j;

    static {
        eay eay2;
        eay eay3;
        eay eay4;
        eay eay5;
        eay eay6;
        eay eay7;
        eay eay8;
        eay eay9;
        eay eay10;
        a = eay10 = new eay("BLUETOOTH_AUDIO_ROUTE", 0);
        b = eay9 = new eay("BUILTIN_AUDIO_ROUTE", 1);
        c = eay8 = new eay("DSP_AUDIO_ROUTE", 2);
        d = eay7 = new eay("BISTO_AUDIO_ROUTE", 3);
        e = eay6 = new eay("HANDOVER_ROUTE", 4);
        f = eay5 = new eay("SODA_ROUTE", 5);
        g = eay4 = new eay("CAR_AUDIO_ROUTE", 6);
        h = eay3 = new eay("GACS_AUDIO_ROUTE", 7);
        i = eay2 = new eay("AUDIOROUTE_NOT_SET", 8);
        j = new eay[]{eay10, eay9, eay8, eay7, eay6, eay5, eay4, eay3, eay2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eay() {
        void var2_-1;
        void var1_-1;
    }

    public static eay a(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 8: {
                return h;
            }
            case 7: {
                return g;
            }
            case 6: {
                return f;
            }
            case 5: {
                return e;
            }
            case 4: {
                return d;
            }
            case 3: {
                return c;
            }
            case 2: {
                return b;
            }
            case 1: {
                return a;
            }
            case 0: 
        }
        return i;
    }

    public static eay[] values() {
        return (eay[])j.clone();
    }
}

