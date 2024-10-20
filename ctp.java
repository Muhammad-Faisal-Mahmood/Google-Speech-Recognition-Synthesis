/*
 * Decompiled with CFR 0.152.
 */
public final class ctp
extends Enum
implements hwx {
    public static final /* enum */ ctp a;
    public static final /* enum */ ctp b;
    public static final /* enum */ ctp c;
    public static final /* enum */ ctp d;
    public static final /* enum */ ctp e;
    public static final /* enum */ ctp f;
    public static final /* enum */ ctp g;
    private static final ctp[] i;
    public final int h;

    static {
        ctp ctp2;
        ctp ctp3;
        ctp ctp4;
        ctp ctp5;
        ctp ctp6;
        ctp ctp7;
        ctp ctp8;
        a = ctp8 = new ctp("NONE", 0, 0);
        b = ctp7 = new ctp("SUBSCRIBED", 1, 1);
        c = ctp6 = new ctp("DOWNLOAD_IN_PROGRESS", 2, 2);
        d = ctp5 = new ctp("DOWNLOAD_FAILED", 3, 3);
        e = ctp4 = new ctp("DOWNLOAD_COMPLETE", 4, 4);
        f = ctp3 = new ctp("CORRUPTED", 5, 6);
        g = ctp2 = new ctp("INTERNAL_ERROR", 6, 5);
        i = new ctp[]{ctp8, ctp7, ctp6, ctp5, ctp4, ctp3, ctp2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ctp() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.h = var3_2;
    }

    public static ctp b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 6: {
                return f;
            }
            case 5: {
                return g;
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

    public static ctp[] values() {
        return (ctp[])i.clone();
    }

    @Override
    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}

