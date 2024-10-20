/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.Set;

public final class cch {
    private static cch b;
    private static volatile Set c;
    private static volatile Set d;
    public final Context a;
    private volatile String e;

    public cch(Context context) {
        this.a = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static cch b(Context context) {
        kl.at(context);
        synchronized (cch.class) {
            if (b == null) {
                cch cch2;
                cby.a(context);
                b = cch2 = new cch(context);
            }
            return b;
        }
    }

    static final cfu c(PackageInfo object, cfu ... cfuArray) {
        if (object.signatures != null) {
            if (object.signatures.length != 1) {
                Log.w((String)"GoogleSignatureVerifier", (String)"Package has more than one signature.");
                return null;
            }
            object = object.signatures;
            object = new cbv(object[0].toByteArray());
            for (int i2 = 0; i2 < cfuArray.length; ++i2) {
                if (!cfuArray[i2].equals(object)) continue;
                return cfuArray[i2];
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final boolean d(PackageInfo object, boolean bl2) {
        Object object2;
        void var1_4;
        block7: {
            boolean bl3;
            block5: {
                block8: {
                    block6: {
                        bl3 = var1_4;
                        if (var1_4 == false) break block5;
                        if (object != null) break block6;
                        object2 = null;
                        break block7;
                    }
                    if ("com.android.vending".equals(object.packageName)) break block8;
                    bl3 = var1_4;
                    if (!"com.google.android.gms".equals(object.packageName)) break block5;
                }
                bl3 = (object2 = object.applicationInfo) != null && (object2.flags & 0x81) != 0;
            }
            object2 = object;
            var1_4 = bl3;
        }
        if (object != null && object2.signatures != null) {
            void var0_3;
            if (var1_4 != false) {
                cfu cfu2 = cch.c(object2, cbx.a);
            } else {
                cfu cfu3 = cch.c(object2, new cfu[]{cbx.a[0]});
            }
            if (var0_3 != null) {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ccd a(String object) {
        Throwable throwable222222;
        StrictMode.ThreadPolicy threadPolicy;
        block23: {
            boolean bl2;
            Object object2;
            Object object3;
            block24: {
                object3 = null;
                if (object == null) {
                    return new ccd(false, null);
                }
                if (((String)object).equals(this.e)) {
                    return ccd.a;
                }
                threadPolicy = StrictMode.allowThreadDiskReads();
                cby.b();
                object2 = cby.d;
                object2 = ((bov)object2).b(7, ((bov)object2).a());
                bl2 = box.d((Parcel)object2);
                object2.recycle();
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                if (!bl2) break block24;
                bl2 = ccg.a(this.a);
                threadPolicy = StrictMode.allowThreadDiskReads();
                try {
                    block22: {
                        Object object4;
                        Context context;
                        kl.at(cby.c);
                        try {
                            cby.b();
                            context = cby.c;
                            object4 = new cgz(context);
                            object2 = new cbz((String)object, bl2, false, (IBinder)object4, false, true);
                        }
                        catch (chh chh2) {
                            Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)chh2);
                            chh2.getMessage();
                            object3 = new ccd(false, chh2);
                        }
                        try {
                            object4 = cby.d;
                            context = ((bov)object4).a();
                            box.c((Parcel)context, (Parcelable)object2);
                            object4 = ((bov)object4).b(6, (Parcel)context);
                            object2 = (cca)box.a((Parcel)object4, cca.CREATOR);
                            object4.recycle();
                            if (((cca)object2).a) {
                                ((cca)object2).b();
                                object3 = new ccd(true, null);
                            }
                            object4 = ((cca)object2).b;
                            if (((cca)object2).a() != 4) break block22;
                        }
                        catch (RemoteException remoteException) {
                            Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
                            object3 = new ccd(false, remoteException);
                        }
                        object3 = new PackageManager.NameNotFoundException();
                    }
                    ((cca)object2).b();
                    ((cca)object2).a();
                    object3 = new ccd(false, (Throwable)object3);
                }
                finally {
                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                }
                catch (Throwable throwable222222) {
                    break block23;
                }
                catch (RemoteException remoteException) {
                }
                catch (chh chh3) {
                    // empty catch block
                }
                {
                    Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", object3);
                }
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            }
            try {
                threadPolicy = this.a.getPackageManager().getPackageInfo((String)object, 64);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object3 = new ccd(false, nameNotFoundException);
            }
            bl2 = ccg.a(this.a);
            if (threadPolicy == null) {
                object3 = new ccd(false, null);
            } else if (threadPolicy.signatures != null && threadPolicy.signatures.length == 1) {
                cbv cbv2 = new cbv(threadPolicy.signatures[0].toByteArray());
                object2 = threadPolicy.packageName;
                object3 = cby.c((String)object2, cbv2, bl2, false);
                if (object3.b && threadPolicy.applicationInfo != null && (threadPolicy.applicationInfo.flags & 2) != 0 && cby.c((String)object2, (cfu)cbv2, (boolean)false, (boolean)true).b) {
                    object3 = new ccd(false, null);
                }
            } else {
                object3 = new ccd(false, null);
            }
            if (!object3.b) return object3;
            this.e = object;
            return object3;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable222222;
    }
}

