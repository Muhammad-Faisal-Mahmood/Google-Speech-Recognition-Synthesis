/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 */
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class fg
implements ts {
    private CharSequence a;
    private CharSequence b;
    private Intent c;
    private char d;
    private int e = 4096;
    private char f;
    private int g = 4096;
    private Drawable h;
    private final Context i;
    private CharSequence j;
    private CharSequence k;
    private ColorStateList l = null;
    private PorterDuff.Mode m = null;
    private boolean n = false;
    private boolean o = false;
    private int p = 16;

    public fg(Context context, CharSequence charSequence) {
        this.i = context;
        this.a = charSequence;
    }

    private final void e() {
        Drawable drawable = this.h;
        if (drawable != null && (this.n || this.o)) {
            this.h = drawable = drawable.mutate();
            if (this.n) {
                drawable.setTintList(this.l);
            }
            if (this.o) {
                this.h.setTintMode(this.m);
            }
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override
    public final void b(CharSequence charSequence) {
        this.k = charSequence;
    }

    @Override
    public final a c() {
        return null;
    }

    @Override
    public final boolean collapseActionView() {
        return false;
    }

    @Override
    public final void d(a a2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final View getActionView() {
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.h;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    public final Intent getIntent() {
        return this.c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.e;
    }

    public final char getNumericShortcut() {
        return this.d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.p & 0x10) != 0;
    }

    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f = Character.toLowerCase(c2);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c2, int n2) {
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState((int)n2);
        return this;
    }

    public final MenuItem setCheckable(boolean bl2) {
        this.p = bl2 | this.p & 0xFFFFFFFE;
        return this;
    }

    public final MenuItem setChecked(boolean bl2) {
        int n2 = this.p;
        int n3 = true != bl2 ? 0 : 2;
        this.p = n3 | n2 & 0xFFFFFFFD;
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean bl2) {
        int n2 = this.p;
        int n3 = true != bl2 ? 0 : 16;
        this.p = n3 | n2 & 0xFFFFFFEF;
        return this;
    }

    public final MenuItem setIcon(int n2) {
        this.h = this.i.getDrawable(n2);
        this.e();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        this.e();
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        this.e();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        this.e();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c2, int n2) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState((int)n2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.d = c2;
        this.f = Character.toLowerCase(c3);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c2, char c3, int n2, int n3) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState((int)n2);
        this.f = Character.toLowerCase(c3);
        this.g = KeyEvent.normalizeMetaState((int)n3);
        return this;
    }

    @Override
    public final void setShowAsAction(int n2) {
    }

    public final MenuItem setTitle(int n2) {
        this.a = this.i.getResources().getString(n2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean bl2) {
        int n2 = this.p;
        int n3 = 8;
        if (bl2) {
            n3 = 0;
        }
        this.p = n2 & 8 | n3;
        return this;
    }
}

