/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 */
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j$.util.Optional;
import java.io.IOException;
import java.util.Locale;

public final class ffi {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil");

    public static int a(Intent intent) {
        int n2 = intent.getIntExtra("android.speech.extra.MAX_RESULTS", 1);
        if (n2 <= 0) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedMaxResultsOrOne", 241, "IntentParsingUtil.java")).s("Unsupported EXTRA_MAX_RESULTS %d", n2);
            return 1;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Optional b(Intent object) {
        block19: {
            feu feu2;
            block18: {
                Parcelable parcelable;
                block17: {
                    if (tt.c() && object.hasExtra("android.speech.extra.AUDIO_SOURCE")) {
                        feu feu3 = fev.a();
                        Parcelable parcelable2 = object.getParcelableExtra("android.speech.extra.AUDIO_SOURCE");
                        if (!(parcelable2 instanceof ParcelFileDescriptor)) {
                            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", 324, "IntentParsingUtil.java")).r("No valid audio source passed to EXTRA_AUDIO_SOURCE; ignoring audio source");
                            return Optional.empty();
                        }
                        parcelable2 = (ParcelFileDescriptor)parcelable2;
                        try {
                            feu3.e(Optional.of(parcelable2.dup()));
                        }
                        catch (IOException iOException) {
                            a.as(a.g(), "Failed to dup the ParcelFileDescriptor.", "com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", '\u014e', "IntentParsingUtil.java", iOException);
                            return Optional.empty();
                        }
                        int n2 = object.getIntExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                        if (n2 > 0 && n2 <= 2) {
                            feu3.c(n2);
                            n2 = object.getIntExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                            if (n2 <= 0) {
                                ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", 356, "IntentParsingUtil.java")).r("Invalid value passed to EXTRA_AUDIO_SOURCE_ENCODING; value must come from AudioFormat; ignoring audio source");
                                return Optional.empty();
                            }
                            feu3.d(n2);
                            n2 = object.getIntExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
                            if (n2 <= 0) {
                                ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", 368, "IntentParsingUtil.java")).r("Invalid value passed to EXTRA_AUDIO_SOURCE_SAMPLING_RATE; ignoring audio source");
                                return Optional.empty();
                            }
                            feu3.g(n2);
                            feu3.f(object.getBooleanExtra("com.google.recognition.extra.EXTRA_AUDIO_SOURCE_NON_MIC", false) ^ true);
                            return Optional.of(feu3.a());
                        }
                        ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", 343, "IntentParsingUtil.java")).s("EXTRA_AUDIO_SOURCE_CHANNEL_COUNT must be 1 or 2; passed value is %d; ignoring audio source", n2);
                        return Optional.empty();
                    }
                    if (!object.hasExtra("com.google.recognition.extra.AUDIO_SOURCE")) {
                        return Optional.empty();
                    }
                    feu2 = fev.a();
                    parcelable = object.getParcelableExtra("com.google.recognition.extra.AUDIO_SOURCE");
                    if (parcelable == null) {
                        return Optional.empty();
                    }
                    if (!(parcelable instanceof Uri)) break block17;
                    ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 263, "IntentParsingUtil.java")).r("Audio source is passed in format of URI");
                    parcelable = (Uri)parcelable;
                    if (a.k(parcelable, Uri.EMPTY)) {
                        return Optional.empty();
                    }
                    feu2.h(Optional.of(parcelable));
                    break block18;
                }
                if (!(parcelable instanceof ParcelFileDescriptor)) break block19;
                ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 270, "IntentParsingUtil.java")).r("Audio source is passed in format of ParcelFileDescriptor");
                parcelable = (ParcelFileDescriptor)parcelable;
                try {
                    feu2.e(Optional.of(parcelable.dup()));
                }
                catch (IOException iOException) {
                    a.as(a.g(), "Failed to dup the ParcelFileDescriptor.", "com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", '\u0115', "IntentParsingUtil.java", iOException);
                    return Optional.empty();
                }
            }
            int n3 = object.getIntExtra("com.google.recognition.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
            if (n3 > 0 && n3 <= 2) {
                feu2.c(n3);
                n3 = object.getIntExtra("com.google.recognition.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
                if (n3 <= 0) {
                    ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 304, "IntentParsingUtil.java")).r("Invalid value passed to EXTRA_AUDIO_SOURCE_SAMPLING_RATE; ignoring audio source");
                    return Optional.empty();
                }
                feu2.g(n3);
                feu2.f(object.getBooleanExtra("com.google.recognition.extra.EXTRA_AUDIO_SOURCE_NON_MIC", false) ^ true);
                return Optional.of(feu2.a());
            }
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 292, "IntentParsingUtil.java")).s("EXTRA_AUDIO_SOURCE_CHANNEL_COUNT must be 1 or 2; passed value is %d", n3);
            return Optional.empty();
        }
        ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 281, "IntentParsingUtil.java")).r("Audio source is passed in wrong format. Formats accepted are URI And ParcelFileDescriptor.");
        return Optional.empty();
    }

    public static Optional c(Intent object, String object2, String string) {
        if (!object.getBooleanExtra((String)object2, false) && ffi.d((Intent)object).isEmpty()) {
            return Optional.empty();
        }
        if (!ffi.k((Intent)object)) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getLangIdConfig", 568, "IntentParsingUtil.java")).r("Language detection can't be enabled when EXTRA_PREFER_OFFLINE is false");
            return Optional.empty();
        }
        object2 = ies.a.l();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        ies.c((ies)((hwp)object2).b);
        if (object.hasExtra(string) && (object = object.getStringArrayListExtra(string)) != null && !object.isEmpty()) {
            ((hwp)object2).Q((Iterable)object);
        }
        return Optional.of((ies)((hwp)object2).o());
    }

    public static Optional d(Intent intent) {
        if (tt.d() && intent.hasExtra("android.speech.extra.ENABLE_LANGUAGE_SWITCH")) {
            return ffi.l(intent, "android.speech.extra.ENABLE_LANGUAGE_SWITCH", "android.speech.extra.LANGUAGE_SWITCH_ALLOWED_LANGUAGES");
        }
        return ffi.l(intent, "android.speech.extras.ENABLE_MULTILANG", "android.speech.extras.MULTILANG_ALLOWED_LANGUAGES");
    }

    public static Optional e(Intent object) {
        if (eyx.a.e.equals(object = object.getStringExtra("android.speech.extra.GET_AUDIO_FORMAT"))) {
            return Optional.of(icq.d);
        }
        if (eyx.b.e.equals(object)) {
            return Optional.of(icq.j);
        }
        if (object != null) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedAudioEncoding", 101, "IntentParsingUtil.java")).G("The audio format is not supported [requested=%s supported=[%s, %s]]", object, eyx.a.e, eyx.b.e);
        }
        return Optional.empty();
    }

    public static String f(Activity object) {
        Intent intent = object.getIntent();
        object = object.getCallingPackage() != null ? object.getCallingPackage() : ((object = (PendingIntent)intent.getParcelableExtra("android.speech.extra.RESULTS_PENDINGINTENT")) != null ? object.getCreatorPackage() : "");
        Object object2 = object;
        if ("android".equals(object)) {
            object2 = object;
            if (intent.hasExtra("calling_package")) {
                object2 = intent.getStringExtra("calling_package");
            }
        }
        return fxf.O((String)object2);
    }

    public static String g(Intent intent) {
        if (!intent.hasExtra("android.speech.extra.LANGUAGE_MODEL")) {
            return "";
        }
        return fxf.O(intent.getStringExtra("android.speech.extra.LANGUAGE_MODEL"));
    }

    public static String h(Intent object, boolean bl2) {
        String string = object.getStringExtra("android.speech.extra.LANGUAGE");
        object = string;
        if (string == null) {
            object = "";
        }
        return ffi.i((String)object, bl2);
    }

    public static String i(String string, boolean bl2) {
        hei hei2 = a;
        ((heg)((heg)hei2.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedLanguageOrSystemDefault", 136, "IntentParsingUtil.java")).u("enableLocaleValidation: %s", bl2);
        if (bl2) {
            if (fxf.P(string)) {
                string = ffi.m(Locale.forLanguageTag(Locale.getDefault().toLanguageTag()));
                ((heg)((heg)hei2.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedLanguageOrSystemDefault", 141, "IntentParsingUtil.java")).u("Using Locale.getDefault() for recognition: %s", string);
                return string;
            }
            ((heg)((heg)hei2.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedLanguageOrSystemDefault", 144, "IntentParsingUtil.java")).u("Using language specified in RecognizerIntent: %s", string);
            return ffi.m(Locale.forLanguageTag(string));
        }
        if (fxf.P(string)) {
            string = Locale.getDefault().toLanguageTag();
            ((heg)((heg)hei2.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedLanguageOrSystemDefault", 150, "IntentParsingUtil.java")).u("Using Locale.getDefault() for recognition: %s", string);
            return string;
        }
        ((heg)((heg)hei2.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedLanguageOrSystemDefault", 153, "IntentParsingUtil.java")).u("Using language specified in RecognizerIntent: %s", string);
        return string;
    }

    public static String j(Intent object) {
        if (tt.c() && object.hasExtra("android.speech.extra.SEGMENTED_SESSION")) {
            if ((object = object.getStringExtra("android.speech.extra.SEGMENTED_SESSION")) != null && (((String)object).equals("android.speech.extra.AUDIO_SOURCE") || ((String)object).equals("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS") || ((String)object).equals("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS"))) {
                return object;
            }
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSegmentedSessionType", 500, "IntentParsingUtil.java")).r("Wrong value passed to EXTRA_SEGMENTED_SESSION; ignoring it");
            return "";
        }
        return null;
    }

    public static boolean k(Intent intent) {
        return intent.getBooleanExtra("android.speech.extra.PREFER_OFFLINE", false);
    }

    /*
     * Unable to fully structure code
     */
    private static Optional l(Intent var0, String var1_1, String var2_2) {
        block21: {
            block20: {
                block26: {
                    block29: {
                        block27: {
                            block28: {
                                block22: {
                                    block25: {
                                        block23: {
                                            block24: {
                                                if (!var0.hasExtra((String)var1_1)) {
                                                    return Optional.empty();
                                                }
                                                if (!ffi.k((Intent)var0)) break block21;
                                                var4_3 = var0.getStringExtra((String)var1_1);
                                                if (var4_3 == null) {
                                                    while (true) {
                                                        var3_4 = 0;
                                                        break block20;
                                                        break;
                                                    }
                                                }
                                                if (!tt.d()) break block22;
                                                var3_4 = var4_3.hashCode();
                                                if (var3_4 == -2139887071) break block23;
                                                if (var3_4 == -1924829944) break block24;
                                                if (var3_4 != 2095348307 || !var4_3.equals("quick_response")) ** GOTO lbl-1000
                                                var3_4 = 2;
                                                break block25;
                                            }
                                            if (!var4_3.equals("balanced")) ** GOTO lbl-1000
                                            var3_4 = 1;
                                            break block25;
                                        }
                                        if (var4_3.equals("high_precision")) {
                                            var3_4 = 0;
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            var3_4 = -1;
                                        }
                                    }
                                    if (var3_4 == 0) break block26;
                                    if (var3_4 == 1) ** GOTO lbl-1000
                                    if (var3_4 == 2) ** GOTO lbl48
                                }
                                if ((var3_4 = var4_3.hashCode()) == -2139887071) break block27;
                                if (var3_4 == -1924829944) break block28;
                                if (var3_4 != 168441208 || !var4_3.equals("low_reaction_time")) ** GOTO lbl-1000
                                var3_4 = 2;
                                break block29;
                            }
                            if (!var4_3.equals("balanced")) ** GOTO lbl-1000
                            var3_4 = 1;
                            break block29;
                        }
                        if (var4_3.equals("high_precision")) {
                            var3_4 = 0;
                        } else lbl-1000:
                        // 3 sources

                        {
                            var3_4 = -1;
                        }
                    }
                    if (var3_4 == 0) break block26;
                    ** if (var3_4 == 1) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        if (var3_4 != 2) ** continue;
lbl48:
                        // 2 sources

                        var3_4 = 3;
                        ** GOTO lbl55
                    }
lbl-1000:
                    // 2 sources

                    {
                        var3_4 = 2;
                    }
                    break block20;
                }
                var3_4 = 1;
            }
            if (var3_4 == 0) {
                ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getMultilangConfig", 643, "IntentParsingUtil.java")).u("Wrong value passed to %s; ignoring it", var1_1);
                return Optional.empty();
            }
            var1_1 = ffl.a.l();
            if (!var1_1.b.B()) {
                var1_1.u();
            }
            var4_3 = (ffl)var1_1.b;
            var4_3.c = var3_4 - 1;
            var4_3.b |= 1;
            var3_4 = tt.e() != false && var0.hasExtra("android.speech.extra.LANGUAGE_SWITCH_MAX_SWITCHES") != false ? var0.getIntExtra("android.speech.extra.LANGUAGE_SWITCH_MAX_SWITCHES", 0) : 0;
            if (var0.hasExtra("android.speech.extras.MULTILANG_MAX_NUM_OF_SWITCHES")) {
                var3_4 = var0.getIntExtra("android.speech.extras.MULTILANG_MAX_NUM_OF_SWITCHES", 0);
            }
            if (var3_4 > 0) {
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var4_3 = (ffl)var1_1.b;
                var4_3.b |= 2;
                var4_3.e = var3_4;
            }
            var3_4 = tt.e() != false && var0.hasExtra("android.speech.extra.LANGUAGE_SWITCH_INITIAL_ACTIVE_DURATION_TIME_MILLIS") != false ? var0.getIntExtra("android.speech.extra.LANGUAGE_SWITCH_INITIAL_ACTIVE_DURATION_TIME_MILLIS", 0) : 0;
            if (var0.hasExtra("android.speech.extras.MULTILANG_NO_SWITCH_AFTER_TIME_MS")) {
                var3_4 = var0.getIntExtra("android.speech.extras.MULTILANG_NO_SWITCH_AFTER_TIME_MS", 0);
            }
            if (var3_4 > 0) {
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var4_3 = (ffl)var1_1.b;
                var4_3.b |= 4;
                var4_3.f = var3_4;
            }
            if (var0.hasExtra(var2_2) && (var0 = var0.getStringArrayListExtra(var2_2)) != null && !var0.isEmpty()) {
                var1_1.K((Iterable)var0);
            }
            return Optional.of((ffl)var1_1.o());
        }
        ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getMultilangConfig", 637, "IntentParsingUtil.java")).r("Language switch can't be enabled when EXTRA_PREFER_OFFLINE is false");
        return Optional.empty();
    }

    private static String m(Locale locale) {
        StringBuilder stringBuilder = new StringBuilder();
        if (locale.getLanguage().isEmpty()) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSystemValidLocale", 175, "IntentParsingUtil.java")).u("Language code is invalid or empty: %s. Use default en-US locale.", locale.getLanguage());
            return "en-US";
        }
        if (locale.getLanguage().equals("in")) {
            stringBuilder.append("id");
        } else if (locale.getLanguage().equals("iw")) {
            stringBuilder.append("he");
        } else if (locale.getLanguage().equals("ji")) {
            stringBuilder.append("yi");
        } else {
            stringBuilder.append(locale.getLanguage());
        }
        if (!locale.getScript().isEmpty()) {
            stringBuilder.append("-");
            stringBuilder.append(locale.getScript());
        }
        if (locale.getCountry().isEmpty()) {
            if (locale.getLanguage().equals("sw")) {
                ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSystemValidLocale", 199, "IntentParsingUtil.java")).u("Special locale sw used: %s.", "Kiswahili (Kenya)");
                return stringBuilder.toString();
            }
            if (locale.getLanguage().equals("ar")) {
                ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSystemValidLocale", 203, "IntentParsingUtil.java")).u("Special locale ar-x-gulf used: %s.", "Arabic (Gulf)");
                return "ar-x-gulf";
            }
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSystemValidLocale", 207, "IntentParsingUtil.java")).u("Country code is invalid or empty: %s. Use default en-US locale.", locale.getCountry());
            return "en-US";
        }
        stringBuilder.append("-");
        stringBuilder.append(locale.getCountry());
        return stringBuilder.toString();
    }
}

