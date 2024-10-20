/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 */
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.work.Worker;
import java.io.File;

public final class mq
extends jsf
implements jqz {
    final Object a;
    private final int b;

    public mq(Object object, int n2) {
        this.b = n2;
        this.a = object;
        super(0);
    }

    @Override
    public final /* synthetic */ Object a() {
        int n2 = this.b;
        Object object = null;
        Object object2 = null;
        Object object3 = null;
        switch (n2) {
            default: {
                object2 = this.a;
                object3 = new eex(new mz(object2, 16), 7);
                return ((eoi)object2).e.b((gte)object3);
            }
            case 19: {
                object2 = ((eoi)this.a).m();
                jns.ak(object2);
                return dpg.h(((ewp)((gto)object2).c()).a(), eez.class);
            }
            case 18: {
                object2 = ((eoi)this.a).m();
                jns.ak(object2);
                return dpg.h(((ewp)((gto)object2).c()).a(), eeu.class);
            }
            case 17: {
                if (!((eli)this.a).b.b().g()) {
                    object2 = gsl.a;
                } else {
                    object = ((eli)this.a).b.b().c();
                    object2 = object3;
                    if (object instanceof eef) {
                        object2 = (eef)object;
                    }
                    if (object2 == null) {
                        ((heg)eli.a.g().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult$audioBytesReceiverRegistryLazy$2", "invoke", 101, "StopAwareStartListeningResult.kt")).u("#audio# result's(%s) delegate type is unexpected", ((eli)this.a).c);
                        object2 = gsl.a;
                    } else {
                        object2 = gto.h(new ele((eli)this.a, (eef)object2));
                    }
                }
                return object2;
            }
            case 16: {
                if (!((eli)this.a).b.a().g()) {
                    object2 = gsl.a;
                } else {
                    object3 = ((eli)this.a).b.a().c();
                    object2 = object;
                    if (object3 instanceof edx) {
                        object2 = (edx)object3;
                    }
                    if (object2 == null) {
                        ((heg)eli.a.g().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult$audioAccessorLazy$2", "invoke", 74, "StopAwareStartListeningResult.kt")).u("#audio# result's(%s) delegate type is unexpected", ((eli)this.a).c);
                        object2 = gsl.a;
                    } else {
                        object2 = gto.h(new eld((edx)object2, (eli)this.a));
                    }
                }
                return object2;
            }
            case 15: {
                object2 = (eie)this.a;
                object3 = ((eie)object2).i;
                ((eie)object2).b.unregisterReceiver((BroadcastReceiver)object3);
                return jon.a;
            }
            case 14: {
                object3 = new IntentFilter();
                object3.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                object2 = (eie)this.a;
                object = ((eie)object2).i;
                ye.h(((eie)object2).b, (BroadcastReceiver)object, (IntentFilter)object3);
                return jon.a;
            }
            case 13: {
                return new ass[((jyx[])this.a).length];
            }
            case 12: {
                return ((Worker)this.a).c();
            }
            case 11: {
                object3 = (awz)this.a;
                object2 = ((awz)object3).b;
                if (object2 != null && ((awz)object3).d) {
                    object2 = ((awz)object3).a;
                    jse.e(object2, "context");
                    object2 = object2.getNoBackupFilesDir();
                    jse.d(object2, "context.noBackupFilesDir");
                    object3 = new File((File)object2, ((awz)this.a).b);
                    object2 = this.a;
                    object3 = ((File)object3).getAbsolutePath();
                    object = new ilo(null);
                    Object object4 = (awz)this.a;
                    boolean bl2 = ((awz)object4).e;
                    object4 = ((awz)object4).c;
                    object2 = new awy(((awz)object2).a, (String)object3, (ilo)object, (awm)object4, bl2);
                } else {
                    object3 = ((awz)object3).a;
                    ilo ilo2 = new ilo(null);
                    object = (awz)this.a;
                    boolean bl3 = ((awz)object).e;
                    object2 = new awy((Context)object3, (String)object2, ilo2, ((awz)object).c, bl3);
                }
                object2.setWriteAheadLoggingEnabled(((awz)this.a).f);
                return object2;
            }
            case 10: {
                object2 = this.a;
                object2.getLifecycle().b(new awc((awh)object2));
                return jon.a;
            }
            case 9: {
                return new avk(new bzb(((avh)this.a).b.a.b(), null));
            }
            case 8: {
                return ((aup)this.a).e();
            }
            case 7: {
                boolean bl4;
                boolean bl5 = ((aue)this.a).a.o();
                boolean bl6 = bl4 = true;
                if (bl5) {
                    bl6 = ((aue)this.a).a.q() ? bl4 : false;
                }
                return bl6;
            }
            case 6: {
                return acb.b((aco)this.a);
            }
            case 5: {
                ((nf)this.a).b();
                return jon.a;
            }
            case 4: {
                ((nf)this.a).a();
                return jon.a;
            }
            case 3: {
                ((nf)this.a).b();
                return jon.a;
            }
            case 2: {
                object2 = new nf(new kd(this.a, 7, null));
                if (Build.VERSION.SDK_INT >= 33) {
                    object3 = this.a;
                    if (!jse.i(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post((Runnable)new aj(object3, object2, 11, null));
                    } else {
                        ((mr)object3).y((nf)object2);
                    }
                }
                return object2;
            }
            case 1: {
                object = (mr)this.a;
                object3 = object.getApplication();
                if (object.getIntent() != null) {
                    object2 = ((mr)this.a).getIntent().getExtras();
                }
                return new ace((Application)object3, (awh)this.a, (Bundle)object2);
            }
            case 0: 
        }
        return new giu(((mr)this.a).j);
    }
}

