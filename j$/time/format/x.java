/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.nio.file.attribute.a;
import j$.time.chrono.n;
import j$.time.chrono.u;
import j$.time.format.B;
import j$.time.format.w;
import j$.time.temporal.p;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class x {
    private static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    private static final Comparator b = new Object();
    private static final x c = new Object();
    public static final int d = 0;

    static /* bridge */ /* synthetic */ Comparator a() {
        return b;
    }

    private static String b(String string) {
        return string.substring(0, Character.charCount(string.codePointAt(0)));
    }

    static x c() {
        return c;
    }

    public String d(n n2, p p2, long l2, B b2, Locale locale) {
        if (n2 != u.d && p2 instanceof j$.time.temporal.a) {
            return null;
        }
        return this.e(p2, l2, b2, locale);
    }

    public String e(p object, long l2, B b2, Locale object2) {
        Object object3;
        AbstractMap.SimpleImmutableEntry<p, Locale> simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry<p, Locale>((p)object, (Locale)object2);
        ConcurrentHashMap concurrentHashMap = a;
        Object object4 = object3 = concurrentHashMap.get(simpleImmutableEntry);
        if (object3 == null) {
            int n2;
            object4 = new HashMap();
            object3 = j$.time.temporal.a.ERA;
            int n3 = 0;
            int n4 = 0;
            if (object == object3) {
                object3 = DateFormatSymbols.getInstance((Locale)object2);
                object2 = new HashMap();
                object = new HashMap();
                object3 = ((DateFormatSymbols)object3).getEras();
                for (n2 = n4; n2 < ((V)object3).length; ++n2) {
                    if (((String)object3[n2]).isEmpty()) continue;
                    long l3 = n2;
                    ((HashMap)object2).put(l3, object3[n2]);
                    ((HashMap)object).put(l3, x.b((String)object3[n2]));
                }
                if (!((HashMap)object2).isEmpty()) {
                    ((HashMap)object4).put((B)B.FULL, (String[])object2);
                    ((HashMap)object4).put(B.SHORT, object2);
                    ((HashMap)object4).put(B.NARROW, object);
                }
                object = new w((Map)object4);
            } else if (object == j$.time.temporal.a.MONTH_OF_YEAR) {
                object = DateFormatSymbols.getInstance((Locale)object2);
                j$.nio.file.attribute.a.e(object4, (DateFormatSymbols)object, (Locale)object2);
                object2 = new HashMap();
                HashMap<Long, String> hashMap = new HashMap<Long, String>();
                object3 = ((DateFormatSymbols)object).getMonths();
                for (n2 = 0; n2 < ((Object)object3).length; ++n2) {
                    if (((String)object3[n2]).isEmpty()) continue;
                    long l4 = (long)n2 + 1L;
                    ((HashMap)object2).put(l4, object3[n2]);
                    hashMap.put(l4, x.b((String)object3[n2]));
                }
                if (!((HashMap)object2).isEmpty()) {
                    ((HashMap)object4).put(B.FULL, object2);
                    ((HashMap)object4).put(B.NARROW, hashMap);
                }
                object2 = new HashMap();
                object = ((DateFormatSymbols)object).getShortMonths();
                for (n2 = n3; n2 < ((String[])object).length; ++n2) {
                    if (object[n2].isEmpty()) continue;
                    ((HashMap)object2).put((long)n2 + 1L, object[n2]);
                }
                if (!((HashMap)object2).isEmpty()) {
                    ((HashMap)object4).put(B.SHORT, object2);
                }
                object = new w((Map)object4);
            } else if (object == j$.time.temporal.a.DAY_OF_WEEK) {
                object = DateFormatSymbols.getInstance((Locale)object2);
                j$.nio.file.attribute.a.d(object4, object, (Locale)object2);
                object3 = new HashMap();
                object2 = ((DateFormatSymbols)object).getWeekdays();
                ((HashMap)object3).put(1L, object2[2]);
                ((HashMap)object3).put(2L, object2[3]);
                ((HashMap)object3).put(3L, object2[4]);
                ((HashMap)object3).put(4L, object2[5]);
                ((HashMap)object3).put(5L, object2[6]);
                ((HashMap)object3).put(6L, object2[7]);
                ((HashMap)object3).put(7L, object2[1]);
                ((HashMap)object4).put(B.FULL, object3);
                object3 = new HashMap();
                ((HashMap)object3).put(1L, x.b((String)object2[2]));
                ((HashMap)object3).put(2L, x.b((String)object2[3]));
                ((HashMap)object3).put(3L, x.b((String)object2[4]));
                ((HashMap)object3).put(4L, x.b((String)object2[5]));
                ((HashMap)object3).put(5L, x.b((String)object2[6]));
                ((HashMap)object3).put(6L, x.b((String)object2[7]));
                ((HashMap)object3).put(7L, x.b((String)object2[1]));
                ((HashMap)object4).put(B.NARROW, object3);
                object2 = new HashMap();
                object = ((DateFormatSymbols)object).getShortWeekdays();
                ((HashMap)object2).put(1L, object[2]);
                ((HashMap)object2).put(2L, object[3]);
                ((HashMap)object2).put(3L, object[4]);
                ((HashMap)object2).put(4L, object[5]);
                ((HashMap)object2).put(5L, object[6]);
                ((HashMap)object2).put(6L, object[7]);
                ((HashMap)object2).put(7L, object[1]);
                ((HashMap)object4).put(B.SHORT, object2);
                object = new w((Map)object4);
            } else if (object == j$.time.temporal.a.AMPM_OF_DAY) {
                object3 = DateFormatSymbols.getInstance((Locale)object2);
                object2 = new HashMap();
                object = new HashMap();
                object3 = ((DateFormatSymbols)object3).getAmPmStrings();
                for (n2 = 0; n2 < ((Object)object3).length; ++n2) {
                    if (((String)object3[n2]).isEmpty()) continue;
                    long l5 = n2;
                    ((HashMap)object2).put(l5, object3[n2]);
                    ((HashMap)object).put(l5, x.b((String)object3[n2]));
                }
                if (!((HashMap)object2).isEmpty()) {
                    ((HashMap)object4).put(B.FULL, object2);
                    ((HashMap)object4).put(B.SHORT, object2);
                    ((HashMap)object4).put(B.NARROW, object);
                }
                object = new w((Map)object4);
            } else {
                object = "";
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, object);
            object4 = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (object4 instanceof w) {
            return ((w)object4).a(l2, b2);
        }
        return null;
    }
}

