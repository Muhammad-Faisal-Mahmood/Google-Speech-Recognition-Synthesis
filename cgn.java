/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.RemoteException
 */
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class cgn
implements ceo {
    public final Object a;
    private final int b;

    public /* synthetic */ cgn(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(Object object, Object object2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                object = (cma)object;
                                ccs ccs2 = (ccs)this.a;
                                object2 = new cll(ccs2, (bzo)object2);
                                ((cma)object).F(((clp)ccs2.d).b, null, (cdm)object2);
                                return;
                            }
                            Object object3 = (ckd)object;
                            object = new clu((bzo)object2, 1);
                            object2 = (ckc)((cfc)object3).t();
                            object3 = ((hvd)this.a).g();
                            Parcel parcel = ((bov)object2).a();
                            n2 = box.a;
                            parcel.writeStrongBinder((IBinder)object);
                            parcel.writeByteArray((byte[])object3);
                            ((bov)object2).c(31, parcel);
                            return;
                        }
                        object = (ckd)object;
                        object2 = new clu((bzo)object2, 1);
                        ((ckc)((cfc)object).t()).e((clu)((Object)object2), (String)this.a);
                        return;
                    }
                    object2 = (cio)((cim)object).t();
                    object = new cis((cei)this.a);
                    Parcel parcel = ((bov)object2).a();
                    n2 = box.a;
                    parcel.writeStrongBinder((IBinder)object);
                    ((bov)object2).c(224703, parcel);
                    return;
                }
                Object object4 = (cim)object;
                object = this.a;
                try {
                    cio cio2 = (cio)object4.t();
                    object4 = new ciu((Context)object, (bzo)object2);
                    object = cio2.a();
                    n2 = box.a;
                    object.writeStrongBinder((IBinder)object4);
                    cio2.c(224705, (Parcel)object);
                    return;
                }
                catch (RemoteException remoteException) {
                    ((bzo)object2).d((Exception)((Object)remoteException));
                    return;
                }
            }
            Object object5 = (cbb)object;
            object = new cax((bzo)object2);
            object5 = (cbe)((cfc)object5).t();
            object2 = ((bov)object5).a();
            n2 = box.a;
            object2.writeStrongBinder((IBinder)object);
            box.c((Parcel)object2, (Parcelable)this.a);
            ((bov)object5).d(8, (Parcel)object2);
            return;
        }
        object = (cgm)((cgq)object).t();
        Parcel parcel = ((bov)object).a();
        box.c(parcel, (Parcelable)this.a);
        ((bov)object).d(1, parcel);
        ((bzo)object2).c(null);
    }
}

