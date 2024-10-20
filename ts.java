/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.view.MenuItem
 *  android.view.View
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

public interface ts
extends MenuItem {
    public void a(CharSequence var1);

    public void b(CharSequence var1);

    public a c();

    public boolean collapseActionView();

    public void d(a var1);

    public boolean expandActionView();

    public View getActionView();

    public int getAlphabeticModifiers();

    public CharSequence getContentDescription();

    public ColorStateList getIconTintList();

    public PorterDuff.Mode getIconTintMode();

    public int getNumericModifiers();

    public CharSequence getTooltipText();

    public boolean isActionViewExpanded();

    public MenuItem setActionView(int var1);

    public MenuItem setActionView(View var1);

    public MenuItem setAlphabeticShortcut(char var1, int var2);

    public MenuItem setIconTintList(ColorStateList var1);

    public MenuItem setIconTintMode(PorterDuff.Mode var1);

    public MenuItem setNumericShortcut(char var1, int var2);

    public MenuItem setShortcut(char var1, char var2, int var3, int var4);

    public void setShowAsAction(int var1);

    public MenuItem setShowAsActionFlags(int var1);
}

