/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class apv {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(String object) {
        if (!((Matcher)(object = c.matcher((CharSequence)object))).find()) return false;
        try {
            String string = ((Matcher)object).group(1);
            int n2 = agf.a;
            int n3 = Integer.parseInt(string, 16);
            n2 = Integer.parseInt(((Matcher)object).group(2), 16);
            if (n3 <= 0) {
                if (n2 <= 0) return false;
            }
            this.a = n3;
            this.b = n2;
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }
}

