/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 */
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class dqu
implements ViewTreeObserver.OnDrawListener {
    public static final int b = 0;
    final dqx a;
    private final AtomicReference c;

    public dqu(dqx dqx2, View view) {
        this.a = dqx2;
        this.c = new AtomicReference<View>(view);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDraw() {
        View view = this.c.getAndSet(null);
        if (view == null) return;
        try {
            Handler handler = fpk.a();
            dqx dqx2 = this.a;
            Object object = new cmw(dqx2, 19);
            handler.postAtFrontOfQueue((Runnable)object);
            object = this.a;
            cmw cmw2 = new cmw(object, 20);
            fpk.e(cmw2);
            object = new dpw(this, view, 3);
            fpk.e((Runnable)object);
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }
}

