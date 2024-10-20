/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.view.ActionProvider
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewDebug$CapturedViewProperty
 */
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class fu
implements ts {
    private int A = 16;
    private View B;
    private MenuItem.OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public Intent e;
    public char f;
    public int g = 4096;
    public char h;
    public int i = 4096;
    public final fs j;
    public gl k;
    public CharSequence l;
    public CharSequence m;
    public int n;
    public boolean o = false;
    public a p;
    private final int q;
    private CharSequence r;
    private Drawable s;
    private int t = 0;
    private MenuItem.OnMenuItemClickListener u;
    private ColorStateList v = null;
    private PorterDuff.Mode w = null;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;

    public fu(fs fs2, int n2, int n3, int n4, int n5, CharSequence charSequence, int n6) {
        this.j = fs2;
        this.a = n3;
        this.b = n2;
        this.q = n4;
        this.c = n5;
        this.d = charSequence;
        this.n = n6;
    }

    public static void g(StringBuilder stringBuilder, int n2, int n3, String string) {
        if ((n2 & n3) == n3) {
            stringBuilder.append(string);
        }
    }

    private final Drawable v(Drawable drawable) {
        Drawable drawable2;
        block5: {
            block6: {
                drawable2 = drawable;
                if (drawable == null) break block5;
                drawable2 = drawable;
                if (!this.z) break block5;
                if (this.x) break block6;
                drawable2 = drawable;
                if (!this.y) break block5;
            }
            drawable2 = drawable.mutate();
            if (this.x) {
                drawable2.setTintList(this.v);
            }
            if (this.y) {
                drawable2.setTintMode(this.w);
            }
            this.z = false;
        }
        return drawable2;
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.l = charSequence;
        this.j.l(false);
    }

    @Override
    public final void b(CharSequence charSequence) {
        this.m = charSequence;
        this.j.l(false);
    }

    @Override
    public final a c() {
        return this.p;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.n & 8) == 0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse((MenuItem)this)) {
            return false;
        }
        return this.j.t(this);
    }

    @Override
    public final void d(a a2) {
        this.B = null;
        this.p = a2;
        this.j.l(true);
        a2 = this.p;
        if (a2 != null) {
            a2.ae(new AmbientMode$AmbientController(this));
        }
    }

    public final char e() {
        char c2 = this.j.x() ? this.h : this.f;
        return c2;
    }

    @Override
    public final boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if (!this.m() || (onActionExpandListener = this.C) != null && !onActionExpandListener.onMenuItemActionExpand((MenuItem)this)) {
            return false;
        }
        return this.j.v(this);
    }

    public final CharSequence f(gf object) {
        object = object.e() ? this.getTitleCondensed() : this.d;
        return object;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        Object object = this.B;
        if (object != null) {
            return object;
        }
        object = this.p;
        if (object != null) {
            object = ((a)object).R(this);
            this.B = object;
            return object;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.i;
    }

    public final char getAlphabeticShortcut() {
        return this.h;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.l;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return this.v(drawable);
        }
        int n2 = this.t;
        if (n2 != 0) {
            drawable = kh.g(this.j.a, n2);
            this.t = 0;
            this.s = drawable;
            return this.v(drawable);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.v;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    public final Intent getIntent() {
        return this.e;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.g;
    }

    public final char getNumericShortcut() {
        return this.f;
    }

    public final int getOrder() {
        return this.q;
    }

    public final SubMenu getSubMenu() {
        return this.k;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.d;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.r;
        if (charSequence != null) {
            return charSequence;
        }
        return this.d;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.m;
    }

    public final void h(boolean bl2) {
        this.o = bl2;
        this.j.l(false);
    }

    public final boolean hasSubMenu() {
        return this.k != null;
    }

    final void i(boolean bl2) {
        int n2 = this.A;
        int n3 = true != bl2 ? 0 : 2;
        this.A = n3 |= n2 & 0xFFFFFFFD;
        if (n2 != n3) {
            this.j.l(false);
        }
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.o;
    }

    public final boolean isCheckable() {
        return (this.A & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.A & 0x10) != 0;
    }

    public final boolean isVisible() {
        a a2 = this.p;
        if (a2 != null && a2.W()) {
            return (this.A & 8) == 0 && this.p.U();
        }
        return (this.A & 8) == 0;
    }

    public final void j(boolean bl2) {
        int n2 = this.A;
        int n3 = true != bl2 ? 0 : 4;
        this.A = n3 | n2 & 0xFFFFFFFB;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void k(boolean bl2) {
        int n2 = bl2 ? this.A | 0x20 : this.A & 0xFFFFFFDF;
        this.A = n2;
    }

    public final void l(gl gl2) {
        this.k = gl2;
        gl2.setHeaderTitle(this.d);
    }

    public final boolean m() {
        if ((this.n & 8) != 0) {
            a a2;
            if (this.B == null && (a2 = this.p) != null) {
                this.B = a2.R(this);
            }
            if (this.B != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        Object object = this.u;
        if (object != null && object.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        object = this.j;
        if (((fs)object).u((fs)object, this)) {
            return true;
        }
        object = this.e;
        if (object != null) {
            try {
                this.j.a.startActivity((Intent)object);
                return true;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                Log.e((String)"MenuItemImpl", (String)"Can't find activity to handle intent; ignoring", (Throwable)activityNotFoundException);
            }
        }
        return (object = this.p) != null && ((a)object).V();
    }

    public final boolean o() {
        return (this.A & 0x20) == 32;
    }

    public final boolean p() {
        return (this.A & 4) != 0;
    }

    public final boolean q() {
        return (this.n & 1) == 1;
    }

    public final boolean r() {
        return (this.n & 2) == 2;
    }

    final boolean s(boolean bl2) {
        int n2 = this.A;
        int n3 = true != bl2 ? 8 : 0;
        this.A = n3 |= n2 & 0xFFFFFFF7;
        return n2 != n3;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = Character.toLowerCase(c2);
        this.j.l(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c2, int n2) {
        if (this.h == c2 && this.i == n2) {
            return this;
        }
        this.h = Character.toLowerCase(c2);
        this.i = KeyEvent.normalizeMetaState((int)n2);
        this.j.l(false);
        return this;
    }

    public final MenuItem setCheckable(boolean bl2) {
        int n2;
        int n3 = this.A;
        this.A = n2 = bl2 | n3 & 0xFFFFFFFE;
        if (n3 != n2) {
            this.j.l(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean bl2) {
        if ((this.A & 4) != 0) {
            fs fs2 = this.j;
            int n2 = this.b;
            int n3 = fs2.c.size();
            fs2.s();
            for (int i2 = 0; i2 < n3; ++i2) {
                fu fu2 = (fu)fs2.c.get(i2);
                if (fu2.b != n2 || !fu2.p() || !fu2.isCheckable()) continue;
                bl2 = fu2 == this;
                fu2.i(bl2);
            }
            fs2.r();
        } else {
            this.i(bl2);
        }
        return this;
    }

    public final MenuItem setEnabled(boolean bl2) {
        int n2 = bl2 ? this.A | 0x10 : this.A & 0xFFFFFFEF;
        this.A = n2;
        this.j.l(false);
        return this;
    }

    public final MenuItem setIcon(int n2) {
        this.s = null;
        this.t = n2;
        this.z = true;
        this.j.l(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.t = 0;
        this.s = drawable;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.j.l(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.e = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.f == c2) {
            return this;
        }
        this.f = c2;
        this.j.l(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c2, int n2) {
        if (this.f == c2 && this.g == n2) {
            return this;
        }
        this.f = c2;
        this.g = KeyEvent.normalizeMetaState((int)n2);
        this.j.l(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.u = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.f = c2;
        this.h = Character.toLowerCase(c3);
        this.j.l(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c2, char c3, int n2, int n3) {
        this.f = c2;
        this.g = KeyEvent.normalizeMetaState((int)n2);
        this.h = Character.toLowerCase(c3);
        this.i = KeyEvent.normalizeMetaState((int)n3);
        this.j.l(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int n2) {
        int n3 = n2 & 3;
        if (n3 != 0 && n3 != 1 && n3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.n = n2;
        this.j.B();
    }

    @Override
    public final /* synthetic */ MenuItem setShowAsActionFlags(int n2) {
        this.setShowAsAction(n2);
        return this;
    }

    public final MenuItem setTitle(int n2) {
        this.setTitle(this.j.a.getString(n2));
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        this.j.l(false);
        gl gl2 = this.k;
        if (gl2 != null) {
            gl2.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.r = charSequence;
        this.j.l(false);
        return this;
    }

    public final MenuItem setVisible(boolean bl2) {
        if (this.s(bl2)) {
            this.j.C();
        }
        return this;
    }

    public final boolean t() {
        return this.j.y() && this.e() != '\u0000';
    }

    public final String toString() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void u(View view) {
        int n2;
        this.B = view;
        this.p = null;
        if (view != null && view.getId() == -1 && (n2 = this.a) > 0) {
            view.setId(n2);
        }
        this.j.B();
    }
}

