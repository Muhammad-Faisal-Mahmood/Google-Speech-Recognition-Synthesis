/*
 * Decompiled with CFR 0.152.
 */
public final class eyb
implements gui {
    public final bmu a;
    private final int b;

    public /* synthetic */ eyb(bmu bmu2, int n2) {
        this.b = n2;
        this.a = bmu2;
    }

    @Override
    public final Object a() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    Object object = new fsw("app_version", String.class);
                    fsw fsw2 = new fsw("error_cause_tag", String.class);
                    fsw fsw3 = new fsw("message", String.class);
                    object = ((ftb)this.a.c).g("/client_streamz/android_gsa/learning_center/grpc_errors", new fsw[]{object, fsw2, fsw3});
                    ((fsz)object).c();
                    return object;
                }
                Object object = new fsw("app_version", String.class);
                fsw fsw4 = new fsw("card_load_status", String.class);
                fsw fsw5 = new fsw("tag", String.class);
                object = ((ftb)this.a.c).g("/client_streamz/android_gsa/learning_center/card_load_status", new fsw[]{object, fsw4, fsw5});
                ((fsz)object).c();
                return object;
            }
            fsw fsw6 = new fsw("app_version", String.class);
            fsw fsw7 = new fsw("tag", String.class);
            Object object = new fsw("moved_to_bg", Boolean.class);
            object = ((ftb)this.a.c).c("/client_streamz/android_gsa/learning_center/card_load_latency", new fsw[]{fsw6, fsw7, object});
            ((fsz)object).c();
            return object;
        }
        fsu fsu2 = ((ftb)this.a.c).c("/client_streamz/android_gsa/acetone/acetone_dma_eligibility_checker_latency", new fsw[0]);
        fsu2.c();
        return fsu2;
    }
}

