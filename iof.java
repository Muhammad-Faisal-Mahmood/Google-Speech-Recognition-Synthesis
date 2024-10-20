/*
 * Decompiled with CFR 0.152.
 */
public final class iof
implements ioe {
    public static final dul a;
    public static final dul b;
    public static final dul c;
    public static final dul d;

    static {
        duj duj2 = new duj(dtx.a("com.google.android.gms.icing.mdd")).b().a();
        duj2.c("PeriodicTaskFlags__cellular_charging_gcm_task_cadence", 5L);
        duj2.d("PeriodicTaskFlags__cellular_charging_gcm_task_enabled", true);
        a = duj2.c("cellular_charging_gcm_task_period", 21600L);
        duj2.c("PeriodicTaskFlags__charging_gcm_task_cadence", 5L);
        duj2.d("PeriodicTaskFlags__charging_gcm_task_enabled", true);
        b = duj2.c("charging_gcm_task_period", 21600L);
        duj2.c("PeriodicTaskFlags__maintenance_gcm_task_cadence", 0L);
        duj2.d("PeriodicTaskFlags__maintenance_gcm_task_enabled", true);
        c = duj2.c("maintenance_gcm_task_period", 86400L);
        duj2.c("PeriodicTaskFlags__wifi_charging_gcm_task_cadence", 5L);
        duj2.d("PeriodicTaskFlags__wifi_charging_gcm_task_enabled", true);
        d = duj2.c("wifi_charging_gcm_task_period", 21600L);
    }

    @Override
    public final long a() {
        return (Long)a.b();
    }

    @Override
    public final long b() {
        return (Long)b.b();
    }

    @Override
    public final long c() {
        return (Long)c.b();
    }

    @Override
    public final long d() {
        return (Long)d.b();
    }
}

