/*
 * Decompiled with CFR 0.152.
 */
public final class eya
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ eya(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/escape_hatch_sent_to_nga", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 19: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/escape_hatch_drop", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 18: {
                Object object = new fsw("reason", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/disabled_location", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/device_tier/unknown_ram_counter", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 16: {
                fsw fsw2 = new fsw("app_name", String.class);
                Object object = new fsw("version", String.class);
                fsw fsw3 = new fsw("service", Integer.class);
                fsw fsw4 = new fsw("operation", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/deprecation/service_client_count", new fsw[]{fsw2, object, fsw3, fsw4});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("is_gel_the_only_launcher", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/deprecation/gel_users", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                fsw fsw5 = new fsw("surface", String.class);
                Object object = new fsw("locale", String.class);
                fsw fsw6 = new fsw("type", String.class);
                fsw fsw7 = new fsw("version", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/languagepack/download/request_count", new fsw[]{fsw5, object, fsw6, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsw fsw8 = new fsw("app_name", String.class);
                fsw fsw9 = new fsw("version", String.class);
                fsw fsw10 = new fsw("content_provider", Integer.class);
                Object object = new fsw("operation", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/deprecation/content_provider_client_count", new fsw[]{fsw8, fsw9, fsw10, object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                Object object = new fsw("is_consistent", Boolean.class);
                fsw fsw11 = new fsw("is_synchronous_read", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/data_migration/video_pref_preview_autoplay_consistency_count", new fsw[]{object, fsw11});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsx fsx5 = ((ftb)this.a.c).g("/client_streamz/android_gsa/data_migration/failed_updates_using_wrapper", new fsw[0]);
                fsx5.c();
                return fsx5;
            }
            case 10: {
                Object object = new fsw("dma_status", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/acetone/acetone_dma_eligibility_checker_failure_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 9: {
                fsx fsx6 = ((ftb)this.a.c).g("/client_streamz/android_gsa/data_migration/failed_gets_using_wrapper", new fsw[0]);
                fsx6.c();
                return fsx6;
            }
            case 8: {
                Object object = new fsw("app_version", String.class);
                fsw fsw12 = new fsw("client_id", String.class);
                fsw fsw13 = new fsw("is_client_initiated", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/ctf/unregistration", new fsw[]{object, fsw12, fsw13});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                Object object = new fsw("app_version", String.class);
                fsw fsw14 = new fsw("client_id", String.class);
                fsw fsw15 = new fsw("has_expiration_policy", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/ctf/registration", new fsw[]{object, fsw14, fsw15});
                ((fsz)object).c();
                return object;
            }
            case 6: {
                fsw fsw16 = new fsw("app_version", String.class);
                Object object = new fsw("client_id", String.class);
                fsw fsw17 = new fsw("is_active", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/ctf/notification", new fsw[]{fsw16, object, fsw17});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                fsw fsw18 = new fsw("app_version", String.class);
                Object object = new fsw("client_id", String.class);
                fsw fsw19 = new fsw("context_type", String.class);
                fsw fsw20 = new fsw("is_active", Boolean.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/ctf/callback_latency", new fsw[]{fsw18, object, fsw19, fsw20});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                Object object = new fsw("app_version", String.class);
                fsw fsw21 = new fsw("client_id", String.class);
                fsw fsw22 = new fsw("context_type", String.class);
                fsw fsw23 = new fsw("is_active", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/ctf/callback", new fsw[]{object, fsw21, fsw22, fsw23});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                fsx fsx7 = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/surfaces/dictation/instant_voice_replies/eligible_quick_phrase_notification_count", new fsw[0]);
                fsx7.c();
                return fsx7;
            }
            case 2: {
                Object object = new fsw("app_version", String.class);
                fsw fsw24 = new fsw("client_id", String.class);
                fsw fsw25 = new fsw("is_active", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/ctf/awareness_callback", new fsw[]{object, fsw24, fsw25});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                fsx fsx8 = ((ftb)this.a.c).g("/client_streamz/android_gsa/communication/contact_lookup_from_shortcuts_count", new fsw[0]);
                fsx8.c();
                return fsx8;
            }
            case 0: 
        }
        fsw fsw26 = new fsw("by_id", Boolean.class);
        Object object = new fsw("alternate_source", Integer.class);
        fsw fsw27 = new fsw("is_call_flow", Boolean.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/communication/contact_lookup_info_count", new fsw[]{fsw26, object, fsw27});
        ((fsz)object).c();
        return object;
    }
}

