/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class hph
extends hnk {
    public static hph q(hpn hpn2) {
        hpn2 = hpn2 instanceof hph ? (hph)hpn2 : new hox(hpn2);
        return hpn2;
    }

    public final hph r(long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (hph)hhk.R(this, l2, timeUnit, scheduledExecutorService);
    }
}

