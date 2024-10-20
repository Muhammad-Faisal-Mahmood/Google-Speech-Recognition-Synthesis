/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URISyntaxException;

public final class hsx
extends itx {
    private final String a;
    private final hqw b;
    private final Object c = new Object();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public hsx(String string, hqw hqw2) {
        this.a = string;
        this.b = hqw2;
    }

    private static final URI c(String object) {
        URI uRI;
        block3: {
            try {
                uRI = new URI(null, (String)object, null, null, null);
                if (uRI.getPort() == -1) break block3;
                return uRI;
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new IllegalStateException("Malformed endpoint authority", uRISyntaxException);
            }
        }
        object = new URI(uRI.getScheme(), uRI.getUserInfo(), uRI.getHost(), 443, uRI.getPath(), uRI.getQuery(), uRI.getFragment());
        return object;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final itz a(ixb var1_1, itw var2_6) {
        block69: {
            var7_7 = (String)var2_6.g(hri.a);
            var8_8 = this.b;
            var6_9 = var7_7;
            if (var7_7 == null) {
                var6_9 = this.a;
            }
            var6_9 = hsx.c((String)var6_9);
            fxf.B(TextUtils.isEmpty((CharSequence)var6_9.getAuthority()) ^ true, "Could not parse channel authority");
            var7_7 = (Integer)var2_6.g(htt.a);
            var10_10 = (Integer)var2_6.g(htt.b);
            var9_11 = (Integer)var2_6.g(hrd.a);
            var4_12 = (Long)((gum)this.b.l).a;
            var11_13 = this.b;
            var10_10 = new hsw((URI)var6_9, var4_12, var11_13.p, var11_13.q, (Integer)var7_7, (Integer)var10_10, (Integer)var9_11);
            var6_9 = (hsv)this.d.get(var10_10);
            if (var6_9 != null) break block69;
            var6_9 = this.c;
            synchronized (var6_9) {
                block71: {
                    block72: {
                        block55: {
                            block56: {
                                block57: {
                                    block58: {
                                        block68: {
                                            block67: {
                                                block66: {
                                                    block65: {
                                                        block64: {
                                                            block63: {
                                                                block62: {
                                                                    block61: {
                                                                        block60: {
                                                                            block59: {
                                                                                block70: {
                                                                                    if (this.d.containsKey(var10_10)) break block55;
                                                                                    var7_7 = new gum(false);
                                                                                    var9_11 = new hrj();
                                                                                    var9_11.d((gui)var7_7);
                                                                                    var9_11.c(0x400000);
                                                                                    var9_11.a(0x7FFFFFFFFFFFFFFFL);
                                                                                    var9_11.b(hrk.a);
                                                                                    var7_7 = var8_8.a;
                                                                                    if (var7_7 == null) break block56;
                                                                                    var9_11.a = var7_7;
                                                                                    var9_11.b = var10_10.a;
                                                                                    var9_11.i = var10_10.c;
                                                                                    var9_11.j = var10_10.d;
                                                                                    var9_11.k = var10_10.b;
                                                                                    var9_11.o = (byte)(var9_11.o | 1);
                                                                                    var7_7 = var8_8.d;
                                                                                    if (var7_7 == null) break block57;
                                                                                    var9_11.c = var7_7;
                                                                                    var7_7 = var8_8.b;
                                                                                    if (var7_7 == null) break block58;
                                                                                    var9_11.d = var7_7;
                                                                                    var9_11.e = var8_8.e;
                                                                                    var9_11.f = var8_8.h;
                                                                                    var9_11.d(var8_8.i);
                                                                                    var9_11.h = var8_8.m;
                                                                                    var9_11.a(var8_8.p);
                                                                                    var9_11.b(var8_8.q);
                                                                                    var9_11.p = var8_8.t;
                                                                                    var7_7 = var10_10.e;
                                                                                    if (var7_7 == null) ** GOTO lbl55
                                                                                    var9_11.c(var7_7.intValue());
                                                                                    break block70;
lbl55:
                                                                                    // 1 sources

                                                                                    var9_11.c(var8_8.o);
                                                                                }
                                                                                var12_14 = var8_8.s;
                                                                                if (var9_11.o != 15 || (var19_15 = var9_11.a) == null) break block59;
                                                                                var23_16 = var9_11.b;
                                                                                if (var23_16 == null) break block59;
                                                                                var16_17 = var9_11.c;
                                                                                if (var16_17 == null) break block59;
                                                                                var14_18 = var9_11.d;
                                                                                if (var14_18 == null) break block59;
                                                                                var18_19 = var9_11.g;
                                                                                if (var18_19 == null) break block59;
                                                                                var15_21 = var9_11.e;
                                                                                var13_22 = var9_11.f;
                                                                                var21_23 = var9_11.h;
                                                                                var20_24 = var9_11.i;
                                                                                var17_25 = var9_11.j;
                                                                                var4_12 = var9_11.k;
                                                                                var3_26 = var9_11.l;
                                                                                var7_7 = var6_9;
                                                                                var22_20 = new hrk(var19_15, var23_16, var16_17, var14_18, var15_21, var13_22, var18_19, var21_23, var20_24, var17_25, var4_12, var3_26, var9_11.m, var9_11.n, var9_11.p);
                                                                                var11_13 = new hsv(var12_14, var22_20, var8_8.c);
                                                                                this.d.put(var10_10, var11_13);
                                                                                {
                                                                                    catch (Throwable var1_5) {
                                                                                        var2_6 = var7_7;
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                catch (Throwable var1_2) {
                                                                                    var2_6 = var7_7;
                                                                                }
                                                                                break block71;
                                                                                catch (Throwable var1_3) {}
                                                                                break block72;
                                                                            }
                                                                            var7_7 = var6_9;
                                                                            var7_7 = var6_9;
                                                                            var1_1 = new StringBuilder();
                                                                            var7_7 = var6_9;
                                                                            if (var9_11.a != null) break block60;
                                                                            var7_7 = var6_9;
                                                                            var1_1.append(" applicationContext");
                                                                        }
                                                                        var7_7 = var6_9;
                                                                        if (var9_11.b != null) break block61;
                                                                        var7_7 = var6_9;
                                                                        var1_1.append(" uri");
                                                                    }
                                                                    var7_7 = var6_9;
                                                                    if (var9_11.c != null) break block62;
                                                                    var7_7 = var6_9;
                                                                    var1_1.append(" networkExecutor");
                                                                }
                                                                var7_7 = var6_9;
                                                                if (var9_11.d != null) break block63;
                                                                var7_7 = var6_9;
                                                                var1_1.append(" transportExecutor");
                                                            }
                                                            var7_7 = var6_9;
                                                            if (var9_11.g != null) break block64;
                                                            var7_7 = var6_9;
                                                            var1_1.append(" recordNetworkMetricsToPrimes");
                                                        }
                                                        var7_7 = var6_9;
                                                        if ((var9_11.o & 1) != 0) break block65;
                                                        var7_7 = var6_9;
                                                        var1_1.append(" grpcIdleTimeoutMillis");
                                                    }
                                                    var7_7 = var6_9;
                                                    if ((var9_11.o & 2) != 0) break block66;
                                                    var7_7 = var6_9;
                                                    var1_1.append(" maxMessageSize");
                                                }
                                                var7_7 = var6_9;
                                                if ((var9_11.o & 4) != 0) break block67;
                                                var7_7 = var6_9;
                                                var1_1.append(" grpcKeepAliveTimeMillis");
                                            }
                                            var7_7 = var6_9;
                                            if ((var9_11.o & 8) != 0) break block68;
                                            var7_7 = var6_9;
                                            var1_1.append(" grpcKeepAliveTimeoutMillis");
                                        }
                                        var7_7 = var6_9;
                                        var7_7 = var6_9;
                                        var2_6 = new IllegalStateException("Missing required properties:".concat(var1_1.toString()));
                                        var7_7 = var6_9;
                                        throw var2_6;
                                    }
                                    var7_7 = var6_9;
                                    var7_7 = var6_9;
                                    var1_1 = new NullPointerException("Null transportExecutor");
                                    var7_7 = var6_9;
                                    throw var1_1;
                                }
                                var7_7 = var6_9;
                                var7_7 = var6_9;
                                var1_1 = new NullPointerException("Null networkExecutor");
                                var7_7 = var6_9;
                                throw var1_1;
                            }
                            var7_7 = var6_9;
                            var7_7 = var6_9;
                            var1_1 = new NullPointerException("Null applicationContext");
                            var7_7 = var6_9;
                            throw var1_1;
                        }
                        var7_7 = var6_9;
                        var8_8 = (hsv)this.d.get(var10_10);
                        var7_7 = var6_9;
                        // MONITOREXIT @DISABLED, blocks:[48, 46] lbl194 : MonitorExitStatement: MONITOREXIT : var6_9
                        var6_9 = var8_8;
                        catch (Throwable var1_4) {
                            // empty catch block
                        }
                    }
                    var2_6 = var6_9;
                }
                while (true) {
                    var7_7 = var2_6;
                    // ** MonitorExit[var2_6] (shouldn't be in output)
                    throw var1_1;
                }
            }
        }
        return var6_9.a((ixb)var1_1, (itw)var2_6);
    }

    @Override
    public final String b() {
        return this.a;
    }
}

