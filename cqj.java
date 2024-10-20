/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

public final class cqj
extends AtomicInteger {
    public final cqp a;
    public final long b;
    public final AtomicReference c;
    private final hpn d;

    public cqj(long l2, cqp cqp2, hpn hpn2) {
        jse.e(cqp2, "threadIdentifier");
        super(cqk.a(cqn.a(l2), false, false));
        this.a = cqp2;
        this.d = hpn2;
        this.b = cqn.c(l2);
        this.c = new AtomicReference();
    }

    public final void a() {
        Object object;
        int n2;
        while (!this.compareAndSet(n2 = this.get(), cqk.e(n2, 0, false, true, 3))) {
        }
        if (cqk.d(n2)) {
            object = this.a;
            if (((cqp)object).d) {
                ((cqp)object).e = ((cqp)object).c;
            } else {
                throw new IllegalStateException("Could not have been boosted while not holding a lock.");
            }
        }
        object = (cqi)((Object)this.c.getAndSet(cqh.a));
        while (object != null) {
            LockSupport.unpark(((cqi)object).a.a);
            object = ((cqi)object).b;
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Booster[Thread=[");
        stringBuilder.append(this.a.a);
        stringBuilder.append(", future=[");
        stringBuilder.append(this.d);
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}

