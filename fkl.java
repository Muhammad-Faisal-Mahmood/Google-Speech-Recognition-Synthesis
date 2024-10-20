/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public class fkl
extends foq
implements ilw {
    public boolean k = false;
    private ilo m;
    private volatile ile n;
    private final Object o = new Object();

    public fkl() {
        this.z(new mn(this, 14));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ile D() {
        if (this.n != null) return this.n;
        Object object = this.o;
        synchronized (object) {
            if (this.n != null) return this.n;
            this.n = this.E();
            return this.n;
        }
    }

    protected ile E() {
        throw null;
    }

    @Override
    public final Object bn() {
        return this.D().bn();
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        return fvc.am(this, super.getDefaultViewModelProviderFactory());
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        if (this.getApplication() instanceof ilw) {
            object = this.D().c();
            this.m = object;
            if (((ilo)object).b()) {
                this.m.a = this.getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ilo ilo2 = this.m;
        if (ilo2 != null) {
            ilo2.a();
        }
    }
}

