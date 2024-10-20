/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 */
import android.view.View;
import android.view.ViewTreeObserver;

public final class fk
implements View.OnAttachStateChangeListener {
    final Object a;
    private final int b;

    public fk(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.b != 1) {
            return;
        }
        ((View)this.a).removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        vy.d((View)this.a);
    }

    public final void onViewDetachedFromWindow(View view) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object = ((gk)this.a).d;
                if (object != null) {
                    if (!object.isAlive()) {
                        ViewTreeObserver viewTreeObserver;
                        object = this.a;
                        ((gk)object).d = viewTreeObserver = view.getViewTreeObserver();
                    }
                    object = (gk)this.a;
                    object.d.removeGlobalOnLayoutListener(object.b);
                }
                view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            }
            return;
        }
        Object object = ((fm)this.a).e;
        if (object != null) {
            if (!object.isAlive()) {
                Object object2 = this.a;
                ((fm)object2).e = object = view.getViewTreeObserver();
            }
            object = (fm)this.a;
            object.e.removeGlobalOnLayoutListener(object.c);
        }
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }
}

