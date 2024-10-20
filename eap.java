/*
 * Decompiled with CFR 0.152.
 */
public final class eap
extends Enum
implements hwx {
    public static final /* enum */ eap a;
    public static final /* enum */ eap b;
    public static final /* enum */ eap c;
    public static final /* enum */ eap d;
    public static final /* enum */ eap e;
    public static final /* enum */ eap f;
    public static final /* enum */ eap g;
    private static final eap[] i;
    public final int h;

    static {
        eap eap2;
        eap eap3;
        eap eap4;
        eap eap5;
        eap eap6;
        eap eap7;
        eap eap8;
        a = eap8 = new eap("UNKNOWN_DEACTIVATING_STATUS", 0, 0);
        b = eap7 = new eap("FAILED_DEACTIVATING_DUE_TO_INACTIVE_CLIENT", 1, 2);
        c = eap6 = new eap("FAILED_DEACTIVATING_GRPC_STATUS_NOT_RECEIVED", 2, 4);
        d = eap5 = new eap("DEACTIVATED_NEW_CLIENT", 3, 5);
        e = eap4 = new eap("DEACTIVATED_CLIENT_REQUESTED", 4, 6);
        f = eap3 = new eap("FAILED_GETTING_DEACTIVATE_STATUS", 5, 7);
        g = eap2 = new eap("DEACTIVATED_REMOTE_COMMUNICATION_CHANNEL_SHUTDOWN", 6, 8);
        i = new eap[]{eap8, eap7, eap6, eap5, eap4, eap3, eap2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eap() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.h = var3_2;
    }

    public static eap b(int n2) {
        if (n2 != 0) {
            if (n2 != 2) {
                switch (n2) {
                    default: {
                        return null;
                    }
                    case 8: {
                        return g;
                    }
                    case 7: {
                        return f;
                    }
                    case 6: {
                        return e;
                    }
                    case 5: {
                        return d;
                    }
                    case 4: 
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static eap[] values() {
        return (eap[])i.clone();
    }

    @Override
    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}

