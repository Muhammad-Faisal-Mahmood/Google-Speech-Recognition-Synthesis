/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  android.os.StrictMode$VmPolicy$Builder
 *  android.os.SystemClock
 *  android.util.Log
 */
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class cgw {
    private static Context a;
    private static Boolean b;

    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return ut$$ExternalSyntheticApiModelOutline0.m(builder);
    }

    public static int b(int n2) {
        if (n2 == -1) {
            return -1;
        }
        return n2 / 1000;
    }

    public static void c(Context context) {
        try {
            kl.at(context);
            return;
        }
        catch (Exception exception) {
            Log.e((String)"CrashUtils", (String)"Error adding exception to DropBox!", (Throwable)exception);
            return;
        }
    }

    public static boolean d(int[] nArray, int n2) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (nArray[i2] != n2) continue;
            return true;
        }
        return false;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Deprecated
    public static String f() {
        long l2 = System.currentTimeMillis();
        long l3 = Math.abs(new SecureRandom().nextLong());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l2);
        stringBuilder.append("-");
        stringBuilder.append(l3);
        return stringBuilder.toString();
    }

    public static final chj g(Context context, String string, chi chi2) {
        int n2;
        chj chj2;
        block3: {
            int n3;
            int n4;
            block2: {
                int n5;
                block1: {
                    chj2 = new chj();
                    chj2.a = n4 = chi2.a(context, string);
                    n2 = 1;
                    n3 = 0;
                    chj2.b = n4 != 0 ? (n4 = chi2.b(context, string, false)) : (n4 = chi2.b(context, string, true));
                    n5 = chj2.a;
                    if (n5 != 0) break block1;
                    if (n4 != 0) break block2;
                    n2 = 0;
                    break block3;
                }
                n3 = n5;
            }
            if (n3 >= n4) {
                n2 = -1;
            }
        }
        chj2.c = n2;
        return chj2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean h(Context context) {
        synchronized (cgw.class) {
            Boolean bl2;
            context = context.getApplicationContext();
            Object object = a;
            if (object != null && (bl2 = b) != null && object == context) {
                return bl2;
            }
            b = null;
            object = ag$$ExternalSyntheticApiModelOutline0.m(context.getPackageManager());
            b = object;
            a = context;
            return (Boolean)object;
        }
    }

    public static final StrictMode.ThreadPolicy i() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static hpr j(hpr hpr2) {
        return new cos(new cpd(new hpz(hpr2), hpr2), hpr2);
    }

    public static ExecutorService k(cqx object, cpu cpu2, ThreadFactory object2, cqz object3, cpz cpz2) {
        gto gto2 = !cpu2.a.g() ? gsl.a : gto.i(new cpt((ThreadFactory)object2));
        if (gto2.g()) {
            object2 = gto2.c();
        }
        ThreadFactory threadFactory = object2;
        if (((cqx)object).c) {
            threadFactory = new crb((ThreadFactory)object2, (cqz)object3);
        }
        object = new hjt(((cqx)object).b, threadFactory, new cmw(object3, 3), new cmw(object3, 4));
        if (gto2.g()) {
            object3 = gto2.c();
            Objects.requireNonNull(object);
            object2 = new AmbientModeSupport$AmbientController(object, null);
            return new cpr((cpv)((Object)cpu2.a.c()), cpz2, cpu2.b, cpu2.c, (cpt)object3, (ExecutorService)object, (AmbientModeSupport$AmbientController)object2);
        }
        return object;
    }

    public static ThreadFactory l(String string, ThreadFactory threadFactory) {
        ivg ivg2 = new ivg(null);
        ivg2.g();
        ivg2.h(string.concat(" Thread #%d"));
        ivg2.c = threadFactory;
        return ivg.i(ivg2);
    }

    public static /* synthetic */ hpr m(jnu jnu2, gto gto2) {
        if (gto2.g()) {
            return (hpr)gto2.c();
        }
        return (hpr)jnu2.b();
    }

    public static cqz n(cxt object, cqx cqx2) {
        object = cqx2.c ? ((cxt)object).b(cqx2) : cqz.a;
        return object;
    }

    public static final long o() {
        long l2 = cnz.a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000L;
        return l2;
    }

    public static final Instant p() {
        return Instant.now().truncatedTo(ChronoUnit.MILLIS);
    }

    public static final Duration q() {
        return Duration.ofMillis(SystemClock.uptimeMillis());
    }

    public static ckz r(Object object) {
        cld cld2 = new cld();
        cld2.l(object);
        return cld2;
    }
}

