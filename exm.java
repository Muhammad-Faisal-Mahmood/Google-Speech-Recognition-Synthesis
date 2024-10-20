/*
 * Decompiled with CFR 0.152.
 */
public final class exm
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exm(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("status", String.class);
                Object object = new fsw("producer_status", String.class);
                fsw fsw3 = new fsw("is_tng", Boolean.class);
                fsw fsw4 = new fsw("device_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/recommendation_status_counter", new fsw[]{fsw2, object, fsw3, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/recommendation_icon_loading_error_counter", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 18: {
                Object object = new fsw("icon_duplicates", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/recommendation_icon_duplicate_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("is_quota_reached", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/reach_media_push_quota_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/headphone/persistent_media_recommendation_card_send_out_interval", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 15: {
                Object object = new fsw("android_version", Integer.class);
                fsw fsw5 = new fsw("source", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/appactions/clock_inventory_data_fetch_count", new fsw[]{object, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("is_habits_unfiltered_apps_present", Boolean.class);
                fsw fsw6 = new fsw("is_on_device_unfiltered_apps_present", Boolean.class);
                fsw fsw7 = new fsw("is_habits_profile_present", Boolean.class);
                fsw fsw8 = new fsw("is_on_device_profile_present", Boolean.class);
                fsw fsw9 = new fsw("is_top_app_same_in_habits", Boolean.class);
                fsw fsw10 = new fsw("is_top_supported_app_same_in_habits", Boolean.class);
                fsw fsw11 = new fsw("is_device_model_v1", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/on_device_model_requested", new fsw[]{object, fsw6, fsw7, fsw8, fsw9, fsw10, fsw11});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsw fsw12 = new fsw("is_v1_model_generation_enabled", Boolean.class);
                fsw fsw13 = new fsw("is_usage_stats_mgr_present", Boolean.class);
                fsw fsw14 = new fsw("is_pr_bit_and_waa_enabled", Boolean.class);
                fsw fsw15 = new fsw("has_headphone_connections", Boolean.class);
                Object object = new fsw("has_app_events", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/on_device_model_generation_conditions", new fsw[]{fsw12, fsw13, fsw14, fsw15, object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                Object object = new fsw("app_position", String.class);
                fsw fsw16 = new fsw("device_type", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/headphone/on_device_app_suggestion_scores", new fsw[]{object, fsw16});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/account_id/missing_in_intent_extra_and_data", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 10: {
                fsu fsu3 = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/headphone/model_generation_interval", new fsw[0]);
                fsu3.c();
                return fsu3;
            }
            case 9: {
                Object object = new fsw("is_user_unlocked", Boolean.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/headphone/media_session_age", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                Object object = new fsw("app_package", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/headphone/media_local_cache_refresh_interval", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsw fsw17 = new fsw("connection_detected", Boolean.class);
                Object object = new fsw("successfully_logged", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/logging_connection", new fsw[]{fsw17, object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("is_cache_available", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/local_cache_availability_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("last_triggering_source", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/headphone/headphone_disconnection_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("last_triggering_source", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/headphone/connection_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/default_request_counter", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 2: {
                fsw fsw18 = new fsw("android_version", Integer.class);
                Object object = new fsw("source", String.class);
                fsw fsw19 = new fsw("entity_type", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/appactions/clock_context_conversion_latency", new fsw[]{fsw18, object, fsw19});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("outcome", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/garbage_collection/finished_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        fsw fsw20 = new fsw("is_device_locked", Boolean.class);
        fsw fsw21 = new fsw("has_active_media_session", Boolean.class);
        Object object = new fsw("is_launcher_on_foreground", Boolean.class);
        fsw fsw22 = new fsw("is_music_active", Boolean.class);
        fsw fsw23 = new fsw("is_phone_call_ongoing", Boolean.class);
        fsw fsw24 = new fsw("headset_type", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/connect_counter", new fsw[]{fsw20, fsw21, object, fsw22, fsw23, fsw24});
        ((fsz)object).c();
        return object;
    }
}

