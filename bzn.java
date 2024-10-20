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

class bzn
extends at
implements ilw {
    private ContextWrapper ag;
    private boolean ah;
    private volatile iln ai;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void D() {
        if (this.ag == null) {
            this.ag = new ilr(super.getContext(), (be)this);
            this.ah = fvc.ap(super.getContext());
        }
    }

    protected iln B() {
        throw null;
    }

    protected final void C() {
        if (!this.ak) {
            this.ak = true;
            this.bn();
            bzp bzp2 = (bzp)this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.ai != null) return this.ai.bn();
        Object object = this.aj;
        synchronized (object) {
            if (this.ai != null) return this.ai.bn();
            this.ai = this.B();
            return this.ai.bn();
        }
    }

    @Override
    public Context getContext() {
        if (super.getContext() == null && !this.ah) {
            return null;
        }
        this.D();
        return this.ag;
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        return fvc.an(this, super.getDefaultViewModelProviderFactory());
    }

    @Override
    public void onAttach(Activity activity) {
        boolean bl2;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean bl3 = bl2 = true;
        if (contextWrapper != null) {
            bl3 = iln.d((Context)contextWrapper) == activity ? bl2 : false;
        }
        fvc.ak(bl3, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        this.D();
        this.C();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.D();
        this.C();
    }

    @Override
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        bundle = super.onGetLayoutInflater(bundle);
        return bundle.cloneInContext((Context)new ilr((LayoutInflater)bundle, (be)this));
    }
}

