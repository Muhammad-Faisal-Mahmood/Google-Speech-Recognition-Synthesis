/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class hqe
extends hov {
    public hpn a;
    public ScheduledFuture b;

    public hqe(hpn hpn2) {
        fxf.K(hpn2);
        this.a = hpn2;
    }

    @Override
    protected final String a() {
        Object object = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (object != null) {
            String string = a.ar(object, "inputFuture=[", "]");
            object = string;
            if (scheduledFuture != null) {
                long l2 = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                object = string;
                if (l2 > 0L) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(", remaining delay=[");
                    ((StringBuilder)object).append(l2);
                    ((StringBuilder)object).append(" ms]");
                    object = ((StringBuilder)object).toString();
                }
            }
            return object;
        }
        return null;
    }

    @Override
    protected final void b() {
        this.l(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}

