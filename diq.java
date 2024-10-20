/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteException
 */
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class diq
implements Callable {
    public final dir a;
    public final hpn b;
    public final String c;
    public final dfd d;

    public /* synthetic */ diq(dir dir2, hpn hpn2, String string, dfd dfd2) {
        this.a = dir2;
        this.b = hpn2;
        this.c = string;
        this.d = dfd2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        block31: {
            block32: {
                var28_1 = this.c;
                var16_2 = this.b;
                var17_6 = (dei)hhk.S((Future)var16_2);
                try {
                    ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadTask", "download", 99, "ScheduledDownloadTask.java")).u("Download completed successfully: %s", var28_1);
                    var16_2 = null;
                    var19_7 = var17_6;
                    break block31;
                }
                catch (Throwable var16_3) {
                    break block32;
                }
                catch (Throwable var16_4) {
                    var17_6 = null;
                }
            }
            var18_9 = this.d;
            var16_2 = crh.r((Throwable)var16_2);
            var13_11 = var16_2 instanceof dgq;
            var18_9 = var18_9.d();
            if (var13_11 && ((dgq)var16_2).a()) {
                ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/packs/PackUtil", "logDownloadError", 54, "PackUtil.java")).u("Download for %s was canceled", var18_9.e());
                var19_7 = var17_6;
            } else {
                ((hfk)((hfk)((hfk)ddd.a.h()).i((Throwable)var16_2)).j("com/google/android/libraries/micore/superpacks/packs/PackUtil", "logDownloadError", 56, "PackUtil.java")).u("Error downloading: %s", var18_9.e());
                var19_7 = var17_6;
            }
        }
        var29_12 = this.a;
        var11_13 = System.currentTimeMillis();
        var1_14 = var16_2 != null ? 0 : 1;
        var2_15 = var19_7 != null ? 0 : 1;
        var13_11 = var1_14 != var2_15;
        fxf.q(var13_11);
        var13_11 = var11_13 > 0L;
        fxf.q(var13_11);
        var18_9 = dip.a;
        synchronized (var18_9) {
            block38: {
                block39: {
                    block37: {
                        block36: {
                            block33: {
                                block35: {
                                    block34: {
                                        var17_6 = dip.e;
                                        var22_16 = (dhv)var17_6.c.remove(var28_1);
                                        if (var22_16 != null) {
                                            var20_17 = var22_16.b;
                                            if ((var20_17 = (dir)var17_6.a.get(var20_17)) != null) {
                                                var17_6.m((dir)var20_17);
                                            }
                                        }
                                        fxf.K(var22_16);
                                        var30_18 = var22_16.a;
                                        var1_14 = var16_2 == null ? 1 : 0;
                                        var14_19 = dip.c.containsKey(var28_1);
                                        var13_11 = var22_16.a();
                                        var17_6 = var29_12.d;
                                        if (var16_2 == null) break block34;
                                        if (var17_6 == null) break block33;
                                        break block35;
                                    }
                                    var16_2 = null;
                                    break block36;
                                }
                                for (var20_17 = var16_2; var20_17 != null; var20_17 = var20_17.getCause()) {
                                    if (!(var20_17 instanceof dgq) || !((dgq)var20_17).b()) continue;
                                    var20_17 = (hfk)ddd.a.l().i((Throwable)var16_2);
                                    ((hfk)var20_17.j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "isPermanentFailure", 887, "ScheduledDownloadManager.java")).r("Failure is permanent");
                                    break block33;
                                }
                                ((hfk)((hfk)ddd.a.l().i((Throwable)var16_2)).j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "isPermanentFailure", 892, "ScheduledDownloadManager.java")).r("Failure is NOT permanent");
                                break block36;
                            }
                            var2_15 = 1;
                            var20_17 = var16_2;
                            var21_20 = var17_6;
                            break block37;
                        }
                        var2_15 = 0;
                        var21_20 = var17_6;
                        var20_17 = var16_2;
                    }
                    var16_2 = var30_18.b;
                    var5_21 = ((deu)var16_2).l;
                    if (var5_21 <= 0L) ** GOTO lbl-1000
                    var17_6 = (deu)var16_2;
                    var16_2 = var18_9;
                    if (var11_13 > var17_6.e + var5_21) {
                        var3_22 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_22 = false;
                    }
                    var16_2 = var18_9;
                    var15_23 = dec.p(var30_18.b());
                    var16_2 = var18_9;
                    var4_24 = var22_16.c;
                    var16_2 = var18_9;
                    var31_25 = (hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "onStopped", 345, "ScheduledDownloadManager.java");
                    var16_2 = var18_9;
                    var32_26 = var30_18.d().e();
                    var22_16 = var1_14 != 0 ? "succeeded" : "failed";
                    var17_6 = var1_14 == 0 ? (var2_15 != 0 ? " (permanent)" : " (retriable)") : "";
                    var23_27 = var14_19 != false ? " cancelled" : "";
                    var24_28 = var13_11 != false ? " paused" : "";
                    var25_29 = var3_22 != false ? " expired" : "";
                    var26_30 = var15_23 != false ? " foreground" : "";
                    var16_2 = var18_9;
                    var27_31 = ((dco)var30_18.d()).a;
                    var16_2 = var18_9;
                    var5_21 = var30_18.h().length();
                    var16_2 = var18_9;
                    if (!dec.m(var27_31)) {
                        var16_2 = var18_9;
                        Long.valueOf(var5_21).getClass();
                        var16_2 = var18_9;
                        var27_31 = Long.toString(var5_21);
                    } else {
                        var27_31 = "redacted";
                    }
                    var16_2 = var18_9;
                    var31_25.S(var32_26, var22_16, var17_6, var23_27, var24_28, var25_29, var26_30, var27_31);
                    var1_14 = !(var1_14 != 0 || var14_19 || var3_22 || var2_15 != 0 && !var13_11 || var15_23 && var4_24 == 4) ? 0 : 1;
                    var2_15 = var1_14 == 0 && var13_11 == false ? 1 : 0;
                    var17_6 = var29_12.g;
                    if (var1_14 == 0) break block38;
                    var16_2 = var18_9;
                    var22_16 = (hqa)dip.b.remove(var28_1);
                    if (var22_16 != null) {
                        if (var20_17 != null) {
                            var16_2 = var18_9;
                            var22_16.n((Throwable)var20_17);
                        } else {
                            var16_2 = var18_9;
                            var22_16.m(var19_7);
                        }
                    }
                    var16_2 = var18_9;
                    var21_20 = (hqa)dip.c.remove(var28_1);
                    if (var21_20 != null) {
                        var16_2 = var18_9;
                        var21_20.m(null);
                    }
                    if (var22_16 != null || var21_20 != null) break block39;
                    var16_2 = var18_9;
                    var20_17 = dip.a((Throwable)var20_17);
                    var16_2 = var18_9;
                    var16_2 = var18_9;
                    var21_20 = new ContentValues(2);
                    var16_2 = var18_9;
                    var21_20.put("completed", Integer.valueOf(1));
                    var16_2 = var18_9;
                    var21_20.put("failure", (String)var20_17);
                    var16_2 = var18_9;
                    try {
                        var1_14 = var17_6.a.getReadableDatabase().update("pending_downloads", (ContentValues)var21_20, "download_id=?", new String[]{var28_1});
                        if (var1_14 != 1) {
                            var16_2 = var18_9;
                            var19_7 = var17_6.a;
                            var16_2 = var18_9;
                            var16_2 = var18_9;
                            var16_2 = var18_9;
                            var21_20 = new StringBuilder();
                            var16_2 = var18_9;
                            var21_20.append("SqlitePendingDownloadQueue#setCompleted, SQL update failed, download: ");
                            var16_2 = var18_9;
                            var21_20.append(var28_1);
                            var16_2 = var18_9;
                            var21_20.append(", updated: ");
                            var16_2 = var18_9;
                            var21_20.append(var1_14);
                            var16_2 = var18_9;
                            var20_17 = new IOException(var21_20.toString());
                            var16_2 = var18_9;
                            var19_7.a((IOException)var20_17);
                            var16_2 = var18_9;
                            throw var20_17;
                        }
                        ** GOTO lbl217
                    }
                    catch (SQLiteException var19_8) {
                        var16_2 = var18_9;
                        var20_17 = var17_6.a;
                        var16_2 = var18_9;
                        var16_2 = var18_9;
                        var17_6 = new IOException(String.format(Locale.US, "SqlitePendingDownloadQueue#setCompleted, SQL update failed, download: %s.", new Object[]{var28_1}), var19_8);
                        var16_2 = var18_9;
                        var20_17.a((IOException)var17_6);
                        var16_2 = var18_9;
                        throw var17_6;
                    }
                }
                var16_2 = var18_9;
                var17_6.e(var28_1);
                ** GOTO lbl217
            }
            if (var2_15 == 0) ** GOTO lbl217
            var16_2 = var18_9;
            fxf.K(var21_20);
            var16_2 = var18_9;
            var22_16 = TimeUnit.SECONDS;
            var16_2 = var18_9;
            var16_2 = var18_9;
            var9_33 = var21_20.c;
            var5_21 = 30L;
            ** GOTO lbl199
            catch (Throwable var16_5) {
                block40: {
                    break block40;
lbl199:
                    // 2 sources

                    for (var7_32 = var30_18.f; var7_32 > 0L; --var7_32) {
                        if ((var5_21 += var5_21) < var9_33) continue;
                        var5_21 = var9_33;
                        break;
                    }
                    var16_2 = var18_9;
                    var7_32 = var22_16.toMillis(var5_21 + (long)dil.b.nextInt(10));
                    var16_2 = var18_9;
                    ++var30_18.f;
                    var5_21 = var11_13 + var7_32;
                    var16_2 = var18_9;
                    var30_18.j(var5_21);
                    var16_2 = var18_9;
                    ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "updateDownloadRetry", 907, "ScheduledDownloadManager.java")).G("Setting next retry time for %s to %s (%d ms from now)", var30_18.d().e(), dec.d(var5_21), var7_32);
                    var16_2 = var18_9;
                    var30_18.d = dip.a((Throwable)var20_17);
                    var16_2 = var18_9;
                    var17_6.f(var30_18);
lbl217:
                    // 4 sources

                    var16_2 = var18_9;
                    // MONITOREXIT @DISABLED, blocks:[7, 9, 13] lbl209 : MonitorExitStatement: MONITOREXIT : var18_9
                    {
                        catch (Throwable var18_10) {
                            var17_6 = var16_2;
                            continue;
                        }
                    }
                    dip.b(var29_12.b, (bzq)var17_6, null, var11_13, "download stopped");
                    return var19_7;
                }
                var17_6 = var18_9;
                var18_9 = var16_5;
                while (true) {
                    var16_2 = var17_6;
                    // ** MonitorExit[var17_6] (shouldn't be in output)
                    throw var18_9;
                }
            }
        }
    }
}

