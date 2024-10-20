/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class gqa {
    public static final hei a = hei.m("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final hpr b;
    public final ConcurrentMap c;
    public final gto d;
    public final AtomicLong e;
    public final int f;
    public final int g;
    private final gob h;
    private final jnu i;
    private final gnp j;

    public gqa(gob object, hpr hpr2, jnu jnu2, gto gto2, gnp gnp2, Map map, Map map2, gto gto3, gto gto4) {
        boolean bl2;
        boolean bl3 = true;
        this.c = new ConcurrentHashMap(2, 0.75f, 1);
        this.h = object;
        this.b = hpr2;
        this.i = jnu2;
        object = (fxf)gto2.e(new fxf());
        this.j = gnp2;
        if (((Boolean)gto4.e(false)).booleanValue()) {
            gno.c = true;
        }
        if (!map.isEmpty()) {
            bl2 = map.size() == 1;
            fxf.r(bl2, "Please only specify the max number of spans once.");
            this.f = ((gnv)fvd.Q(map.keySet())).a();
        } else {
            this.f = 500;
        }
        this.d = gto3;
        if (!map2.isEmpty()) {
            bl2 = map2.size() == 1 ? bl3 : false;
            fxf.r(bl2, "Please only specify the trace deadline limit once.");
            this.g = ((gpo)fvd.Q(map2.keySet())).a();
        } else {
            this.g = 900000;
        }
        this.e = new AtomicLong(this.g);
    }

    public static final void d(gpc object, String string) {
        if (object != null && object != goj.a && !(object instanceof goc) && gmy.a != gmx.a) {
            if (object instanceof gnd) {
                String string2;
                String string3 = string2 = gno.j((gpc)object);
                if (!"".equals(string2)) {
                    string3 = ": ".concat(String.valueOf(string2));
                }
                object = new gmz(string3, string, ((gnd)object).g());
            } else {
                object = new gmz(string);
            }
            ((Throwable)object).addSuppressed(gqq.c());
            if (gmy.a == gmx.c) {
                a.as(gpx.a.g().h(hfo.a, "TraceManager"), "Duplicate trace", "com/google/apps/tiktok/tracing/TraceManager", "reportDuplicateTraceException", 'j', "TraceManager.java", (Throwable)object);
                return;
            }
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(gqm gqm2, SparseArray sparseArray, String object) {
        goz goz2 = gno.a();
        gpc gpc2 = goz2.c;
        Object object2 = goo.a;
        gno.w(new gny((String)object, gny.a, (gop)object2, goz2));
        try {
            Iterator iterator = ((imj)this.i).a().iterator();
            object = null;
            while (iterator.hasNext()) {
                object2 = (gpw)iterator.next();
                try {
                    object2.a(gqm2, sparseArray);
                }
                catch (RuntimeException runtimeException) {
                    if (object != null) {
                        ((Throwable)object).addSuppressed(runtimeException);
                        continue;
                    }
                    object = runtimeException;
                }
            }
            if (object == null) {
                return;
            }
            throw object;
        }
        finally {
            gno.f(goz2, gpc2);
        }
    }

    public final gpc c(String object, gop object2, long l2, long l3, int n2, gql object3) {
        UUID uUID = this.j.b();
        uUID.getLeastSignificantBits();
        Object object4 = gqm.a.l();
        long l4 = uUID.getLeastSignificantBits();
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        Object object5 = (gqm)((hwp)object4).b;
        ((gqm)object5).b |= 2;
        ((gqm)object5).d = l4;
        l4 = uUID.getMostSignificantBits();
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        object5 = ((hwp)object4).b;
        hwv hwv2 = object5;
        ((gqm)hwv2).b |= 1;
        ((gqm)hwv2).c = l4;
        if (!((hwv)object5).B()) {
            ((hwp)object4).u();
        }
        hwv2 = ((hwp)object4).b;
        object5 = (gqm)hwv2;
        ((gqm)object5).b |= 4;
        ((gqm)object5).f = l2;
        l2 = l3 / 1000000L;
        if (!hwv2.B()) {
            ((hwp)object4).u();
        }
        object5 = ((hwp)object4).b;
        hwv2 = (gqm)object5;
        ((gqm)hwv2).b |= 8;
        ((gqm)hwv2).g = l2;
        if (!((hwv)object5).B()) {
            ((hwp)object4).u();
        }
        object5 = (gqm)((hwp)object4).b;
        ((gqm)object5).j = ((gql)object3).d;
        ((gqm)object5).b |= 0x40;
        object5 = (gqm)((hwp)object4).o();
        if (object3 != gql.b) {
            l3 = cgw.q().toMillis() * 1000000L;
        }
        object4 = new gra((String)object, (gop)object2, n2);
        boolean bl2 = object3 == gql.c;
        object2 = new grb(this, uUID, (gqm)object5, (gra)object4, l3, false, bl2);
        object = gno.a();
        object3 = new goe((gra)object4, (grb)object2, (goz)object);
        object4 = this.h;
        if (((gob)object4).d.compareAndSet(false, true)) {
            ((gob)object4).c.execute(new gjf(object4, 7, null));
        }
        object4 = new goa(object3, ((gob)object4).b);
        gob.a.put(object4, Boolean.TRUE);
        object4 = ((goa)object4).a;
        object5 = this.b;
        ((grb)object2).f = object4;
        object4.c((Runnable)object2, (Executor)object5);
        this.c.put(uUID, object2);
        gno.f((goz)object, (gpc)object3);
        return object3;
    }

    public final gof e(String object, gop gop2, gql gql2) {
        gpc gpc2 = gno.b();
        gqa.d(gpc2, (String)object);
        object = this.c((String)object, gop2, cgw.p().toEpochMilli(), cgw.o(), 1, gql2);
        if (gpc2 == ((goe)object).b) {
            return object;
        }
        return new gpy((gpc)object, gpc2, 1);
    }
}

