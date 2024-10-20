/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import j$.util.Collection$_EL;
import java.util.Collection;
import java.util.List;

public final class cur
implements hpb {
    private final int a;

    public cur(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(Throwable throwable) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                a.as(fgw.a.g(), "Can't acquire audio focus!", "com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$4", "onFailure", '\u017a', "AudioLibraryAudioController.java", throwable);
                                return;
                            }
                            a.as(fgw.a.g(), "Can't release audio focus!", "com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$3", "onFailure", '\u0150', "AudioLibraryAudioController.java", throwable);
                            return;
                        }
                        ((hfk)((hfk)((hfk)fbm.a.h()).i(throwable)).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl$1", "onFailure", 182, "ZipfileLanguagePackSourceImpl.java")).r("Pending LP download pings failed.");
                        return;
                    }
                    ((hfk)((hfk)((hfk)fbj.a.g()).i(throwable)).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator$3", "onFailure", 361, "ZipfileLanguagePackPopulator.java")).r("Failed to remove LanguagePack file groups");
                    return;
                }
                if (Log.isLoggable((String)"ClearcutMetricXmitter", (int)4)) {
                    Log.i((String)"ClearcutMetricXmitter", (String)"Transmission has failed: ".concat(String.valueOf(String.valueOf(throwable))));
                }
                return;
            }
            ((heg)((heg)btj.a.h()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader$1", "onFailure", 228, "VoiceDataDownloader.java")).r("Initialization failed. Will retry on subsequent voice syncs.");
            return;
        }
        cyr.n("%s: Failed to commitToFlagSnapshot: %s", "MobileDataDownloadTikTokBuilder", throwable);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        int n2 = this.a;
        if (n2 != 0) {
            int n3 = 1;
            int n4 = 1;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                object = (dzv)object;
                                heg heg2 = (heg)((heg)fgw.a.f()).j("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$4", "onSuccess", 372, "AudioLibraryAudioController.java");
                                n3 = dox.e(((dzv)object).c);
                                if (n3 == 0) {
                                    n3 = n4;
                                }
                                heg2.u("Audio focus acquiring status: %s", dox.d(n3));
                                return;
                            }
                            object = (dzy)object;
                            heg heg3 = (heg)((heg)fgw.a.f()).j("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController$3", "onSuccess", 330, "AudioLibraryAudioController.java");
                            n4 = dox.c(((dzy)object).c);
                            if (n4 != 0) {
                                n3 = n4;
                            }
                            heg3.u("Audio focus releasing status: %s", dox.b(n3));
                            return;
                        }
                        object = (gzx)object;
                        ((hfk)((hfk)fbm.a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl$1", "onSuccess", 175, "ZipfileLanguagePackSourceImpl.java")).u("Pinged LP downloads for packs: [%s]", ezj.a((Collection)object));
                        return;
                    }
                    if ((object = (List)object).isEmpty()) {
                        return;
                    }
                    if (Collection$_EL.stream((Collection)object).allMatch(new fay(7))) {
                        ((hfk)((hfk)fbj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator$3", "onSuccess", 350, "ZipfileLanguagePackPopulator.java")).s("Successfully removed %d LanguagePack file groups", object.size());
                        return;
                    }
                    ((hfk)((hfk)fbj.a.g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator$3", "onSuccess", 353, "ZipfileLanguagePackPopulator.java")).t("Failed to completely remove LanguagePack file groups. %d remain.", Collection$_EL.stream((Collection)object).filter(new fay(8)).count());
                    return;
                }
                object = (Void)object;
                return;
            }
            object = (dbx)object;
            ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader$1", "onSuccess", 223, "VoiceDataDownloader.java")).r("Successfully initialized Superpacks.");
            return;
        }
        object = (Void)object;
        cyr.c("%s: Succeeded commitToFlagSnapshot.", "MobileDataDownloadTikTokBuilder");
    }
}

