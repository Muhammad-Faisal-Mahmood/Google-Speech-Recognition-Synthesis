/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public class bxu
extends bom
implements ilw {
    public boolean k = false;
    private ilo l;
    private volatile ile m;
    private final Object n = new Object();

    public bxu() {
        this.z(new mn(this, 4));
    }

    @Override
    public final Object bn() {
        return this.u().bn();
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        return fvc.am(this, super.getDefaultViewModelProviderFactory());
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        if (this.getApplication() instanceof ilw) {
            object = this.u().c();
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

    protected ile q() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ile u() {
        if (this.m != null) return this.m;
        Object object = this.n;
        synchronized (object) {
            if (this.m != null) return this.m;
            this.m = this.q();
            return this.m;
        }
    }
}

