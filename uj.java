/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class uj
implements Executor {
    private final Handler a;
    private final int b;

    public uj(int n2) {
        this.b = n2;
        this.a = new gbs(Looper.getMainLooper(), null);
    }

    public uj(Handler handler, int n2) {
        this.b = n2;
        this.a = handler;
    }

    public uj(Looper looper, int n2) {
        this.b = n2;
        this.a = new gbs(looper, null);
    }

    @Override
    public final void execute(Runnable runnable) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    this.a.post(runnable);
                    return;
                }
                this.a.post(runnable);
                return;
            }
            a.Y(runnable);
            if (this.a.post(runnable)) {
                return;
            }
            runnable = this.a;
            Objects.toString(runnable);
            throw new RejectedExecutionException(runnable.toString().concat(" is shutting down"));
        }
        a.Y(runnable);
        if (this.a.post(runnable)) {
            return;
        }
        runnable = this.a;
        Objects.toString(runnable);
        throw new RejectedExecutionException(runnable.toString().concat(" is shutting down"));
    }
}

