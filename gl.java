/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class gl
extends fs
implements SubMenu {
    public final fs k;
    public final fu l;

    public gl(Context context, fs fs2, fu fu2) {
        super(context);
        this.k = fs2;
        this.l = fu2;
    }

    @Override
    public final fs a() {
        return this.k.a();
    }

    @Override
    public final String d() {
        int n2 = this.l.a;
        if (n2 == 0) {
            return null;
        }
        return a.af(n2, "android:menu:actionviewstates:");
    }

    public final MenuItem getItem() {
        return this.l;
    }

    @Override
    public final void p(fq fq2) {
        this.k.p(fq2);
    }

    @Override
    public final void setGroupDividerEnabled(boolean bl2) {
        this.k.setGroupDividerEnabled(bl2);
    }

    public final SubMenu setHeaderIcon(int n2) {
        super.q(0, null, n2, null, null);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    public final SubMenu setHeaderTitle(int n2) {
        super.q(n2, null, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    public final SubMenu setIcon(int n2) {
        this.l.setIcon(n2);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    @Override
    public final void setQwertyMode(boolean bl2) {
        this.k.setQwertyMode(bl2);
    }

    @Override
    public final boolean t(fu fu2) {
        return this.k.t(fu2);
    }

    @Override
    public final boolean u(fs fs2, MenuItem menuItem) {
        return super.u(fs2, menuItem) || this.k.u(fs2, menuItem);
        {
        }
    }

    @Override
    public final boolean v(fu fu2) {
        return this.k.v(fu2);
    }

    @Override
    public final boolean w() {
        return this.k.w();
    }

    @Override
    public final boolean x() {
        return this.k.x();
    }

    @Override
    public final boolean y() {
        return this.k.y();
    }
}

