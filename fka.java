/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Collection;

public final class fka {
    private static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser");
    private static final Duration b = Duration.ofMinutes(5L);
    private static final Duration c = Duration.ofSeconds(5L);
    private static final Duration d = Duration.ofSeconds(10L);
    private final Context e;
    private final feh f;

    public fka(Context context, feh feh2) {
        this.e = context;
        this.f = feh2;
    }

    private static Duration b(Intent object) {
        Duration duration;
        if (((Duration)(object = Duration.ofMillis(object.getIntExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 0)))).compareTo(duration = d) > 0) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getInputCompleteSilenceLength", 367, "RecognitionServiceIntentParser.java")).t("EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH is too high (max is %d), capped to max seconds", duration.getSeconds());
            return duration;
        }
        return object;
    }

    private static Duration c(Intent object) {
        Duration duration = Duration.ofMillis(object.getIntExtra("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS", 0));
        object = duration;
        if (duration.compareTo(b) > 0) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getMinSpeechLength", 353, "RecognitionServiceIntentParser.java")).r("EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS is too high, ignored");
            object = Duration.ZERO;
        }
        return object;
    }

    private static String d(String string, String string2) {
        String string3;
        int n2 = string.length() - string2.length();
        if (n2 < 0) {
            string3 = string;
        } else {
            string3 = string;
            if (string.regionMatches(n2, string2, 0, string2.length())) {
                string3 = string.substring(0, n2);
            }
        }
        return string3;
    }

    /*
     * Unable to fully structure code
     */
    public final fgt a(Intent var1_1, int var2_2, boolean var3_3) {
        block91: {
            block92: {
                block95: {
                    block93: {
                        block94: {
                            block90: {
                                block87: {
                                    block86: {
                                        block89: {
                                            block88: {
                                                block85: {
                                                    block84: {
                                                        block83: {
                                                            block82: {
                                                                block80: {
                                                                    var5_4 = ffi.k(var1_1);
                                                                    var10_5 = fxf.O(this.e.getPackageManager().getNameForUid(var2_2));
                                                                    var9_7 = fxf.O(var1_1.getStringExtra("calling_package"));
                                                                    var11_9 = fka.a;
                                                                    ((heg)((heg)var11_9.c()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getTriggerApplication", 134, "RecognitionServiceIntentParser.java")).u("TriggerApplication %s", var10_5);
                                                                    var8_10 = var10_5;
                                                                    if (!var9_7.isEmpty()) {
                                                                        block81: {
                                                                            if (var10_5.isEmpty()) {
                                                                                ((heg)((heg)var11_9.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getTriggerApplication", 142, "RecognitionServiceIntentParser.java")).u("Trigger application overridden to %s", var9_7);
                                                                            } else {
                                                                                var12_12 = this.e.getPackageManager().getPackagesForUid(var2_2);
                                                                                var8_10 = var10_5;
                                                                                if (var12_12 == null) break block80;
                                                                                var6_13 = Arrays.asList(var12_12).contains(var9_7);
                                                                                var8_10 = var10_5;
                                                                                if (!var6_13) break block80;
                                                                                ((heg)((heg)var11_9.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getTriggerApplication", 148, "RecognitionServiceIntentParser.java")).u("Trigger application overridden to %s", var9_7);
                                                                            }
                                                                            var8_10 = var9_7;
                                                                            break block80;
                                                                            catch (SecurityException var10_6) {
                                                                                var8_10 = var9_7;
                                                                                var9_7 = var10_6;
                                                                                break block81;
                                                                            }
                                                                            catch (SecurityException var9_8) {
                                                                                var8_10 = var10_5;
                                                                            }
                                                                        }
                                                                        ((heg)((heg)((heg)fka.a.h()).i((Throwable)var9_7)).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getTriggerApplication", 151, "RecognitionServiceIntentParser.java")).s("Failed to validate against UID: %d", var2_2);
                                                                    }
                                                                }
                                                                var10_5 = fka.d((String)var8_10, a.af(var2_2, ":"));
                                                                var9_7 = var8_10;
                                                                if (!var10_5.equals(var8_10)) {
                                                                    var9_7 = fka.d(var10_5, ".uid");
                                                                }
                                                                var4_14 = (int)fka.c.toMillis();
                                                                var11_9 = fgu.a();
                                                                var11_9.u(ffi.a(var1_1));
                                                                var11_9.t(ffi.h(var1_1, this.f.m));
                                                                var11_9.K((String)var9_7);
                                                                if (!this.f.i || !"com.google.android.googlequicksearchbox".equals(var9_7) || (var8_10 = fxf.O(var1_1.getStringExtra("calling_package"))).isEmpty()) ** GOTO lbl46
                                                                if (var8_10.startsWith("com.google.android.googlequicksearchbox")) {
                                                                    ((heg)((heg)fka.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getOverrideTriggerApplication", 178, "RecognitionServiceIntentParser.java")).u("Override Trigger application overridden to %s", var8_10);
                                                                } else {
                                                                    ((heg)((heg)fka.a.g()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getOverrideTriggerApplication", 181, "RecognitionServiceIntentParser.java")).r("Ignore client calling package name, invalid AGSA package name.");
lbl46:
                                                                    // 2 sources

                                                                    var8_10 = var9_7;
                                                                }
                                                                var11_9.B((String)var8_10);
                                                                var11_9.o(fgs.c);
                                                                var2_2 = var5_4 != false ? 2 : 3;
                                                                var11_9.d = var2_2;
                                                                var11_9.D(var5_4);
                                                                var11_9.J(var4_14);
                                                                var6_13 = false;
                                                                var11_9.m(var1_1.getBooleanExtra("android.speech.extra.PARTIAL_RESULTS", false));
                                                                var11_9.F(false);
                                                                var5_4 = tt.c() != false && var1_1.hasExtra("android.speech.extra.MASK_OFFENSIVE_WORDS") != false ? var1_1.getBooleanExtra("android.speech.extra.MASK_OFFENSIVE_WORDS", true) : var1_1.getBooleanExtra("com.google.recognition.extra.MASK_OFFENSIVE_WORDS", true);
                                                                var11_9.E(var5_4);
                                                                var11_9.y(false);
                                                                if (tt.c() && var1_1.hasExtra("android.speech.extra.BIASING_STRINGS")) {
                                                                    var8_10 = var1_1.getStringArrayListExtra("android.speech.extra.BIASING_STRINGS");
                                                                    if (var8_10 != null && !var8_10.isEmpty()) {
                                                                        var8_10 = gzx.o((Collection)var8_10);
                                                                    } else {
                                                                        ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getBiasingStrings", 521, "IntentParsingUtil.java")).r("No valid strings passed to EXTRA_BIASING_STRINGS; ignoring it");
                                                                        var2_2 = gzx.d;
                                                                        var8_10 = hct.a;
                                                                    }
                                                                } else {
                                                                    var2_2 = gzx.d;
                                                                    var8_10 = hct.a;
                                                                }
                                                                var11_9.h((gzx)var8_10);
                                                                if (!tt.c() || !var1_1.hasExtra("android.speech.extra.ENABLE_BIASING_DEVICE_CONTEXT")) ** GOTO lbl76
                                                                if (ffi.k(var1_1)) {
                                                                    var5_4 = var1_1.getBooleanExtra("android.speech.extra.ENABLE_BIASING_DEVICE_CONTEXT", false);
                                                                } else {
                                                                    ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getEnableBiasingDeviceContext", 533, "IntentParsingUtil.java")).r("EXTRA_ENABLE_BIASING_DEVICE_CONTEXT can't be used when EXTRA_PREFER_OFFLINE is false");
lbl76:
                                                                    // 2 sources

                                                                    var5_4 = false;
                                                                }
                                                                var11_9.j(var5_4);
                                                                if (!tt.d()) break block82;
                                                                var5_4 = var7_15 = var1_1.getBooleanExtra("android.speech.extra.REQUEST_WORD_TIMING", false);
                                                                if (ffi.k(var1_1)) break block83;
                                                                var5_4 = var7_15;
                                                                if (!var7_15) break block83;
                                                                ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestWordTiming", 605, "IntentParsingUtil.java")).r("Word timing is not supported when EXTRA_PREFER_OFFLINE is false");
                                                            }
                                                            var5_4 = false;
                                                        }
                                                        var11_9.H(var5_4);
                                                        if (!tt.d()) break block84;
                                                        var5_4 = var7_15 = var1_1.getBooleanExtra("android.speech.extra.REQUEST_WORD_CONFIDENCE", false);
                                                        if (ffi.k(var1_1)) break block85;
                                                        var5_4 = var7_15;
                                                        if (!var7_15) break block85;
                                                        ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestWordConfidence", 619, "IntentParsingUtil.java")).r("Word confidence is not supported when EXTRA_PREFER_OFFLINE is false");
                                                    }
                                                    var5_4 = false;
                                                }
                                                var11_9.G(var5_4);
                                                var5_4 = tt.c();
                                                var10_5 = null;
                                                if (!var5_4 || !var1_1.hasExtra("android.speech.extra.ENABLE_FORMATTING")) break block86;
                                                var12_12 = var1_1.getStringExtra("android.speech.extra.ENABLE_FORMATTING");
                                                var8_10 = var10_5;
                                                if (var12_12 == null) break block87;
                                                var2_2 = var12_12.hashCode();
                                                if (var2_2 == -46576386) break block88;
                                                if (var2_2 != 651215103 || !var12_12.equals("quality")) ** GOTO lbl-1000
                                                var2_2 = 0;
                                                break block89;
                                            }
                                            if (var12_12.equals("latency")) {
                                                var2_2 = 1;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var2_2 = -1;
                                            }
                                        }
                                        if (var2_2 != 0) {
                                            if (var2_2 != 1) {
                                                ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getFormattingOptimization", 458, "IntentParsingUtil.java")).r("Wrong value passed to EXTRA_ENABLE_FORMATTING; ignoring it");
                                                var8_10 = var10_5;
                                            } else {
                                                var8_10 = iex.b;
                                            }
                                        } else {
                                            var8_10 = iex.a;
                                        }
                                        break block87;
                                    }
                                    var8_10 = var10_5;
                                    if (var1_1.getBooleanExtra("com.google.recognition.extra.ENABLE_TEXT_FORMATTING", false)) {
                                        var8_10 = iex.a;
                                    }
                                }
                                if (!ffi.k(var1_1) && var8_10 != null) {
                                    ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getFormattingOptimization", 471, "IntentParsingUtil.java")).r("EXTRA_ENABLE_FORMATTING can't be used when EXTRA_PREFER_OFFLINE is false");
                                    var8_10 = Optional.empty();
                                } else {
                                    var8_10 = Optional.ofNullable(var8_10);
                                }
                                if (var8_10.isPresent()) {
                                    var11_9.k((Optional)var8_10);
                                    var5_4 = tt.c() != false ? var1_1.getBooleanExtra("android.speech.extra.HIDE_PARTIAL_TRAILING_PUNCTUATION", false) : false;
                                    var11_9.q(var5_4);
                                }
                                if ((var8_10 = ffi.b(var1_1)).isPresent()) {
                                    var11_9.g((Optional)var8_10);
                                }
                                var8_10 = ffi.j(var1_1);
                                if (!var3_3) break block90;
                                if (var8_10 != null) {
                                    var11_9.w(true);
                                }
                                break block91;
                            }
                            if (var8_10 == null) break block92;
                            var2_2 = var8_10.hashCode();
                            if (var2_2 == -733110353) break block93;
                            if (var2_2 == -604887686) break block94;
                            if (var2_2 != -496591057 || !var8_10.equals("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS")) ** GOTO lbl-1000
                            var2_2 = 2;
                            break block95;
                        }
                        if (!var8_10.equals("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS")) ** GOTO lbl-1000
                        var2_2 = 1;
                        break block95;
                    }
                    if (var8_10.equals("android.speech.extra.AUDIO_SOURCE")) {
                        var2_2 = 0;
                    } else lbl-1000:
                    // 3 sources

                    {
                        var2_2 = -1;
                    }
                }
                if (var2_2 != 0) {
                    if (var2_2 != 1) {
                        if (var2_2 == 2) {
                            var8_10 = fka.b(var1_1);
                            if (!var8_10.isNegative() && !var8_10.isZero()) {
                                var11_9.J((int)var8_10.toMillis());
                                var11_9.w(true);
                            } else {
                                ((heg)((heg)fka.a.g()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "maybeEnableSegmentedSession", 337, "RecognitionServiceIntentParser.java")).r("EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS is not set with positive value; ignoring EXTRA_SEGMENTED_SESSION");
                            }
                        }
                    } else {
                        var8_10 = fka.c(var1_1);
                        if (!var8_10.isNegative() && !var8_10.isZero()) {
                            var11_9.v((int)var8_10.toMillis());
                            var11_9.J(0);
                            var11_9.w(true);
                        } else {
                            ((heg)((heg)fka.a.g()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "maybeEnableSegmentedSession", 323, "RecognitionServiceIntentParser.java")).r("EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS is not set with positive value; ignoring EXTRA_SEGMENTED_SESSION");
                        }
                    }
                } else if (var11_9.a.isPresent()) {
                    var11_9.J(0);
                    var11_9.w(true);
                } else {
                    ((heg)((heg)fka.a.g()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "maybeEnableSegmentedSession", 309, "RecognitionServiceIntentParser.java")).r("EXTRA_AUDIO_SOURCE is not set correctly; ignoring EXTRA_SEGMENTED_SESSION");
                }
                break block91;
            }
            var8_10 = fka.c(var1_1);
            if (!var8_10.isNegative() && !var8_10.isZero()) {
                var11_9.v((int)var8_10.toMillis());
                var11_9.J(0);
                var11_9.w(true);
            } else {
                var8_10 = fka.b(var1_1);
                if (!var8_10.isNegative() && !var8_10.isZero()) {
                    var11_9.J((int)var8_10.toMillis());
                    var11_9.w(true);
                } else if (var11_9.a.isPresent()) {
                    var11_9.J(0);
                    var11_9.w(true);
                }
            }
        }
        if ((var8_10 = tt.d() != false && (var1_1.hasExtra("android.speech.extra.ENABLE_LANGUAGE_DETECTION") != false || var1_1.hasExtra("android.speech.extra.ENABLE_LANGUAGE_SWITCH") != false) ? ffi.c(var1_1, "android.speech.extra.ENABLE_LANGUAGE_DETECTION", "android.speech.extra.LANGUAGE_DETECTION_ALLOWED_LANGUAGES") : ffi.c(var1_1, "android.speech.extras.ENABLE_LANG_ID", "android.speech.extras.LANG_ID_ALLOWED_LANGUAGES")).isPresent()) {
            var11_9.s((Optional)var8_10);
        }
        if ((var8_10 = ffi.d(var1_1)).isPresent()) {
            var11_9.x((Optional)var8_10);
        }
        if (!this.f.b.contains(var9_7) && !var9_7.equals(this.e.getPackageName())) {
            if (this.f.j && !var9_7.contains("com.google.android") && ffi.g(var1_1).equals("web_search")) {
                ((heg)((heg)fka.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "parseIntent", 118, "RecognitionServiceIntentParser.java")).r("#UseS3ExperimentalShort experiment");
                var11_9.c = ffi.g(var1_1);
            }
        } else {
            var9_7 = fka.a;
            ((heg)((heg)var9_7.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "enableFirstPartyAppFeatures", 218, "RecognitionServiceIntentParser.java")).r("#enableFirstPartyAppFeatures");
            var8_10 = var11_9.a();
            var10_5 = var8_10.d;
            var7_15 = var8_10.C;
            var3_3 = var5_4 = var1_1.getBooleanExtra("com.google.recognition.extra.REQUEST_SODA_EVENTS", false);
            if (!ffi.k(var1_1)) {
                var3_3 = var5_4;
                if (var5_4) {
                    ((heg)((heg)var9_7.g()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getRequestSodaEvent", 246, "RecognitionServiceIntentParser.java")).r("EXTRA_REQUEST_SODA_EVENTS can't be used when EXTRA_PREFER_OFFLINE is false");
                    var3_3 = false;
                }
            }
            "com.google.android.apps.recorder".equals(var10_5);
            if (var1_1.hasExtra("com.google.recognition.extra.REQUEST_DIARIZATION") && var1_1.getByteArrayExtra("com.google.recognition.extra.REQUEST_DIARIZATION") != null) {
                if (!ffi.k(var1_1)) {
                    ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getDiarizationConfig", 390, "IntentParsingUtil.java")).r("EXTRA_REQUEST_DIARIZATION can't be used when EXTRA_PREFER_OFFLINE is false");
                    var8_10 = Optional.empty();
                } else {
                    var9_7 = var1_1.getByteArrayExtra("com.google.recognition.extra.REQUEST_DIARIZATION");
                    fxf.K(var9_7);
                    var8_10 = hwj.a();
                    var8_10 = hwv.o(iep.a, (byte[])var9_7, 0, ((Object)var9_7).length, (hwj)var8_10);
                    hwv.D((hwv)var8_10);
                    var9_7 = (iep)var8_10;
                    var12_12 = iek.a.l();
                    if (!var12_12.b.B()) {
                        var12_12.u();
                    }
                    var8_10 = (iek)var12_12.b;
                    var8_10.b |= 2;
                    var8_10.d = false;
                    var8_10 = var9_7;
                    try {
                        if ((var9_7.b & 16) == 0) {
                            var8_10 = (hwp)var9_7.C(5);
                            var8_10.x((hwv)var9_7);
                            var8_10 = (hwr)var8_10;
                            if (!var8_10.b.B()) {
                                var8_10.u();
                            }
                            var9_7 = (iep)var8_10.b;
                            var9_7.f = 2;
                            var9_7.b |= 16;
                            var8_10 = (iep)var8_10.o();
                        }
                        var9_7 = (hwp)var8_10.C(5);
                        var9_7.x((hwv)var8_10);
                        var8_10 = (hwr)var9_7;
                        var8_10.aH(iek.e, (iek)var12_12.o());
                        var8_10 = Optional.of((iep)var8_10.o());
                    }
                    catch (hxn var8_11) {
                        a.as(ffi.a.g(), "Failed to parse diarization config from intent.", "com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getDiarizationConfig", '\u01af', "IntentParsingUtil.java", var8_11);
                        var8_10 = Optional.empty();
                    }
                }
            } else {
                var8_10 = Optional.empty();
            }
            if (var8_10.isPresent()) {
                var11_9.i((Optional)var8_10);
            }
            var11_9.F(var3_3);
            var11_9.y(var1_1.getBooleanExtra("com.google.recognition.extra.MUTE_AUDIO_BEEPS", false));
            var8_10 = var1_1.getStringArrayExtra("com.google.recognition.extra.ADDITIONAL_LANGUAGES");
            if (var8_10 != null && ((String[])var8_10).length != 0) {
                ((heg)((heg)ffi.a.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAdditionalRequestedLanguagesOrEmpty", 227, "IntentParsingUtil.java")).u("Using additional languages specified in RecognizerIntent: %s", Arrays.toString((Object[])var8_10));
                var8_10 = gzx.p((Object[])var8_10);
            } else {
                ((heg)((heg)ffi.a.f()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAdditionalRequestedLanguagesOrEmpty", 224, "IntentParsingUtil.java")).r("No additional languages specified in RecognizerIntent");
                var8_10 = hct.a;
            }
            var11_9.b((gzx)var8_10);
            var11_9.b = ffi.g(var1_1);
            var5_4 = var6_13;
            if (var10_5.equals("com.google.android.as")) {
                var5_4 = var6_13;
                if (var7_15) {
                    var5_4 = var6_13;
                    if (var3_3) {
                        ((heg)((heg)fka.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getEnablePartialAlignments", 379, "RecognitionServiceIntentParser.java")).r("Enabling partial word alignments.");
                        var5_4 = true;
                    }
                }
            }
            var11_9.l(var5_4);
        }
        var11_9.d(fhq.j(var11_9.a(), this.f.a));
        return var11_9;
    }
}

