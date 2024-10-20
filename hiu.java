/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class hiu
implements Serializable {
    private static final long serialVersionUID = 0L;
    private final String a;
    private final int b;

    public hiu(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    private Object readResolve() {
        return new hiv(this.a, this.b);
    }
}

