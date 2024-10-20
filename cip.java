/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 */
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class cip
implements ceo {
    private final int a;

    public /* synthetic */ cip(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(Object object, Object object2) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        cma cma2 = (cma)object;
                        object = new clj((bzo)object2);
                        object2 = (clv)cma2.t();
                        cma2 = ((bov)object2).a();
                        n2 = box.a;
                        cma2.writeStrongBinder((IBinder)object);
                        ((bov)object2).c(2, (Parcel)cma2);
                        return;
                    }
                    object = (ckd)object;
                    n2 = cka.a;
                    return;
                }
                object = (ckc)((ckd)object).t();
                bpd bpd2 = new bpd((bzo)object2, 5, null);
                object2 = ((bov)object).a();
                n2 = box.a;
                object2.writeStrongBinder((IBinder)bpd2);
                ((bov)object).c(27, (Parcel)object2);
                return;
            }
            object = (cio)((cim)object).t();
            cit cit2 = new cit((bzo)object2);
            object2 = ((bov)object).a();
            n2 = box.a;
            object2.writeStrongBinder((IBinder)cit2);
            ((bov)object).c(224704, (Parcel)object2);
            return;
        }
        object = (cim)object;
        try {
            cio cio2 = (cio)((cfc)object).t();
            object = new cir((bzo)object2);
            Parcel parcel = cio2.a();
            n2 = box.a;
            parcel.writeStrongBinder((IBinder)object);
            cio2.c(224702, parcel);
            return;
        }
        catch (RemoteException remoteException) {
            ((bzo)object2).d((Exception)((Object)remoteException));
            return;
        }
    }
}

