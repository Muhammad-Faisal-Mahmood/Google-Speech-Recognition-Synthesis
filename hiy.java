/*
 * Decompiled with CFR 0.152.
 */
import java.math.RoundingMode;
import java.util.Arrays;

final class hiy {
    public final char[] a;
    final int b;
    final int c;
    final int d;
    final int e;
    public final byte[] f;
    private final String g;
    private final boolean[] h;
    private final boolean i;

    public hiy(String string, char[] cArray) {
        byte[] byArray = new byte[128];
        Arrays.fill(byArray, (byte)-1);
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            char c2 = cArray[i2];
            boolean bl2 = true;
            boolean bl3 = c2 < '\u0080';
            fxf.s(bl3, "Non-ASCII character: %s", c2);
            bl3 = byArray[c2] == -1 ? bl2 : false;
            fxf.s(bl3, "Duplicate character: %s", c2);
            byArray[c2] = (byte)i2;
        }
        this(string, cArray, byArray);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private hiy(String var1_1, char[] var2_3, byte[] var3_4) {
        block13: {
            super();
            this.g = var1_1 /* !! */ ;
            fxf.K(var2_3);
            this.a = (char[])var2_3;
            var5_5 = ((Object)var2_3).length;
            var1_1 /* !! */  = RoundingMode.UNNECESSARY;
            if (var5_5 <= 0) ** GOTO lbl44
            switch (hmk.a[var1_1 /* !! */ .ordinal()]) {
                default: {
                    break block13;
                }
                case 6: 
                case 7: 
                case 8: {
                    var4_6 = Integer.numberOfLeadingZeros(var5_5);
                    var4_6 = 31 - var4_6 + ((-1257966797 >>> var4_6) - var5_5 >>> 31);
                    break;
                }
                case 4: 
                case 5: {
                    var4_6 = 32 - Integer.numberOfLeadingZeros(var5_5 - 1);
                    break;
                }
                case 1: {
                    var8_8 = (var5_5 - 1 & var5_5) == 0;
                    hhk.am(var8_8);
                }
                case 2: 
                case 3: {
                    var4_6 = 31 - Integer.numberOfLeadingZeros(var5_5);
                }
            }
            this.c = var4_6;
            var7_9 = Integer.numberOfTrailingZeros(var4_6);
            this.d = var6_10 = 1 << 3 - var7_9;
            this.e = var4_6 >> var7_9;
            this.b = var5_5 - 1;
            this.f = var3_4;
            var1_1 /* !! */  = (String)new boolean[var6_10];
            var4_6 = 0;
            while (true) {
                if (var4_6 >= this.e) {
                    this.h = (boolean[])var1_1 /* !! */ ;
                    this.i = false;
                    return;
                }
                var1_1 /* !! */ [hhk.av((int)(var4_6 * 8), (int)this.c, (RoundingMode)RoundingMode.CEILING)] = (String)true;
                ++var4_6;
            }
        }
        try {
            super();
            throw var1_1 /* !! */ ;
lbl44:
            // 1 sources

            super("x (0) must be > 0");
            throw var1_1 /* !! */ ;
        }
        catch (ArithmeticException var1_2) {
            var4_7 = ((Object)var2_3).length;
            var2_3 = new StringBuilder("Illegal alphabet length ");
            var2_3.append(var4_7);
            throw new IllegalArgumentException(var2_3.toString(), var1_2);
        }
    }

    final char a(int n2) {
        return this.a[n2];
    }

    final int b(char c2) {
        if (c2 <= '\u007f') {
            byte by2 = this.f[c2];
            if (by2 == -1) {
                if (c2 > ' ' && c2 != '\u007f') {
                    StringBuilder stringBuilder = new StringBuilder("Unrecognized character: ");
                    stringBuilder.append(c2);
                    throw new hjb(stringBuilder.toString());
                }
                throw new hjb("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
            }
            return by2;
        }
        throw new hjb("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
    }

    final boolean c(int n2) {
        int n3 = this.d;
        return this.h[n2 % n3];
    }

    public final boolean equals(Object object) {
        if (object instanceof hiy) {
            object = (hiy)object;
            boolean bl2 = ((hiy)object).i;
            if (Arrays.equals(this.a, ((hiy)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 1237;
    }

    public final String toString() {
        return this.g;
    }
}

