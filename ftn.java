/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ScrollView
 */
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

public final class ftn
extends us {
    final AppBarLayout a;
    final CoordinatorLayout b;
    final AppBarLayout$BaseBehavior d;

    public ftn(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.d = appBarLayout$BaseBehavior;
    }

    @Override
    public final void b(View view, xv xv2) {
        super.b(view, xv2);
        xv2.g(ScrollView.class.getName());
        if (this.a.f() != 0 && (view = AppBarLayout$BaseBehavior.P(this.b)) != null) {
            Object object = this.a;
            int n2 = object.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (((ftp)object.getChildAt((int)i2).getLayoutParams()).a == 0) continue;
                object = this.d;
                AppBarLayout appBarLayout = this.a;
                if (((ftu)object).J() != -appBarLayout.f()) {
                    xv2.d(xu.a);
                    xv2.i(true);
                }
                if (((ftu)this.d).J() == 0) break;
                if (view.canScrollVertically(-1)) {
                    if (-this.a.b() == 0) break;
                    xv2.d(xu.b);
                    xv2.i(true);
                    return;
                }
                xv2.d(xu.b);
                xv2.i(true);
                return;
            }
        }
    }

    @Override
    public final boolean h(View view, int n2, Bundle bundle) {
        if (n2 == 4096) {
            this.a.i(false);
            return true;
        }
        if (n2 == 8192) {
            if (((ftu)this.d).J() != 0) {
                view = AppBarLayout$BaseBehavior.P(this.b);
                if (view.canScrollVertically(-1)) {
                    n2 = -this.a.b();
                    if (n2 != 0) {
                        this.d.Q(this.b, this.a, view, n2, new int[]{0, 0});
                        return true;
                    }
                } else {
                    this.a.i(true);
                    return true;
                }
            }
            return false;
        }
        return super.h(view, n2, bundle);
    }
}

