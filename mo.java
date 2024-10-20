/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 */
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

public final class mo
implements ViewTreeObserver.OnDrawListener,
Runnable,
Executor {
    public Runnable a;
    final mr b;
    private final long c;
    private boolean d;

    public mo(mr mr2) {
        this.b = mr2;
        this.c = SystemClock.uptimeMillis() + 10000L;
    }

    public final void a(View view) {
        jse.e(view, "view");
        if (!this.d) {
            this.d = true;
            view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener)this);
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        jse.e(runnable, "runnable");
        this.a = runnable;
        runnable = this.b.getWindow().getDecorView();
        jse.d(runnable, "window.decorView");
        if (this.d) {
            if (jse.i(Looper.myLooper(), Looper.getMainLooper())) {
                runnable.invalidate();
                return;
            }
            runnable.postInvalidate();
            return;
        }
        runnable.postOnAnimation(new kd(this, 6, null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDraw() {
        Object object = this.a;
        if (object != null) {
            boolean bl2;
            object.run();
            this.a = null;
            giu giu2 = this.b.C();
            object = giu2.b;
            synchronized (object) {
                bl2 = giu2.a;
            }
            if (!bl2) return;
            this.d = false;
            this.b.getWindow().getDecorView().post((Runnable)this);
            return;
        } else {
            long l2 = this.c;
            if (SystemClock.uptimeMillis() <= l2) return;
            this.d = false;
            this.b.getWindow().getDecorView().post((Runnable)this);
        }
    }

    @Override
    public final void run() {
        this.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this);
    }
}

