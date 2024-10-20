/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  bax
 *  hom
 */
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bbc
implements pq {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ bbc(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    public /* synthetic */ bbc(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.c = object;
        this.a = object2;
        this.b = object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(po object) {
        int n2 = this.d;
        Object object2 = null;
        if (n2 == 0) {
            Object object3 = this.a;
            jse.e(object3, "$context");
            Object object4 = this.b;
            jse.e(object4, "$start");
            ((po)object).a(new akt((jwi)object3.get(jwi.c), 13), (Executor)bax.a);
            object2 = this.c;
            object3 = jvf.g((jqf)object3);
            object = new epy((jro)object2, (po)object, null, 1);
            return jse.ah((jvb)object3, null, (jvc)((Object)object4), (jro)object, 1);
        }
        if (n2 == 1) {
            object2 = this.c;
            jse.e(object2, "$this_executeAsync");
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ((po)object).a(new akt(atomicBoolean, 12), (Executor)bax.a);
            object2.execute(new ai((Object)atomicBoolean, object, this.b, 4, null));
            return this.a;
        }
        if (n2 != 2) {
            Object object5 = this.b;
            ((po)object).a(new bpv(object5, 3), (Executor)hom.a);
            aks aks2 = new aks(object, this.c, 15);
            Object object6 = this.a;
            object2 = (giu)object6;
            Object object7 = ((giu)object2).c;
            synchronized (object7) {
                if (((giu)object6).a) {
                    aks2.run();
                } else {
                    ((giu)object6).b.add(aks2);
                }
            }
            hhk.T((hpn)object5, new cru((giu)object2, (po)object, aks2, 1), (Executor)hom.a);
            return "FailureSignal.propagate";
        }
        Object object8 = this.a;
        Object object9 = this.b;
        try {
            object8 = ((bpx)object8).a;
            bzb bzb2 = new bzb(object);
            Object object10 = ((bqd)object9).b;
            if (object10 != null) {
                String string = ((bqd)object9).a.toLanguageTag();
                String string2 = ((bqd)object9).c;
                object9 = new bpj(null, string, 1, (ParcelFileDescriptor)object10, string2);
            } else {
                object9 = new bpj(null, ((bqd)object9).a.toLanguageTag(), 1, null, "");
            }
            object10 = new bpd(bzb2, 2);
            bzb2 = ((bov)object8).a();
            box.c((Parcel)bzb2, (Parcelable)object9);
            bzb2.writeStrongBinder((IBinder)object10);
            object8 = ((bov)object8).b(2, (Parcel)bzb2);
            object9 = object8.readStrongBinder();
            object9 = object9 == null ? null : ((bzb2 = object9.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback")) instanceof bpb ? (bpb)((Object)bzb2) : new bpb((IBinder)object9));
            object8.recycle();
            object2 = this.c;
        }
        catch (RuntimeException runtimeException) {
            ((po)object).d(new bpp(2, 0, "Failed to run inference", runtimeException));
            return object2;
        }
        catch (RemoteException remoteException) {
            ((po)object).d(new bpp(2, 6, "Failed to run inference", remoteException));
            return object2;
        }
        ((po)object).a(new bpv(object9, 2), ((bpy)object2).d);
        return "runInferenceFuture";
    }
}

