/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.RemoteException
 */
import android.os.IBinder;
import android.os.RemoteException;

final class jac
extends jad {
    public jac(IBinder iBinder) {
        super(iBinder);
    }

    @Override
    public final void a(int n2, jah jah2) {
        if (this.c(n2, jah2.b())) {
            return;
        }
        throw new RemoteException(a.ah(n2, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
    }
}

