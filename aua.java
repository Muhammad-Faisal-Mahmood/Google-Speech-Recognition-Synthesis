/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.RemoteCallbackList
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

public final class aua
extends Binder
implements aub {
    final MultiInstanceInvalidationService a;

    public aua() {
        this.attachInterface(this, b);
    }

    public aua(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        this.attachInterface(this, b);
    }

    public final IBinder asBinder() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean onTransact(int n2, Parcel parcel, Parcel object, int n3) {
        int n4;
        int n5;
        int n6;
        String[] stringArray;
        Object object2;
        block26: {
            object2 = b;
            if (n2 > 0 && n2 <= 0xFFFFFF) {
                parcel.enforceInterface((String)object2);
            }
            if (n2 == 1598968902) {
                object.writeString((String)object2);
                return true;
            }
            stringArray = null;
            object2 = null;
            n6 = 0;
            int n7 = 0;
            n5 = 0;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return super.onTransact(n2, parcel, object, n4);
                    }
                    n4 = parcel.readInt();
                    stringArray = parcel.createStringArray();
                    jse.e(stringArray, "tables");
                    object = this.a;
                    parcel = object.c;
                    // MONITORENTER : parcel
                    object2 = (String)object.b.get(n4);
                    if (object2 == null) {
                        Log.w((String)"ROOM", (String)"Remote invalidation client ID not registered");
                        // MONITOREXIT : parcel
                        return true;
                    }
                    break block26;
                } else {
                    stringArray = parcel.readStrongBinder();
                    n2 = aty.a;
                    if (stringArray != null) {
                        object2 = stringArray.queryLocalInterface(aty.b);
                        object2 = object2 != null && object2 instanceof atz ? (atz)object2 : new atx((IBinder)stringArray);
                    }
                    n2 = parcel.readInt();
                    jse.e(object2, "callback");
                    stringArray = this.a;
                    parcel = stringArray.c;
                    // MONITORENTER : parcel
                    stringArray.c.unregister((IInterface)object2);
                    object2 = (String)stringArray.b.remove(n2);
                    // MONITOREXIT : parcel
                    object.writeNoException();
                    return true;
                }
            }
            object2 = parcel.readStrongBinder();
            n2 = aty.a;
            object2 = object2 == null ? stringArray : ((stringArray = object2.queryLocalInterface(aty.b)) != null && stringArray instanceof atz ? (atz)stringArray : new atx((IBinder)object2));
            String string = parcel.readString();
            jse.e(object2, "callback");
            if (string == null) {
                n2 = n7;
            } else {
                stringArray = this.a;
                parcel = stringArray.c;
                // MONITORENTER : parcel
                stringArray.a = n2 = stringArray.a + 1;
                RemoteCallbackList remoteCallbackList = stringArray.c;
                Integer n8 = n2;
                if (remoteCallbackList.register((IInterface)object2, (Object)n8)) {
                    stringArray.b.put(n8, string);
                } else {
                    --stringArray.a;
                    n2 = n6;
                }
                // MONITOREXIT : parcel
            }
            object.writeNoException();
            object.writeInt(n2);
            return true;
        }
        n6 = object.c.beginBroadcast();
        n2 = n5;
        while (true) {
            if (n2 >= n6) {
                object.c.finishBroadcast();
                // MONITOREXIT : parcel
                return true;
            }
            try {
                boolean bl2;
                Object object3 = object.c.getBroadcastCookie(n2);
                jse.c(object3, "null cannot be cast to non-null type kotlin.Int");
                object3 = (Integer)object3;
                n5 = (Integer)object3;
                object3 = (String)object.b.get(object3);
                if (n4 != n5 && (bl2 = jse.i(object2, object3))) {
                    try {
                        ((atz)object.c.getBroadcastItem(n2)).a(stringArray);
                    }
                    catch (RemoteException remoteException) {
                        Log.w((String)"ROOM", (String)"Error invoking a remote callback", (Throwable)remoteException);
                    }
                }
                ++n2;
            }
            catch (Throwable throwable) {
                object.c.finishBroadcast();
                throw throwable;
            }
        }
    }
}

