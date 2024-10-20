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

class fcv
extends fos
implements ilw {
    private ContextWrapper ah;
    private boolean ai;
    private volatile iln aj;
    private final Object ak = new Object();
    private boolean al = false;

    private final void B() {
        if (this.ah == null) {
            this.ah = new ilr(super.getContext(), (be)this);
            this.ai = fvc.ap(super.getContext());
        }
    }

    protected iln C() {
        throw null;
    }

    protected final void D() {
        if (!this.al) {
            this.al = true;
            this.bn();
            fcn fcn2 = (fcn)this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.aj != null) return this.aj.bn();
        Object object = this.ak;
        synchronized (object) {
            if (this.aj != null) return this.aj.bn();
            this.aj = this.C();
            return this.aj.bn();
        }
    }

    @Override
    public Context getContext() {
        if (super.getContext() == null && !this.ai) {
            return null;
        }
        this.B();
        return this.ah;
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        return fvc.an(this, super.getDefaultViewModelProviderFactory());
    }

    @Override
    public void onAttach(Activity activity) {
        boolean bl2;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.ah;
        boolean bl3 = bl2 = true;
        if (contextWrapper != null) {
            bl3 = iln.d((Context)contextWrapper) == activity ? bl2 : false;
        }
        fvc.ak(bl3, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        this.B();
        this.D();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.B();
        this.D();
    }

    @Override
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        bundle = super.onGetLayoutInflater(bundle);
        return bundle.cloneInContext((Context)new ilr((LayoutInflater)bundle, (be)this));
    }
}

