/*
 * Decompiled with CFR 0.152.
 */
public final class exp
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exp(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("feature_type", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/feature_type", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("count", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/expired_weather_cards", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("size", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/drawable_is_null", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsw fsw2 = new fsw("source", Integer.class);
                Object object = new fsw("empty_list", Boolean.class);
                fsw fsw3 = new fsw("missing_start_date", Boolean.class);
                fsw fsw4 = new fsw("missing_high_temperature", Boolean.class);
                fsw fsw5 = new fsw("missing_low_temperature", Boolean.class);
                fsw fsw6 = new fsw("missing_icon_url", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/daily_forecast_invalid", new fsw[]{fsw2, object, fsw3, fsw4, fsw5, fsw6});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                Object object = new fsw("source", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/current_weather_update_time_missing", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/current_weather_update_missing_location_permission", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 14: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/query_rewrites_corpus_update/started_count", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 13: {
                Object object = new fsw("source", Integer.class);
                fsw fsw7 = new fsw("hours", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/current_weather_stale", new fsw[]{object, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsw fsw8 = new fsw("url", String.class);
                Object object = new fsw("trigger_source", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/context_debug/impression_count", new fsw[]{fsw8, object});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                Object object = new fsw("source", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/current_weather_missing", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsw fsw9 = new fsw("source", Integer.class);
                Object object = new fsw("mismatch_fields", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/current_and_daily_forecast_mismatch", new fsw[]{fsw9, object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                fsw fsw10 = new fsw("app_version", String.class);
                fsw fsw11 = new fsw("is_bluechip", Boolean.class);
                fsw fsw12 = new fsw("location_history_enabled", Boolean.class);
                fsw fsw13 = new fsw("waa_enabled", Boolean.class);
                Object object = new fsw("is_correct", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/correct_city_shown", new fsw[]{fsw10, fsw11, fsw12, fsw13, object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                fsw fsw14 = new fsw("is_bluechip", Boolean.class);
                fsw fsw15 = new fsw("has_weather", Boolean.class);
                fsw fsw16 = new fsw("app_version", String.class);
                fsw fsw17 = new fsw("location_history_enabled", Boolean.class);
                fsw fsw18 = new fsw("waa_enabled", Boolean.class);
                fsw fsw19 = new fsw("is_last_weather_card_expired", Boolean.class);
                Object object = new fsw("is_weather_enabled", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/card_push_count", new fsw[]{fsw14, fsw15, fsw16, fsw17, fsw18, fsw19, object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                Object object = new fsw("has_city_name", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/card", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("station", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/air_quality_source_station_type", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/air_quality_multiple_cards", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                fsw fsw20 = new fsw("app_version", String.class);
                Object object = new fsw("location_history_enabled", Boolean.class);
                fsw fsw21 = new fsw("waa_enabled", Boolean.class);
                fsw fsw22 = new fsw("is_fine_location_used", Boolean.class);
                fsw fsw23 = new fsw("is_the_same_station", Boolean.class);
                fsw fsw24 = new fsw("age_in_hours", Integer.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/weather/air_quality_freshness_delta", new fsw[]{fsw20, object, fsw21, fsw22, fsw23, fsw24});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("outcome", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/query_rewrites_corpus_update/finished_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/weather/air_quality_freshness", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/context_debug/data_read_count", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 0: 
        }
        Object object = new fsw("status", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/air_quality_events", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

