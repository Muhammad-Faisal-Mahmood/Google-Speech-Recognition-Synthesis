/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import j$.util.Collection$_EL;
import j$.util.Map$_EL;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class cmn {
    public static final hei a = hei.m("com/google/android/libraries/assistant/soda/ConcurrentSodaManager");
    public final Context b;
    public final hpq c;
    public final hpr d;
    public final Optional e;
    public final Optional f;
    public final int g;
    public final Object h = new Object();
    public final Map i = new HashMap();
    public final Map j = new ConcurrentHashMap();
    public final Map k = new ConcurrentHashMap();
    long l;
    hpp m;
    String n = "";
    cmt o;
    final Optional p;
    private final Optional q;

    public cmn(Context context, hpq hpq2, hpr hpr2, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        cne.a(context);
        this.b = context;
        this.c = hpq2;
        this.d = hpr2;
        this.q = optional;
        this.e = optional2;
        this.f = optional3;
        this.m = null;
        optional.isPresent();
        this.g = ((feh)optional.get()).n;
        this.p = optional4;
    }

    public static boolean g(iez hwv2) {
        int n2;
        idt idt2 = hwv2.i;
        hwv2 = idt2;
        if (idt2 == null) {
            hwv2 = idt.a;
        }
        return (n2 = a.F(((idt)hwv2).d)) != 0 && n2 == 6;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "getSodaCount", 235, "ConcurrentSodaManager.java")).r("#getSodaCount");
        Object object = this.h;
        synchronized (object) {
            Stream stream = Collection$_EL.stream(this.i.values());
            cmm cmm2 = new cmm();
            return stream.mapToInt(cmm2).sum();
        }
    }

    public final long b() {
        hpp hpp2 = this.m;
        if (hpp2 != null) {
            return 3600000L - hpp2.getDelay(TimeUnit.MILLISECONDS);
        }
        return -1L;
    }

    public final cnd c(String object, cmt cmt2) {
        if (this.i.containsKey(object) && (object = (Map)this.i.get(object)).containsKey(cmt2)) {
            return (cnd)object.get(cmt2);
        }
        return null;
    }

    public final void d() {
        hpp hpp2 = this.m;
        if (hpp2 != null) {
            hpp2.cancel(false);
            this.m = null;
        }
    }

    public final void e(cnd object, boolean bl2) {
        object.j();
        long l2 = object.a();
        if (l2 != 0L) {
            this.l = l2;
            object = hwg.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            ((hwg)((hwp)object).b).b = 3600L;
            hwg hwg2 = (hwg)((hwp)object).o();
            l2 = this.l;
            if (l2 != 0L) {
                object = this.m;
                if (object != null) {
                    object.cancel(false);
                }
                this.m = this.d.b(new cmk(this, hwg2, l2), hwg2.b, TimeUnit.SECONDS);
            }
            if (bl2 && this.e.isPresent()) {
                ((cmo)this.e.get()).a();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(String string, cmt cmt2) {
        Object object = a;
        ((heg)((heg)((hdz)object).f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "disconnect", 204, "ConcurrentSodaManager.java")).r("#disconnect");
        Object object2 = this.h;
        synchronized (object2) {
            cnd cnd2 = this.c(string, cmt2);
            if (cnd2 != null && cnd2.p()) {
                ((heg)((heg)((hdz)object).h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "disconnect", 209, "ConcurrentSodaManager.java")).r("Deleting SODA");
                this.e(cnd2, true);
            }
            if (this.i.containsKey(string)) {
                object = (Map)this.i.get(string);
                object.remove(cmt2);
                if (object.isEmpty()) {
                    this.i.remove(string);
                }
            } else {
                ((heg)((heg)((hdz)object).h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "disconnect", 221, "ConcurrentSodaManager.java")).r("SODA not found");
            }
            if (cmt2 == this.o) {
                this.o = null;
                this.n = "";
            }
            return;
        }
    }

    public final boolean h(boolean bl2, String string) {
        if (!bl2) {
            return false;
        }
        if (this.q.isEmpty()) {
            return false;
        }
        bl2 = new hxd(((fey)Map$_EL.getOrDefault((Map)((feh)this.q.get()).l, (Object)string, (Object)fey.b)).c, fey.a).contains(ffb.c);
        if (!bl2) {
            ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "isPerAppConcurrencyEnabled", 771, "ConcurrentSodaManager.java")).u("Per app concurrency is not enabled for %s", string);
        }
        return bl2;
    }
}

