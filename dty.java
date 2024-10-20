/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 */
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class dty
implements gui {
    public final Object a;
    private final int b;

    public /* synthetic */ dty(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object a() {
        switch (this.b) {
            default: {
                Object object = new fsw("status", String.class);
                fsw fsw2 = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_focus_acquire_status", new fsw[]{object, fsw2});
                ((fsz)object).c();
                return object;
            }
            case 19: {
                Object object = new fsw("device_ram_gb", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_buffer_overflow", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 18: {
                Object object = new fsw("device_ram_gb", String.class);
                object = ((eng)this.a).a.c("/client_streamz/audio_library_android/audio_buffer_available_bytes", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 17: {
                Object object = new fsw("device_ram_gb", String.class);
                fsw fsw3 = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/seamless_handover_timeout", new fsw[]{object, fsw3});
                ((fsz)object).c();
                return object;
            }
            case 16: {
                fsw fsw4 = new fsw("device_ram_gb", String.class);
                Object object = new fsw("error_code", Integer.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/read_error", new fsw[]{fsw4, object});
                ((fsz)object).c();
                return object;
            }
            case 15: {
                Object object = new fsw("status_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/prewarming_channel_status", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 14: {
                Object object = new fsw("audio_intent", String.class);
                fsw fsw5 = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/missing_audio_source_policy", new fsw[]{object, fsw5});
                ((fsz)object).c();
                return object;
            }
            case 13: {
                Object object = new fsw("adapter_key", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/audio_adapter_timeout", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 12: {
                Object object = new fsw("client_name", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/listening_session_timeout", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 11: {
                Object object = new fsw("app_flow_event", String.class);
                object = ((eng)this.a).a.g("/client_streamz/audio_library_android/app_flow_client_info_not_set", new fsw[]{object});
                ((fsz)object).c();
                return object;
            }
            case 10: {
                ActivityManager activityManager = (ActivityManager)((Context)this.a).getSystemService("activity");
                Object object = new ActivityManager.MemoryInfo();
                if (activityManager == null) {
                    object = "undefined";
                } else {
                    activityManager.getMemoryInfo(object);
                    long l2 = object.totalMem;
                    object = l2 <= 0x40000000L ? "1" : (l2 <= 0x80000000L ? "2" : (l2 <= 0xC0000000L ? "3" : (l2 <= 0x100000000L ? "4" : (l2 <= 0x180000000L ? "6" : (l2 <= 0x200000000L ? "8" : (l2 <= 0x400000000L ? "16" : ">16"))))));
                }
                return object;
            }
            case 9: {
                hpr hpr2 = (hpr)this.a.a();
                fxf.K(hpr2);
                return hpr2.c(new dwp(0), 10000L, TimeUnit.MILLISECONDS);
            }
            case 8: {
                Object object = this.a;
                Object object2 = (dwq)object;
                hpr hpr3 = (hpr)((dwq)object2).e.a();
                fxf.K(hpr3);
                object2 = (dus)((dwq)object2).d.a();
                fxf.K(object2);
                object = hno.f(hmv.f(hph.q(object2.d()), dut.class, new dti(4), hpr3), new cym(object, 19), hpr3);
                object.c(new dqv(object, 10), hpr3);
                return object;
            }
            case 7: {
                dlm dlm2 = dvr.g;
                return ((dvr)this.a).a();
            }
            case 6: {
                int n2 = dul.d;
                return dtv.a((Context)this.a);
            }
            case 5: {
                return (gto)this.a.b();
            }
            case 4: {
                return (hpr)this.a.b();
            }
            case 3: {
                Object object = ((fpn)this.a).d;
                Context context = dua.a;
                try {
                    object = gto.i(((Context)object).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    object = gsl.a;
                }
                return object;
            }
            case 2: {
                return gto.i(new dvy((gui)((fpn)this.a).a));
            }
            case 1: {
                return new duv(new cka((Context)this.a));
            }
            case 0: 
        }
        return new bmu((List)this.a);
    }
}

