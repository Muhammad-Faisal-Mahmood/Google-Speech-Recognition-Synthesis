/*
 * Decompiled with CFR 0.152.
 */
public final class exw
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exw(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("match", Boolean.class);
                Object object = new fsw("db_version", Integer.class);
                fsw fsw3 = new fsw("commercial_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/hotmatch/run", new fsw[]{fsw2, object, fsw3});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsw fsw4 = new fsw("match", Boolean.class);
                fsw fsw5 = new fsw("db_version", Integer.class);
                Object object = new fsw("commercial_id", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/hotmatch/match/latency", new fsw[]{fsw4, fsw5, object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsw fsw6 = new fsw("match", Boolean.class);
                fsw fsw7 = new fsw("db_version", Integer.class);
                Object object = new fsw("commercial_id", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/hotmatch/fingerprint/latency", new fsw[]{fsw6, fsw7, object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/hotmatch/asr_start_session_missing_db", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 16: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/hotmatch/asr_start_session_hotmatch_enabled", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 15: {
                Object object = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/handsfree/headset_query_commit_service/on_start_command/returns", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("device", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/handsfree/headset_query_commit_service/on_start_command/query_not_allowed", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                Object object = new fsw("client_package_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/handsfree/headset_query_commit_service/on_start_command/proxy_voice_button_press", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/productivity/reminders/open_dialog_intent_total", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 11: {
                Object object = new fsw("setting_key", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/get_settings_error_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                Object object = new fsw("type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/handsfree/headset_query_commit_service/on_start_command", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                fsw fsw8 = new fsw("app_version", String.class);
                Object object = new fsw("status_code", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/gallium/startup_failure", new fsw[]{fsw8, object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/gallium/send_request_raw_internal_latency", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 7: {
                Object object = new fsw("widget_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/weather_widget/widget_render_failure", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/weather_widget/widget_data_in_pcp_freshness_status", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("ui_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/weather_widget/widget_activity_per_ui_type", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                fsu fsu3 = ((ftb)this.a.c).c("/client_streamz/android_gsa/weather_widget/weather_data_freshness", new fsw[0]);
                fsu3.c();
                return fsu3;
            }
            case 3: {
                fsw fsw9 = new fsw("trigger_type", String.class);
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/weather_widget/update_event", new fsw[]{fsw9, object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsu fsu4 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/gallium/send_request_latency", new fsw[0]);
                fsu4.c();
                return fsu4;
            }
            case 1: {
                Object object = new fsw("widget_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/weather_widget/uninstallations_number", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        fsx fsx5 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/productivity/reminders/open_dialog_intent_redirected_to_migration_view", new fsw[0]);
        fsx5.c();
        return fsx5;
    }
}

