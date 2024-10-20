/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Bundle
 *  android.view.LayoutInflater
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public class flf
extends ghu
implements ilw {
    private final Object ag = new Object();
    private ContextWrapper c;
    private volatile gih d;

    private final void e() {
        if (this.c == null) {
            this.c = new ilr(super.getContext(), (be)this);
        }
    }

    protected gih a() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.d != null) return this.d.bn();
        Object object = this.ag;
        synchronized (object) {
            if (this.d != null) return this.d.bn();
            this.d = this.a();
            return this.d.bn();
        }
    }

    protected final void c() {
        this.bn();
        fls fls2 = (fls)this;
    }

    @Override
    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        this.e();
        return this.c;
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        return fvc.an(this, super.getDefaultViewModelProviderFactory());
    }

    @Override
    public void onAttach(Activity activity) {
        boolean bl2;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.c;
        boolean bl3 = bl2 = true;
        if (contextWrapper != null) {
            while (contextWrapper instanceof ContextWrapper && !(contextWrapper instanceof Activity)) {
                contextWrapper = contextWrapper.getBaseContext();
            }
            bl3 = contextWrapper == activity ? bl2 : false;
        }
        fxf.B(bl3, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        this.e();
        this.c();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.e();
        this.c();
    }

    @Override
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        bundle = this.getLayoutInflater(bundle);
        return bundle.cloneInContext((Context)new ilr((LayoutInflater)bundle, (be)this));
    }
}

