/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.PopupWindow$OnDismissListener
 */
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

final class hx
implements PopupWindow.OnDismissListener {
    final ViewTreeObserver.OnGlobalLayoutListener a;
    final hy b;

    public hx(hy hy2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = hy2;
        this.a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}

