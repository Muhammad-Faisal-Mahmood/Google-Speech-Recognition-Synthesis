/*
 * Decompiled with CFR 0.152.
 */
public final class exq
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exq(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("app_version", String.class);
                fsw fsw2 = new fsw("card_type", String.class);
                fsw fsw3 = new fsw("card_pushed_surface", String.class);
                fsw fsw4 = new fsw("surface_type", String.class);
                fsw fsw5 = new fsw("is_tng", Boolean.class);
                fsw fsw6 = new fsw("is_pushed", Boolean.class);
                fsw fsw7 = new fsw("error_cause", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace_3p/card_push", new fsw[]{object, fsw2, fsw3, fsw4, fsw5, fsw6, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsw fsw8 = new fsw("use_device_location", Boolean.class);
                Object object = new fsw("waa_on", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/zerostate/request_location", new fsw[]{fsw8, object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsw fsw9 = new fsw("data_type", String.class);
                Object object = new fsw("success", Boolean.class);
                fsw fsw10 = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/zerostate/partial_sync_request_count", new fsw[]{fsw9, object, fsw10});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsw fsw11 = new fsw("app_version", String.class);
                fsw fsw12 = new fsw("locale", String.class);
                Object object = new fsw("prefetch_response", String.class);
                fsw fsw13 = new fsw("transcription_response", String.class);
                fsw fsw14 = new fsw("empty_previous_query", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/conv_engine/continued_conversation/did_response_count", new fsw[]{fsw11, fsw12, object, fsw13, fsw14});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                Object object = new fsw("trigger", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/verticals/memory/reconciliation/affected_records", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsw fsw15 = new fsw("is_partial_data_response", Boolean.class);
                Object object = new fsw("client_type", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/zerostate/empty_response", new fsw[]{fsw15, object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/zero_update_time", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 13: {
                Object object = new fsw("app_version", String.class);
                fsw fsw16 = new fsw("is_different", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/weather_unit_different", new fsw[]{object, fsw16});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsw fsw17 = new fsw("app_version", String.class);
                Object object = new fsw("is_bluechip", Boolean.class);
                fsw fsw18 = new fsw("location_history_enabled", Boolean.class);
                fsw fsw19 = new fsw("waa_enabled", Boolean.class);
                fsw fsw20 = new fsw("is_fine_location_used", Boolean.class);
                fsw fsw21 = new fsw("age_in_hours", Integer.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/weather/weather_temperature_delta", new fsw[]{fsw17, object, fsw18, fsw19, fsw20, fsw21});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsw fsw22 = new fsw("staleness_in_hours", Integer.class);
                Object object = new fsw("hourly_forecast_enabled", Boolean.class);
                fsw fsw23 = new fsw("waa_enabled", Boolean.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/weather/weather_temperature_current_to_hourly_forecast_delta", new fsw[]{fsw22, object, fsw23});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/weather_card_wrapper_cache", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 9: {
                Object object = new fsw("status", String.class);
                fsw fsw24 = new fsw("action", String.class);
                fsw fsw25 = new fsw("request_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/trigger_status", new fsw[]{object, fsw24, fsw25});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/smartspace/weather/sno_update_delta", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                Object object = new fsw("status", String.class);
                fsw fsw26 = new fsw("action", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/send_status", new fsw[]{object, fsw26});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/refreshed_immediately", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 5: {
                fsw fsw27 = new fsw("model_id", String.class);
                fsw fsw28 = new fsw("edoras_app_version_code", String.class);
                fsw fsw29 = new fsw("agsa_version", String.class);
                fsw fsw30 = new fsw("status", String.class);
                Object object = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/phone_switching_count", new fsw[]{fsw27, fsw28, fsw29, fsw30, object});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("trigger", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/verticals/memory/reconciliation/affected_entities", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                fsw fsw31 = new fsw("method", String.class);
                Object object = new fsw("expected", Boolean.class);
                fsw fsw32 = new fsw("received", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/context_launch/compatibility_count", new fsw[]{fsw31, object, fsw32});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsw fsw33 = new fsw("status", String.class);
                Object object = new fsw("action", String.class);
                fsw fsw34 = new fsw("data_origin", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/receive_status", new fsw[]{fsw33, object, fsw34});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                fsx fsx5 = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/hourly_forecast_cards_icons_mismatch", new fsw[0]);
                fsx5.c();
                return fsx5;
            }
            case 0: 
        }
        fsw fsw35 = new fsw("empty_list", Boolean.class);
        fsw fsw36 = new fsw("missing_utc_date", Boolean.class);
        fsw fsw37 = new fsw("missing_start_hour", Boolean.class);
        Object object = new fsw("missing_temperature", Boolean.class);
        fsw fsw38 = new fsw("missing_icon_url", Boolean.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace/weather/hourly_forecast_data_invalid", new fsw[]{fsw35, fsw36, fsw37, object, fsw38});
        ((fsz)object).c();
        return object;
    }
}

