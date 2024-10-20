/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.regex.Pattern;

final class gtg
extends gsz
implements Serializable {
    private static final long serialVersionUID = 0L;
    private final Pattern a;

    public gtg(Pattern pattern) {
        fxf.K(pattern);
        this.a = pattern;
    }

    @Override
    public final cxt a(CharSequence charSequence) {
        return new cxt(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}

