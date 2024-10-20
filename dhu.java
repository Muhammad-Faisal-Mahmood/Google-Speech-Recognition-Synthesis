/*
 * Decompiled with CFR 0.152.
 */
public final class dhu
extends Enum
implements hwx {
    public static final /* enum */ dhu a;
    public static final /* enum */ dhu b;
    public static final /* enum */ dhu c;
    public static final /* enum */ dhu d;
    public static final /* enum */ dhu e;
    public static final /* enum */ dhu f;
    public static final /* enum */ dhu g;
    public static final /* enum */ dhu h;
    public static final /* enum */ dhu i;
    public static final /* enum */ dhu j;
    public static final /* enum */ dhu k;
    public static final /* enum */ dhu l;
    public static final /* enum */ dhu m;
    private static final dhu[] n;
    private final int o;

    static {
        dhu dhu2;
        dhu dhu3;
        dhu dhu4;
        dhu dhu5;
        dhu dhu6;
        dhu dhu7;
        dhu dhu8;
        dhu dhu9;
        dhu dhu10;
        dhu dhu11;
        dhu dhu12;
        dhu dhu13;
        dhu dhu14;
        a = dhu14 = new dhu("FILE_DELETION_REASON_UNSPECIFIED", 0, 0);
        b = dhu13 = new dhu("EXPLICIT_GC", 1, 1);
        c = dhu12 = new dhu("CHILL_GC", 2, 2);
        d = dhu11 = new dhu("DELETE_PACKS", 3, 3);
        e = dhu10 = new dhu("RELEASE_SUPERPACK", 4, 4);
        f = dhu9 = new dhu("INVALID_PACK", 5, 5);
        g = dhu8 = new dhu("DELETE_FETCHED", 6, 6);
        h = dhu7 = new dhu("INVALID_UNSTAGED_FILE", 7, 7);
        i = dhu6 = new dhu("AGGRESSIVE_GC", 8, 8);
        j = dhu5 = new dhu("MANIFEST_GC", 9, 9);
        k = dhu4 = new dhu("POST_SYNC_GC", 10, 10);
        l = dhu3 = new dhu("DATA_CLEAR_REQUEST", 11, 11);
        m = dhu2 = new dhu("UNRECOGNIZED", 12, -1);
        n = new dhu[]{dhu14, dhu13, dhu12, dhu11, dhu10, dhu9, dhu8, dhu7, dhu6, dhu5, dhu4, dhu3, dhu2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dhu() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o = var3_2;
    }

    public static dhu[] values() {
        return (dhu[])n.clone();
    }

    @Override
    public final int a() {
        if (this != m) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(this.a());
    }
}

