/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class bpn
implements Executor {
    public static final bpn a = new bpn();
    private final Handler b = new Handler(Looper.getMainLooper());

    @Override
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}

