/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public abstract class cm {
    private static boolean g(List list, View view, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (list.get(i2) != view) continue;
            return true;
        }
        return false;
    }

    protected static void v(List list, View view) {
        int n2 = list.size();
        if (!cm.g(list, view, n2)) {
            if (wa.f(view) != null) {
                list.add(view);
            }
            for (int i2 = n2; i2 < list.size(); ++i2) {
                view = (View)list.get(i2);
                if (!(view instanceof ViewGroup)) continue;
                view = (ViewGroup)view;
                int n3 = view.getChildCount();
                for (int i3 = 0; i3 < n3; ++i3) {
                    View view2 = view.getChildAt(i3);
                    if (cm.g(list, view2, n2) || wa.f(view2) == null) continue;
                    list.add(view2);
                }
            }
        }
    }

    protected static boolean x(List list) {
        return list == null || list.isEmpty();
        {
        }
    }

    protected static final void y(View view, Rect rect) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset((float)view.getLeft(), (float)view.getTop());
        Object object = view.getParent();
        while (object instanceof View) {
            object = (View)object;
            int n2 = -object.getScrollX();
            int n3 = -object.getScrollY();
            rectF.offset((float)n2, (float)n3);
            object.getMatrix().mapRect(rectF);
            rectF.offset((float)object.getLeft(), (float)object.getTop());
            object = object.getParent();
        }
        object = new int[2];
        view.getRootView().getLocationOnScreen((int[])object);
        rectF.offset((float)object[0], (float)object[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public abstract Object a(Object var1);

    public abstract Object b(Object var1, Object var2, Object var3);

    public abstract Object c(Object var1);

    public abstract void d(Object var1, View var2);

    public abstract void e(Object var1, ArrayList var2);

    public abstract void f(ViewGroup var1, Object var2);

    public abstract void h(Object var1, View var2, ArrayList var3);

    public abstract void i(Object var1, Rect var2);

    public abstract void j(Object var1, View var2);

    public abstract void k(Object var1, View var2, ArrayList var3);

    public abstract void l(Object var1, ArrayList var2, ArrayList var3);

    public abstract boolean m(Object var1);

    public boolean n() {
        throw null;
    }

    public boolean o(Object object) {
        throw null;
    }

    public abstract Object p(Object var1, Object var2);

    public abstract void q(Object var1, Object var2, ArrayList var3, Object var4, ArrayList var5);

    public void r(Object object, tu tu2, Runnable runnable) {
        throw null;
    }

    public Object s(ViewGroup viewGroup, Object object) {
        return null;
    }

    public void t(Object object) {
    }

    public void u(Object object, Runnable runnable) {
    }

    public void w(Object object, float f2) {
    }

    public void z(Object object, tu tu2, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }
}

