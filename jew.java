/*
 * Decompiled with CFR 0.152.
 */
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class jew {
    private static final long a = TimeUnit.SECONDS.toNanos(1L);

    public static Boolean a(Map map, String string) {
        if (!map.containsKey(string)) {
            return null;
        }
        Object v2 = map.get(string);
        if (v2 instanceof Boolean) {
            return (Boolean)v2;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", v2, string, map));
    }

    public static Double b(Map map, String string) {
        if (!map.containsKey(string)) {
            return null;
        }
        Object v2 = map.get(string);
        if (v2 instanceof Double) {
            return (Double)v2;
        }
        if (v2 instanceof String) {
            double d2;
            try {
                d2 = Double.parseDouble((String)v2);
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", v2, string));
            }
            return d2;
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", v2, string, map));
    }

    public static Integer c(Map object, String string) {
        if (!object.containsKey(string)) {
            return null;
        }
        if ((object = object.get(string)) instanceof Double) {
            int n2 = ((Double)(object = (Double)object)).intValue();
            if ((double)n2 == (Double)object) {
                return n2;
            }
            Objects.toString(object);
            throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(object)));
        }
        if (object instanceof String) {
            int n3;
            try {
                n3 = Integer.parseInt((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", object, string));
            }
            return n3;
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", object, string));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Long d(Map object, String object2) {
        if ((object = jew.e((Map)object, (String)object2)) == null) {
            return null;
        }
        try {
            block31: {
                long l2;
                long l3;
                long l4;
                long l5;
                int n2;
                long l6;
                int n3;
                int n4;
                block33: {
                    block32: {
                        boolean bl2;
                        block30: {
                            String string;
                            block29: {
                                block28: {
                                    boolean bl3 = ((String)object).isEmpty();
                                    n4 = 0;
                                    if (bl3 || ((String)object).charAt(((String)object).length() - 1) != 's') break block28;
                                    if (((String)object).charAt(0) == '-') {
                                        object = ((String)object).substring(1);
                                        bl2 = true;
                                    } else {
                                        bl2 = false;
                                    }
                                    String string2 = ((String)object).substring(0, ((String)object).length() - 1);
                                    string = "";
                                    n3 = string2.indexOf(46);
                                    object2 = string2;
                                    if (n3 != -1) {
                                        string = string2.substring(n3 + 1);
                                        object2 = string2.substring(0, n3);
                                    }
                                    l6 = Long.parseLong((String)object2);
                                    if (!string.isEmpty()) break block29;
                                    n3 = 0;
                                    break block30;
                                }
                                object2 = new ParseException("Invalid duration string: ".concat((String)object), 0);
                                throw object2;
                            }
                            int n5 = 0;
                            n2 = 0;
                            while (true) {
                                n3 = n2;
                                if (n5 >= 9) break;
                                n3 = n2 *= 10;
                                if (n5 < string.length()) {
                                    if (string.charAt(n5) >= '0' && string.charAt(n5) <= '9') {
                                        n3 = n2 + (string.charAt(n5) - 48);
                                    } else {
                                        object = new ParseException("Invalid nanoseconds.", 0);
                                        throw object;
                                    }
                                }
                                ++n5;
                                n2 = n3;
                                continue;
                                break;
                            }
                        }
                        if (l6 < 0L) break block31;
                        l5 = l6;
                        n2 = n3;
                        if (bl2) {
                            l5 = -l6;
                            n2 = -n3;
                        }
                        l4 = n2;
                        l3 = a;
                        if (l4 <= -l3) break block32;
                        l6 = l5;
                        if (l4 < l3) break block33;
                    }
                    l6 = hhk.ap(l5, l4 / l3);
                    n2 = (int)(l4 % l3);
                }
                l5 = l6;
                n3 = n2;
                if (l6 > 0L) {
                    l5 = l6;
                    n3 = n2;
                    if (n2 < 0) {
                        l4 = n2;
                        l5 = l6 - 1L;
                        n3 = (int)(l4 + l3);
                    }
                }
                l6 = l5;
                n2 = n3;
                if (l5 < 0L) {
                    l6 = l5;
                    n2 = n3;
                    if (n3 > 0) {
                        l4 = n3;
                        l6 = l5 + 1L;
                        n2 = (int)(l4 - l3);
                    }
                }
                if (l6 >= -315576000000L && l6 <= 315576000000L && (l5 = (long)n2) >= -999999999L && l5 < l3 && ((n3 = (int)((l2 = l6 - 0L) == 0L ? 0 : (l2 < 0L ? -1 : 1))) >= 0 && n2 >= 0 || n3 <= 0 && n2 <= 0)) {
                    l3 = TimeUnit.SECONDS.toNanos(l6);
                    l6 = l3 + l5;
                    n3 = (l3 ^ l6) >= 0L ? 1 : 0;
                    n2 = n4;
                    if ((l5 ^ l3) < 0L) {
                        n2 = 1;
                    }
                    if ((n2 | n3) != 0) {
                        return l6;
                    }
                    l6 = (l6 >>> 63 ^ 1L) + Long.MAX_VALUE;
                    return l6;
                }
                try {
                    object = new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", l6, n2));
                    throw object;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    ParseException parseException = new ParseException("Duration value is out of range.", 0);
                    throw parseException;
                }
            }
            object2 = new ParseException("Invalid duration string: ".concat(String.valueOf(object)), 0);
            throw object2;
        }
        catch (ParseException parseException) {
            throw new RuntimeException(parseException);
        }
    }

    public static String e(Map map, String string) {
        if (!map.containsKey(string)) {
            return null;
        }
        Object v2 = map.get(string);
        if (v2 instanceof String) {
            return (String)v2;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", v2, string, map));
    }

    public static List f(Map map, String string) {
        if (!map.containsKey(string)) {
            return null;
        }
        Object v2 = map.get(string);
        if (v2 instanceof List) {
            return (List)v2;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", v2, string, map));
    }

    public static List g(Map object, String string) {
        if ((object = jew.f((Map)object, string)) == null) {
            return null;
        }
        jew.j((List)object);
        return object;
    }

    public static List h(Map object, String string) {
        if ((object = jew.f((Map)object, string)) == null) {
            return null;
        }
        for (int i2 = 0; i2 < object.size(); ++i2) {
            if (object.get(i2) instanceof String) {
                continue;
            }
            throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", object.get(i2), i2, object));
        }
        return object;
    }

    public static Map i(Map map, String string) {
        if (!map.containsKey(string)) {
            return null;
        }
        Object v2 = map.get(string);
        if (v2 instanceof Map) {
            return (Map)v2;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", v2, string, map));
    }

    public static void j(List list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (list.get(i2) instanceof Map) {
                continue;
            }
            throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i2), i2, list));
        }
    }
}

