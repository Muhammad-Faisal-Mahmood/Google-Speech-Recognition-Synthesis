/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.BadParcelableException
 *  android.util.Log
 *  gqv
 */
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.util.Log;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

public final class gqk {
    public static long a = (long)Math.abs(new Random().nextInt()) << 30;
    public static final HashMap b = new HashMap();
    public static final Object c = new Object();
    public static gpf d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final gqe a(Intent intent, gqv object) {
        long l2;
        gpc gpc2;
        jse.e(gpc2, "restricted");
        gpc2 = gno.d();
        Object object2 = gno.b();
        if (object2 != null) {
            gop gop2 = gmw.a;
            if (!object2.j(gmw.b).b()) {
                synchronized (object2) {
                    if (!object2.j(gmw.b).b()) {
                        object2.q(gmw.b, true);
                    }
                }
            }
        }
        object2 = b;
        synchronized (object2) {
            l2 = a;
            a = 1L + l2;
            gpc2 = ((HashMap)object2).put(l2, gpc2);
        }
        intent.putExtra("tracing_intent_id", l2);
        return new gqe(l2);
    }

    public static final gte b(gte gte2) {
        return new gqi(gno.d(), gte2);
    }

    public static final hnx c(hnx hnx2) {
        return new gqg(gno.d(), (Object)hnx2, 0);
    }

    public static final hny d(hny hny2) {
        return new hoa(gno.d(), hny2, 1);
    }

    public static final hoc e(hoc hoc2) {
        return new gqd(gno.d(), hoc2);
    }

    public static final hoe f(hoe hoe2) {
        return new gqc(gno.d(), hoe2);
    }

    public static final hpb g(hpb hpb2) {
        return new gqj(gno.d(), hpb2);
    }

    public static final Runnable h(Runnable runnable) {
        jse.e(runnable, "runnable");
        return new ffe(gqk.p(), runnable, 18);
    }

    public static final Runnable i(Runnable runnable) {
        jse.e(runnable, "runnable");
        gpc gpc2 = gno.d();
        jsj jsj2 = new jsj();
        if (gna.a == 1) {
            int n2 = grc.a;
        }
        return new iyk(jsj2, gpc2, runnable, 1);
    }

    public static final Callable j(Callable callable) {
        return new gqh(gno.d(), callable, 1);
    }

    public static final Callable k(Callable callable) {
        jse.e(callable, "callable");
        return new gqh(gqk.p(), callable, 0);
    }

    public static final void l(Intent object) {
        jse.e(object, "intent");
        if (gos.a != gor.a && !object.hasExtra("tracing_intent_id")) {
            object = new IllegalStateException("Was supposed to propagate trace for startActivity - did you forget to propagate it? See http://go/tiktok-conformance-violations/TRACE_PROPAGATION_FOR_START_ACTIVITY for more details.");
            if (gos.a == gor.c) {
                Log.e((String)"TracePropagation", (String)"Unpropagated Trace for startActivity", (Throwable)object);
                return;
            }
            throw object;
        }
    }

    public static final void m(Context context, Intent object) {
        jse.e(context, "context");
        jse.e(object, "intent");
        Intent intent = new Intent(object);
        object = gqk.a(intent, gqv.a);
        try {
            context.startActivity(intent);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                jsd.f((Closeable)object, throwable);
                throw throwable2;
            }
        }
        jsd.f((Closeable)object, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final gpc n(Intent object, boolean bl2) {
        try {
            void var1_2;
            if (!object.hasExtra("tracing_intent_id")) return null;
            long l2 = object.getLongExtra("tracing_intent_id", -1L);
            HashMap hashMap = b;
            // MONITORENTER : hashMap
            object = var1_2 != false ? hashMap.remove(l2) : hashMap.get(l2);
        }
        catch (BadParcelableException badParcelableException) {
            return null;
        }
        object = (gpc)object;
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean o() {
        boolean bl2;
        goz goz2 = gno.a();
        boolean bl3 = gno.b;
        boolean bl4 = bl2 = false;
        if (bl3) return bl4;
        if (goz2.c != null) return true;
        if (goz2.d != null) return true;
        return bl2;
    }

    private static final gpc p() {
        goz goz2 = gno.a();
        gpc gpc2 = goz2.c;
        if (gpc2 != null || (gpc2 = goz2.d) != null) {
            return gpc2;
        }
        throw new IllegalStateException("This is not reachable if guarded by shouldPropagateExecutorTrace.");
    }
}

