/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
import android.os.Process;
import j$.util.Optional;
import java.io.InputStream;

public final class cmv
implements hnx {
    public final cmz a;
    public final int b;
    public final int c;
    public final InputStream d;
    public final gto e;
    public final gto f;
    public final gto g;

    public /* synthetic */ cmv(cmz cmz2, int n2, int n3, InputStream inputStream, gto gto2, gto gto3, gto gto4) {
        this.a = cmz2;
        this.b = n2;
        this.c = n3;
        this.d = inputStream;
        this.e = gto2;
        this.f = gto3;
        this.g = gto4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a() {
        block34: {
            block33: {
                var3_1 = this.g;
                var4_6 = false;
                var3_1.e(var4_6);
                var4_6.getClass();
                ((heg)((heg)cmz.a.c()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "getStreamingSodaConfig", 702, "SodaDetectionHandler.java")).r("#getStreamingSodaConfig");
                var4_6 = (hwr)igx.a.l();
                var5_7 = igv.a.l();
                var6_8 = igw.a.l();
                var2_9 = var6_8.b.B();
                var3_1 = this.e;
                if (!var2_9) {
                    var6_8.u();
                }
                var7_10 = var6_8.b;
                var8_11 = (igw)var7_10;
                var8_11.c = 0;
                var8_11.b |= 1;
                if (!var7_10.B()) {
                    var6_8.u();
                }
                var7_10 = var6_8.b;
                var8_11 = (igw)var7_10;
                var8_11.f = 0;
                var8_11.b |= 32;
                if (!var7_10.B()) {
                    var6_8.u();
                }
                var7_10 = (igw)var6_8.b;
                var7_10.d = 2;
                var7_10.b |= 2;
                var7_10 = ids.a.l();
                if (!var7_10.b.B()) {
                    var7_10.u();
                }
                var8_11 = var7_10.b;
                var9_12 = (ids)var8_11;
                var9_12.c = 1;
                var9_12.b |= 1;
                if (!var8_11.B()) {
                    var7_10.u();
                }
                var1_13 = this.c;
                var8_11 = var9_12 = var7_10.b;
                var8_11.b |= 4;
                var8_11.e = var1_13;
                if (!var9_12.B()) {
                    var7_10.u();
                }
                var1_13 = this.b;
                var8_11 = (ids)var7_10.b;
                var8_11.b |= 2;
                var8_11.d = var1_13;
                if (!var6_8.b.B()) {
                    var6_8.u();
                }
                var8_11 = (igw)var6_8.b;
                var7_10 = (ids)var7_10.o();
                var7_10.getClass();
                var8_11.e = var7_10;
                var8_11.b |= 4;
                if (!var5_7.b.B()) {
                    var5_7.u();
                }
                var7_10 = (igv)var5_7.b;
                var6_8 = (igw)var6_8.o();
                var6_8.getClass();
                var7_10.c = var6_8;
                var7_10.b = 1;
                if (!var4_6.b.B()) {
                    var4_6.u();
                }
                var6_8 = (igx)var4_6.b;
                var5_7 = (igv)var5_7.o();
                var5_7.getClass();
                var6_8.e = var5_7;
                var6_8.b |= 8;
                if (!var4_6.b.B()) {
                    var4_6.u();
                }
                var5_7 = (igx)var4_6.b;
                var5_7.b |= 2;
                var5_7.d = false;
                if (!var4_6.b.B()) {
                    var4_6.u();
                }
                var5_7 = (igx)var4_6.b;
                var5_7.b |= 128;
                var5_7.g = 0;
                if (!var4_6.b.B()) {
                    var4_6.u();
                }
                var5_7 = this.f;
                igx.G((igx)var4_6.b);
                if (!var4_6.b.B()) {
                    var4_6.u();
                }
                var7_10 = ((gtt)var5_7).a;
                var5_7 = this.a;
                var6_8 = (igx)var4_6.b;
                var6_8.f = (ihi)var7_10;
                var6_8.b |= 32;
                var6_8 = var5_7.d;
                if (var6_8 != null) {
                    if (!var4_6.b.B()) {
                        var4_6.u();
                    }
                    var7_10 = (igx)var4_6.b;
                    var7_10.h = var6_8;
                    var7_10.b |= 256;
                }
                var6_8 = this.d;
                var7_10 = (igx)var4_6.o();
                if (var5_7.e) {
                    var3_1 = var5_7.g;
                    var8_11 = var5_7.c();
                    var9_12 = var5_7.c;
                    var5_7 = Optional.ofNullable(null);
                    ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "startDetection", 374, "ConcurrentSodaManager.java")).r("#startDetection with input stream");
                    var4_6 = var3_1.h;
                    // MONITORENTER : var4_6
                    var3_1 = var3_1.c((String)var8_11, (cmt)var9_12);
                    if (var3_1 != null && var3_1.p()) {
                        if (var3_1.q()) {
                            var3_1 = new IllegalStateException("SODA is not ready for startCapture");
                            var3_1 = hhk.J((Throwable)var3_1);
                            // MONITOREXIT : var4_6
                            return var3_1;
                        }
                        var1_13 = Process.getThreadPriority((int)0);
                        ((heg)((heg)cmn.a.c()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "startDetection", 389, "ConcurrentSodaManager.java")).r("Starting SODA");
                        Process.setThreadPriority((int)var1_13);
                        var3_1 = var3_1.e((igx)var7_10, (InputStream)var6_8, gto.h(var5_7.orElse(null)));
                        break block33;
                    } else {
                        var3_1 = new IllegalStateException("SODA is not initialized for this client");
                        var3_1 = hhk.J((Throwable)var3_1);
                        // MONITOREXIT : var4_6
                        return var3_1;
                    }
                }
                if (var5_7.g() == false) return hhk.J(new IllegalStateException("SODA is not ready for startCapture"));
                if (((cnd)((gtt)var5_7.f).a).q() != false) return hhk.J(new IllegalStateException("SODA is not ready for startCapture"));
                var1_13 = Process.getThreadPriority((int)0);
                ((heg)((heg)cmz.a.c()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "startDetectionInternal", 546, "SodaDetectionHandler.java")).r("Starting SODA");
                Process.setThreadPriority((int)var1_13);
                var3_1 = ((cnd)((gtt)var5_7.f).a).e((igx)var7_10, (InputStream)var6_8, (gto)var3_1);
                break block34;
            }
lbl137:
            // 2 sources

            while (true) {
                Process.setThreadPriority((int)var1_13);
                return var3_1;
            }
            {
                catch (Throwable var3_2) {
                }
                catch (IllegalStateException var3_3) {}
                {
                    var3_1 = new IllegalStateException("SODA failed to start capturing");
                    var3_1 = hhk.J((Throwable)var3_1);
                    ** continue;
                }
            }
            Process.setThreadPriority((int)var1_13);
            throw var3_2;
        }
lbl149:
        // 2 sources

        while (true) {
            Process.setThreadPriority((int)var1_13);
            return var3_1;
        }
        {
            catch (Throwable var3_4) {
            }
            catch (IllegalStateException var3_5) {}
            {
                a.as(cmz.a.g(), "SODA failed to start capturing.", "com/google/android/libraries/assistant/soda/SodaDetectionHandler", "startDetectionInternal", '\u0227', "SodaDetectionHandler.java", var3_5);
                var3_1 = new IllegalStateException("SODA failed to start capturing");
                var3_1 = hhk.J((Throwable)var3_1);
                ** continue;
            }
        }
        Process.setThreadPriority((int)var1_13);
        throw var3_4;
    }
}

