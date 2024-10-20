/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  gqv
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class gpi
implements Application.ActivityLifecycleCallbacks {
    final Application.ActivityLifecycleCallbacks a;
    final gpm b;

    public gpi(gpm gpm2, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a = activityLifecycleCallbacks;
        this.b = gpm2;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (fxf.aw(gqv.a)) {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityCreated"));
        try {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        finally {
            object.close();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (fxf.aw(gqv.a)) {
            this.a.onActivityDestroyed(activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityDestroyed"));
        try {
            this.a.onActivityDestroyed(activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (fxf.aw(gqv.a)) {
            this.a.onActivityPaused(activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPaused"));
        try {
            this.a.onActivityPaused(activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$1(this.a, activity, bundle);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPostCreated"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$1(this.a, activity, bundle);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPostDestroyed(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$3(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPostDestroyed"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$3(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPostPaused(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$2(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPostPaused"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$2(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPostResumed(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$6(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPostResumed"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$6(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$2(this.a, activity, bundle);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPostSaveInstanceState"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$2(this.a, activity, bundle);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPostStarted(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$9(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPostStarted"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$9(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPostStopped(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$7(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPostStopped"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$7(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m(this.a, activity, bundle);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPreCreated"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m(this.a, activity, bundle);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPreDestroyed(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$1(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPreDestroyed"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$1(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPrePaused(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPrePaused"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPreResumed(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$5(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPreResumed"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$5(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$3(this.a, activity, bundle);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPreSaveInstanceState"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$3(this.a, activity, bundle);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPreStarted(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$4(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPreStarted"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$4(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public void onActivityPreStopped(Activity activity) {
        if (fxf.aw(gqv.a)) {
            dp$$ExternalSyntheticApiModelOutline0.m$8(this.a, activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityPreStopped"));
        try {
            dp$$ExternalSyntheticApiModelOutline0.m$8(this.a, activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (fxf.aw(gqv.a)) {
            this.a.onActivityResumed(activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityResumed"));
        try {
            this.a.onActivityResumed(activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (fxf.aw(gqv.a)) {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivitySaveInstanceState"));
        try {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        finally {
            object.close();
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (fxf.aw(gqv.a)) {
            this.a.onActivityStarted(activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityStarted"));
        try {
            this.a.onActivityStarted(activity);
            return;
        }
        finally {
            object.close();
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (fxf.aw(gqv.a)) {
            this.a.onActivityStopped(activity);
            return;
        }
        Object object = String.valueOf(activity.getClass().getName());
        object = this.b.d(((String)object).concat("#onActivityStopped"));
        try {
            this.a.onActivityStopped(activity);
            return;
        }
        finally {
            object.close();
        }
    }
}

