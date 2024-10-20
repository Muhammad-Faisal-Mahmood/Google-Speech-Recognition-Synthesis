/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.os.Process
 *  android.os.UserManager
 *  android.util.Log
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.android.libraries.directboot.DirectBootHelperService;

public final class crt {
    public static final int a = 0;
    private static UserManager b;
    private static volatile boolean c = false;
    private static boolean d = false;

    private crt() {
    }

    public static Context a(Context context) {
        if (ag$$ExternalSyntheticApiModelOutline1.m(context)) {
            return context;
        }
        return ag$$ExternalSyntheticApiModelOutline1.m(context);
    }

    public static hpn b(Context context, Runnable runnable) {
        if (crt.e(context)) {
            runnable.run();
            return hpj.a;
        }
        return kl.o(new bpt(context, runnable, 3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c() {
        synchronized (crt.class) {
            d = true;
            return;
        }
    }

    public static boolean d(Context context) {
        return !crt.f(context);
    }

    public static boolean e(Context context) {
        return crt.f(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean f(Context context) {
        if (c) {
            return true;
        }
        synchronized (crt.class) {
            boolean bl2;
            block7: {
                block8: {
                    boolean bl3;
                    if (c) {
                        return true;
                    }
                    if (!d) break block8;
                    Object object = new Intent();
                    object = object.setClassName(context, DirectBootHelperService.class.getName());
                    object = context.getPackageManager().queryIntentServices((Intent)object, 0x10000200);
                    bl2 = bl3 = false;
                    if (object == null) break block7;
                    bl2 = bl3;
                    if (!object.isEmpty()) {
                        object = object.iterator();
                        while (object.hasNext()) {
                            if (!ag$$ExternalSyntheticApiModelOutline1.m(((ResolveInfo)object.next()).serviceInfo)) continue;
                            Log.w((String)"DirectBootUtils", (String)"Falling back to user manager.");
                            d = false;
                            bl2 = crt.g(context);
                            break block7;
                        }
                        bl2 = true;
                    }
                    break block7;
                }
                bl2 = crt.g(context);
            }
            if (bl2) {
                c = true;
            }
            return bl2;
        }
    }

    private static boolean g(Context context) {
        boolean bl2;
        block7: {
            boolean bl3 = true;
            for (int i2 = 1; i2 <= 2; ++i2) {
                UserManager userManager;
                if (b == null) {
                    b = (UserManager)context.getSystemService(UserManager.class);
                }
                if ((userManager = b) == null) {
                    return true;
                }
                bl2 = bl3;
                try {
                    if (!ag$$ExternalSyntheticApiModelOutline1.m(userManager)) {
                        bl2 = userManager.isUserRunning(Process.myUserHandle());
                        if (bl2) break;
                        bl2 = bl3;
                    }
                    break block7;
                }
                catch (NullPointerException nullPointerException) {
                    Log.w((String)"DirectBootUtils", (String)"Failed to check if user is unlocked.", (Throwable)nullPointerException);
                    b = null;
                    continue;
                }
            }
            bl2 = false;
        }
        if (bl2) {
            b = null;
        }
        return bl2;
    }
}

