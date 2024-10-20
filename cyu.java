/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 *  hom
 */
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.Executor;

public final class cyu {
    public gto a = gsl.a;
    private final Context b;
    private final String c;
    private final gto d;
    private final bzo e;
    private final bzo f;

    public cyu(Context context, bzo bzo2, bzo bzo3, gto gto2) {
        this.b = context;
        this.e = bzo2;
        this.c = context.getPackageName();
        this.f = bzo3;
        this.d = gto2;
    }

    private final void k(int n2, hwp hwp2, long l2) {
        hwp hwp3 = hmg.a.l();
        if (!hwp3.b.B()) {
            hwp3.u();
        }
        hmg hmg2 = (hmg)hwp3.b;
        hmg2.b |= 1;
        hmg2.c = false;
        this.h(n2, hwp2, l2, (hmg)hwp3.o());
    }

    public final void a(hlt hlt2) {
        long l2 = (int)ioa.a.b().c();
        if (!cyr.b(l2)) {
            return;
        }
        hwp hwp2 = hls.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hls hls2 = (hls)hwp2.b;
        hlt2.getClass();
        hls2.q = hlt2;
        hls2.d |= 4;
        this.k(1075, hwp2, l2);
    }

    public final hpn b(int n2, hnx hnx2, int n3) {
        return fxf.ak(this.f.h(n3, this.a), new cyt(this, hnx2, n2, n3, 0), (Executor)hom.a);
    }

    public final void c(int n2, int n3) {
        this.k(n2, hls.a.l(), n3);
    }

    public final void d(int n2) {
        this.i(n2, hls.a.l(), cqq.o());
    }

    public final void e(int n2, String object, int n3, long l2, String object2) {
        hyg hyg2 = hlq.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hwv hwv2 = ((hwp)hyg2).b;
        hlq hlq2 = (hlq)hwv2;
        object.getClass();
        hlq2.b |= 1;
        hlq2.c = object;
        if (!hwv2.B()) {
            ((hwp)hyg2).u();
        }
        object = ((hwp)hyg2).b;
        hwv2 = (hlq)object;
        ((hlq)hwv2).b |= 2;
        ((hlq)hwv2).d = n3;
        if (!((hwv)object).B()) {
            ((hwp)hyg2).u();
        }
        object = ((hwp)hyg2).b;
        hwv2 = (hlq)object;
        ((hlq)hwv2).b |= 0x40;
        ((hlq)hwv2).i = l2;
        if (!((hwv)object).B()) {
            ((hwp)hyg2).u();
        }
        object = (hlq)((hwp)hyg2).b;
        object2.getClass();
        ((hlq)object).b |= 0x80;
        ((hlq)object).j = object2;
        hyg2 = (hlq)((hwp)hyg2).o();
        object2 = hls.a.l();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object = (hls)((hwp)object2).b;
        hyg2.getClass();
        ((hls)object).e = hyg2;
        ((hls)object).b |= 0x100;
        this.i(n2, (hwp)object2, cqq.o());
    }

    public final void f(int n2, int n3) {
        hwp hwp2 = hls.a.l();
        hyg hyg2 = hlw.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hwv hwv2 = ((hwp)hyg2).b;
        hwv hwv3 = (hlw)hwv2;
        hwv3.b |= 2;
        hwv3.d = n3;
        if (!hwv2.B()) {
            ((hwp)hyg2).u();
        }
        hwv3 = (hlw)((hwp)hyg2).b;
        hwv3.c = n2 - 2;
        hwv3.b |= 1;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv3 = (hls)hwp2.b;
        hyg2 = (hlw)((hwp)hyg2).o();
        hyg2.getClass();
        ((hls)hwv3).k = hyg2;
        ((hls)hwv3).c |= 0x8000;
        this.i(1053, hwp2, cqq.o());
    }

