/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 *  bax
 *  hom
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bpt
implements pq {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ bpt(bpy bpy2, bpx bpx2, int n2) {
        this.c = n2;
        this.a = bpy2;
        this.b = bpx2;
    }

    public /* synthetic */ bpt(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(po object) {
        int n2 = this.c;
        Object object2 = null;
        if (n2 != 0) {
            if (n2 == 1) {
                object2 = this.b;
                jse.e(object2, "$this_future");
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ((po)object).a(new akt(atomicBoolean, 14), (Executor)bax.a);
                object2.execute(new ai((Object)atomicBoolean, object, this.a, 5, null));
                return jon.a;
            }
            if (n2 == 2) {
                Object object3 = this.a;
                ((cmn)this.b).k.put(object3, object);
                return "ConcurrentSodaManager.stopDetection operation";
            }
            object2 = this.b;
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object object4 = this.a;
            Context context = (Context)object2;
            crs crs2 = new crs(atomicBoolean, context, (Runnable)object4, (po)object);
            context.registerReceiver((BroadcastReceiver)crs2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            if (crt.e(context) && atomicBoolean.compareAndSet(false, true)) {
                context.unregisterReceiver((BroadcastReceiver)crs2);
                object4.run();
                ((po)object).c(null);
                return "DirectBootUtils.runWhenUnlocked";
            }
            ((po)object).a(new ai((Object)atomicBoolean, object2, (Object)crs2, 13, null), (Executor)hom.a);
            return "DirectBootUtils.runWhenUnlocked";
        }
        Object object5 = new bpd((po)object, 0);
        Object object6 = this.b;
        try {
            Object object7 = ((bpx)object6).a;
            object6 = ((bov)object7).a();
            n2 = box.a;
            object6.writeStrongBinder((IBinder)object5);
            object6 = ((bov)object7).b(4, (Parcel)object6);
            object5 = object6.readStrongBinder();
            object5 = object5 == null ? null : ((object7 = object5.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback")) instanceof bpb ? (bpb)object7 : new bpb((IBinder)object5));
            object6.recycle();
            object2 = this.a;
        }
        catch (RuntimeException runtimeException) {
            ((po)object).d(new bpp(3, 0, "Failed to prepare inference engine", runtimeException));
            return object2;
        }
        catch (RemoteException remoteException) {
            ((po)object).d(new bpp(3, 6, "Failed to prepare inference engine", remoteException));
            return object2;
        }
        ((po)object).a(new bpv(object5, 0), ((bpy)object2).d);
        return "prepareInferenceEngineFuture";
    }
}

