/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.toolbar.MenuItemOEMV1
 *  com.android.car.ui.plugin.oemapis.toolbar.MenuItemOEMV1$Builder
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.plugin.oemapis.toolbar.MenuItemOEMV1;
import com.android.car.ui.toolbar.MenuItemAdapterV1$$ExternalSyntheticLambda0;
import com.android.car.ui.toolbar.MenuItemAdapterV1$$ExternalSyntheticLambda1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV3;
import j$.util.Objects;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class MenuItemAdapterV1 {
    private final bmj mClientListener;
    private final bml mClientMenuItem;
    private MenuItemOEMV1 mPluginMenuItem = MenuItemOEMV1.builder().build();
    private ToolbarControllerAdapterV1 mToolbarV1;
    private ToolbarControllerAdapterV2 mToolbarV2;
    private ToolbarControllerAdapterV3 mToolbarV3;

    public MenuItemAdapterV1(ToolbarControllerAdapterV1 toolbarControllerAdapterV1, bml bml2) {
        MenuItemAdapterV1$$ExternalSyntheticLambda0 menuItemAdapterV1$$ExternalSyntheticLambda0 = new MenuItemAdapterV1$$ExternalSyntheticLambda0(this);
        this.mClientListener = menuItemAdapterV1$$ExternalSyntheticLambda0;
        this.mToolbarV1 = toolbarControllerAdapterV1;
        this.mClientMenuItem = bml2;
        bml2.b(menuItemAdapterV1$$ExternalSyntheticLambda0);
        this.updateMenuItem();
    }

    public MenuItemAdapterV1(ToolbarControllerAdapterV2 toolbarControllerAdapterV2, bml bml2) {
        MenuItemAdapterV1$$ExternalSyntheticLambda0 menuItemAdapterV1$$ExternalSyntheticLambda0 = new MenuItemAdapterV1$$ExternalSyntheticLambda0(this);
        this.mClientListener = menuItemAdapterV1$$ExternalSyntheticLambda0;
        this.mToolbarV2 = toolbarControllerAdapterV2;
        this.mClientMenuItem = bml2;
        bml2.b(menuItemAdapterV1$$ExternalSyntheticLambda0);
        this.updateMenuItem();
    }

    public MenuItemAdapterV1(ToolbarControllerAdapterV3 toolbarControllerAdapterV3, bml bml2) {
        MenuItemAdapterV1$$ExternalSyntheticLambda0 menuItemAdapterV1$$ExternalSyntheticLambda0 = new MenuItemAdapterV1$$ExternalSyntheticLambda0(this);
        this.mClientListener = menuItemAdapterV1$$ExternalSyntheticLambda0;
        this.mToolbarV3 = toolbarControllerAdapterV3;
        this.mClientMenuItem = bml2;
        bml2.b(menuItemAdapterV1$$ExternalSyntheticLambda0);
        this.updateMenuItem();
    }

    private static int convertDisplayBehavior(bmi bmi2) {
        int n2 = bmi2.ordinal();
        if (n2 != 0) {
            if (n2 == 1) {
                return 2;
            }
            throw new IllegalArgumentException("Unknown display behavior!");
        }
        return 0;
    }

    private void updateMenuItem() {
        MenuItemOEMV1.Builder builder = this.mPluginMenuItem.copy().setKey(this.mClientMenuItem.hashCode()).setTitle(bnv.j(this.mClientMenuItem.h)).setIcon(this.mClientMenuItem.i).setEnabled(this.mClientMenuItem.l).setPrimary(false).setTinted(this.mClientMenuItem.e).setRestricted(this.mClientMenuItem.d()).setShowIconAndTitle(this.mClientMenuItem.d).setDisplayBehavior(MenuItemAdapterV1.convertDisplayBehavior(this.mClientMenuItem.k));
        if (this.mClientMenuItem.a) {
            builder.setCheckable(true).setChecked(this.mClientMenuItem.m);
        }
        if (this.mClientMenuItem.b) {
            builder.setActivatable(true).setActivated(this.mClientMenuItem.o);
        }
        bml bml2 = this.mClientMenuItem;
        if (!(bml2.j != null || bml2.b || bml2.a || bml2.d())) {
            builder.setOnClickListener(null);
        } else {
            bml2 = this.mClientMenuItem;
            Objects.requireNonNull(bml2);
            builder.setOnClickListener((Runnable)new MenuItemAdapterV1$$ExternalSyntheticLambda1(bml2));
        }
        this.mPluginMenuItem = builder.build();
    }

    private void updateMenuItems() {
        bnq bnq2 = this.mToolbarV3;
        if (bnq2 != null) {
            ((ToolbarControllerAdapterV3)bnq2).updateMenuItems();
            return;
        }
        bnq2 = this.mToolbarV2;
        if (bnq2 != null) {
            ((ToolbarControllerAdapterV2)bnq2).updateMenuItems();
            return;
        }
        bnq2 = this.mToolbarV1;
        if (bnq2 != null) {
            ((ToolbarControllerAdapterV1)bnq2).updateMenuItems();
        }
    }

    public bml getClientMenuItem() {
        return this.mClientMenuItem;
    }

    public MenuItemOEMV1 getPluginMenuItem() {
        return this.mPluginMenuItem;
    }

    public boolean isVisible() {
        return this.mClientMenuItem.n;
    }

    public /* synthetic */ void lambda$new$0$com-android-car-ui-toolbar-MenuItemAdapterV1(bml bml2) {
        this.updateMenuItem();
        this.updateMenuItems();
    }
}

