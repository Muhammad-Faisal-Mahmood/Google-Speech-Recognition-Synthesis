/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public final class gcr
implements bbt {
    final Handler a;
    private final int b;

    public gcr(int n2) {
        this.b = n2;
        this.a = rw.y(Looper.getMainLooper());
    }

    public gcr(Handler handler, int n2) {
        this.b = n2;
        this.a = handler;
    }

    @Override
    public final void a(Runnable runnable) {
        if (this.b != 0) {
            this.a.removeCallbacks(runnable);
            return;
        }
        this.a.removeCallbacks(runnable);
    }

    @Override
    public final void b(long l2, Runnable runnable) {
        if (this.b != 0) {
            this.a.postDelayed(runnable, l2);
            return;
        }
        this.a.postDelayed(runnable, l2);
    }
}

