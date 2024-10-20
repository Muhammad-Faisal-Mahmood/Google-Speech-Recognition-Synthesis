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
 *  android.view.CollapsibleActionView
 *  android.view.ContextMenu$ContextMenuInfo
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
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public final class fz
extends fj
implements MenuItem {
    public final ts c;
    public Method d;

    public fz(Context context, ts ts2) {
        super(context);
        if (ts2 != null) {
            this.c = ts2;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.c.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.c.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        a a2 = this.c.c();
        if (a2 instanceof fv) {
            a2 = (fv)a2;
            int n2 = fv.b;
            return ((fv)a2).a;
        }
        return null;
    }

    public final View getActionView() {
        View view;
        View view2 = view = this.c.getActionView();
        if (view instanceof fw) {
            view2 = (View)((fw)view).a;
        }
        return view2;
    }

    public final int getAlphabeticModifiers() {
        return this.c.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.c.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.c.getContentDescription();
    }

    public final int getGroupId() {
        return this.c.getGroupId();
    }

    public final Drawable getIcon() {
        return this.c.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.c.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.c.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.c.getIntent();
    }

    public final int getItemId() {
        return this.c.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.c.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.c.getNumericShortcut();
    }

    public final int getOrder() {
        return this.c.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.c.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.c.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.c.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.c.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.c.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.c.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.c.isCheckable();
    }

    public final boolean isChecked() {
        return this.c.isChecked();
    }

    public final boolean isEnabled() {
        return this.c.isEnabled();
    }

    public final boolean isVisible() {
        return this.c.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider object) {
        fv fv2 = new fv((ActionProvider)object);
        object = object != null ? fv2 : null;
        this.c.d((a)object);
        return this;
    }

    public final MenuItem setActionView(int n2) {
        this.c.setActionView(n2);
        View view = this.c.getActionView();
        if (view instanceof CollapsibleActionView) {
            this.c.setActionView((View)new fw(view));
        }
        return this;
    }

    public final MenuItem setActionView(View view) {
        Object object = view;
        if (view instanceof CollapsibleActionView) {
            object = new fw(view);
        }
        this.c.setActionView((View)object);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.c.setAlphabeticShortcut(c2);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int n2) {
        this.c.setAlphabeticShortcut(c2, n2);
        return this;
    }

    public final MenuItem setCheckable(boolean bl2) {
        this.c.setCheckable(bl2);
        return this;
    }

    public final MenuItem setChecked(boolean bl2) {
        this.c.setChecked(bl2);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.c.a(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean bl2) {
        this.c.setEnabled(bl2);
        return this;
    }

    public final MenuItem setIcon(int n2) {
        this.c.setIcon(n2);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.c.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.c.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.c.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.c.setNumericShortcut(c2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int n2) {
        this.c.setNumericShortcut(c2, n2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        onActionExpandListener = onActionExpandListener != null ? new fx(this, onActionExpandListener) : null;
        this.c.setOnActionExpandListener(onActionExpandListener);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        onMenuItemClickListener = onMenuItemClickListener != null ? new fy(this, onMenuItemClickListener) : null;
        this.c.setOnMenuItemClickListener(onMenuItemClickListener);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.c.setShortcut(c2, c3);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int n2, int n3) {
        this.c.setShortcut(c2, c3, n2, n3);
        return this;
    }

    public final void setShowAsAction(int n2) {
        this.c.setShowAsAction(n2);
    }

    public final MenuItem setShowAsActionFlags(int n2) {
        this.c.setShowAsActionFlags(n2);
        return this;
    }

    public final MenuItem setTitle(int n2) {
        this.c.setTitle(n2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.c.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.c.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.c.b(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean bl2) {
        ts ts2 = this.c;
        ts2.setVisible(bl2);
        return ts2;
    }
}

