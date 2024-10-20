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
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV1;

class AppStyledViewControllerAdapterV1$1
extends bjr {
    final AppStyledViewControllerAdapterV1 this$0;

    public AppStyledViewControllerAdapterV1$1(AppStyledViewControllerAdapterV1 appStyledViewControllerAdapterV1, Context context) {
        this.this$0 = appStyledViewControllerAdapterV1;
        super(context);
    }

    @Override
    public WindowManager.LayoutParams getDialogWindowLayoutParam(WindowManager.LayoutParams layoutParams) {
        return AppStyledViewControllerAdapterV1.-$$Nest$fgetmOemController(this.this$0).getDialogWindowLayoutParam(layoutParams);
    }
}

