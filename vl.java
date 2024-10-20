/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.view.View;
import android.view.ViewTreeObserver;

public final class vl
implements ViewTreeObserver.OnPreDrawListener,
View.OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private vl(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static vl a(View view, Runnable object) {
        if (view != null) {
            object = new vl(view, (Runnable)object);
            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
            return object;
        }
        throw new NullPointerException("view == null");
    }

    public final void b() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        }
        this.a.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public final boolean onPreDraw() {
        this.b();
        this.c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.b();
    }
}

