/*
 * Decompiled with CFR 0.152.
 */
public final class exv
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exv(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("widget_type", String.class);
                Object object = new fsw("status", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/weather_widget/taps_number", new fsw[]{fsw2, object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("widget_type", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/weather_widget/installations_number", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("widget_type", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/weather_widget/duration_between_periodic_updates", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("component_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/urlhandler/urlhandler_start_activity_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/urlhandler/urlhandler_prefetched_urls_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 15: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/urlhandler/urlhandler_prefetch_urls_call_count", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 14: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/udc/ulr_broadcast_receiver_total_count", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 13: {
                fsx fsx5 = ((ftb)this.a.c).g("/client_streamz/android_gsa/udc/udc_data_service_ulr_cache_miss_count", new fsw[0]);
                fsx5.c();
                return fsx5;
            }
            case 12: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/udc/udc_data_service_load_cache_api_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                Object object = new fsw("action", String.class);
                fsw fsw3 = new fsw("is_background", Boolean.class);
                fsw fsw4 = new fsw("is_agsa_vis", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/bisto/service_start_count", new fsw[]{object, fsw3, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                Object object = new fsw("result", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/productivity/reminders/mark_reminder_as_done_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/gallium/potential_native_deadlock", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                fsx fsx6 = ((ftb)this.a.c).g("/client_streamz/android_gsa/udc/udc_data_service_facs_cache_miss_count", new fsw[0]);
                fsx6.c();
                return fsx6;
            }
            case 7: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/udc/udc_data_service_cached_api_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/udc/udc_data_service_api_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                fsx fsx7 = ((ftb)this.a.c).g("/client_streamz/android_gsa/udc/facs_broadcast_receiver_total_count", new fsw[0]);
                fsx7.c();
                return fsx7;
            }
            case 4: {
                fsx fsx8 = ((ftb)this.a.c).g("/client_streamz/android_gsa/udc/facs_broadcast_receiver_failure_count", new fsw[0]);
                fsx8.c();
                return fsx8;
            }
            case 3: {
                Object object = new fsw("client_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tts/tts_session_timeout", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                Object object = new fsw("status", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tts/tts_engine_set_language_call_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("app_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/transcription/voice_ime_trampoline_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("audio_mime_type", String.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/tts/tts_audio_mime_type", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

