/*
 * Decompiled with CFR 0.152.
 */
public final class zw
extends Enum {
    public static final /* enum */ zw a;
    public static final /* enum */ zw b;
    public static final /* enum */ zw c;
    public static final /* enum */ zw d;
    public static final /* enum */ zw e;
    public static final /* enum */ zw f;
    public static final /* enum */ zw g;
    public static final /* enum */ zw h;
    public static final /* enum */ zw i;
    private static final zw[] j;

    static {
        zw zw2;
        zw zw3;
        zw zw4;
        zw zw5;
        zw zw6;
        zw zw7;
        zw zw8;
        zw zw9;
        zw zw10;
        a = zw10 = new zw("PENALTY_LOG", 0);
        b = zw9 = new zw("PENALTY_DEATH", 1);
        c = zw8 = new zw("DETECT_FRAGMENT_REUSE", 2);
        d = zw7 = new zw("DETECT_FRAGMENT_TAG_USAGE", 3);
        e = zw6 = new zw("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f = zw5 = new zw("DETECT_RETAIN_INSTANCE_USAGE", 5);
        g = zw4 = new zw("DETECT_SET_USER_VISIBLE_HINT", 6);
        h = zw3 = new zw("DETECT_TARGET_FRAGMENT_USAGE", 7);
        i = zw2 = new zw("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        j = new zw[]{zw10, zw9, zw8, zw7, zw6, zw5, zw4, zw3, zw2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zw() {
        void var2_-1;
        void var1_-1;
    }

    public static zw[] values() {
        return (zw[])j.clone();
    }
}

