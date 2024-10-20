/*
 * Decompiled with CFR 0.152.
 */
public final class exl
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exl(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("app_name", String.class);
                Object object = new fsw("suggestion_source", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/app_suggestion", new fsw[]{fsw2, object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/headphone/app_headphone_use_duration", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsw fsw3 = new fsw("app_version", String.class);
                fsw fsw4 = new fsw("key", String.class);
                Object object = new fsw("present_frequency", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/habits/profiles_dau", new fsw[]{fsw3, fsw4, object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsw fsw5 = new fsw("app_version", String.class);
                fsw fsw6 = new fsw("key", String.class);
                Object object = new fsw("is_present", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/habits/profiles", new fsw[]{fsw5, fsw6, object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsw fsw7 = new fsw("app_version", String.class);
                fsw fsw8 = new fsw("num_suggestions", Integer.class);
                Object object = new fsw("num_supported_suggestions", Integer.class);
                fsw fsw9 = new fsw("has_assistant_settings_suggestion", Boolean.class);
                fsw fsw10 = new fsw("dau", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/habits/media_suggestions_count", new fsw[]{fsw7, fsw8, object, fsw9, fsw10});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("app_version", String.class);
                fsw fsw11 = new fsw("age_days", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/habits/media_profile_age", new fsw[]{object, fsw11});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("shipping_type", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/grocery/time_diff_between_acceptance_and_scheduled_window", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/grocery/pickup_status_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                Object object = new fsw("shipping_type", String.class);
                fsw fsw12 = new fsw("event_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/grocery/pcp_events", new fsw[]{object, fsw12});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsw fsw13 = new fsw("service_name", String.class);
                fsw fsw14 = new fsw("client_package", String.class);
                fsw fsw15 = new fsw("client_version", String.class);
                Object object = new fsw("client_version_code", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/appintegration/start_session", new fsw[]{fsw13, fsw14, fsw15, object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/verticals/memory/garbage_collection/duration", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 9: {
                Object object = new fsw("is_from_new_corpus", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/grocery/from_new_corpus_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/grocery/delivery_status_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/grocery/deletion_request_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 6: {
                Object object = new fsw("shipping_type", String.class);
                fsw fsw16 = new fsw("event_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/grocery/card_generation_events", new fsw[]{object, fsw16});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                fsw fsw17 = new fsw("success", Boolean.class);
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/get_cached_content", new fsw[]{fsw17, object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("card_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/geo/notification_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("flight_status_data_source", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/flight/push_message_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                Object object = new fsw("app_version", String.class);
                fsw fsw18 = new fsw("flight_status_sync_status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/flight/flight_status_sync_status", new fsw[]{object, fsw18});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                fsw fsw19 = new fsw("app_version", String.class);
                Object object = new fsw("flight_landing_weather", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/flight/flight_landing_weather", new fsw[]{fsw19, object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("flight_status_data_source", String.class);
        object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/flight/flight_status_change_latency", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

