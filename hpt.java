/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class hpt
extends hoz
implements hpp {
    private final ScheduledFuture a;

    public hpt(hpn hpn2, ScheduledFuture scheduledFuture) {
        super(hpn2);
        this.a = scheduledFuture;
    }

    @Override
    public final boolean cancel(boolean bl2) {
        boolean bl3 = super.cancel(bl2);
        if (bl3) {
            this.a.cancel(bl2);
        }
        return bl3;
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}

