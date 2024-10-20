/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ahh {
    private static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String string, String string2) {
        long l2;
        block9: {
            boolean bl2 = TextUtils.isEmpty((CharSequence)string);
            long l3 = l2 = -1L;
            if (!bl2) {
                try {
                    l3 = Long.parseLong(string);
                }
                catch (NumberFormatException numberFormatException) {
                    afx.b("HttpUtil", a.aj(string, "Unexpected Content-Length [", "]"));
                    l3 = l2;
                }
            }
            l2 = l3;
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                Object object = a.matcher(string2);
                l2 = l3;
                if (((Matcher)object).matches()) {
                    String string3 = ((Matcher)object).group(2);
                    abr.i(string3);
                    l2 = Long.parseLong(string3);
                    object = ((Matcher)object).group(1);
                    abr.i(object);
                    long l4 = l2 - Long.parseLong((String)object) + 1L;
                    if (l3 < 0L) {
                        l2 = l4;
                        break block9;
                    }
                    l2 = l3;
                    if (l3 == l4) break block9;
                    try {
                        afx.e("HttpUtil", a.aq(string2, string, "Inconsistent headers [", "] [", "]"));
                        l2 = Math.max(l3, l4);
                    }
                    catch (NumberFormatException numberFormatException) {
                        afx.b("HttpUtil", a.aj(string2, "Unexpected Content-Range [", "]"));
                        l2 = l3;
                    }
                }
            }
        }
        return l2;
    }

    public static long b(String object) {
        if (!TextUtils.isEmpty((CharSequence)object) && ((Matcher)(object = b.matcher((CharSequence)object))).matches()) {
            object = ((Matcher)object).group(1);
            abr.i(object);
            return Long.parseLong((String)object);
        }
        return -1L;
    }

    public static String c(long l2) {
        if (l2 == 0L) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("bytes=");
        stringBuilder.append(l2);
        stringBuilder.append("-");
        return stringBuilder.toString();
    }
}

