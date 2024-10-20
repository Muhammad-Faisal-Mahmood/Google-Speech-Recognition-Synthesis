/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

public final class bon
implements vk {
    public final Object a;
    private final int b;

    public bon(ViewGroup viewGroup, int n2) {
        this.b = n2;
        this.a = viewGroup;
    }

    public /* synthetic */ bon(mr mr2, int n2) {
        this.b = n2;
        this.a = mr2;
    }

    @Override
    public final xn a(View object, xn object2) {
        int n2;
        int n3 = this.b;
        boolean bl2 = true;
        if (n3 != 0) {
            if (n3 != 1) {
                AppBarLayout appBarLayout = (AppBarLayout)this.a;
                object = true != appBarLayout.getFitsSystemWindows() ? null : object2;
                if (!Objects.equals(appBarLayout.c, object)) {
                    appBarLayout.c = object;
                    appBarLayout.k();
                    appBarLayout.requestLayout();
                }
                return object2;
            }
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout)this.a;
            if (!Objects.equals(coordinatorLayout.e, object2)) {
                coordinatorLayout.e = object2;
                boolean bl3 = ((xn)object2).d() > 0;
                coordinatorLayout.f = bl3;
                bl3 = !bl3 && coordinatorLayout.getBackground() == null ? bl2 : false;
                coordinatorLayout.setWillNotDraw(bl3);
                if (!((xn)object2).r()) {
                    n3 = coordinatorLayout.getChildCount();
                    for (n2 = 0; n2 < n3; ++n2) {
                        View view = coordinatorLayout.getChildAt(n2);
                        object = wj.a;
                        if (view.getFitsSystemWindows() && ((rz)view.getLayoutParams()).a != null && ((xn)object2).r()) break;
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return object2;
        }
        object2 = ((xn)object2).f(143);
        n2 = dp$$ExternalSyntheticApiModelOutline0.m$1(sk$$ExternalSyntheticApiModelOutline1.m(((mr)this.a).getWindow().getDecorView().getRootWindowInsets(), 1));
        object.setPadding(((tg)object2).b, n2, ((tg)object2).d, ((tg)object2).e);
        object = (ViewGroup)object;
        object.setClipToPadding(false);
        object.setClipChildren(false);
        return xn.a;
    }
}

