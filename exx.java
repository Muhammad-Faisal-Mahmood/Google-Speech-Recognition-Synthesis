/*
 * Decompiled with CFR 0.152.
 */
public final class exx
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exx(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("app_version", String.class);
                Object object = new fsw("code_path", String.class);
                fsw fsw3 = new fsw("mobile_assistant_experience", String.class);
                fsw fsw4 = new fsw("opa_activity_in_foreground", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_ui_status_change_sent", new fsw[]{fsw2, object, fsw3, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsw fsw5 = new fsw("app_version", String.class);
                fsw fsw6 = new fsw("code_path", String.class);
                Object object = new fsw("mobile_assistant_experience", String.class);
                fsw fsw7 = new fsw("opa_activity_in_foreground", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_ui_status_change_received", new fsw[]{fsw5, fsw6, object, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("binder_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_pss_binder_rendered_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("intent_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_chat_ui_intent_start_requested", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsw fsw8 = new fsw("app_version", String.class);
                fsw fsw9 = new fsw("code_path", String.class);
                fsw fsw10 = new fsw("mobile_assistant_experience", String.class);
                Object object = new fsw("requestor", String.class);
                fsw fsw11 = new fsw("time_since_previous_start_ms", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_activity_started", new fsw[]{fsw8, fsw9, fsw10, object, fsw11});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("hotword_settings_flag_counter", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/hotword_settings_flag_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("app_version", String.class);
                fsw fsw12 = new fsw("code_path", String.class);
                fsw fsw13 = new fsw("mobile_assistant_experience", String.class);
                fsw fsw14 = new fsw("requestor", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_activity_start_requested", new fsw[]{object, fsw12, fsw13, fsw14});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                Object object = new fsw("category_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/auto_tng/display_category_news", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_activity_destroyed_tcr_finished", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 11: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_activity_destroyed", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 10: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/opa_activity_created", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 9: {
                Object object = new fsw("feature_ve_id", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/opa/cml_card_rendered_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                fsw fsw15 = new fsw("operation", String.class);
                Object object = new fsw("client_id", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/notificationlistener/latencies", new fsw[]{fsw15, object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                Object object = new fsw("event", String.class);
                fsw fsw16 = new fsw("client_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/notificationlistener/counters", new fsw[]{object, fsw16});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("notification_type", String.class);
                fsw fsw17 = new fsw("action_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/notification/action", new fsw[]{object, fsw17});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/location_latency", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 4: {
                Object object = new fsw("outcome", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/location_fetch_outcome", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("hotword_settings_counter", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/hotword_settings_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                Object object = new fsw("result", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/wholehome/usonia_module_download_status_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                fsu fsu3 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/location_accuracy", new fsw[0]);
                fsu3.c();
                return fsu3;
            }
            case 0: 
        }
        fsu fsu4 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/location_age", new fsw[0]);
        fsu4.c();
        return fsu4;
    }
}

