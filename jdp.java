/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class jdp {
    private final Random a = new Random();
    private final long b;
    private final long c;
    private long d;

    public jdp() {
        long l2;
        this.b = l2 = TimeUnit.SECONDS.toNanos(1L);
        this.c = TimeUnit.MINUTES.toNanos(2L);
        this.d = l2;
    }

    public final long a() {
        long l2 = this.d;
        double d2 = l2;
        this.d = Math.min((long)(1.6 * d2), this.c);
        double d3 = 0.2 * d2;
        boolean bl2 = d3 >= (d2 *= -0.2);
        fxf.q(bl2);
        return l2 + (long)(this.a.nextDouble() * (d3 - d2) + d2);
    }
}

