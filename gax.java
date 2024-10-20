/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  hom
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class gax {
    public static final hei a = hei.m("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final Context b;
    public final hpq c;
    public final hpr d;
    public final Map e;
    public final Map f;
    private final PowerManager g;
    private final hpr h;
    private boolean i;
    private final dtu j;

    public gax(Context context, PowerManager powerManager, hpq hpq2, Map map, Map map2, hpr hpr2, hpr hpr3, dtu dtu2) {
        fvd.ap(new eyd(this, 3));
        fvd.ap(new eyd(this, 4));
        this.i = false;
        this.b = context;
        this.g = powerManager;
        this.c = hpq2;
        this.d = hpr2;
        this.h = hpr3;
        this.e = map;
        this.f = map2;
        this.j = dtu2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void b(hpn hpn2, String string, Object[] objectArray) {
        try {
            hhk.S(hpn2);
            return;
        }
        catch (ExecutionException executionException) {
            ((heg)((heg)((heg)a.g()).i(executionException.getCause())).j("com/google/apps/tiktok/concurrent/AndroidFutures", "logOnFailure", 407, "AndroidFutures.java")).L(string, objectArray);
            return;
        }
        catch (CancellationException cancellationException) {
            return;
        }
    }

    public static void c(hpn hpn2, String string, Object ... objectArray) {
        hpn2.c(gqk.i(new fbx(hpn2, string, objectArray, 5, null)), (Executor)hom.a);
    }

    public final String a() {
        dtu dtu2 = this.j;
        String string = dww.a(this.b);
        string = dtu2.b() ? "main_process_service_key" : string.substring(string.lastIndexOf(":") + 1);
        return string;
    }

    public final void d(hpn object) {
        block7: {
            Object object2 = gno.b();
            object2 = object2 == null ? "<no trace>" : gno.j((gpc)object2);
            if (!object.isDone()) {
                try {
                    PowerManager.WakeLock wakeLock = this.g.newWakeLock(1, (String)object2);
                    wakeLock.acquire();
                    Object object3 = TimeUnit.SECONDS;
                    object3 = gqq.a(hhk.L((hpn)object), 45L, object3, this.d);
                    fgl fgl2 = new fgl(object2, 3);
                    hhk.T((hpn)object3, gqk.g(fgl2), (Executor)hom.a);
                    object2 = hhk.R(hhk.L((hpn)object), 3600L, TimeUnit.SECONDS, this.h);
                    Objects.requireNonNull(wakeLock);
                    object = new ffd(wakeLock, 12);
                    object2.c((Runnable)object, (Executor)hom.a);
                    return;
                }
                catch (SecurityException securityException) {
                    block8: {
                        if (this.i) break block7;
                        object2 = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 4096);
                        if (((PackageInfo)object2).requestedPermissions == null) break block8;
                        object2 = ((PackageInfo)object2).requestedPermissions;
                        int n2 = ((String[])object2).length;
                        for (int i2 = 0; i2 < n2; ++i2) {
                            try {
                                if (!"android.permission.WAKE_LOCK".equals(object2[i2])) continue;
                                this.i = true;
                                a.as(a.g(), "Failed to acquire wakelock", "com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", '\u00a6', "AndroidFutures.java", securityException);
                                return;
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                securityException.addSuppressed(nameNotFoundException);
                                break;
                            }
                        }
                    }
                    throw securityException;
                }
            }
        }
    }
}

