/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 *  android.text.TextUtils
 */
package org.chromium.base;

import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

public class LocaleUtils {
    private LocaleUtils() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(String string) {
        int n2 = string.hashCode();
        if (n2 != 3365) {
            if (n2 != 3374) {
                if (n2 != 3391) {
                    if (n2 != 3405) {
                        if (n2 != 3704) {
                            if (n2 == 102533 && string.equals("gom")) {
                                return "kok";
                            }
                        } else if (string.equals("tl")) {
                            return "fil";
                        }
                    } else if (string.equals("jw")) {
                        return "jv";
                    }
                } else if (string.equals("ji")) {
                    return "yi";
                }
            } else if (string.equals("iw")) {
                return "he";
            }
        } else if (string.equals("in")) {
            return "id";
        }
        n2 = -1;
        if (n2 == 0) return "kok";
        if (n2 == 1) return "id";
        if (n2 == 2) return "he";
        if (n2 == 3) return "yi";
        if (n2 == 4) return "jv";
        if (n2 == 5) return "fil";
        return string;
    }

    public static String b(Locale locale) {
        String string = LocaleUtils.a(locale.getLanguage());
        String string2 = locale.getCountry();
        if (string.equals("no") && string2.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (string2.isEmpty()) {
            return string;
        }
        return a.ao(string2, string, "-");
    }

    public static String getDefaultCountryCode() {
        Object object = kmt.a();
        object = ((kmt)object).c() ? ((kmt)object).b() : Locale.getDefault().getCountry();
        return object;
    }

    public static String getDefaultLocaleListString() {
        LocaleList localeList = ag$$ExternalSyntheticApiModelOutline1.m();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < ag$$ExternalSyntheticApiModelOutline1.m(localeList); ++i2) {
            Locale locale = ag$$ExternalSyntheticApiModelOutline1.m(localeList, i2);
            String string = locale.getLanguage();
            String string2 = LocaleUtils.a(string);
            Locale locale2 = locale;
            if (!string2.equals(string)) {
                locale2 = new Locale.Builder().setLocale(locale).setLanguage(string2).build();
            }
            arrayList.add(LocaleUtils.b(locale2));
        }
        return TextUtils.join((CharSequence)",", arrayList);
    }

    public static String getDefaultLocaleString() {
        return LocaleUtils.b(Locale.getDefault());
    }
}

