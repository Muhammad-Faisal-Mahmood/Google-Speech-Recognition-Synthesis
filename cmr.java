/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 *  android.database.sqlite.SQLiteDatabase
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.BroadcastReceiver;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.util.concurrent.CancellationException;

public final class cmr
implements hpb {
    final Object a;
    private final int b;

    public cmr(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(Throwable object) {
        switch (this.b) {
            default: {
                ((BroadcastReceiver.PendingResult)this.a).finish();
            }
            case 12: 
            case 13: {
                return;
            }
            case 11: {
                a.as(fgw.a.g(), "Microphone didn't close!", "com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$2", "onFailure", '\u013d', "AudioLibraryAudioController.java", (Throwable)object);
                return;
            }
            case 10: {
                a.as(fgw.a.h(), "Could not get Audio Recording URI", "com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$1", "onFailure", '\u0119', "AudioLibraryAudioController.java", (Throwable)object);
                if (!(object instanceof elu)) {
                    object = this.a;
                    Uri uri = Uri.EMPTY;
                    ((fgw)object).c.l(uri);
                }
                return;
            }
            case 9: {
                a.as(ffo.a.h(), "Failed uploading data to S3", "com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$1", "onFailure", '\u00be', "NetworkSpeechRecognizer.java", (Throwable)object);
                fxf.K(((ffo)this.a).f);
                if (ffo.b((Throwable)object, fef.class) != null) {
                    ((ffo)this.a).f.b((Throwable)object);
                    return;
                }
                if (ffo.b((Throwable)object, elw.class) != null) {
                    ((ffo)this.a).f.b(new fdx());
                    return;
                }
                ((ffo)this.a).f.b(new fdy());
                return;
            }
            case 8: {
                if (object instanceof CancellationException) {
                    object = (hfk)((hfk)fbj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator$2", "onFailure", 219, "ZipfileLanguagePackPopulator.java");
                    ezj ezj2 = (ezj)this.a;
                    object.C("Updated Language pack task cancelled for '%s' from location: %s", fbj.c(ezj2), ((ezi)ezj2.f.c()).a);
                    return;
                }
                object = (hfk)((hfk)((hfk)fbj.a.g()).i((Throwable)object)).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator$2", "onFailure", 223, "ZipfileLanguagePackPopulator.java");
                ezj ezj3 = (ezj)this.a;
                object.C("Failed to add file group for '%s' from location: %s", fbj.c(ezj3), ((ezi)ezj3.f.c()).a);
                return;
            }
            case 7: {
                ((heg)((heg)((heg)fat.a.h().h(hfo.a, "LanguagePackCBTrigger")).i((Throwable)object)).j("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger$1", "onFailure", 124, "DownloaderCallbacksTrigger.java")).u("%s callback failed.", this.a);
                return;
            }
            case 6: {
                dyj dyj2 = dxv.ai.c(3);
                ((ezy)this.a).d.a(dyj2);
                ((hfk)((hfk)((hfk)ezy.a.g()).i((Throwable)object)).j("com/google/android/libraries/speech/modeldownload/languagepacks/backgroundtask/LanguagePackMaintenance$1", "onFailure", 80, "LanguagePackMaintenance.java")).r("Error when background downloading LanguagePacks");
                return;
            }
            case 5: {
                a.as(eou.a.g().h(hfo.a, "ALT.HWHandoverHandler"), "#audio# Failure in StopListeningStatus future.", "com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/HotwordHandoverHandler$1", "onFailure", 'c', "HotwordHandoverHandler.java", (Throwable)object);
                ((eou)this.a).d.c(elb.g(ebp.l, ebv.g));
                return;
            }
            case 4: {
                a.as(efj.a.h().h(hfo.a, "ALT.AFCSession"), "#audio# Failed to get ReleaseAudioFocusStatus future.", "com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionImpl$1", "onFailure", 'x', "AudioFocusSessionImpl.java", (Throwable)object);
                ((efj)this.a).g.c(elb.m(6));
                return;
            }
            case 3: {
                ctq ctq2;
                ctq ctq3 = ctq2 = ((dac)this.a).a.c;
                if (ctq2 == null) {
                    ctq3 = ctq.a;
                }
                cyr.j((Throwable)object, "%s: Unable to increment LoggingStateStore network usage for %s", "NetworkUsageMonitor", ctq3.c);
                return;
            }
            case 2: {
                this.a.b((Throwable)object);
                return;
            }
            case 1: {
                object = ((bpy)this.a).f;
                synchronized (object) {
                    ((bpy)this.a).g = null;
                    return;
                }
            }
            case 0: 
        }
        ((heg)((heg)cms.a.f()).j("com/google/android/libraries/assistant/soda/SodaAudioPusher$1", "onFailure", 127, "SodaAudioPusher.java")).u("Failed with: %s", ((Throwable)object).getMessage());
        ((cms)this.a).f.n((Throwable)object);
        ((cms)this.a).a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void b(Object object) {
        switch (this.b) {
            default: {
                gji gji2 = (gji)object;
                int n2 = gji2.a;
                object = gji2.b;
                gji2 = gji2.c;
                ((BroadcastReceiver.PendingResult)this.a).setResult(n2, (String)object, (Bundle)gji2);
                ((BroadcastReceiver.PendingResult)this.a).finish();
                return;
            }
            case 13: {
                if (!new File(((SQLiteDatabase)object).getPath()).exists()) {
                    Object object2 = ((fsi)this.a).h;
                    synchronized (object2) {
                        ((fsi)this.a).d();
                        return;
                    }
                }
                return;
            }
            case 12: {
                new File(((fsi)this.a).b.getDatabasePath((String)object).getPath().concat(".bak")).delete();
                return;
            }
            case 11: {
                Object object3 = ((fgw)this.a).c;
                object = (eas)object;
                object3.n();
                heg heg2 = (heg)((heg)fgw.a.f()).j("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$2", "onSuccess", 312, "AudioLibraryAudioController.java");
                object = object3 = ((eas)object).c;
                if (object3 == null) {
                    object = ebq.a;
                }
                heg2.u("Mic closing result: %s", object);
                return;
            }
            case 10: {
                ((fgw)this.a).c.l((Uri)object);
                return;
            }
            case 9: {
                object = (Void)object;
                ((heg)((heg)ffo.a.c()).j("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$1", "onSuccess", 185, "NetworkSpeechRecognizer.java")).r("Finished uploading data to S3");
                return;
            }
            case 8: {
                if (((Boolean)object).booleanValue()) {
                    object = (hfk)((hfk)fbj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator$2", "onSuccess", 205, "ZipfileLanguagePackPopulator.java");
                    ezj ezj2 = (ezj)this.a;
                    object.C("Updated file group for group '%s' from location: %s", fbj.c(ezj2), ((ezi)ezj2.f.c()).a);
                    return;
                }
                hfk hfk2 = (hfk)((hfk)fbj.a.g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator$2", "onSuccess", 209, "ZipfileLanguagePackPopulator.java");
                object = (ezj)this.a;
                hfk2.C("Failed to add file group for '%s' from location: %s", fbj.c((ezj)object), ((ezi)((ezj)object).f.c()).a);
                return;
            }
            case 7: {
                object = (Void)object;
                ((heg)((heg)fat.a.b().h(hfo.a, "LanguagePackCBTrigger")).j("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger$1", "onSuccess", 119, "DownloaderCallbacksTrigger.java")).u("%s callback done.", this.a);
                return;
            }
            case 6: {
                object = (Void)object;
                ((hfk)((hfk)ezy.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/backgroundtask/LanguagePackMaintenance$1", "onSuccess", 73, "LanguagePackMaintenance.java")).r("Background LanguagePack updates finished successfully");
                object = dxv.ai.c(1);
                ((ezy)this.a).d.a((dyk)object);
                return;
            }
            case 5: {
                Object object4 = this.a;
                Object object5 = (eas)object;
                po po2 = ((eou)object4).d;
                object = object4 = ((eas)object5).c;
                if (object4 == null) {
                    object = ebq.a;
                }
                object4 = object5 = ebv.b(((eas)object5).d);
                if (object5 == null) {
                    object4 = ebv.a;
                }
                po2.c(elb.h((ebq)object, (ebv)object4));
                return;
            }
            case 4: {
                Object object6 = this.a;
                object = (dzy)object;
                ((efj)object6).g.c(object);
                return;
            }
            case 3: {
                object = (Void)object;
                ctq ctq2 = ((dac)this.a).a.c;
                object = ctq2;
                if (ctq2 == null) {
                    object = ctq.a;
                }
                cyr.d("%s: Successfully incremented LoggingStateStore network usage for %s", "NetworkUsageMonitor", ((ctq)object).c);
                return;
            }
            case 2: {
                object = (csg)object;
                try {
                    this.a.a((csg)object);
                    return;
                }
                catch (Exception exception) {
                    cyr.o(exception, "%s: Listener onComplete failed for group %s", "MobileDataDownload", ((csg)object).c);
                    return;
                }
            }
            case 1: {
                object = (bpx)object;
                return;
            }
            case 0: 
        }
        object = (Void)object;
        ((cms)this.a).f.m(null);
        ((cms)this.a).a();
    }
}

