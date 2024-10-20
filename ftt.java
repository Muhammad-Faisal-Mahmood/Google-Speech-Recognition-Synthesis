/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class ftt
implements Runnable {
    final ftu a;
    private final CoordinatorLayout b;
    private final View c;

    public ftt(ftu ftu2, CoordinatorLayout coordinatorLayout, View view) {
        this.a = ftu2;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override
    public final void run() {
        Object object;
        if (this.c != null && (object = this.a.c) != null) {
            if (object.computeScrollOffset()) {
                object = this.a;
                ((ftu)object).S(this.b, this.c, ((ftu)object).c.getCurrY());
                this.c.postOnAnimation((Runnable)this);
                return;
            }
            this.a.M(this.b, this.c);
        }
    }
}

