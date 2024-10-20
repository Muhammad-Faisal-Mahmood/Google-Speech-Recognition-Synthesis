/*
 * Decompiled with CFR 0.152.
 */
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

final class ksy
implements Executor {
    private final BlockingQueue a = new LinkedBlockingQueue();
    private boolean b;
    private boolean c;
    private InterruptedIOException d;
    private RuntimeException e;

    /*
     * Unable to fully structure code
     */
    private final Runnable d(boolean var1_1, long var2_2) {
        if (var1_1) ** GOTO lbl5
        try {
            block3: {
                var4_3 = (Runnable)this.a.take();
                break block3;
lbl5:
                // 1 sources

                var4_3 = (Runnable)this.a.poll(var2_2, TimeUnit.NANOSECONDS);
            }
            if (var4_3 != null) {
                return var4_3;
            }
            throw new SocketTimeoutException();
        }
        catch (InterruptedException var4_4) {
            var5_5 = new InterruptedIOException();
            var5_5.initCause(var4_4);
            throw var5_5;
        }
    }

    public final void a() {
        this.b(0);
    }

    /*
     * Unable to fully structure code
     */
    public final void b(int var1_1) {
        block6: {
            var2_2 = System.nanoTime();
            var4_3 = TimeUnit.NANOSECONDS.convert(var1_1, TimeUnit.MILLISECONDS);
            if (this.c) {
                var6_4 = this.d;
                if (var6_4 != null) {
                    throw var6_4;
                }
                throw this.e;
            }
            if (this.b) break block6;
            this.b = true;
            while (this.b) {
                if (var1_1 != 0) ** GOTO lbl15
                try {
                    this.d(false, 0L).run();
                    continue;
lbl15:
                    // 1 sources

                    this.d(true, var4_3 - System.nanoTime() + var2_2).run();
                }
                catch (RuntimeException var6_5) {
                    this.b = false;
                    this.c = true;
                    this.e = var6_5;
                    throw var6_5;
                }
                catch (InterruptedIOException var6_6) {
                    this.b = false;
                    this.c = true;
                    this.d = var6_6;
                    throw var6_6;
                }
            }
            return;
        }
        throw new IllegalStateException("Cannot run loop when it is already running.");
    }

    public final void c() {
        this.b = false;
    }

    @Override
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                this.a.put(runnable);
                return;
            }
            catch (InterruptedException interruptedException) {
                throw new RejectedExecutionException(interruptedException);
            }
        }
        throw new IllegalArgumentException();
    }
}

