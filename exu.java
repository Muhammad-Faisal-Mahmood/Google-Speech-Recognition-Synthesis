/*
 * Decompiled with CFR 0.152.
 */
public final class exu
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exu(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("result", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/productivity/reminders/arp_creation_response_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/transcription/recognition_service_trampoline_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/gallium/envelope_serialization_latency", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 17: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/transcription/offline_recognition_total_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/transcription/offline_intent_api_total_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/transcription/intent_api_trampoline_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("app_version", String.class);
                fsw fsw2 = new fsw("is_suppressed", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/warmer_welcome_count", new fsw[]{object, fsw2});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsw fsw3 = new fsw("feature_type", String.class);
                fsw fsw4 = new fsw("variance", String.class);
                Object object = new fsw("status", String.class);
                fsw fsw5 = new fsw("deeplink_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/tng_ma_deeplink_requested", new fsw[]{fsw3, fsw4, object, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/tng_interpreter_stop_interaction_failure", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 11: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/tng_interpreter_start_text_interaction_failure", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 10: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/tng_interpreter_start_interaction_failure", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 9: {
                fsu fsu3 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/verticals/memory/search_placeholder/maybe_recreate/duration", new fsw[0]);
                fsu3.c();
                return fsu3;
            }
            case 8: {
                fsx fsx5 = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/tng_interpreter_pds_write_failure", new fsw[0]);
                fsx5.c();
                return fsx5;
            }
            case 7: {
                fsx fsx6 = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/tng_interpreter_missing_homescreen_shortcut_data", new fsw[0]);
                fsx6.c();
                return fsx6;
            }
            case 6: {
                fsw fsw6 = new fsw("app_version", String.class);
                Object object = new fsw("reaper_enabled", Boolean.class);
                fsw fsw7 = new fsw("fresh_schedule", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/experiments/interactor_reaper_schedule", new fsw[]{fsw6, object, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/tng_drl_no_event_id", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/speedbump_without_ui", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/speedbump_with_ui", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsw fsw8 = new fsw("app_version", String.class);
                fsw fsw9 = new fsw("speedbump_state", String.class);
                fsw fsw10 = new fsw("client_type", String.class);
                Object object = new fsw("trigger_type", String.class);
                fsw fsw11 = new fsw("invocation_entrypoint", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/speedbump_state_counter", new fsw[]{fsw8, fsw9, fsw10, object, fsw11});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/tng_ma/show_temporary_model_download_prompt_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        fsw fsw12 = new fsw("app_version", String.class);
        fsw fsw13 = new fsw("client_type", String.class);
        Object object = new fsw("trigger_type", String.class);
        fsw fsw14 = new fsw("speedbump_status", String.class);
        fsw fsw15 = new fsw("reason", String.class);
        fsw fsw16 = new fsw("bump_behavior_name", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tng_ma/speedbump_check_result_counter", new fsw[]{fsw12, fsw13, object, fsw14, fsw15, fsw16});
        ((fsz)object).c();
        return object;
    }
}

