/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.SharedLibraryVersion;
import java.util.concurrent.atomic.AtomicReference;

public final class cne {
    public static final gzx a;
    public static final gzx b;
    private static final AtomicReference c;
    private static final hei d;

    static {
        c = new AtomicReference<String>("");
        d = hei.m("com/google/android/libraries/assistant/soda/SodaJniLoader");
        a = gzx.t("google_speech_jni", "google_speech_with_aec_jni", "google_speech_sbg_jni", "soda_dev_jni", "soda_jni", "soda_jni_init_google", "soda_jni_wearos", "soda_jni_wearos_init_google", "soda_with_benchmark_jni", "soda_euphonia_jni", "soda_langid_jni", "dps_soda_pixel_s_jni", "dps_soda_jni", "dps_soda_dev_jni");
        b = gzx.r("soda_jni_no_terse", "soda_jni_no_terse_init_google");
    }

    public static void a(Context context) {
        if (!cne.c(context) && !cne.d(context)) {
            ((heg)((heg)d.g()).j("com/google/android/libraries/assistant/soda/SodaJniLoader", "loadNativeLibrary", 78, "SodaJniLoader.java")).r("Unable to load any SODA native library");
        }
    }

    private static void b(String string, String string2) {
        String string3 = c.getAndSet(string2);
        if (!string3.isEmpty() && !string3.equals(string2)) {
            ((heg)((heg)d.g()).j("com/google/android/libraries/assistant/soda/SodaJniLoader", "checkLoadedLibrary", 128, "SodaJniLoader.java")).C("Different native libraries are loaded for the same process. Previously loaded: %s, currently loaded: %s. This may cause unexpected results. See go/odr-violations.", string3, string2);
            return;
        }
        ((heg)((heg)d.f()).j("com/google/android/libraries/assistant/soda/SodaJniLoader", "checkLoadedLibrary", 126, "SodaJniLoader.java")).C("Loaded SODA %s native library: %s", string, string2);
    }

    private static boolean c(Context context) {
        Object object = (String)c.get();
        if (!((String)object).isEmpty() && a.contains(object)) {
            ((heg)((heg)d.f()).j("com/google/android/libraries/assistant/soda/SodaJniLoader", "attemptToLoadFullNativeLibrary", 85, "SodaJniLoader.java")).u("Loaded SODA Full native library: %s previously; skipping new attempt.", object);
            return true;
        }
        object = a;
        int n2 = ((hct)object).c;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = (String)object.get(i2);
            try {
                SharedLibraryVersion.c(context, string);
                cne.b("Full", string);
                return true;
            }
            catch (boo | UnsatisfiedLinkError throwable) {
                continue;
            }
        }
        return false;
    }

    private static boolean d(Context context) {
        Object object = (String)c.get();
        if (!((String)object).isEmpty() && b.contains(object)) {
            ((heg)((heg)d.f()).j("com/google/android/libraries/assistant/soda/SodaJniLoader", "attemptToLoadHotwordNativeLibrary", 105, "SodaJniLoader.java")).u("Loaded SODA Hotword native library: %s previously; skipping new attempt.", object);
            return true;
        }
        object = b;
        int n2 = ((hct)object).c;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = (String)object.get(i2);
            try {
                SharedLibraryVersion.c(context, string);
                cne.b("Hotword", string);
                return true;
            }
            catch (boo | UnsatisfiedLinkError throwable) {
                continue;
            }
        }
        return false;
    }
}

