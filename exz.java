/*
 * Decompiled with CFR 0.152.
 */
public final class exz
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exz(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("carrier_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/carriers/cpid_retrieval_total_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/acetone/acetone_bind_latency", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 18: {
                fsu fsu3 = ((ftb)this.a.c).c("/client_streamz/android_gsa/carriers/cpid_retrieval_latency", new fsw[0]);
                fsu3.c();
                return fsu3;
            }
            case 17: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/carriers/cpid_retrieval_error_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 16: {
                fsw fsw2 = new fsw("app_version", String.class);
                Object object = new fsw("vis_entry_point_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/blocking_oobe/trigger", new fsw[]{fsw2, object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("media_item_position", Integer.class);
                fsw fsw3 = new fsw("playback_state", Integer.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/auto_tng/play_news_latency", new fsw[]{object, fsw3});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("play_news", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/auto_tng/play_news", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/dictation/instant_voice_replies/eligible_notification_count", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 12: {
                Object object = new fsw("category_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/auto_tng/play_category_news", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                Object object = new fsw("generic_event_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/auto_tng/media_rec_generic_event_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                Object object = new fsw("fallback_to_agsa", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/auto_tng/media_rec_fallback_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                Object object = new fsw("session_type", Integer.class);
                fsw fsw4 = new fsw("session_trigger", Integer.class);
                fsw fsw5 = new fsw("number_of_notifications", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/session_notification_counter", new fsw[]{object, fsw4, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                Object object = new fsw("model_id", String.class);
                fsw fsw6 = new fsw("notification_type", String.class);
                fsw fsw7 = new fsw("action_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/notification_count", new fsw[]{object, fsw6, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsw fsw8 = new fsw("reason", String.class);
                fsw fsw9 = new fsw("device_input_handler", String.class);
                fsw fsw10 = new fsw("device_hotword_enabled", Boolean.class);
                fsw fsw11 = new fsw("non_hotword_device", Boolean.class);
                Object object = new fsw("nga_active", Boolean.class);
                fsw fsw12 = new fsw("soda_enabled", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/interacting_component_create_count", new fsw[]{fsw8, fsw9, fsw10, fsw11, object, fsw12});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("model_id", String.class);
                fsw fsw13 = new fsw("agsa_version", String.class);
                fsw fsw14 = new fsw("status", Boolean.class);
                fsw fsw15 = new fsw("screen", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/hotword_enablement_count", new fsw[]{object, fsw13, fsw14, fsw15});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                fsw fsw16 = new fsw("is_daily_count", Boolean.class);
                fsw fsw17 = new fsw("model_id", String.class);
                Object object = new fsw("version_name", String.class);
                fsw fsw18 = new fsw("query_path", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/hotword_count", new fsw[]{fsw16, fsw17, object, fsw18});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("surface", String.class);
                fsw fsw19 = new fsw("source", String.class);
                fsw fsw20 = new fsw("result_state", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/auto_tng/load_news_latency", new fsw[]{object, fsw19, fsw20});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("model_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/first_stage_hotword_triggered", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                Object object = new fsw("error_type", String.class);
                fsw fsw21 = new fsw("method_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/device_database_errors", new fsw[]{object, fsw21});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("screen_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/speech/voice_match_moto_v_dialog", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("on_starting", Boolean.class);
        fsw fsw22 = new fsw("name", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/device_connected_listener_calls", new fsw[]{object, fsw22});
        ((fsz)object).c();
        return object;
    }
}

