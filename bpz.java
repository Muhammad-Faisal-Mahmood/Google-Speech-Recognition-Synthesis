/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.WearableControllerProvider;

public final class bpz
implements pq {
    public final bqb a;
    public final bpl b;
    public final bpq c;
    public final WearableControllerProvider d;

    public /* synthetic */ bpz(bqb bqb2, bpl bpl2, bpq bpq2, WearableControllerProvider wearableControllerProvider) {
        this.a = bqb2;
        this.b = bpl2;
        this.c = bpq2;
        this.d = wearableControllerProvider;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(po po2) {
        Object object;
        bpq bpq2 = this.c;
        Object object2 = this.b;
        try {
            object = ((bpl)object2).a;
            object = ((bov)object).b(11, ((bov)object).a());
            int n2 = object.readInt();
            object.recycle();
            bqb bqb2 = this.a;
            if (n2 > 0) {
                object = ((bpl)object2).a;
                boy boy2 = bpq2.a();
                object2 = new bpc(bqb2, po2, 0);
                bqb2 = ((bov)object).a();
                box.c((Parcel)bqb2, boy2);
                bqb2.writeStrongBinder((IBinder)object2);
                object = ((bov)object).b(12, (Parcel)bqb2);
                object.readInt();
                object.recycle();
                return "requestDownloadableFeatureFuture";
            }
            object = new bpc(bqb2, po2, 1, null);
            object2 = ((bpl)object2).a;
            boy boy3 = bpq2.a();
            bqb2 = ((bov)object2).a();
            box.c((Parcel)bqb2, boy3);
            bqb2.writeStrongBinder((IBinder)object);
            object = ((bov)object2).b(7, (Parcel)bqb2);
            object.readInt();
            object.recycle();
            return "requestDownloadableFeatureFuture";
        }
        catch (RemoteException remoteException) {
            object = "AiCore service failed to download feature ".concat(bpq2.a);
            Log.e((String)bqb.a, (String)object, (Throwable)remoteException);
            po2.d(new bpp(1, 6, "AICore service failed to download feature ".concat(bpq2.a), remoteException));
        }
        return "requestDownloadableFeatureFuture";
    }
}

