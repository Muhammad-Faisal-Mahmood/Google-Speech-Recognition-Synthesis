/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;

public final class hus
implements Closeable {
    public hur a = hur.b;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public long e;
    public int f;
    public String g;
    public int h;
    public int[] i;
    private final Reader j;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int[] n;
    private String[] o;

    static {
        idi.c = new idi();
    }

    public hus(Reader reader) {
        int[] nArray = new int[32];
        this.n = nArray;
        this.h = 1;
        nArray[0] = 6;
        this.o = new String[32];
        this.i = new int[32];
        this.j = Objects.requireNonNull(reader, "in == null");
    }

    /*
     * Unable to fully structure code
     */
    private final int s(boolean var1_1) {
        var2_2 = this.c;
        var3_3 = this.k;
        while (true) {
            block14: {
                block15: {
                    block13: {
                        var5_5 = var2_2;
                        var4_4 = var3_3;
                        if (var2_2 == var3_3) {
                            this.c = var2_2;
                            if (!this.w(1)) {
                                if (!var1_1) {
                                    return -1;
                                }
                                throw new EOFException("End of input".concat(this.g()));
                            }
                            var5_5 = this.c;
                            var4_4 = this.k;
                        }
                        var7_7 = this.b;
                        var2_2 = var5_5 + 1;
                        var3_3 = var7_7[var5_5];
                        if (var3_3 != 10) break block13;
                        ++this.l;
                        this.m = var2_2;
                        break block14;
                    }
                    if (var3_3 == 32 || var3_3 == 13 || var3_3 == 9) break block14;
                    if (var3_3 != 47) break block15;
                    this.c = var2_2;
                    if (var2_2 == var4_4) {
                        this.c = var5_5;
                        var6_6 = this.w(2);
                        ++this.c;
                        if (!var6_6) {
                            return 47;
                        }
                    }
                    this.t();
                    var2_2 = this.c;
                    var3_3 = var7_7[var2_2];
                    if (var3_3 != 42) {
                        if (var3_3 != 47) {
                            return 47;
                        }
                        this.c = var2_2 + 1;
                        this.v();
                        var2_2 = this.c;
                        var3_3 = this.k;
                        continue;
                    }
                    this.c = var2_2 + 1;
                    block1: while (true) {
                        block16: {
                            if (this.c + 2 > this.k && !this.w(2)) {
                                throw this.d("Unterminated comment");
                            }
                            var7_7 = this.b;
                            var2_2 = this.c;
                            if (var7_7[var2_2] != '\n') break block16;
                            ++this.l;
                            this.m = var2_2 + 1;
                            ** GOTO lbl56
                        }
                        for (var2_2 = 0; var2_2 < 2; ++var2_2) {
                            if (this.b[this.c + var2_2] == "*/".charAt(var2_2)) {
                                continue;
                            }
lbl56:
                            // 3 sources

                            ++this.c;
                            continue block1;
                        }
                        break;
                    }
                    var2_2 = this.c + 2;
                    var3_3 = this.k;
                    continue;
                }
                if (var3_3 == 35) {
                    this.c = var2_2;
                    this.t();
                    this.v();
                    var2_2 = this.c;
                    var3_3 = this.k;
                    continue;
                }
                this.c = var2_2;
                return var3_3;
            }
            var3_3 = var4_4;
        }
    }

    private final void t() {
        if (this.a == hur.a) {
            return;
        }
        throw this.d("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    private final void u(int n2) {
        int n3 = this.h;
        if (n3 - 1 < 1280) {
            int[] nArray = this.n;
            if (n3 == nArray.length) {
                n3 += n3;
                this.n = Arrays.copyOf(nArray, n3);
                this.i = Arrays.copyOf(this.i, n3);
                this.o = Arrays.copyOf(this.o, n3);
            }
            nArray = this.n;
            n3 = this.h;
            this.h = n3 + 1;
            nArray[n3] = n2;
            return;
        }
        String string = this.g();
        StringBuilder stringBuilder = new StringBuilder("Nesting limit 1280 reached");
        stringBuilder.append(string);
        throw new hut(stringBuilder.toString());
    }

    private final void v() {
        while (this.c < this.k || this.w(1)) {
            int n2;
            char[] cArray = this.b;
            int n3 = this.c;
            this.c = n2 = n3 + 1;
            if ((n3 = cArray[n3]) == 10) {
                ++this.l;
                this.m = n2;
                return;
            }
            if (n3 != 13) continue;
        }
    }

    private final boolean w(int n2) {
        block7: {
            int n3 = this.m;
            int n4 = this.c;
            this.m = n3 - n4;
            char[] cArray = this.b;
            n3 = this.k;
            if (n3 != n4) {
                this.k = n3 -= n4;
                System.arraycopy(cArray, n4, cArray, 0, n3);
            } else {
                this.k = 0;
            }
            this.c = 0;
            do {
                Reader reader = this.j;
                n4 = this.k;
                if ((n4 = reader.read(cArray, n4, 1024 - n4)) == -1) break block7;
                this.k = n3 = this.k + n4;
                n4 = n2;
                if (this.l == 0) {
                    n4 = n2;
                    if (this.m == 0) {
                        n4 = n2;
                        if (n3 > 0) {
                            n4 = n2;
                            if (cArray[0] == '\ufeff') {
                                ++this.c;
                                this.m = 1;
                                n4 = n2 + 1;
                            }
                        }
                    }
                }
                n2 = n4;
            } while (n3 < n4);
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private final boolean x(char var1_1) {
        block4: {
            if (var1_1 == '\t' || var1_1 == '\n' || var1_1 == '\f' || var1_1 == '\r' || var1_1 == ' ') break block4;
            if (var1_1 == '#') ** GOTO lbl-1000
            if (var1_1 == ',') break block4;
            if (var1_1 == '/' || var1_1 == '=') ** GOTO lbl-1000
            if (var1_1 == '{' || var1_1 == '}' || var1_1 == ':') break block4;
            if (var1_1 == ';') ** GOTO lbl-1000
            switch (var1_1) {
                default: {
                    return true;
                }
                case '\\': lbl-1000:
                // 4 sources

                {
                    this.t();
                }
                case '[': 
                case ']': 
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final int a() {
        block28: {
            block34: {
                block40: {
                    block41: {
                        block42: {
                            block46: {
                                block45: {
                                    block43: {
                                        block44: {
                                            block30: {
                                                block38: {
                                                    block39: {
                                                        block37: {
                                                            block35: {
                                                                block36: {
                                                                    block31: {
                                                                        block32: {
                                                                            block33: {
                                                                                block29: {
                                                                                    var18_1 = this.n;
                                                                                    var4_2 = this.h - 1;
                                                                                    var3_3 = var18_1[var4_2];
                                                                                    var2_4 = 3;
                                                                                    var11_5 = 1;
                                                                                    if (var3_3 != 1) break block29;
                                                                                    var18_1[var4_2] = 2;
                                                                                    break block30;
                                                                                }
                                                                                if (var3_3 != 2) break block31;
                                                                                var4_2 = this.s(true);
                                                                                if (var4_2 == 44) break block30;
                                                                                if (var4_2 == 59) break block32;
                                                                                if (var4_2 != 93) break block33;
                                                                                var2_4 = 4;
                                                                                break block28;
                                                                            }
                                                                            throw this.d("Unterminated array");
                                                                        }
                                                                        this.t();
                                                                        break block30;
                                                                    }
                                                                    if (var3_3 == 3 || var3_3 == 5) break block34;
                                                                    if (var3_3 != 4) break block35;
                                                                    var18_1[var4_2] = 5;
                                                                    var4_2 = this.s(true);
                                                                    if (var4_2 == 58) break block30;
                                                                    if (var4_2 != 61) break block36;
                                                                    this.t();
                                                                    if ((this.c < this.k || this.w(1)) && (var18_1 = (Object)this.b)[var4_2 = this.c] == 62) {
                                                                        this.c = var4_2 + 1;
                                                                    }
                                                                    break block30;
                                                                }
                                                                throw this.d("Expected ':'");
                                                            }
                                                            if (var3_3 != 6) break block37;
                                                            if (this.a == hur.a) {
                                                                this.s(true);
                                                                var4_2 = this.c;
                                                                this.c = var4_2 - 1;
                                                                if ((var4_2 + 4 <= this.k || this.w(5)) && (var18_1 = (Object)this.b)[var4_2 = this.c] == 41 && var18_1[var4_2 + 1] == 93 && var18_1[var4_2 + 2] == 125 && var18_1[var4_2 + 3] == 39 && var18_1[var4_2 + 4] == 10) {
                                                                    this.c = var4_2 + 5;
                                                                }
                                                            }
                                                            this.n[this.h - 1] = 7;
                                                            break block30;
                                                        }
                                                        if (var3_3 != 7) break block38;
                                                        if (this.s(false) != -1) break block39;
                                                        var2_4 = 17;
                                                        break block28;
                                                    }
                                                    this.t();
                                                    --this.c;
                                                    break block30;
                                                }
                                                if (var3_3 == 8) break block40;
                                            }
                                            var4_2 = this.s(true);
                                            if (var4_2 == 34) ** GOTO lbl243
                                            if (var4_2 == 39) ** GOTO lbl240
                                            if (var4_2 == 44 || var4_2 == 59) ** GOTO lbl-1000
                                            if (var4_2 == 91) break block28;
                                            if (var4_2 == 93) break block41;
                                            if (var4_2 == 123) break block42;
                                            this.c = var2_4 = this.c - 1;
                                            if ((var2_4 = this.b[var2_4]) == 116 || var2_4 == 84) break block43;
                                            if (var2_4 == 102 || var2_4 == 70) break block44;
                                            if (var2_4 != 110 && var2_4 != 78) ** GOTO lbl-1000
                                            var18_1 = "NULL";
                                            var19_6 = "null";
                                            var2_4 = 7;
                                            break block45;
                                        }
                                        var18_1 = "FALSE";
                                        var19_6 = "false";
                                        var2_4 = 6;
                                        break block45;
                                    }
                                    var18_1 = "TRUE";
                                    var19_6 = "true";
                                    var2_4 = 5;
                                }
                                var20_7 = this.a;
                                var21_8 = hur.c;
                                for (var3_3 = 0; var3_3 < (var4_2 = var19_6.length()); ++var3_3) {
                                    if ((this.c + var3_3 < this.k || this.w(var3_3 + 1)) && ((var4_2 = this.b[this.c + var3_3]) == var19_6.charAt(var3_3) || var20_7 != var21_8 && var4_2 == var18_1.charAt(var3_3))) {
                                        continue;
                                    }
                                    ** GOTO lbl-1000
                                }
                                if ((this.c + var4_2 < this.k || this.w(var4_2 + 1)) && this.x(this.b[this.c + var4_2])) lbl-1000:
                                // 3 sources

                                {
                                    var2_4 = 0;
                                } else {
                                    this.c += var4_2;
                                    this.d = var2_4;
                                }
                                if (var2_4 != 0) break block46;
                                var18_1 = this.b;
                                var10_9 = this.c;
                                var6_10 = this.k;
                                var12_11 = 0L;
                                var3_3 = 0;
                                var4_2 = var7_12 = 0;
                                var14_13 = 0L;
                                var5_14 = 1;
                                block1: while (true) {
                                    block59: {
                                        block67: {
                                            block49: {
                                                block50: {
                                                    block66: {
                                                        block51: {
                                                            block52: {
                                                                block60: {
                                                                    block61: {
                                                                        block65: {
                                                                            block64: {
                                                                                block63: {
                                                                                    block62: {
                                                                                        block48: {
                                                                                            block53: {
                                                                                                block56: {
                                                                                                    block54: {
                                                                                                        block58: {
                                                                                                            block57: {
                                                                                                                block55: {
                                                                                                                    block47: {
                                                                                                                        var9_17 = var10_9;
                                                                                                                        var8_16 = var6_10;
                                                                                                                        if (var10_9 + var7_12 != var6_10) break block47;
                                                                                                                        if (var7_12 == 1024) lbl-1000:
                                                                                                                        // 8 sources

                                                                                                                        {
                                                                                                                            while (true) {
                                                                                                                                var2_4 = 0;
                                                                                                                                break block1;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (!this.w(var7_12 + 1)) break block48;
                                                                                                                        var9_17 = this.c;
                                                                                                                        var8_16 = this.k;
                                                                                                                    }
                                                                                                                    if ((var1_15 = var18_1[var9_17 + var7_12]) == 43) break block49;
                                                                                                                    if (var1_15 == 69 || var1_15 == 101) break block50;
                                                                                                                    if (var1_15 == 45) break block51;
                                                                                                                    if (var1_15 == 46) break block52;
                                                                                                                    if (var1_15 < 48 || var1_15 > 57) break block53;
                                                                                                                    if (var3_3 == 1 || var3_3 == 0) break block54;
                                                                                                                    if (var3_3 != 2) break block55;
                                                                                                                    if (var14_13 == var12_11) ** GOTO lbl-1000
                                                                                                                    cfr_temp_0 = var14_13 - -922337203685477580L;
                                                                                                                    var2_4 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                                    var12_11 = 10L * var14_13 - (long)(var1_15 - 48);
                                                                                                                    var2_4 = var2_4 <= 0 && (var2_4 != 0 || var12_11 >= var14_13) ? 0 : 1;
                                                                                                                    var6_10 = var5_14 & var2_4;
                                                                                                                    var2_4 = var3_3;
                                                                                                                    break block56;
                                                                                                                }
                                                                                                                if (var3_3 != 3) break block57;
                                                                                                                var2_4 = 4;
                                                                                                                var12_11 = var14_13;
                                                                                                                var6_10 = var5_14;
                                                                                                                break block56;
                                                                                                            }
                                                                                                            if (var3_3 == 5) break block58;
                                                                                                            var2_4 = var3_3;
                                                                                                            var12_11 = var14_13;
                                                                                                            var6_10 = var5_14;
                                                                                                            if (var3_3 != 6) break block56;
                                                                                                        }
                                                                                                        var2_4 = 7;
                                                                                                        var12_11 = var14_13;
                                                                                                        var6_10 = var5_14;
                                                                                                        break block56;
                                                                                                    }
                                                                                                    var12_11 = (long)(-(var1_15 - 48));
                                                                                                    var2_4 = 2;
                                                                                                    var6_10 = var5_14;
                                                                                                }
                                                                                                var16_18 = 0L;
                                                                                                var14_13 = var12_11;
                                                                                                var5_14 = var6_10;
                                                                                                var12_11 = var16_18;
                                                                                                break block59;
                                                                                            }
                                                                                            if (this.x((char)var1_15)) ** GOTO lbl-1000
                                                                                        }
                                                                                        var2_4 = var3_3;
                                                                                        if (var3_3 != 2) break block60;
                                                                                        if (var5_14 == 0) break block61;
                                                                                        if (var14_13 != -9223372036854775808L) break block62;
                                                                                        if (var4_2 == 0) break block61;
                                                                                        var4_2 = var11_5;
                                                                                    }
                                                                                    if (var14_13 != 0L) break block63;
                                                                                    if (var4_2 != 0) break block61;
                                                                                    break block64;
                                                                                }
                                                                                if (var4_2 != 0) break block65;
                                                                            }
                                                                            var14_13 = -var14_13;
                                                                        }
                                                                        this.e = var14_13;
                                                                        this.c += var7_12;
                                                                        this.d = 15;
                                                                        var2_4 = 15;
                                                                        break;
                                                                    }
                                                                    var2_4 = 2;
                                                                }
                                                                if (var2_4 != 2 && var2_4 != 4 && var2_4 != 7) ** GOTO lbl-1000
                                                                this.f = var7_12;
                                                                var2_4 = 16;
                                                                this.d = 16;
                                                                break;
                                                            }
                                                            if (var3_3 != 2) ** GOTO lbl-1000
                                                            var2_4 = 3;
                                                            break block59;
                                                        }
                                                        var16_18 = var12_11;
                                                        if (var3_3 != 0) break block66;
                                                        var2_4 = 1;
                                                        var4_2 = 1;
                                                        var12_11 = var16_18;
                                                        break block59;
                                                    }
                                                    if (var3_3 != 5) ** GOTO lbl-1000
                                                    break block67;
                                                }
                                                if (var3_3 != 2 && var3_3 != 4) ** GOTO lbl-1000
                                                var2_4 = 5;
                                                break block59;
                                            }
                                            if (var3_3 == 5) ** break;
                                            ** continue;
                                        }
                                        var2_4 = 6;
                                    }
                                    ++var7_12;
                                    var10_9 = var9_17;
                                    var6_10 = var8_16;
                                    var3_3 = var2_4;
                                }
                                if (var2_4 != 0) {
                                    return var2_4;
                                }
                                if (this.x(this.b[this.c])) {
                                    this.t();
                                    this.d = 10;
                                    return 10;
                                }
                                throw this.d("Expected value");
                            }
                            return var2_4;
                        }
                        var2_4 = 1;
                        break block28;
                    }
                    if (var3_3 == 1) {
                        var2_4 = 4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        if (var3_3 != 1 && var3_3 != 2) {
                            throw this.d("Unexpected value");
                        }
                        this.t();
                        --this.c;
                        this.d = 7;
                        return 7;
lbl240:
                        // 1 sources

                        this.t();
                        this.d = 8;
                        return 8;
lbl243:
                        // 1 sources

                        var2_4 = 9;
                    }
                    break block28;
                }
                throw new IllegalStateException("JsonReader is closed");
            }
            var18_1[var4_2] = 4;
            if (var3_3 == 5 && (var2_4 = this.s(true)) != 44) {
                if (var2_4 != 59) {
                    if (var2_4 == 125) {
                        while (true) {
                            var2_4 = 2;
                            break block28;
                            break;
                        }
                    }
                    throw this.d("Unterminated object");
                }
                this.t();
            }
            if ((var2_4 = this.s(true)) == 34) ** GOTO lbl271
            if (var2_4 == 39) ** GOTO lbl268
            if (var2_4 == 125) ** GOTO lbl266
            this.t();
            --this.c;
            if (this.x((char)var2_4)) {
                var2_4 = 14;
            } else {
                throw this.d("Expected name");
lbl266:
                // 1 sources

                if (var3_3 != 5) ** continue;
                throw this.d("Expected name");
lbl268:
                // 1 sources

                this.t();
                this.d = 12;
                return 12;
lbl271:
                // 1 sources

                var2_4 = 13;
            }
        }
        this.d = var2_4;
        return var2_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int b() {
        Object object;
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        if (n3 == 15) {
            long l2 = this.e;
            n3 = (int)l2;
            if (l2 == (long)n3) {
                this.d = 0;
                int[] nArray = this.i;
                n2 = this.h - 1;
                nArray[n2] = nArray[n2] + 1;
                return n3;
            }
            String string = this.g();
            StringBuilder stringBuilder = new StringBuilder("Expected an int but was ");
            stringBuilder.append(l2);
            stringBuilder.append(string);
            throw new NumberFormatException(stringBuilder.toString());
        }
        if (n3 == 16) {
            object = this.b;
            n3 = this.c;
            n2 = this.f;
            this.g = new String((char[])object, n3, n2);
            this.c = n3 + n2;
        } else {
            int[] nArray;
            if (n3 != 8 && n3 != 9 && n3 != 10) {
                throw this.e("an int");
            }
            if (n3 == 10) {
                this.g = this.k();
            } else {
                char c2 = n3 == 8 ? (char)'\'' : '\"';
                this.g = this.i(c2);
            }
            try {
                n3 = Integer.parseInt(this.g);
                this.d = 0;
                nArray = this.i;
                n2 = this.h - 1;
            }
            catch (NumberFormatException numberFormatException) {}
            nArray[n2] = nArray[n2] + 1;
            return n3;
        }
        this.d = 11;
        double d2 = Double.parseDouble(this.g);
        n2 = (int)d2;
        if ((double)n2 == d2) {
            this.g = null;
            this.d = 0;
            object = this.i;
            n3 = this.h - 1;
            object[n3] = object[n3] + true;
            return n2;
        }
        String string = this.g;
        String string2 = this.g();
        object = new StringBuilder("Expected an int but was ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(string2);
        throw new NumberFormatException(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long c() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        if (n3 == 15) {
            this.d = 0;
            int[] nArray = this.i;
            n3 = this.h - 1;
            nArray[n3] = nArray[n3] + 1;
            return this.e;
        }
        if (n3 == 16) {
            char[] cArray = this.b;
            n2 = this.c;
            n3 = this.f;
            this.g = new String(cArray, n2, n3);
            this.c = n2 + n3;
        } else {
            int[] nArray;
            long l2;
            if (n3 != 8 && n3 != 9 && n3 != 10) {
                throw this.e("a long");
            }
            if (n3 == 10) {
                this.g = this.k();
            } else {
                char c2 = n3 == 8 ? (char)'\'' : '\"';
                this.g = this.i(c2);
            }
            try {
                l2 = Long.parseLong(this.g);
                this.d = 0;
                nArray = this.i;
                n3 = this.h - 1;
            }
            catch (NumberFormatException numberFormatException) {}
            nArray[n3] = nArray[n3] + 1;
            return l2;
        }
        this.d = 11;
        double d2 = Double.parseDouble(this.g);
        long l3 = (long)d2;
        if ((double)l3 == d2) {
            this.g = null;
            this.d = 0;
            int[] nArray = this.i;
            n3 = this.h - 1;
            nArray[n3] = nArray[n3] + 1;
            return l3;
        }
        String string = this.g;
        String string2 = this.g();
        StringBuilder stringBuilder = new StringBuilder("Expected a long but was ");
        stringBuilder.append(string);
        stringBuilder.append(string2);
        throw new NumberFormatException(stringBuilder.toString());
    }

    @Override
    public final void close() {
        this.d = 0;
        this.n[0] = 8;
        this.h = 1;
        this.j.close();
    }

    public final hut d(String string) {
        String string2 = this.g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        stringBuilder.append("\nSee ");
        stringBuilder.append(idi.y("malformed-json"));
        throw new hut(stringBuilder.toString());
    }

    public final IllegalStateException e(String string) {
        int n2 = this.r();
        String string2 = idi.x(this.r());
        String string3 = this.g();
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(string);
        stringBuilder.append(" but was ");
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append("\nSee ");
        string = n2 == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        stringBuilder.append(idi.y(string));
        return new IllegalStateException(stringBuilder.toString());
    }

    public final String f() {
        StringBuilder stringBuilder = new StringBuilder("$");
        block5: for (int i2 = 0; i2 < this.h; ++i2) {
            int n2 = this.n[i2];
            switch (n2) {
                default: {
                    throw new AssertionError((Object)a.af(n2, "Unknown scope value: "));
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder.append('.');
                    String string = this.o[i2];
                    if (string == null) continue block5;
                    stringBuilder.append(string);
                    continue block5;
                }
                case 1: 
                case 2: {
                    n2 = this.i[i2];
                    stringBuilder.append('[');
                    stringBuilder.append(n2);
                    stringBuilder.append(']');
                }
                case 6: 
                case 7: 
                case 8: 
            }
        }
        return stringBuilder.toString();
    }

    final String g() {
        int n2 = this.l;
        int n3 = this.c;
        int n4 = this.m;
        String string = this.f();
        StringBuilder stringBuilder = new StringBuilder(" at line ");
        stringBuilder.append(n2 + 1);
        stringBuilder.append(" column ");
        stringBuilder.append(n3 - n4 + 1);
        stringBuilder.append(" path ");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public final String h() {
        block7: {
            String string;
            block5: {
                int n2;
                block6: {
                    block4: {
                        int n3;
                        n2 = n3 = this.d;
                        if (n3 == 0) {
                            n2 = this.a();
                        }
                        if (n2 != 14) break block4;
                        string = this.k();
                        break block5;
                    }
                    if (n2 != 12) break block6;
                    string = this.i('\'');
                    break block5;
                }
                if (n2 != 13) break block7;
                string = this.i('\"');
            }
            this.d = 0;
            this.o[this.h - 1] = string;
            return string;
        }
        throw this.e("a name");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String i(char c2) {
        Object object = null;
        block0: while (true) {
            Object object2 = this.c;
            int n2 = this.k;
            int n3 = object2;
            while (true) {
                StringBuilder stringBuilder;
                char c3;
                block26: {
                    int n4;
                    block29: {
                        char[] cArray;
                        block19: {
                            block20: {
                                Object object3;
                                block22: {
                                    block23: {
                                        block21: {
                                            block24: {
                                                block25: {
                                                    block27: {
                                                        block28: {
                                                            cArray = this.b;
                                                            if (object2 >= n2) break block19;
                                                            n4 = object2 + 1;
                                                            object2 = cArray[object2];
                                                            if (this.a == hur.c && object2 < 32) {
                                                                throw this.d("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                                                            }
                                                            if (object2 == c2) {
                                                                c2 = (char)(n4 - n3 - 1);
                                                                this.c = n4;
                                                                if (object == null) {
                                                                    return new String(cArray, n3, (int)c2);
                                                                }
                                                                ((StringBuilder)object).append(cArray, n3, (int)c2);
                                                                return ((StringBuilder)object).toString();
                                                            }
                                                            c3 = 10;
                                                            if (object2 != 92) break block20;
                                                            object2 = n4 - n3;
                                                            this.c = n4;
                                                            stringBuilder = object;
                                                            if (object == null) {
                                                                stringBuilder = new StringBuilder(Math.max(object2 + object2, 16));
                                                            }
                                                            stringBuilder.append(cArray, n3, object2 - 1);
                                                            if (this.c == this.k && !this.w(1)) {
                                                                throw this.d("Unterminated escape sequence");
                                                            }
                                                            object = this.b;
                                                            object2 = this.c;
                                                            this.c = n3 = object2 + 1;
                                                            object3 = object[object2];
                                                            if (object3 == 10) break block21;
                                                            if (object3 == 34) break block22;
                                                            if (object3 == 39) break block23;
                                                            if (object3 == 47 || object3 == 92) break block22;
                                                            if (object3 == 98) break block24;
                                                            if (object3 == 102) break block25;
                                                            if (object3 == 110) break block26;
                                                            if (object3 == 114) break block27;
                                                            if (object3 == 116) break block28;
                                                            if (object3 != 117) {
                                                                throw this.d("Invalid escape sequence");
                                                            }
                                                            if (object2 + 5 > this.k && !this.w(4)) {
                                                                throw this.d("Unterminated escape sequence");
                                                            }
                                                            n2 = this.c;
                                                            n3 = 0;
                                                            object2 = n2;
                                                            break block29;
                                                        }
                                                        c3 = (char)9;
                                                        break block26;
                                                    }
                                                    c3 = (char)13;
                                                    break block26;
                                                }
                                                c3 = (char)12;
                                                break block26;
                                            }
                                            c3 = (char)8;
                                            break block26;
                                        }
                                        if (this.a == hur.c) {
                                            throw this.d("Cannot escape a newline character in strict mode");
                                        }
                                        ++this.l;
                                        this.m = n3;
                                    }
                                    if (this.a == hur.c) {
                                        throw this.d("Invalid escaped character \"'\" in strict mode");
                                    }
                                }
                                c3 = (char)object3;
                                break block26;
                            }
                            if (object2 == 10) {
                                ++this.l;
                                this.m = n4;
                            }
                            object2 = n4;
                            continue;
                        }
                        n2 = object2 - n3;
                        stringBuilder = object;
                        if (object == null) {
                            stringBuilder = new StringBuilder(Math.max(n2 + n2, 16));
                        }
                        stringBuilder.append(cArray, n3, n2);
                        this.c = object2;
                        if (!this.w(1)) {
                            throw this.d("Unterminated string");
                        }
                        object = stringBuilder;
                        continue block0;
                    }
                    while ((n4 = object2) < n2 + 4) {
                        block33: {
                            block31: {
                                block32: {
                                    block30: {
                                        object = this.b;
                                        object2 = object[n4];
                                        if (object2 < 48 || object2 > 57) break block30;
                                        object2 -= 48;
                                        break block31;
                                    }
                                    if (object2 < 97 || object2 > 102) break block32;
                                    object2 -= 87;
                                    break block31;
                                }
                                if (object2 < 65 || object2 > 70) break block33;
                                object2 -= 55;
                            }
                            n3 = (n3 << 4) + object2;
                            object2 = n4 + 1;
                            continue;
                        }
                        throw this.d("Malformed Unicode escape \\u".concat(new String((char[])object, this.c, 4)));
                    }
                    this.c += 4;
                    c3 = (char)n3;
                }
                stringBuilder.append(c3);
                n3 = this.c;
                n2 = this.k;
                object2 = n3;
                object = stringBuilder;
            }
            break;
        }
    }

    public final String j() {
        block10: {
            String string;
            int n2;
            block5: {
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                block4: {
                                    int n3;
                                    n2 = n3 = this.d;
                                    if (n3 == 0) {
                                        n2 = this.a();
                                    }
                                    if (n2 != 10) break block4;
                                    string = this.k();
                                    break block5;
                                }
                                if (n2 != 8) break block6;
                                string = this.i('\'');
                                break block5;
                            }
                            if (n2 != 9) break block7;
                            string = this.i('\"');
                            break block5;
                        }
                        if (n2 != 11) break block8;
                        string = this.g;
                        this.g = null;
                        break block5;
                    }
                    if (n2 != 15) break block9;
                    string = Long.toString(this.e);
                    break block5;
                }
                if (n2 != 16) break block10;
                string = new String(this.b, this.c, this.f);
                this.c += this.f;
            }
            this.d = 0;
            int[] nArray = this.i;
            n2 = this.h - 1;
            nArray[n2] = nArray[n2] + 1;
            return string;
        }
        throw this.e("a string");
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final String k() {
        block11: {
            var2_1 = 0;
            var5_2 /* !! */  = null;
            do {
                block10: {
                    var1_3 = 0;
                    block5: while (true) {
                        if ((var3_4 = this.c + var1_3) >= this.k) ** GOTO lbl20
                        if ((var3_4 = this.b[var3_4]) == 9 || var3_4 == 10 || var3_4 == 12 || var3_4 == 13 || var3_4 == 32) break;
                        if (var3_4 == 35) ** GOTO lbl-1000
                        if (var3_4 == 44) break;
                        if (var3_4 == 47 || var3_4 == 61) ** GOTO lbl-1000
                        if (var3_4 == 123 || var3_4 == 125 || var3_4 == 58) break;
                        if (var3_4 == 59) ** GOTO lbl-1000
                        switch (var3_4) {
                            default: {
                                ++var1_3;
                                continue block5;
                            }
                            case 92: lbl-1000:
                            // 4 sources

                            {
                                this.t();
                                break block5;
                            }
lbl20:
                            // 1 sources

                            if (var1_3 < 1024) {
                                if (!this.w(var1_3 + 1)) break block5;
                                continue block5;
                            }
                            break block10;
                            case 91: 
                            case 93: 
                        }
                        break;
                    }
                    var4_5 = var5_2 /* !! */ ;
                    break block11;
                }
                var4_5 = var5_2 /* !! */ ;
                if (var5_2 /* !! */  == null) {
                    var4_5 = new StringBuilder(Math.max(var1_3, 16));
                }
                var4_5.append(this.b, this.c, var1_3);
                this.c += var1_3;
                var5_2 /* !! */  = var4_5;
            } while (this.w(1));
            var1_3 = var2_1;
        }
        if (var4_5 == null) {
            var4_5 = new String(this.b, this.c, var1_3);
        } else {
            var4_5.append(this.b, this.c, var1_3);
            var4_5 = var4_5.toString();
        }
        this.c += var1_3;
        return var4_5;
    }

    public final void l() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        if (n3 == 3) {
            this.u(1);
            this.i[this.h - 1] = 0;
            this.d = 0;
            return;
        }
        throw this.e("BEGIN_ARRAY");
    }

    public final void m() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        if (n3 == 1) {
            this.u(3);
            this.d = 0;
            return;
        }
        throw this.e("BEGIN_OBJECT");
    }

    public final void n() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        if (n3 == 4) {
            n3 = this.h;
            this.h = n3 - 1;
            int[] nArray = this.i;
            nArray[n3 -= 2] = nArray[n3] + 1;
            this.d = 0;
            return;
        }
        throw this.e("END_ARRAY");
    }

    public final void o() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        if (n3 == 2) {
            n2 = this.h;
            this.h = n3 = n2 - 1;
            this.o[n3] = null;
            int[] nArray = this.i;
            n3 = n2 - 2;
            nArray[n3] = nArray[n3] + 1;
            this.d = 0;
            return;
        }
        throw this.e("END_OBJECT");
    }

    public final boolean p() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        return n3 != 2 && n3 != 4 && n3 != 17;
    }

    public final boolean q() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        if (n3 == 5) {
            this.d = 0;
            int[] nArray = this.i;
            n3 = this.h - 1;
            nArray[n3] = nArray[n3] + 1;
            return true;
        }
        if (n3 == 6) {
            this.d = 0;
            int[] nArray = this.i;
            n3 = this.h - 1;
            nArray[n3] = nArray[n3] + 1;
            return false;
        }
        throw this.e("a boolean");
    }

    public final int r() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.a();
        }
        switch (n3) {
            default: {
                return 10;
            }
            case 15: 
            case 16: {
                return 7;
            }
            case 12: 
            case 13: 
            case 14: {
                return 5;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return 6;
            }
            case 7: {
                return 9;
            }
            case 5: 
            case 6: {
                return 8;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 1;
            }
            case 2: {
                return 4;
            }
            case 1: 
        }
        return 3;
    }

    public final String toString() {
        return String.valueOf(this.getClass().getSimpleName()).concat(this.g());
    }
}

