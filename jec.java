/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Set;

final class jec {
    final int a;
    final long b;
    final Set c;

    public jec(int n2, long l2, Set set) {
        this.a = n2;
        this.b = l2;
        this.c = hav.n(set);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (jec)object;
            if (this.a == ((jec)object).a && this.b == ((jec)object).b && a.k(this.c, ((jec)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.e("maxAttempts", this.a);
        gtn2.f("hedgingDelayNanos", this.b);
        gtn2.b("nonFatalStatusCodes", this.c);
        return gtn2.toString();
    }
}

