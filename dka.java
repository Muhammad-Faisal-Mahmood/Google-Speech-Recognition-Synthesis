/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final class dka
implements RejectedExecutionHandler {
    @Override
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/PrimesExecutorsModule$DefaultRejectedExecutionHandler", "rejectedExecution", 76, "PrimesExecutorsModule.java")).u("Service rejected execution of %s", runnable);
    }
}

