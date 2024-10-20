/*
 * Decompiled with CFR 0.152.
 */
public final class inz
implements inx {
    public static final dul a;
    public static final dul b;
    public static final dul c;
    public static final dul d;
    public static final dul e;
    public static final dul f;
    public static final dul g;
    public static final dul h;
    public static final dul i;
    public static final dul j;
    public static final dul k;
    public static final dul l;
    public static final dul m;
    public static final dul n;
    public static final dul o;
    public static final dul p;
    public static final dul q;
    public static final dul r;
    public static final dul s;
    public static final dul t;
    public static final dul u;
    public static final dul v;

    static {
        duj duj2 = new duj(dtx.a("com.google.android.gms.icing.mdd")).b().a();
        duj2.d("gms_icing_mdd_add_configs_from_phenotype", true);
        duj2.d("broadcast_newly_downloaded_groups", true);
        new duh(duj2, "build_id_overrides", new iny(1));
        duj2.d("gms_icing_mdd_cache_last_location", true);
        duj2.d("clear_state_on_mdd_disabled", false);
        a = duj2.d("delete_file_groups_with_files_missing", true);
        b = duj2.d("disable_phenotype_namespace_migration_and_cleanup", false);
        duj2.d("gms_mdd_download_first_on_wifi_then_on_any_network", true);
        duj2.d("gms_mdd_dump_mdd_info", false);
        duj2.d("enable_android_file_sharing", true);
        duj2.d("enable_android_file_sharing_data_clean_up", true);
        duj2.d("enable_android_sharing_daily_maintenance", false);
        duj2.d("enable_client_error_logging", false);
        c = duj2.d("enable_compressed_file", true);
        d = duj2.d("enable_days_since_last_maintenance_tracking", true);
        duj2.d("gms_mdd_enable_debug_ui", false);
        e = duj2.d("enable_delayed_download", true);
        duj2.d("enable_delta_download", true);
        f = duj2.d("enable_download_stage_experiment_id_propagation", true);
        g = duj2.d("enable_file_download_dedup_by_file_key", false);
        duj2.d("enable_gdd_batch_sync", false);
        duj2.d("enable_gdd_zwieback_id_propagation", false);
        h = duj2.d("enable_isolated_structure_verification", true);
        duj2.d("gms_mdd_enable_mdd_gcm_service", true);
        i = duj2.d("enable_mdd_multi_variant_handling", false);
        duj2.d("enable_mobile_data_download", true);
        duj2.d("enable_mobstore_file_service", true);
        duj2.d("enable_mobstore_file_service_rename", true);
        duj2.d("enable_mobstore_file_service_whitelist", true);
        j = duj2.d("enable_rng_based_device_stable_sampling", true);
        duj2.d("enable_set_runtime_properties", true);
        k = duj2.d("enable_sideloading", true);
        duj2.d("gms_mdd_enable_silent_feedback", true);
        l = duj2.d("enable_zip_folder", true);
        m = duj2.c("FeatureFlags__file_key_version", 2L);
        duj2.d("gcm_reschedule_only_once_per_process_start", true);
        duj2.d("gms_mdd_switch_to_cronet", false);
        duj2.c("gms_icing_mdd_location_s2_level", 10L);
        duj2.c("gms_icing_mdd_task_await_time", 5L);
        n = duj2.d("log_file_groups_with_files_missing", true);
        o = duj2.d("log_network_stats", true);
        duj2.d("gms_mdd_log_storage_stats", true);
        p = duj2.d("gms_icing_mdd_delete_groups_removed_accounts", false);
        q = duj2.d("gms_icing_mdd_delete_uninstalled_apps", true);
        r = duj2.d("gms_icing_mdd_enable_download_pending_groups", true);
        s = duj2.d("gms_icing_mdd_enable_garbage_collection", true);
        t = duj2.d("gms_icing_mdd_enable_verify_pending_groups", true);
        u = duj2.c("gms_icing_mdd_reset_trigger", 0L);
        duj2.d("migrate_file_expiration_policy", true);
        duj2.d("migrate_to_new_file_key", true);
        v = new duh(duj2, "FeatureFlags__pds_migration_state", new iny(0));
        duj2.d("remove_groupkeys_with_downloaded_field_not_set", true);
        duj2.d("test_only_file_key_version", false);
    }

    @Override
    public final long a() {
        return (Long)m.b();
    }

    @Override
    public final long b() {
        return (Long)u.b();
    }

    @Override
    public final ctd c() {
        return (ctd)v.b();
    }

    @Override
    public final boolean d() {
        return (Boolean)a.b();
    }

    @Override
    public final boolean e() {
        return (Boolean)b.b();
    }

    @Override
    public final boolean f() {
        return (Boolean)c.b();
    }

    @Override
    public final boolean g() {
        return (Boolean)d.b();
    }

    @Override
    public final boolean h() {
        return (Boolean)e.b();
    }

    @Override
    public final boolean i() {
        return (Boolean)f.b();
    }

    @Override
    public final boolean j() {
        return (Boolean)g.b();
    }

    @Override
    public final boolean k() {
        return (Boolean)h.b();
    }

    @Override
    public final boolean l() {
        return (Boolean)i.b();
    }

    @Override
    public final boolean m() {
        return (Boolean)j.b();
    }

    @Override
    public final boolean n() {
        return (Boolean)k.b();
    }

    @Override
    public final boolean o() {
        return (Boolean)l.b();
    }

    @Override
    public final boolean p() {
        return (Boolean)n.b();
    }

    @Override
    public final boolean q() {
        return (Boolean)o.b();
    }

    @Override
    public final boolean r() {
        return (Boolean)p.b();
    }

    @Override
    public final boolean s() {
        return (Boolean)q.b();
    }

    @Override
    public final boolean t() {
        return (Boolean)r.b();
    }

    @Override
    public final boolean u() {
        return (Boolean)s.b();
    }

    @Override
    public final boolean v() {
        return (Boolean)t.b();
    }
}

