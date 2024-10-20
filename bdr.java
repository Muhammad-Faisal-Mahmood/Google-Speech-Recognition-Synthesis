/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Process
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.work.impl.WorkDatabase;
import j$.util.Collection$_EL;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.Callable;

public final class bdr
implements Callable {
    public final Object a;
    private final int b;

    public bdr(ade ade2, int n2) {
        this.b = n2;
        this.a = ade2;
    }

    public /* synthetic */ bdr(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Throwable throwable622222;
        int n2 = this.b;
        boolean bl2 = false;
        int n3 = 0;
        Object object = false;
        Object object2 = true;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        switch (n2) {
            default: {
                object = (ffr)this.a;
                if (((ffr)object).g != null) break;
                ((heg)((heg)ffr.a.g().h(hfo.a, "OnDevicePrimaryRecog")).j("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer", "cancel", 139, "OnDevicePrimaryRecognizer.java")).r("Recognizer not started, ignore.");
                return null;
            }
            case 19: {
                ((heg)((heg)fep.a.f()).j("com/google/android/libraries/speech/transcription/languages/VoiceLanguageHelper", "initializeLanguages", 66, "VoiceLanguageHelper.java")).r("#initializeLanguages");
                hym hym2 = (hym)feo.a.C(7);
                object4 = (fep)this.a;
                Context context = ((fep)object4).b;
                object2 = object5;
                object = object3;
                object2 = object3 = context.getResources().openRawResource(2131951639);
                object = object3;
                if (fpk.g()) {
                    object2 = object3;
                    object = object3;
                    if (((InputStream)object3).available() > 1024) {
                        object2 = object3;
                        object = object3;
                        object2 = object3;
                        object = object3;
                        object5 = new IllegalStateException("parseFromRawRes can only parse small Protocol Buffers on the UI thread. This provides a best effort protection against dropping frames for parsing.");
                        object2 = object3;
                        object = object3;
                        throw object5;
                    }
                }
                object2 = object3;
                object = object3;
                object5 = hym2.d((InputStream)object3);
                hjh.a((InputStream)object3);
                object = (feo)object5;
                object2 = (hwp)((hwv)object).C(5);
                ((hwp)object2).x((hwv)object);
                ((fep)object4).d = (feo)((hwp)object2).o();
                return ((fep)object4).d;
            }
            case 18: {
                object2 = fbm.a;
                return this.a;
            }
            case 17: {
                return (gzx)Collection$_EL.stream(((faz)this.a).b).map(new fab(8)).filter(new fay(0)).flatMap(new fab(9)).filter(new fay(0)).filter(new fay(2)).map(new fab(10)).filter(new fay(3)).map(new fab(11)).collect(gye.a);
            }
            case 16: {
                ((hfk)ezs.a.f()).u("All LP removals for locale %s finished. Disk space may remain occupied before MDD has had a chance to purge.", ((Locale)this.a).toLanguageTag());
                return null;
            }
            case 15: {
                object2 = eyo.a;
                return ((Context)this.a).getExternalCacheDirs();
            }
            case 14: {
                return ye.g((Context)this.a);
            }
            case 13: {
                this.a.a();
                return object2;
            }
            case 12: {
                object = this.a;
                object2 = ebv.e;
                return ((emd)object).e((ebv)object2);
            }
            case 11: {
                object2 = (eev)this.a;
                if (((eev)object2).h.getAndSet(true)) {
                    return jon.a;
                }
                ((heg)eev.a.f().h(hfo.a, "ALT.ProcStartTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "close$lambda$3", 93, "AudioStartTimeProcessor.kt")).u("#audio# close processor(%s)", ((eev)object2).g);
                ((eev)object2).d(ews.f);
                return jon.a;
            }
            case 10: {
                ((BroadcastReceiver.PendingResult)this.a).finish();
                return null;
            }
            case 9: {
                ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 120, "DeferrableExecutor.java")).r("DeferrableExecutor unblocked after onResume");
                ((djs)this.a).i();
                return null;
            }
            case 8: {
                ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterMaxDelay", 114, "DeferrableExecutor.java")).r("DeferrableExecutor unblocked after max task delay");
                ((djs)this.a).i();
                return null;
            }
            case 7: {
                object2 = this.a;
                object = ((dgu)object2).h;
                synchronized (object) {
                    object3 = (dgu)((dgu)object2).h.c.remove(((dgu)object2).a.o());
                    if (object3 != null) {
                        ((dgu)object3).close();
                    }
                }
                synchronized (object2) {
                    object = ((dgu)object2).f;
                    if (object == null) return hhk.K(null);
                    ((hnk)object).m(null);
                    return hhk.K(null);
                }
            }
            case 6: {
                object3 = this.a.iterator();
                do {
                    if (!object3.hasNext()) return object2;
                } while ((object5 = (ctp)hhk.S((hpn)object3.next())) == ctp.a || object5 == ctp.b);
                return object;
            }
            case 5: {
                object2 = (cuq)this.a;
                if (!((cuq)object2).b.g()) {
                    cyr.g("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                    return null;
                }
                object2 = (cxv)((cuq)object2).b.c();
                ((cxv)object2).d("MDD.CHARGING.PERIODIC.TASK", iod.a.b().b(), 3, gsl.a);
                ((cxv)object2).d("MDD.MAINTENANCE.PERIODIC.GCM.TASK", iod.a.b().c(), 3, gsl.a);
                ((cxv)object2).d("MDD.CELLULAR.CHARGING.PERIODIC.TASK", iod.a.b().a(), 1, gsl.a);
                ((cxv)object2).d("MDD.WIFI.CHARGING.PERIODIC.TASK", iod.a.b().d(), 2, gsl.a);
                return null;
            }
            case 4: {
                object2 = (bzb)this.a;
                n2 = AmbientMode$AmbientCallback.h((WorkDatabase)((bzb)object2).a, "next_job_scheduler_id");
                if (n2 >= 0) {
                    n3 = n2;
                    return n3;
                }
                AmbientMode$AmbientCallback.i((WorkDatabase)((bzb)object2).a, "next_job_scheduler_id", 1);
                return n3;
            }
            case 3: {
                return AmbientMode$AmbientCallback.h((WorkDatabase)((bzb)this.a).a, "next_alarm_manager_id");
            }
            case 2: {
                object2 = (dhl)this.a;
                if (((dhl)object2).g.a((String)((dhl)object2).a) != bbv.a) return bl2;
                object = ((dhl)object2).g;
                object3 = ((dhl)object2).a;
                object.m(bbv.b, (String)object3);
                object5 = ((dhl)object2).g;
                object4 = ((dhl)object2).a;
                object = (bhw)object5;
                ((bhw)object).a.j();
                object3 = ((bhw)object).f.d();
                ((axb)object3).g(1, (String)object4);
                ((bhw)object5).a.k();
                {
                    catch (Throwable throwable2) {
                        throw throwable2;
                    }
                }
                try {
                    ((axc)object3).a();
                    ((bhw)object5).a.n();
                }
                catch (Throwable throwable3) {
                    ((bhw)object5).a.l();
                    throw throwable3;
                }
                try {
                    ((bhw)object5).a.l();
                    ((dhl)object2).g.j((String)((dhl)object2).a, -256);
                    bl2 = true;
                    return bl2;
                }
                finally {
                    ((bhw)object).f.f((axc)object3);
                }
            }
            case 1: {
                ((ade)this.a).e.set(true);
                object2 = object4;
                try {
                    Process.setThreadPriority((int)10);
                    object2 = object4;
                    object2 = object = ((ade)this.a).a();
                    Binder.flushPendingCommands();
                    ((ade)this.a).d(object);
                    return object;
                }
                catch (Throwable throwable4) {
                    try {
                        ((ade)this.a).d.set(true);
                        throw throwable4;
                    }
                    catch (Throwable throwable5) {
                        ((ade)this.a).d(object2);
                        throw throwable5;
                    }
                }
            }
            case 0: {
                object5 = (bhd)((dhl)this.a).b;
                if (((bhd)object5).c != bbv.a) {
                    object = bdy.a;
                    bbi.a();
                    return object2;
                } else {
                    if (!((bhd)object5).d()) {
                        object3 = object;
                        if (!((bhd)object5).c()) return object3;
                    }
                    object3 = object;
                    if (System.currentTimeMillis() >= ((bhd)object5).a()) return object3;
                    bbi.a();
                    object = bdy.a;
                }
                return object2;
            }
        }
        ((heg)((heg)ffr.a.f().h(hfo.a, "OnDevicePrimaryRecog")).j("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer", "cancel", 143, "OnDevicePrimaryRecognizer.java")).r("Cancel OnDevicePrimaryRecognizer");
        object2 = ((ffr)object).g;
        fxf.K(object2);
        object2.a();
        ((ffr)object).g = null;
        return null;
        {
            catch (Throwable throwable622222) {
            }
            catch (IOException iOException) {}
            object2 = object;
            {
                object2 = object;
                object3 = new RuntimeException(iOException);
                object2 = object;
                throw object3;
            }
        }
        hjh.a((InputStream)object2);
        throw throwable622222;
    }
}

