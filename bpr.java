/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.app.ActivityManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.zip.Adler32;
import java.util.zip.CRC32;

public final class bpr
implements gui {
    private final int a;

    public /* synthetic */ bpr(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object a() {
        int n2 = this.a;
        boolean bl2 = true;
        boolean bl3 = true;
        switch (n2) {
            default: {
                return gsl.a;
            }
            case 19: {
                return gsl.a;
            }
            case 18: {
                return hhk.K(null);
            }
            case 17: {
                return hhk.K(null);
            }
            case 16: {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)runningAppProcessInfo);
                }
                catch (RuntimeException runtimeException) {
                    Log.w((String)"PhenotypeProcessReaper", (String)"Failed to retrieve memory state, not killing process.", (Throwable)runtimeException);
                }
                n2 = runningAppProcessInfo.importance;
                StringBuilder stringBuilder = new StringBuilder("Memory state is: ");
                stringBuilder.append(n2);
                Log.i((String)"PhenotypeProcessReaper", (String)stringBuilder.toString());
                if (runningAppProcessInfo.importance >= 400) {
                    bl2 = bl3;
                    return bl2;
                }
                bl2 = false;
                return bl2;
            }
            case 15: {
                return hhk.F(Executors.newSingleThreadScheduledExecutor(new coe(2)));
            }
            case 14: {
                return new keu();
            }
            case 13: {
                if (ActivityManager.isUserAMonkey()) return bl2;
                bl2 = Build.VERSION.SDK_INT < 29 ? ActivityManager.isRunningInTestHarness() : dp$$ExternalSyntheticApiModelOutline0.m();
                return bl2;
            }
            case 12: {
                return dqi.a();
            }
            case 11: {
                return new CRC32();
            }
            case 10: {
                return new Adler32();
            }
            case 9: {
                return true;
            }
            case 8: {
                ctc ctc2;
                ctc ctc3 = ctc2 = ctc.b(inw.a.b().c().b);
                if (ctc2 == null) {
                    ctc3 = ctc.a;
                }
                ctc2 = ctc3;
                if (ctc3 != ctc.a) return ctc2;
                return ctc.b;
            }
            case 7: {
                return hei.m("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring");
            }
            case 4: 
            case 5: 
            case 6: {
                return false;
            }
            case 3: {
                return new bpp(1, 6, "AICore service disconnected", null);
            }
            case 2: {
                return new bpp(3, 6, "AICore service disconnected", null);
            }
            case 1: {
                return new aii(new apb(), 50000, 50000, 2500, 5000);
            }
            case 0: 
        }
        return new bpp(3, 6, "AICore service disconnected", null);
    }
}

