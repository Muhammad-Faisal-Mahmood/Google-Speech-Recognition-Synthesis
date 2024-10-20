/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;

public final class cqu {
    private static final hei a = hei.m("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static cqv a(File var0) {
        block22: {
            block24: {
                block23: {
                    if (var0.isDirectory()) {
                        return cqv.a;
                    }
                    var13_2 = StrictMode.allowThreadDiskReads();
                    var12_3 /* !! */  = new byte[62];
                    var14_10 = new FileInputStream((File)var0);
                    var5_12 = hjg.d(var14_10, var12_3 /* !! */ , 62);
                    var3_13 = 0;
                    var10_14 = -1L;
                    var8_15 = -1L;
                    var6_16 = 0L;
                    var1_18 = var2_17 = 0;
                    while (var2_17 < var5_12) {
                        var4_19 = var2_17 + 1;
                        if ((var2_17 = var12_3 /* !! */ [var2_17]) == 32) {
                            if (var1_18 == 0) break;
                            if (var3_13 == 0) {
                                var10_14 = var6_16;
                            } else {
                                if (var3_13 != 1) break;
                                var8_15 = var6_16;
                            }
                            ++var3_13;
                            var1_18 = 0;
                            var2_17 = var4_19;
                            var6_16 = 0L;
                            continue;
                        }
                        if (var2_17 < 48 || var2_17 > 57 || var6_16 > 0xCCCCCCCCCCCCCCCL) break;
                        var6_16 = var6_16 * 10L + (long)(var2_17 - 48);
                        var1_18 = 1;
                        var2_17 = var4_19;
                    }
                    if (var3_13 != 2) break block23;
                    var12_3 /* !! */  = (byte[])new cqv;
                    var12_3 /* !! */ (var10_14, var8_15, var6_16);
                    var14_10.close();
                    var0 = var12_3 /* !! */ ;
                    break block24;
                }
                try {
                    var12_3 /* !! */  = (byte[])new ParseException;
                    var12_3 /* !! */ ("Failed to parse SchedStat", var3_13);
                    throw var12_3 /* !! */ ;
                }
                catch (Throwable var12_4) {
                    try {
                        var14_10.close();
                        ** GOTO lbl55
                    }
                    catch (Throwable var14_11) {
                        block25: {
                            var12_4.addSuppressed(var14_11);
lbl55:
                            // 2 sources

                            throw var12_4;
                            {
                                catch (ParseException var12_5) {
                                }
                                catch (IOException var12_6) {}
                            }
                            break block25;
                            catch (Throwable var0_1) {
                                break block22;
                            }
                        }
                        ((heg)((heg)((heg)cqu.a.h()).i((Throwable)var12_9)).j("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).u("Failed to read SchedStat for thread %s", var0.getName());
                        var0 = cqv.a;
                    }
                }
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var13_2);
            return var0;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var13_2);
        throw var0_1;
    }
}

