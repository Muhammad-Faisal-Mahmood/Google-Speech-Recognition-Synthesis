/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.Insets
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$OnSystemUiVisibilityChangeListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bjr
extends Dialog
implements abe,
awh,
ng {
    private static final int DIALOG_MIN_PADDING = 32;
    private static final int DIALOG_START_MARGIN_THRESHOLD = 64;
    private static final int IME_OVERLAP_DP = 32;
    private static final double VISIBLE_SCREEN_PERCENTAGE = 0.9;
    private WindowManager.LayoutParams mBaseLayoutParams;
    private View mContent;
    private final Context mContext;
    private final abg mLifecycleRegistry = new abg(this);
    private final nf mOnBackPressedDispatcher;
    private boolean mRenderInDisplayCutout;
    private final awg mSavedStateRegistryController = xm.g(this);
    private int mSceneType;

    static /* bridge */ /* synthetic */ View -$$Nest$fgetmContent(bjr bjr2) {
        return bjr2.mContent;
    }

    static /* bridge */ /* synthetic */ Context -$$Nest$fgetmContext(bjr bjr2) {
        return bjr2.mContext;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mcopyWindowInsets(bjr bjr2) {
        bjr2.copyWindowInsets();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateAttributes(bjr bjr2) {
        bjr2.updateAttributes();
    }

    public bjr(Context context) {
        super(context);
        this.mOnBackPressedDispatcher = new nf(new akt(this, 18));
        this.mContext = context;
        this.requestWindowFeature(1);
        Window window = this.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            int n2;
            context = new WindowManager.LayoutParams();
            this.mBaseLayoutParams = context;
            context.copyFrom(window.getAttributes());
            if (fs$$ExternalSyntheticApiModelOutline0.m(this.mBaseLayoutParams) != 3) {
                n2 = 135;
            } else {
                this.mRenderInDisplayCutout = true;
                n2 = 7;
            }
            sk$$ExternalSyntheticApiModelOutline1.m(this.mBaseLayoutParams, n2);
        } else {
            this.mBaseLayoutParams = window.getAttributes();
        }
        this.updateAttributes();
    }

    private void configureImeInsetFit() {
        Window window = this.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            window.setSoftInputMode(16);
            return;
        }
        ilo.g(window.getDecorView().getRootView(), new bjq(this, window));
    }

    private void copySystemUiVisibility() {
        if (this.getWindow() == null) {
            return;
        }
        Activity activity = bnv.e(this.mContext);
        this.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
        this.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener)new bjp(this, activity));
    }

    private void copyWindowInsets() {
        Object object = this.getWindow();
        if (object != null) {
            Object object2 = new bzb(this.getWindow().getDecorView(), null);
            object = Build.VERSION.SDK_INT >= 35 ? new xs((Window)object) : (Build.VERSION.SDK_INT >= 30 ? new xr((Window)object) : new xq((Window)object, (bzb)object2));
            Activity activity = bnv.e(this.mContext);
            object2 = activity.getWindow();
            bzb bzb2 = new bzb(activity.getWindow().getDecorView(), null);
            object2 = Build.VERSION.SDK_INT >= 35 ? new xs((Window)object2) : (Build.VERSION.SDK_INT >= 30 ? new xr((Window)object2) : new xq((Window)object2, bzb2));
            int n2 = ((wd)object2).g();
            if (n2 != 0) {
                ((wd)object).k(n2);
            }
            if (Build.VERSION.SDK_INT >= 30 && (object2 = activity.getWindow().getDecorView().getRootWindowInsets()) != null) {
                if (!sk$$ExternalSyntheticApiModelOutline1.m((WindowInsets)object2, sk$$ExternalSyntheticApiModelOutline1.m$1())) {
                    we.c(1, (wd)object);
                }
                if (!sk$$ExternalSyntheticApiModelOutline1.m((WindowInsets)object2, sk$$ExternalSyntheticApiModelOutline1.m$2())) {
                    we.c(2, (wd)object);
                }
            }
        }
    }

    private float getHorizontalInset(DisplayMetrics object) {
        int n2 = true != this.mRenderInDisplayCutout ? 135 : 7;
        if (Build.VERSION.SDK_INT >= 30) {
            object = sk$$ExternalSyntheticApiModelOutline1.m(sk$$ExternalSyntheticApiModelOutline1.m(sk$$ExternalSyntheticApiModelOutline1.m((WindowManager)bnv.f(this.mContext).getSystemService(WindowManager.class))), n2);
            return dp$$ExternalSyntheticApiModelOutline0.m$3((Insets)object) + dp$$ExternalSyntheticApiModelOutline0.m((Insets)object);
        }
        double d2 = object.widthPixels;
        object = bnv.e(this.mContext);
        if (object != null && (object = object.getWindow().getDecorView().getRootView().getRootWindowInsets()) != null) {
            object = xn.m((WindowInsets)object).f(n2);
            return object.b + object.d;
        }
        return (float)(d2 * 0.09999999999999998);
    }

    private float getVerticalInset(DisplayMetrics object) {
        int n2 = true != this.mRenderInDisplayCutout ? 135 : 7;
        if (Build.VERSION.SDK_INT >= 30) {
            object = sk$$ExternalSyntheticApiModelOutline1.m(sk$$ExternalSyntheticApiModelOutline1.m(sk$$ExternalSyntheticApiModelOutline1.m((WindowManager)bnv.f(this.mContext).getSystemService(WindowManager.class))), n2);
            return dp$$ExternalSyntheticApiModelOutline0.m$1((Insets)object) + dp$$ExternalSyntheticApiModelOutline0.m$2((Insets)object);
        }
        double d2 = object.heightPixels;
        object = bnv.e(this.mContext);
        if (object != null && (object = object.getWindow().getDecorView().getRootView().getRootWindowInsets()) != null) {
            object = xn.m((WindowInsets)object).f(n2);
            return object.c + object.e;
        }
        return (float)(d2 * 0.09999999999999998);
    }

    private void initViewTreeOwners() {
        Window window = this.getWindow();
        if (window == null) {
            return;
        }
        we.f(window.getDecorView(), this);
        xm.f(window.getDecorView(), this);
        kh.c(window.getDecorView(), this);
    }

    private void updateAttributes() {
        Window window = this.getWindow();
        if (window == null) {
            return;
        }
        window.setAttributes(this.getDialogWindowLayoutParam(this.mBaseLayoutParams));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public WindowManager.LayoutParams getDialogWindowLayoutParam(WindowManager.LayoutParams layoutParams) {
        Context context = this.mContext;
        DisplayMetrics displayMetrics = bnv.g(context);
        int n2 = context.getResources().getDimensionPixelSize(2131165281);
        int n3 = this.mContext.getResources().getDimensionPixelSize(2131165277);
        int n4 = displayMetrics.widthPixels;
        int n5 = displayMetrics.heightPixels;
        int n6 = (int)this.getHorizontalInset(displayMetrics);
        int n7 = (int)this.getVerticalInset(displayMetrics);
        int n8 = this.mContext.getResources().getDimensionPixelSize(2131165280);
        int n9 = this.mContext.getResources().getDimensionPixelSize(2131165276);
        if (n8 == 0) {
            n8 = Math.min(n4, n2);
        }
        layoutParams.width = n8;
        n8 = n9 != 0 ? n9 : Math.min(n5, n3);
        layoutParams.height = n8;
        layoutParams.dimAmount = bnv.b(this.mContext.getResources(), 2131165275);
        layoutParams.flags |= 2;
        n8 = this.mSceneType;
        layoutParams.windowAnimations = n8 != 1 ? (n8 != 2 ? (n8 != 3 ? 2132084217 : 2132084219) : 2132084220) : 2132084218;
        n9 = this.mContext.getResources().getDimensionPixelSize(2131165278);
        n3 = this.mContext.getResources().getDimensionPixelSize(2131165279);
        n8 = n9;
        if (n9 == 0) {
            n8 = 0;
            if (n3 == 0) {
                n8 = n4 - n6;
                layoutParams.x = 0;
                layoutParams.y = 0;
                n3 = (int)bnv.a(this.mContext.getResources(), 32);
                n9 = layoutParams.width;
                if (n9 + n6 >= n4 - (n3 += n3)) {
                    layoutParams.width = n8 - n3;
                }
                if (layoutParams.height + n7 >= n5 - n3) {
                    layoutParams.height = n5 - n7 - n3;
                }
                n9 = (int)bnv.a(this.mContext.getResources(), 64);
                n6 = this.mContext.getResources().getConfiguration().orientation;
                n8 = (n8 - layoutParams.width) / 2;
                if (n6 == 2 && n8 >= n9) {
                    layoutParams.gravity = 0x800033;
                    layoutParams.x = n9;
                    layoutParams.y = (n5 - n7 - layoutParams.height) / 2;
                } else {
                    layoutParams.gravity = 17;
                }
                return layoutParams;
            }
        }
        layoutParams.gravity = 0x800033;
        layoutParams.x = n8;
        layoutParams.y = n3;
        return layoutParams;
    }

    @Override
    public abb getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override
    public nf getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override
    public awf getSavedStateRegistry() {
        return (awf)this.mSavedStateRegistryController.b;
    }

    public WindowManager.LayoutParams getWindowLayoutParams() {
        if (this.getWindow() == null) {
            return null;
        }
        return this.getWindow().getAttributes();
    }

    public /* synthetic */ void lambda$copySystemUiVisibility$0$com-android-car-ui-appstyledview-AppStyledDialog(Activity activity, int n2) {
        this.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
    }

    public /* synthetic */ void lambda$new$0$com-android-car-ui-appstyledview-AppStyledDialog() {
        super.onBackPressed();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.copyWindowInsets();
        this.copySystemUiVisibility();
        this.updateAttributes();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistryController.b(bundle);
        bundle = this.getWindow();
        if (bundle == null) {
            return;
        }
        bundle.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        this.updateAttributes();
        this.configureImeInsetFit();
        this.mLifecycleRegistry.e(aba.c);
    }

    public Bundle onSaveInstanceState() {
        awg awg2 = this.mSavedStateRegistryController;
        Bundle bundle = super.onSaveInstanceState();
        awg2.c(bundle);
        return bundle;
    }

    protected void onStart() {
        this.mLifecycleRegistry.e(aba.d);
        this.mLifecycleRegistry.e(aba.e);
        super.onStart();
    }

    protected void onStop() {
        this.mLifecycleRegistry.e(aba.a);
        super.onStop();
    }

    public void setContentView(int n2) {
        this.initViewTreeOwners();
        super.setContentView(n2);
    }

    public void setContentView(View view) {
        this.initViewTreeOwners();
        this.mContent = view;
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void setSceneType(int n2) {
        this.mSceneType = n2;
    }

    public void show() {
        if (!this.isShowing()) {
            super.show();
            View view = this.getCurrentFocus();
            if (view != null) {
                view.clearFocus();
            }
        }
    }
}

