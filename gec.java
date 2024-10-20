/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;

public final class gec
extends Enum {
    public static final /* enum */ gec a;
    public static final /* enum */ gec b;
    public static final /* enum */ gec c;
    public static final /* enum */ gec d;
    public static final /* enum */ gec e;
    public static final /* enum */ gec f;
    public static final /* enum */ gec g;
    public static final /* enum */ gec h;
    public static final /* enum */ gec i;
    public static final /* enum */ gec j;
    private static final gec[] l;
    final Duration k;

    static {
        gec gec2;
        gec gec3;
        gec gec4;
        gec gec5;
        gec gec6;
        gec gec7;
        gec gec8;
        gec gec9;
        gec gec10;
        gec gec11;
        a = gec11 = new gec("DONT_CARE", 0, Duration.ofMillis(Long.MAX_VALUE));
        b = gec10 = new gec("SAME_WEEK", 1, Duration.ofDays(7L));
        c = gec9 = new gec("SAME_DAY", 2, Duration.ofDays(1L));
        d = gec8 = new gec("FEW_HOURS", 3, Duration.ofHours(4L));
        e = gec7 = new gec("ONE_HOUR", 4, Duration.ofHours(1L));
        f = gec6 = new gec("HALF_HOUR", 5, Duration.ofMinutes(30L));
        g = gec5 = new gec("TEN_MINUTES", 6, Duration.ofMinutes(10L));
        h = gec4 = new gec("FEW_MINUTES", 7, Duration.ofMinutes(4L));
        i = gec3 = new gec("ONE_MINUTE", 8, Duration.ofMinutes(1L));
        j = gec2 = new gec("FEW_SECONDS", 9, Duration.ofSeconds(4L));
        l = new gec[]{gec11, gec10, gec9, gec8, gec7, gec6, gec5, gec4, gec3, gec2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gec() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.k = var3_2;
    }

    public static gec[] values() {
        return (gec[])l.clone();
    }
}

