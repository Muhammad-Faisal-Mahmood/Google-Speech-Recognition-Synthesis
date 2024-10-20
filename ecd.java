/*
 * Decompiled with CFR 0.152.
 */
public final class ecd
extends Enum
implements hwx {
    public static final /* enum */ ecd a;
    public static final /* enum */ ecd b;
    public static final /* enum */ ecd c;
    public static final /* enum */ ecd d;
    public static final /* enum */ ecd e;
    public static final /* enum */ ecd f;
    public static final /* enum */ ecd g;
    public static final /* enum */ ecd h;
    public static final /* enum */ ecd i;
    public static final /* enum */ ecd j;
    private static final ecd[] l;
    public final int k;

    static {
        ecd ecd2;
        ecd ecd3;
        ecd ecd4;
        ecd ecd5;
        ecd ecd6;
        ecd ecd7;
        ecd ecd8;
        ecd ecd9;
        ecd ecd10;
        ecd ecd11;
        a = ecd11 = new ecd("OUTCOME_UNKNOWN_BUFFER_AUDIO", 0, 0);
        b = ecd10 = new ecd("OUTCOME_BUFFER_CLOSED", 1, 1);
        c = ecd9 = new ecd("OUTCOME_BUFFER_OVERFLOW", 2, 2);
        d = ecd8 = new ecd("OUTCOME_BUFFER_COUNTER_OVERFLOW", 3, 3);
        e = ecd7 = new ecd("OUTCOME_BUFFER_READ_ERROR", 4, 4);
        f = ecd6 = new ecd("OUTCOME_BUFFER_READ_IOEXCEPTION", 5, 5);
        g = ecd5 = new ecd("OUTCOME_BUFFER_COPY_INTERRUPTED", 6, 6);
        h = ecd4 = new ecd("OUTCOME_AUDIO_BYTES_RECEIVER_REGISTERED", 7, 100);
        i = ecd3 = new ecd("OUTCOME_AUDIO_BYTES_RECEIVER_BYTES_DISPOSED", 8, 102);
        j = ecd2 = new ecd("OUTCOME_AUDIO_BYTES_RECEIVER_WITH_OFFSET_BYTES_DISPOSED", 9, 103);
        l = new ecd[]{ecd11, ecd10, ecd9, ecd8, ecd7, ecd6, ecd5, ecd4, ecd3, ecd2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ecd() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.k = var3_2;
    }

    public static ecd b(int n2) {
        if (n2 != 100) {
            if (n2 != 102) {
                if (n2 != 103) {
                    switch (n2) {
                        default: {
                            return null;
                        }
                        case 6: {
                            return g;
                        }
                        case 5: {
                            return f;
                        }
                        case 4: {
                            return e;
                        }
                        case 3: {
                            return d;
                        }
                        case 2: {
                            return c;
                        }
                        case 1: {
                            return b;
                        }
                        case 0: 
                    }
                    return a;
                }
                return j;
            }
            return i;
        }
        return h;
    }

    public static ecd[] values() {
        return (ecd[])l.clone();
    }

    @Override
    public final int a() {
        return this.k;
    }

    public final String toString() {
        return Integer.toString(this.k);
    }
}

