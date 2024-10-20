/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.WindowManager$LayoutParams
 */
package com.android.car.ui.appstyledview;

import android.content.Context;
import android.view.WindowManager;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV3;

class AppStyledViewControllerAdapterV3$1
extends bjr {
    final AppStyledViewControllerAdapterV3 this$0;

    public AppStyledViewControllerAdapterV3$1(AppStyledViewControllerAdapterV3 appStyledViewControllerAdapterV3, Context context) {
        this.this$0 = appStyledViewControllerAdapterV3;
        super(context);
    }

    @Override
    public WindowManager.LayoutParams getDialogWindowLayoutParam(WindowManager.LayoutParams layoutParams) {
        return AppStyledViewControllerAdapterV3.-$$Nest$fgetmOemController(this.this$0).getDialogWindowLayoutParam(layoutParams);
    }
}

