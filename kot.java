/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.util.Log
 */
import J.N;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.Locale;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.ProxyChangeListener;
import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class kot
implements Runnable {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ kot(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public kot(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ kot(Object object, Object object2, int n2, char[] cArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public kot(jul jul2, jxm jxm2, int n2) {
        this.c = n2;
        this.b = jul2;
        this.a = jxm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object;
        int n2 = this.c;
        Object object2 = null;
        switch (n2) {
            default: {
                object2 = this.b;
                object = this.a;
                break;
            }
            case 15: {
                object2 = this.b;
                Object object3 = this.a;
                try {
                    ((krq)object3).a.e(((krq)object3).d, (kpv)object2);
                }
                catch (Exception exception) {
                    ((krq)object3).d.m("onSucceded", exception);
                }
                object3 = (krq)object3;
                ((krq)object3).b();
                ((krq)object3).d.q.i();
                return;
            }
            case 14: {
                object2 = this.a;
                Object object4 = this.b;
                object2 = new kot(object4, object2, 11, null);
                ((krs)object4).c.execute((Runnable)object2);
                return;
            }
            case 13: {
                Object object5 = this.a;
                try {
                    object5.a();
                    return;
                }
                catch (Throwable throwable) {
                    Object object6 = this.b;
                    object5 = new kra(object6, 7);
                    object6 = (krs)object6;
                    ((krs)object6).c.execute((Runnable)object5);
                    ((krs)object6).g(new kqj("Exception received from UrlRequest.Callback", throwable));
                    return;
                }
            }
            case 12: {
                Object object7 = this.a;
                try {
                    object7.a();
                    return;
                }
                catch (Throwable throwable) {
                    ((krs)this.b).h(throwable);
                    return;
                }
            }
            case 11: {
                Object object8 = this.a;
                try {
                    object8.a();
                    return;
                }
                catch (Throwable throwable) {
                    object8 = this.b;
                    kqp kqp2 = new kqp("System error", throwable);
                    ((krs)object8).g(kqp2);
                    return;
                }
            }
            case 10: {
                object2 = (krs)this.a;
                String string = ((krs)object2).o;
                object2 = ((krs)object2).b;
                ((krq)object2).a(new krp((krq)object2, (kpv)this.b, string, 0));
                return;
            }
            case 9: {
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority((int)((krf)this.a).a);
                this.b.run();
                return;
            }
            case 8: {
                Object object9 = this.a;
                object2 = (kpo)this.b;
                ((ksh)object9).a((kpo)object2);
                return;
            }
            case 7: {
                Object object10 = ((CronetUrlRequestContext)this.a).b;
                synchronized (object10) {
                    object2 = this.a;
                    N.M6Dz0nZ5(((CronetUrlRequestContext)object2).c, object2);
                }
                Object object11 = this.b;
                if (object11 != null) {
                    kqr kqr2 = CronetLibraryLoader.d;
                    n2 = kqr2.a;
                    krd krd2 = (krd)object11;
                    object10 = krd2.c;
                    object2 = (kqu)object10;
                    ((kqu)object2).d = n2;
                    ((kqu)object2).e = (Boolean)kqr2.b;
                    ((kqu)object2).f = kqr2.c;
                    ((kqu)object2).g = kqr2.d;
                    n2 = krd2.a();
                    synchronized (object10) {
                        ((kqu)((krd)object11).c).c = n2;
                        ((krd)object11).b();
                        return;
                    }
                }
                return;
            }
            case 6: {
                Object object12 = CronetUrlRequestContext.a;
                object12 = this.a;
                object2 = this.b;
                try {
                    try {
                        object2.run();
                    }
                    catch (Exception exception) {
                        Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)"Exception thrown from observation task", (Throwable)exception);
                    }
                    if (object12 != null) {
                        ((ksb)object12).a();
                    }
                    return;
                }
                catch (Throwable throwable) {}
                if (object12 != null) {
                    ((ksb)object12).a();
                }
                throw throwable;
            }
            case 5: {
                Object object13 = this.b;
                ((CronetBidirectionalStream)this.a).e((kod)object13);
                return;
            }
            case 4: {
                object2 = ((CronetBidirectionalStream)this.a).s;
                synchronized (object2) {
                    if (((CronetBidirectionalStream)this.a).k()) {
                        return;
                    }
                }
                try {
                    Object object14 = this.a;
                    kse kse2 = ((CronetBidirectionalStream)object14).b;
                    object2 = ((CronetBidirectionalStream)object14).D;
                    kpu kpu2 = (kpu)this.b;
                    ((kny)kse2).e((knz)object14, (kpv)object2, kpu2);
                    return;
                }
                catch (Exception exception) {
                    ((CronetBidirectionalStream)this.a).h(exception);
                    return;
                }
            }
            case 3: {
                Object object15 = kpg.a(((ConnectivityManager)jjj.c.getSystemService("connectivity")).getDefaultProxy());
                if (object15 == null) {
                    object15 = kpg.a;
                } else if (Build.VERSION.SDK_INT >= 29 && object15.b.equals("localhost") && object15.c == -1) {
                    kpg kpg2 = ProxyChangeListener.a((Intent)this.b);
                    Log.i((String)"cr_ProxyChangeListener", (String)String.format(Locale.US, "configFromConnectivityManager = %s, configFromIntent = %s", object15, kpg2));
                    if (kpg2 == null) {
                        object15 = object2;
                    } else {
                        object2 = object15.d;
                        object15 = object15.e;
                        n2 = kpg2.c;
                        object15 = new kpg(kpg2.b, n2, (String)object2, (String[])object15);
                    }
                }
                ((ProxyChangeListener)this.a).b((kpg)object15);
                return;
            }
            case 2: {
                kpb kpb2 = ((koy)((Object)this.a)).b;
                long l2 = ((Network)this.b).getNetworkHandle();
                ((NetworkChangeNotifier)kpb2.l.a).d(l2);
                return;
            }
            case 1: {
                object2 = this.b;
                Object object16 = this.a;
                jon jon2 = jon.a;
                object16 = (juy)object16;
                ((jul)object2).v((juy)object16, jon2);
                return;
            }
            case 0: {
                if (((kpb)((Object)this.a)).h) {
                    this.b.run();
                }
                return;
            }
        }
        try {
            ((kps)((krq)object).a).f(((krq)object).d, (kpv)object2);
        }
        catch (Exception exception) {
            ((krq)object).d.m("onCanceled", exception);
        }
        object = (krq)object;
        ((krq)object).b();
        ((krq)object).d.q.i();
    }
}

