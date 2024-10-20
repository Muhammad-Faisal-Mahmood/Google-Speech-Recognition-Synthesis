/*
 * Decompiled with CFR 0.152.
 */
public final class ikq
extends Enum
implements hwx {
    public static final /* enum */ ikq a;
    public static final /* enum */ ikq b;
    public static final /* enum */ ikq c;
    public static final /* enum */ ikq d;
    public static final /* enum */ ikq e;
    public static final /* enum */ ikq f;
    public static final /* enum */ ikq g;
    public static final /* enum */ ikq h;
    public static final /* enum */ ikq i;
    public static final /* enum */ ikq j;
    public static final /* enum */ ikq k;
    private static final ikq[] m;
    public final int l;

    static {
        ikq ikq2;
        ikq ikq3;
        ikq ikq4;
        ikq ikq5;
        ikq ikq6;
        ikq ikq7;
        ikq ikq8;
        ikq ikq9;
        ikq ikq10;
        ikq ikq11;
        ikq ikq12;
        a = ikq12 = new ikq("NOT_SET", 0, 0);
        b = ikq11 = new ikq("CPS_APP_PROCESS_GLOBAL_PROVIDER", 1, 1);
        c = ikq10 = new ikq("NON_CPS_APP_PROCESS_GLOBAL_PROVIDER", 2, 2);
        d = ikq9 = new ikq("LOGGER_OVERRIDE_PROVIDER", 3, 3);
        e = ikq8 = new ikq("LOGGER_DEFERRING_PROVIDER", 4, 4);
        f = ikq7 = new ikq("EVENT_OVERRIDE", 5, 5);
        g = ikq6 = new ikq("EVENT_DEFERRING", 6, 6);
        h = ikq5 = new ikq("LOG_SOURCE_MAPPED", 7, 7);
        i = ikq4 = new ikq("SERVER_INFRASTRUCTURE", 8, 8);
        j = ikq3 = new ikq("LOG_REQUEST_SETTER_WEB", 9, 9);
        k = ikq2 = new ikq("PRIVACY_CONTEXT_RESOLVER", 10, 10);
        m = new ikq[]{ikq12, ikq11, ikq10, ikq9, ikq8, ikq7, ikq6, ikq5, ikq4, ikq3, ikq2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ikq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.l = var3_2;
    }

    public static ikq[] values() {
        return (ikq[])m.clone();
    }

    @Override
    public final int a() {
        return this.l;
    }

    public final String toString() {
        return Integer.toString(this.l);
    }
}

