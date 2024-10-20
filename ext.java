/*
 * Decompiled with CFR 0.152.
 */
public final class ext
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ ext(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("app_version", String.class);
                fsw fsw3 = new fsw("status", String.class);
                Object object = new fsw("timeout_duration_in_seconds", Integer.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/tng_ma/invocation_handover_latency", new fsw[]{fsw2, fsw3, object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("operation", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/search_placeholder/maybe_recreate/count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsw fsw4 = new fsw("app_version", String.class);
                fsw fsw5 = new fsw("status", String.class);
                Object object = new fsw("timeout_duration_in_seconds", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/invocation_handover_finished", new fsw[]{fsw4, fsw5, object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsw fsw6 = new fsw("app_version", String.class);
                Object object = new fsw("client_type", String.class);
                fsw fsw7 = new fsw("trigger_type", String.class);
                fsw fsw8 = new fsw("invocation_entrypoint", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/tng_ma/invocation_data/l28_distribution", new fsw[]{fsw6, object, fsw7, fsw8});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsw fsw9 = new fsw("app_version", String.class);
                Object object = new fsw("event_type", String.class);
                fsw fsw10 = new fsw("trigger_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/invocation_data/invocation_event_count", new fsw[]{fsw9, object, fsw10});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsw fsw11 = new fsw("app_version", String.class);
                Object object = new fsw("result", Boolean.class);
                fsw fsw12 = new fsw("screen_off_30min", Boolean.class);
                fsw fsw13 = new fsw("charging", Boolean.class);
                fsw fsw14 = new fsw("up_1day", Boolean.class);
                fsw fsw15 = new fsw("no_interaction_last_5min", Boolean.class);
                fsw fsw16 = new fsw("number_of_skipped_windows", Integer.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/experiments/interactor_reap_attempt", new fsw[]{fsw11, object, fsw12, fsw13, fsw14, fsw15, fsw16});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/tng_ma/invocation_data/invocation_data_store_size", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                Object object = new fsw("application_build", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/tng_ma/installed_apps", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                Object object = new fsw("application_build", String.class);
                fsw fsw17 = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/installed_app_recache_reason", new fsw[]{object, fsw17});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsw fsw18 = new fsw("application_build", String.class);
                Object object = new fsw("action", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/installed_app_change_listener_interactor", new fsw[]{fsw18, object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsw fsw19 = new fsw("application_build", String.class);
                Object object = new fsw("package_name", String.class);
                fsw fsw20 = new fsw("action", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/installed_app_cache_for_package", new fsw[]{fsw19, object, fsw20});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                fsw fsw21 = new fsw("app_version", String.class);
                Object object = new fsw("is_timed_out", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/input_translate_chip_prioritize_timeout", new fsw[]{fsw21, object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                fsw fsw22 = new fsw("corpus_name", String.class);
                Object object = new fsw("trigger", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/reconciliation/started_count", new fsw[]{fsw22, object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsw fsw23 = new fsw("app_version", String.class);
                Object object = new fsw("download_start_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/initial_data_download_started", new fsw[]{fsw23, object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                fsw fsw24 = new fsw("app_version", String.class);
                Object object = new fsw("download_finished_status", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/tng_ma/initial_data_download_latency", new fsw[]{fsw24, object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("app_version", String.class);
                fsw fsw25 = new fsw("download_finished_status", String.class);
                fsw fsw26 = new fsw("download_finished_error_code", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/initial_data_download_finished", new fsw[]{object, fsw25, fsw26});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("app_version", String.class);
                fsw fsw27 = new fsw("trigger_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/growth_data/l28_count", new fsw[]{object, fsw27});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/custodio/gateway_handler_deeplink_block_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 2: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/tng_ma/fetch_sbcp_session_token_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/tng_ma/conv_blocker_calculation_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        fsw fsw28 = new fsw("app_version", String.class);
        Object object = new fsw("blocker_name", String.class);
        fsw fsw29 = new fsw("speedbump_state", String.class);
        fsw fsw30 = new fsw("robin_mode_status", String.class);
        fsw fsw31 = new fsw("trigger_type", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/conv_blocker_counter", new fsw[]{fsw28, object, fsw29, fsw30, fsw31});
        ((fsz)object).c();
        return object;
    }
}

