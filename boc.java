/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;

public final class boc
implements Runnable {
    public final boe a;
    public final ViewTreeObserver.OnGlobalLayoutListener[] b;
    public final Runnable[] c;
    public final Runnable[] d;
    public final View e;

    public /* synthetic */ boc(boe boe2, ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArray, Runnable[] runnableArray, Runnable[] runnableArray2, View view) {
        this.a = boe2;
        this.b = onGlobalLayoutListenerArray;
        this.c = runnableArray;
        this.d = runnableArray2;
        this.e = view;
    }

    @Override
    public final void run() {
        boe boe2 = this.a;
        AmbientModeSupport$AmbientCallback.i(boe2, this.b, this.c, this.d);
        View view = this.e;
        if (!(AmbientModeSupport$AmbientCallback.m(view) || boe2.isLayoutCompleted() && view.isShown() && AmbientModeSupport$AmbientCallback.n(boe2))) {
            AmbientModeSupport$AmbientCallback.k(view.getRootView(), 1, null, false, false);
        }
    }
}

