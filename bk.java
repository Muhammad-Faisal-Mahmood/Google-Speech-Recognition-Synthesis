/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.LayoutTransition
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowInsets
 *  android.widget.FrameLayout
 */
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bk
extends FrameLayout {
    public boolean a;
    private final List b;
    private final List c;
    private View.OnApplyWindowInsetsListener d;

    public bk(Context object, AttributeSet object22, by by2) {
        jse.e(object, "context");
        jse.e(object22, "attrs");
        super((Context)object, (AttributeSet)object22);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
        String string = object22.getClassAttribute();
        Object object3 = object.obtainStyledAttributes((AttributeSet)object22, s.b, 0, 0);
        jse.d(object3, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)");
        Object object4 = string;
        if (string == null) {
            object4 = object3.getString(0);
        }
        string = object3.getString(1);
        object3.recycle();
        int n2 = this.getId();
        object3 = by2.d(n2);
        if (object4 != null && object3 == null) {
            if (n2 == -1) {
                object = string != null ? " with tag ".concat(string) : "";
                object22 = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                ((StringBuilder)object22).append((String)object4);
                ((StringBuilder)object22).append((String)object);
                throw new IllegalStateException(((StringBuilder)object22).toString());
            }
            object3 = by2.g();
            object.getClassLoader();
            object4 = ((bl)object3).b((String)object4);
            jse.d(object4, "fm.fragmentFactory.insta\u2026ontext.classLoader, name)");
            ((be)object4).E = n2;
            ((be)object4).F = n2;
            ((be)object4).G = string;
            ((be)object4).A = by2;
            ((be)object4).B = by2.l;
            ((be)object4).onInflate((Context)object, (AttributeSet)object22, null);
            object = new y(by2);
            ((ce)object).q();
            ((be)object4).O = this;
            ((be)object4).w = true;
            ((ce)object).c(this.getId(), (be)object4, string, 1);
            ((ce)object).o();
            ((y)object).a.F((bv)object, true);
        }
        for (Object object22 : by2.y.e()) {
            object4 = (be)((gbb)object22).c;
            if (((be)object4).F != this.getId() || (by2 = ((be)object4).P) == null || by2.getParent() != null) continue;
            ((be)object4).O = this;
            ((gbb)object22).b();
            ((gbb)object22).e();
        }
    }

    private final void a(View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }

    public final void addView(View view, int n2, ViewGroup.LayoutParams layoutParams) {
        jse.e(view, "child");
        if (by.f(view) != null) {
            super.addView(view, n2, layoutParams);
            return;
        }
        throw new IllegalStateException(a.ak(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment."));
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        jse.e(windowInsets, "insets");
        xn xn2 = xn.m(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        if (onApplyWindowInsetsListener != null) {
            jse.e(windowInsets, "insets");
            xn2 = onApplyWindowInsetsListener.onApplyWindowInsets((View)this, windowInsets);
            jse.d(xn2, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)");
            xn2 = xn.m((WindowInsets)xn2);
        } else {
            xn2 = wj.e((View)this, xn2);
        }
        jse.d(xn2, "if (applyWindowInsetsLis\u2026setsCompat)\n            }");
        if (!xn2.r()) {
            int n2 = this.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                wj.d(this.getChildAt(i2), xn2);
            }
        }
        return windowInsets;
    }

    protected final void dispatchDraw(Canvas canvas) {
        jse.e(canvas, "canvas");
        if (this.a) {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                super.drawChild(canvas, (View)iterator.next(), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    protected final boolean drawChild(Canvas canvas, View view, long l2) {
        jse.e(canvas, "canvas");
        jse.e(view, "child");
        if (this.a && !this.b.isEmpty() && this.b.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, l2);
    }

    public final void endViewTransition(View view) {
        jse.e(view, "view");
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.a = true;
        }
        super.endViewTransition(view);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        jse.e(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int n2 = this.getChildCount();
        while (--n2 >= 0) {
            View view = this.getChildAt(n2);
            jse.d(view, "view");
            this.a(view);
        }
        super.removeAllViewsInLayout();
    }

    public final void removeView(View view) {
        jse.e(view, "view");
        this.a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int n2) {
        View view = this.getChildAt(n2);
        jse.d(view, "view");
        this.a(view);
        super.removeViewAt(n2);
    }

    public final void removeViewInLayout(View view) {
        jse.e(view, "view");
        this.a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int n2, int n3) {
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            View view = this.getChildAt(i2);
            jse.d(view, "view");
            this.a(view);
        }
        super.removeViews(n2, n3);
    }

    public final void removeViewsInLayout(int n2, int n3) {
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            View view = this.getChildAt(i2);
            jse.d(view, "view");
            this.a(view);
        }
        super.removeViewsInLayout(n2, n3);
    }

    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        jse.e(onApplyWindowInsetsListener, "listener");
        this.d = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        jse.e(view, "view");
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }
}

