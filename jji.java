/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class jji {
    final iwi a;
    final Object b;

    public jji(iwi iwi2, Object object) {
        this.a = iwi2;
        this.b = object;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (jji)object;
            if (a.k(this.a, ((jji)object).a) && a.k(this.b, ((jji)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("provider", this.a);
        gtn2.b("config", this.b);
        return gtn2.toString();
    }
}

