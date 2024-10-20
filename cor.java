/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

final class cor
extends hoz
implements hpp {
    private final long a;

    public cor(hpn hpn2, long l2) {
        super(hpn2);
        this.a = l2;
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.a - System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}

