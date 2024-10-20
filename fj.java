/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 */
import android.content.Context;
import android.view.MenuItem;

class fj {
    final Context a;
    public pa b;

    public fj(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof ts) {
            MenuItem menuItem2;
            menuItem = (ts)menuItem;
            if (this.b == null) {
                this.b = new pa();
            }
            if ((menuItem2 = (MenuItem)this.b.get(menuItem)) == null) {
                menuItem2 = new fz(this.a, (ts)menuItem);
                this.b.put(menuItem, menuItem2);
                return menuItem2;
            }
            return menuItem2;
        }
        return menuItem;
    }
}

