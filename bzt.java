/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 */
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Locale;

public final class bzt {
    private static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/util/FrameworkSettingsHelper");

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static Locale a(Context object) {
        Object object2;
        int n2;
        object = Settings.Secure.getString((ContentResolver)object.getContentResolver(), (String)"tts_default_locale");
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        Object object3 = null;
        boolean bl3 = true;
        while (true) {
            block9: {
                block8: {
                    int n3;
                    block7: {
                        if (!bl3 || (bl3 = false)) break block7;
                        if (bl2) break block8;
                        object = ((String)object).split(",");
                        n3 = ((Object)object).length;
                        n2 = 0;
                    }
                    if (n2 < n3) break block9;
                }
                object = null;
                break;
            }
            object2 = object[n2];
            int n4 = ((String)object2).indexOf(58);
            if (n4 > 0 && "com.google.android.tts".equals(((String)object2).substring(0, n4))) {
                object = ((String)object2).substring(n4 + 1);
                break;
            }
            ++n2;
        }
        object2 = object3;
        if (TextUtils.isEmpty((CharSequence)object)) return object2;
        if (TextUtils.isEmpty((CharSequence)object)) {
            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/FrameworkSettingsHelper", "parsePreferredLocale", 58, "FrameworkSettingsHelper.java")).r("Failed to convert empty string to locale");
            return object3;
        }
        String[] stringArray = ((String)object).split("[_-]");
        String string = stringArray[0].toLowerCase(Locale.getDefault());
        n2 = stringArray.length;
        if (n2 > 3) {
            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/FrameworkSettingsHelper", "parsePreferredLocale", 46, "FrameworkSettingsHelper.java")).u("Failed to convert %s to a valid Locale object. Too many seperators", object);
            return object3;
        }
        object2 = "";
        object = n2 >= 2 ? stringArray[1].toUpperCase(Locale.getDefault()) : "";
        if (n2 < 3) return brz.h(new Locale(string, (String)object, (String)object2));
        object2 = stringArray[2];
        return brz.h(new Locale(string, (String)object, (String)object2));
    }
}

