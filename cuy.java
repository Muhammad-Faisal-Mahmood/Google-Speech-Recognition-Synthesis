/*
 * Decompiled with CFR 0.152.
 */
public final class cuy
extends Enum {
    public static final /* enum */ cuy a;
    public static final /* enum */ cuy b;
    public static final /* enum */ cuy c;
    public static final /* enum */ cuy d;
    public static final /* enum */ cuy e;
    private static final cuy[] f;

    static {
        cuy cuy2;
        cuy cuy3;
        cuy cuy4;
        cuy cuy5;
        cuy cuy6;
        a = cuy6 = new cuy("ANY", 0);
        b = cuy5 = new cuy("BLUETOOTH", 1);
        c = cuy4 = new cuy("ETHERNET", 2);
        d = cuy3 = new cuy("CELLULAR", 3);
        e = cuy2 = new cuy("WIFI", 4);
        f = new cuy[]{cuy6, cuy5, cuy4, cuy3, cuy2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cuy() {
        void var2_-1;
        void var1_-1;
    }

    public static cuy[] values() {
        return (cuy[])f.clone();
    }
}

