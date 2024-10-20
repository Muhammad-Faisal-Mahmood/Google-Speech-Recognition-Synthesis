/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager$WakeLock
 */
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class bcn
implements bfz {
    public static final String a = bbi.b("Processor");
    public PowerManager.WakeLock b;
    public final Context c;
    public final WorkDatabase d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Set h;
    public final List i;
    public final Object j;
    private final bam k;
    private final czh l;

    public bcn(Context context, bam bam2, czh czh2, WorkDatabase workDatabase) {
        this.c = context;
        this.k = bam2;
        this.l = czh2;
        this.d = workDatabase;
        this.f = new HashMap();
        this.e = new HashMap();
        this.h = new HashSet();
        this.i = new ArrayList();
        this.b = null;
        this.j = new Object();
        this.g = new HashMap();
    }

    public static void f(dhl dhl2, int n2) {
        if (dhl2 != null) {
            bdp bdp2 = new bdp(n2);
            ((jwp)dhl2.h).r(bdp2);
            bbi.a();
            return;
        }
        bbi.a();
    }

    private final void h(bgs object) {
        object = new aks(this, object, 6);
        this.l.c.execute((Runnable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(bcc bcc2) {
        Object object = this.j;
        synchronized (object) {
            this.i.add(bcc2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(bcc bcc2) {
        Object object = this.j;
        synchronized (object) {
            this.i.remove(bcc2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c(String string) {
        Object object = this.j;
        synchronized (object) {
            if (this.e(string) == null) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dhl d(String object) {
        dhl dhl2 = (dhl)this.e.remove(object);
        boolean bl2 = dhl2 != null;
        if (!bl2) {
            dhl2 = (dhl)this.f.remove(object);
        }
        this.g.remove(object);
        if (!bl2) return dhl2;
        object = this.j;
        synchronized (object) {
            if (this.e.isEmpty()) {
                Context context = this.c;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.c.startService(intent);
                }
                catch (Throwable throwable) {
                    bbi.a().d(a, "Unable to stop foreground service", throwable);
                }
                context = this.b;
                if (context == null) return dhl2;
                context.release();
                this.b = null;
            }
            return dhl2;
        }
    }

    public final dhl e(String string) {
        dhl dhl2 = (dhl)this.e.get(string);
        if (dhl2 == null) {
            return (dhl)this.f.get(string);
        }
        return dhl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean g(bzb object) {
        Object object2 = ((bzb)object).a;
        Object object3 = (bgs)object2;
        Object object4 = ((bgs)object3).a;
        HashSet<Object> hashSet = new ArrayList();
        Object object5 = new cmq(this, hashSet, object4, 1);
        if ((object5 = (bhd)this.d.e((Callable)object5)) == null) {
            object4 = bbi.a();
            object = a;
            Objects.toString(object2);
            ((bbi)object4).f((String)object, "Didn't find WorkSpec for id ".concat(String.valueOf(object2)));
            this.h((bgs)object3);
            return false;
        }
        object3 = this.j;
        synchronized (object3) {
            if (this.c((String)object4)) {
                object4 = (Set)this.g.get(object4);
                if (((bgs)((bzb)object4.iterator().next()).a).b == ((bgs)object2).b) {
                    object4.add(object);
                    bbi.a();
                    Objects.toString(object2);
                } else {
                    this.h((bgs)object2);
                }
                return false;
            }
            if (((bhd)object5).u != ((bgs)object2).b) {
                this.h((bgs)object2);
                return false;
            }
            Object object6 = new gcv(this.c, this.k, this.l, this, this.d, (bhd)object5, (List)((Object)hashSet));
            hashSet = new HashSet<Object>((gcv)object6);
            object5 = ((czh)((dhl)((Object)hashSet)).j).d;
            object6 = new jwk();
            object5 = ((jpw)object5).plus((jqf)object6);
            object6 = new aus((dhl)((Object)hashSet), null, 5, null);
            object5 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.b((jqf)object5, (jro)object6);
            object6 = new ai((Object)this, object5, (Object)hashSet, 6, null);
            object5.c((Runnable)object6, (Executor)this.l.c);
            this.f.put(object4, hashSet);
            hashSet = new HashSet<Object>();
            hashSet.add(object);
            this.g.put(object4, hashSet);
        }
        bbi.a();
        this.getClass().getSimpleName();
        Objects.toString(object2);
        return true;
    }
}

