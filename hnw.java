/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

abstract class hnw
extends hnf {
    public static final hnt a;
    private static final hpm b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        Throwable throwable;
        hnt hnt2;
        b = new hpm(hnw.class);
        try {
            hnt2 = new hnu(AtomicReferenceFieldUpdater.newUpdater(hnw.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(hnw.class, "remaining"));
            throwable = null;
        }
        catch (Throwable throwable2) {
            hnt2 = new hnv();
        }
        a = hnt2;
        if (throwable != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", throwable);
        }
    }

    public hnw(int n2) {
        this.remaining = n2;
    }

    public abstract void d(Set var1);
}

