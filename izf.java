/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public final class izf
implements jej,
izv {
    public static final Logger a = Logger.getLogger(izf.class.getName());
    public final iyp b;
    public final izw c;
    private final jgp d;
    private final jgp e;
    private final gzx f;
    private final iyu g;
    private jjd h;
    private ScheduledExecutorService i;
    private Executor j;
    private boolean k;
    private final AmbientModeSupport$AmbientController l;

    public izf(izd izd2) {
        Object object = izd2.a;
        fxf.K(object);
        this.b = object;
        object = izd2.c;
        fxf.K(object);
        this.e = object;
        this.d = izd2.d;
        object = izd2.b;
        a.s(object, "streamTracerFactories");
        this.f = gzx.o((Collection)object);
        object = izd2.f;
        Objects.requireNonNull(object);
        this.l = new AmbientModeSupport$AmbientController(object, null);
        this.g = izd2.e;
        this.c = new izw(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(int n2, Parcel object) {
        synchronized (this) {
            if (n2 == 1) {
                Object object2;
                if (this.k) {
                    ize.a.a(1, (Parcel)object);
                    return false;
                }
                if (object.readInt() > 0 && (object2 = object.readStrongBinder()) != null) {
                    n2 = Binder.getCallingUid();
                    object = its.a;
                    Object object3 = new kpy(its.a);
                    object = this.b;
                    ((kpy)object3).b(ivd.b, object);
                    object = ivd.a;
                    Object object4 = new izo(n2);
                    ((kpy)object3).b((itr)object, object4);
                    ((kpy)object3).b(izi.f, n2);
                    object = this.b;
                    ((kpy)object3).b(izi.g, ((iyp)object).c());
                    object = this.g;
                    ((kpy)object3).b(izi.h, object);
                    Object object5 = this.l;
                    object4 = this.j;
                    a.s(object4, "Not started?");
                    Object object6 = izl.a;
                    object = new izk(n2, (AmbientModeSupport$AmbientController)object5, (Executor)object4);
                    ((kpy)object3).b((itr)object6, object);
                    ((kpy)object3).b(jdx.a, (Object)ixv.c);
                    object4 = this.d;
                    object3 = ((kpy)object3).a();
                    object6 = this.f;
                    object5 = jad.a;
                    object = new izh((jgp)object4, (its)object3, (List)object6, (IBinder)object2);
                    object2 = this.h;
                    synchronized (object2) {
                        fxf.B(((iyz)object2).b ^ true, "Illegal transportCreated() after serverShutdown()");
                        n2 = ((iyz)object2).c;
                        ((iyz)object2).c = n2 + 1;
                    }
                    object4 = ((iyz)object2).a;
                    object3 = ((jiw)object4).a.l;
                    synchronized (object3) {
                        ((jiw)object4).a.n.add(object);
                    }
                    object4 = ((jiw)object4).a;
                    object3 = new jiz((jja)object4, (izh)object);
                    long l2 = ((jiz)object3).b.i;
                    if (l2 != Long.MAX_VALUE) {
                        object4 = ((jiz)object3).c;
                        object6 = new jhz(object3, 5);
                        ((jiz)object3).a = ((izi)object4).i.schedule((Runnable)object6, l2, TimeUnit.MILLISECONDS);
                    } else {
                        object4 = new gni(8);
                        object6 = new FutureTask((Runnable)object4, null);
                        ((jiz)object3).a = object6;
                    }
                    object4 = ((jiz)object3).b;
                    object6 = ((jiz)object3).c;
                    l2 = ivk.a((ivs)object4);
                    ivk.b((ivj)((jja)object4).q.g.get(l2), (ivm)object6);
                    object4 = new iyy((iyz)object2, (jjg)object3);
                    ((izh)object).e((jjg)object4);
                    return true;
                }
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            this.e.b(this.j);
            this.j = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void c() {
        // MONITORENTER : this
        if (this.k) {
            // MONITOREXIT : this
            return;
        }
        this.k = true;
        this.c.a = ize.a;
        jjd jjd2 = this.h;
        Object object = ((iyz)jjd2).a;
        Object object2 = ((jiw)object).a.l;
        // MONITORENTER : object2
        Object object3 = ((jiw)object).a;
        if (((jja)object3).k) {
            // MONITOREXIT : object2
        } else {
            Object object4 = new ArrayList(((jja)object3).n);
            jja jja2 = ((jiw)object).a;
            object3 = jja2.j;
            jja2.k = true;
            // MONITOREXIT : object2
            int n2 = object4.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = (izh)object4.get(i2);
                if (object3 == null) {
                    ((izh)object2).f();
                    continue;
                }
                ((izh)object2).k((iyh)object3);
            }
            object4 = ((jiw)object).a.l;
            // MONITORENTER : object4
            object = ((jiw)object).a;
            ((jja)object).m = true;
            ((jja)object).d();
            // MONITOREXIT : object4
        }
        // MONITORENTER : jjd2
        ((iyz)jjd2).b = true;
        object = ((iyz)jjd2).a();
        // MONITOREXIT : jjd2
        if (object != null) {
            object.run();
        }
        this.d.b(this.i);
        this.i = null;
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(jjd jjd2) {
        synchronized (this) {
            iuk iuk2 = new iuk(this, 2, null);
            iyz iyz2 = new iyz(jjd2, iuk2);
            this.h = iyz2;
            this.i = (ScheduledExecutorService)this.d.a();
            this.j = this.e.a();
            return;
        }
    }

    public final String toString() {
        String string = ((Object)this.b).toString();
        StringBuilder stringBuilder = new StringBuilder("BinderServer[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

