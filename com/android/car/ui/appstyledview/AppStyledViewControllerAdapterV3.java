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
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV3
 */
package com.android.car.ui.appstyledview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV3$$ExternalSyntheticLambda0;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV3$1;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV3;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AppStyledViewControllerAdapterV3
implements bjs {
    private View mContent;
    private final bjr mDialog;
    private final AppStyledViewControllerOEMV3 mOemController;

    static /* bridge */ /* synthetic */ AppStyledViewControllerOEMV3 -$$Nest$fgetmOemController(AppStyledViewControllerAdapterV3 appStyledViewControllerAdapterV3) {
        return appStyledViewControllerAdapterV3.mOemController;
    }

    public AppStyledViewControllerAdapterV3(Context context, AppStyledViewControllerOEMV3 appStyledViewControllerOEMV3) {
        this.mOemController = appStyledViewControllerOEMV3;
        appStyledViewControllerOEMV3.setNavIcon(2);
        this.mDialog = new AppStyledViewControllerAdapterV3$1(this, (Context)((Activity)context));
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
        return this.mOemController.getContentAreaHeight();
    }

    public int getContentAreaWidth() {
        return this.mOemController.getContentAreaWidth();
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
        this.mDialog.setOnDismissListener(new AppStyledViewControllerAdapterV3$$ExternalSyntheticLambda0(runnable));
    }

    public void setOnNavIconClickListener(Runnable runnable) {
        this.mOemController.setOnBackClickListener(runnable);
    }

    public void setSceneType(int n2) {
        this.mDialog.setSceneType(n2);
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

