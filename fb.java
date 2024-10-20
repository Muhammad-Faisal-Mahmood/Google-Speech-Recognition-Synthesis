/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.util.Log
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class fb {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    final fc E;
    a F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public fb(fc fc2, Menu menu) {
        this.E = fc2;
        this.C = null;
        this.D = null;
        this.a = menu;
        this.c();
    }

    public static final char e(String string) {
        if (string == null) {
            return '\u0000';
        }
        return string.charAt(0);
    }

    public final SubMenu a() {
        this.h = true;
        SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        this.d(subMenu.getItem());
        return subMenu;
    }

    public final Object b(String string, Class[] object, Object[] objectArray) {
        try {
            object = Class.forName(string, false, this.E.e.getClassLoader()).getConstructor((Class<?>)object);
            object.setAccessible(true);
            object = object.newInstance(objectArray);
            return object;
        }
        catch (Exception exception) {
            Log.w((String)"SupportMenuInflater", (String)"Cannot instantiate class: ".concat(string), (Throwable)exception);
            return null;
        }
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void d(MenuItem menuItem) {
        String string;
        Object object = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        int n2 = this.r;
        int n3 = 0;
        boolean bl2 = n2 > 0;
        object.setCheckable(bl2).setTitleCondensed(this.l).setIcon(this.m);
        n2 = this.v;
        if (n2 >= 0) {
            menuItem.setShowAsAction(n2);
        }
        if (this.z != null) {
            if (!this.E.e.isRestricted()) {
                object = this.E;
                if (((fc)((Object)object)).f == null) {
                    ((fc)((Object)object)).f = ((fc)((Object)object)).a(((fc)((Object)object)).e);
                }
                menuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new fa(((fc)((Object)object)).f, this.z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof fu) {
                ((fu)menuItem).j(true);
            } else if (menuItem instanceof fz) {
                object = (fz)menuItem;
                try {
                    if (((fz)object).d == null) {
                        ((fz)object).d = ((fz)object).c.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    ((fz)object).d.invoke((Object)((fz)object).c, true);
                }
                catch (Exception exception) {
                    Log.w((String)"MenuItemWrapper", (String)"Error while calling setExclusiveCheckable", (Throwable)exception);
                }
            }
        }
        if ((string = this.x) != null) {
            object = this.E;
            menuItem.setActionView((View)this.b(string, fc.a, ((fc)((Object)object)).c));
            n3 = 1;
        }
        if ((n2 = this.w) > 0) {
            if (n3 == 0) {
                menuItem.setActionView(n2);
            } else {
                Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if ((object = this.F) != null) {
            if (menuItem instanceof ts) {
                ((ts)menuItem).d((a)object);
            } else {
                Log.w((String)"MenuItemCompat", (String)"setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        object = this.A;
        bl2 = menuItem instanceof ts;
        if (bl2) {
            ((ts)menuItem).a((CharSequence)object);
        } else {
            ag$$ExternalSyntheticApiModelOutline0.m$1(menuItem, (CharSequence)object);
        }
        object = this.B;
        if (bl2) {
            ((ts)menuItem).b((CharSequence)object);
        } else {
            ag$$ExternalSyntheticApiModelOutline0.m(menuItem, (CharSequence)object);
        }
        char c2 = this.n;
        n3 = this.o;
        if (bl2) {
            ((ts)menuItem).setAlphabeticShortcut(c2, n3);
        } else {
            ag$$ExternalSyntheticApiModelOutline0.m$1(menuItem, c2, n3);
        }
        c2 = this.p;
        n3 = this.q;
        if (bl2) {
            ((ts)menuItem).setNumericShortcut(c2, n3);
        } else {
            ag$$ExternalSyntheticApiModelOutline0.m(menuItem, c2, n3);
        }
        object = this.D;
        if (object != null) {
            if (bl2) {
                ((ts)menuItem).setIconTintMode((PorterDuff.Mode)object);
            } else {
                ag$$ExternalSyntheticApiModelOutline0.m(menuItem, (PorterDuff.Mode)object);
            }
        }
        if ((object = this.C) != null) {
            if (bl2) {
                ((ts)menuItem).setIconTintList((ColorStateList)object);
                return;
            }
            ag$$ExternalSyntheticApiModelOutline0.m(menuItem, (ColorStateList)object);
        }
    }
}

