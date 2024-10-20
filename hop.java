/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hop {
    private static final hpm c = new hpm(hop.class);
    public hoo a;
    public boolean b;

    public static void a(Runnable object, Executor object2) {
        try {
            object2.execute((Runnable)object);
            return;
        }
        catch (Exception exception) {
            Logger logger = c.a();
            Level level = Level.SEVERE;
            object = String.valueOf(object);
            object2 = String.valueOf(object2);
            StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
            stringBuilder.append((String)object);
            stringBuilder.append(" with executor ");
            stringBuilder.append((String)object2);
            logger.logp(level, "com.google.common.util.concurrent.ExecutionList", "executeListener", stringBuilder.toString(), exception);
            return;
        }
    }
}

