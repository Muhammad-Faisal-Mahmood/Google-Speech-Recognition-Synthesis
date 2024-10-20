/*
 * Decompiled with CFR 0.152.
 */
public final class exo
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exo(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("app_version", String.class);
                fsw fsw3 = new fsw("location_history_enabled", Boolean.class);
                fsw fsw4 = new fsw("waa_enabled", Boolean.class);
                Object object = new fsw("is_fine_location_used", Boolean.class);
                fsw fsw5 = new fsw("is_the_same_station", Boolean.class);
                fsw fsw6 = new fsw("age_in_hours", Integer.class);
                fsw fsw7 = new fsw("freshness_delta_in_seconds", Integer.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/weather/air_quality_aqi_delta", new fsw[]{fsw2, fsw3, fsw4, object, fsw5, fsw6, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("app_version", String.class);
                fsw fsw8 = new fsw("aiai_app_version", String.class);
                fsw fsw9 = new fsw("update_status", String.class);
                fsw fsw10 = new fsw("locus_id", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/update_data_size", new fsw[]{object, fsw8, fsw9, fsw10});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsw fsw11 = new fsw("app_version", String.class);
                Object object = new fsw("code_path", String.class);
                fsw fsw12 = new fsw("content_type", String.class);
                fsw fsw13 = new fsw("action_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/update_action", new fsw[]{fsw11, object, fsw12, fsw13});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("status", String.class);
                fsw fsw14 = new fsw("action", String.class);
                fsw fsw15 = new fsw("request_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/tng_weather/trigger_status", new fsw[]{object, fsw14, fsw15});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                Object object = new fsw("status", String.class);
                fsw fsw16 = new fsw("action", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/tng_weather/send_status", new fsw[]{object, fsw16});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsw fsw17 = new fsw("status", String.class);
                fsw fsw18 = new fsw("action", String.class);
                Object object = new fsw("data_origin", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/tng_weather/receive_status", new fsw[]{fsw17, fsw18, object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("empty_list", Boolean.class);
                fsw fsw19 = new fsw("missing_utc_date", Boolean.class);
                fsw fsw20 = new fsw("missing_start_hour", Boolean.class);
                fsw fsw21 = new fsw("missing_temperature", Boolean.class);
                fsw fsw22 = new fsw("missing_icon_url", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/tng_weather/hourly_forecast_data_invalid", new fsw[]{object, fsw19, fsw20, fsw21, fsw22});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/verticals/memory/query_rewrites_corpus_update/duration", new fsw[0]);
                fsu2.c();
                return fsu2;
            }
            case 12: {
                fsw fsw23 = new fsw("source", Integer.class);
                Object object = new fsw("empty_list", Boolean.class);
                fsw fsw24 = new fsw("missing_start_date", Boolean.class);
                fsw fsw25 = new fsw("missing_high_temperature", Boolean.class);
                fsw fsw26 = new fsw("missing_low_temperature", Boolean.class);
                fsw fsw27 = new fsw("missing_icon_url", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/tng_weather/daily_forecast_invalid", new fsw[]{fsw23, object, fsw24, fsw25, fsw26, fsw27});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsw fsw28 = new fsw("source", Integer.class);
                Object object = new fsw("mismatch_fields", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/tng_weather/current_and_daily_forecast_mismatch", new fsw[]{fsw28, object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                Object object = new fsw("station", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/tng_weather/air_quality_source_station_type", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                Object object = new fsw("android_version", Integer.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/appactions/clock_inventory_fetch_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/tng_weather/air_quality_freshness", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/tng_weather/air_quality_events", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("is_smartspace_chip", Boolean.class);
                fsw fsw29 = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/smartspace_card_storage_write_latency", new fsw[]{object, fsw29});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/smartspace_card_storage_read_latency", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                fsw fsw30 = new fsw("feature_type", String.class);
                Object object = new fsw("is_consistent", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/setting/shared_preferences_pds_consistent", new fsw[]{fsw30, object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("data_type", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/push_message_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/image_loading/success_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 1: {
                fsw fsw31 = new fsw("app_version", String.class);
                fsw fsw32 = new fsw("client_type", String.class);
                fsw fsw33 = new fsw("card_type", String.class);
                Object object = new fsw("card_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/odlh/version_display", new fsw[]{fsw31, fsw32, fsw33, object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("client_type", String.class);
        fsw fsw34 = new fsw("data_type", String.class);
        object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/pcp/display_validity_change_to_client_notification", new fsw[]{object, fsw34});
        ((fsz)object).c();
        return object;
    }
}

