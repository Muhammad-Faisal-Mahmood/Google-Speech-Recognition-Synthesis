/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;

public final class hhy {
    public int a = 0;
    public int b = -1;
    public final Object[] c;
    public final StringBuilder d;
    public int e;
    private final hgv f;

    public hhy(hgv hgv2, Object[] objectArray, StringBuilder stringBuilder) {
        hhk.h(hgv2, "context");
        this.f = hgv2;
        this.e = 0;
        hhk.h(objectArray, "arguments");
        this.c = objectArray;
        this.d = stringBuilder;
    }

    public static void c(StringBuilder stringBuilder, Object object, String string) {
        stringBuilder.append("[INVALID: format=");
        stringBuilder.append(string);
        stringBuilder.append(", type=");
        stringBuilder.append(object.getClass().getCanonicalName());
        stringBuilder.append(", value=");
        stringBuilder.append(hfx.b(object));
        stringBuilder.append("]");
    }

    public final hhz a() {
        return this.f.a;
    }

    public final String b() {
        return this.f.b;
    }

    /*
     * Unable to fully structure code
     */
    public final void d(Object var1_1, hfq var2_3, hfr var3_4) {
        block41: {
            block40: {
                block37: {
                    block38: {
                        block39: {
                            block32: {
                                block31: {
                                    block33: {
                                        block34: {
                                            block35: {
                                                block36: {
                                                    var4_6 = var2_3.m.ordinal();
                                                    var6_7 = 4;
                                                    var5_8 = 1;
                                                    if (var4_6 == 0) break block32;
                                                    if (var4_6 == 1) break block33;
                                                    if (var4_6 == 2) break block34;
                                                    if (var4_6 == 3) break block35;
                                                    if (var4_6 != 4) break block36;
                                                    if (!(var1_1 instanceof Double || var1_1 instanceof Float || var1_1 instanceof BigDecimal)) lbl-1000:
                                                    // 3 sources

                                                    {
                                                        while (true) {
                                                            var11_9 = false;
                                                            break block31;
                                                            break;
                                                        }
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                throw null;
                                            }
                                            if (!(var1_1 instanceof Integer) && !(var1_1 instanceof Long) && !(var1_1 instanceof Byte) && !(var1_1 instanceof Short) && !(var1_1 instanceof BigInteger)) ** GOTO lbl-1000
                                            ** GOTO lbl-1000
                                        }
                                        if (var1_1 instanceof Character) lbl-1000:
                                        // 3 sources

                                        {
                                            var11_9 = true;
                                        } else {
                                            if (var1_1 instanceof Integer || var1_1 instanceof Byte || var1_1 instanceof Short) ** break;
                                            ** continue;
                                            var11_9 = Character.isValidCodePoint(((Number)var1_1).intValue());
                                        }
                                        break block31;
                                    }
                                    var11_9 = var1_1 instanceof Boolean;
                                }
                                if (!var11_9) {
                                    hhy.c(this.d, var1_1, var2_3.o);
                                    return;
                                }
                            }
                            var13_10 = this.d;
                            var4_6 = var2_3.ordinal();
                            if (var4_6 == 0) break block37;
                            if (var4_6 == 1) break block38;
                            if (var4_6 == 2) break block39;
                            if (var4_6 == 3) break block38;
                            if (var4_6 != 5) break block40;
                            if (var3_4.c()) ** GOTO lbl-1000
                            var4_6 = var3_4.b;
                            var5_8 = var4_6 & 128;
                            if (var5_8 == 0) {
                                var12_11 = hfr.a;
                            } else if (var5_8 == var4_6 && var3_4.c == -1 && var3_4.d == -1) lbl-1000:
                            // 2 sources

                            {
                                var12_11 = var3_4;
                            } else {
                                var12_11 = new hfr(var5_8, -1, -1);
                            }
                            if (var12_11.equals(var3_4)) {
                                var1_1 = (Number)var1_1;
                                var11_9 = var3_4.d();
                                var9_12 = var1_1.longValue();
                                if (var1_1 instanceof Long) {
                                    hfx.c(var13_10, var9_12, var11_9);
                                    return;
                                }
                                if (var1_1 instanceof Integer) {
                                    hfx.c(var13_10, var9_12 & 0xFFFFFFFFL, var11_9);
                                    return;
                                }
                                if (var1_1 instanceof Byte) {
                                    hfx.c(var13_10, var9_12 & 255L, var11_9);
                                    return;
                                }
                                if (var1_1 instanceof Short) {
                                    hfx.c(var13_10, var9_12 & 65535L, var11_9);
                                    return;
                                }
                                if (var1_1 instanceof BigInteger) {
                                    var1_1 = var2_3 = ((BigInteger)var1_1).toString(16);
                                    if (var11_9) {
                                        var1_1 = var2_3.toUpperCase(hfx.a);
                                    }
                                    var13_10.append((String)var1_1);
                                    return;
                                }
                                throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(String.valueOf(var1_1.getClass()))));
                            }
                            break block40;
                        }
                        if (var3_4.c()) {
                            if (var1_1 instanceof Character) {
                                var13_10.append(var1_1);
                                return;
                            }
                            var4_6 = ((Number)var1_1).intValue();
                            if (var4_6 >>> 16 == 0) {
                                var13_10.append((char)var4_6);
                                return;
                            }
                            var13_10.append(Character.toChars(var4_6));
                            return;
                        }
                        break block40;
                    }
                    if (var3_4.c()) {
                        var13_10.append(var1_1);
                        return;
                    }
                    break block40;
                }
                if (!(var1_1 instanceof Formattable)) {
                    if (var3_4.c()) {
                        var13_10.append(hfx.b(var1_1));
                        return;
                    } else {
                        ** GOTO lbl104
                    }
                }
                break block41;
            }
            var12_11 = var2_3.o;
            if (!var3_4.c()) {
                var5_8 = var2_3.l;
                var4_6 = var5_8;
                if (var3_4.d()) {
                    var4_6 = var5_8 & 65503;
                }
                var2_3 = new StringBuilder("%");
                var3_4.f((StringBuilder)var2_3);
                var2_3.append((char)var4_6);
                var12_11 = var2_3.toString();
            }
            var13_10.append(String.format(hfx.a, (String)var12_11, new Object[]{var1_1}));
            return;
        }
        var2_3 = (Formattable)var1_1;
        var8_13 = var3_4.b;
        var4_6 = var7_14 = var8_13 & 162;
        if (var7_14 != 0) {
            var4_6 = (var8_13 & 32) != 0 ? var5_8 : 0;
            var5_8 = (var8_13 & 128) != 0 ? 2 : 0;
            if ((var8_13 & 2) == 0) {
                var6_7 = 0;
            }
            var4_6 = var4_6 | var5_8 | var6_7;
        }
        var5_8 = var13_10.length();
        var1_1 = new Formatter(var13_10, hfx.a);
        try {
            var2_3.formatTo((Formatter)var1_1, var4_6, var3_4.c, var3_4.d);
            return;
        }
        catch (RuntimeException var3_5) {
            var13_10.setLength(var5_8);
            try {
                var1_1.out().append(hfx.a(var2_3, var3_5));
lbl139:
                // 2 sources

                return;
            }
            catch (IOException var1_2) {
                ** continue;
            }
        }
    }
}

