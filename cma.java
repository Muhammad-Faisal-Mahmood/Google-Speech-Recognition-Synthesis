/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class cma
extends cfm {
    private final AtomicReference t = new AtomicReference();

    public cma(Context context, Looper looper, cfe cfe2, cct cct2, ccu ccu2) {
        super(context, looper, 41, cfe2, cct2, ccu2);
    }

    @Override
    public final boolean A() {
        return true;
    }

    public final void F(clu clu2, clu clu3, cdm object) {
        cly cly2 = new cly((clv)this.t(), (cdm)object, clu3);
        if (clu2 != null) {
            object = (clv)this.t();
            clu3 = ((bov)object).a();
            int n2 = box.a;
            clu3.writeStrongBinder((IBinder)clu2);
            clu3.writeStrongBinder((IBinder)cly2);
            ((bov)object).c(10, (Parcel)clu3);
            return;
        }
        if (clu3 == null) {
            object.g();
            return;
        }
        ((clv)this.t()).e(clu3, cly2);
    }

    @Override
    public final int a() {
        return 12600000;
    }

    @Override
    protected final /* synthetic */ IInterface b(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService")) instanceof clv ? (clv)iInterface : new clv((IBinder)object));
        return object;
    }

    @Override
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override
    public final cbm[] e() {
        return clh.f;
    }

    @Override
    public final void u() {
        block3: {
            clu clu2 = this.t.getAndSet(null);
            if (clu2 == null) break block3;
            try {
                clx clx2 = new clx();
                clv clv2 = (clv)this.t();
                Parcel parcel = clv2.a();
                int n2 = box.a;
                parcel.writeStrongBinder((IBinder)clu2);
                parcel.writeStrongBinder((IBinder)clx2);
                clv2.c(5, parcel);
            }
            catch (RemoteException remoteException) {
                Log.e((String)"UsageReportingClientImp", (String)"disconnect(): Could not unregister listener from remote:", (Throwable)remoteException);
            }
        }
        super.u();
    }
}

