/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Arrays;

public final class hcy
extends hac {
    public static final hac a = new hcy(null, new Object[0], 0);
    private static final long serialVersionUID = 0L;
    final transient Object[] b;
    public final transient int c;
    private final transient Object d;

    private hcy(Object object, Object[] objectArray, int n2) {
        this.d = object;
        this.b = objectArray;
        this.c = n2;
    }

    public static hcy a(int n2, Object[] objectArray) {
        return hcy.n(n2, objectArray, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static hcy n(int var0, Object[] var1_1, gzy var2_2) {
        block25: {
            block27: {
                block28: {
                    block26: {
                        var3_3 = var0;
                        var9_4 = var1_1;
                        if (var3_3 == 0) {
                            return (hcy)hcy.a;
                        }
                        var1_1 = null;
                        if (var3_3 == 1) {
                            fvd.aj(Objects.requireNonNull(var9_4[0]), Objects.requireNonNull(var9_4[1]));
                            return new hcy(null, var9_4, 1);
                        }
                        fxf.M(var3_3, var9_4.length >> 1);
                        var0 = hav.g(var0);
                        if (var3_3 != 1) break block26;
                        fvd.aj(Objects.requireNonNull(var9_4[0]), Objects.requireNonNull(var9_4[1]));
                        var0 = 1;
                        break block25;
                    }
                    var6_5 = var0 - 1;
                    if (var0 <= 128) {
                        var10_6 = new byte[var0];
                        Arrays.fill((byte[])var10_6, (byte)-1);
                        var1_1 = null;
                        var4_7 = 0;
                        block0: for (var0 = 0; var0 < var3_3; ++var0) {
                            var7_13 = var4_7 + var4_7;
                            var5_10 = var0 + var0;
                            var12_20 = Objects.requireNonNull(var9_4[var5_10]);
                            var11_19 /* !! */  = Objects.requireNonNull(var9_4[var5_10 ^ 1]);
                            fvd.aj(var12_20, var11_19 /* !! */ );
                            var5_10 = fvd.W(var12_20.hashCode());
                            while (true) {
                                if ((var5_10 = var10_6[var8_16 = var5_10 & var6_5] & 255) == 255) {
                                    var10_6[var8_16] = (byte)var7_13;
                                    if (var4_7 < var0) {
                                        var9_4[var7_13] = var12_20;
                                        var9_4[var7_13 ^ 1] = var11_19 /* !! */ ;
                                    }
                                    ++var4_7;
                                    continue block0;
                                }
                                if (var12_20.equals(var9_4[var5_10])) {
                                    var1_1 = new bmu(var12_20, (Object)var11_19 /* !! */ , Objects.requireNonNull(var9_4[var5_10 ^= 1]), null);
                                    var9_4[var5_10] = var11_19 /* !! */ ;
                                    continue block0;
                                }
                                var5_10 = var8_16 + 1;
                            }
                        }
                        if (var4_7 == var3_3) {
                            var1_1 = (Object[])var10_6;
                        } else {
                            var11_19 /* !! */  = new Object[]{var10_6, var4_7, var1_1};
                            var1_1 = var11_19 /* !! */ ;
                        }
lbl48:
                        // 4 sources

                        while (true) {
                            var0 = var3_3;
                            break block25;
                            break;
                        }
                    }
                    if (var0 > 32768) break block27;
                    var10_6 = new short[var0];
                    Arrays.fill((short[])var10_6, (short)-1);
                    var1_1 = null;
                    var4_8 = 0;
                    block3: for (var0 = 0; var0 < var3_3; ++var0) {
                        var7_14 = var4_8 + var4_8;
                        var5_11 = var0 + var0;
                        var12_21 = Objects.requireNonNull(var9_4[var5_11]);
                        var11_19 /* !! */  = Objects.requireNonNull(var9_4[var5_11 ^ 1]);
                        fvd.aj(var12_21, var11_19 /* !! */ );
                        var5_11 = fvd.W(var12_21.hashCode());
                        while (true) {
                            if ((var5_11 = (int)((char)var10_6[var8_17 = var5_11 & var6_5])) == 65535) {
                                var10_6[var8_17] = (short)var7_14;
                                if (var4_8 < var0) {
                                    var9_4[var7_14] = var12_21;
                                    var9_4[var7_14 ^ 1] = var11_19 /* !! */ ;
                                }
                                ++var4_8;
                                continue block3;
                            }
                            if (var12_21.equals(var9_4[var5_11])) {
                                var1_1 = new bmu(var12_21, (Object)var11_19 /* !! */ , Objects.requireNonNull(var9_4[var5_11 ^= 1]), null);
                                var9_4[var5_11] = var11_19 /* !! */ ;
                                continue block3;
                            }
                            var5_11 = var8_17 + 1;
                        }
                    }
                    if (var4_8 != var3_3) break block28;
                    var1_1 = (Object[])var10_6;
                    ** GOTO lbl48
                }
                var11_19 /* !! */  = new Object[]{var10_6, var4_8, var1_1};
                var0 = var3_3;
                var1_1 = var11_19 /* !! */ ;
                break block25;
            }
            var10_6 = new int[var0];
            Arrays.fill((int[])var10_6, -1);
            var1_1 = null;
            var4_9 = 0;
            block5: for (var0 = 0; var0 < var3_3; ++var0) {
                var7_15 = var4_9 + var4_9;
                var5_12 /* !! */  = var0 + var0;
                var12_22 = Objects.requireNonNull(var9_4[var5_12 /* !! */ ]);
                var11_19 /* !! */  = Objects.requireNonNull(var9_4[var5_12 /* !! */  ^ 1]);
                fvd.aj(var12_22, var11_19 /* !! */ );
                var5_12 /* !! */  = fvd.W(var12_22.hashCode());
                while (true) {
                    if ((var5_12 /* !! */  = (int)var10_6[var8_18 = var5_12 /* !! */  & var6_5]) == -1) {
                        var10_6[var8_18] = var7_15;
                        if (var4_9 < var0) {
                            var9_4[var7_15] = var12_22;
                            var9_4[var7_15 ^ 1] = var11_19 /* !! */ ;
                        }
                        ++var4_9;
                        continue block5;
                    }
                    if (var12_22.equals(var9_4[var5_12 /* !! */ ])) {
                        var1_1 = new bmu(var12_22, (Object)var11_19 /* !! */ , Objects.requireNonNull(var9_4[var5_12 /* !! */  ^= 1]), null);
                        var9_4[var5_12 /* !! */ ] = var11_19 /* !! */ ;
                        continue block5;
                    }
                    var5_12 /* !! */  = var8_18 + 1;
                }
            }
            if (var4_9 == var3_3) {
                var1_1 = (Object[])var10_6;
                ** continue;
            }
            var11_19 /* !! */  = new Object[]{var10_6, var4_9, var1_1};
            var1_1 = var11_19 /* !! */ ;
            var0 = var3_3;
        }
        var10_6 = var9_4;
        var11_19 /* !! */  = var1_1;
        if (var1_1 instanceof Object[]) {
            var10_6 = (bmu)var1_1[2];
            if (var2_2 != null) {
                var2_2.c = var10_6;
                var11_19 /* !! */  = var1_1[0];
                var0 = (Integer)var1_1[1];
                var10_6 = Arrays.copyOf(var9_4, var0 + var0);
            } else {
                throw var10_6.N();
            }
        }
        return new hcy(var11_19 /* !! */ , (Object[])var10_6, var0);
    }

    @Override
    public final void c() {
    }

    @Override
    public final gzm d() {
        int n2 = this.c;
        return new hcx(this.b, 1, n2);
    }

    @Override
    public final hav e() {
        return new hcv(this, this.b, this.c);
    }

    @Override
    public final hav f() {
        int n2 = this.c;
        return new hcw(this, new hcx(this.b, 0, n2));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object get(Object var1_1) {
        block12: {
            block10: {
                block9: {
                    block8: {
                        if (var1_1 != null) break block8;
lbl2:
                        // 6 sources

                        while (true) {
                            var1_1 = null;
                            ** GOTO lbl49
                            break;
                        }
                    }
                    var2_2 = this.c;
                    var5_3 = this.b;
                    if (var2_2 != 1) break block9;
                    if (!Objects.requireNonNull(var5_3[0]).equals(var1_1)) ** GOTO lbl2
                    var1_1 = Objects.requireNonNull(var5_3[1]);
                    ** GOTO lbl49
                }
                var6_4 = this.d;
                if (var6_4 == null) ** GOTO lbl2
                if (!(var6_4 instanceof byte[])) break block10;
                var6_4 = (byte[])var6_4;
                var3_5 = ((Object)var6_4).length;
                var2_2 = fvd.W(var1_1.hashCode());
                while (true) {
                    block11: {
                        if ((var4_8 = var6_4[var2_2 &= var3_5 - 1] & 255) == 255) ** GOTO lbl2
                        if (!var1_1.equals(var5_3[var4_8])) break block11;
                        var1_1 = var5_3[var4_8 ^ 1];
                        ** GOTO lbl49
                    }
                    ++var2_2;
                }
            }
            if (!(var6_4 instanceof short[])) break block12;
            var6_4 = (short[])var6_4;
            var3_6 = ((Object)var6_4).length;
            var2_2 = fvd.W(var1_1.hashCode());
            while (true) {
                block13: {
                    if ((var2_2 = (int)((char)var6_4[var4_9 = var2_2 & var3_6 - 1])) == 65535) ** GOTO lbl2
                    if (!var1_1.equals(var5_3[var2_2])) break block13;
                    var1_1 = var5_3[var2_2 ^ 1];
                    ** GOTO lbl49
                }
                var2_2 = var4_9 + 1;
            }
        }
        var6_4 = (int[])var6_4;
        var3_7 = ((Object)var6_4).length;
        var2_2 = fvd.W(var1_1.hashCode());
        while (true) {
            block14: {
                if ((var4_10 = var6_4[var2_2 &= var3_7 - 1]) != -1) ** break;
                ** continue;
                if (!var1_1.equals(var5_3[var4_10])) break block14;
                var1_1 = var5_3[var4_10 ^ 1];
lbl49:
                // 5 sources

                if (var1_1 == null) {
                    return null;
                }
                return var1_1;
            }
            ++var2_2;
        }
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

