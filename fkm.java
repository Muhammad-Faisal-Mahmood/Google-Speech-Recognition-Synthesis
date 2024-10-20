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

class fkm
extends ghu
implements ilw {
    private volatile iln ag;
    private final Object ah = new Object();
    private boolean ai = false;
    private ContextWrapper c;
    private boolean d;

    private final void e() {
        if (this.c == null) {
            this.c = new ilr(super.getContext(), (be)this);
            this.d = fvc.ap(super.getContext());
        }
    }

    protected iln a() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.ag != null) return this.ag.bn();
        Object object = this.ah;
        synchronized (object) {
            if (this.ag != null) return this.ag.bn();
            this.ag = this.a();
            return this.ag.bn();
        }
    }

    protected final void c() {
        if (!this.ai) {
            this.ai = true;
            this.bn();
            fkr fkr2 = (fkr)this;
        }
    }

    @Override
    public Context getContext() {
        if (super.getContext() == null && !this.d) {
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
            bl3 = iln.d((Context)contextWrapper) == activity ? bl2 : false;
        }
        fvc.ak(bl3, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
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

