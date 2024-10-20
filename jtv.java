/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.regex.Pattern;

public final class jtv
implements Serializable {
    private final Pattern a;

    public jtv(String object) {
        object = Pattern.compile((String)object);
        jse.d(object, "compile(...)");
        this((Pattern)object);
    }

    public jtv(Pattern pattern) {
        jse.e(pattern, "nativePattern");
        this.a = pattern;
    }

    private final Object writeReplace() {
        String string = this.a.pattern();
        jse.d(string, "pattern(...)");
        return new jtu(string, this.a.flags());
    }

    public final String a(CharSequence charSequence, String string) {
        jse.e(charSequence, "input");
        charSequence = this.a.matcher(charSequence).replaceAll(string);
        jse.d(charSequence, "replaceAll(...)");
        return charSequence;
    }

    public final boolean b(CharSequence charSequence) {
        jse.e(charSequence, "input");
        return this.a.matcher(charSequence).matches();
    }

    public final String toString() {
        String string = this.a.toString();
        jse.d(string, "toString(...)");
        return string;
    }
}

