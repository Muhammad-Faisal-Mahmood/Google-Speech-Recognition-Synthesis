/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;

public final class bnd
implements View.OnAttachStateChangeListener {
    final Object a;
    final Object b;
    private final int c;

    public bnd(bn bn2, gbb gbb2, int n2) {
        this.c = n2;
        this.a = bn2;
        this.b = gbb2;
    }

    public bnd(bne bne2, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, int n2) {
        this.c = n2;
        this.a = onApplyWindowInsetsListener;
        this.b = bne2;
    }

    public final void onViewAttachedToWindow(View object) {
        if (this.c != 0) {
            object = (gbb)this.b;
            ((gbb)object).e();
            cz.c((ViewGroup)((be)((gbb)object).c).P.getParent(), ((bn)this.a).a).g();
            return;
        }
        ((bne)this.b).d.getRootView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)this.a);
        ((bne)this.b).d.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

