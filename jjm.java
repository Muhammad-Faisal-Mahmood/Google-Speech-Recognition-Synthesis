/*
 * Decompiled with CFR 0.152.
 */
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class jjm {
    private static final jjm c = new jjm();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(jjl jjl2) {
        return c.b(jjl2);
    }

    public static /* bridge */ /* synthetic */ void c(jjm jjm2) {
        jjm2.b = null;
    }

    public static void d(jjl jjl2, Object object) {
        c.e(jjl2, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Object b(jjl object) {
        synchronized (this) {
            jjk jjk2;
            jjk jjk3 = jjk2 = (jjk)this.a.get(object);
            if (jjk2 == null) {
                jjk3 = new jjk(object.a());
                this.a.put(object, jjk3);
            }
            if ((object = jjk3.c) != null) {
                object.cancel(false);
                jjk3.c = null;
            }
            ++jjk3.b;
            return jjk3.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void e(jjl jjl2, Object object) {
        synchronized (this) {
            int n2;
            jjk jjk2 = (jjk)this.a.get(jjl2);
            if (jjk2 == null) {
                object = new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(jjl2))));
                throw object;
            }
            Object object2 = jjk2.a;
            boolean bl2 = true;
            boolean bl3 = object == object2;
            fxf.r(bl3, "Releasing the wrong instance");
            bl3 = jjk2.b > 0;
            fxf.B(bl3, "Refcount has already reached zero");
            jjk2.b = n2 = jjk2.b - 1;
            if (n2 != 0) {
                return;
            }
            bl3 = jjk2.c == null ? bl2 : false;
            fxf.B(bl3, "Destroy task already scheduled");
            if (this.b == null) {
                this.b = Executors.newSingleThreadScheduledExecutor(jeb.k("grpc-shared-destroyer-%d"));
            }
            object2 = this.b;
            ww ww2 = new ww(this, jjk2, jjl2, object, 14);
            jey jey2 = new jey(ww2);
            jjk2.c = object2.schedule(jey2, 1L, TimeUnit.SECONDS);
            return;
        }
    }
}

