/*
 * Decompiled with CFR 0.152.
 */
public final class exh
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exh(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("notification_category", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/notifications_dropped_on_unicorn_account", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("notification_category", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/notifications_dropped_on_out_of_order", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("notification_category", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/notifications_dropped_on_non_primary_account", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/notifications_device_channel_sync_counter", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 16: {
                Object object = new fsw("component", String.class);
                fsw fsw2 = new fsw("label", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/tapas/monitoring/latencies", new fsw[]{object, fsw2});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/notifications_device_channel_request_status", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("channel_id", String.class);
                fsw fsw3 = new fsw("channel_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/notifications_device_channel_orphan_count", new fsw[]{object, fsw3});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/location_updates", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                Object object = new fsw("location_availability", String.class);
                fsw fsw4 = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/location_reporting_requests", new fsw[]{object, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                Object object = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/legacy_now_sync_task", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                Object object = new fsw("has_tiktok_user_id", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/inbox/no_chime_rtid", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/amp/stamp_viewer_recommendations_load_failure", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 8: {
                fsw fsw5 = new fsw("level", String.class);
                Object object = new fsw("name", String.class);
                fsw fsw6 = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/device_notification_settings_change", new fsw[]{fsw5, object, fsw6});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/chime_registration_worker_enqueue_failure", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 6: {
                fsx fsx5 = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/chime_registration_trigger", new fsw[0]);
                fsx5.c();
                return fsx5;
            }
            case 5: {
                Object object = new fsw("component", String.class);
                fsw fsw7 = new fsw("label", String.class);
                fsw fsw8 = new fsw("end_state", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/tapas/monitoring/durations", new fsw[]{object, fsw7, fsw8});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                fsx fsx6 = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/chime_registration_success", new fsw[0]);
                fsx6.c();
                return fsx6;
            }
            case 3: {
                Object object = new fsw("error", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/chime_registration_payload_diff", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsx fsx7 = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/chime_registration_failure", new fsw[0]);
                fsx7.c();
                return fsx7;
            }
            case 1: {
                fsw fsw9 = new fsw("notification_category", String.class);
                Object object = new fsw("suppression_store_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/actions/suppression_counter", new fsw[]{fsw9, object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/search_notifications/actions/suppression_store_num_entries", new fsw[0]);
        fsu2.c();
        return fsu2;
    }
}

