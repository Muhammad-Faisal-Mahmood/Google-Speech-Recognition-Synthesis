/*
 * Decompiled with CFR 0.152.
 */
public final class exr
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ exr(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                fsw fsw2 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/conv_engine/nluff_latency", new fsw[]{fsw2, object});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                fsw fsw3 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_tdsid_success_count", new fsw[]{fsw3, object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                fsw fsw4 = new fsw("app_version", String.class);
                fsw fsw5 = new fsw("locale", String.class);
                fsw fsw6 = new fsw("install_state", String.class);
                Object object = new fsw("reason", String.class);
                fsw fsw7 = new fsw("hotword_model_install_state", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_tdsid_install_state_failed", new fsw[]{fsw4, fsw5, fsw6, object, fsw7});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("trigger", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/verticals/memory/reconciliation/duration", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsw fsw8 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_tdsid_failed_no_tdsid", new fsw[]{fsw8, object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                fsw fsw9 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_tdsid_failed_no_hotword", new fsw[]{fsw9, object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("app_version", String.class);
                fsw fsw10 = new fsw("locale", String.class);
                fsw fsw11 = new fsw("exception", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_tdsid_failed_exception", new fsw[]{object, fsw10, fsw11});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                fsw fsw12 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_tdsid_count", new fsw[]{fsw12, object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                fsw fsw13 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                fsw fsw14 = new fsw("get_hotword_latency", Integer.class);
                fsw fsw15 = new fsw("get_tdsid_latency", Integer.class);
                fsw fsw16 = new fsw("get_all_resources_latency", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_resources_latency", new fsw[]{fsw13, object, fsw14, fsw15, fsw16});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                fsw fsw17 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_hotword_success_count", new fsw[]{fsw17, object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                fsx fsx2 = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_hotword_model_config_missing_file_group_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 9: {
                fsx fsx3 = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_hotword_model_config_file_group_download_failed_count", new fsw[0]);
                fsx3.c();
                return fsx3;
            }
            case 8: {
                fsw fsw18 = new fsw("app_version", String.class);
                Object object = new fsw("locale", String.class);
                object = ((ftb)this.a.c).c("/client_streamz/android_gsa/assistant/conv_engine/continued_conversation/did_score", new fsw[]{fsw18, object});
                ((fsz)object).c();
                return object;
            }
            case 7: {
                fsx fsx4 = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_hotword_model_config_empty_file_group_count", new fsw[0]);
                fsx4.c();
                return fsx4;
            }
            case 6: {
                Object object = new fsw("corpus_name", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/assistant/verticals/memory/reconciliation/database_wipe_count", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 5: {
                Object object = new fsw("app_version", String.class);
                fsw fsw19 = new fsw("use_mobserve", Boolean.class);
                fsw fsw20 = new fsw("locale_count", Integer.class);
                fsw fsw21 = new fsw("build_id", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_hotword_model_config_download_success_count", new fsw[]{object, fsw19, fsw20, fsw21});
                ((fsz)object).c();
                return object;
            }
            case 4: {
                fsw fsw22 = new fsw("app_version", String.class);
                Object object = new fsw("use_mobserve", Boolean.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_hotword_model_config_count", new fsw[]{fsw22, object});
                ((fsz)object).c();
                return object;
            }
            case 3: {
                Object object = new fsw("app_version", String.class);
                fsw fsw23 = new fsw("locale", String.class);
                fsw fsw24 = new fsw("fetch_method", String.class);
                fsw fsw25 = new fsw("timeout", Integer.class);
                fsw fsw26 = new fsw("exist_in_model_config", Boolean.class);
                fsw fsw27 = new fsw("hotword_model_config_size", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_hotword_failed_count", new fsw[]{object, fsw23, fsw24, fsw25, fsw26, fsw27});
                ((fsz)object).c();
                return object;
            }
            case 2: {
                fsw fsw28 = new fsw("app_version", String.class);
                fsw fsw29 = new fsw("locale", String.class);
                fsw fsw30 = new fsw("fetch_method", String.class);
                Object object = new fsw("timeout", Integer.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/soda_resource_manager/get_hotword_count", new fsw[]{fsw28, fsw29, fsw30, object});
                ((fsz)object).c();
                return object;
            }
            case 1: {
                Object object = new fsw("app_version", String.class);
                fsw fsw31 = new fsw("intent_state", String.class);
                fsw fsw32 = new fsw("target_surface", String.class);
                fsw fsw33 = new fsw("intent_source", String.class);
                fsw fsw34 = new fsw("is_tng", Boolean.class);
                fsw fsw35 = new fsw("is_handled", Boolean.class);
                fsw fsw36 = new fsw("error_cause", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace_3p/intent_handle", new fsw[]{object, fsw31, fsw32, fsw33, fsw34, fsw35, fsw36});
                ((fsz)object).c();
                return object;
            }
            case 0: 
        }
        Object object = new fsw("smartspace_widget_height", Integer.class);
        object = ((ftb)this.a.c).g("/client_streamz/android_gsa/smartspace_widget/smartspace_widget_size_dip", new fsw[]{object});
        ((fsz)object).c();
        return object;
    }
}

