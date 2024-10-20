/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package com.android.car.ui.appstyledview;

import android.content.DialogInterface;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV3;

public final class AppStyledViewControllerAdapterV3$$ExternalSyntheticLambda0
implements DialogInterface.OnDismissListener {
    public Runnable f$0;

    public /* synthetic */ AppStyledViewControllerAdapterV3$$ExternalSyntheticLambda0(Runnable runnable) {
        this.f$0 = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        AppStyledViewControllerAdapterV3.lambda$setOnDismissListener$0(this.f$0, dialogInterface);
    }
}