    public final void g(hlq hwv2, int n2, long l2, long l3, String object, int n3) {
        hwp hwp2 = hls.a.l();
        hwp hwp3 = hlz.a.l();
        if (!hwp3.b.B()) {
            hwp3.u();
        }
        hwv hwv3 = hwp3.b;
        hlz hlz2 = (hlz)hwv3;
        hwv2.getClass();
        hlz2.c = hwv2;
        hlz2.b |= 1;
        if (!hwv3.B()) {
            hwp3.u();
        }
        hwv2 = hwp3.b;
        hwv3 = (hlz)hwv2;
        ((hlz)hwv3).d = a.A(n2);
        ((hlz)hwv3).b |= 2;
        if (!hwv2.B()) {
            hwp3.u();
        }
        hwv3 = hwp3.b;
        hwv2 = (hlz)hwv3;
        ((hlz)hwv2).b |= 4;
        ((hlz)hwv2).e = l2;
        if (!hwv3.B()) {
            hwp3.u();
        }
        hwv3 = hwp3.b;
        hwv2 = (hlz)hwv3;
        ((hlz)hwv2).b |= 8;
        ((hlz)hwv2).f = l3;
        if (!hwv3.B()) {
            hwp3.u();
        }
        hwv2 = hwp3.b;
        hwv3 = (hlz)hwv2;
        object.getClass();
        ((hlz)hwv3).b |= 0x10;
        ((hlz)hwv3).g = object;
        if (!hwv2.B()) {
            hwp3.u();
        }
        hwv2 = (hlz)hwp3.b;
        ((hlz)hwv2).b |= 0x20;
        ((hlz)hwv2).h = n3;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv2 = (hls)hwp2.b;
        object = (hlz)hwp3.o();
        object.getClass();
        ((hls)hwv2).n = object;
        ((hls)hwv2).c |= 0x400000;
        this.i(1068, hwp2, cqq.o());
    }

    public final void h(int n2, hwp object, long l2, hmg object2) {
        hyg hyg2 = hlp.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        Object object3 = this.c;
        hwv hwv2 = ((hwp)hyg2).b;
        hlp hlp2 = (hlp)hwv2;
        object3.getClass();
        hlp2.b |= 2;
        hlp2.d = object3;
        if (!hwv2.B()) {
            ((hwp)hyg2).u();
        }
        hwv2 = (hlp)((hwp)hyg2).b;
        ((hlp)hwv2).b |= 1;
        ((hlp)hwv2).c = 616991814;
        if (this.d.g()) {
            object3 = (String)this.d.c();
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = (hlp)((hwp)hyg2).b;
            ((hlp)hwv2).b |= 4;
            ((hlp)hwv2).e = object3;
        }
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object3 = (hls)((hwp)object).b;
        hwv2 = hls.a;
        ((hls)object3).b |= 0x80000;
        ((hls)object3).f = l2;
        object3 = hlr.a.l();
        boolean bl2 = this.b.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        hwv2 = (hlr)((hwp)object3).b;
        ((hlr)hwv2).b |= 1;
        ((hlr)hwv2).c = bl2;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hwv2 = (hls)((hwp)object).b;
        object3 = (hlr)((hwp)object3).o();
        object3.getClass();
        ((hls)hwv2).i = object3;
        ((hls)hwv2).c |= 0x80;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hwv2 = (hls)((hwp)object).b;
        hyg2 = (hlp)((hwp)hyg2).o();
        hyg2.getClass();
        ((hls)hwv2).m = hyg2;
        ((hls)hwv2).c |= 0x80000;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hyg2 = (hls)((hwp)object).b;
        object2.getClass();
        ((hls)hyg2).g = object2;
        ((hls)hyg2).b |= 0x100000;
        object2 = this.e;
        object = ((hwp)object).o();
        object = ((caj)((bzo)object2).a).e((hyf)object);
        ((cag)object).e(n2 - 2);
        ((cag)object).a();
    }

    public final void i(int n2, hwp hwp2, long l2) {
        fxf.al(this.f.h(l2, this.a), new daq(this, n2, hwp2, l2, 1), (Executor)hom.a);
    }

    public final void j(int n2, hlq hwv2, int n3) {
        hwp hwp2 = hls.a.l();
        hyg hyg2 = hlv.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hwv hwv3 = ((hwp)hyg2).b;
        hwv hwv4 = (hlv)hwv3;
        if (n2 != 1) {
            ((hlv)hwv4).c = n2 - 2;
            ((hlv)hwv4).b |= 1;
            if (!hwv3.B()) {
                ((hwp)hyg2).u();
            }
            hwv3 = hwv4 = ((hwp)hyg2).b;
            hwv2.getClass();
            ((hlv)hwv3).d = hwv2;
            ((hlv)hwv3).b |= 2;
            if (!hwv4.B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = ((hwp)hyg2).b;
            hwv4 = (hlv)hwv2;
            if (n3 != 1) {
                ((hlv)hwv4).e = n3 - 2;
                ((hlv)hwv4).b |= 4;
                if (!hwv2.B()) {
                    ((hwp)hyg2).u();
                }
                hwv2 = (hlv)((hwp)hyg2).b;
                ((hlv)hwv2).b |= 8;
                ((hlv)hwv2).f = 0;
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                hwv2 = (hls)hwp2.b;
                hyg2 = (hlv)((hwp)hyg2).o();
                hyg2.getClass();
                ((hls)hwv2).o = hyg2;
                ((hls)hwv2).c |= Integer.MIN_VALUE;
                this.i(1070, hwp2, cqq.o());
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

