/*
 * Decompiled with CFR 0.152.
 */
public final class exk
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exk(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("parser_type", String.class);
                Object object = new fsw("failure_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/notification_parsing_errors", new fsw[]{fsw2, object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("app_package", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/entity/image_entity_builder/assist_data_too_large_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("service_name", String.class);
                fsw fsw3 = new fsw("client_package", String.class);
                fsw fsw4 = new fsw("client_version", String.class);
                fsw fsw5 = new fsw("client_version_code", Integer.class);
                fsw fsw6 = new fsw("text_query", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/appintegration/show_voice_plate", new fsw[]{object, fsw3, fsw4, fsw5, fsw6});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsw fsw7 = new fsw("app_version", String.class);
                Object object = new fsw("flight_landing_precision", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/flight/flight_landing_precision", new fsw[]{fsw7, object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/flight/flight_landing_location_mismatch_distance", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 15: {
                fsu fsu3 = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/flight/flight_landing_gcm_message_receive_latency", new fsw[0]);
                fsu3.c();
                return fsu3;
            }
            case 14: {
                fsw fsw8 = new fsw("app_version", String.class);
                fsw fsw9 = new fsw("baggage_claim_status", String.class);
                Object object = new fsw("country", String.class);
                fsw fsw10 = new fsw("airline", String.class);
                fsw fsw11 = new fsw("destination_airport", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/flight/flight_landing_baggage_claim_status", new fsw[]{fsw8, fsw9, object, fsw10, fsw11});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsw fsw12 = new fsw("country", String.class);
                Object object = new fsw("airline", String.class);
                fsw fsw13 = new fsw("destination_airport", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/flight/flight_landing_baggage_claim_display_latency", new fsw[]{fsw12, object, fsw13});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsu fsu4 = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/flight/flight_display_forward_interval", new fsw[0]);
                fsu4.c();
                return fsu4;
            }
            case 11: {
                Object object = new fsw("app_version", String.class);
                fsw fsw14 = new fsw("flight_boarding_pass_status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/flight/flight_boarding_pass_status", new fsw[]{object, fsw14});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsu fsu5 = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/flight/boarding_pass_display_latency", new fsw[0]);
                fsu5.c();
                return fsu5;
            }
            case 9: {
                fsw fsw15 = new fsw("app_version", String.class);
                fsw fsw16 = new fsw("has_wallet_event", Boolean.class);
                fsw fsw17 = new fsw("has_gi_event", Boolean.class);
                Object object = new fsw("has_calendar_event", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/event_reservation_dedup", new fsw[]{fsw15, fsw16, fsw17, object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/backfill/started_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 7: {
                fsw fsw18 = new fsw("app_version", String.class);
                Object object = new fsw("has_wallet_event", Boolean.class);
                fsw fsw19 = new fsw("has_gi_event", Boolean.class);
                fsw fsw20 = new fsw("has_calendar_event_from_gi", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/event_cards_after_dedup", new fsw[]{fsw18, object, fsw19, fsw20});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("service_name", String.class);
                fsw fsw21 = new fsw("client_package", String.class);
                fsw fsw22 = new fsw("client_version", String.class);
                fsw fsw23 = new fsw("client_version_code", Integer.class);
                fsw fsw24 = new fsw("agsa_source", String.class);
                fsw fsw25 = new fsw("completion_type", String.class);
                fsw fsw26 = new fsw("has_client_input", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/appintegration/query_completions", new fsw[]{object, fsw21, fsw22, fsw23, fsw24, fsw25, fsw26});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("app_version", String.class);
                fsw fsw27 = new fsw("account_match_status", String.class);
                fsw fsw28 = new fsw("data_type", Integer.class);
                fsw fsw29 = new fsw("is_bluechip", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/does_push_match_primary_account", new fsw[]{object, fsw27, fsw28, fsw29});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                fsw fsw30 = new fsw("app_version", String.class);
                Object object = new fsw("code_path", String.class);
                fsw fsw31 = new fsw("content_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/data_updates", new fsw[]{fsw30, object, fsw31});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                fsw fsw32 = new fsw("app_version", String.class);
                Object object = new fsw("event_type", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/csl_time_to_detect_latency", new fsw[]{fsw32, object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                Object object = new fsw("app_version", String.class);
                fsw fsw33 = new fsw("event_type", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/csl_inference_latency", new fsw[]{object, fsw33});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("app_version", String.class);
                fsw fsw34 = new fsw("message", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/cross_profile_failure_message_counter", new fsw[]{object, fsw34});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("app_version", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/csl_callback", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

