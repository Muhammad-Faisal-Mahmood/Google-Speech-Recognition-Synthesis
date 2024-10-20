/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.LockSupport;

final class hjs
implements Runnable {
    final int a;
    Thread b;
    volatile Thread c;
    hjr d;
    int e;
    long f;
    volatile long g;
    final hjt h;
    volatile int i;

    public hjs(hjt hjt2, int n2) {
        this.h = hjt2;
        this.i = 2;
        this.a = n2;
    }

    private final void d() {
        if (this.h.j) {
            long l2;
            this.f = l2 = this.f + 1L;
            this.g = l2;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.f.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.o.countDown();
    }

    public final void b() {
        this.h.i.newThread(this).start();
    }

    public final void c(hjr hjr2) {
        int n2 = this.e;
        if (n2 < 5) {
            hjr2.a = this.d;
            hjr2.b = this.a;
            this.d = hjr2;
            this.e = n2 + 1;
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Thread thread;
        this.b = thread = Thread.currentThread();
        this.c = thread;
        if (this.h.h.get()) {
            this.a();
            return;
        }
        block12: while (true) {
            int n2;
            int n3;
            block31: {
                hjr hjr2;
                if ((hjr2 = (hjr)this.h.c.poll()) != null) {
                    void var4_9;
                    this.h.a();
                    Runnable runnable = (Runnable)hjr2.a;
                    this.c(hjr2);
                    this.h.k.run();
                    runnable.run();
                    this.h.l.run();
                    this.d();
                    Thread.interrupted();
                    if (!this.h.g) continue;
                    break;
                    catch (Throwable throwable) {
                        this.d();
                        throw throwable;
                        catch (Throwable throwable2) {
                            this.h.l.run();
                            {
                                catch (Throwable throwable3) {
                                    this.d();
                                    throw throwable3;
                                }
                            }
                            try {
                                this.d();
                                throw throwable2;
                            }
                            catch (Error error) {
                            }
                            catch (RuntimeException runtimeException) {
                                // empty catch block
                            }
                        }
                    }
                    if (this.h.h.get()) {
                        this.a();
                        throw var4_9;
                    }
                    this.b();
                    throw var4_9;
                }
                this.i = 2;
                hjt hjt2 = this.h;
                hjr2 = null;
                while (true) {
                    void var4_16;
                    hjr hjr3;
                    block34: {
                        block33: {
                            Object object;
                            block32: {
                                hjr3 = (hjr)hjt2.p.get();
                                object = hjr3.a;
                                Object object2 = hjt.a;
                                n3 = 0;
                                if (object != object2) break block32;
                                n2 = hjr3.b;
                                if (n2 == 0) {
                                    n2 = 3;
                                    break block31;
                                }
                                if (!a.l(hjt2.p, hjr3, hjt2.n[n2 - 1])) continue;
                                if (hjr2 != null) {
                                    this.c(hjr2);
                                }
                                break block33;
                            }
                            if (object != hjt.b || (n2 = hjr3.b) <= 0) break block34;
                            hjr[] hjrArray = hjt2.m;
                            if (!a.l(hjt2.p, hjr3, hjrArray[n2 - 1])) continue;
                            if (hjr2 != null) {
                                this.c(hjr2);
                            }
                        }
                        n2 = 1;
                        break block31;
                    }
                    hjr hjr4 = hjr2;
                    if (hjr2 == null) {
                        hjr hjr5 = this.d;
                        if (hjr5 == null) {
                            hjr hjr6 = new hjr(this.h.m[0], this.a);
                        } else {
                            this.d = (hjr)hjr5.a;
                            --this.e;
                        }
                    }
                    var4_16.a = hjr3;
                    hjr2 = var4_16;
                    if (a.l(hjt2.p, hjr3, var4_16)) break;
                }
                n2 = 2;
            }
            if (--n2 != 0) {
                if (n2 == 2) {
                    this.i = 3;
                    break;
                }
            } else {
                this.i = 1;
                continue;
            }
            n2 = n3;
            while (true) {
                LockSupport.park(this.h);
                int n4 = this.i;
                n3 = n4 - 1;
                if (n4 == 0) throw null;
                if (n3 == 0) break;
                if (n3 != 1) {
                    if (n3 == 2) break block12;
                    continue;
                }
                n2 |= Thread.interrupted();
            }
            if (n2 == 0) continue;
            this.b.interrupt();
        }
        this.a();
    }
}

