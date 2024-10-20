/*
 * Decompiled with CFR 0.152.
 */
public final class exy
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exy(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/speech/suppressed_soda_asr_logs", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 19: {
                Object object = new fsw("entry_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/speech/non_assistant_voice_match_settings_entry", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsw fsw2 = new fsw("type", String.class);
                Object object = new fsw("gearhead_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/pre_dodgeboost_counter", new fsw[]{fsw2, object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("feature_action", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/settings/structure_settings_load", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                Object object = new fsw("successful_scheduling", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/settings/productivity/on_device_multi_account_configuration_reload", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("trigger_handled", Boolean.class);
                fsw fsw3 = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/routines/lbt_routine_geofence_trigger_count", new fsw[]{object, fsw3});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/auto_tng/load_news", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 13: {
                Object object = new fsw("executed", Boolean.class);
                fsw fsw4 = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/routines/lbt_routine_execution_count", new fsw[]{object, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsw fsw5 = new fsw("source_language", String.class);
                Object object = new fsw("target_language", String.class);
                fsw fsw6 = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/read/read_it_on_device_translate_status_count", new fsw[]{fsw5, object, fsw6});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                Object object = new fsw("app_package", String.class);
                fsw fsw7 = new fsw("status", String.class);
                fsw fsw8 = new fsw("trigger", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/read/read_it_on_device_status_count", new fsw[]{object, fsw7, fsw8});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/performer/media/tng_reeve_request_count", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 9: {
                fsx fsx5 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/performer/media/classic_reeve_request_count", new fsw[0]);
                fsx5.c();
                return fsx5;
            }
            case 8: {
                Object object = new fsw("triggered", Boolean.class);
                fsw fsw9 = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/wuwa_routine_execution_count", new fsw[]{object, fsw9});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsw fsw10 = new fsw("app_version", String.class);
                fsw fsw11 = new fsw("locale", String.class);
                Object object = new fsw("is_server_response", Boolean.class);
                fsw fsw12 = new fsw("has_client_suppression_support", Boolean.class);
                fsw fsw13 = new fsw("exp_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/unintended_escape_hatch_click_count", new fsw[]{fsw10, fsw11, object, fsw12, fsw13});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/notification_error_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                fsx fsx6 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/tcr_uploaded", new fsw[0]);
                fsx6.c();
                return fsx6;
            }
            case 4: {
                Object object = new fsw("cache_size", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/tcr_cache_size", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("outcome", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/account_switch", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsx fsx7 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/suggestions_non_colored_chip_counter", new fsw[0]);
                fsx7.c();
                return fsx7;
            }
            case 1: {
                fsx fsx8 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/suggestions_colored_chip_counter", new fsw[0]);
                fsx8.c();
                return fsx8;
            }
            case 0: 
        }
        fsx fsx9 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/suggestions_debug_impressions", new fsw[0]);
        fsx9.c();
        return fsx9;
    }
}

