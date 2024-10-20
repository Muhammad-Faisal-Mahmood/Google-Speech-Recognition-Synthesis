/*
 * Decompiled with CFR 0.152.
 */
public final class exi
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exi(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("is_consistent", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/calendar/consistency_at_aggregator", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/calendar/account_type_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/bluechip/update_card_count", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 17: {
                Object object = new fsw("is_logged_in", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/calendar/localcalendar/account", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsw fsw2 = new fsw("app_version", String.class);
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/assistant_settings_media_app_status", new fsw[]{fsw2, object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsw fsw3 = new fsw("app_version", String.class);
                fsw fsw4 = new fsw("context_type", String.class);
                Object object = new fsw("num_suggestions", Integer.class);
                fsw fsw5 = new fsw("dau", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/app_suggestions", new fsw[]{fsw3, fsw4, object, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("app_version", String.class);
                fsw fsw6 = new fsw("event_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/ambient_assistant_events_count", new fsw[]{object, fsw6});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smart_dictation/corrections_migrated_from_ekho", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 12: {
                fsw fsw7 = new fsw("android_version", Integer.class);
                Object object = new fsw("method_name", String.class);
                fsw fsw8 = new fsw("client_id", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/appactions/app_inventory_api/request_count", new fsw[]{fsw7, object, fsw8});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smart_dictation/corrections_expired", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 10: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smart_dictation/corrections_cached", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 9: {
                fsx fsx5 = ((ftb)this.a.c).g("/client_streamz/android_gsa/silentfeedback/crashloop_recoverer_trigger_count", new fsw[0]);
                fsx5.c();
                return fsx5;
            }
            case 8: {
                Object object = new fsw("reason", String.class);
                fsw fsw9 = new fsw("initializing", Boolean.class);
                fsw fsw10 = new fsw("fetch_accounts_with_gmscore", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/signed_out", new fsw[]{object, fsw9, fsw10});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                Object object = new fsw("calling_component_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/sensitive_api_calls_location", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                fsw fsw11 = new fsw("component", String.class);
                Object object = new fsw("label", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/tapas/monitoring/quantities", new fsw[]{fsw11, object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("attribution_constrant", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/sensitive_api_calls_contact_attribution", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("calling_component_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/sensitive_api_calls_contact", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                fsx fsx6 = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_widget/repeating_update_scheduler_count", new fsw[0]);
                fsx6.c();
                return fsx6;
            }
            case 2: {
                fsx fsx7 = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/tng_entrytree_invalidation_counter", new fsw[0]);
                fsx7.c();
                return fsx7;
            }
            case 1: {
                Object object = new fsw("cause", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/amp/stamp_viewer_report_abuse_failure", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        fsw fsw12 = new fsw("first_destination", Integer.class);
        Object object = new fsw("notification_category", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/search_notifications/notifications_dropped_on_unicorn_account_destination", new fsw[]{fsw12, object});
        ((fsz)object).c();
        return object;
    }
}

