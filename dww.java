/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.SystemClock
 *  android.util.Log
 *  gqv
 *  hom
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public class dww {
    public static String a;
    public static Boolean b;
    private static String c;
    private static Boolean d;

    public dww() {
    }

    public dww(byte[] byArray, byte[] byArray2) {
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(Context object) {
        block18: {
            Object var4_7;
            Object object2;
            block19: {
                Throwable throwable522;
                StrictMode.ThreadPolicy threadPolicy;
                block17: {
                    block20: {
                        block16: {
                            object2 = c;
                            if (object2 != null) {
                                return object2;
                            }
                            if (Build.VERSION.SDK_INT >= 28) {
                                object = fs$$ExternalSyntheticApiModelOutline0.m();
                                c = object;
                                return object;
                            }
                            boolean bl2 = "robolectric".equals(Build.FINGERPRINT);
                            var4_7 = null;
                            if (bl2) break block19;
                            try {
                                object2 = Class.forName("android.app.ActivityThread", false, dww.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                                ((Method)object2).setAccessible(true);
                                object2 = ((Method)object2).invoke(null, null);
                                if (!(object2 instanceof String)) break block16;
                                object2 = (String)object2;
                            }
                            catch (Throwable throwable2) {}
                        }
                        object2 = null;
                        c = object2;
                        if (object2 != null) return object2;
                        threadPolicy = StrictMode.allowThreadDiskReads();
                        object2 = new FileReader("/proc/self/cmdline");
                        BufferedReader bufferedReader = new BufferedReader((Reader)object2, 50);
                        object2 = bufferedReader.readLine().trim();
                        bufferedReader.close();
                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                        break block20;
                        catch (Throwable throwable3) {
                            try {
                                bufferedReader.close();
                                throw throwable3;
                            }
                            catch (Throwable throwable4) {
                                try {
                                    throwable3.addSuppressed(throwable4);
                                    throw throwable3;
                                }
                                catch (Throwable throwable522) {
                                    break block17;
                                }
                                catch (Exception exception) {
                                    Log.e((String)"CurrentProcess", (String)"Unable to read /proc/self/cmdline", (Throwable)exception);
                                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                                    object2 = null;
                                }
                            }
                        }
                    }
                    c = object2;
                    if (object2 != null) return object2;
                    break block19;
                }
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                throw throwable522;
            }
            object2 = ((ActivityManager)object.getSystemService("activity")).getRunningAppProcesses();
            object = var4_7;
            if (object2 != null) {
                int n2 = Process.myPid();
                object2 = object2.iterator();
                do {
                    object = var4_7;
                    if (!object2.hasNext()) break block18;
                    object = (ActivityManager.RunningAppProcessInfo)object2.next();
                } while (object.pid != n2);
                object = object.processName;
            }
        }
        c = object;
        return object;
    }

    public static boolean b() {
        if (d == null) {
            d = ag$$ExternalSyntheticApiModelOutline1.m(Process.myUid());
        }
        return d;
    }

    public static void c(hpn hpn2) {
        hpn2.c(new dqv(hpn2, 7), (Executor)hom.a);
    }

    public static void d(Map object) {
        for (Map.Entry entry : object.entrySet()) {
            object = fxf.as((String)entry.getKey(), gqv.a);
            try {
                ((dxe)((jnu)entry.getValue()).b()).a();
            }
            finally {
                ((gol)object).close();
            }
        }
    }

    public static /* synthetic */ dml e(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dml(hwp2);
    }

    public static /* synthetic */ dml f(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dml(hwp2);
    }

    public static ehb g(int n2) {
        ehb ehb22;
        block3: {
            for (ehb ehb22 : ehb.values()) {
                if (ehb22.e != n2) {
                    continue;
                }
                break block3;
            }
            ehb22 = null;
        }
        if (ehb22 == null) {
            return ehb.a;
        }
        return ehb22;
    }

    public static ego h(ekk ekk2, efo efo2) {
        ekk2.getClass();
        return new ego(ekk2, efo2);
    }

    public static efq i(efs efs2) {
        jse.e(efs2, "initialSource");
        return new efp(efs2);
    }

    public static gto j(gto object) {
        gto gto2;
        jse.e(object, "<this>");
        if (!((gto)object).g()) {
            gto2 = object;
        } else {
            Object object2 = (hpn)((eez)((gto)object).c()).a();
            gto2 = object;
            if (object2.isDone()) {
                object2 = hhk.S((Future)object2);
                jse.d(object2, "getDone(...)");
                gto2 = object;
                if ((((eag)object2).b & 1) != 0) {
                    object = dox.j(eag.a.l());
                    ((bzo)object).s(SystemClock.elapsedRealtime());
                    gto2 = gto.h(new efc(hhk.K(((bzo)object).r()), 0));
                }
            }
        }
        return gto2;
    }

    public static /* synthetic */ bzb k(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static /* synthetic */ bzb l(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static /* synthetic */ cxt m(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }

    public static /* synthetic */ dlm n(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dlm((Object)hwp2, null);
    }
}

