/*
 * Decompiled with CFR 0.152.
 */
public final class ioc
implements iob {
    public static final dul a;
    public static final dul b;
    public static final dul c;
    public static final dul d;
    public static final dul e;
    public static final dul f;
    public static final dul g;

    static {
        duj duj2 = new duj(dtx.a("com.google.android.gms.icing.mdd")).b().a();
        a = duj2.c("api_logging_sample_interval", 100L);
        duj2.c("cleanup_log_logging_sample_interval", 1000L);
        b = duj2.c("group_stats_logging_sample_interval", 100L);
        c = duj2.c("mdd_android_sharing_sample_interval", 100L);
        d = duj2.c("mdd_default_sample_interval", 100L);
        duj2.c("mdd_download_events_sample_interval", 1L);
        duj2.c("mobstore_file_service_stats_sample_interval", 100L);
        e = duj2.c("network_stats_logging_sample_interval", 100L);
        f = duj2.c("pds_migration_compare_results_sample_interval", 10000L);
        duj2.c("silent_feedback_sample_interval", 100L);
        g = duj2.c("storage_stats_logging_sample_interval", 100L);
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

    @Override
    public final long e() {
        return (Long)e.b();
    }

    @Override
    public final long f() {
        return (Long)f.b();
    }

    @Override
    public final long g() {
        return (Long)g.b();
    }
}

