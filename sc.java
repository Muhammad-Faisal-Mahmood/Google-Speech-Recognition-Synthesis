/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class sc {
    private static final ThreadLocal a = new ThreadLocal();
    private static final ThreadLocal b = new ThreadLocal();

    public static void a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal = a;
        Matrix matrix = (Matrix)threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        sc.b((ViewParent)viewGroup, view, matrix);
        threadLocal = b;
        view = (RectF)threadLocal.get();
        viewGroup = view;
        if (view == null) {
            viewGroup = new RectF();
            threadLocal.set(viewGroup);
        }
        viewGroup.set(rect);
        matrix.mapRect((RectF)viewGroup);
        float f2 = viewGroup.left;
        float f3 = viewGroup.top;
        float f4 = viewGroup.right;
        float f5 = viewGroup.bottom;
        rect.set((int)(f2 + 0.5f), (int)(f3 + 0.5f), (int)(f4 + 0.5f), (int)(f5 + 0.5f));
    }

    private static void b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent viewParent2 = view.getParent();
        if (viewParent2 instanceof View && viewParent2 != viewParent) {
            viewParent2 = (View)viewParent2;
            sc.b(viewParent, (View)viewParent2, matrix);
            int n2 = -viewParent2.getScrollX();
            int n3 = -viewParent2.getScrollY();
            matrix.preTranslate((float)n2, (float)n3);
        }
        matrix.preTranslate((float)view.getLeft(), (float)view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}

