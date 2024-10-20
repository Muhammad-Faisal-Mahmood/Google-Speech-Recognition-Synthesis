/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class jkg
implements jjl {
    private final int a;

    public jkg(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object a() {
        if (this.a == 0) return Executors.newCachedThreadPool(jeb.k("grpc-okhttp-%d"));
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1, jeb.k("grpc-timer-%d"));
        try {
            scheduledExecutorService.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke((Object)scheduledExecutorService, true);
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorService);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorService);
        }
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        if (this.a != 0) {
            ((ScheduledExecutorService)object).shutdown();
            return;
        }
        ((ExecutorService)object).shutdown();
    }
}

