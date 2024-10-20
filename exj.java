/*
 * Decompiled with CFR 0.152.
 */
public final class exj
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exj(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("app_version", String.class);
                fsw fsw2 = new fsw("device_model", String.class);
                fsw fsw3 = new fsw("manufacturer", String.class);
                fsw fsw4 = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/cross_profile_counter", new fsw[]{object, fsw2, fsw3, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/cross_device/whole_home_channel_close_reason", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("outcome", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/backfill/finished_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/cross_device/timer_geller_share_total_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 16: {
                Object object = new fsw("task_status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/cross_device/timer_geller_share_completed_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsw fsw5 = new fsw("android_version", Integer.class);
                fsw fsw6 = new fsw("method_name", String.class);
                Object object = new fsw("client_id", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/appactions/app_inventory_api/request_latency", new fsw[]{fsw5, fsw6, object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/cross_device/geller_fcm_ping_x_device_timer_counter", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 13: {
                fsw fsw7 = new fsw("app_version", String.class);
                Object object = new fsw("client_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/commute/unique_session", new fsw[]{fsw7, object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                Object object = new fsw("app_version", String.class);
                fsw fsw8 = new fsw("client_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/commute/accurate_triggering", new fsw[]{object, fsw8});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsw fsw9 = new fsw("app_version", String.class);
                Object object = new fsw("surface", String.class);
                fsw fsw10 = new fsw("card_type", String.class);
                fsw fsw11 = new fsw("aod_enabled", Integer.class);
                fsw fsw12 = new fsw("data_source", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/card_update_latency", new fsw[]{fsw9, object, fsw10, fsw11, fsw12});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsw fsw13 = new fsw("app_version", String.class);
                fsw fsw14 = new fsw("aiai_app_version", String.class);
                fsw fsw15 = new fsw("agsa_type", String.class);
                fsw fsw16 = new fsw("cause", String.class);
                Object object = new fsw("dau", Boolean.class);
                fsw fsw17 = new fsw("content_capture_enabled", Integer.class);
                fsw fsw18 = new fsw("locus_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/card_push_status", new fsw[]{fsw13, fsw14, fsw15, fsw16, object, fsw17, fsw18});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                fsw fsw19 = new fsw("client_type", String.class);
                fsw fsw20 = new fsw("feature_type", String.class);
                Object object = new fsw("card_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/card_push_from_pcp", new fsw[]{fsw19, fsw20, object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                fsw fsw21 = new fsw("app_version", String.class);
                fsw fsw22 = new fsw("card_type", String.class);
                Object object = new fsw("dau", Boolean.class);
                fsw fsw23 = new fsw("locus_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/card_push", new fsw[]{fsw21, fsw22, object, fsw23});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/verticals/memory/backfill/duration", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 6: {
                Object object = new fsw("app_version", String.class);
                fsw fsw24 = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/calendar_ttl_merge", new fsw[]{object, fsw24});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                fsw fsw25 = new fsw("app_version", String.class);
                Object object = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/calendar_train_dedup", new fsw[]{fsw25, object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("app_version", String.class);
                fsw fsw26 = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/calendar_flight_dedup", new fsw[]{object, fsw26});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                fsw fsw27 = new fsw("exception", String.class);
                fsw fsw28 = new fsw("android_version", Integer.class);
                Object object = new fsw("method_name", String.class);
                fsw fsw29 = new fsw("client_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/appactions/app_inventory_api/request_failed_count", new fsw[]{fsw27, fsw28, object, fsw29});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsw fsw30 = new fsw("app_version", String.class);
                Object object = new fsw("counter_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/calendar_event_reservation_dedup", new fsw[]{fsw30, object});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                fsw fsw31 = new fsw("is_blue_chip", Boolean.class);
                fsw fsw32 = new fsw("aod_enabled", Integer.class);
                Object object = new fsw("is_from_pcp", Boolean.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/calendar/display_latency", new fsw[]{fsw31, fsw32, object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("type", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/calendar/event_by_account_type_count", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

