/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public class fdb
extends dp
implements ilw {
    private ilo k;
    private volatile ile l;
    private final Object m = new Object();
    public boolean q = false;

    public fdb() {
        this.z(new mn(this, 13));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ile E() {
        if (this.l != null) return this.l;
        Object object = this.m;
        synchronized (object) {
            ile ile2;
            if (this.l != null) return this.l;
            this.l = ile2 = new ile(this);
            return this.l;
        }
    }

    @Override
    public final Object bn() {
        return this.E().bn();
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        return fvc.am(this, super.getDefaultViewModelProviderFactory());
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        if (this.getApplication() instanceof ilw) {
            object = this.E().c();
            this.k = object;
            if (((ilo)object).b()) {
                this.k.a = this.getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override
    protected final void onDestroy() {
        super.onDestroy();
        ilo ilo2 = this.k;
        if (ilo2 != null) {
            ilo2.a();
        }
    }
}

