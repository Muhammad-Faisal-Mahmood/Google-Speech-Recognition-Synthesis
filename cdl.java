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
import com.google.android.gms.common.api.internal.BasePendingResult;

public abstract class cdl
extends BasePendingResult
implements cdm {
    protected cdl(ccv ccv2) {
        a.s(ccv2, "GoogleApiClient must not be null");
        super(ccv2);
    }

    private final void l(RemoteException remoteException) {
        this.f(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void b(cck var1);

    public final void e(cck cck2) {
        try {
            this.b(cck2);
            return;
        }
        catch (RemoteException remoteException) {
            this.l(remoteException);
            return;
        }
        catch (DeadObjectException deadObjectException) {
            this.l((RemoteException)((Object)deadObjectException));
            throw deadObjectException;
        }
    }

    public final void f(Status status) {
        kl.ao(status.a() ^ true, "Failed result must not be success");
        this.j(this.a(status));
    }
}

