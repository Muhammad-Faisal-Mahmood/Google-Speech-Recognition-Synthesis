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

public final class bob
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final View a;
    public final boe b;
    public final ViewTreeObserver.OnGlobalLayoutListener[] c;
    public final Runnable[] d;
    public final Runnable[] e;

    public /* synthetic */ bob(View view, boe boe2, ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArray, Runnable[] runnableArray, Runnable[] runnableArray2) {
        this.a = view;
        this.b = boe2;
        this.c = onGlobalLayoutListenerArray;
        this.d = runnableArray;
        this.e = runnableArray2;
    }

    public final void onGlobalLayout() {
        Runnable[] runnableArray = this.a;
        if (runnableArray.isShown()) {
            runnableArray = AmbientModeSupport$AmbientCallback.h((View)runnableArray);
            String.valueOf(runnableArray);
            if (AmbientModeSupport$AmbientCallback.r((View)runnableArray)) {
                Runnable[] runnableArray2 = this.e;
                runnableArray = this.d;
                ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArray = this.c;
                AmbientModeSupport$AmbientCallback.i(this.b, onGlobalLayoutListenerArray, runnableArray, runnableArray2);
            }
        }
    }
}

