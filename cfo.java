/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 */
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class cfo {
    public static final Object a = new Object();
    public static HandlerThread b;
    public static cfo h;
    public final HashMap c;
    public final Context d;
    public volatile Handler e;
    public final long f;
    public volatile Executor g;
    private final long i;
    private final afq j;

    public cfo() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public cfo(Context object, Looper object2) {
        afq afq2;
        this.c = new HashMap();
        this.j = afq2 = new afq(this, 2);
        this.d = object.getApplicationContext();
        this.e = new gbs((Looper)object2, afq2);
        if (cgr.b == null) {
            object = cgr.a;
            synchronized (object) {
                if (cgr.b == null) {
                    cgr.b = object2;
                }
            }
        }
        kl.at(cgr.b);
        this.i = 5000L;
        this.f = 300000L;
        this.g = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String object, ServiceConnection object2, boolean bl2) {
        cfn cfn2 = new cfn((String)object, bl2);
        object = this.c;
        synchronized (object) {
            cfp cfp2 = (cfp)this.c.get(cfn2);
            if (cfp2 == null) {
                object2 = new IllegalStateException(a.ai(cfn2.b, "Nonexistent connection status for service config: "));
                throw object2;
            }
            if (!cfp2.a((ServiceConnection)object2)) {
                object2 = new IllegalStateException(a.ai(cfn2.b, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
                throw object2;
            }
            cfp2.a.remove(object2);
            if (cfp2.b()) {
                object2 = this.e.obtainMessage(0, (Object)cfn2);
                this.e.sendMessageDelayed((Message)object2, this.i);
            }
            return;
        }
    }
}

