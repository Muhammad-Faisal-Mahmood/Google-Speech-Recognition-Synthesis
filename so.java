/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Message
 *  android.os.RemoteException
 *  android.provider.Settings$Secure
 *  android.util.Log
 */
import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class so
implements Handler.Callback,
ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public so(Context context) {
        this.b = context;
        context = new HandlerThread("NotificationManagerCompat");
        this.c = context;
        context.start();
        this.a = new Handler(context.getLooper(), (Handler.Callback)this);
    }

    private final void a(sn sn2) {
        if (sn2.b) {
            this.b.unbindService((ServiceConnection)this);
            sn2.b = false;
        }
        sn2.c = null;
    }

    private final void b(sn sn2) {
        block14: {
            block12: {
                Object object;
                block13: {
                    boolean bl2;
                    if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                        Objects.toString(sn2.a);
                        sn2.d.size();
                    }
                    if (sn2.d.isEmpty()) break block12;
                    if (sn2.b) break block13;
                    object = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(sn2.a);
                    sn2.b = bl2 = this.b.bindService(object, (ServiceConnection)this, 33);
                    if (bl2) {
                        sn2.e = 0;
                    } else {
                        object = sn2.a;
                        Objects.toString(object);
                        Log.w((String)"NotifManCompat", (String)"Unable to bind to listener ".concat(String.valueOf(object)));
                        this.b.unbindService((ServiceConnection)this);
                    }
                    if (!sn2.b) break block14;
                }
                if (sn2.c == null) break block14;
                while ((object = (sm)sn2.d.peek()) != null) {
                    try {
                        if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                            Objects.toString(object);
                        }
                        cq cq2 = sn2.c;
                        Notification notification = object.c;
                        int n2 = object.b;
                        cq2.a(object.a, n2, notification);
                        sn2.d.remove();
                    }
                    catch (RemoteException remoteException) {
                        object = sn2.a;
                        Objects.toString(object);
                        Log.w((String)"NotifManCompat", (String)"RemoteException communicating with ".concat(String.valueOf(object)), (Throwable)remoteException);
                        break;
                    }
                    catch (DeadObjectException deadObjectException) {
                        if (!Log.isLoggable((String)"NotifManCompat", (int)3)) break;
                        Objects.toString(sn2.a);
                        break;
                    }
                }
                if (!sn2.d.isEmpty()) {
                    this.c(sn2);
                }
            }
            return;
        }
        this.c(sn2);
    }

    private final void c(sn sn2) {
        int n2;
        Object object = sn2.a;
        if (this.a.hasMessages(3, object)) {
            return;
        }
        int n3 = sn2.e;
        sn2.e = n2 = n3 + 1;
        if (n2 > 6) {
            object = new StringBuilder("Giving up on delivering ");
            ((StringBuilder)object).append(sn2.d.size());
            ((StringBuilder)object).append(" tasks to ");
            ((StringBuilder)object).append(sn2.a);
            ((StringBuilder)object).append(" after ");
            ((StringBuilder)object).append(sn2.e);
            ((StringBuilder)object).append(" retries");
            Log.w((String)"NotifManCompat", (String)((StringBuilder)object).toString());
            sn2.d.clear();
            return;
        }
        sn2 = this.a.obtainMessage(3, (Object)sn2.a);
        this.a.sendMessageDelayed((Message)sn2, (long)((1 << n3) * 1000));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean handleMessage(Message object) {
        ComponentName componentName3;
        ComponentName componentName2;
        int n2 = object.what;
        if (n2 != 0) {
            IInterface iInterface;
            if (n2 != 1) {
                if (n2 == 2) {
                    object = (ComponentName)object.obj;
                    if ((object = (sn)this.d.get(object)) == null) return true;
                    this.a((sn)object);
                    return true;
                }
                if (n2 != 3) {
                    return false;
                }
                object = (ComponentName)object.obj;
                if ((object = (sn)this.d.get(object)) == null) return true;
                this.b((sn)object);
                return true;
            }
            object = (awg)object.obj;
            Object object2 = object.a;
            object = object.b;
            if ((object2 = (sn)this.d.get(object2)) == null) return true;
            n2 = cp.a;
            object = object == null ? null : ((iInterface = object.queryLocalInterface(cp.b)) != null && iInterface instanceof cq ? (cq)iInterface : new co((IBinder)object));
            ((sn)object2).c = object;
            ((sn)object2).e = 0;
            this.b((sn)object2);
            return true;
        }
        object = (sm)object.obj;
        Object object32 = this.b;
        HashSet<ComponentName> hashSet = sp.a;
        String string = Settings.Secure.getString((ContentResolver)object32.getContentResolver(), (String)"enabled_notification_listeners");
        hashSet = sp.a;
        // MONITORENTER : hashSet
        if (string != null && !string.equals(sp.b)) {
            object32 = string.split(":", -1);
            int n3 = ((Object)object32).length;
            componentName2 = new HashSet(n3);
            for (n2 = 0; n2 < n3; ++n2) {
                componentName3 = ComponentName.unflattenFromString((String)object32[n2]);
                if (componentName3 == null) continue;
                componentName2.add(componentName3.getPackageName());
            }
            sp.c = componentName2;
            sp.b = string;
        }
        object32 = sp.c;
        // MONITOREXIT : hashSet
        if (!object32.equals(this.e)) {
            this.e = object32;
            componentName3 = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            hashSet = new HashSet<ComponentName>();
            for (ComponentName componentName3 : componentName3) {
                if (!object32.contains(componentName3.serviceInfo.packageName)) continue;
                componentName2 = new ComponentName(componentName3.serviceInfo.packageName, componentName3.serviceInfo.name);
                if (componentName3.serviceInfo.permission != null) {
                    Log.w((String)"NotifManCompat", (String)a.ak(componentName2, "Permission present on component ", ", not adding listener record."));
                    continue;
                }
                hashSet.add(componentName2);
            }
            for (Object object32 : hashSet) {
                if (this.d.containsKey(object32)) continue;
                if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                    Objects.toString(object32);
                }
                this.d.put(object32, new sn((ComponentName)object32));
            }
            componentName3 = this.d.entrySet().iterator();
            while (componentName3.hasNext()) {
                object32 = componentName3.next();
                if (hashSet.contains(object32.getKey())) continue;
                if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                    Objects.toString(object32.getKey());
                }
                this.a((sn)object32.getValue());
                componentName3.remove();
            }
        }
        object32 = this.d.values().iterator();
        while (object32.hasNext()) {
            hashSet = (sn)object32.next();
            ((sn)((Object)hashSet)).d.add(object);
            this.b((sn)((Object)hashSet));
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
            Objects.toString(componentName);
        }
        this.a.obtainMessage(1, (Object)new awg(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
            Objects.toString(componentName);
        }
        this.a.obtainMessage(2, (Object)componentName).sendToTarget();
    }
}

