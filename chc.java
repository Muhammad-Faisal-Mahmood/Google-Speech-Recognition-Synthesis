/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.Log
 */
import android.os.Looper;
import android.util.Log;

public final class chc {
    private static ClassLoader a;
    private static Thread b;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ClassLoader a() {
        synchronized (chc.class) {
            block38: {
                block34: {
                    block36: {
                        block30: {
                            block35: {
                                if (chc.a != null) return chc.a;
                                var4 = chc.b;
                                var8_5 = null;
                                var7_6 = null;
                                var5_7 = var4;
                                if (var4 != null) break block34;
                                var5_7 = Looper.getMainLooper().getThread().getThreadGroup();
                                if (var5_7 != null) break block35;
                                var4 = null;
                                break block36;
                            }
                            synchronized (Void.class) {
                                block31: {
                                    block29: {
                                        block28: {
                                            var2_10 = var5_7.activeGroupCount();
                                            var6_11 = new ThreadGroup[var2_10];
                                            var5_7.enumerate((ThreadGroup[])var6_11);
                                            var1_12 = 0;
                                            for (var0_13 = 0; var0_13 < var2_10; ++var0_13) {
                                                var4 = var6_11[var0_13];
                                                if (!"dynamiteLoader".equals(var4.getName())) {
                                                    continue;
                                                }
                                                break block28;
                                            }
                                            var4 = null;
                                        }
                                        var6_11 = var4;
                                        if (var4 != null) ** GOTO lbl32
                                        var6_11 = new ThreadGroup((ThreadGroup)var5_7, "dynamiteLoader");
lbl32:
                                        // 2 sources

                                        var2_10 = var6_11.activeCount();
                                        var5_7 = new Thread[var2_10];
                                        var6_11.enumerate((Thread[])var5_7);
                                        for (var0_13 = var1_12; var0_13 < var2_10; ++var0_13) {
                                            var4 = var5_7[var0_13];
                                            var3_14 = "GmsDynamite".equals(var4.getName());
                                            if (!var3_14) {
                                                continue;
                                            }
                                            break block29;
                                        }
                                        var4 = null;
                                    }
                                    var5_7 = var4;
                                    if (var4 != null) break block30;
                                    try {
                                        try {
                                            var5_7 = new chb((ThreadGroup)var6_11);
                                        }
                                        catch (SecurityException var5_8) {
                                            break block31;
                                        }
                                        try {
                                            var5_7.setContextClassLoader(null);
                                            var5_7.start();
                                            break block30;
                                        }
                                        catch (SecurityException var4_1) {
                                            var6_11 = var5_7;
                                            var5_7 = var4_1;
                                            var4 = var6_11;
                                            break block31;
                                        }
                                    }
                                    catch (Throwable var4_2) {
                                        ** break block37
                                    }
                                    catch (SecurityException var5_9) {
                                        var4 = null;
                                    }
                                }
                                var6_11 = var5_7.getMessage();
                                var5_7 = new StringBuilder();
                                var5_7.append("Failed to enumerate thread/threadgroup ");
                                var5_7.append((String)var6_11);
                                Log.w((String)"DynamiteLoaderV2CL", (String)var5_7.toString());
                                var5_7 = var4;
                            }
                        }
                        var4 = var5_7;
                    }
                    chc.b = var4;
                    var5_7 = var4;
                    if (var4 != null) break block34;
                    var4 = var8_5;
                    break block38;
lbl-1000:
                    // 1 sources

                    {
                        throw var4_2;
                    }
                }
                synchronized (var5_7) {
                    block33: {
                        block32: {
                            try {
                                var4 = chc.b.getContextClassLoader();
                                break block32;
                            }
                            catch (Throwable var4_3) {
                                break block33;
                            }
                            catch (SecurityException var4_4) {
                                var6_11 = var4_4.getMessage();
                                var4 = new StringBuilder();
                                var4.append("Failed to get thread context classloader ");
                                var4.append((String)var6_11);
                                Log.w((String)"DynamiteLoaderV2CL", (String)var4.toString());
                                var4 = var7_6;
                            }
                        }
                        break block38;
                    }
                    throw var4_3;
                }
            }
            chc.a = var4;
            return chc.a;
        }
    }
}

