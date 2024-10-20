/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.os.Process
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public final class dlt {
    public static volatile ActivityManager a;
    static volatile boolean b;
    private static volatile String c;

    private dlt() {
    }

    public static dlu a(Context object) {
        object = object.getSystemService("activity");
        fxf.K(object);
        object = ((ActivityManager)object).getRunningAppProcesses();
        if (object == null) {
            int n2 = gzx.d;
            object = new dlu(false, hct.a);
        } else {
            object = new dlu(true, gzx.o((Collection)object));
        }
        return object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b() {
        Object object;
        block13: {
            Object object2;
            block11: {
                BufferedReader bufferedReader;
                block12: {
                    if (c != null) {
                        return c;
                    }
                    int n2 = Process.myPid();
                    Object object3 = null;
                    object = null;
                    bufferedReader = null;
                    if (n2 <= 0) break block13;
                    FileReader fileReader = new FileReader(a.ah(n2, "/proc/", "/cmdline"));
                    object2 = new BufferedReader(fileReader);
                    try {
                        object3 = ((BufferedReader)object2).readLine();
                        fxf.K(object3);
                        object = object3 = ((String)object3).trim();
                        break block11;
                    }
                    catch (Throwable throwable) {
                        object = object2;
                        object2 = throwable;
                        break block12;
                    }
                    catch (Throwable throwable) {
                        object = object3;
                    }
                }
                if (object == null) throw object2;
                try {
                    ((BufferedReader)object).close();
                }
                catch (IOException iOException) {
                    throw object2;
                }
                throw object2;
                catch (IOException iOException) {
                    block14: {
                        object2 = null;
                        break block14;
                        catch (IOException iOException2) {}
                    }
                    if (object2 == null) break block13;
                    object = bufferedReader;
                }
            }
            try {
                ((BufferedReader)object2).close();
            }
            catch (IOException iOException) {}
        }
        if (object == null) return c;
        c = object;
        return c;
    }

    public static String c(String string, String string2) {
        if (string2 != null && string != null && string2.startsWith(string)) {
            int n2 = string.length();
            if (string2.length() == n2) {
                return null;
            }
            return string2.substring(n2 + 1);
        }
        return string2;
    }

    public static boolean d(Context object, dlu object2) {
        boolean bl2;
        block2: {
            String string;
            bl2 = ((dlu)object2).a;
            boolean bl3 = false;
            if (!bl2) {
                return false;
            }
            gzx gzx2 = ((dlu)object2).a();
            object2 = object.getPackageName();
            object = String.valueOf(object2);
            Iterator iterator = gzx2.iterator();
            do {
                bl2 = bl3;
                if (!iterator.hasNext()) break block2;
                gzx2 = (ActivityManager.RunningAppProcessInfo)iterator.next();
            } while (((ActivityManager.RunningAppProcessInfo)gzx2).importance != 100 || !((ActivityManager.RunningAppProcessInfo)gzx2).processName.equals(object2) && !((ActivityManager.RunningAppProcessInfo)gzx2).processName.startsWith(string = ((String)object).concat(":")));
            bl2 = true;
        }
        return bl2;
    }
}

