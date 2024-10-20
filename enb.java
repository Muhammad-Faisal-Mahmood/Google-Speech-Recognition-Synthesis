/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public final class enb
implements hpb {
    final Object a;
    final Object b;
    final Object c;
    private final int d;

    public enb(evo evo2, efn efn2, eip eip2, int n2) {
        this.d = n2;
        this.b = efn2;
        this.c = eip2;
        this.a = evo2;
    }

    public enb(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.a = object2;
        this.b = object3;
        this.c = object;
    }

    public enb(Object object, String string, Optional optional, int n2) {
        this.d = n2;
        this.a = string;
        this.c = optional;
        this.b = object;
    }

    @Override
    public final void a(Throwable object) {
        switch (this.d) {
            default: {
                Object object2 = this.b;
                object = this.a;
                ((ConcurrentHashMap)((izk)this.c).b).remove(object, object2);
                return;
            }
            case 7: {
                ((heg)((heg)fch.a.b().h(hfo.a, "ScheduleDownloadHelper")).j("com/google/android/libraries/speech/modelmanager/languagepack/ScheduleDownloadHelper$1", "onFailure", 125, "ScheduleDownloadHelper.java")).u("#onFailure: %s", ((Throwable)object).getMessage());
                object = new bme(this.a, 20);
                ((fch)this.b).b.ifPresent(object);
                fch.b((Optional)this.c, 3);
                return;
            }
            case 6: {
                ((heg)((heg)fcf.a.f().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl$1", "onFailure", 223, "ModelManagerImpl.java")).r("Error pack read.");
                object = new bme(this.a, 17);
                ((fcf)this.b).e.ifPresent(object);
                fcf.e((Optional)this.c);
                return;
            }
            case 5: {
                Object object3;
                Object object4;
                if (((gto)this.a).g()) {
                    object4 = (heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$9", "onFailure", 594, "AudioEventsHolderImpl.java");
                    object3 = this.b;
                    object = this.a;
                    object4.C("#audio# cannot retrieve route(%s) update status for audio client(token(%d))", crh.L((eaz)object3), ((gto)object).c());
                } else {
                    ((heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$9", "onFailure", 598, "AudioEventsHolderImpl.java")).u("#audio# cannot retrieve route(%s) update status for hotword client", crh.L((eaz)this.b));
                }
                object = this.c;
                object4 = elb.b(ebo.y);
                object3 = this.a;
                eaz eaz2 = (eaz)this.b;
                object4 = evo.b((eax)object4, (gto)object3, eaz2);
                ((evo)object).f((ecg)object4);
                return;
            }
            case 4: {
                ((heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$6", "onFailure", 443, "AudioEventsHolderImpl.java")).s("#audio# cannot retrieve audio focus session(token(%d)) acquire status", ((efn)this.b).c);
                object = ecg.a.l();
                Object object5 = elb.l(6);
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                Object object6 = ((hwp)object).b;
                Object object7 = (ecg)object6;
                object5.getClass();
                ((ecg)object7).d = object5;
                ((ecg)object7).c = 5;
                object7 = this.b;
                if (!((hwv)object6).B()) {
                    ((hwp)object).u();
                }
                object5 = ((hwp)object).b;
                object6 = (ecg)object5;
                object7.getClass();
                ((ecg)object6).f = (efn)object7;
                ((ecg)object6).b |= 2;
                object6 = this.c;
                if (!((hwv)object5).B()) {
                    ((hwp)object).u();
                }
                object5 = this.a;
                object7 = (ecg)((hwp)object).b;
                object6.getClass();
                ((ecg)object7).g = (eip)object6;
                ((ecg)object7).b |= 4;
                object = (ecg)((hwp)object).o();
                ((evo)object5).f((ecg)object);
                return;
            }
            case 3: {
                ((heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$5", "onFailure", 406, "AudioEventsHolderImpl.java")).s("#audio# cannot retrieve audio focus session(token(%d)) release status", ((efn)this.b).c);
                object = ecg.a.l();
                Object object8 = elb.m(6);
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                Object object9 = ((hwp)object).b;
                Object object10 = (ecg)object9;
                object8.getClass();
                ((ecg)object10).d = object8;
                ((ecg)object10).c = 6;
                object10 = this.b;
                if (!((hwv)object9).B()) {
                    ((hwp)object).u();
                }
                object8 = ((hwp)object).b;
                object9 = (ecg)object8;
                object10.getClass();
                ((ecg)object9).f = (efn)object10;
                ((ecg)object9).b |= 2;
                object9 = this.c;
                if (!((hwv)object8).B()) {
                    ((hwp)object).u();
                }
                object8 = this.a;
                object10 = (ecg)((hwp)object).b;
                object9.getClass();
                ((ecg)object10).g = (eip)object9;
                ((ecg)object10).b |= 4;
                object = (ecg)((hwp)object).o();
                ((evo)object8).f((ecg)object);
                return;
            }
            case 2: {
                Object object11;
                Object object12;
                if (((gto)this.a).g()) {
                    object12 = (heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$10", "onFailure", 632, "AudioEventsHolderImpl.java");
                    object11 = this.b;
                    object = this.a;
                    object12.C("#audio# cannot retrieve route(%s) disconnect status for audio client(token(%d))", crh.L((eaz)object11), ((gto)object).c());
                } else {
                    ((heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$10", "onFailure", 636, "AudioEventsHolderImpl.java")).u("#audio# cannot retrieve route(%s) disconnect status for hotword client", crh.L((eaz)this.b));
                }
                object = this.c;
                object12 = eav.a.l();
                object11 = ebg.G;
                if (!((hwp)object12).b.B()) {
                    ((hwp)object12).u();
                }
                hwv hwv2 = (eav)((hwp)object12).b;
                hwv2.c = ((ebg)object11).J;
                hwv2.b |= 1;
                object12 = (eav)((hwp)object12).o();
                object11 = this.a;
                hwv2 = (eaz)this.b;
                object12 = evo.a((eav)object12, (gto)object11, (eaz)hwv2);
                ((evo)object).f((ecg)object12);
                return;
            }
            case 1: {
                a.as(btj.a.g(), "Delete failed", "com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader$3", "onFailure", '\u01d5', "VoiceDataDownloader.java", (Throwable)object);
            }
            case 0: 
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void b(Object object) {
        int n2 = this.d;
        int n3 = 1;
        int n4 = 1;
        switch (n2) {
            default: {
                object = (iyh)object;
                return;
            }
            case 7: {
                Object object2;
                object = object2 = bql.b(((bqm)object).c);
                if (object2 == null) {
                    object = bql.a;
                }
                if (object == bql.c) {
                    object = this.b;
                    object2 = new fas(this.a, this.c, 6);
                    ((fch)object).b.ifPresent(object2);
                    return;
                }
                object2 = this.b;
                fjo fjo2 = new fjo(this.a, 1);
                ((fch)object2).b.ifPresent(fjo2);
                n3 = ((Enum)object).ordinal();
                if (n3 == 0) {
                    fch.b((Optional)this.c, 3);
                    return;
                }
                if (n3 == 1) {
                    object = this.c;
                    object2 = new fbw(8);
                    ((Optional)object).ifPresent(object2);
                    return;
                }
                if (n3 == 3) {
                    fch.b((Optional)this.c, 13);
                    return;
                }
                if (n3 != 4) {
                    return;
                }
                object2 = this.c;
                object = new fbw(7);
                ((Optional)object2).ifPresent(object);
                return;
            }
            case 6: {
                object = (Void)object;
                ((heg)((heg)fcf.a.f().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl$1", "onSuccess", 218, "ModelManagerImpl.java")).r("Success pack read.");
                return;
            }
            case 5: {
                Object object3;
                Object object4;
                boolean bl2 = ((gto)this.a).g();
                eax eax2 = (eax)object;
                if (bl2) {
                    object4 = (heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$9", "onSuccess", 578, "AudioEventsHolderImpl.java");
                    object3 = this.b;
                    object = this.a;
                    String string = crh.L((eaz)object3);
                    Object object5 = ((gto)object).c();
                    object = object3 = ebo.b(eax2.c);
                    if (object3 == null) {
                        object = ebo.a;
                    }
                    object4.G("#audio# route(%s) for audio request client(token(%d)) updated with status(%s)", string, object5, ((Enum)object).name());
                } else {
                    object4 = (heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$9", "onSuccess", 584, "AudioEventsHolderImpl.java");
                    String string = crh.L((eaz)this.b);
                    object = object3 = ebo.b(eax2.c);
                    if (object3 == null) {
                        object = ebo.a;
                    }
                    object4.C("#audio# route(%s) for hotword client updated with status(%s)", string, ((Enum)object).name());
                }
                object = this.c;
                object4 = this.a;
                object3 = (eaz)this.b;
                object3 = evo.b(eax2, (gto)object4, (eaz)object3);
                ((evo)object).f((ecg)object3);
                return;
            }
            case 4: {
                Object object6 = (dzv)object;
                object = (heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$6", "onSuccess", 430, "AudioEventsHolderImpl.java");
                n2 = ((efn)this.b).c;
                n3 = dox.e(((dzv)object6).c);
                if (n3 == 0) {
                    n3 = n4;
                }
                object.x("#audio# audio focus session(token(%d)) acquire status(%s)", n2, dox.d(n3));
                object = this.a;
                hyg hyg2 = ecg.a.l();
                if (!hyg2.b.B()) {
                    hyg2.u();
                }
                hwv hwv2 = hyg2.b;
                ecg ecg2 = (ecg)hwv2;
                object6.getClass();
                ecg2.d = object6;
                ecg2.c = 5;
                object6 = this.b;
                if (!hwv2.B()) {
                    hyg2.u();
                }
                hwv2 = hyg2.b;
                ecg2 = (ecg)hwv2;
                object6.getClass();
                ecg2.f = (efn)object6;
                ecg2.b |= 2;
                object6 = this.c;
                if (!hwv2.B()) {
                    hyg2.u();
                }
                hwv2 = (ecg)hyg2.b;
                object6.getClass();
                ((ecg)hwv2).g = (eip)object6;
                ((ecg)hwv2).b |= 4;
                hyg2 = (ecg)hyg2.o();
                ((evo)object).f((ecg)hyg2);
                return;
            }
            case 3: {
                Object object7 = (dzy)object;
                object = (heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$5", "onSuccess", 393, "AudioEventsHolderImpl.java");
                n2 = ((efn)this.b).c;
                n4 = dox.c(((dzy)object7).c);
                if (n4 != 0) {
                    n3 = n4;
                }
                object.x("#audio# audio focus session(token(%d)) release status(%s)", n2, dox.b(n3));
                object = this.a;
                hyg hyg3 = ecg.a.l();
                if (!hyg3.b.B()) {
                    hyg3.u();
                }
                hwv hwv3 = hyg3.b;
                ecg ecg3 = (ecg)hwv3;
                object7.getClass();
                ecg3.d = object7;
                ecg3.c = 6;
                object7 = this.b;
                if (!hwv3.B()) {
                    hyg3.u();
                }
                hwv3 = hyg3.b;
                ecg3 = (ecg)hwv3;
                object7.getClass();
                ecg3.f = (efn)object7;
                ecg3.b |= 2;
                object7 = this.c;
                if (!hwv3.B()) {
                    hyg3.u();
                }
                hwv3 = (ecg)hyg3.b;
                object7.getClass();
                ((ecg)hwv3).g = (eip)object7;
                ((ecg)hwv3).b |= 4;
                hyg3 = (ecg)hyg3.o();
                ((evo)object).f((ecg)hyg3);
                return;
            }
            case 2: {
                Object object8;
                Object object9;
                boolean bl3 = ((gto)this.a).g();
                eav eav2 = (eav)object;
                if (bl3) {
                    object9 = (heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$10", "onSuccess", 618, "AudioEventsHolderImpl.java");
                    object8 = this.b;
                    object = this.a;
                    String string = crh.L((eaz)object8);
                    Object object10 = ((gto)object).c();
                    object = object8 = ebg.b(eav2.c);
                    if (object8 == null) {
                        object = ebg.a;
                    }
                    object9.G("#audio# route(%s) for audio request client(token(%d)) disconnected(reason(%s))", string, object10, ((Enum)object).name());
                } else {
                    heg heg2 = (heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$10", "onSuccess", 622, "AudioEventsHolderImpl.java");
                    object9 = crh.L((eaz)this.b);
                    object = object8 = ebg.b(eav2.c);
                    if (object8 == null) {
                        object = ebg.a;
                    }
                    heg2.C("#audio# route(%s) for hotword client disconnected(reason(%s))", object9, ((Enum)object).name());
                }
                object = this.c;
                object9 = this.a;
                object8 = (eaz)this.b;
                object8 = evo.a(eav2, (gto)object9, (eaz)object8);
                ((evo)object).f((ecg)object8);
                return;
            }
            case 1: {
                object = (Void)object;
                ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader$3", "onSuccess", 458, "VoiceDataDownloader.java")).u("Delete voice %s succeeded", this.a);
                object = ((btj)this.c).k;
                synchronized (object) {
                    ((btj)this.c).k.remove(this.a);
                }
                object = (buz)this.b;
                ((btn)((buz)object).a).d();
                Object object11 = (heg)((heg)MultipleVoicesActivity.k.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity$2", "onPackDeleteSuccess", 364, "MultipleVoicesActivity.java");
                Object object12 = ((buz)object).b;
                object = (buz)object12;
                object11.u("User uninstalled %s", ((buz)object).a);
                object11 = new bpv(object12, 11);
                ((MultipleVoicesActivity)((buz)object).b).runOnUiThread((Runnable)object11);
                return;
            }
            case 0: 
        }
        object = (eax)object;
        object = (guh)this.a;
        ((guh)object).e();
        long l2 = ((guh)object).a(TimeUnit.MILLISECONDS);
        object = (eng)((enc)this.c).b.b();
        double d2 = l2;
        object = ((eng)object).g;
        String string = crh.P((eaz)this.b);
        ((fsu)object.a()).b(d2, string);
        ((hfk)((hfk)enc.a.f()).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$7", "onSuccess", 468, "MonitoringLoggerImpl.java")).B("#audio# audio routing(%s) took %d(ms)", crh.L((eaz)this.b), l2);
    }
}

