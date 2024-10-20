/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 */
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class gii
extends bm
implements ng,
aco,
cb {
    private final gib a;
    private final Context f;
    private final nf g;
    private final AmbientModeSupport$AmbientController h;

    public gii(gib gib2, Context context, nf nf2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        Handler handler = new Handler(Looper.getMainLooper());
        jse.e(context, "context");
        super(null, context, handler);
        this.a = gib2;
        this.f = context;
        this.g = nf2;
        this.h = ambientModeSupport$AmbientController;
    }

    @Override
    public final View a(int n2) {
        return ((View)this.h.a).findViewById(n2);
    }

    @Override
    public final LayoutInflater c() {
        Context context = this.f;
        return LayoutInflater.from((Context)context).cloneInContext(context);
    }

    @Override
    public final /* synthetic */ Object e() {
        return this.a;
    }

    @Override
    public final abb getLifecycle() {
        return ((gic)this.a).b;
    }

    @Override
    public final nf getOnBackPressedDispatcher() {
        return this.g;
    }

    @Override
    public final bzb getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging() {
        return ((gic)this.a).g;
    }

    @Override
    public final void p(be be2) {
        if (be2 instanceof ilw) {
            fxf.E(be2 instanceof flf, "Fragment %s attached to FragmentHost should be activity agnostic, either annotate FragmentPeer/Fragment with @ActivityAgnosticPeer/@ActivityAgnostic or remove the fragment.", be2.getClass());
        }
    }
}

