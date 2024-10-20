/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 *  hom
 */
package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import android.util.Base64;
import j$.util.DesugarCollections;
import java.util.concurrent.Executor;

public class ClearcutMetricSnapshotTransmitter
implements dsz {
    public static final gui a = fvd.ap(new bpr(14));
    public volatile caj b;
    public volatile caj c;
    private volatile dtd d;
    private volatile dtl e;
    private final gui f = fvd.ap(new bpr(13));

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Context context, dsy object) {
        int n2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7 = dte.j;
        ((hws)object).h((gpm)object7);
        fxf.r(((hws)object).r.o((hwu)((gpm)object7).a), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = object7 = new dtl();
                }
            }
        }
        object7 = object6 = ((dsy)object).c;
        if (object6 == null) {
            object7 = kfl.a;
        }
        Object object8 = (hwp)((hwv)object7).C(5);
        ((hwp)object8).x((hwv)object7);
        dtl.b(dtl.a, (hye)object8);
        object7 = object6 = ((kfl)((hwp)object8).b).k;
        if (object6 == null) {
            object7 = kde.a;
        }
        if ((((kde)object7).b & 1) != 0) {
            object7 = object6 = ((kfl)((hwp)object8).b).k;
            if (object6 == null) {
                object7 = kde.a;
            }
            object7 = object6 = ((kde)object7).c;
            if (object6 == null) {
                object7 = kdd.a;
            }
            object5 = (hwp)((hwv)object7).C(5);
            ((hwp)object5).x((hwv)object7);
            dtl.b(dtl.b, (hye)object5);
            object7 = object6 = ((kfl)((hwp)object8).b).k;
            if (object6 == null) {
                object7 = kde.a;
            }
            object6 = (hwp)((hwv)object7).C(5);
            ((hwp)object6).x((hwv)object7);
            if (!((hwp)object6).b.B()) {
                ((hwp)object6).u();
            }
            object7 = (kde)((hwp)object6).b;
            object5 = (kdd)((hwp)object5).o();
            object5.getClass();
            ((kde)object7).c = object5;
            ((kde)object7).b |= 1;
            if (!((hwp)object8).b.B()) {
                ((hwp)object8).u();
            }
            object7 = (kfl)((hwp)object8).b;
            object6 = (kde)((hwp)object6).o();
            object6.getClass();
            ((kfl)object7).k = object6;
            ((kfl)object7).b |= 0x100;
        }
        object7 = object6 = ((kfl)((hwp)object8).b).i;
        if (object6 == null) {
            object7 = kez.a;
        }
        if ((((kez)object7).b & 0x100) != 0) {
            object7 = object6 = ((kfl)((hwp)object8).b).i;
            if (object6 == null) {
                object7 = kez.a;
            }
            object7 = object6 = ((kez)object7).i;
            if (object6 == null) {
                object7 = hlo.a;
            }
            object4 = (hwp)((hwv)object7).C(5);
            ((hwp)object4).x((hwv)object7);
            object7 = object6 = ((hlo)((hwp)object4).b).e;
            if (object6 == null) {
                object7 = hll.a;
            }
            object6 = dtl.c((hll)object7);
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object7 = (hlo)((hwp)object4).b;
            object6.getClass();
            ((hlo)object7).e = object6;
            ((hlo)object7).b |= 1;
            object7 = DesugarCollections.unmodifiableList(((hlo)object7).f);
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            ((hlo)((hwp)object4).b).f = hyp.b;
            object5 = object7.iterator();
            while (object5.hasNext()) {
                object7 = dtl.c((hll)object5.next());
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object6 = (hlo)((hwp)object4).b;
                object7.getClass();
                ((hlo)object6).b();
                ((hlo)object6).f.add(object7);
            }
            object7 = (hlo)((hwp)object4).b;
            object7 = ((hlo)object7).c == 4 ? (hlm)((hlo)object7).d : hlm.a;
            object7 = ((hlm)object7).b;
            object3 = hlm.a.l();
            object2 = object7.iterator();
            while (object2.hasNext()) {
                object5 = (hln)object2.next();
                object7 = object6 = ((hln)object5).c;
                if (object6 == null) {
                    object7 = hll.a;
                }
                object6 = object5;
                if ((((hll)object7).b & 2) != 0) {
                    object6 = (hwp)((hwv)object5).C(5);
                    ((hwp)object6).x((hwv)object5);
                    object7 = dtl.c((hll)object7);
                    if (!((hwp)object6).b.B()) {
                        ((hwp)object6).u();
                    }
                    object5 = (hln)((hwp)object6).b;
                    object7.getClass();
                    ((hln)object5).c = object7;
                    ((hln)object5).b |= 1;
                    object6 = (hln)((hwp)object6).o();
                }
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object7 = (hlm)((hwp)object3).b;
                object6.getClass();
                ((hlm)object7).b();
                ((hlm)object7).b.add(object6);
            }
            object6 = (hlm)((hwp)object3).o();
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object7 = (hlo)((hwp)object4).b;
            object6.getClass();
            ((hlo)object7).d = object6;
            ((hlo)object7).c = 4;
            object7 = object6 = ((kfl)((hwp)object8).b).i;
            if (object6 == null) {
                object7 = kez.a;
            }
            object6 = (hwp)((hwv)object7).C(5);
            ((hwp)object6).x((hwv)object7);
            object7 = (hlo)((hwp)object4).o();
            if (!((hwp)object6).b.B()) {
                ((hwp)object6).u();
            }
            object5 = (kez)((hwp)object6).b;
            object7.getClass();
            ((kez)object5).i = object7;
            ((kez)object5).b |= 0x100;
            object7 = (kez)((hwp)object6).o();
            if (!((hwp)object8).b.B()) {
                ((hwp)object8).u();
            }
            object6 = (kfl)((hwp)object8).b;
            object7.getClass();
            ((kfl)object6).i = object7;
            ((kfl)object6).b |= 0x40;
        }
        object7 = object6 = ((kfl)((hwp)object8).b).j;
        if (object6 == null) {
            object7 = kfh.a;
        }
        if (((kfh)object7).k.size() != 0) {
            object7 = object6 = ((kfl)((hwp)object8).b).j;
            if (object6 == null) {
                object7 = kfh.a;
            }
            object6 = (hwp)((hwv)object7).C(5);
            ((hwp)object6).x((hwv)object7);
            for (n2 = 0; n2 < ((kfh)((hwp)object6).b).k.size(); ++n2) {
                object5 = (kfg)((kfh)((hwp)object6).b).k.get(n2);
                object7 = (hwp)((hwv)object5).C(5);
                ((hwp)object7).x((hwv)object5);
                if (!((kfg)((hwp)object7).b).c.isEmpty()) {
                    if (!((hwp)object7).b.B()) {
                        ((hwp)object7).u();
                    }
                    ((kfg)((hwp)object7).b).d = hxw.a;
                    object5 = dtl.a(((kfg)((hwp)object7).b).c);
                    if (!((hwp)object7).b.B()) {
                        ((hwp)object7).u();
                    }
                    object3 = (kfg)((hwp)object7).b;
                    object4 = ((kfg)object3).d;
                    if (!object4.c()) {
                        ((kfg)object3).d = hwv.r((hxe)object4);
                    }
                    hvc.g((Iterable)object5, ((kfg)object3).d);
                }
                if (!((hwp)object7).b.B()) {
                    ((hwp)object7).u();
                }
                object5 = (kfg)((hwp)object7).b;
                ((kfg)object5).b &= 0xFFFFFFFE;
                ((kfg)object5).c = kfg.a.c;
                if (!((hwp)object6).b.B()) {
                    ((hwp)object6).u();
                }
                object5 = (kfh)((hwp)object6).b;
                object4 = (kfg)((hwp)object7).o();
                object4.getClass();
                object7 = ((kfh)object5).k;
                if (!object7.c()) {
                    ((kfh)object5).k = hwv.s((hxk)object7);
                }
                ((kfh)object5).k.set(n2, object4);
            }
            if (!((hwp)object8).b.B()) {
                ((hwp)object8).u();
            }
            object7 = (kfl)((hwp)object8).b;
            object6 = (kfh)((hwp)object6).o();
            object6.getClass();
            ((kfl)object7).j = object6;
            ((kfl)object7).b |= 0x80;
        }
        object7 = object6 = ((kfl)((hwp)object8).b).h;
        if (object6 == null) {
            object7 = kdy.a;
        }
        if (((kdy)object7).b.size() != 0) {
            object7 = object6 = ((kfl)((hwp)object8).b).h;
            if (object6 == null) {
                object7 = kdy.a;
            }
            object6 = (hwp)((hwv)object7).C(5);
            ((hwp)object6).x((hwv)object7);
            for (n2 = 0; n2 < ((kdy)((hwp)object6).b).b.size(); object7 = (kdx)((hwp)object7).o(), ++n2) {
                object5 = (kdx)((kdy)((hwp)object6).b).b.get(n2);
                object7 = (hwp)((hwv)object5).C(5);
                ((hwp)object7).x((hwv)object5);
                if (!((kdx)((hwp)object7).b).u.isEmpty()) {
                    if (!((hwp)object7).b.B()) {
                        ((hwp)object7).u();
                    }
                    ((kdx)((hwp)object7).b).v = hxw.a;
                    object3 = dtl.a(((kdx)((hwp)object7).b).u);
                    if (!((hwp)object7).b.B()) {
                        ((hwp)object7).u();
                    }
                    object4 = (kdx)((hwp)object7).b;
                    object5 = ((kdx)object4).v;
                    if (!object5.c()) {
                        ((kdx)object4).v = hwv.r((hxe)object5);
                    }
                    hvc.g((Iterable)object3, ((kdx)object4).v);
                }
                if (!((hwp)object7).b.B()) {
                    ((hwp)object7).u();
                }
                object5 = (kdx)((hwp)object7).b;
                ((kdx)object5).b &= 0xFFF7FFFF;
                ((kdx)object5).u = kdx.a.u;
                if (!((hwp)object6).b.B()) {
                    ((hwp)object6).u();
                }
                object5 = (kdy)((hwp)object6).b;
                object7.getClass();
                ((kdy)object5).c();
                ((kdy)object5).b.set(n2, object7);
            }
            for (n2 = 0; n2 < ((kdy)((hwp)object6).b).c.size(); ++n2) {
                object5 = (kea)((kdy)((hwp)object6).b).c.get(n2);
                object7 = (hwp)((hwv)object5).C(5);
                ((hwp)object7).x((hwv)object5);
                if (!((kea)((hwp)object7).b).c.isEmpty()) {
                    if (!((hwp)object7).b.B()) {
                        ((hwp)object7).u();
                    }
                    ((kea)((hwp)object7).b).d = hxw.a;
                    object5 = dtl.a(((kea)((hwp)object7).b).c);
                    if (!((hwp)object7).b.B()) {
                        ((hwp)object7).u();
                    }
                    object4 = (kea)((hwp)object7).b;
                    object3 = ((kea)object4).d;
                    if (!object3.c()) {
                        ((kea)object4).d = hwv.r((hxe)object3);
                    }
                    hvc.g((Iterable)object5, ((kea)object4).d);
                }
                if (!((hwp)object7).b.B()) {
                    ((hwp)object7).u();
                }
                object5 = (kea)((hwp)object7).b;
                ((kea)object5).b &= 0xFFFFFFFE;
                ((kea)object5).c = kea.a.c;
                if (!((hwp)object6).b.B()) {
                    ((hwp)object6).u();
                }
                object5 = (kdy)((hwp)object6).b;
                object7 = (kea)((hwp)object7).o();
                object7.getClass();
                object4 = ((kdy)object5).c;
                if (!object4.c()) {
                    ((kdy)object5).c = hwv.s((hxk)object4);
                }
                ((kdy)object5).c.set(n2, object7);
            }
            if (!((hwp)object8).b.B()) {
                ((hwp)object8).u();
            }
            object7 = (kfl)((hwp)object8).b;
            object6 = (kdy)((hwp)object6).o();
            object6.getClass();
            ((kfl)object7).h = object6;
            ((kfl)object7).b |= 0x20;
        }
        object7 = object6 = ((kfl)((hwp)object8).b).m;
        if (object6 == null) {
            object7 = keb.a;
        }
        if (((keb)object7).e.size() != 0) {
            object7 = object6 = ((kfl)((hwp)object8).b).m;
            if (object6 == null) {
                object7 = keb.a;
            }
            object6 = (hwp)((hwv)object7).C(5);
            ((hwp)object6).x((hwv)object7);
            for (n2 = 0; n2 < ((keb)((hwp)object6).b).e.size(); object5 = (kec)((hwp)object5).o(), ++n2) {
                object7 = (kec)((keb)((hwp)object6).b).e.get(n2);
                object5 = (hwp)((hwv)object7).C(5);
                ((hwp)object5).x((hwv)object7);
                object5 = (hwr)object5;
                dtl.b(dtl.c, (hye)object5);
                if (!((hwp)object6).b.B()) {
                    ((hwp)object6).u();
                }
                object7 = (keb)((hwp)object6).b;
                object5.getClass();
                ((keb)object7).c();
                ((keb)object7).e.set(n2, object5);
            }
            if (!((hwp)object8).b.B()) {
                ((hwp)object8).u();
            }
            object7 = (kfl)((hwp)object8).b;
            object6 = (keb)((hwp)object6).o();
            object6.getClass();
            ((kfl)object7).m = object6;
            ((kfl)object7).b |= 0x800;
        }
        object5 = (kfl)((hwp)object8).o();
        if (((heg)dkc.a.e()).M()) {
            n2 = ((kfl)object5).b;
            object7 = (0x800000 & n2) == 0 ? null : "primes stats";
            if ((n2 & 0x20) != 0) {
                object7 = "network metric";
            }
            if ((n2 & 0x10) != 0) {
                object7 = "timer metric";
            }
            if ((n2 & 8) != 0) {
                object7 = "memory metric";
            }
            if ((n2 & 0x100) != 0) {
                object7 = "battery metric";
            }
            if ((n2 & 0x40) != 0) {
                object7 = "crash metric";
            }
            if ((n2 & 0x400) != 0) {
                object7 = "jank metric";
            }
            if ((n2 & 0x80) != 0) {
                object7 = "package metric";
            }
            if ((n2 & 0x800) != 0) {
                object7 = "trace";
            }
            object8 = (heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "logSystemHealthMetric", 219, "ClearcutMetricSnapshotTransmitter.java");
            object6 = object7;
            if (object7 == null) {
                object6 = "unknown";
            }
            object8.C("Sending Primes %s: %s", object6, object5);
        }
        if (((Boolean)this.f.a()).booleanValue()) {
            return hpj.a;
        }
        object7 = dte.j;
        ((hws)object).h((gpm)object7);
        object = ((hws)object).r.l((hwu)((gpm)object7).a);
        object = object == null ? ((gpm)object7).d : ((gpm)object7).k(object);
        object8 = (dte)object;
        if (((heg)dkc.a.e()).M()) {
            ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "transmit", 119, "ClearcutMetricSnapshotTransmitter.java")).u("%s", Base64.encodeToString((byte[])((hvd)object5).g(), (int)2));
        }
        boolean bl2 = ((dte)object8).i;
        n2 = (((kfl)object5).b & 0x40) != 0 ? 1 : 0;
        object7 = object = this.d;
        if (object == null) {
            synchronized (this) {
                object = object7 = this.d;
                if (object7 == null) {
                    this.d = object = new dtd();
                }
            }
            object7 = object;
        }
        if (!bl2) {
            object = hhk.K(true);
            return hno.g((hpn)object, new dth(this, context, (kfl)object5, (dte)object8), (Executor)hom.a);
        }
        object = (Boolean)((dtd)object7).a.get();
        if (object != null) {
            object = hhk.K(object);
            return hno.g((hpn)object, new dth(this, context, (kfl)object5, (dte)object8), (Executor)hom.a);
        }
        object = object6 = ((dtd)object7).c;
        if (object6 == null) {
            synchronized (object7) {
                object = object6 = ((dtd)object7).c;
                if (object6 == null) {
                    object6 = new clp();
                    ((dtd)object7).c = object = new ccs(context, clq.a, (cco)object6, ccr.a);
                }
            }
        }
        if (n2 == 0 && !((dtd)object7).b.getAndSet(true)) {
            object6 = kl.ay(new dtc((dtd)object7), ((ccs)object).f, clr.class.getSimpleName());
            object3 = new cli(object, object6, (Object)((clp)((ccs)object).d).b, 0);
            object4 = new cgn(object, 6);
            object2 = new cen();
            ((cen)object2).a = object3;
            ((cen)object2).b = object4;
            ((cen)object2).c = object6;
            ((cen)object2).d = new cbm[]{clh.a};
            ((cen)object2).f = 4507;
            ((ccs)object).h(((cen)object2).a());
        }
        object6 = new cer();
        ((cer)object6).a = new cip(4);
        ((cer)object6).c = 4501;
        object = hmv.f(hno.f(hph.q(crh.a(((ccs)object).d(((cer)object6).a()))), gqk.b(new cym(object7, 14)), (Executor)hom.a), Throwable.class, new dti(1), (Executor)hom.a);
        return hno.g((hpn)object, new dth(this, context, (kfl)object5, (dte)object8), (Executor)hom.a);
    }
}

