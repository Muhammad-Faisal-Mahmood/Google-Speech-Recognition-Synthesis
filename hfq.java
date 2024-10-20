/*
 * Decompiled with CFR 0.152.
 */
public final class hfq
extends Enum {
    public static final /* enum */ hfq a;
    public static final /* enum */ hfq b;
    public static final /* enum */ hfq c;
    public static final /* enum */ hfq d;
    public static final /* enum */ hfq e;
    public static final /* enum */ hfq f;
    public static final /* enum */ hfq g;
    public static final /* enum */ hfq h;
    public static final /* enum */ hfq i;
    public static final /* enum */ hfq j;
    public static final hfq[] k;
    private static final hfq[] p;
    public final char l;
    public final hfs m;
    public final int n;
    public final String o;

    static {
        hfq hfq2;
        hfq hfq3;
        hfq hfq4;
        hfq hfq52;
        hfq hfq6;
        hfq hfq7;
        hfq hfq8;
        hfq hfq9;
        hfq hfq10;
        a = hfq10 = new hfq("STRING", 0, 's', hfs.a, "-#", true);
        b = hfq9 = new hfq("BOOLEAN", 1, 'b', hfs.b, "-", true);
        c = hfq8 = new hfq("CHAR", 2, 'c', hfs.c, "-", true);
        hfq[] hfqArray = new hfq("DECIMAL", 3, 'd', hfs.d, "-0+ ,(", false);
        d = hfqArray;
        e = hfq7 = new hfq("OCTAL", 4, 'o', hfs.d, "-#0(", false);
        f = hfq6 = new hfq("HEX", 5, 'x', hfs.d, "-#0(", true);
        g = hfq52 = new hfq("FLOAT", 6, 'f', hfs.e, "-#0+ ,(", false);
        h = hfq4 = new hfq("EXPONENT", 7, 'e', hfs.e, "-#0+ (", true);
        i = hfq3 = new hfq("GENERAL", 8, 'g', hfs.e, "-0+ ,(", true);
        j = hfq2 = new hfq("EXPONENT_HEX", 9, 'a', hfs.e, "-#0+ ", true);
        p = new hfq[]{hfq10, hfq9, hfq8, hfqArray, hfq7, hfq6, hfq52, hfq4, hfq3, hfq2};
        k = new hfq[26];
        for (hfq hfq52 : hfq.values()) {
            int n2 = hfq.a(hfq52.l);
            hfq.k[n2] = hfq52;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hfq(String string, boolean bl2) {
        void var5_3;
        void var6_4;
        void var2_-1;
        void var1_-1;
        this.l = (char)string;
        this.m = (hfs)bl2;
        Object object = hfr.a;
        int n2 = true != var6_4 ? 0 : 128;
        for (int i2 = 0; i2 < var5_3.length(); ++i2) {
            int n3 = hfr.a(var5_3.charAt(i2));
            if (n3 >= 0) {
                n2 |= 1 << n3;
                continue;
            }
            throw new IllegalArgumentException("invalid flags: ".concat((String)var5_3));
        }
        this.n = n2;
        object = new StringBuilder("%");
        ((StringBuilder)object).append((char)string);
        this.o = ((StringBuilder)object).toString();
    }

    public static int a(char c2) {
        return (c2 | 0x20) - 97;
    }

    public static hfq[] values() {
        return (hfq[])p.clone();
    }
}

