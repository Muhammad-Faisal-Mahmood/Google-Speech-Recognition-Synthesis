/*
 * Decompiled with CFR 0.152.
 */
public final class exg
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exg(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("notification_category", String.class);
                fsw fsw2 = new fsw("action_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/actions/missing_action_duration_counter", new fsw[]{object, fsw2});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsw fsw3 = new fsw("http_response_code", String.class);
                Object object = new fsw("google_response_code", String.class);
                fsw fsw4 = new fsw("upload_source", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/actions/failed_nau_counter", new fsw[]{fsw3, object, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("source", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/amp/opening_stamp_without_caused_by_field", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("action_count", Integer.class);
                fsw fsw5 = new fsw("upload_source", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/actions/actions_per_nau_request_counter", new fsw[]{object, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/action_upload_requests", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/start_session_error_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                fsw fsw6 = new fsw("top_hypothesis_contains_hotword", String.class);
                fsw fsw7 = new fsw("recognition_event_type", String.class);
                fsw fsw8 = new fsw("is_cloud_handover_for_soda_asr_hotword_validation_enabled", Boolean.class);
                fsw fsw9 = new fsw("is_pixel_device", Boolean.class);
                fsw fsw10 = new fsw("is_hotword_triggered", String.class);
                fsw fsw11 = new fsw("is_locale_supported", String.class);
                Object object = new fsw("soda_event_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/recognition_event_for_s3_with_hotword_validation_result", new fsw[]{fsw6, fsw7, fsw8, fsw9, fsw10, fsw11, object});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrasesmanager/unknown_soda_event_received", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 12: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrasesmanager/start_event_has_no_qp_types", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 11: {
                Object object = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrasesmanager/soda_qp_frontend_shutdown_exception", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/quickphrasesmanager/no_account_shutdown_latency", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 9: {
                Object object = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrasesmanager/handle_soda_event_exception", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrases/show_ui_status_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                Object object = new fsw("quick_phrase_type", String.class);
                fsw fsw12 = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrases/query_execution_status_count", new fsw[]{object, fsw12});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("description", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/aap/assistant_service_failure", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("cause", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/amp/cannot_create_firebase_stamp_share_url", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                fsw fsw13 = new fsw("component", String.class);
                Object object = new fsw("label", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/tapas/monitoring/counters", new fsw[]{fsw13, object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("quick_phrase_type", String.class);
                fsw fsw14 = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrases/listening_started_status_count", new fsw[]{object, fsw14});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrases/dismiss_ui_status_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/proactive_api/triggered_trip_weather_forecast", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 0: 
        }
        Object object = new fsw("status", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/quickphrases/connect_ui_status_count", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

