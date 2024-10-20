/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

public final class hhj
extends hgw {
    public static final Set a;
    public static final hgg b;
    public static final hhh c;
    private final String d;
    private final Level e;
    private final Set f;
    private final hgg g;
    private final int h;

    static {
        hgg hgg2;
        Set<hez> set;
        a = set = DesugarCollections.unmodifiableSet(new HashSet<hez>(Arrays.asList(hem.a, hfo.a, hfp.a)));
        b = hgg2 = hgj.a(set);
        c = new hhh(2, Level.ALL, false, set, hgg2);
    }

    public hhj(String string, int n2, Level level, Set set, hgg hgg2) {
        super(string);
        this.d = hhk.e(string);
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = hgg2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void e(hfu var0, String var1_1, int var2_2, Level var3_3, Set var4_4, hgg var5_5) {
        block33: {
            block35: {
                block37: {
                    block36: {
                        block34: {
                            var18_6 = (Boolean)var0.l().d(hfp.a);
                            if (var18_6 != null && var18_6.booleanValue()) break block33;
                            var19_7 /* !! */  = hgt.f();
                            var18_6 = var0.l();
                            var2_2 = var18_6.b();
                            var18_6 = var2_2 == 0 ? hgq.c : (var2_2 <= 28 ? new hgo(var19_7 /* !! */ , (hfz)var18_6) : new hgp(var19_7 /* !! */ , (hfz)var18_6));
                            var2_2 = var0.o().intValue() < var3_3.intValue() ? 1 : 0;
                            if (var2_2 != 0) break block34;
                            var8_8 = hgu.a;
                            if (var0.m() != null || var18_6.a() > var4_4.size() || !var4_4.containsAll(var18_6.b())) break block34;
                            var3_3 = hfx.b(var0.n());
                            break block35;
                        }
                        var20_9 = new StringBuilder();
                        if (hhk.l(2, var0.f(), var20_9)) {
                            var20_9.append(" ");
                        }
                        if (var2_2 == 0 || var0.m() == null) break block36;
                        var20_9.append("(REDACTED) ");
                        var20_9.append(var0.m().b);
                        break block37;
                    }
                    if (var0.m() == null) ** GOTO lbl215
                    var21_10 = new hhy(var0.m(), var0.O(), var20_9);
                    var22_11 = var21_10.b();
                    var11_12 = hib.b(var22_11, 0);
                    var2_2 = 0;
                    var9_13 = -1;
                    block0: while (var11_12 >= 0) {
                        var10_16 = var11_12 + 1;
                        var12_17 = 0;
                        var13_18 = var10_16;
                        while (var13_18 < var22_11.length()) {
                            block38: {
                                block39: {
                                    block40: {
                                        block41: {
                                            var8_8 = var13_18 + 1;
                                            var15_20 = var22_11.charAt(var13_18);
                                            var14_19 = var15_20 - 48;
                                            if (var14_19 < 10) {
                                                if ((var12_17 = var12_17 * 10 + var14_19) < 1000000) {
                                                    var13_18 = var8_8;
                                                    continue;
                                                }
                                                throw hia.b("index too large", var22_11, var11_12, var8_8);
                                            }
                                            if (var15_20 != 36) break block38;
                                            if (var13_18 - var10_16 == 0) break block39;
                                            if (var22_11.charAt(var10_16) == '0') break block40;
                                            if (var8_8 == var22_11.length()) break block41;
                                            var10_16 = var13_18 + 2;
                                            var22_11.charAt(var8_8);
                                            var9_13 = var12_17 - 1;
                                            ** GOTO lbl66
                                        }
                                        throw hia.c("unterminated parameter", var22_11, var11_12);
                                    }
                                    throw hia.b("index has leading zero", var22_11, var11_12, var8_8);
                                }
                                throw hia.b("missing index", var22_11, var11_12, var8_8);
                            }
                            if (var15_20 != 60) ** GOTO lbl74
                            if (var9_13 == -1) ** GOTO lbl73
                            if (var8_8 != var22_11.length()) {
                                var10_16 = var13_18 + 2;
                                var22_11.charAt(var8_8);
lbl66:
                                // 2 sources

                                var12_17 = var8_8;
                                var13_18 = var10_16;
                                var8_8 = var9_13;
                                var10_16 = var12_17;
                                var9_13 = var13_18;
                            } else {
                                throw hia.c("unterminated parameter", var22_11, var11_12);
lbl73:
                                // 1 sources

                                throw hia.b("invalid relative parameter", var22_11, var11_12, var8_8);
lbl74:
                                // 1 sources

                                var12_17 = var2_2++;
                                var9_13 = var8_8;
                                var8_8 = var12_17;
                            }
                            for (var12_17 = var9_13 - 1; var12_17 < var22_11.length(); ++var12_17) {
                                block46: {
                                    block32: {
                                        block31: {
                                            block42: {
                                                if ((char)((var22_11.charAt(var12_17) & -33) - 65) >= '\u001a') continue;
                                                var7_15 = var22_11.charAt(var12_17);
                                                var16_21 = var7_15 & 32;
                                                var9_13 = var16_21 == 0 ? 1 : 0;
                                                var3_3 = hfr.a;
                                                if (var10_16 != var12_17 || var9_13 != 0) break block42;
                                                var3_3 = hfr.a;
                                                ** GOTO lbl121
                                            }
                                            var9_13 = 1 != var9_13 ? 0 : 128;
                                            while (true) {
                                                block44: {
                                                    block45: {
                                                        block43: {
                                                            if (var10_16 != var12_17) break block43;
                                                            var3_3 = new hfr(var9_13, -1, -1);
                                                            ** GOTO lbl121
                                                        }
                                                        var13_18 = var10_16 + 1;
                                                        var6_14 = var22_11.charAt(var10_16);
                                                        if (var6_14 < ' ' || var6_14 > '0') break block31;
                                                        var14_19 = hfr.a(var6_14);
                                                        if (var14_19 >= 0) break block44;
                                                        if (var6_14 != '.') break block45;
                                                        var3_3 = new hfr(var9_13, -1, hfr.b(var22_11, var13_18, var12_17));
                                                        ** GOTO lbl121
                                                    }
                                                    throw hia.a("invalid flag", var22_11, var10_16);
                                                }
                                                if ((var9_13 & (var14_19 = 1 << var14_19)) != 0) break;
                                                var9_13 |= var14_19;
                                                var10_16 = var13_18;
                                            }
                                            throw hia.a("repeated flag", var22_11, var10_16);
                                        }
                                        if (var6_14 > '9') break block46;
                                        var14_19 = var6_14 - 48;
                                        while (true) {
                                            block49: {
                                                block58: {
                                                    block59: {
                                                        block60: {
                                                            block55: {
                                                                block56: {
                                                                    block57: {
                                                                        block53: {
                                                                            block54: {
                                                                                block51: {
                                                                                    block52: {
                                                                                        block50: {
                                                                                            block48: {
                                                                                                block47: {
                                                                                                    if (var13_18 != var12_17) break block47;
                                                                                                    var3_3 = new hfr(var9_13, var14_19, -1);
                                                                                                    break block48;
                                                                                                }
                                                                                                var15_20 = var13_18 + 1;
                                                                                                var17_22 = var22_11.charAt(var13_18);
                                                                                                if (var17_22 != '.') break block49;
                                                                                                var3_3 = new hfr(var9_13, var14_19, hfr.b(var22_11, var15_20, var12_17));
                                                                                            }
                                                                                            var9_13 = hfq.a(var7_15);
                                                                                            var19_7 /* !! */  = hfq.k[var9_13];
                                                                                            if (var16_21 == 0) break block50;
                                                                                            var4_4 = var19_7 /* !! */ ;
                                                                                            break block51;
                                                                                        }
                                                                                        if (var19_7 /* !! */  == null) break block52;
                                                                                        var4_4 = var19_7 /* !! */ ;
                                                                                        if ((var19_7 /* !! */ .n & 128) != 0) break block51;
                                                                                    }
                                                                                    var4_4 = null;
                                                                                }
                                                                                var9_13 = var12_17 + 1;
                                                                                if (var4_4 == null) break block53;
                                                                                if (!var3_3.e(var4_4.n, var4_4.m.f)) break block54;
                                                                                var19_7 /* !! */  = hhv.c;
                                                                                var3_3 = var8_8 < 10 && var3_3.c() ? ((hhv[])hhv.c.get(var4_4))[var8_8] : new hhv(var8_8, (hfq)var4_4, (hfr)var3_3);
                                                                                break block55;
                                                                            }
                                                                            throw hia.b("invalid format specifier", var22_11, var11_12, var9_13);
                                                                        }
                                                                        if (var7_15 == 't' || var7_15 == 'T') break block56;
                                                                        if (var7_15 != 'h' && var7_15 != 'H') {
                                                                            throw hia.b("invalid format specification", var22_11, var11_12, var9_13);
                                                                        }
                                                                        if (!var3_3.e(160, false)) break block57;
                                                                        var3_3 = new hhw((hfr)var3_3, var8_8);
                                                                        break block55;
                                                                    }
                                                                    throw hia.b("invalid format specification", var22_11, var11_12, var9_13);
                                                                }
                                                                if (!var3_3.e(160, false)) break block58;
                                                                var10_16 = var12_17 + 2;
                                                                if (var10_16 > var22_11.length()) break block59;
                                                                var6_14 = var22_11.charAt(var9_13);
                                                                var4_4 = (hhs)hhs.F.get(Character.valueOf(var6_14));
                                                                if (var4_4 == null) break block60;
                                                                var3_3 = new hht((hfr)var3_3, var8_8, (hhs)var4_4);
                                                                var9_13 = var10_16;
                                                            }
                                                            var10_16 = var3_3.a;
                                                            if (var10_16 < 32) {
                                                                var21_10.a |= 1 << var10_16;
                                                            }
                                                            var21_10.b = Math.max(var21_10.b, var10_16);
                                                            var4_4 = var21_10.a();
                                                            var19_7 /* !! */  = var21_10.b();
                                                            var10_16 = var21_10.e;
                                                            var4_4.a(var21_10.d, (String)var19_7 /* !! */ , var10_16, var11_12);
                                                            var4_4 = var21_10.c;
                                                            var10_16 = var3_3.a;
                                                            if (var10_16 < ((Object)var4_4).length) {
                                                                if ((var4_4 = var4_4[var10_16]) != null) {
                                                                    var3_3.a(var21_10, var4_4);
                                                                } else {
                                                                    var21_10.d.append("null");
                                                                }
                                                            } else {
                                                                var21_10.d.append("[ERROR: MISSING LOG ARGUMENT]");
                                                            }
                                                            var21_10.e = var9_13;
                                                            var11_12 = hib.b(var22_11, var9_13);
                                                            var9_13 = var8_8;
                                                            continue block0;
                                                        }
                                                        throw hia.a("illegal date/time conversion", var22_11, var9_13);
                                                    }
                                                    throw hia.a("truncated format specifier", var22_11, var11_12);
                                                }
                                                throw hia.b("invalid format specification", var22_11, var11_12, var9_13);
                                            }
                                            if ((var17_22 = (char)(var17_22 - 48)) >= '\n') break block32;
                                            if ((var14_19 = var14_19 * 10 + var17_22) > 999999) break;
                                            var13_18 = var15_20;
                                        }
                                        throw hia.b("width too large", var22_11, var10_16, var12_17);
                                    }
                                    throw hia.a("invalid width character", var22_11, var13_18);
                                }
                                throw hia.a("invalid flag", var22_11, var10_16);
                            }
                            throw hia.c("unterminated parameter", var22_11, var11_12);
                        }
                        throw hia.c("unterminated parameter", var22_11, var11_12);
                    }
                    var2_2 = var21_10.a;
                    if ((var2_2 + 1 & var2_2) == 0 && (var21_10.b <= 31 || var2_2 == -1)) {
                        var4_4 = var21_10.a();
                        var3_3 = var21_10.b();
                        var2_2 = var21_10.e;
                        var8_8 = var21_10.b().length();
                        var4_4.a(var21_10.d, (String)var3_3, var2_2, var8_8);
                        var3_3 = var21_10.d;
                        if (var0.O().length > var21_10.b + 1) {
                            var3_3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                        }
                    } else {
                        throw new hia(String.format("unreferenced arguments [first missing index=%d]", new Object[]{Integer.numberOfTrailingZeros(~var2_2)}));
lbl215:
                        // 1 sources

                        var20_9.append(hfx.b(var0.n()));
                    }
                    var2_2 = hgu.a;
                    var3_3 = new hft(var20_9);
                    var18_6.c(var5_5, var3_3);
                    if (var3_3.c) {
                        var3_3.b.append(var3_3.a);
                    }
                }
                var3_3 = var20_9.toString();
            }
            var4_4 = (Throwable)var0.l().d(hem.a);
            var2_2 = hhk.d(var0.o());
            if (var2_2 != 2 && var2_2 != 3) {
                if (var2_2 != 4) {
                    if (var2_2 != 5) {
                        Log.e((String)var1_1, (String)var3_3, (Throwable)var4_4);
                        return;
                    }
                    Log.w((String)var1_1, (String)var3_3, (Throwable)var4_4);
                    return;
                }
                Log.i((String)var1_1, (String)var3_3, (Throwable)var4_4);
            }
        }
    }

    @Override
    public final void b(hfu hfu2) {
        Level level = this.e;
        Set set = this.f;
        hgg hgg2 = this.g;
        hhj.e(hfu2, this.d, 2, level, set, hgg2);
    }

    @Override
    public final boolean c(Level level) {
        String string = this.d;
        int n2 = hhk.d(level);
        return Log.isLoggable((String)string, (int)n2) || Log.isLoggable((String)"all", (int)n2);
        {
        }
    }
}

