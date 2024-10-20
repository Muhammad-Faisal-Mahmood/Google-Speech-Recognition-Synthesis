/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;

final class cby {
    static final cbw a;
    static final cbw b;
    public static Context c;
    public static volatile cfy d;
    private static final Object e;

    static {
        new cbr(cfu.c("0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
        new cbs(cfu.c("0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"));
        a = new cbt(cfu.c("0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
        b = new cbu(cfu.c("0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"));
        e = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void a(Context context) {
        synchronized (cby.class) {
            if (c != null) {
                Log.w((String)"GoogleCertificates", (String)"GoogleCertificates has been initialized already");
                return;
            }
            if (context != null) {
                c = context.getApplicationContext();
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b() {
        if (d != null) {
            return;
        }
        kl.at(c);
        Object object = e;
        synchronized (object) {
            if (d == null) {
                Context context = c;
                Object object2 = chk.b;
                object2 = chk.c(context, "com.google.android.gms.googlecertificates").b();
                object2 = object2 == null ? null : ((context = object2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi")) instanceof cfy ? (cfy)context : new cfy((IBinder)object2));
                d = object2;
            }
            return;
        }
    }

    static ccd c(String object, cfu cfu2, boolean bl2, boolean bl3) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            object = cby.d((String)object, cfu2, bl2, bl3);
            return object;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    public static ccd d(String string, cfu cfu2, boolean bl2, boolean bl3) {
        try {
            cby.b();
        }
        catch (chh chh2) {
            Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)chh2);
            chh2.getMessage();
            return new ccd(false, chh2);
        }
        kl.at(c);
        ccb ccb2 = new ccb(string, cfu2, bl2, bl3);
        try {
            cfy cfy2 = d;
            PackageManager packageManager = c.getPackageManager();
            cgz cgz2 = new cgz(packageManager);
            packageManager = cfy2.a();
            box.c((Parcel)packageManager, ccb2);
            packageManager.writeStrongBinder((IBinder)cgz2);
            ccb2 = cfy2.b(5, (Parcel)packageManager);
            bl3 = box.d((Parcel)ccb2);
            ccb2.recycle();
            if (bl3) {
                return ccd.a;
            }
            return new ccc(new cbq(bl2, string, cfu2));
        }
        catch (RemoteException remoteException) {
            Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
            return new ccd(false, remoteException);
        }
    }
}

