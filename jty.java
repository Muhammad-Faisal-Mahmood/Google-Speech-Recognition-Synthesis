/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class jty
extends Enum {
    public static final /* enum */ jty a;
    public static final /* enum */ jty b;
    public static final /* enum */ jty c;
    public static final /* enum */ jty d;
    public static final /* enum */ jty e;
    public static final /* enum */ jty f;
    public static final /* enum */ jty g;
    private static final jty[] i;
    public final TimeUnit h;

    static {
        jty jty2;
        jty jty3;
        jty jty4;
        jty jty5;
        jty jty6;
        jty jty7;
        jty jty8;
        a = jty8 = new jty("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        b = jty7 = new jty("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c = jty6 = new jty("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        d = jty5 = new jty("SECONDS", 3, TimeUnit.SECONDS);
        e = jty4 = new jty("MINUTES", 4, TimeUnit.MINUTES);
        f = jty3 = new jty("HOURS", 5, TimeUnit.HOURS);
        g = jty2 = new jty("DAYS", 6, TimeUnit.DAYS);
        Enum[] enumArray = new jty[]{jty8, jty7, jty6, jty5, jty4, jty3, jty2};
        i = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jty() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.h = var3_2;
    }

    public static jty[] values() {
        return (jty[])i.clone();
    }
}

