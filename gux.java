/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class gux {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public gux() {
        fxf.q(true);
        fxf.q(true);
        fxf.q(true);
        fxf.q(true);
        fxf.q(true);
        fxf.q(true);
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
    }

    public final boolean equals(Object object) {
        if (object instanceof gux) {
            object = (gux)object;
            long l2 = ((gux)object).a;
            l2 = ((gux)object).b;
            l2 = ((gux)object).c;
            l2 = ((gux)object).d;
            l2 = ((gux)object).e;
            l2 = ((gux)object).f;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Long l2 = 0L;
        return Arrays.hashCode(new Object[]{l2, l2, l2, l2, l2, l2});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.f("hitCount", 0L);
        gtn2.f("missCount", 0L);
        gtn2.f("loadSuccessCount", 0L);
        gtn2.f("loadExceptionCount", 0L);
        gtn2.f("totalLoadTime", 0L);
        gtn2.f("evictionCount", 0L);
        return gtn2.toString();
    }
}

