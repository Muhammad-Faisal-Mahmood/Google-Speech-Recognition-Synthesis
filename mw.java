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

public class mw
extends mv {
    @Override
    public void d(nh object, nh nh2, Window window, View view, boolean bl2, boolean bl3) {
        jse.e(object, "statusBarStyle");
        jse.e(nh2, "navigationBarStyle");
        jse.e(window, "window");
        jse.e(view, "view");
        wb.c(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        dp$$ExternalSyntheticApiModelOutline0.m(window, false);
        dp$$ExternalSyntheticApiModelOutline0.m$1(window, true);
        object = new bzb(view, null);
        object = Build.VERSION.SDK_INT >= 35 ? new xs(window) : (Build.VERSION.SDK_INT >= 30 ? new xr(window) : new xq(window, (bzb)object));
        we.e(bl2 ^ true, (wd)object);
        we.d(true ^ bl3, (wd)object);
    }
}

