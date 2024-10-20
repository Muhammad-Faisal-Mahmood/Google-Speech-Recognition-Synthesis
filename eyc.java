/*
 * Decompiled with CFR 0.152.
 */
public final class eyc
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ eyc(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("app_version", String.class);
                Object object = new fsw("error_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/podcasts/errors", new fsw[]{fsw2, object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("app_version", String.class);
                fsw fsw3 = new fsw("tng", Boolean.class);
                fsw fsw4 = new fsw("entry_point_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/podcasts/entry_point_count", new fsw[]{object, fsw3, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/podcasts/download_bytes", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("language", String.class);
                fsw fsw5 = new fsw("status", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/pixelsettings/get_suggestions_latency", new fsw[]{object, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                Object object = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/pcp/ttl_triggering_time_range", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsw fsw6 = new fsw("client_type", String.class);
                Object object = new fsw("data_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/pcp/sync_while_charging", new fsw[]{fsw6, object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/pcp/pcp_data_update_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsw fsw7 = new fsw("has_installed_apps", Boolean.class);
                Object object = new fsw("has_habit_apps", Boolean.class);
                fsw fsw8 = new fsw("has_pcp_apps", Boolean.class);
                fsw fsw9 = new fsw("has_same_top_mostly_used_app", Boolean.class);
                fsw fsw10 = new fsw("has_same_top_app", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/pcp/media/aa_media_app_filter_count", new fsw[]{fsw7, object, fsw8, fsw9, fsw10});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                Object object = new fsw("client_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/pcp/get_proactive_content_timeout", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsw fsw11 = new fsw("lang", String.class);
                fsw fsw12 = new fsw("handover", String.class);
                Object object = new fsw("classifier_enabled", Boolean.class);
                fsw fsw13 = new fsw("assistant_handover_enabled", Boolean.class);
                fsw fsw14 = new fsw("from_classifier", Boolean.class);
                fsw fsw15 = new fsw("from_safe_guard", Boolean.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/surfaces/voice_search/handover/latency", new fsw[]{fsw11, fsw12, object, fsw13, fsw14, fsw15});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/pcp/calendar_notification_latency", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 9: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/acetone/launcher_client_hot_word_api_use_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 8: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/pcp/calendar_daily_mismatch", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 7: {
                Object object = new fsw("type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/omni/omni_over_omni", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/omni/availability_app_search_write_failure", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 5: {
                Object object = new fsw("outcome", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/omni/android_invocation_outcome", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("connectivity_state", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/networkmonitor/network_monitor_state_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("is_successful", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/libraries/actionusermodel/multi_account_cache_success", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                Object object = new fsw("has_enabled_productivity_accounts", Boolean.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/libraries/actionusermodel/multi_account_cache_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("surface", String.class);
                fsw fsw16 = new fsw("locale", String.class);
                fsw fsw17 = new fsw("trigger", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/languagepack/download/trigger_count", new fsw[]{object, fsw16, fsw17});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("check", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/libraries/account/not_whitelisted_account_count", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

