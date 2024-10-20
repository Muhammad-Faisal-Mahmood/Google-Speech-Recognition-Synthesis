/*
 * Decompiled with CFR 0.152.
 */
public final class hqn
extends Enum
implements hwx {
    public static final /* enum */ hqn a;
    public static final /* enum */ hqn b;
    public static final /* enum */ hqn c;
    public static final /* enum */ hqn d;
    public static final /* enum */ hqn e;
    public static final /* enum */ hqn f;
    @Deprecated
    public static final /* enum */ hqn g;
    private static final hqn[] h;
    private final int i;

    static {
        hqn hqn2;
        hqn hqn3;
        hqn hqn4;
        hqn hqn5;
        hqn hqn6;
        hqn hqn7;
        hqn hqn8;
        a = hqn8 = new hqn("UNKNOWN", 0, 0);
        b = hqn7 = new hqn("SHARED_PREFS", 1, 1);
        c = hqn6 = new hqn("CONTENT_PROVIDER", 2, 2);
        d = hqn5 = new hqn("PROCESS_STABLE", 3, 6);
        e = hqn4 = new hqn("TIKTOK", 4, 4);
        f = hqn3 = new hqn("DEVICE_CONFIG", 5, 5);
        g = hqn2 = new hqn("PROCESS_STABLE_CONTENT_PROVIDER", 6, 3);
        h = new hqn[]{hqn8, hqn7, hqn6, hqn5, hqn4, hqn3, hqn2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hqn() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.i = var3_2;
    }

    public static hqn b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 6: {
                return d;
            }
            case 5: {
                return f;
            }
            case 4: {
                return e;
            }
            case 3: {
                return g;
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

    public static hqn[] values() {
        return (hqn[])h.clone();
    }

    @Override
    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}

