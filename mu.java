/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 */
import android.os.Build;
import android.view.View;
import android.view.Window;

public class mu
extends kt {
    @Override
    public void d(nh object, nh nh2, Window window, View view, boolean bl2, boolean bl3) {
        jse.e(object, "statusBarStyle");
        jse.e(nh2, "navigationBarStyle");
        jse.e(window, "window");
        jse.e(view, "view");
        wb.c(window);
        window.setStatusBarColor(((nh)object).a(bl2));
        window.setNavigationBarColor(nh2.a(bl3));
        object = new bzb(view, null);
        object = Build.VERSION.SDK_INT >= 35 ? new xs(window) : (Build.VERSION.SDK_INT >= 30 ? new xr(window) : new xq(window, (bzb)object));
        we.e(bl2 ^ true, (wd)object);
        we.d(bl3 ^ true, (wd)object);
    }
}

