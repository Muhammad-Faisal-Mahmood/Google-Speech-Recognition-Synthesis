/*
 * Decompiled with CFR 0.152.
 */
public final class exs
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exs(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("outcome", String.class);
                fsw fsw2 = new fsw("intent", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/app_embedding_outcome", new fsw[]{object, fsw2});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/app_attribution_card_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsw fsw3 = new fsw("corpus_name", String.class);
                Object object = new fsw("outcome", String.class);
                fsw fsw4 = new fsw("trigger", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/reconciliation/finished_count", new fsw[]{fsw3, object, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/synced_startup_prefs_lost", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 16: {
                Object object = new fsw("summarization_model", String.class);
                fsw fsw5 = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/summarize/summary_status_count", new fsw[]{object, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("summarization_model", String.class);
                fsw fsw6 = new fsw("score", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/summarize/sumbleurt_metric_count", new fsw[]{object, fsw6});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("summarization_model", String.class);
                fsw fsw7 = new fsw("score", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/summarize/nli_metric_count", new fsw[]{object, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/spoken_notifications/notification_store_size", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 12: {
                fsw fsw8 = new fsw("error", Integer.class);
                fsw fsw9 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                fsw fsw10 = new fsw("streaming_mode", Boolean.class);
                fsw fsw11 = new fsw("status", String.class);
                fsw fsw12 = new fsw("error_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/conv_engine/on_device_failure_count", new fsw[]{fsw8, fsw9, object, fsw10, fsw11, fsw12});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/spoken_notifications/notification_posted_count", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 10: {
                fsw fsw13 = new fsw("fetch_type", String.class);
                Object object = new fsw("notification_type", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/spoken_notifications/notification_fetch_count", new fsw[]{fsw13, object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/spoken_notifications/notification_announcement_status", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                Object object = new fsw("optin", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/spoken_notifications/notification_announcement_silent_opt_in", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/account_id/missing_in_intent_extra_only", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 6: {
                Object object = new fsw("setting_turn_on", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/spoken_notifications/notification_announcement_setting_turn_on", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("setting_turn_off", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/spoken_notifications/notification_announcement_setting_turn_off", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("contacts_count", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/speechbiasing/app_control_contacts_update_sent_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("outcome", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/speech/auth/cross_profile_connection_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsw fsw14 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                fsw fsw15 = new fsw("result", String.class);
                fsw fsw16 = new fsw("hotword_state", String.class);
                fsw fsw17 = new fsw("tdsid_state", String.class);
                fsw fsw18 = new fsw("missing_resource", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/grpc_session_server_count", new fsw[]{fsw14, object, fsw15, fsw16, fsw17, fsw18});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/doubledash_sessions_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        fsw fsw19 = new fsw("app_version", String.class);
        Object object = new fsw("locale", String.class);
        fsw fsw20 = new fsw("result", String.class);
        fsw fsw21 = new fsw("hotword_state", String.class);
        fsw fsw22 = new fsw("tdsid_state", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/grpc_session_client_count", new fsw[]{fsw19, object, fsw20, fsw21, fsw22});
        ((fsz)object).c();
        return object;
    }
}

