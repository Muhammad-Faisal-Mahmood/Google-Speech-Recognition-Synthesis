/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface hpr
extends ScheduledExecutorService,
hpq {
    public hpp b(Runnable var1, long var2, TimeUnit var4);

    public hpp c(Callable var1, long var2, TimeUnit var4);

    public hpp d(Runnable var1, long var2, long var4, TimeUnit var6);

    public hpp e(Runnable var1, long var2, long var4, TimeUnit var6);
}

