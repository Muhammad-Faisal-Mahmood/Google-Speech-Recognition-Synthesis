/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import com.google.apps.tiktok.concurrent.InternalForegroundService;

public final class eyd
implements gui {
    public final Object a;
    private final int b;

    public /* synthetic */ eyd(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                gtk gtk2 = hub.a;
                return (Boolean)((bqw)this.a).a().e(false);
            }
            case 12: {
                return new grl((gpm)this.a);
            }
            case 11: {
                return cch.b((Context)this.a);
            }
            case 10: {
                return new acn((aco)this.a);
            }
            case 9: {
                return ((bh)this.a).bb();
            }
            case 8: {
                Object object = this.a;
                return ((LayoutInflater)((gin)object).getBaseContext().getSystemService("layout_inflater")).cloneInContext((Context)object);
            }
            case 7: {
                return ((duw)this.a).a();
            }
            case 6: {
                return (bmu)this.a.b();
            }
            case 5: {
                return (hpr)this.a.b();
            }
            case 4: {
                Class<InternalForegroundService> clazz = (gax)this.a;
                clazz = (jnu)((gax)((Object)clazz)).f.get(((gax)((Object)clazz)).a());
                if (clazz == null) {
                    ((heg)((heg)gax.a.h()).j("com/google/apps/tiktok/concurrent/AndroidFutures", "getForegroundService", 322, "AndroidFutures.java")).r("Calling attachForegroundService from non-main-process opens the main process which might be unintentional. Instead load and call the generated_android_futures_services macro for this process.");
                    clazz = InternalForegroundService.class;
                } else {
                    clazz = (Class)clazz.b();
                }
                return clazz;
            }
            case 3: {
                gax gax2 = (gax)this.a;
                Object object = gax2.e;
                String string = gax2.a();
                fxf.E(object.containsKey(string), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", string);
                object = (Class)((jnu)gax2.e.get(string)).b();
                return new Intent(gax2.b, (Class)object);
            }
            case 2: {
                Object object = ((fmb)this.a).b.getWindow();
                object = object == null ? gsl.a : ((object = object.getWindow()) == null ? gsl.a : gto.i(object.getAttributes().token));
                return object;
            }
            case 1: {
                fsx fsx2 = ((ftb)((bmu)this.a).c).g("/client_streamz/android_gsa/acetone/launcher_client_start_search_api_use_count", new fsw[0]);
                fsx2.c();
                return fsx2;
            }
            case 0: 
        }
        fsw fsw2 = new fsw("lang", String.class);
        Object object = new fsw("success", Boolean.class);
        object = ((ftb)((bmu)this.a).c).g("/client_streamz/android_gsa/assistant/surfaces/voice_search/request_count", new fsw[]{fsw2, object});
        ((fsz)object).c();
        return object;
    }
}

