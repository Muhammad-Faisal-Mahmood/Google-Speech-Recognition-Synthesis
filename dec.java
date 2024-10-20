/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class dec {
    public static final int a = 0;
    private static final NumberFormat b = NumberFormat.getIntegerInstance(Locale.US);
    private static final Set c = new HashSet();
    private static final Object d = new Object();

    static {
        TimeUnit.DAYS.toMillis(1L);
        TimeUnit.HOURS.toMillis(1L);
        TimeUnit.MINUTES.toMillis(1L);
        TimeUnit.SECONDS.toMillis(1L);
    }

    public static String a(int n2, int n3, int n4, int n5) {
        String string = "?";
        String string2 = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? "?" : "m") : "W") : "*";
        String string3 = n3 != 0 ? (n3 != 1 ? (n3 != 2 ? "?" : "b") : "C") : "*";
        String string4 = n4 != 0 ? (n4 != 1 ? (n4 != 2 ? "?" : "u") : "I") : "*";
        if (n5 != 0) {
            if (n5 != 1) {
                if (n5 == 2) {
                    string = "l";
                }
            } else {
                string = "N";
            }
        } else {
            string = "*";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(":");
        stringBuilder.append(string3);
        stringBuilder.append(":");
        stringBuilder.append(string4);
        stringBuilder.append(":");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String b(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        int n2 = 2;
        int n3 = true != bl2 ? 2 : 1;
        int n4 = true != bl3 ? 2 : 1;
        int n5 = true != bl4 ? 2 : 1;
        if (bl5) {
            n2 = 1;
        }
        return dec.a(n3, n4, n5, n2);
    }

    public static String c(long l2) {
        String string;
        long l3 = l2 - 0x40000000L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (l4 >= 0) {
            double d2 = l2;
            string = b.format(Math.min(Math.ceil(d2 / 1.073741824E9), 999.0));
        } else if (l2 >= 0x100000L) {
            double d3 = l2;
            string = b.format(Math.ceil(d3 / 1048576.0));
        } else {
            double d4 = l2;
            string = b.format(Math.ceil(d4 / 1024.0));
        }
        String string2 = l4 >= 0 ? "GB" : (l2 >= 0x100000L ? "MB" : "kB");
        return a.ao(string2, string, " ");
    }

    public static String d(long l2) {
        return DateFormat.getDateTimeInstance(3, 3).format(new Date(l2));
    }

    public static String e(File object) {
        Object object2 = ((File)object).getParentFile();
        if (object2 != null) {
            object2 = ((File)object2).getName();
            object = ((File)object).getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object2);
            stringBuilder.append("/");
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
        } else {
            object = ((File)object).getName();
        }
        return object;
    }

    public static String f(Collection collection2, gte gte2) {
        if (collection2.isEmpty()) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Collection collection2 : collection2) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((String)gte2.apply(collection2));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static String g(String string, String string2) {
        if (!dec.m(string)) {
            return string2;
        }
        return "redacted";
    }

    public static String h(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return "<unknown>";
                }
                return "pinned";
            }
            return "reserved";
        }
        return "not_res";
    }

    public static String i(int n2) {
        if (n2 == 0) {
            return "*";
        }
        String string = "";
        int n3 = n2;
        if ((n2 & 1) != 0) {
            string = dec.r("", "fg");
            n3 = n2 & 0xFFFFFFFE;
        }
        String string2 = string;
        n2 = n3;
        if ((n3 & 2) != 0) {
            string2 = dec.r(string, "bg");
            n2 = n3 & 0xFFFFFFFD;
        }
        if (n2 != 0) {
            return dec.r(string2, "?");
        }
        return string2;
    }

    public static String j(String string) {
        int n2;
        for (n2 = 0; n2 < string.length() && string.charAt(n2) == '0'; ++n2) {
        }
        return string.substring(n2);
    }

    public static void k(boolean bl2) {
        if (!bl2) {
            return;
        }
        throw new UnsupportedOperationException("Operation not supported on a closed object.");
    }

    public static void l(Collection object, Collection object2, deb deb2, Comparator comparator) {
        hdy hdy2 = ((gzx)object).v();
        hdy hdy3 = ((gzx)object2).v();
        Object object3 = fvd.F(hdy2, null);
        object = fvd.F(hdy3, null);
        while (true) {
            int n2;
            block11: {
                block10: {
                    block8: {
                        block9: {
                            if (object3 == null) break block8;
                            if (object == null || (n2 = comparator.compare(object3, object)) < 0) break block9;
                            if (n2 > 0) break block10;
                            n2 = 0;
                            break block11;
                        }
                        n2 = 2;
                        break block11;
                    }
                    if (object == null) break;
                }
                n2 = 1;
            }
            object2 = object3;
            if (n2 != 1) {
                if (n2 == 2) {
                    fxf.K(object3);
                    deb2.a(object3, 2);
                }
                if ((object2 = fvd.F(hdy2, null)) != null) {
                    fxf.K(object3);
                    if (comparator.compare(object3, object2) > 0) {
                        throw new IllegalArgumentException("The left list is not ordered.");
                    }
                }
            }
            object3 = object2;
            if (n2 == 2) continue;
            if (n2 == 1) {
                fxf.K(object);
                deb2.a(object, 1);
            }
            if ((object3 = fvd.F(hdy3, null)) != null) {
                fxf.K(object);
                if (comparator.compare(object, object3) > 0) {
                    throw new IllegalArgumentException("The right list is not ordered.");
                }
            }
            object = object3;
            object3 = object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean m(String string) {
        Object object = d;
        synchronized (object) {
            return c.contains(string);
        }
    }

    public static void n(String string, long l2) {
        if (l2 > 0L) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s must be greater than zero.", string));
    }

    public static void o(String string, long l2) {
        if (l2 >= 0L) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s must be greater than or equal to zero.", string));
    }

    public static boolean p(int n2) {
        return (n2 & 1) != 0;
    }

    public static void q(int n2) {
        if (n2 >= 0 && n2 <= 2) {
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "Invalid reservation state value: "));
    }

    private static String r(String string, String string2) {
        String string3 = string;
        if (!string.isEmpty()) {
            string3 = string.concat("|");
        }
        return string3.concat(string2);
    }
}

