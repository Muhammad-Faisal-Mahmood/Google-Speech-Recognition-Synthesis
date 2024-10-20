/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;

public final class brz {
    public static final Map a;
    private static final hei b;
    private static final hac c;
    private static final Map d;
    private static final Map e;
    private static final Map f;
    private static final Map g;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Locale locale;
        String string;
        b = hei.m("com/google/android/apps/speech/tts/googletts/common/locales/LocalesHelper");
        fvd.aj("cmn-cn", "zh-CN");
        fvd.aj("cmn-tw", "zh-TW");
        int n2 = 0;
        c = hcy.a(2, new Object[]{"cmn-cn", "zh-CN", "cmn-tw", "zh-TW"});
        String[] stringArray = new HashMap();
        Object object = Locale.getISOLanguages();
        int n3 = ((String[])object).length;
        int n4 = 0;
        while (true) {
            if (n4 >= n3) break;
            string = object[n4];
            try {
                if (!string.equals("zz")) {
                    locale = new Locale(string);
                    stringArray.put(brz.b(locale), string);
                }
            }
            catch (MissingResourceException missingResourceException) {}
            ++n4;
        }
        d = DesugarCollections.unmodifiableMap(stringArray);
        object = new HashMap();
        stringArray = Locale.getISOCountries();
        n3 = stringArray.length;
        n4 = n2;
        while (true) {
            if (n4 >= n3) {
                e = DesugarCollections.unmodifiableMap(object);
                f = new ConcurrentHashMap();
                a = new ConcurrentHashMap();
                g = new ConcurrentHashMap();
                new ConcurrentHashMap();
                return;
            }
            string = stringArray[n4];
            try {
                if (!string.equalsIgnoreCase("ZZ")) {
                    locale = new Locale("", string);
                    ((HashMap)object).put(locale.getISO3Country(), string);
                }
            }
            catch (MissingResourceException missingResourceException) {}
            ++n4;
        }
    }

    public static brx a(String string) {
        if (string == null) {
            ((heg)((heg)b.g()).j("com/google/android/apps/speech/tts/googletts/common/locales/LocalesHelper", "createFromString", 150, "LocalesHelper.java")).u("Invalid locale string: %s", null);
            return null;
        }
        String[] stringArray = brz.k(string);
        int n2 = stringArray.length;
        if (n2 == 1) {
            return new brx(stringArray[0]);
        }
        if (n2 == 2) {
            return new brx(stringArray[0], stringArray[1]);
        }
        if (n2 == 3) {
            return new brx(stringArray[0], stringArray[1], stringArray[2]);
        }
        ((heg)((heg)b.g()).j("com/google/android/apps/speech/tts/googletts/common/locales/LocalesHelper", "createFromString", 164, "LocalesHelper.java")).u("Invalid locale string: %s", string);
        return null;
    }

    public static String b(Locale locale) {
        if (locale.getLanguage().equalsIgnoreCase("yue")) {
            return "yue";
        }
        String string = locale.getISO3Language();
        if (string.isEmpty()) {
            ((heg)((heg)b.h()).j("com/google/android/apps/speech/tts/googletts/common/locales/LocalesHelper", "safeGetISO3Language", 255, "LocalesHelper.java")).u("Locale#getISO3Language() for %s is empty", locale);
        }
        return string;
    }

    public static String c(String string) {
        String string2 = (String)c.get(string.toLowerCase(Locale.US));
        if (string2 != null) {
            return string2;
        }
        return string;
    }

    public static List d(buc object) {
        if (!((buc)object).d.isEmpty()) {
            ArrayList<brx> arrayList = new ArrayList<brx>(((buc)object).d.size());
            for (String string : ((buc)object).d) {
                brx brx2 = brz.a(string);
                if (brx2 != null) {
                    arrayList.add(brx2);
                    continue;
                }
                throw new IllegalStateException("Error converting to locale: ".concat(String.valueOf(string)));
            }
            return arrayList;
        }
        throw new IllegalStateException("Every voice needs to support at least one locale");
    }

    public static Locale e(String string) {
        if (string.startsWith("cmn")) {
            return Locale.forLanguageTag(string.replaceFirst("cmn", "zh"));
        }
        return Locale.forLanguageTag(string);
    }

    public static Locale f(String string, String string2) {
        if (!string2.isEmpty()) {
            return new Locale.Builder().setLanguage(string).setRegion(string2).build();
        }
        return Locale.forLanguageTag(string.replace('_', '-'));
    }

    public static Locale g(String string) {
        Map map = f;
        Locale locale = (Locale)map.get(string);
        if (locale != null) {
            return locale;
        }
        String[] stringArray = brz.k(string);
        int n2 = stringArray.length;
        if (n2 == 1) {
            locale = new Locale(stringArray[0]);
            map.put(string, locale);
        } else if (n2 == 2) {
            locale = new Locale(stringArray[0], stringArray[1]);
            map.put(string, locale);
        } else if (n2 == 3) {
            locale = new Locale(stringArray[0], stringArray[1], stringArray[2]);
            map.put(string, locale);
        } else if (n2 >= 4) {
            locale = new Locale(stringArray[0], stringArray[1], stringArray[2]);
            map.put(string, locale);
        }
        if (locale != null) {
            return locale;
        }
        throw new IllegalArgumentException("Invalid locale: ".concat(String.valueOf(string)));
    }

    public static Locale h(Locale locale) {
        String string;
        String string2;
        String string3 = string2 = locale.getLanguage();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            string = (String)d.get(string2);
            string3 = string2;
            if (string != null) {
                string3 = string;
            }
        }
        string = string2 = locale.getCountry();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            String string4 = (String)e.get(string2);
            string = string2;
            if (string4 != null) {
                string = string4;
            }
        }
        return new Locale(string3, string, locale.getVariant());
    }

    public static boolean i(Locale locale, Locale locale2) {
        return locale.getCountry().equals(locale2.getCountry()) && locale.getLanguage().equals(locale2.getLanguage());
    }

    public static boolean j(Locale locale, String object) {
        boolean bl2;
        block2: {
            Locale.getDefault();
            bl2 = false;
            try {
                object = brz.g((String)object);
                if (locale == null) break block2;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ((heg)((heg)b.h()).j("com/google/android/apps/speech/tts/googletts/common/locales/LocalesHelper", "localesEqualMaybeOnlyLanguage", 358, "LocalesHelper.java")).r("Unable to determine locale from strings.");
                return false;
            }
            bl2 = locale.getCountry().isEmpty() ? locale.getLanguage().equals(((Locale)object).getLanguage()) : brz.i(locale, (Locale)object);
        }
        return bl2;
    }

    public static String[] k(String string) {
        Map map = g;
        String[] stringArray = (String[])map.get(string);
        if (stringArray != null) {
            return stringArray;
        }
        stringArray = string.split("-|_");
        map.put(string, stringArray);
        return stringArray;
    }
}

