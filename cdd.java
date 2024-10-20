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

abstract class cdd
extends cdc {
    protected final bzo a;

    public cdd(int n2, bzo bzo2) {
        super(n2);
        this.a = bzo2;
    }

    protected abstract void c(cdx var1);

    @Override
    public final void d(Status object) {
        object = new ccq((Status)object);
        this.a.d((Exception)object);
    }

    @Override
    public final void e(Exception exception) {
        this.a.d(exception);
    }

    @Override
    public final void f(cdx cdx2) {
        try {
            this.c(cdx2);
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
            this.d(cdi.h((RemoteException)((Object)deadObjectException)));
            throw deadObjectException;
        }
    }

    @Override
    public void g(cxu cxu2, boolean bl2) {
    }
}

