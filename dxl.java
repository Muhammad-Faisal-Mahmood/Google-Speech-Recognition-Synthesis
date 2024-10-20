/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  gqv
 */
import android.os.Process;
import j$.time.Duration;
import java.util.Collection;
import java.util.HashSet;

public final class dxl
implements hny {
    public final dxm a;
    public final dyk b;
    public final long c;

    public /* synthetic */ dxl(dxm dxm2, dyk dyk2, long l2) {
        this.a = dxm2;
        this.b = dyk2;
        this.c = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        Object object22;
        long l2;
        int n2;
        int n3;
        Cloneable cloneable;
        Object object3 = this.b;
        object = (iat)object;
        object3 = object3.j();
        if (!((hwv)object).equals(iat.a)) {
            ((dyj)object3).u(iaw.b, object);
        }
        dxm dxm2 = this.a;
        if (dxm2.h.a && dxm2.e.c) {
            if (!((dyj)object3).i.g()) {
                object = gqv.a;
                fxf.K(object);
                cloneable = gno.b();
                if (fxf.ax((gpc)((Object)cloneable))) {
                    fxf.K(object);
                    object = new gpu(cloneable.d(), ((goe)((Object)cloneable)).f());
                } else {
                    object = null;
                }
                ((dyj)object3).i = gto.h(object);
            }
            object = ((gom)(object = fxf.az(dyw.a))).b() ? (dyy)((gom)object).a() : dyy.a;
            object = hav.n(((dyy)object).b).k();
            if (object.hasNext()) {
                object = (dyx)object.next();
                throw null;
            }
            object = fxf.az(dza.a);
            object = ((gom)object).b() ? gto.i((dyz)((gom)object).a()) : gsl.a;
            if (((gto)object).g() && !((dyj)object3).f.g() && !((dyj)object3).g.g()) {
                n3 = ((dyz)((gto)object).c()).b;
                n3 = n3 != 0 ? (n3 != 1 ? (n3 != 2 ? 0 : 2) : 1) : 3;
                n2 = n3 - 1;
                if (n3 == 0) {
                    throw null;
                }
                if (n2 != 0) {
                    if (n2 == 1) {
                        object = (dyz)((gto)object).c();
                        l2 = ((dyz)object).b == 2 ? (Long)((dyz)object).c : 0L;
                        ((dyj)object3).f = gto.i(l2);
                        ((dyj)object3).g = gsl.a;
                    }
                } else {
                    object = (dyz)((gto)object).c();
                    object = ((dyz)object).b == 1 ? (String)((dyz)object).c : "";
                    ((dyj)object3).g = gto.i(object);
                    ((dyj)object3).f = gsl.a;
                }
            }
        }
        l2 = this.c;
        if (((dyj)object3).j.g() && ((Duration)((dyj)object3).j.e(Duration.ZERO)).toNanos() > l2) {
            if (dxm2.h.b) {
                throw new IllegalArgumentException("Timestamp of the event being logged is in the future. If this is happening in test, advance the test clock so that the event timestamp would be in the past.");
            }
            ((dyj)object3).t(l2);
        }
        object = new dyl(null);
        ((dyl)object).a = dym.a.getAndIncrement();
        ((dyl)object).h = (byte)(((dyl)object).h | 1);
        ((dyl)object).f = hcy.a;
        ((dyl)object).a(hdc.a);
        cloneable = (bor)((dyj)object3).k.o();
        cloneable = bor.a.m((hwv)((Object)cloneable));
        Object object4 = new gzy();
        for (Object object22 : ((dyj)object3).b.entrySet()) {
            ((gzy)object4).d((String)object22.getKey(), hav.n((Collection)object22.getValue()));
        }
        ((dyl)object).f = ((gzy)object4).a();
        ((dyl)object).e = ((dyj)object3).a;
        ((dyl)object).a(((dyj)object3).c);
        object22 = bou.a.l();
        Object object5 = bot.a.l();
        n3 = ((dyj)object3).a.a();
        if (!((hwp)object5).b.B()) {
            ((hwp)object5).u();
        }
        object4 = (bot)((hwp)object5).b;
        ((bot)object4).b |= 2;
        ((bot)object4).d = n3;
        if (!((hwp)object22).b.B()) {
            ((hwp)object22).u();
        }
        object4 = (bou)((hwp)object22).b;
        object5 = (bot)((hwp)object5).o();
        object5.getClass();
        ((bou)object4).f = object5;
        ((bou)object4).b |= 8;
        if (!((hwp)object22).b.B()) {
            ((hwp)object22).u();
        }
        object5 = (bou)((hwp)object22).b;
        ((bou)object5).e = 1;
        ((bou)object5).b |= 1;
        if (((dyj)object3).f.g()) {
            object5 = (Long)((dyj)object3).f.c();
            ((Long)object5).longValue();
            if (!((hwp)object22).b.B()) {
                ((hwp)object22).u();
            }
            object4 = (bou)((hwp)object22).b;
            ((bou)object4).c = 4;
            ((bou)object4).d = object5;
        }
        if (((dyj)object3).g.g()) {
            object5 = ((dyj)object3).g.c();
            if (!((hwp)object22).b.B()) {
                ((hwp)object22).u();
            }
            object4 = (bou)((hwp)object22).b;
            ((bou)object4).c = 5;
            ((bou)object4).d = object5;
        }
        if (!((hwp)cloneable).b.B()) {
            ((hwp)cloneable).u();
        }
        object5 = (bor)((hwp)cloneable).b;
        object22 = (bou)((hwp)object22).o();
        object22.getClass();
        ((bor)object5).c = object22;
        ((bor)object5).b |= 1;
        if (((dyj)object3).d.g()) {
            object22 = ibj.a.l();
            n3 = (Integer)((dyj)object3).d.c();
            if (!((hwp)object22).b.B()) {
                ((hwp)object22).u();
            }
            object5 = (ibj)((hwp)object22).b;
            ((ibj)object5).b |= 1;
            ((ibj)object5).c = n3;
            if (((dyj)object3).e.g()) {
                object4 = ((dyj)object3).e.c();
                if (!((hwp)object22).b.B()) {
                    ((hwp)object22).u();
                }
                object5 = (ibj)((hwp)object22).b;
                ((ibj)object5).b |= 2;
                ((ibj)object5).d = (String)object4;
            }
            object5 = (hwr)ibk.a.l();
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = (ibk)((hwr)object5).b;
            object22 = (ibj)((hwp)object22).o();
            object22.getClass();
            ((ibk)object4).d = object22;
            ((ibk)object4).b |= 2;
            if (!((hwp)cloneable).b.B()) {
                ((hwp)cloneable).u();
            }
            object22 = (bor)((hwp)cloneable).b;
            object5 = (ibk)((hwp)object5).o();
            object5.getClass();
            ((bor)object22).d = object5;
            ((bor)object22).b |= 2;
        }
        if (((dyj)object3).i.g()) {
            ((dyl)object).d = gto.i((gpu)((dyj)object3).i.c());
        }
        ((dyl)object).h = (byte)(((dyl)object).h | 2);
        if (((dyj)object3).j.g()) {
            ((dyl)object).c = gto.i(((dyj)object3).j.c());
            object4 = (hwr)ibk.a.l();
            object5 = hzw.c(((Duration)((dyj)object3).j.c()).toNanos());
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object22 = (ibk)((hwr)object4).b;
            object5.getClass();
            ((ibk)object22).c = object5;
            ((ibk)object22).b |= 1;
            ((hwp)cloneable).z((ibk)((hwp)object4).o());
        }
        ((dyl)object).i = cloneable;
        object3 = ((dyj)object3).h;
        if (object3 == null) {
            throw new NullPointerException("Null globalMetadata");
        }
        ((dyl)object).b = object3;
        if (((dyl)object).h == 3 && (cloneable = ((dyl)object).e) != null && (object5 = ((dyl)object).i) != null && (object3 = ((dyl)object).f) != null && (object22 = ((dyl)object).g) != null) {
            object22 = new dym(((dyl)object).a, ((dyl)object).b, ((dyl)object).c, ((dyl)object).d, (dxx)((Object)cloneable), (hwp)object5, (hac)object3, (hav)object22);
            if (!((dym)object22).c.g()) {
                object = ((dym)object22).h;
                cloneable = (hwr)ibk.a.l();
                object3 = hzw.c(l2);
                if (!((hwp)cloneable).b.B()) {
                    ((hwp)cloneable).u();
                }
                object5 = (ibk)((hwr)cloneable).b;
                object3.getClass();
                ((ibk)object5).c = object3;
                ((ibk)object5).b |= 1;
                ((hwp)object).z((ibk)((hwp)cloneable).o());
            }
            cloneable = new HashSet();
            if (dxm2.h.c) {
                object = kcu.a.l();
                l2 = Process.myPid();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object5 = ((hwp)object).b;
                object3 = (kcu)object5;
                ((kcu)object3).b |= 1;
                ((kcu)object3).c = l2;
                l2 = dxm2.i;
                if (!((hwv)object5).B()) {
                    ((hwp)object).u();
                }
                object3 = (kcu)((hwp)object).b;
                ((kcu)object3).b |= 2;
                ((kcu)object3).d = l2;
                object5 = (kcu)((hwp)object).o();
                object4 = ((dym)object22).h;
                object = object3 = ((bor)((hwp)object4).b).e;
                if (object3 == null) {
                    object = bos.a;
                }
                object3 = (hwp)((hwv)object).C(5);
                ((hwp)object3).x((hwv)object);
                object = (hwr)object3;
                ((hwr)object).aH(kcu.e, object5);
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object3 = (bor)((hwp)object4).b;
                object = (bos)((hwp)object).o();
                object.getClass();
                ((bor)object3).e = object;
                ((bor)object3).b |= 4;
                if (!((dym)object22).d()) {
                    object = dzc.a();
                    object3 = kcw.a.l();
                    n2 = ((dym)object22).e.b().a;
                    n3 = ((dym)object22).e.b().b;
                    if (n3 != 1) {
                        object5 = kcv.a.l();
                        n2 = (Integer)dxm2.e.d.c();
                        if (!((hwp)object5).b.B()) {
                            ((hwp)object5).u();
                        }
                        object4 = ((hwp)object5).b;
                        kcv kcv2 = (kcv)object4;
                        kcv2.b |= 1;
                        kcv2.c = n2;
                        if (!((hwv)object4).B()) {
                            ((hwp)object5).u();
                        }
                        object4 = (kcv)((hwp)object5).b;
                        ((kcv)object4).d = n3 - 1;
                        ((kcv)object4).b |= 2;
                        if (!((hwp)object3).b.B()) {
                            ((hwp)object3).u();
                        }
                        object4 = (kcw)((hwp)object3).b;
                        object5 = (kcv)((hwp)object5).o();
                        object5.getClass();
                        ((kcw)object4).j = object5;
                        ((kcw)object4).b |= 0x40;
                    } else {
                        if (!((hwp)object3).b.B()) {
                            ((hwp)object3).u();
                        }
                        object5 = (kcw)((hwp)object3).b;
                        ((kcw)object5).b |= 4;
                        ((kcw)object5).f = n2;
                    }
                    ((hwp)object3).X((bor)((dym)object22).h.o());
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object5 = ((hwp)object3).b;
                    object4 = (kcw)object5;
                    ((kcw)object4).b |= 2;
                    ((kcw)object4).e = 2;
                    if (!((hwv)object5).B()) {
                        ((hwp)object3).u();
                    }
                    object5 = (kcw)((hwp)object3).b;
                    ((kcw)object5).c = 8;
                    ((kcw)object5).b = 1 | ((kcw)object5).b;
                    ((dzb)object).c(((dym)object22).b());
                    ((dzb)object).b((kcw)((hwp)object3).o());
                    ((HashSet)cloneable).add(dxm2.b(((dzb)object).a()));
                }
            }
            object = dxm2.b;
            synchronized (object) {
                object3 = dxm2.e.f.k();
                while (object3.hasNext()) {
                    ((dyi)object3.next()).a();
                }
                object3 = dxm2.d.k();
                while (object3.hasNext()) {
                    ((dyh)object3.next()).a();
                }
            }
            object = (dxq)dxm2.f;
            object3 = ((dxq)object).c.a((dym)object22);
            if (!((gto)object3).g()) {
                object = hdc.a;
            } else {
                object3 = ((dxq)object).a((dys)((gto)object3).c());
                ((dxq)object).b((dzc)object3);
                object = new hdq(object3);
            }
            object = ((hav)object).k();
            while (true) {
                if (!object.hasNext()) {
                    return fxf.aD((Iterable)((Object)cloneable)).B(new dwp(2), dxm2.g.b);
                }
                ((HashSet)cloneable).add(dxm2.b((dzc)object.next()));
            }
        }
        object3 = new StringBuilder();
        if ((((dyl)object).h & 1) == 0) {
            ((StringBuilder)object3).append(" sequenceNo");
        }
        if ((((dyl)object).h & 2) == 0) {
            ((StringBuilder)object3).append(" traceMarkerRequested");
        }
        if (((dyl)object).e == null) {
            ((StringBuilder)object3).append(" event");
        }
        if (((dyl)object).i == null) {
            ((StringBuilder)object3).append(" appEventBuilder");
        }
        if (((dyl)object).f == null) {
            ((StringBuilder)object3).append(" tags");
        }
        if (((dyl)object).g == null) {
            ((StringBuilder)object3).append(" testCodes");
        }
        throw new IllegalStateException("Missing required properties:".concat(object3.toString()));
    }
}

