/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class ftx
extends rw {
    private int a = 0;
    private hvz b;

    public ftx() {
    }

    public ftx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int T() {
        hvz hvz2 = this.b;
        if (hvz2 != null) {
            return hvz2.a;
        }
        return 0;
    }

    public final boolean U(int n2) {
        hvz hvz2 = this.b;
        if (hvz2 != null) {
            return hvz2.S(n2);
        }
        this.a = n2;
        return false;
    }

    protected void af(CoordinatorLayout coordinatorLayout, View view, int n2) {
        coordinatorLayout.j(view, n2);
    }

    @Override
    public boolean e(CoordinatorLayout coordinatorLayout, View view, int n2) {
        this.af(coordinatorLayout, view, n2);
        if (this.b == null) {
            this.b = new hvz(view);
        }
        this.b.R();
        this.b.Q();
        n2 = this.a;
        if (n2 != 0) {
            this.b.S(n2);
            this.a = 0;
        }
        return true;
    }
}

