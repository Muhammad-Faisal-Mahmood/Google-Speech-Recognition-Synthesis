/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 */
import android.content.Context;
import android.os.IBinder;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicLong;
import java.io.IOException;
import java.util.Locale;
import java.util.function.LongUnaryOperator;

public final class ena
implements hpb {
    final Object a;
    final Object b;
    private final int c;

    public ena(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object2;
        this.b = object;
    }

    public ena(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public ena(Object object, Object object2, int n2, char[] cArray) {
        this.c = n2;
        this.b = object2;
        this.a = object;
    }

    @Override
    public final void a(Throwable object) {
        switch (this.c) {
            default: {
                ((izg)this.b).e((Throwable)object);
                return;
            }
            case 11: {
                ((hsu)this.a).c = true;
                object = iyh.c((Throwable)object);
                iwx iwx2 = new iwx();
                ((fvc)this.b).a((iyh)object, iwx2);
                return;
            }
            case 10: {
                a.as(flr.b.g(), "Failed to load ProtoDataStore", "com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService$4", "onFailure", '\u0118', "VoiceInputMethodDataService.java", (Throwable)object);
                return;
            }
            case 9: {
                a.as(fjc.a.g().h(hfo.a, "ModelManagerWrapper"), "Can't download USM encoder LP.", "com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$3", "onFailure", '\u00d9', "ModelManagerWrapper.java", (Throwable)object);
                return;
            }
            case 8: {
                ((heg)((heg)((heg)fjc.a.g().h(hfo.a, "ModelManagerWrapper")).i((Throwable)object)).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$1", "onFailure", 116, "ModelManagerWrapper.java")).u("Can't get supported LP for %s", ((idq)this.b).name());
                ((AmbientMode$AmbientController)this.a).c();
                return;
            }
            case 7: {
                object = (heg)((heg)((heg)fha.a.h()).i((Throwable)object)).j("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService$3", "onFailure", 442, "TranscriptionDataService.java");
                String string = ((fha)this.a).e;
                object.C("Future [%s] FAILED for request-id %s", this.b, string);
                return;
            }
            case 6: {
                object = this.a;
                ((fbj)this.b).d((cty)object);
                return;
            }
            case 5: {
                ((heg)((heg)euu.a.h().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl$4", "onFailure", 402, "AudioServiceImpl.java")).r("#audio# Failed to get StopListeningStatus.");
                hwp hwp2 = eui.a.l();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                Object object2 = this.a;
                eui eui2 = (eui)hwp2.b;
                object2.getClass();
                eui2.c = (ecy)object2;
                eui2.b |= 1;
                object2 = eda.a;
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                Object object3 = this.b;
                eui2 = (eui)hwp2.b;
                object2.getClass();
                eui2.d = object2;
                eui2.b |= 2;
                object3.c((eui)hwp2.o());
                this.b.b((Throwable)object);
                return;
            }
            case 4: {
                ((eng)((enc)this.b).b.b()).b("FAILED_GETTING_STATUS_FUTURE", dzw.a.name(), eio.a(((eip)this.a).b).name());
                return;
            }
            case 3: {
                ((eng)((enc)this.b).b.b()).a("FAILED_ACQUIRING_ERROR_GETTING_STATUS_FUTURE", eio.a(((eip)this.a).b).name());
                return;
            }
            case 2: {
                ((hfk)((hfk)((hfk)enc.a.h()).i((Throwable)object)).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$6", "onFailure", 442, "MonitoringLoggerImpl.java")).u("#audio# route(%s) disconnect status failed", crh.L((eaz)this.a));
                return;
            }
            case 1: {
                cyr.p("%s: Unable to create symlink structure, cleaning up symlinks...", "FileGroupManager");
                try {
                    Object object4 = this.b;
                    object = ((cwj)object4).a;
                    gto gto2 = ((cwj)object4).f;
                    Object object5 = this.a;
                    object4 = ((cwj)object4).m;
                    cqq.ax((Context)object, gto2, (cth)object5, (bmu)object4);
                    return;
                }
                catch (IOException iOException) {
                    cyr.p("%s: Unable to clean up symlink structure after failure", "FileGroupManager");
                    return;
                }
            }
            case 0: 
        }
        ((hfk)((hfk)((hfk)enc.a.h()).i((Throwable)object)).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$5", "onFailure", 423, "MonitoringLoggerImpl.java")).u("#audio# logging audio route(%s) status failed", crh.L((eaz)this.a));
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        int n2 = this.c;
        int n3 = 1;
        int n4 = 1;
        switch (n2) {
            default: {
                Object object2 = this.a;
                Object object3 = this.b;
                object = (iyh)object;
                ((izg)object3).f((IBinder)object2, (iyh)object);
                return;
            }
            case 11: {
                object = (itz)object;
                try {
                    Object object4 = this.a;
                    ((hsu)object4).b = object;
                    object = ((hsu)object4).a.iterator();
                    while (object.hasNext()) {
                        ((Runnable)object.next()).run();
                    }
                    return;
                }
                catch (Throwable throwable) {
                    this.a(throwable);
                    return;
                }
            }
            case 10: {
                object = new flq((fme)object);
                DesugarAtomicLong.getAndUpdate(((flr)this.a).e, (LongUnaryOperator)object);
                fiz fiz2 = new fiz(5);
                object = this.b;
                ((flr)this.a).c((String)object, fiz2);
                return;
            }
            case 9: {
                if (((Optional)object).isPresent()) {
                    ((heg)((heg)fjc.a.f().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$3", "onSuccess", 202, "ModelManagerWrapper.java")).r("USM encoder LP available.");
                    return;
                }
                ((heg)((heg)fjc.a.f().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$3", "onSuccess", 204, "ModelManagerWrapper.java")).r("USM encoder LP not available, trigger download.");
                Object object5 = this.b;
                object = this.a;
                Locale locale = Locale.forLanguageTag("ag-AG");
                Optional optional = Optional.empty();
                idq idq2 = idq.b(((fhy)object).d);
                object = idq2;
                if (idq2 == null) {
                    object = idq.a;
                }
                ((fjc)object5).b.d("", locale, true, optional, (idq)object);
                return;
            }
            case 8: {
                fhx fhx2 = (fhx)object;
                ((heg)((heg)fjc.a.c().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$1", "onSuccess", 105, "ModelManagerWrapper.java")).H("Get supported LPs for %s: [%d]-[%d]-[%d]", ((idq)this.b).name(), fhx2.b.size(), fhx2.d.size(), fhx2.c.size());
                object = (AmbientMode$AmbientController)this.a;
                ((AmbientMode$AmbientController)object).a.c(fhx2);
                ((AmbientMode$AmbientController)object).a.a();
                return;
            }
            case 7: {
                object = (Void)object;
                object = (heg)((heg)fha.a.f()).j("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService$3", "onSuccess", 437, "TranscriptionDataService.java");
                String string = ((fha)this.a).e;
                object.C("Future [%s] SUCCESS for request-id %s", this.b, string);
                return;
            }
            case 6: {
                object = (Void)object;
                object = this.a;
                ((fbj)this.b).d((cty)object);
                return;
            }
            case 5: {
                eda eda2 = (eda)object;
                object = eui.a.l();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                Object object6 = this.a;
                Object object7 = ((hwp)object).b;
                eui eui2 = (eui)object7;
                object6.getClass();
                eui2.c = (ecy)object6;
                eui2.b |= 1;
                if (!((hwv)object7).B()) {
                    ((hwp)object).u();
                }
                object7 = this.b;
                object6 = (eui)((hwp)object).b;
                eda2.getClass();
                ((eui)object6).d = eda2;
                ((eui)object6).b |= 2;
                object7.c((eui)((hwp)object).o());
                this.b.a();
                return;
            }
            case 4: {
                Object object8 = ((enc)this.b).b;
                object = (dzy)object;
                eng eng2 = (eng)object8.b();
                n3 = dox.c(((dzy)object).c);
                if (n3 == 0) {
                    n3 = n4;
                }
                object = object8 = dzw.b(((dzy)object).d);
                if (object8 == null) {
                    object = dzw.a;
                }
                object8 = dox.b(n3);
                Object object9 = this.a;
                eng2.b((String)object8, ((Enum)object).name(), eio.a(((eip)object9).b).name());
                return;
            }
            case 3: {
                iku iku2 = ((enc)this.b).b;
                Object object10 = (dzv)object;
                object = (eng)iku2.b();
                n4 = dox.e(((dzv)object10).c);
                if (n4 != 0) {
                    n3 = n4;
                }
                object10 = eio.a(((eip)this.a).b).name();
                ((eng)object).a(dox.d(n3), (String)object10);
                return;
            }
            case 2: {
                Object object11 = ((enc)this.b).b;
                object = (eav)object;
                eng eng3 = (eng)object11.b();
                String string = crh.P((eaz)this.a);
                object = object11 = ebg.b(((eav)object).c);
                if (object11 == null) {
                    object = ebg.a;
                }
                object11 = eng3.f;
                object = ((Enum)object).name();
                ((fsx)object11.a()).b(string, object);
                return;
            }
            case 1: {
                object = (Void)object;
                return;
            }
            case 0: 
        }
        Object object12 = ((enc)this.b).b;
        object = (eax)object;
        eng eng4 = (eng)object12.b();
        String string = crh.P((eaz)this.a);
        object = object12 = ebo.b(((eax)object).c);
        if (object12 == null) {
            object = ebo.a;
        }
        object12 = eng4.h;
        object = ((Enum)object).name();
        ((fsx)object12.a()).b(string, object);
    }
}

