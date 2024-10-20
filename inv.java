/*
 * Decompiled with CFR 0.152.
 */
public final class inv
implements inu {
    public static final dul a;
    public static final dul b;
    public static final dul c;
    public static final dul d;
    public static final dul e;
    public static final dul f;
    public static final dul g;
    public static final dul h;

    static {
        duj duj2 = new duj(dtx.a("com.google.android.gms.icing.mdd")).b().a();
        a = duj2.c("abs_free_space_after_download", 524288000L);
        b = duj2.c("abs_free_space_after_download_extremely_low_storage_allowed", 0x200000L);
        c = duj2.c("abs_free_space_after_download_low_storage_allowed", 0x6400000L);
        d = duj2.d("downloader_enforce_https", true);
        e = duj2.c("downloader_max_retry_on_checksum_mismatch_count", 5L);
        f = duj2.c("downloader_max_threads", 2L);
        g = duj2.d("enforce_low_storage_behavior", true);
        h = new duf(duj2, 0.1);
        duj2.c("time_to_wait_for_downloader", 120000L);
    }

    @Override
    public final double a() {
        return (Double)h.b();
    }

    @Override
    public final long b() {
        return (Long)a.b();
    }

    @Override
    public final long c() {
        return (Long)b.b();
    }

    @Override
    public final long d() {
        return (Long)c.b();
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
    public final boolean g() {
        return (Boolean)d.b();
    }

    @Override
    public final boolean h() {
        return (Boolean)g.b();
    }
}

