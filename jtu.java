/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.regex.Pattern;

final class jtu
implements Serializable {
    private static final long serialVersionUID = 0L;
    private final String a;
    private final int b;

    public jtu(String string, int n2) {
        jse.e(string, "pattern");
        this.a = string;
        this.b = n2;
    }

    private final Object readResolve() {
        Pattern pattern = Pattern.compile(this.a, this.b);
        jse.d(pattern, "compile(...)");
        return new jtv(pattern);
    }
}

