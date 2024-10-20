/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Process
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;

public final class bif {
    static {
        bbi.b("ProcessUtils");
    }

    public static final boolean a(Context context, bam bam2) {
        String string;
        Object object;
        block8: {
            jse.e(context, "context");
            jse.e(bam2, "configuration");
            if (Build.VERSION.SDK_INT >= 28) {
                object = fs$$ExternalSyntheticApiModelOutline0.m();
                jse.d(object, "getProcessName()");
            } else {
                block7: {
                    string = null;
                    try {
                        object = Class.forName("android.app.ActivityThread", false, bbx.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                        ((Method)object).setAccessible(true);
                        object = ((Method)object).invoke(null, null);
                        jse.b(object);
                        if (!(object instanceof String)) break block7;
                        object = (String)object;
                        break block8;
                    }
                    catch (Throwable throwable) {
                        bbi.a();
                    }
                }
                int n2 = Process.myPid();
                object = context.getSystemService("activity");
                jse.c(object, "null cannot be cast to non-null type android.app.ActivityManager");
                Object object2 = ((ActivityManager)object).getRunningAppProcesses();
                object = string;
                if (object2 != null) {
                    block9: {
                        object2 = object2.iterator();
                        while (object2.hasNext()) {
                            object = object2.next();
                            if (((ActivityManager.RunningAppProcessInfo)object).pid != n2) continue;
                            break block9;
                        }
                        object = null;
                    }
                    object2 = (ActivityManager.RunningAppProcessInfo)object;
                    object = string;
                    if (object2 != null) {
                        object = ((ActivityManager.RunningAppProcessInfo)object2).processName;
                    }
                }
            }
        }
        string = bam2.i;
        boolean bl2 = string != null && string.length() != 0 ? jse.i(object, bam2.i) : jse.i(object, context.getApplicationInfo().processName);
        return bl2;
    }
}

