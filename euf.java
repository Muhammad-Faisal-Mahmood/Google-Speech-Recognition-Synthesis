/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Process
 */
import android.content.Context;
import android.os.Build;
import android.os.Process;

public final class euf {
    public static volatile iyc a;
    private static volatile ixb b;
    private static volatile ixb c;
    private static volatile ixb d;
    private static volatile ixb e;
    private static volatile ixb f;
    private static volatile ixb g;
    private static volatile ixb h;
    private static volatile ixb i;
    private static volatile ixb j;
    private static volatile ixb k;
    private static volatile ixb l;

    public static final /* synthetic */ bzo A(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }

    public static final /* synthetic */ bzo B(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb a() {
        Object object;
        Object object2 = object = d;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = d;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.c;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "ActivateAudioRequestClient");
            ((iwy)object2).b();
            object = eam.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object3 = eum.a;
            ((iwy)object2).b = object = new jmi((hyf)object3);
            d = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb b() {
        Object object;
        Object object2 = object = l;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = l;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.c;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "Connect");
            ((iwy)object2).b();
            object = hwh.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object3 = hwh.a;
            ((iwy)object2).b = object = new jmi((hyf)object3);
            l = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb c() {
        Object object;
        Object object2 = object = e;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = e;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.a;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "DeactivateClient");
            ((iwy)object2).b();
            object = eug.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = hwh.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            e = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb d() {
        Object object;
        Object object2 = object = k;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = k;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.c;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "GetAudioRequestReadOnlyListeningSession");
            ((iwy)object2).b();
            object = eat.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = eun.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            k = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb e() {
        Object object;
        Object object2 = object = h;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = h;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.c;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "StartListeningForHotword");
            ((iwy)object2).b();
            object = euh.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = eun.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            h = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb f() {
        Object object;
        Object object2 = object = b;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = b;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.c;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "StartListening");
            ((iwy)object2).b();
            object = euj.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = eun.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            b = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb g() {
        Object object;
        Object object2 = object = i;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = i;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.a;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "StopListeningForHotword");
            ((iwy)object2).b();
            object = edf.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object3 = ecy.a;
            ((iwy)object2).b = object = new jmi((hyf)object3);
            i = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb h() {
        Object object;
        Object object2 = object = j;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = j;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.a;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "StopListeningForSeamlessMode");
            ((iwy)object2).b();
            object = edf.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = eui.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            j = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb i() {
        Object object;
        Object object2 = object = c;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = c;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.a;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "StopListening");
            ((iwy)object2).b();
            object = eul.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = eas.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            c = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb j() {
        Object object;
        Object object2 = object = g;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = g;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.c;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "UpdateHotwordRoute");
            ((iwy)object2).b();
            object = eup.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = euo.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            g = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb k() {
        Object object;
        Object object2 = object = f;
        if (object != null) return object2;
        synchronized (euf.class) {
            object2 = object = f;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.c;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.search.audio.service.AudioService", "UpdateRoute");
            ((iwy)object2).b();
            object = euq.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object3 = euo.a;
            ((iwy)object2).b = object = new jmi((hyf)object3);
            f = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    public static final String l(ebk hwv2) {
        eaz eaz2 = hwv2.c;
        hwv2 = eaz2;
        if (eaz2 == null) {
            hwv2 = eaz.a;
        }
        jse.d(hwv2, "getAudioRouteType(...)");
        return crh.N((eaz)hwv2);
    }

    public static eqb m(etz etz2) {
        return new eqb(etz2.a(), etz2.d(), etz2.f());
    }

    public static final int n(Integer n2) {
        if (n2 != null) {
            return n2;
        }
        return -1;
    }

    public static final String o(eaw hwv2) {
        eaz eaz2 = hwv2.c;
        hwv2 = eaz2;
        if (eaz2 == null) {
            hwv2 = eaz.a;
        }
        jse.d(hwv2, "getAudioRouteType(...)");
        return crh.N((eaz)hwv2);
    }

    public static eqb p(etr etr2) {
        return new eqb(etr2.a(), etr2.d(), etr2.g());
    }

    public static boolean q(Context context) {
        return context.getPackageManager().checkPermission("android.permission.CAPTURE_AUDIO_HOTWORD", context.getPackageName()) == 0;
    }

    public static boolean r(Context context) {
        boolean bl2;
        if (Build.VERSION.SDK_INT < 31) {
            bl2 = euf.s(context, "android.permission.BLUETOOTH");
        } else {
            if (euf.s(context, "android.permission.BLUETOOTH_SCAN") && euf.s(context, "android.permission.BLUETOOTH_CONNECT")) {
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean s(Context context, String string) {
        block3: {
            try {
                int n2 = context.checkPermission(string, Process.myPid(), Process.myUid());
                if (n2 != 0) break block3;
                return true;
            }
            catch (RuntimeException runtimeException) {
                return false;
            }
        }
        return false;
    }

    public static final /* synthetic */ cxt t(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }

    public static final /* synthetic */ bzb u(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static final /* synthetic */ bzb v(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static final /* synthetic */ bzq w(hwr hwr2) {
        jse.e(hwr2, "builder");
        return new bzq((Object)hwr2, null);
    }

    public static final /* synthetic */ cxt x(hwr hwr2) {
        jse.e(hwr2, "builder");
        return new cxt(hwr2);
    }

    public static final /* synthetic */ bzq y(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzq((Object)hwp2, null);
    }

    public static final /* synthetic */ cxt z(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }
}

