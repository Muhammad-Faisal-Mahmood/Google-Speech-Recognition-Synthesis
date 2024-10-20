/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.DeadObjectException
 *  android.os.RemoteException
 */
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

public final class cdg
extends cdc {
    private final ces a;
    private final bzo b;

    public cdg(int n2, ces ces2, bzo bzo2) {
        super(n2);
        this.b = bzo2;
        this.a = ces2;
        if (n2 == 2 && ces2.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override
    public final boolean a(cdx cdx2) {
        return this.a.b;
    }

    @Override
    public final cbm[] b(cdx cdx2) {
        return this.a.a;
    }

    @Override
    public final void d(Status status) {
        this.b.d(kl.ax(status));
    }

    @Override
    public final void e(Exception exception) {
        this.b.d(exception);
    }

    @Override
    public final void f(cdx object) {
        try {
            ces ces2 = this.a;
            object = ((cdx)object).b;
            bzo bzo2 = this.b;
            ces2.d.a.a(object, bzo2);
            return;
        }
        catch (RuntimeException runtimeException) {
            this.e(runtimeException);
            return;
        }
        catch (RemoteException remoteException) {
            this.d(cdi.h(remoteException));
            return;
        }
        catch (DeadObjectException deadObjectException) {
            throw deadObjectException;
        }
    }

    @Override
    public final void g(cxu object, boolean bl2) {
        Object object2 = ((cxu)object).b;
        bzo bzo2 = this.b;
        object2.put(bzo2, bl2);
        object = new cds((cxu)object, bzo2);
        object2 = clc.a;
        ((ckz)bzo2.a).g((Executor)object2, (ckv)object);
    }
}

