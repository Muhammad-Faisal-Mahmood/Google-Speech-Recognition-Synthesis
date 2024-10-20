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
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV2;

class AppStyledViewControllerAdapterV2$1
extends bjr {
    final AppStyledViewControllerAdapterV2 this$0;

    public AppStyledViewControllerAdapterV2$1(AppStyledViewControllerAdapterV2 appStyledViewControllerAdapterV2, Context context) {
        this.this$0 = appStyledViewControllerAdapterV2;
        super(context);
    }

    @Override
    public WindowManager.LayoutParams getDialogWindowLayoutParam(WindowManager.LayoutParams layoutParams) {
        return AppStyledViewControllerAdapterV2.-$$Nest$fgetmOemController(this.this$0).getDialogWindowLayoutParam(layoutParams);
    }
}

