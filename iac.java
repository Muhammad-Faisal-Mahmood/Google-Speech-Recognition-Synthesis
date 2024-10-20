/*
 * Decompiled with CFR 0.152.
 */
public final class iac
extends Enum
implements hwx {
    public static final /* enum */ iac a;
    public static final /* enum */ iac b;
    @Deprecated
    public static final /* enum */ iac c;
    @Deprecated
    public static final /* enum */ iac d;
    @Deprecated
    public static final /* enum */ iac e;
    public static final /* enum */ iac f;
    public static final /* enum */ iac g;
    public static final /* enum */ iac h;
    public static final /* enum */ iac i;
    public static final /* enum */ iac j;
    public static final /* enum */ iac k;
    public static final /* enum */ iac l;
    public static final /* enum */ iac m;
    public static final /* enum */ iac n;
    public static final /* enum */ iac o;
    private static final iac[] p;
    private final int q;

    static {
        iac iac2;
        iac iac3;
        iac iac4;
        iac iac5;
        iac iac6;
        iac iac7;
        iac iac8;
        iac iac9;
        iac iac10;
        iac iac11;
        iac iac12;
        iac iac13;
        iac iac14;
        iac iac15;
        iac iac16;
        a = iac16 = new iac("UNKNOWN", 0, 0);
        b = iac15 = new iac("SUCCESS", 1, 1);
        c = iac14 = new iac("STATE_FAILURE", 2, 2);
        d = iac13 = new iac("STATE_SKIPPING", 3, 3);
        e = iac12 = new iac("STATE_RETRY", 4, 4);
        f = iac11 = new iac("STOPPED", 5, 5);
        g = iac10 = new iac("ERROR", 6, 6);
        h = iac9 = new iac("ERROR_INVALID_REQUEST", 7, 7);
        i = iac8 = new iac("ERROR_NETWORK", 8, 8);
        j = iac7 = new iac("ERROR_NETWORK_TIMEOUT", 9, 9);
        k = iac6 = new iac("ERROR_NOT_INSTALLED_YET", 10, 10);
        l = iac5 = new iac("ERROR_OUTPUT", 11, 11);
        m = iac4 = new iac("ERROR_SERVICE", 12, 12);
        n = iac3 = new iac("ERROR_SYNTHESIS", 13, 13);
        o = iac2 = new iac("UNRECOGNIZED", 14, -1);
        p = new iac[]{iac16, iac15, iac14, iac13, iac12, iac11, iac10, iac9, iac8, iac7, iac6, iac5, iac4, iac3, iac2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iac() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.q = var3_2;
    }

    public static iac[] values() {
        return (iac[])p.clone();
    }

    @Override
    public final int a() {
        if (this != o) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(this.a());
    }
}

