/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package com.android.car.ui.appstyledview;

import android.content.DialogInterface;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV2;

public final class AppStyledViewControllerAdapterV2$$ExternalSyntheticLambda0
implements DialogInterface.OnDismissListener {
    public Runnable f$0;

    public /* synthetic */ AppStyledViewControllerAdapterV2$$ExternalSyntheticLambda0(Runnable runnable) {
        this.f$0 = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        AppStyledViewControllerAdapterV2.lambda$setOnDismissListener$0(this.f$0, dialogInterface);
    }
}

