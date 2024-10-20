/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

final class dqw
implements ViewTreeObserver.OnPreDrawListener {
    final dqx a;
    private final AtomicReference b;

    public dqw(dqx dqx2, View view) {
        this.a = dqx2;
        this.b = new AtomicReference<View>(view);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onPreDraw() {
        View view = this.b.getAndSet(null);
        if (view == null) return true;
        try {
            view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
            Handler handler = fpk.a();
            dqx dqx2 = this.a;
            dqv dqv2 = new dqv(dqx2, 1);
            handler.postAtFrontOfQueue((Runnable)dqv2);
            dqx2 = this.a;
            dqv dqv3 = new dqv(dqx2, 0);
            fpk.e(dqv3);
            return true;
        }
        catch (RuntimeException runtimeException) {
            return true;
        }
    }
}

