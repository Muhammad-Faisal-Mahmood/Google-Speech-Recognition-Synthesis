/*
 * Decompiled with CFR 0.152.
 */
public final class cwh
extends Enum {
    public static final /* enum */ cwh a;
    public static final /* enum */ cwh b;
    public static final /* enum */ cwh c;
    public static final /* enum */ cwh d;
    public static final /* enum */ cwh e;
    private static final cwh[] f;

    static {
        cwh cwh2;
        cwh cwh3;
        cwh cwh4;
        cwh cwh5;
        cwh cwh6;
        a = cwh6 = new cwh("UNSPECIFIED", 0);
        b = cwh5 = new cwh("FILE_ALREADY_SHARED", 1);
        c = cwh4 = new cwh("FILE_SHARING_CHECKSUM_NOT_PROVIDED", 2);
        d = cwh3 = new cwh("FILE_ALREADY_EXISTS_IN_ANDROID_SHARED_STORAGE", 3);
        e = cwh2 = new cwh("FILE_NOT_SHARED_IN_ANDROID_SHARED_STORAGE", 4);
        f = new cwh[]{cwh6, cwh5, cwh4, cwh3, cwh2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cwh() {
        void var2_-1;
        void var1_-1;
    }

    public static cwh[] values() {
        return (cwh[])f.clone();
    }
}

