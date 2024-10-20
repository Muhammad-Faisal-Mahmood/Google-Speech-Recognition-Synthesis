/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 */
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

final class vz
implements View.OnApplyWindowInsetsListener {
    xn a;
    final View b;
    final vk c;

    public vz(View view, vk vk2) {
        this.b = view;
        this.c = vk2;
        this.a = null;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets object) {
        xn xn2 = xn.n((WindowInsets)object, view);
        if (Build.VERSION.SDK_INT < 30) {
            wa.g((WindowInsets)object, this.b);
            if (xn2.equals(this.a)) {
                return this.c.a(view, xn2).e();
            }
        }
        this.a = xn2;
        object = this.c.a(view, xn2);
        if (Build.VERSION.SDK_INT >= 30) {
            return ((xn)object).e();
        }
        vy.d(view);
        return ((xn)object).e();
    }
}

