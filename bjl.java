/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import com.android.car.ui.FocusParkingView;

public final class bjl
implements ViewTreeObserver.OnGlobalLayoutListener {
    final RecyclerView a;
    final FocusParkingView b;

    public bjl(FocusParkingView focusParkingView, RecyclerView recyclerView) {
        this.a = recyclerView;
        this.b = focusParkingView;
    }

    public final void onGlobalLayout() {
        this.a.sendAccessibilityEvent(8);
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }
}

