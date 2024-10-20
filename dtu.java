/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.os.Process
 *  android.os.SystemClock
 *  hom
 */
import android.content.Context;
import android.database.ContentObserver;
import android.os.Process;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class dtu {
    public static dtu a;
    public final Object b;
    public final Object c;

    public dtu() {
        this.c = null;
        this.b = null;
    }

    public dtu(Context context) {
        this.c = context;
        dtt dtt2 = new dtt();
        this.b = dtt2;
        context.getContentResolver().registerContentObserver(cmc.a, true, (ContentObserver)dtt2);
    }

    public dtu(Context context, Map map) {
        this.c = context;
        this.b = map.keySet();
    }

    public dtu(bmu bmu2, bzq bzq2) {
        this.b = bmu2;
        this.c = bzq2;
    }

    public dtu(cgw cgw2) {
        jse.e(cgw2, "clock");
        this.b = new Random();
        this.c = new AtomicLong(((long)Process.myPid() << 40) + SystemClock.elapsedRealtime());
    }

    public dtu(dpq dpq2, dtu dtu2) {
        this.b = dpq2;
        this.c = dtu2;
    }

    public dtu(jnu jnu2, jnu jnu3) {
        jnu2.getClass();
        this.c = jnu2;
        jnu3.getClass();
        this.b = jnu3;
    }

    public dtu(jnu jnu2, jnu jnu3, byte[] byArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.c = jnu3;
    }

    public dtu(jvb jvb2) {
        this.c = jvb2;
        this.b = new cxt(null, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void a() {
        synchronized (dtu.class) {
            Object object;
            dtu dtu2 = a;
            if (dtu2 != null && (object = dtu2.c) != null && dtu2.b != null) {
                ((Context)object).getContentResolver().unregisterContentObserver((ContentObserver)dtu.a.b);
            }
            a = null;
            return;
        }
    }

    public static /* synthetic */ ewq g(dtu object, eae eae2) {
        jpa jpa2 = jpa.a;
        jse.e(eae2, "params");
        object = eae2.m ? ((dtu)object).e(eae2, gsl.a, jpa2) : ((dtu)object).d(eae2, jpa2);
        return object;
    }

    public final boolean b() {
        if (!dww.b()) {
            return false;
        }
        String string = dww.a((Context)this.c);
        if (string == null) {
            return true;
        }
        int n2 = this.b.size();
        if (n2 != 0) {
            if (n2 == 1) {
                String string2 = ((dwx)fvd.Q((Iterable)this.b)).a();
                fxf.v(string2.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", string2);
                return string.equals(String.valueOf(((Context)this.c).getPackageName()).concat(String.valueOf(string2)));
            }
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        return string.equals(((Context)this.c).getPackageName());
    }

    public final eev c(eae eae2) {
        eae2.getClass();
        ((cgw)this.c.b()).getClass();
        Executor executor = (Executor)this.b.b();
        executor.getClass();
        return new eev(eae2, executor);
    }

    public final edv d(eae eae2, List list) {
        jse.e(eae2, "params");
        jse.e(list, "audioBufferProcessors");
        int n2 = ekn.b(eae2);
        jse.e(list, "audioBufferProcessors");
        list.getClass();
        return new edv(n2, list, ((end)((bzq)this.c).a).a());
    }

    public final eeb e(eae eae2, gto gto2, List list) {
        jse.e(eae2, "params");
        jse.e(gto2, "timestampProviderOptional");
        jse.e(list, "audioBufferProcessors");
        int n2 = ewj.d(eae2);
        int n3 = ekn.b(eae2);
        n3 = n3 % n2 == 0 ? (n3 /= n2) : n3 / n2 + 1;
        jse.e(eae2, "params");
        jse.e(gto2, "timestampProviderOptional");
        jse.e(list, "audioBufferProcessors");
        Object object = this.b;
        eae2.getClass();
        gto2.getClass();
        list.getClass();
        object = (bmu)object;
        Executor executor = (Executor)((bmu)object).b.b();
        executor.getClass();
        return new eeb(eae2, n3, n2, gto2, list, executor, ((end)((bmu)object).c).a(), (bzq)((bmu)object).a.b());
    }

    public final int h() {
        return ((Random)this.b).nextInt(Integer.MAX_VALUE);
    }

    public final long i() {
        return ((AtomicLong)this.c).incrementAndGet();
    }

    public final hpn j(jro object) {
        ctz ctz2 = new ctz(this, object, 19, null);
        object = this.b;
        hom hom2 = hom.a;
        object = ((cxt)object).F(ctz2, (Executor)hom2);
        jse.d(object, "submitAsync(...)");
        return object;
    }

    public final void k(jro jro2) {
        ctz ctz2 = new ctz(this, jro2, 18, null);
        Object object = this.b;
        jro2 = hom.a;
        jse.d(((cxt)object).F(ctz2, (Executor)((Object)jro2)), "submitAsync(...)");
    }

    public final egw l(eae object, gto object2, List object3) {
        int n2 = ewj.d((eae)object);
        if (((eae)object).m) {
            Object object4 = this.b;
            object = gto.i(((dtu)this.c).e((eae)object, (gto)object2, (List)object3));
            object3 = (dpq)object4;
            object2 = ((end)((dpq)object3).a).a();
            object3 = (Executor)((dpq)object3).b.b();
            object3.getClass();
            return new egw(n2, (gto)object, gsl.a, (czh)object2, (Executor)object3);
        }
        Object object5 = this.b;
        Object object6 = this.c;
        object2 = gsl.a;
        object = gto.i(((dtu)object6).d((eae)object, (List)object3));
        return ((dpq)object5).b(n2, (gto)object2, (gto)object);
    }
}

