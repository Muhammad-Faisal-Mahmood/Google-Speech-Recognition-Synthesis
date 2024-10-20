/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public class bya
extends bom
implements ilw {
    public boolean k = false;
    private ilo l;
    private volatile ile m;
    private final Object n = new Object();

    public bya() {
        this.z(new mn(this, 6));
    }

    @Override
    public final Object bn() {
        return this.q().bn();
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        return fvc.am(this, super.getDefaultViewModelProviderFactory());
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        if (this.getApplication() instanceof ilw) {
            object = this.q().c();
            this.l = object;
            if (((ilo)object).b()) {
                this.l.a = this.getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ilo ilo2 = this.l;
        if (ilo2 != null) {
            ilo2.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ile q() {
        if (this.m != null) return this.m;
        Object object = this.n;
        synchronized (object) {
            if (this.m != null) return this.m;
            this.m = this.t();
            return this.m;
        }
    }

    protected ile t() {
        throw null;
    }
}

