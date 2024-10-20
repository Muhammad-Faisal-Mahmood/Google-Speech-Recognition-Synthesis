/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

final class cou
implements Runnable {
    private static final Logger a = Logger.getLogger("ErrorLoggingExecutor");
    private final Runnable b;
    private final jnu c;

    public cou(Runnable runnable, jnu jnu2) {
        this.b = runnable;
        this.c = jnu2;
    }

    @Override
    public final void run() {
        try {
            this.b.run();
            return;
        }
        catch (Throwable throwable) {
            if (((Boolean)((gto)((imc)this.c).a).e(false)).booleanValue()) {
                Thread thread = Thread.currentThread();
                thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
                return;
            }
            a.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "Uncaught exception from runnable", throwable);
            Log.e((String)"ErrorLoggingExecutor", (String)"Uncaught exception from runnable", (Throwable)throwable);
            return;
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}

