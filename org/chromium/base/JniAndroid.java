/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 */
package org.chromium.base;

import android.text.TextUtils;
import android.util.Log;

public final class JniAndroid {
    private JniAndroid() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Throwable handleException(Throwable throwable, String string) {
        try {
            Log.e((String)"cr_JniAndroid", (String)"Handling uncaught Java exception", (Throwable)throwable);
            kmz kmz2 = new kmz(string, throwable);
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), kmz2);
            Log.e((String)"cr_JniAndroid", (String)"Global uncaught exception handler did not terminate the process.");
            return null;
        }
        catch (Throwable throwable2) {
            Log.e((String)"cr_JniAndroid", (String)"Exception in uncaught exception handler.", (Throwable)throwable2);
            return throwable2;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return null;
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String sanitizedStacktraceForUnhandledException(Throwable var0) {
        try {
            var0 = Log.getStackTraceString((Throwable)var0);
            if (TextUtils.isEmpty((CharSequence)var0)) {
                return "";
            }
            var6_4 = var0.split("\\n");
            var2_5 = 0;
            block7: while (true) {
                block22: {
                    block21: {
                        if (var2_5 >= var6_4.length) break block21;
                        if (var6_4[var2_5].startsWith("\tat ")) ** GOTO lbl30
                        var0 = var5_9 = var6_4[var2_5];
                        if (knd.b.matcher((CharSequence)var5_9).find()) ** GOTO lbl29
                        break block22;
                    }
                    return TextUtils.join((CharSequence)"\n", (Object[])var6_4);
                }
                var7_10 = new StringBuilder((String)var5_9);
                var0 = knd.a.matcher(var7_10);
                var1_6 = 0;
                while (true) {
                    block23: {
                        block20: {
                            if (var0.find(var1_6)) {
                                var4_8 = var0.start();
                                var3_7 = var0.end();
                                var5_9 = var7_10.substring(var4_8, var3_7);
                                var8_11 = knd.c;
                                var1_6 = var8_11.length;
                            } else {
                                var0 = var7_10.toString();
lbl29:
                                // 2 sources

                                var6_4[var2_5] = var0;
lbl30:
                                // 2 sources

                                ++var2_5;
                                continue block7;
                            }
                            for (var1_6 = 0; var1_6 < 3; ++var1_6) {
                                if (!var5_9.startsWith(var8_11[var1_6])) {
                                    continue;
                                }
                                break block20;
                            }
                            if (var5_9.startsWith("chromium-") && (var5_9.endsWith(".apk") || var5_9.endsWith(".aab"))) break block20;
                            var8_11 = knd.d;
                            var1_6 = var8_11.length;
                            for (var1_6 = 0; var1_6 < 11; ++var1_6) {
                                if (!var5_9.startsWith(var8_11[var1_6])) {
                                    continue;
                                }
                                break block20;
                            }
                            if (!knd.a((String)var5_9) && ((var1_6 = var5_9.lastIndexOf(".")) == -1 || !knd.a(var5_9.substring(0, var1_6)))) break block23;
                        }
                        var1_6 = var3_7;
                        continue;
                    }
                    var7_10.replace(var4_8, var3_7, "HTTP://WEBADDRESS.ELIDED");
                    var1_6 = var4_8 + 24;
                    var0 = knd.a.matcher(var7_10);
                }
                break;
            }
        }
        catch (Throwable var0_1) {
            return a.ai(Log.getStackTraceString((Throwable)var0_1), "Error while getting stack trace: ");
        }
        catch (OutOfMemoryError var0_3) {
            return null;
        }
    }
}

