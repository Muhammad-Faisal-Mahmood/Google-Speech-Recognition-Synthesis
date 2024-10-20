/*
 * Decompiled with CFR 0.152.
 */
public final class enf
implements gui {
    public final Object a;
    private final int b;

    public /* synthetic */ enf(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("client_action_type", String.class);
                fsw fsw2 = new fsw("journey_type", String.class);
                object = ((ftb)((bmu)this.a).c).c("/client_streamz/android_gsa/proactive_api/time_fence_absolute_time_interval_latency", new fsw[]{object, fsw2});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsx fsx2 = ((ftb)((bmu)this.a).c).g("/client_streamz/android_gsa/proactive_api/registered_trip_weather_forecast", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 18: {
                fsx fsx3 = ((ftb)((bmu)this.a).c).g("/client_streamz/android_gsa/proactive_api/received_travel_journey", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 17: {
                fsw fsw3 = new fsw("journey_type", String.class);
                Object object = new fsw("content_type", String.class);
                fsw fsw4 = new fsw("is_active", Boolean.class);
                object = ((ftb)((bmu)this.a).c).g("/client_streamz/android_gsa/proactive_api/content_is_active_before_removed", new fsw[]{fsw3, object, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                Object object = new fsw("app_version", String.class);
                object = ((ftb)((bmu)this.a).c).g("/client_streamz/android_gsa/podcasts/playback_realtime_ms", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsw fsw5 = new fsw("app_version", String.class);
                Object object = new fsw("event_name", String.class);
                object = ((ftb)((bmu)this.a).c).g("/client_streamz/android_gsa/podcasts/events", new fsw[]{fsw5, object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("type", String.class);
                object = ((ftb)((bmu)this.a).c).g("/client_streamz/android_gsa/aap/apa_triggering_unexpected_disconnect_call_counter", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsw fsw6 = new fsw("status", String.class);
                fsw fsw7 = new fsw("device_ram_gb", String.class);
                Object object = new fsw("successful", Boolean.class);
                fsw fsw8 = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/hotword_session_opening_status", new fsw[]{fsw6, fsw7, object, fsw8});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsw fsw9 = new fsw("status", String.class);
                fsw fsw10 = new fsw("reason", String.class);
                fsw fsw11 = new fsw("device_ram_gb", String.class);
                Object object = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/hotword_session_closing_status", new fsw[]{fsw9, fsw10, fsw11, object});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                Object object = new fsw("hotword_client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/hotword_listening_session_timeout", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                Object object = new fsw("client_type", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/client_info_undefined", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                fsw fsw12 = new fsw("source_type", String.class);
                fsw fsw13 = new fsw("completion_reason", String.class);
                fsw fsw14 = new fsw("found_start_time", Boolean.class);
                Object object = new fsw("device_ram_gb", String.class);
                object = ((eng)this.a).a.c("/client_streamz/audio_library_android/audio_start_time_computation_duration", new fsw[]{fsw12, fsw13, fsw14, object});
                ((fsz)object).c();
                return object;
            }
            case 8: {
                Object object = new fsw("negative", Boolean.class);
                fsw fsw15 = new fsw("client_type", String.class);
                fsw fsw16 = new fsw("client", String.class);
                fsw fsw17 = new fsw("source_type", String.class);
                object = ((eng)this.a).a.c("/client_streamz/audio_library_android/audio_start_recording_correction_duration", new fsw[]{object, fsw15, fsw16, fsw17});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsw fsw18 = new fsw("client", String.class);
                Object object = new fsw("route", String.class);
                fsw fsw19 = new fsw("device_ram_gb", String.class);
                object = ((eng)this.a).a.c("/client_streamz/audio_library_android/audio_source_start_latency", new fsw[]{fsw18, object, fsw19});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                Object object = new fsw("audio_route_type", String.class);
                fsw fsw20 = new fsw("status", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_routing_status", new fsw[]{object, fsw20});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("audio_route_type", String.class);
                fsw fsw21 = new fsw("status", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_routing_disconnect_status", new fsw[]{object, fsw21});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                fsw fsw22 = new fsw("status", String.class);
                Object object = new fsw("device_ram_gb", String.class);
                fsw fsw23 = new fsw("client_name", String.class);
                fsw fsw24 = new fsw("successful", Boolean.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_listening_session_opening_status", new fsw[]{fsw22, object, fsw23, fsw24});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                fsw fsw25 = new fsw("status", String.class);
                Object object = new fsw("reason", String.class);
                fsw fsw26 = new fsw("device_ram_gb", String.class);
                fsw fsw27 = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_listening_session_closing_status", new fsw[]{fsw25, object, fsw26, fsw27});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsw fsw28 = new fsw("channel_config", String.class);
                fsw fsw29 = new fsw("sample_rate", String.class);
                Object object = new fsw("encoding", String.class);
                fsw fsw30 = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_format_characteristics", new fsw[]{fsw28, fsw29, object, fsw30});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                fsw fsw31 = new fsw("status", String.class);
                Object object = new fsw("reason", String.class);
                fsw fsw32 = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_focus_release_status", new fsw[]{fsw31, object, fsw32});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("audio_route_type", String.class);
        object = ((eng)this.a).a.c("/client_streamz/audio_library_android/audio_routing_latency", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

