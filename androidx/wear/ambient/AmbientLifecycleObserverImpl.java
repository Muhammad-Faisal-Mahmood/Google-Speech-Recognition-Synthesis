/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package androidx.wear.ambient;

import android.app.Activity;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientDelegate$AmbientCallback;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;
import androidx.wear.ambient.AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0;
import androidx.wear.ambient.AmbientLifecycleObserverImpl$callbackTranslator$1;
import java.util.concurrent.Executor;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class AmbientLifecycleObserverImpl
implements AmbientLifecycleObserver {
    private final AmbientDelegate a;
    private final AmbientLifecycleObserverImpl$callbackTranslator$1 b;

    public static /* synthetic */ void $r8$lambda$diKW5WdS0-l3AgqQGEwkPy29olo(Runnable runnable) {
        AmbientLifecycleObserverImpl.a(runnable);
    }

    public AmbientLifecycleObserverImpl(Activity activity, AmbientLifecycleObserver$AmbientLifecycleCallback ambientLifecycleObserver$AmbientLifecycleCallback) {
        jse.e(activity, "activity");
        jse.e(ambientLifecycleObserver$AmbientLifecycleCallback, "callback");
        this(activity, new AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0(), ambientLifecycleObserver$AmbientLifecycleCallback);
    }

    public AmbientLifecycleObserverImpl(Activity activity, Executor object, AmbientLifecycleObserver$AmbientLifecycleCallback ambientLifecycleObserver$AmbientLifecycleCallback) {
        jse.e(activity, "activity");
        jse.e(object, "callbackExecutor");
        jse.e(ambientLifecycleObserver$AmbientLifecycleCallback, "callback");
        this.b = object = new AmbientLifecycleObserverImpl$callbackTranslator$1(ambientLifecycleObserver$AmbientLifecycleCallback);
        this.a = new AmbientDelegate(activity, (AmbientDelegate$AmbientCallback)object);
    }

    public static final void a(Runnable runnable) {
        runnable.run();
    }

    @Override
    public final boolean isAmbient() {
        return this.a.h();
    }

    @Override
    public final void onCreate(abe abe2) {
        jse.e(abe2, "owner");
        wc.d(abe2);
        this.a.b();
        this.a.g();
    }

    @Override
    public final void onDestroy(abe abe2) {
        jse.e(abe2, "owner");
        wc.e(abe2);
        this.a.c();
    }

    @Override
    public final void onPause(abe abe2) {
        jse.e(abe2, "owner");
        wc.f(abe2);
        this.a.d();
    }

    @Override
    public final void onResume(abe abe2) {
        jse.e(abe2, "owner");
        wc.g(abe2);
        this.a.e();
    }

    @Override
    public final /* synthetic */ void onStart(abe abe2) {
        wc.h(abe2);
    }

    @Override
    public final void onStop(abe abe2) {
        jse.e(abe2, "owner");
        wc.i(abe2);
        this.a.f();
    }
}

