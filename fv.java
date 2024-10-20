/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionProvider
 *  android.view.ActionProvider$VisibilityListener
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 */
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.wear.ambient.AmbientMode$AmbientController;

final class fv
extends a
implements ActionProvider.VisibilityListener {
    public static final int b = 0;
    public final ActionProvider a;
    private AmbientMode$AmbientController c;

    public fv(ActionProvider actionProvider) {
        super(null);
        this.a = actionProvider;
    }

    @Override
    public final View R(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override
    public final void S(SubMenu subMenu) {
        this.a.onPrepareSubMenu(subMenu);
    }

    @Override
    public final boolean T() {
        return this.a.hasSubMenu();
    }

    @Override
    public final boolean U() {
        return this.a.isVisible();
    }

    @Override
    public final boolean V() {
        return this.a.onPerformDefaultAction();
    }

    @Override
    public final boolean W() {
        return this.a.overridesItemVisibility();
    }

    @Override
    public final void ae(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.c = ambientMode$AmbientController;
        this.a.setVisibilityListener((ActionProvider.VisibilityListener)this);
    }

    public final void onActionProviderVisibilityChanged(boolean bl2) {
        AmbientMode$AmbientController ambientMode$AmbientController = this.c;
        if (ambientMode$AmbientController != null) {
            ((fu)ambientMode$AmbientController.a).j.C();
        }
    }
}

