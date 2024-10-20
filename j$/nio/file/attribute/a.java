/*
 * Decompiled with CFR 0.152.
 */
package j$.nio.file.attribute;

import j$.time.format.B;
import j$.util.Objects;
import j$.util.function.e;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.IntConsumer;

public abstract class a {
    public static e a(IntConsumer intConsumer, IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new e(intConsumer, intConsumer2);
    }

    private static String b(int n2, String object, Locale cloneable) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        object = new SimpleDateFormat((String)object, (Locale)cloneable);
        ((DateFormat)object).setTimeZone(timeZone);
        cloneable = Calendar.getInstance();
        ((Calendar)cloneable).setTimeZone(timeZone);
        ((Calendar)cloneable).set(2016, 1, n2, 0, 0, 0);
        return ((DateFormat)object).format(((Calendar)cloneable).getTime());
    }

    private static String c(int n2, String object, Locale cloneable) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        object = new SimpleDateFormat((String)object, (Locale)cloneable);
        ((DateFormat)object).setTimeZone(timeZone);
        cloneable = Calendar.getInstance();
        ((Calendar)cloneable).setTimeZone(timeZone);
        ((Calendar)cloneable).set(0, n2, 0, 0, 0, 0);
        return ((DateFormat)object).format(((Calendar)cloneable).getTime());
    }

    public static void d(HashMap hashMap, DateFormatSymbols cloneable, Locale locale) {
        int n2 = ((DateFormatSymbols)cloneable).getWeekdays().length;
        cloneable = new LinkedHashMap();
        LinkedHashMap<Long, String> linkedHashMap = new LinkedHashMap<Long, String>();
        LinkedHashMap<Long, String> linkedHashMap2 = new LinkedHashMap<Long, String>();
        for (int i2 = 1; i2 <= n2; ++i2) {
            String string = a.b(i2, "cccc", locale);
            long l2 = i2;
            cloneable.put(l2, string);
            linkedHashMap.put(l2, string.substring(0, Character.charCount(string.codePointAt(0))));
            linkedHashMap2.put(l2, a.b(i2, "ccc", locale));
        }
        if (n2 > 0) {
            hashMap.put(B.FULL_STANDALONE, cloneable);
            hashMap.put(B.NARROW_STANDALONE, linkedHashMap);
            hashMap.put(B.SHORT_STANDALONE, linkedHashMap2);
        }
    }

    public static void e(HashMap hashMap, DateFormatSymbols cloneable, Locale locale) {
        int n2 = ((DateFormatSymbols)cloneable).getMonths().length;
        cloneable = new LinkedHashMap();
        LinkedHashMap<Long, String> linkedHashMap = new LinkedHashMap<Long, String>();
        LinkedHashMap<Long, String> linkedHashMap2 = new LinkedHashMap<Long, String>();
        for (int i2 = 1; i2 <= n2; ++i2) {
            String string = a.c(i2, "LLLL", locale);
            long l2 = i2;
            cloneable.put(l2, string);
            linkedHashMap.put(l2, string.substring(0, Character.charCount(string.codePointAt(0))));
            linkedHashMap2.put(l2, a.c(i2, "LLL", locale));
        }
        if (n2 > 0) {
            hashMap.put(B.FULL_STANDALONE, cloneable);
            hashMap.put(B.NARROW_STANDALONE, linkedHashMap);
            hashMap.put(B.SHORT_STANDALONE, linkedHashMap2);
        }
    }

    public static /* synthetic */ long f(long l2, long l3) {
        long l4 = l2 / l3;
        if (l2 - l3 * l4 == 0L) {
            return l4;
        }
        long l5 = l4;
        if (((l2 ^ l3) >> 63 | 1L) < 0L) {
            l5 = l4 - 1L;
        }
        return l5;
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry g(String string, String string2) {
        return new AbstractMap.SimpleImmutableEntry<String, String>(Objects.requireNonNull(string), Objects.requireNonNull(string2));
    }

    public static /* synthetic */ long h(long l2, long l3) {
        long l4 = l2 % l3;
        if (l4 == 0L) {
            return 0L;
        }
        l2 = ((l2 ^ l3) >> 63 | 1L) > 0L ? l4 : l4 + l3;
        return l2;
    }

    public static /* synthetic */ long i(long l2, long l3) {
        long l4 = l2 + l3;
        boolean bl2 = false;
        boolean bl3 = (l3 ^ l2) < 0L;
        if ((l2 ^ l4) >= 0L) {
            bl2 = true;
        }
        if (bl3 | bl2) {
            return l4;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long j(long l2, long l3) {
        int n2 = Long.numberOfLeadingZeros(l2);
        int n3 = Long.numberOfLeadingZeros(l2 ^ 0xFFFFFFFFFFFFFFFFL);
        int n4 = Long.numberOfLeadingZeros(l3);
        n4 = Long.numberOfLeadingZeros(l3 ^ 0xFFFFFFFFFFFFFFFFL) + (n4 + (n3 + n2));
        if (n4 > 65) {
            return l2 * l3;
        }
        if (n4 >= 64) {
            n3 = 0;
            long l4 = l2 - 0L;
            n2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            n4 = n2 >= 0 ? 1 : 0;
            if (l3 != Long.MIN_VALUE) {
                n3 = 1;
            }
            if ((n4 | n3) != 0) {
                long l5 = l2 * l3;
                if (n2 == 0 || l5 / l2 == l3) {
                    return l5;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long k(long l2, long l3) {
        long l4 = l2 - l3;
        boolean bl2 = false;
        boolean bl3 = (l3 ^ l2) >= 0L;
        if ((l2 ^ l4) >= 0L) {
            bl2 = true;
        }
        if (bl3 | bl2) {
            return l4;
        }
        throw new ArithmeticException();
    }
}

