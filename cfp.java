/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.RemoteException
 *  android.os.StrictMode
 *  android.os.StrictMode$VmPolicy
 *  android.os.StrictMode$VmPolicy$Builder
 *  android.util.Log
 */
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class cfp
implements ServiceConnection {
    public final Map a;
    public int b;
    public boolean c;
    public IBinder d;
    public final cfn e;
    public ComponentName f;
    public final cfo g;

    public cfp(cfo cfo2, cfn cfn2) {
        this.g = cfo2;
        this.e = cfn2;
        this.a = new HashMap();
        this.b = 2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ cbk c(cfp var0) {
        block32: {
            block28: {
                block29: {
                    block27: {
                        var6_4 = var0.e;
                        var4_6 = var0.g.d;
                        var2_8 = var6_4.e;
                        var3_9 /* !! */  = null;
                        var5_14 = null;
                        if (!var2_8) break block32;
                        var7_15 /* !! */  = new Bundle();
                        var7_15 /* !! */ .putString("serviceActionBundleKey", var6_4.b);
                        var3_9 /* !! */  = var4_6.getContentResolver().acquireUnstableContentProviderClient(cfn.a);
                        if (var3_9 /* !! */  != null) {
                        }
                        ** GOTO lbl-1000
                        {
                            catch (IllegalArgumentException var3_12) {
                                break block27;
                            }
                            catch (RemoteException var3_13) {
                                // empty catch block
                                break block27;
                            }
                            try {
                                var4_6 = var3_9 /* !! */ .call("serviceIntentCall", null, var7_15 /* !! */ );
                            }
                            catch (Throwable var4_7) {}
                            {
                                var3_9 /* !! */ .release();
                                throw var4_7;
                            }
                            try {
                                var3_9 /* !! */ .release();
                                var3_9 /* !! */  = var4_6;
                                break block28;
                            }
                            catch (IllegalArgumentException var3_10) {
                                break block29;
                            }
                            catch (RemoteException var3_11) {
                                break block29;
                            }
                        }
lbl-1000:
                        // 1 sources

                        {
                            var3_9 /* !! */  = new RemoteException("Failed to acquire ContentProviderClient");
                            throw var3_9 /* !! */ ;
                        }
                    }
                    var4_6 = null;
                }
                Log.w((String)"ConnectionStatusConfig", (String)"Dynamic intent resolution failed: ".concat(var3_9 /* !! */ .toString()));
                var3_9 /* !! */  = var4_6;
            }
            var4_6 = var5_14;
            if (var3_9 /* !! */  != null && (var4_6 = (Intent)var3_9 /* !! */ .getParcelable("serviceResponseIntentKey")) == null && (var3_9 /* !! */  = (PendingIntent)var3_9 /* !! */ .getParcelable("serviceMissingResolutionIntentKey")) != null) {
                var0 = var6_4.b;
                var4_6 = new StringBuilder("Dynamic lookup for intent failed for action ");
                var4_6.append((String)var0);
                var4_6.append(" but has possible resolution");
                Log.w((String)"ConnectionStatusConfig", (String)var4_6.toString());
                var4_6 = new cbk(25, (PendingIntent)var3_9 /* !! */ );
                var0 = new cgc((cbk)var4_6);
                throw var0;
            }
            var3_9 /* !! */  = var4_6;
            if (var4_6 == null) {
                Log.w((String)"ConnectionStatusConfig", (String)"Dynamic lookup for intent failed for action: ".concat(var6_4.b));
                var3_9 /* !! */  = var4_6;
            }
        }
        var4_6 = var3_9 /* !! */ ;
        if (var3_9 /* !! */  == null) {
            var3_9 /* !! */  = new Intent(var6_4.b);
            var4_6 = var3_9 /* !! */ .setPackage(var6_4.c);
        }
        var0.b = 3;
        var3_9 /* !! */  = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy((StrictMode.VmPolicy)cgw.a(new StrictMode.VmPolicy.Builder((StrictMode.VmPolicy)var3_9 /* !! */ )).build());
        }
        ** try [egrp 6[TRYBLOCK] [21 : 348->517)] { 
lbl72:
        // 1 sources

        ** GOTO lbl-1000
lbl73:
        // 1 sources

        finally {
            StrictMode.setVmPolicy((StrictMode.VmPolicy)var3_9 /* !! */ );
        }
lbl-1000:
        // 1 sources

        {
            block31: {
                block30: {
                    var5_14 = var0.g.d;
                    var6_4 = var4_6.getComponent();
                    if (var6_4 == null) break block30;
                    var7_15 /* !! */  = var6_4.getPackageName();
                    "com.google.android.gms".equals(var7_15 /* !! */ );
                    try {
                        var6_4 = cgx.b(var5_14);
                        var2_8 = false;
                        var1_16 = var6_4.a((String)var7_15 /* !! */ , (int)0).flags;
                        if ((var1_16 & 0x200000) == 0) break block30;
                    }
                    catch (PackageManager.NameNotFoundException var6_5) {
                        ** continue;
                    }
                    Log.w((String)"ConnectionTracker", (String)"Attempted to bind to a service in a STOPPED package.");
                    ** GOTO lbl93
                }
lbl91:
                // 2 sources

                while (true) {
                    var2_8 = var5_14.bindService((Intent)var4_6, (ServiceConnection)var0, 4225);
lbl93:
                    // 2 sources

                    var0.c = var2_8;
                    if (var2_8) {
                        var4_6 = var0.g.e.obtainMessage(1, (Object)var0.e);
                        var0.g.e.sendMessageDelayed((Message)var4_6, var0.g.f);
                        var0 = cbk.a;
                        return var0;
                    }
                    var0.b = 2;
                    try {}
                    catch (IllegalArgumentException var0_3) {}
                    break block31;
lbl104:
                    // 2 sources

                    while (true) {
                        var0 = new cbk(16);
                        return var0;
                    }
                    break;
                }
                catch (cgc var0_2) {
                    var0 = var0_2.a;
                    return var0;
                }
            }
            cgr.a(var0.g.d, (ServiceConnection)var0);
            ** continue;
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void onBindingDied(ComponentName componentName) {
        this.onServiceDisconnected(componentName);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap = this.g.c;
        synchronized (hashMap) {
            this.g.e.removeMessages(1, (Object)this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator iterator = this.a.values().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.b = 1;
                    return;
                }
                ((ServiceConnection)iterator.next()).onServiceConnected(componentName, iBinder);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap = this.g.c;
        synchronized (hashMap) {
            this.g.e.removeMessages(1, (Object)this.e);
            this.d = null;
            this.f = componentName;
            Iterator iterator = this.a.values().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.b = 2;
                    return;
                }
                ((ServiceConnection)iterator.next()).onServiceDisconnected(componentName);
            }
        }
    }
}

