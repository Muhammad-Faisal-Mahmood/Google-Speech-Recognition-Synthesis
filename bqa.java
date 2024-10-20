/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 */
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class bqa
implements ServiceConnection {
    public final Object a;
    public hqa b;
    final bqb c;
    protected giu d;

    public bqa(bqb bqb2) {
        this.c = bqb2;
        this.a = new Object();
        this.d = new giu(null);
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(bpp bpp2) {
        Object object = this.a;
        synchronized (object) {
            this.b.n(bpp2);
        }
        this.c.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void b() {
        Object object = this.a;
        synchronized (object) {
            Object object2 = new hqa();
            this.b = object2;
            this.d = object2 = new giu(null);
            return;
        }
    }

    public final boolean c(Intent intent) {
        return this.c.e.bindService(intent, (ServiceConnection)this, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(boz boz2) {
        Object object = this.a;
        synchronized (object) {
            hqa hqa2 = this.b;
            giu giu2 = this.d;
            bpl bpl2 = new bpl(boz2, giu2);
            hqa2.m(bpl2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onBindingDied(ComponentName object) {
        object = this.a;
        synchronized (object) {
            this.d.j();
            bpp bpp2 = new bpp(4, 603, "AiCore service binding died.", null);
            this.a(bpp2);
        }
        this.c.c();
    }

    public final void onNullBinding(ComponentName componentName) {
        this.a(new bpp(4, 605, "AiCore service returns null on binding.", null));
    }

    /*
     * WARNING - void declaration
     */
    public final void onServiceConnected(ComponentName object, IBinder object2) {
        boolean bl2 = a.k(object, bqb.b);
        Parcel parcel = null;
        Object var6_8 = null;
        if (bl2) {
            void var1_4;
            object = object2 == null ? var6_8 : ((object = object2.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider")) instanceof bpa ? (bpa)object : new bpa((IBinder)object2));
            try {
                object2 = new bpd(this, 1);
                parcel = ((bov)object).a();
                int n2 = box.a;
                parcel.writeStrongBinder(object2);
                ((bov)object).d(2, parcel);
                return;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (RemoteException remoteException) {
                // empty catch block
            }
            this.a(new bpp(4, 6, "AiCore service is not connected.", (Throwable)var1_4));
            return;
        }
        if (a.k(object, bqb.c)) {
            object = object2 == null ? parcel : ((object = object2.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService")) instanceof boz ? (boz)object : new boz((IBinder)object2));
            this.d((boz)object);
            return;
        }
        this.a(new bpp(4, 0, "AiCore service is not connected. Unknown component ".concat(String.valueOf(String.valueOf(object))), null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName object) {
        object = this.a;
        synchronized (object) {
            this.d.j();
            hqa hqa2 = this.b;
            bpp bpp2 = new bpp(4, 602, "AiCore service disconnected.", null);
            hqa2.n(bpp2);
            this.b();
            return;
        }
    }
}

