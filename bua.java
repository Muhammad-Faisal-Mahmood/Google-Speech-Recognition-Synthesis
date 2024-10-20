/*
 * Decompiled with CFR 0.152.
 */
public final class bua
extends Enum
implements hwx {
    public static final /* enum */ bua a;
    public static final /* enum */ bua b;
    public static final /* enum */ bua c;
    public static final /* enum */ bua d;
    public static final /* enum */ bua e;
    public static final /* enum */ bua f;
    private static final bua[] h;
    public final int g;

    static {
        bua bua2;
        bua bua3;
        bua bua4;
        bua bua5;
        bua bua6;
        bua bua7;
        a = bua7 = new bua("TYPE_UNKNOWN", 0, 0);
        b = bua6 = new bua("TYPE_NETWORK", 1, 3);
        c = bua5 = new bua("TYPE_LSTM_CADENZA", 2, 8);
        d = bua4 = new bua("TYPE_SEANET", 3, 10);
        e = bua3 = new bua("TYPE_LEMONBALM_HAVOC", 4, 11);
        f = bua2 = new bua("TYPE_LOCOMEL", 5, 12);
        h = new bua[]{bua7, bua6, bua5, bua4, bua3, bua2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bua() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static bua b(int n2) {
        if (n2 != 0) {
            if (n2 != 3) {
                if (n2 != 8) {
                    switch (n2) {
                        default: {
                            return null;
                        }
                        case 12: {
                            return f;
                        }
                        case 11: {
                            return e;
                        }
                        case 10: 
                    }
                    return d;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static bua[] values() {
        return (bua[])h.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

