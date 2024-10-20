/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.WindowManager$LayoutParams
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV2
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV3
 */
package com.android.car.ui.pluginsupport;

import android.view.View;
import android.view.WindowManager;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV2;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV3;

class PluginFactoryAdapterV5$7
implements AppStyledViewControllerOEMV3 {
    final AppStyledViewControllerOEMV2 val$appStyledViewControllerOEMV2;

    public PluginFactoryAdapterV5$7(AppStyledViewControllerOEMV2 appStyledViewControllerOEMV2) {
        this.val$appStyledViewControllerOEMV2 = appStyledViewControllerOEMV2;
    }

    public int getContentAreaHeight() {
        return this.val$appStyledViewControllerOEMV2.getContentAreaHeight();
    }

    public int getContentAreaWidth() {
        return this.val$appStyledViewControllerOEMV2.getContentAreaWidth();
    }

    public WindowManager.LayoutParams getDialogWindowLayoutParam(WindowManager.LayoutParams layoutParams) {
        return this.val$appStyledViewControllerOEMV2.getDialogWindowLayoutParam(layoutParams);
    }

    public View getView() {
        return this.val$appStyledViewControllerOEMV2.getView();
    }

    public void setContent(View view) {
        this.val$appStyledViewControllerOEMV2.setContent(view);
    }

    public void setNavIcon(int n2) {
        this.val$appStyledViewControllerOEMV2.setNavIcon(n2);
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.val$appStyledViewControllerOEMV2.setOnBackClickListener(runnable);
    }

    public void setSceneType(int n2) {
    }
}

