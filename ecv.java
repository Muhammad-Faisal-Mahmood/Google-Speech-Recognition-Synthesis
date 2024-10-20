/*
 * Decompiled with CFR 0.152.
 */
public final class ecv
extends Enum {
    public static final /* enum */ ecv a;
    public static final /* enum */ ecv b;
    public static final /* enum */ ecv c;
    private static final ecv[] d;

    static {
        ecv ecv2;
        ecv ecv3;
        ecv ecv4;
        a = ecv4 = new ecv("URI_PARAMS", 0);
        b = ecv3 = new ecv("MEDIA_SYNC_EVENT", 1);
        c = ecv2 = new ecv("OPTIONALAUDIOINPUTMODE_NOT_SET", 2);
        d = new ecv[]{ecv4, ecv3, ecv2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ecv() {
        void var2_-1;
        void var1_-1;
    }

    public static ecv a(int n2) {
        if (n2 != 0) {
            if (n2 != 9) {
                if (n2 != 13) {
                    return null;
                }
                return a;
            }
            return b;
        }
        return c;
    }

    public static ecv[] values() {
        return (ecv[])d.clone();
    }
}

