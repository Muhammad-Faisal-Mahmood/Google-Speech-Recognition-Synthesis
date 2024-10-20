/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class kll
extends kmm {
    public static final ReentrantLock b;
    public static final Condition c;
    public static final long d;
    public static final long e;
    public static kll f;
    public int g;
    public kll h;
    public long i;

    static {
        long l2;
        Object object = new ReentrantLock();
        b = object;
        object = ((ReentrantLock)object).newCondition();
        jse.d(object, "newCondition(...)");
        c = object;
        d = l2 = TimeUnit.SECONDS.toMillis(60L);
        e = TimeUnit.MILLISECONDS.toNanos(l2);
    }

    protected void a() {
    }

    public final long c(long l2) {
        return this.i - l2;
    }

    protected IOException d(IOException iOException) {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        kll kll2;
        Object object;
        long l2;
        long l3;
        block14: {
            l3 = this.o();
            boolean bl2 = this.h();
            l2 = l3;
            if (l3 == 0L) {
                if (!bl2) return;
                l2 = 0L;
            }
            ReentrantLock reentrantLock = b;
            reentrantLock.lock();
            if (this.g == 0) {
                this.g = 1;
                if (f == null) {
                    object = new kll();
                    f = object;
                    object = new kli();
                    ((Thread)object).start();
                }
                l3 = System.nanoTime();
                long l4 = l2 - 0L;
                long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (l5 != false && bl2) {
                    this.i = Math.min(l2, this.j() - l3) + l3;
                } else if (l5 != false) {
                    this.i = l2 + l3;
                } else {
                    if (!bl2) {
                        object = new AssertionError();
                        throw object;
                    }
                    this.i = this.j();
                }
                l2 = this.c(l3);
                object = f;
                jse.b(object);
                break block14;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Unbalanced enter/exit");
                throw illegalStateException;
            }
            finally {
                reentrantLock.unlock();
            }
        }
        while ((kll2 = ((kll)object).h) != null && l2 >= kll2.c(l3)) {
            object = kll2;
        }
        this.h = kll2;
        ((kll)object).h = this;
        if (object != f) return;
        c.signal();
    }

    public final boolean f() {
        ReentrantLock reentrantLock;
        block10: {
            reentrantLock = b;
            reentrantLock.lock();
            int n2 = this.g;
            boolean bl2 = false;
            this.g = 0;
            if (n2 == 1) break block10;
            if (n2 == 2) {
                bl2 = true;
            }
            reentrantLock.unlock();
            return bl2;
        }
        Object object = f;
        while (object != null) {
            kll kll2;
            block11: {
                kll2 = ((kll)object).h;
                if (kll2 != this) break block11;
                ((kll)object).h = this.h;
                this.h = null;
                return false;
            }
            object = kll2;
        }
        try {
            object = new IllegalStateException("node was not found in the queue");
            throw object;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            reentrantLock.unlock();
        }
    }
}

