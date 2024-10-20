/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class clv
extends bov
implements IInterface {
    public clv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void e(clu clu2, clt clt2) {
        Parcel parcel = this.a();
        int n2 = box.a;
        parcel.writeStrongBinder((IBinder)clu2);
        parcel.writeStrongBinder((IBinder)clt2);
        this.c(4, parcel);
    }
}

