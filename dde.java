/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dde {
    public static final int a = 0;
    private static final gsy b;
    private static final Pattern c;
    private static final String d;
    private static final Pattern e;
    private static final Pattern f;

    static {
        gsw gsw2 = new gsw(new gsw(new gsq('a', 'z'), new gsq('A', 'Z')), new gsq('0', '9'));
        int n2 = "-_".length();
        Object object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? new gsn() : new gss("-_".charAt(0), "-_".charAt(1))) : new gsr("-_".charAt(0))) : gsv.a;
        b = new gsw(gsw2, (gsy)object);
        c = Pattern.compile("^[\\-a-zA-Z0-9_]+$");
        d = object = String.format(Locale.US, "(?:\\.(%s))??%s", "[\\-a-zA-Z0-9_]+", ".fetched");
        e = Pattern.compile(String.format(Locale.US, "^(%s)(?:(?:%s)|(?:%s))??$", "[\\-a-zA-Z0-9_]+", object, ".staged"));
        f = Pattern.compile(String.format(Locale.US, "^(%s)-([0-9]+)$", "[\\-a-zA-Z0-9_]+"));
    }

    public static ddn a(ddn object, String string) {
        string = string != null ? ".".concat(string) : "";
        Comparable comparable = (dco)object;
        object = ((dco)comparable).b;
        String string2 = ((dco)comparable).a;
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append((String)object);
        ((StringBuilder)comparable).append(string);
        ((StringBuilder)comparable).append(".fetched");
        return new dco(string2, ((StringBuilder)comparable).toString());
    }

    public static ddn b(ddn ddn2) {
        ddn2 = (dco)ddn2;
        String string = ((dco)ddn2).b.concat(".staged");
        return new dco(((dco)ddn2).a, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ded c(String object) {
        if (!((Matcher)(object = e.matcher((CharSequence)object))).find()) return null;
        object = ((Matcher)object).group(1);
        if (object == null) {
            return null;
        }
        Object object2 = f.matcher((CharSequence)object);
        if (!((Matcher)object2).find()) return null;
        object = ((Matcher)object2).group(1);
        if (object == null) return null;
        if ((object2 = ((Matcher)object2).group(2)) == null) return null;
        try {
            int n2 = Integer.parseInt((String)object2);
            return ded.c((String)object, n2);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static String d(String string, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("-");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    public static void e(String string) {
        if (string.length() != 0) {
            if (string.length() <= 256) {
                if (b.e(string)) {
                    return;
                }
                String string2 = String.valueOf(c);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(" is not valid, expected: ");
                stringBuilder.append(string2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new IllegalArgumentException(a.aj(string, "Name '", "' exceeds maximum length of 256"));
        }
        throw new IllegalArgumentException("Name should not be empty");
    }

    public static void f(String string) {
        if (string != null) {
            dde.e(string);
        }
    }
}

