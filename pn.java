/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class pn
implements hpn {
    static final boolean a;
    static final pe b;
    private static final Logger c;
    private static final Object d;
    volatile pi listeners;
    volatile Object value;
    volatile pm waiters;

    static {
        Object var1_1;
        pe pe2;
        a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        c = Logger.getLogger(pn.class.getName());
        try {
            pe2 = new pj(AtomicReferenceFieldUpdater.newUpdater(pm.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(pm.class, pm.class, "next"), AtomicReferenceFieldUpdater.newUpdater(pn.class, pm.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(pn.class, pi.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(pn.class, Object.class, "value"));
            var1_1 = null;
        }
        catch (Throwable throwable) {
            pe2 = new pl();
        }
        b = pe2;
        if (var1_1 != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", (Throwable)var1_1);
        }
        d = new Object();
    }

    protected pn() {
    }

    static Object a(hpn object) {
        block12: {
            block11: {
                Object object2;
                block9: {
                    block10: {
                        Object object3;
                        if (!(object instanceof pn)) break block10;
                        object = object3 = ((pn)object).value;
                        if (object3 instanceof pf) {
                            pf pf2 = (pf)object3;
                            object = object3;
                            if (pf2.c) {
                                object = pf2.d;
                                object = object != null ? new pf(false, (Throwable)object) : pf.b;
                            }
                        }
                        break block11;
                    }
                    boolean bl2 = object.isCancelled();
                    if ((a ^ true) & bl2) break block12;
                    object2 = a.h((Future)object);
                    if (object2 != null) break block9;
                    try {
                        object = object2 = d;
                    }
                    catch (Throwable throwable) {
                        return new ph(throwable);
                    }
                    catch (CancellationException cancellationException) {
                        if (!bl2) {
                            Objects.toString(object);
                            return new ph(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(object)), cancellationException));
                        }
                        return new pf(false, cancellationException);
                    }
                    catch (ExecutionException executionException) {
                        return new ph(executionException.getCause());
                    }
                }
                object = object2;
            }
            return object;
        }
        return pf.b;
    }

    static void d(pn object) {
        Object object2 = null;
        Object object3 = object;
        object = object2;
        block0: while (true) {
            if (!b.e((pn)object3, (pm)(object2 = ((pn)object3).waiters), pm.a)) {
                continue;
            }
            while (true) {
                Object object4;
                if (object2 == null) {
                    while (!b.c((pn)object3, (pi)(object2 = ((pn)object3).listeners), pi.a)) {
                    }
                    object3 = object2;
                    while (true) {
                        object2 = object3;
                        object3 = object;
                        if (object2 == null) break;
                        object3 = ((pi)object2).next;
                        ((pi)object2).next = object;
                        object = object2;
                    }
                    while (object3 != null) {
                        object2 = ((pi)object3).b;
                        object = ((pi)object3).next;
                        if (object2 instanceof pk) {
                            object2 = (pk)object2;
                            object3 = ((pk)object2).a;
                            if (((pn)object3).value == object2 && b.d((pn)object3, object2, object4 = pn.a(((pk)object2).b))) {
                                continue block0;
                            }
                        } else {
                            pn.i((Runnable)object2, ((pi)object3).c);
                        }
                        object3 = object;
                    }
                    return;
                }
                object4 = ((pm)object2).thread;
                if (object4 != null) {
                    ((pm)object2).thread = null;
                    LockSupport.unpark((Thread)object4);
                }
                object2 = ((pm)object2).next;
            }
            break;
        }
    }

    static void f(Object object) {
        object.getClass();
    }

    private final String g(Object object) {
        if (object == this) {
            return "this future";
        }
        return String.valueOf(object);
    }

    private final void h(StringBuilder stringBuilder) {
        try {
            Object object = a.h(this);
            stringBuilder.append("SUCCESS, result=[");
            stringBuilder.append(this.g(object));
            stringBuilder.append("]");
            return;
        }
        catch (RuntimeException runtimeException) {
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(runtimeException.getClass());
            stringBuilder.append(" thrown from get()]");
            return;
        }
        catch (CancellationException cancellationException) {
            stringBuilder.append("CANCELLED");
            return;
        }
        catch (ExecutionException executionException) {
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append(executionException.getCause());
            stringBuilder.append("]");
            return;
        }
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeException) {
            c.log(Level.SEVERE, a.am(executor, runnable, "RuntimeException while executing runnable ", " with executor "), runtimeException);
            return;
        }
    }

    private final void j(pm pm2) {
        pm2.thread = null;
        block0: while ((pm2 = this.waiters) != pm.a) {
            pm pm3 = null;
            while (pm2 != null) {
                pm pm4;
                pm pm5 = pm2.next;
                if (pm2.thread != null) {
                    pm4 = pm2;
                } else if (pm3 != null) {
                    pm3.next = pm5;
                    pm4 = pm3;
                    if (pm3.thread == null) {
                        continue block0;
                    }
                } else {
                    pm4 = pm3;
                    if (!b.e(this, pm2, pm5)) continue block0;
                }
                pm2 = pm5;
                pm3 = pm4;
            }
            break block0;
        }
    }

    private static final Object k(Object object) {
        if (!(object instanceof pf)) {
            if (!(object instanceof ph)) {
                Object object2 = object;
                if (object == d) {
                    object2 = null;
                }
                return object2;
            }
            throw new ExecutionException(((ph)object).b);
        }
        Throwable throwable = ((pf)object).d;
        object = new CancellationException("Task was cancelled.");
        ((Throwable)object).initCause(throwable);
        throw object;
    }

    protected String b() {
        Object object = this.value;
        if (object instanceof pk) {
            StringBuilder stringBuilder = new StringBuilder("setFuture=[");
            stringBuilder.append(this.g(((pk)object).b));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        if (this instanceof ScheduledFuture) {
            StringBuilder stringBuilder = new StringBuilder("remaining delay=[");
            stringBuilder.append(((ScheduledFuture)((Object)this)).getDelay(TimeUnit.MILLISECONDS));
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
        return null;
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        pn.f(runnable);
        pn.f(executor);
        pi pi2 = this.listeners;
        if (pi2 != pi.a) {
            pi pi3;
            pi pi4 = new pi(runnable, executor);
            do {
                pi4.next = pi2;
                if (b.c(this, pi2, pi4)) {
                    return;
                }
                pi2 = pi3 = this.listeners;
            } while (pi3 != pi.a);
        }
        pn.i(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean bl2) {
        Object object = this.value;
        boolean bl3 = object instanceof pk;
        boolean bl4 = false;
        boolean bl5 = object == null;
        if (bl3 | bl5) {
            pf pf2 = a ? new pf(bl2, new CancellationException("Future.cancel() was called.")) : (bl2 ? pf.a : pf.b);
            pn pn2 = this;
            bl4 = false;
            while (true) {
                Object object2;
                if (b.d(pn2, object, pf2)) {
                    pn.d(pn2);
                    if (object instanceof pk) {
                        object = ((pk)object).b;
                        if (object instanceof pn) {
                            pn2 = (pn)object;
                            object = pn2.value;
                            bl5 = object == null;
                            if (bl5 | object instanceof pk) {
                                bl4 = true;
                                continue;
                            }
                        } else {
                            object.cancel(bl2);
                        }
                    }
                    bl4 = true;
                    break;
                }
                object = object2 = pn2.value;
                if (!(object2 instanceof pk)) break;
            }
        }
        return bl4;
    }

    protected boolean e(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = d;
        }
        if (b.d(this, null, object2)) {
            pn.d(this);
            return true;
        }
        return false;
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object object = this.value;
            boolean bl2 = object != null;
            if (bl2 & (object instanceof pk ^ true)) {
                return pn.k(object);
            }
            object = this.waiters;
            if (object != pm.a) {
                pm pm2;
                pm pm3 = new pm();
                do {
                    pm3.a((pm)object);
                    if (b.e(this, (pm)object, pm3)) {
                        block6: {
                            do {
                                LockSupport.park(this);
                                if (Thread.interrupted()) break block6;
                            } while (!((bl2 = (object = this.value) != null) & (object instanceof pk ^ true)));
                            return pn.k(object);
                        }
                        this.j(pm3);
                        throw new InterruptedException();
                    }
                    pm2 = this.waiters;
                    object = pm2;
                } while (pm2 != pm.a);
            }
            return pn.k(this.value);
        }
        throw new InterruptedException();
    }

    public final Object get(long l2, TimeUnit object) {
        long l3 = ((TimeUnit)((Object)object)).toNanos(l2);
        if (!Thread.interrupted()) {
            Object object2;
            Object object3;
            long l4;
            long l5;
            boolean bl2;
            boolean bl3;
            Object object4;
            block18: {
                object4 = this.value;
                bl3 = true;
                bl2 = object4 != null;
                if (bl2 & (object4 instanceof pk ^ true)) {
                    return pn.k(object4);
                }
                l5 = l3 > 0L ? System.nanoTime() + l3 : 0L;
                l4 = l3;
                if (l3 >= 1000L) {
                    object4 = this.waiters;
                    if (object4 != pm.a) {
                        object3 = new pm();
                        do {
                            ((pm)object3).a((pm)object4);
                            if (b.e(this, (pm)object4, (pm)object3)) {
                                block17: {
                                    do {
                                        LockSupport.parkNanos(this, l3);
                                        if (Thread.interrupted()) break block17;
                                        object4 = this.value;
                                        bl2 = object4 != null;
                                        if (bl2 & (object4 instanceof pk ^ true)) {
                                            return pn.k(object4);
                                        }
                                        l3 = l4 = l5 - System.nanoTime();
                                    } while (l4 >= 1000L);
                                    this.j((pm)object3);
                                    break block18;
                                }
                                this.j((pm)object3);
                                throw new InterruptedException();
                            }
                            object4 = object2 = this.waiters;
                        } while (object2 != pm.a);
                    }
                    return pn.k(this.value);
                }
            }
            while (l4 > 0L) {
                object4 = this.value;
                bl2 = object4 != null;
                if (bl2 & (object4 instanceof pk ^ true)) {
                    return pn.k(object4);
                }
                if (!Thread.interrupted()) {
                    l4 = l5 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            object3 = this.toString();
            String string = ((Enum)object).toString().toLowerCase(Locale.ROOT);
            object4 = new StringBuilder("Waited ");
            ((StringBuilder)object4).append(l2);
            ((StringBuilder)object4).append(" ");
            ((StringBuilder)object4).append(((Enum)object).toString().toLowerCase(Locale.ROOT));
            object4 = object2 = ((StringBuilder)object4).toString();
            if (l4 + 1000L < 0L) {
                object4 = ((String)object2).concat(" (plus ");
                l4 = -l4;
                l2 = ((TimeUnit)((Object)object)).convert(l4, TimeUnit.NANOSECONDS);
                l4 -= ((TimeUnit)((Object)object)).toNanos(l2);
                long l6 = l2 - 0L;
                long l7 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                bl2 = bl3;
                if (l7 != false) {
                    bl2 = l4 > 1000L ? bl3 : false;
                }
                object = object4;
                if (l7 > 0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object4);
                    ((StringBuilder)object).append(l2);
                    ((StringBuilder)object).append(" ");
                    ((StringBuilder)object).append(string);
                    object = object4 = ((StringBuilder)object).toString();
                    if (bl2) {
                        object = ((String)object4).concat(",");
                    }
                    object = ((String)object).concat(" ");
                }
                object4 = object;
                if (bl2) {
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append(l4);
                    ((StringBuilder)object4).append(" nanoseconds ");
                    object4 = ((StringBuilder)object4).toString();
                }
                object4 = ((String)object4).concat("delay)");
            }
            if (this.isDone()) {
                throw new TimeoutException(((String)object4).concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(a.ao((String)object3, (String)object4, " for "));
        }
        throw new InterruptedException();
    }

    @Override
    public final boolean isCancelled() {
        return this.value instanceof pf;
    }

    @Override
    public final boolean isDone() {
        Object object = this.value;
        boolean bl2 = object instanceof pk;
        boolean bl3 = object != null;
        return bl3 & (bl2 ^ true);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        if (this.isCancelled()) {
            stringBuilder.append("CANCELLED");
        } else if (this.isDone()) {
            this.h(stringBuilder);
        } else {
            Object object;
            try {
                object = this.b();
            }
            catch (RuntimeException runtimeException) {
                object = runtimeException.getClass();
                Objects.toString(object);
                object = "Exception thrown from implementation: ".concat(String.valueOf(object));
            }
            if (object != null && !((String)object).isEmpty()) {
                stringBuilder.append("PENDING, info=[");
                stringBuilder.append((String)object);
                stringBuilder.append("]");
            } else if (this.isDone()) {
                this.h(stringBuilder);
            } else {
                stringBuilder.append("PENDING");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

