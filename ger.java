/*
 * Decompiled with CFR 0.152.
 */
public final class ger
extends Enum {
    public static final /* enum */ ger a;
    public static final /* enum */ ger b;
    public static final /* enum */ ger c;
    public static final /* enum */ ger d;
    public static final /* enum */ ger e;
    public static final /* enum */ ger f;
    public static final /* enum */ ger g;
    private static final ger[] h;

    static {
        ger ger2;
        ger ger3;
        ger ger4;
        ger ger5;
        ger ger6;
        ger ger7;
        ger ger8;
        a = ger8 = new ger("LONG_VALUE", 0);
        b = ger7 = new ger("BOOLEAN_VALUE", 1);
        c = ger6 = new ger("DOUBLE_VALUE", 2);
        d = ger5 = new ger("STRING_VALUE", 3);
        e = ger4 = new ger("BYTES_VALUE", 4);
        f = ger3 = new ger("PROTO_VALUE", 5);
        g = ger2 = new ger("FLAGVALUE_NOT_SET", 6);
        h = new ger[]{ger8, ger7, ger6, ger5, ger4, ger3, ger2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ger() {
        void var2_-1;
        void var1_-1;
    }

    public static ger a(int n2) {
        switch (n2) {
            default: {
                return null;
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
        return g;
    }

    public static ger[] values() {
        return (ger[])h.clone();
    }
}

