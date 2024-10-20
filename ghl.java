/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class ghl {
    public static final gpm j;
    public final Context a;
    public final ExecutorService b;
    public final ScheduledExecutorService c;
    public final int d;
    public final Map e;
    public final hei f;
    public final boolean g;
    public final Map h;
    public final dtu i;
    private final Map k;
    private final iku l;

    static {
        fsn fsn2 = new fsn();
        fsn2.a("CREATE TABLE ListenerSuccessfulRuns (listener_key, version_code INTEGER NOT NULL);");
        fsn2.a("CREATE TABLE AllListenersSucceededVersionTable (version_code INTEGER PRIMARY KEY ON CONFLICT REPLACE);");
        if (fsn2.d == null) {
            fsn2.d = new hti();
        }
        gto gto2 = fsn2.c;
        gzs gzs2 = fsn2.a;
        gzs gzs3 = fsn2.b;
        j = new gpm(gto2, gzs2.g(), gzs3.g(), fsn2.d);
    }

    public ghl(Context object, dtu dtu2, gto gto2, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, int n2, Map map, Map map2, iku iku2) {
        jse.e(gto2, "enableMultiprocessSupportInThisProcess");
        jse.e(executorService, "lightweightExecutor");
        jse.e(scheduledExecutorService, "backgroundExecutor");
        jse.e(map, "mainProcessOnlyListeners");
        jse.e(map2, "allProcessesListeners");
        jse.e(iku2, "lazyDatabase");
        this.a = object;
        this.i = dtu2;
        this.b = executorService;
        this.c = scheduledExecutorService;
        this.d = n2;
        this.k = map;
        this.e = map2;
        this.l = iku2;
        if (jns.v(map.keySet(), map2.keySet()).isEmpty()) {
            this.f = hei.m("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner");
            this.g = (Boolean)gto2.e(false);
            object = map2;
            if (dtu2.b()) {
                object = jjj.I(map, map2);
            }
            this.h = object;
            return;
        }
        object = jns.v(map.keySet(), map2.keySet());
        Objects.toString(object);
        throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(object.toString()));
    }

    public final bzq a() {
        return (bzq)this.l.b();
    }
}

