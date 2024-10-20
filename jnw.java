/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class jnw
implements Serializable,
jny {
    private final Object a;

    public jnw(Object object) {
        this.a = object;
    }

    @Override
    public final Object a() {
        return this.a;
    }

    @Override
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}

