/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.WindowManager$LayoutParams
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV4
 */
package com.android.car.ui.appstyledview;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV4;

public class AppStyledViewControllerAdapterV4
implements bjs {
    private final AppStyledViewControllerOEMV4 mOemController;

    public AppStyledViewControllerAdapterV4(Context context, AppStyledViewControllerOEMV4 appStyledViewControllerOEMV4) {
        this.mOemController = appStyledViewControllerOEMV4;
        appStyledViewControllerOEMV4.setNavIcon(2);
    }

    public void dismiss() {
        this.mOemController.dismiss();
    }

    public WindowManager.LayoutParams getAttributes() {
        return this.mOemController.getAttributes();
    }

    public int getContentAreaHeight() {
        return this.mOemController.getContentAreaHeight();
    }

    public int getContentAreaWidth() {
        return this.mOemController.getContentAreaWidth();
    }

    public void setContent(View view) {
        this.mOemController.setContent(view);
    }

    public void setNavIcon(int n2) {
        if (n2 != 0) {
            if (n2 == 1) {
                this.mOemController.setNavIcon(2);
                return;
            }
            throw new IllegalArgumentException(a.af(n2, "Unknown nav icon style: "));
        }
        this.mOemController.setNavIcon(1);
    }

    public void setOnDismissListener(Runnable runnable) {
        this.mOemController.setOnDismissListener(runnable);
    }

    public void setOnNavIconClickListener(Runnable runnable) {
        this.mOemController.setOnBackClickListener(runnable);
    }

    public void setSceneType(int n2) {
        this.mOemController.setSceneType(n2);
    }

    public void show() {
        this.mOemController.show();
    }
}

