/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class flc {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/voiceime/ImeUtils");
    private static final Pattern b = Pattern.compile("([a-zA-Z'\"()\\[\\],;]*)(\\p{L}?)([\\w'\"()\\[\\],;]*)");
    private static final Pattern c = Pattern.compile("([a-zA-Z'\"()\\[\\],;]*)(\\p{L}?)([\\w'\"()\\[\\],;]*\\s*)");
    private static final Pattern d = Pattern.compile("(\\p{L}+?)([a-zA-Z]*)");
    private static final Pattern e = Pattern.compile("\\p{Punct}*");

    static int a(CharSequence charSequence, boolean bl2) {
        return flc.e(charSequence, bl2, 0);
    }

    static String b(String string, CharSequence charSequence, int n2) {
        int n3 = charSequence == null ? 0 : charSequence.length();
        charSequence = n3 == 0 ? string : String.valueOf(String.valueOf(charSequence)).concat(String.valueOf(string));
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (TextUtils.getCapsMode((CharSequence)charSequence, (int)(i2 + n3), (int)(n2 & 0x7000)) != 0) {
                stringBuilder.append(Character.toUpperCase(string.charAt(i2)));
                continue;
            }
            stringBuilder.append(string.charAt(i2));
        }
        return stringBuilder.toString();
    }

    public static boolean c(String string) {
        return !TextUtils.isEmpty((CharSequence)string) && e.matcher(string).matches();
    }

    static int d(CharSequence charSequence) {
        return flc.e(charSequence, false, 1);
    }

    private static int e(CharSequence object, boolean bl2, int n2) {
        if (!TextUtils.isEmpty((CharSequence)object)) {
            Object object2;
            Serializable serializable;
            if (n2 == 0) {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append((CharSequence)object);
                object = ((StringBuilder)serializable).reverse().toString();
            }
            if (((Matcher)(object2 = ((Pattern)(serializable = b)).matcher((CharSequence)object))).find()) {
                String string = ((Matcher)object2).group();
                String string2 = ((Matcher)object2).group(2);
                boolean bl3 = true;
                String string3 = ((Matcher)object2).group(1);
                String string4 = ((Matcher)object2).group(3);
                string3 = String.valueOf(string3);
                string4 = String.valueOf(string4);
                if (string2 != null) {
                    Object object3 = d.matcher(string);
                    boolean bl4 = ((Matcher)object3).find() && (object3 = ((Matcher)object3).group(2)) != null && ((String)object3).length() > 0;
                    boolean bl5 = string.equals(((Matcher)object2).group(1));
                    boolean bl6 = !bl5 && !bl4 && string.startsWith(string2);
                    object2 = (heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/voiceime/ImeUtils", "getWordLength", 194, "ImeUtils.java");
                    if (bl5 || bl6) {
                        bl3 = false;
                    }
                    object2.T(string, bl5, string3.concat(string4), bl4, bl6, string2, bl3, bl2, n2);
                    if (bl6) {
                        if (n2 != 0) {
                            return string2.length();
                        }
                    } else {
                        if (bl2) {
                            serializable = c;
                        }
                        if (((Matcher)(object = ((Pattern)serializable).matcher((CharSequence)object))).find()) {
                            return ((Matcher)object).group().length();
                        }
                    }
                }
            }
        }
        return 0;
    }
}

