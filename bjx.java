/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 */
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import com.android.car.ui.CarUiLayoutInflaterFactory;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.core.BaseLayoutController;
import com.android.car.ui.core.CarUiInstaller;

public final class bjx
implements Application.ActivityLifecycleCallbacks {
    private Insets a = null;
    private boolean b = false;

    private static final boolean a(Activity activity) {
        return bnv.p(activity, 2130968763);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (!bjx.a(activity)) {
            return;
        }
        Log.i((String)"CarUiInstaller", (String)"CarUiInstaller started for ".concat(String.valueOf(ComponentName.createRelative((Context)activity, (String)activity.getClass().getName()).flattenToShortString())));
        LayoutInflater layoutInflater = LayoutInflater.from((Context)activity);
        if (layoutInflater.getFactory2() == null) {
            layoutInflater.setFactory2((LayoutInflater.Factory2)new CarUiLayoutInflaterFactory());
        } else if (!(layoutInflater.getFactory2() instanceof CarUiLayoutInflaterFactory) && !(layoutInflater.getFactory2() instanceof ds)) {
            throw new AssertionError((Object)String.valueOf(String.valueOf(layoutInflater.getFactory2())).concat(" must extend CarUiLayoutInflaterFactory"));
        }
        CarUiInstaller.a(activity.getClassLoader(), BaseLayoutController.class, "build", null, activity);
        if (bundle != null) {
            this.a = new Insets(bundle.getInt("CAR_UI_INSET_LEFT"), bundle.getInt("CAR_UI_INSET_TOP"), bundle.getInt("CAR_UI_INSET_RIGHT"), bundle.getInt("CAR_UI_INSET_BOTTOM"));
        }
        this.b = true;
    }

    public final void onActivityDestroyed(Activity activity) {
        if (!bjx.a(activity)) {
            return;
        }
        CarUiInstaller.a(activity.getClassLoader(), BaseLayoutController.class, "destroy", null, activity);
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityPostStarted(Activity activity) {
        if (bjx.a(activity)) {
            Object object = CarUiInstaller.a(activity.getClassLoader(), BaseLayoutController.class, "getBaseLayoutController", null, activity);
            if (this.a != null && object != null && this.b) {
                CarUiInstaller.a(activity.getClassLoader(), BaseLayoutController.class, "dispatchNewInsets", object, CarUiInstaller.b(activity.getClassLoader(), this.a));
                this.b = false;
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (bjx.a(activity)) {
            Object object = CarUiInstaller.a(activity.getClassLoader(), BaseLayoutController.class, "getBaseLayoutController", null, activity);
            if (object != null) {
                object = CarUiInstaller.a(activity.getClassLoader(), BaseLayoutController.class, "getInsets", object, new Object[0]);
                bundle.putInt("CAR_UI_INSET_LEFT", ((Integer)CarUiInstaller.a(activity.getClassLoader(), Insets.class, "getLeft", object, new Object[0])).intValue());
                bundle.putInt("CAR_UI_INSET_TOP", ((Integer)CarUiInstaller.a(activity.getClassLoader(), Insets.class, "getTop", object, new Object[0])).intValue());
                bundle.putInt("CAR_UI_INSET_RIGHT", ((Integer)CarUiInstaller.a(activity.getClassLoader(), Insets.class, "getRight", object, new Object[0])).intValue());
                bundle.putInt("CAR_UI_INSET_BOTTOM", ((Integer)CarUiInstaller.a(activity.getClassLoader(), Insets.class, "getBottom", object, new Object[0])).intValue());
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

