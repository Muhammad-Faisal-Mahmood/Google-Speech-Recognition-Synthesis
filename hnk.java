/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import j$.util.Objects;
import java.util.Locale;
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

public abstract class hnk
extends hqi
implements hpn {
    private static final Object a;
    static final boolean h;
    static final hpm i;
    public static final hmw j;
    public volatile hna listeners;
    public volatile Object value;
    public volatile hnj waiters;

    static {
        hni hni2;
        Object object;
        Object object2;
        block9: {
            boolean bl2;
            try {
                bl2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
            }
            catch (SecurityException securityException) {
                bl2 = false;
            }
            h = bl2;
            i = new hpm(hnk.class);
            try {
                object2 = new hni();
                object = null;
                hni2 = null;
                break block9;
            }
            catch (Error error) {
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                hnb hnb2 = new hnb(AtomicReferenceFieldUpdater.newUpdater(hnj.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(hnj.class, hnj.class, "next"), AtomicReferenceFieldUpdater.newUpdater(hnk.class, hnj.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(hnk.class, hna.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(hnk.class, Object.class, "value"));
                hni2 = null;
                object = object2;
                object2 = hnb2;
                break block9;
            }
            catch (Error error) {
            }
            catch (Exception exception) {
                // empty catch block
            }
            hnd hnd2 = new hnd();
            hni2 = object;
            object = object2;
            object2 = hnd2;
        }
        j = object2;
        if (hni2 != null) {
            object2 = i;
            ((hpm)object2).a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", (Throwable)object);
            ((hpm)object2).a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", (Throwable)((Object)hni2));
        }
        a = new Object();
    }

    protected hnk() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void d(StringBuilder stringBuilder) {
        try {
            Object object = a.h(this);
            stringBuilder.append("SUCCESS, result=[");
            if (object == null) {
                stringBuilder.append("null");
            } else if (object == this) {
                stringBuilder.append("this future");
            } else {
                stringBuilder.append(object.getClass().getName());
                stringBuilder.append("@");
                stringBuilder.append(Integer.toHexString(System.identityHashCode(object)));
            }
            stringBuilder.append("]");
            return;
        }
        catch (Exception exception) {
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(exception.getClass());
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

    private final void e(StringBuilder stringBuilder) {
        int n2 = stringBuilder.length();
        stringBuilder.append("PENDING");
        Object object = this.value;
        if (object instanceof hnc) {
            stringBuilder.append(", setFuture=[");
            this.f(stringBuilder, ((hnc)object).b);
            stringBuilder.append("]");
        } else {
            block7: {
                try {
                    object = fxf.N(this.a());
                    break block7;
                }
                catch (StackOverflowError stackOverflowError) {
                }
                catch (Exception exception) {
                    // empty catch block
                }
                object = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(object.getClass())));
            }
            if (object != null) {
                stringBuilder.append(", info=[");
                stringBuilder.append((String)object);
                stringBuilder.append("]");
            }
        }
        if (this.isDone()) {
            stringBuilder.delete(n2, stringBuilder.length());
            this.d(stringBuilder);
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void f(StringBuilder var1_1, Object var2_2) {
        if (var2_2 != this) ** GOTO lbl6
        try {
            var1_1.append("this future");
            return;
lbl6:
            // 1 sources

            var1_1.append(var2_2);
            return;
        }
        catch (StackOverflowError var2_3) {
        }
        catch (Exception var2_4) {
            // empty catch block
        }
        var1_1.append("Exception thrown from implementation: ");
        var1_1.append(var2_5.getClass());
    }

    private static void g(Runnable object, Executor object2) {
        try {
            object2.execute((Runnable)object);
            return;
        }
        catch (Exception exception) {
            Logger logger = i.a();
            Level level = Level.SEVERE;
            object = String.valueOf(object);
            object2 = String.valueOf(object2);
            StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
            stringBuilder.append((String)object);
            stringBuilder.append(" with executor ");
            stringBuilder.append((String)object2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", stringBuilder.toString(), exception);
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object h(hpn object) {
        void var0_3;
        boolean bl2;
        Object object3;
        if (object instanceof hne) {
            Object object4;
            object = object4 = ((hnk)object).value;
            if (!(object4 instanceof hmx)) return Objects.requireNonNull(object);
            hmx hmx2 = (hmx)object4;
            object = object4;
            if (!hmx2.c) return Objects.requireNonNull(object);
            object = hmx2.d;
            if (object != null) {
                object = new hmx(false, (Throwable)object);
                return Objects.requireNonNull(object);
            }
            object = hmx.b;
            return Objects.requireNonNull(object);
        }
        if (object instanceof hqi) {
            object3 = ((hqi)object).i();
            if (object3 != null) return new hmz((Throwable)object3);
        }
        if ((h ^ true) & (bl2 = object.isCancelled())) return Objects.requireNonNull(hmx.b);
        try {
            Object object2 = a.h((Future)object);
            if (bl2) {
                String string = String.valueOf(object);
                object2 = new StringBuilder("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                ((StringBuilder)object2).append(string);
                object3 = new IllegalArgumentException(((StringBuilder)object2).toString());
                return new hmx(false, (Throwable)object3);
            }
            object3 = object2;
            if (object2 != null) return object3;
            return a;
        }
        catch (Error error) {
            return new hmz((Throwable)var0_3);
        }
        catch (Exception exception) {
            // empty catch block
            return new hmz((Throwable)var0_3);
        }
        catch (CancellationException cancellationException) {
            if (bl2) return new hmx(false, cancellationException);
            return new hmz(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(object))), cancellationException));
        }
        catch (ExecutionException executionException) {
            if (!bl2) return new hmz(executionException.getCause());
            return new hmx(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(object))), executionException));
        }
    }

    public static void j(hnk object, boolean bl2) {
        Object object2 = null;
        Object object3 = object;
        object = object2;
        block0: while (true) {
            Object object4;
            object2 = j.b((hnk)object3, hnj.a);
            while (object2 != null) {
                object4 = ((hnj)object2).thread;
                if (object4 != null) {
                    ((hnj)object2).thread = null;
                    LockSupport.unpark((Thread)object4);
                }
                object2 = ((hnj)object2).next;
            }
            if (bl2) {
                ((hnk)object3).k();
            }
            ((hnk)object3).b();
            object2 = j.a((hnk)object3, hna.a);
            object3 = object;
            object = object2;
            while (true) {
                object2 = object3;
                if (object == null) break;
                object2 = ((hna)object).next;
                ((hna)object).next = object3;
                object3 = object;
                object = object2;
            }
            while (object2 != null) {
                object = ((hna)object2).next;
                object3 = Objects.requireNonNull(((hna)object2).b);
                if (object3 instanceof hnc) {
                    object2 = (hnc)object3;
                    object3 = ((hnc)object2).a;
                    if (((hnk)object3).value == object2 && j.f((hnk)object3, object2, object4 = hnk.h(((hnc)object2).b))) {
                        bl2 = false;
                        continue block0;
                    }
                } else {
                    hnk.g((Runnable)object3, Objects.requireNonNull(((hna)object2).c));
                }
                object2 = object;
            }
            break;
        }
    }

    private final void q(hnj hnj2) {
        hnj2.thread = null;
        block0: while ((hnj2 = this.waiters) != hnj.a) {
            hnj hnj3 = null;
            while (hnj2 != null) {
                hnj hnj4;
                hnj hnj5 = hnj2.next;
                if (hnj2.thread != null) {
                    hnj4 = hnj2;
                } else if (hnj3 != null) {
                    hnj3.next = hnj5;
                    hnj4 = hnj3;
                    if (hnj3.thread == null) {
                        continue block0;
                    }
                } else {
                    hnj4 = hnj3;
                    if (!j.g(this, hnj2, hnj5)) continue block0;
                }
                hnj2 = hnj5;
                hnj3 = hnj4;
            }
            break block0;
        }
    }

    private static final Object r(Object object) {
        if (!(object instanceof hmx)) {
            if (!(object instanceof hmz)) {
                Object object2 = object;
                if (object == a) {
                    object2 = null;
                }
                return object2;
            }
            throw new ExecutionException(((hmz)object).b);
        }
        object = ((hmx)object).d;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause((Throwable)object);
        throw cancellationException;
    }

    protected String a() {
        if (this instanceof ScheduledFuture) {
            long l2 = ((ScheduledFuture)((Object)this)).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder stringBuilder = new StringBuilder("remaining delay=[");
            stringBuilder.append(l2);
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
        return null;
    }

    protected void b() {
    }

    @Override
    public void c(Runnable runnable, Executor executor) {
        hna hna2;
        a.s(runnable, "Runnable was null.");
        a.s(executor, "Executor was null.");
        if (!this.isDone() && (hna2 = this.listeners) != hna.a) {
            hna hna3;
            hna hna4 = new hna(runnable, executor);
            do {
                hna4.next = hna2;
                if (j.e(this, hna2, hna4)) {
                    return;
                }
                hna2 = hna3 = this.listeners;
            } while (hna3 != hna.a);
        }
        hnk.g(runnable, executor);
    }

    @Override
    public boolean cancel(boolean bl2) {
        Object object = this.value;
        boolean bl3 = object instanceof hnc;
        boolean bl4 = false;
        boolean bl5 = object == null;
        if (bl3 | bl5) {
            Object object2;
            hmx hmx2;
            if (h) {
                hmx2 = new hmx(bl2, new CancellationException("Future.cancel() was called."));
            } else {
                object2 = bl2 ? hmx.a : hmx.b;
                hmx2 = Objects.requireNonNull(object2);
            }
            hnk hnk2 = this;
            bl4 = false;
            object2 = object;
            while (true) {
                if (j.f(hnk2, object2, hmx2)) {
                    hnk.j(hnk2, bl2);
                    if (object2 instanceof hnc) {
                        object2 = ((hnc)object2).b;
                        if (object2 instanceof hne) {
                            hnk2 = (hnk)object2;
                            object2 = hnk2.value;
                            bl5 = object2 == null;
                            if (bl5 | object2 instanceof hnc) {
                                bl4 = true;
                                continue;
                            }
                        } else {
                            object2.cancel(bl2);
                        }
                    }
                    bl4 = true;
                    break;
                }
                object2 = object = hnk2.value;
                if (!(object instanceof hnc)) break;
            }
        }
        return bl4;
    }

    public Object get() {
        if (!Thread.interrupted()) {
            Object object = this.value;
            boolean bl2 = object != null;
            if (bl2 & (object instanceof hnc ^ true)) {
                return hnk.r(object);
            }
            object = this.waiters;
            if (object != hnj.a) {
                hnj hnj2;
                hnj hnj3 = new hnj();
                do {
                    hnj3.a((hnj)object);
                    if (j.g(this, (hnj)object, hnj3)) {
                        block6: {
                            do {
                                LockSupport.park(this);
                                if (Thread.interrupted()) break block6;
                            } while (!((bl2 = (object = this.value) != null) & (object instanceof hnc ^ true)));
                            return hnk.r(object);
                        }
                        this.q(hnj3);
                        throw new InterruptedException();
                    }
                    hnj2 = this.waiters;
                    object = hnj2;
                } while (hnj2 != hnj.a);
            }
            return hnk.r(Objects.requireNonNull(this.value));
        }
        throw new InterruptedException();
    }

    public Object get(long l2, TimeUnit object) {
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
                if (bl2 & (object4 instanceof hnc ^ true)) {
                    return hnk.r(object4);
                }
                l5 = l3 > 0L ? System.nanoTime() + l3 : 0L;
                l4 = l3;
                if (l3 >= 1000L) {
                    object4 = this.waiters;
                    if (object4 != hnj.a) {
                        object3 = new hnj();
                        do {
                            ((hnj)object3).a((hnj)object4);
                            if (j.g(this, (hnj)object4, (hnj)object3)) {
                                block17: {
                                    do {
                                        LockSupport.parkNanos(this, Math.min(l3, 2147483647999999999L));
                                        if (Thread.interrupted()) break block17;
                                        object4 = this.value;
                                        bl2 = object4 != null;
                                        if (bl2 & (object4 instanceof hnc ^ true)) {
                                            return hnk.r(object4);
                                        }
                                        l3 = l4 = l5 - System.nanoTime();
                                    } while (l4 >= 1000L);
                                    this.q((hnj)object3);
                                    break block18;
                                }
                                this.q((hnj)object3);
                                throw new InterruptedException();
                            }
                            object4 = object2 = this.waiters;
                        } while (object2 != hnj.a);
                    }
                    return hnk.r(Objects.requireNonNull(this.value));
                }
            }
            while (l4 > 0L) {
                object4 = this.value;
                bl2 = object4 != null;
                if (bl2 & (object4 instanceof hnc ^ true)) {
                    return hnk.r(object4);
                }
                if (!Thread.interrupted()) {
                    l4 = l5 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            object3 = this.toString();
            String string = ((Enum)object).toString().toLowerCase(Locale.ROOT);
            object4 = ((Enum)object).toString().toLowerCase(Locale.ROOT);
            object2 = new StringBuilder("Waited ");
            ((StringBuilder)object2).append(l2);
            ((StringBuilder)object2).append(" ");
            ((StringBuilder)object2).append((String)object4);
            object4 = object2 = ((StringBuilder)object2).toString();
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
    public final Throwable i() {
        Object object;
        if (this instanceof hne && (object = this.value) instanceof hmz) {
            return ((hmz)object).b;
        }
        return null;
    }

    @Override
    public boolean isCancelled() {
        return this.value instanceof hmx;
    }

    @Override
    public boolean isDone() {
        Object object = this.value;
        boolean bl2 = object instanceof hnc;
        boolean bl3 = object != null;
        return bl3 & (bl2 ^ true);
    }

    protected void k() {
    }

    public final void l(Future future) {
        boolean bl2 = future != null;
        if (bl2 & this.isCancelled()) {
            future.cancel(this.p());
        }
    }

    public final boolean m(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = a;
        }
        if (j.f(this, null, object2)) {
            hnk.j(this, false);
            return true;
        }
        return false;
    }

    public final boolean n(Throwable object) {
        fxf.K(object);
        object = new hmz((Throwable)object);
        if (j.f(this, null, object)) {
            hnk.j(this, false);
            return true;
        }
        return false;
    }

    public final boolean o(hpn object) {
        Object object2;
        fxf.K(object);
        Object object3 = object2 = this.value;
        if (object2 == null) {
            if (object.isDone()) {
                if (j.f(this, null, object = hnk.h((hpn)object))) {
                    hnk.j(this, false);
                    return true;
                }
                return false;
            }
            object3 = new hnc(this, (hpn)object);
            if (j.f(this, null, object3)) {
                try {
                    object.c((Runnable)object3, (Executor)hom.a);
                }
                catch (Throwable throwable) {
                    try {
                        object = new hmz(throwable);
                    }
                    catch (Error | Exception throwable2) {
                        object = hmz.a;
                    }
                    j.f(this, object3, object);
                }
                return true;
            }
            object3 = this.value;
        }
        if (object3 instanceof hmx) {
            object.cancel(((hmx)object3).c);
        }
        return false;
    }

    protected final boolean p() {
        Object object = this.value;
        return object instanceof hmx && ((hmx)object).c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            stringBuilder.append(this.getClass().getSimpleName());
        } else {
            stringBuilder.append(this.getClass().getName());
        }
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("[status=");
        if (this.isCancelled()) {
            stringBuilder.append("CANCELLED");
        } else if (this.isDone()) {
            this.d(stringBuilder);
        } else {
            this.e(stringBuilder);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

