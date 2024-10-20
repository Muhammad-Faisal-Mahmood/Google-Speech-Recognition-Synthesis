/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
import android.view.MenuItem;

final class fy
implements MenuItem.OnMenuItemClickListener {
    final fz a;
    private final MenuItem.OnMenuItemClickListener b;

    public fy(fz fz2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = fz2;
        this.b = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        fz fz2 = this.a;
        return this.b.onMenuItemClick(fz2.a(menuItem));
    }
}

