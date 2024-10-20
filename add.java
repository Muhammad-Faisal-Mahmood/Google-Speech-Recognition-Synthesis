/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class add
extends FutureTask {
    final ade a;

    public add(ade ade2, Callable callable) {
        this.a = ade2;
        super(callable);
    }

    @Override
    protected final void done() {
        try {
            Object v2 = this.get();
            this.a.e(v2);
            return;
        }
        catch (Throwable throwable) {
            throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
        }
        catch (CancellationException cancellationException) {
            this.a.e(null);
            return;
        }
        catch (ExecutionException executionException) {
            throw new RuntimeException("An error occurred while executing doInBackground()", executionException.getCause());
        }
        catch (InterruptedException interruptedException) {
            Log.w((String)"AsyncTask", (Throwable)interruptedException);
            return;
        }
    }
}

