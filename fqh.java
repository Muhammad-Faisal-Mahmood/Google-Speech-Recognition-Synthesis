/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.regex.Pattern;

public final class fqh {
    public static final Pattern a = Pattern.compile("(\\w+).*");

    public static String a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(new gtk("+").d(list));
    }
}

