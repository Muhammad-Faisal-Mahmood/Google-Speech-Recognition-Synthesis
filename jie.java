/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Set;

final class jie {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public jie(int n2, long l2, long l3, double d2, Long l4, Set set) {
        this.a = n2;
        this.b = l2;
        this.c = l3;
        this.d = d2;
        this.e = l4;
        this.f = hav.n(set);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof jie)) {
            return false;
        }
        object = (jie)object;
        return this.a == ((jie)object).a && this.b == ((jie)object).b && this.c == ((jie)object).c && Double.compare(this.d, ((jie)object).d) == 0 && a.k(this.e, ((jie)object).e) && a.k(this.f, ((jie)object).f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.e("maxAttempts", this.a);
        gtn2.f("initialBackoffNanos", this.b);
        gtn2.f("maxBackoffNanos", this.c);
        gtn2.c("backoffMultiplier", String.valueOf(this.d));
        gtn2.b("perAttemptRecvTimeoutNanos", this.e);
        gtn2.b("retryableStatusCodes", this.f);
        return gtn2.toString();
    }
}

