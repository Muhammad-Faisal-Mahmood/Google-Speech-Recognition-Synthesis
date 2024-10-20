/*
 * Decompiled with CFR 0.152.
 */
import java.security.SecureRandom;
import java.util.Random;

public final class ggx
implements imb {
    private final int a;

    public ggx(int n2) {
        this.a = n2;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.a) {
            default: {
                return new imt(3);
            }
            case 19: {
                return new imt(2);
            }
            case 18: {
                return new imt(0);
            }
            case 17: {
                return new imt(1);
            }
            case 16: {
                geo geo2 = geo.a;
                idi.m((Object)geo2);
                return geo2;
            }
            case 15: {
                hav hav2 = hav.s("LATIN_IME", "ANDROID_GSA", "ANDROID_GSA_HIGH_PRIORITY_EVENTS", "AGSA_LEGACY", "AGSA_GOOGLE_APP", "AGSA_NIU", "AGSA_ASSISTANT", "AGSA_LENS", "AGSA_SOUND_SEARCH", "AGSA_ASSISTANT_AUTO", "AGSA_PRONUNCIATION_LEARNING", "AGSA_WEATHER", "AGSA_FACEVIEWER", "AGSA_SCENEVIEWER", "AGSA_MORRIS", "AGSA_LINGO_CAMERA", "AGSA_HOTWORD_LIBRARY", "AGSA_PODCASTS", "AGSA_WEBGLIDE", "AGSA_FEDORA", "AGSA_KAHANI", "AGSA_APA", "AGSA_ASSISTANT_TITAN_TNG", "AGSA_PROACTIVE_ASSISTANT", "AGSA_READ", "AGSA_QUICK_PHRASES", "AGSA_BISTO", "AGSA_INTERPRETER_MODE", "AGSA_INFRASTRUCTURE", "AGSA_TRANSCRIPTION", "AGSA_ASSISTANT_INTERACTOR", "AGSA_RESTRICTED", "AGSA_XBLEND", "AGSA_OMNI", "AGSA_IN_APP_UPDATE_ANDROID", "AGSA_TNG_FINANCE_WIDGET", "ROBIN_ANDROID", "ROBIN_ANDROID_PSEUDO", "AGSA_SEARCH_VIDEO_ANDROID", "AUDIO_LIBRARY_ANDROID", "FEDASS_LOGS", "AGSA_TNG_SPORTS_WIDGET", "AGSA_MDD_ANDROID", "AGSA_SEARCH_XR", "AGSA_HOTWORD_LIBRARY_ANDROID", "AGSA_OMNI_XR", "AGSA_SEAPORT_LIBRARY_ANDROID", "AGSA_GELLER", "ANDROID_GSA_COUNTERS", "AGSA_GOOGLE_APP_COUNTERS", "AGSA_LENS_COUNTERS", "AGSA_INFRASTRUCTURE_COUNTERS", "FEDASS_COUNTERS", "ANDROID_GSA_ANDROID_PRIMES", "CLIENT_LOGGING_PROD", "CRONET_ANDROID_GSA", "ONEGOOGLE_MOBILE", "PHENOTYPE", "SILK_NATIVE", "SODA_CLEARCUT", "STREAMZ_ANDROID_ASSISTANT", "STREAMZ_ANDROID_GSA", "STREAMZ_GELLER_LIBRARY", "STREAMZ_HUBMODE_GSA", "STREAMZ_LENS_ANDROID", "STREAMZ_MOBILE_ASSISTANT", "STREAMZ_OPA_PROACTIVE", "STREAMZ_SODA");
                idi.m(hav2);
                return hav2;
            }
            case 14: {
                return new ilc();
            }
            case 13: {
                hav hav3 = hav.n(idm.f.h);
                idi.m(hav3);
                return hav3;
            }
            case 12: {
                hhh hhh2 = hhj.c;
                String string = hhh2.a;
                int n2 = hhh2.f;
                return new hhh(2, hhh2.b, true, hhh2.d, hhh2.e);
            }
            case 11: {
                iyt iyt2 = new iyt();
                iyt2.b();
                return iyt2.a();
            }
            case 10: {
                hav hav4 = hsi.a;
                idi.m(hav4);
                return hav4;
            }
            case 9: {
                return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker";
            }
            case 8: {
                return "com.google.apps.tiktok.sync.impl.workmanager.SyncWorker";
            }
            case 7: {
                return new SecureRandom();
            }
            case 6: {
                return new pa();
            }
            case 5: {
                return new Random();
            }
            case 4: {
                return new hsn(1);
            }
            case 3: {
                gol gol2 = fxf.aq("provideExtensionRegistry");
                try {
                    hwj hwj2 = hwj.a();
                    idi.m(hwj2);
                    return hwj2;
                }
                finally {
                    gol2.close();
                }
            }
            case 2: {
                return new giw();
            }
            case 1: {
                return new fvc(null);
            }
            case 0: 
        }
        return new ggv();
    }
}

