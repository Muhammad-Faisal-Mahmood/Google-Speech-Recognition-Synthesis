/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jef {
    private static final Logger f = Logger.getLogger(jef.class.getName());
    public final long a;
    public final guh b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Throwable e;

    public jef(long l2, guh guh2) {
        this.a = l2;
        this.b = guh2;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
            return;
        }
        catch (Throwable throwable) {
            f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", throwable);
            return;
        }
    }

    public static void b(AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, Executor executor) {
        jef.a(executor, new iuk(ambientModeSupport$AmbientController, 19));
    }
}

