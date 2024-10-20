/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class jod
implements Serializable {
    public final Throwable a;

    public jod(Throwable throwable) {
        jse.e(throwable, "exception");
        this.a = throwable;
    }

    public final boolean equals(Object object) {
        return object instanceof jod && jse.i(this.a, ((jod)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Failure(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

