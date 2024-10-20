/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.SubMenu
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class gh
extends fj
implements Menu {
    private final tr c;

    public gh(Context context, tr tr2) {
        super(context);
        this.c = tr2;
    }

    public final MenuItem add(int n2) {
        return this.a(this.c.add(n2));
    }

    public final MenuItem add(int n2, int n3, int n4, int n5) {
        return this.a(this.c.add(n2, n3, n4, n5));
    }

    public final MenuItem add(int n2, int n3, int n4, CharSequence charSequence) {
        return this.a(((fs)this.c).c(n2, n3, n4, charSequence));
    }

    public final MenuItem add(CharSequence charSequence) {
        return this.a(this.c.add(charSequence));
    }

    public final int addIntentOptions(int n2, int n3, int n4, ComponentName componentName, Intent[] intentArray, Intent intent, int n5, MenuItem[] menuItemArray) {
        MenuItem[] menuItemArray2 = menuItemArray != null ? new MenuItem[menuItemArray.length] : null;
        n3 = this.c.addIntentOptions(n2, n3, n4, componentName, intentArray, intent, n5, menuItemArray2);
        if (menuItemArray2 != null) {
            for (n2 = 0; n2 < menuItemArray2.length; ++n2) {
                menuItemArray[n2] = this.a(menuItemArray2[n2]);
            }
        }
        return n3;
    }

    public final SubMenu addSubMenu(int n2) {
        return this.c.addSubMenu(n2);
    }

    public final SubMenu addSubMenu(int n2, int n3, int n4, int n5) {
        return this.c.addSubMenu(n2, n3, n4, n5);
    }

    public final SubMenu addSubMenu(int n2, int n3, int n4, CharSequence charSequence) {
        return this.c.addSubMenu(n2, n3, n4, charSequence);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.c.addSubMenu(charSequence);
    }

    public final void clear() {
        pa pa2 = this.b;
        if (pa2 != null) {
            pa2.clear();
        }
        this.c.clear();
    }

    public final void close() {
        this.c.close();
    }

    public final MenuItem findItem(int n2) {
        return this.a(this.c.findItem(n2));
    }

    public final MenuItem getItem(int n2) {
        return this.a(this.c.getItem(n2));
    }

    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    public final boolean isShortcutKey(int n2, KeyEvent keyEvent) {
        return this.c.isShortcutKey(n2, keyEvent);
    }

    public final boolean performIdentifierAction(int n2, int n3) {
        return this.c.performIdentifierAction(n2, n3);
    }

    public final boolean performShortcut(int n2, KeyEvent keyEvent, int n3) {
        return this.c.performShortcut(n2, keyEvent, n3);
    }

    public final void removeGroup(int n2) {
        if (this.b != null) {
            int n3 = 0;
            while (true) {
                pa pa2 = this.b;
                if (n3 >= pa2.f) break;
                int n4 = n3;
                if (((ts)pa2.d(n3)).getGroupId() == n2) {
                    this.b.e(n3);
                    n4 = n3 - 1;
                }
                n3 = n4 + 1;
            }
        }
        this.c.removeGroup(n2);
    }

    public final void removeItem(int n2) {
        if (this.b != null) {
            int n3 = 0;
            while (true) {
                pa pa2 = this.b;
                if (n3 >= pa2.f) break;
                if (((ts)pa2.d(n3)).getItemId() == n2) {
                    this.b.e(n3);
                    break;
                }
                ++n3;
            }
        }
        this.c.removeItem(n2);
    }

    public final void setGroupCheckable(int n2, boolean bl2, boolean bl3) {
        this.c.setGroupCheckable(n2, bl2, bl3);
    }

    public final void setGroupEnabled(int n2, boolean bl2) {
        this.c.setGroupEnabled(n2, bl2);
    }

    public final void setGroupVisible(int n2, boolean bl2) {
        this.c.setGroupVisible(n2, bl2);
    }

    public final void setQwertyMode(boolean bl2) {
        this.c.setQwertyMode(bl2);
    }

    public final int size() {
        return this.c.size();
    }
}

