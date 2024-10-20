/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;
import java.util.HashMap;

public final class elp {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/core/timeout/impl/TimeoutTrackerImpl");
    public final Object b;
    public final HashMap c;
    private final jvb d;

    public elp(jvb jvb2) {
        jse.e(jvb2, "lightweightScope");
        this.d = jvb2;
        this.b = new Object();
        this.c = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String object) {
        ((heg)a.f().h(hfo.a, "ALT.TimeoutTracker").j("com/google/android/libraries/search/audio/core/timeout/impl/TimeoutTrackerImpl", "cancelTimeout", 44, "TimeoutTrackerImpl.kt")).u("#audio# cancel timeout(token(%s))", object);
        Object object2 = this.b;
        synchronized (object2) {
            object = (jwi)this.c.remove(object);
            if (object != null) {
                jvf.j((jwi)object);
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String object, Duration duration, elo elo2) {
        void var2_2;
        jse.e(var2_2, "duration");
        ((heg)a.f().h(hfo.a, "ALT.TimeoutTracker").j("com/google/android/libraries/search/audio/core/timeout/impl/TimeoutTrackerImpl", "scheduleTimeout", 35, "TimeoutTrackerImpl.kt")).C("#audio# schedule timeout(token(%s), duration(%s))", object, var2_2);
        Object object2 = this.b;
        synchronized (object2) {
            void var3_3;
            HashMap hashMap = this.c;
            jvb jvb2 = this.d;
            ewe ewe2 = new ewe((Duration)var2_2, (String)object, (elo)var3_3, this, null, 1);
            object = hashMap.put(object, jse.ah(jvb2, null, null, ewe2, 3));
            if (object != null) {
                jvf.j((jwi)object);
            }
            return;
        }
    }
}

