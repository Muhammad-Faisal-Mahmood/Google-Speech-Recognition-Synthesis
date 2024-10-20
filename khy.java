/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ProtocolException;

public final class khy
implements kgn {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final kgv a(kid var1_1) {
        block40: {
            block37: {
                var12_7 = var1_1.f;
                jse.b(var12_7);
                var13_8 = var1_1.b;
                var9_9 = var13_8.d;
                var4_12 = System.currentTimeMillis();
                var11_13 = null;
                jse.e(var13_8, "request");
                {
                    block39: {
                        block38: {
                            catch (IOException var1_6) {
                                var9_9 = null;
                                break block37;
                            }
                            var1_1 = var12_7.e;
                            var1_1 = var12_7.c;
                            var12_7.g.i((kgs)var13_8);
                            var1_1 = var12_7.e;
                            var10_14 = (khp)var12_7.c;
                            ((kgh)var1_1).a((khp)var10_14, (kgs)var13_8);
                            {
                                if (!kmp.I(var13_8.b) || var9_9 == null) ** GOTO lbl-1000
                                var8_15 = jse.H("100-continue", var13_8.a("Expect"));
                                if (!var8_15) break block38;
                            }
                            var12_7.g.h();
                            {
                                catch (IOException var1_2) {
                                    var9_9 = var12_7.e;
                                    var9_9 = var12_7.c;
                                    var12_7.d(var1_2);
                                    throw var1_2;
                                }
                                var1_1 = var12_7.a(true);
                                break block39;
                            }
                        }
                        var1_1 = null;
                    }
                    if (var1_1 != null) ** GOTO lbl65
                    var10_14 = var1_1;
                    jse.e(var13_8, "request");
                    var10_14 = var1_1;
                    var12_7.b = false;
                    var10_14 = var1_1;
                    var14_16 = var13_8.d;
                    var10_14 = var1_1;
                    jse.b(var14_16);
                    var10_14 = var1_1;
                    var6_17 = var14_16.a();
                    var10_14 = var1_1;
                    var14_16 = var12_7.e;
                    var10_14 = var1_1;
                    var14_16 = var12_7.c;
                    var10_14 = var1_1;
                    var15_18 = var12_7.g.d((kgs)var13_8, var6_17);
                    var10_14 = var1_1;
                    var10_14 = var1_1;
                    var14_16 = new khj((kmb)var12_7, var15_18, var6_17);
                    var10_14 = var1_1;
                    var14_16 = kmp.t((kmi)var14_16);
                    var10_14 = var1_1;
                    var9_9.b((kln)var14_16);
                    var10_14 = var1_1;
                    var14_16.close();
                    var9_9 = var1_1;
                    ** GOTO lbl79
lbl65:
                    // 1 sources

                    var10_14 = var1_1;
                    var12_7.c();
                    var10_14 = var1_1;
                    var9_9 = var1_1;
                    if (!((khr)var12_7.f).i()) {
                        var10_14 = var1_1;
                        var12_7.b();
                        var9_9 = var1_1;
                    }
                    ** GOTO lbl79
                    {
                        catch (IOException var1_3) {
                            var9_9 = var10_14;
                            break block37;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var12_7.c();
                            var9_9 = null;
                        }
lbl79:
                        // 3 sources

                        try {
                            var12_7.g.g();
                            var1_1 = null;
                            break block40;
                        }
                        catch (IOException var1_4) {}
                        var10_14 = var9_9;
                        {
                            var14_16 = var12_7.e;
                            var10_14 = var9_9;
                            var14_16 = var12_7.c;
                            var10_14 = var9_9;
                            var12_7.d(var1_4);
                            var10_14 = var9_9;
                            throw var1_4;
                        }
                    }
                    catch (IOException var1_5) {}
                    {
                        var9_9 = var12_7.e;
                        var9_9 = var12_7.c;
                        var12_7.d(var1_5);
                        throw var1_5;
                    }
                }
            }
            if (var1_1 instanceof kip) {
                throw var1_1;
            }
            if (!var12_7.a) {
                throw var1_1;
            }
        }
        var10_14 = var9_9;
        if (var9_9 != null) ** GOTO lbl108
        try {
            block42: {
                block41: {
                    var10_14 = var12_7.a(false);
                    jse.b(var10_14);
lbl108:
                    // 2 sources

                    var10_14.f((kgs)var13_8);
                    var10_14.b = ((khr)var12_7.f).d;
                    var10_14.g = var4_12;
                    var10_14.h = System.currentTimeMillis();
                    var10_14 = var10_14.a();
                    var3_19 = var10_14.d;
                    if (var3_19 == 100) break block41;
                    var9_9 = var10_14;
                    var2_20 = var3_19;
                    if (var3_19 < 102) break block42;
                    var9_9 = var10_14;
                    var2_20 = var3_19;
                    if (var3_19 >= 200) break block42;
                }
                var9_9 = var12_7.a(false);
                jse.b(var9_9);
                var9_9.f((kgs)var13_8);
                var9_9.b = ((khr)var12_7.f).d;
                var9_9.g = var4_12;
                var9_9.h = System.currentTimeMillis();
                var9_9 = var9_9.a();
                var2_20 = var9_9.d;
            }
            var13_8 = var12_7.e;
            var10_14 = (khp)var12_7.c;
            ((kgh)var13_8).b((khp)var10_14, (kgv)var9_9);
            var10_14 = new kgu((kgv)var9_9);
        }
        catch (IOException var9_11) {
            if (var1_1 != null) {
                jns.b((Throwable)var1_1, var9_11);
                throw var1_1;
            }
            throw var9_11;
        }
        kgv.a((kgv)var9_9, "Content-Type");
        var4_12 = var12_7.g.a((kgv)var9_9);
        var13_8 = var12_7.g.e((kgv)var9_9);
        var9_9 = new khk((kmb)var12_7, (kmk)var13_8, var4_12);
        var14_16 = new kme((kmk)var9_9);
        var13_8 = new kie(var4_12, (klo)var14_16);
        {
            block44: {
                block43: {
                    catch (IOException var9_10) {
                        var10_14 = var12_7.e;
                        var10_14 = var12_7.c;
                        var12_7.d(var9_10);
                        throw var9_10;
                    }
                    var10_14.c = var13_8;
                    var9_9 = var10_14.a();
                    if (jse.H("close", var9_9.a.a("Connection")) || jse.H("close", kgv.a((kgv)var9_9, "Connection"))) {
                        var12_7.b();
                    }
                    var3_19 = var2_20;
                    if (var2_20 == 204) break block43;
                    if (var2_20 != 205) break block44;
                    var3_19 = 205;
                }
                if ((var4_12 = (var10_14 = var9_9.g) != null ? var10_14.a() : -1L) > 0L) {
                    var12_7 = var9_9.g;
                    var9_9 = var11_13;
                    if (var12_7 != null) {
                        var9_9 = var12_7.a();
                    }
                    var11_13 = new StringBuilder("HTTP ");
                    var11_13.append(var3_19);
                    var11_13.append(" had non-zero Content-Length: ");
                    var11_13.append(var9_9);
                    var10_14 = new ProtocolException(var11_13.toString());
                    throw var10_14;
                }
            }
            return var9_9;
        }
    }
}

