/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  android.view.View
 */
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class ftv
extends ftx {
    public final Rect a = new Rect();
    final Rect b = new Rect();
    public int c = 0;
    public int d;

    public ftv() {
    }

    public ftv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public float G(View view) {
        throw null;
    }

    public int H(View view) {
        throw null;
    }

    public abstract View I(List var1);

    public final int K(View view) {
        if (this.d == 0) {
            return 0;
        }
        float f2 = this.G(view);
        int n2 = this.d;
        return rw.z((int)(f2 * (float)n2), 0, n2);
    }

    public boolean M() {
        return false;
    }

    @Override
    protected final void af(CoordinatorLayout coordinatorLayout, View view, int n2) {
        View view2 = this.I(coordinatorLayout.a(view));
        if (view2 != null) {
            int n3;
            rz rz2 = (rz)view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + rz2.leftMargin, view2.getBottom() + rz2.topMargin, coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight() - rz2.rightMargin, coordinatorLayout.getHeight() + view2.getBottom() - coordinatorLayout.getPaddingBottom() - rz2.bottomMargin);
            xn xn2 = coordinatorLayout.e;
            if (xn2 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += xn2.b();
                rect.right -= xn2.c();
            }
            coordinatorLayout = this.b;
            int n4 = n3 = rz2.c;
            if (n3 == 0) {
                n4 = 0x800033;
            }
            Gravity.apply((int)n4, (int)view.getMeasuredWidth(), (int)view.getMeasuredHeight(), (Rect)rect, (Rect)coordinatorLayout, (int)n2);
            n2 = this.K(view2);
            view.layout(((Rect)coordinatorLayout).left, ((Rect)coordinatorLayout).top - n2, ((Rect)coordinatorLayout).right, ((Rect)coordinatorLayout).bottom - n2);
            this.c = ((Rect)coordinatorLayout).top - view2.getBottom();
            return;
        }
        coordinatorLayout.j(view, n2);
        this.c = 0;
    }
}

