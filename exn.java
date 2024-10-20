/*
 * Decompiled with CFR 0.152.
 */
public final class exn
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exn(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("app_version", String.class);
                fsw fsw3 = new fsw("client_type", String.class);
                Object object = new fsw("card_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/odlh/commute_duplicate_card_hidden", new fsw[]{fsw2, fsw3, object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsw fsw4 = new fsw("app_version", String.class);
                Object object = new fsw("client_type", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/odlh/commute_distinct_card_interval", new fsw[]{fsw4, object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("android_version", Integer.class);
                fsw fsw5 = new fsw("source", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/appactions/clock_inventory_data_fetch_latency", new fsw[]{object, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("app_version", String.class);
                fsw fsw6 = new fsw("source", String.class);
                fsw fsw7 = new fsw("update_model", String.class);
                fsw fsw8 = new fsw("dau", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/location_update", new fsw[]{object, fsw6, fsw7, fsw8});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsw fsw9 = new fsw("app_version", String.class);
                Object object = new fsw("type", String.class);
                fsw fsw10 = new fsw("dau", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/location_triggering_eligibility", new fsw[]{fsw9, object, fsw10});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/location_inference_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                fsw fsw11 = new fsw("app_version", String.class);
                Object object = new fsw("is_place_inferred", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/location_inference_finished", new fsw[]{fsw11, object});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsw fsw12 = new fsw("app_version", String.class);
                Object object = new fsw("feedback_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/location_card_feedback", new fsw[]{fsw12, object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/image_loading/failure_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 11: {
                fsw fsw13 = new fsw("app_version", String.class);
                Object object = new fsw("code_path", String.class);
                fsw fsw14 = new fsw("content_type", String.class);
                fsw fsw15 = new fsw("surfaces", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/impression", new fsw[]{fsw13, object, fsw14, fsw15});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                Object object = new fsw("hotel_check_out_time_granularity", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/hotel/hotel_check_out_time_granularity", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                Object object = new fsw("hotel_check_in_time_granularity", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/hotel/hotel_check_in_time_granularity", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                fsw fsw16 = new fsw("event_mid", String.class);
                Object object = new fsw("is_tng", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/holiday_alarms/public_events_count", new fsw[]{fsw16, object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                Object object = new fsw("success", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/holiday_alarms/fetch_public_events_attempt_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                fsw fsw17 = new fsw("exception", String.class);
                Object object = new fsw("android_version", Integer.class);
                fsw fsw18 = new fsw("source", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/appactions/clock_inventory_data_fetch_failed_count", new fsw[]{fsw17, object, fsw18});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                fsw fsw19 = new fsw("app_package_name", String.class);
                Object object = new fsw("status_code", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/holiday_alarms/extract_alarm_failure_count", new fsw[]{fsw19, object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("changed", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/holiday_alarms/changed_by_user_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("device_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/successful_triggers_device_type", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/recommendation_timeout_counter", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 1: {
                Object object = new fsw("status", String.class);
                fsw fsw20 = new fsw("type", String.class);
                fsw fsw21 = new fsw("app", String.class);
                fsw fsw22 = new fsw("minutes_since_last_update", Integer.class);
                fsw fsw23 = new fsw("rendered_card_size_bytes", Integer.class);
                fsw fsw24 = new fsw("number_of_media_items_removed", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/headphone/recommendation_sync_status_counter", new fsw[]{object, fsw20, fsw21, fsw22, fsw23, fsw24});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/garbage_collection/started_count", new fsw[0]);
        fsx4.c();
        return fsx4;
    }
}

