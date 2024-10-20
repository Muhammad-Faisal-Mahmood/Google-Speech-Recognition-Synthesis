/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 */
import android.view.MenuItem;

final class fx
implements MenuItem.OnActionExpandListener {
    final fz a;
    private final MenuItem.OnActionExpandListener b;

    public fx(fz fz2, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = fz2;
        this.b = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        fz fz2 = this.a;
        return this.b.onMenuItemActionCollapse(fz2.a(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        fz fz2 = this.a;
        return this.b.onMenuItemActionExpand(fz2.a(menuItem));
    }
}

