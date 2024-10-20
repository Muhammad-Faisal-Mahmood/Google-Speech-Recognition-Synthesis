/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 */
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public final class azu
implements vk {
    final ViewPager a;
    private final Rect b;

    public azu(ViewPager viewPager) {
        this.a = viewPager;
        this.b = new Rect();
    }

    @Override
    public final xn a(View object, xn xn2) {
        if (((xn)(object = wj.e((View)object, xn2))).r()) {
            return object;
        }
        xn2 = this.b;
        ((Rect)xn2).left = ((xn)object).b();
        ((Rect)xn2).top = ((xn)object).d();
        ((Rect)xn2).right = ((xn)object).c();
        ((Rect)xn2).bottom = ((xn)object).a();
        int n2 = this.a.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            xn xn3 = wj.d(this.a.getChildAt(i2), (xn)object);
            ((Rect)xn2).left = Math.min(xn3.b(), ((Rect)xn2).left);
            ((Rect)xn2).top = Math.min(xn3.d(), ((Rect)xn2).top);
            ((Rect)xn2).right = Math.min(xn3.c(), ((Rect)xn2).right);
            ((Rect)xn2).bottom = Math.min(xn3.a(), ((Rect)xn2).bottom);
        }
        object = Build.VERSION.SDK_INT >= 30 ? new xe((xn)object) : (Build.VERSION.SDK_INT >= 29 ? new xd((xn)object) : new xc((xn)object));
        ((xf)object).c(tg.c((Rect)xn2));
        return ((xf)object).a();
    }
}

