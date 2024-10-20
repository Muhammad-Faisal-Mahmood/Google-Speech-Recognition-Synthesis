/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.WindowManager$LayoutParams
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV1
 */
package com.android.car.ui.appstyledview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV1$$ExternalSyntheticLambda0;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV1$1;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV1;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AppStyledViewControllerAdapterV1
implements bjs {
    private View mContent;
    private final bjr mDialog;
    private final AppStyledViewControllerOEMV1 mOemController;

    static /* bridge */ /* synthetic */ AppStyledViewControllerOEMV1 -$$Nest$fgetmOemController(AppStyledViewControllerAdapterV1 appStyledViewControllerAdapterV1) {
        return appStyledViewControllerAdapterV1.mOemController;
    }

    public AppStyledViewControllerAdapterV1(Context context, AppStyledViewControllerOEMV1 appStyledViewControllerOEMV1) {
        this.mOemController = appStyledViewControllerOEMV1;
        appStyledViewControllerOEMV1.setNavIcon(2);
        this.mDialog = new AppStyledViewControllerAdapterV1$1(this, (Context)((Activity)context));
    }

    static /* synthetic */ void lambda$setOnDismissListener$0(Runnable runnable, DialogInterface dialogInterface) {
        runnable.run();
    }

    public void dismiss() {
        this.mDialog.dismiss();
    }

    public WindowManager.LayoutParams getAttributes() {
        return this.mDialog.getWindowLayoutParams();
    }

    public int getContentAreaHeight() {
        return -1;
    }

    public int getContentAreaWidth() {
        return -1;
    }

    public void setContent(View view) {
        this.mContent = view;
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
        if (runnable == null) {
            this.mDialog.setOnDismissListener(null);
            return;
        }
        this.mDialog.setOnDismissListener(new AppStyledViewControllerAdapterV1$$ExternalSyntheticLambda0(runnable));
    }

    public void setOnNavIconClickListener(Runnable runnable) {
        this.mOemController.setOnBackClickListener(runnable);
    }

    public void setSceneType(int n2) {
    }

    public void show() {
        View view = this.mContent;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup)this.mContent.getParent()).removeView(this.mContent);
            }
            this.mOemController.setContent(this.mContent);
            view = this.mOemController.getView();
            if (view != null) {
                if (view.getParent() != null) {
                    ((ViewGroup)view.getParent()).removeView(view);
                }
                this.mDialog.setContentView(view);
                this.mDialog.show();
            }
        }
    }
}

