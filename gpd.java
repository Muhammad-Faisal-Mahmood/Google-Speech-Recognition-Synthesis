/*
 * Decompiled with CFR 0.152.
 */
public final class gpd
extends Enum {
    public static final /* enum */ gpd a;
    public static final /* enum */ gpd b;
    public static final /* enum */ gpd c;
    private static final gpd[] d;

    static {
        gpd gpd2;
        gpd gpd3;
        gpd gpd4;
        a = gpd4 = new gpd("DISABLED", 0);
        b = gpd3 = new gpd("THROW_ON_FAILURE", 1);
        c = gpd2 = new gpd("LOG_ON_FAILURE", 2);
        d = new gpd[]{gpd4, gpd3, gpd2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gpd() {
        void var2_-1;
        void var1_-1;
    }

    public static gpd[] values() {
        return (gpd[])d.clone();
    }
}

