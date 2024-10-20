/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class hhs
extends Enum {
    public static final /* enum */ hhs A;
    public static final /* enum */ hhs B;
    public static final /* enum */ hhs C;
    public static final /* enum */ hhs D;
    public static final /* enum */ hhs E;
    public static final Map F;
    private static final hhs[] H;
    public static final /* enum */ hhs a;
    public static final /* enum */ hhs b;
    public static final /* enum */ hhs c;
    public static final /* enum */ hhs d;
    public static final /* enum */ hhs e;
    public static final /* enum */ hhs f;
    public static final /* enum */ hhs g;
    public static final /* enum */ hhs h;
    public static final /* enum */ hhs i;
    public static final /* enum */ hhs j;
    public static final /* enum */ hhs k;
    public static final /* enum */ hhs l;
    public static final /* enum */ hhs m;
    public static final /* enum */ hhs n;
    public static final /* enum */ hhs o;
    public static final /* enum */ hhs p;
    public static final /* enum */ hhs q;
    public static final /* enum */ hhs r;
    public static final /* enum */ hhs s;
    public static final /* enum */ hhs t;
    public static final /* enum */ hhs u;
    public static final /* enum */ hhs v;
    public static final /* enum */ hhs w;
    public static final /* enum */ hhs x;
    public static final /* enum */ hhs y;
    public static final /* enum */ hhs z;
    public final char G;

    static {
        hhs hhs2;
        hhs hhs3;
        hhs hhs4;
        hhs hhs5;
        hhs hhs6;
        hhs hhs7;
        hhs hhs8;
        hhs hhs9;
        hhs hhs10;
        hhs hhs11;
        hhs hhs12;
        hhs hhs13;
        hhs hhs14;
        hhs hhs15;
        hhs hhs16;
        hhs hhs172;
        hhs hhs18;
        hhs hhs19;
        hhs hhs20;
        hhs hhs21;
        hhs hhs22;
        hhs hhs23;
        hhs hhs24;
        hhs hhs25;
        hhs hhs26;
        hhs hhs27;
        hhs hhs28;
        hhs hhs29;
        hhs hhs30;
        a = hhs30 = new hhs("TIME_HOUR_OF_DAY_PADDED", 0, 'H');
        b = hhs29 = new hhs("TIME_HOUR_OF_DAY", 1, 'k');
        c = hhs28 = new hhs("TIME_HOUR_12H_PADDED", 2, 'I');
        d = hhs27 = new hhs("TIME_HOUR_12H", 3, 'l');
        e = hhs26 = new hhs("TIME_MINUTE_OF_HOUR_PADDED", 4, 'M');
        f = hhs25 = new hhs("TIME_SECONDS_OF_MINUTE_PADDED", 5, 'S');
        g = hhs24 = new hhs("TIME_MILLIS_OF_SECOND_PADDED", 6, 'L');
        h = hhs23 = new hhs("TIME_NANOS_OF_SECOND_PADDED", 7, 'N');
        i = hhs22 = new hhs("TIME_AM_PM", 8, 'p');
        j = hhs21 = new hhs("TIME_TZ_NUMERIC", 9, 'z');
        k = hhs20 = new hhs("TIME_TZ_SHORT", 10, 'Z');
        l = hhs19 = new hhs("TIME_EPOCH_SECONDS", 11, 's');
        m = hhs18 = new hhs("TIME_EPOCH_MILLIS", 12, 'Q');
        n = hhs172 = new hhs("DATE_MONTH_FULL", 13, 'B');
        o = hhs16 = new hhs("DATE_MONTH_SHORT", 14, 'b');
        p = hhs15 = new hhs("DATE_MONTH_SHORT_ALT", 15, 'h');
        q = hhs14 = new hhs("DATE_DAY_FULL", 16, 'A');
        r = hhs13 = new hhs("DATE_DAY_SHORT", 17, 'a');
        s = hhs12 = new hhs("DATE_CENTURY_PADDED", 18, 'C');
        t = hhs11 = new hhs("DATE_YEAR_PADDED", 19, 'Y');
        u = hhs10 = new hhs("DATE_YEAR_OF_CENTURY_PADDED", 20, 'y');
        v = hhs9 = new hhs("DATE_DAY_OF_YEAR_PADDED", 21, 'j');
        w = hhs8 = new hhs("DATE_MONTH_PADDED", 22, 'm');
        x = hhs7 = new hhs("DATE_DAY_OF_MONTH_PADDED", 23, 'd');
        hhs[] hhsArray = new hhs("DATE_DAY_OF_MONTH", 24, 'e');
        y = hhsArray;
        z = hhs6 = new hhs("DATETIME_HOURS_MINUTES", 25, 'R');
        A = hhs5 = new hhs("DATETIME_HOURS_MINUTES_SECONDS", 26, 'T');
        B = hhs4 = new hhs("DATETIME_HOURS_MINUTES_SECONDS_12H", 27, 'r');
        Object object = new hhs("DATETIME_MONTH_DAY_YEAR", 28, 'D');
        C = object;
        D = hhs3 = new hhs("DATETIME_YEAR_MONTH_DAY", 29, 'F');
        E = hhs2 = new hhs("DATETIME_FULL", 30, 'c');
        H = new hhs[]{hhs30, hhs29, hhs28, hhs27, hhs26, hhs25, hhs24, hhs23, hhs22, hhs21, hhs20, hhs19, hhs18, hhs172, hhs16, hhs15, hhs14, hhs13, hhs12, hhs11, hhs10, hhs9, hhs8, hhs7, hhsArray, hhs6, hhs5, hhs4, object, hhs3, hhs2};
        object = new HashMap();
        for (hhs hhs172 : hhs.values()) {
            if (object.put(Character.valueOf(hhs172.G), hhs172) == null) {
                continue;
            }
            throw new IllegalStateException("duplicate format character: ".concat(String.valueOf(String.valueOf((Object)hhs172))));
        }
        F = DesugarCollections.unmodifiableMap(object);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hhs() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.G = var3_2;
    }

    public static hhs[] values() {
        return (hhs[])H.clone();
    }
}

