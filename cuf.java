/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class cuf
implements Runnable {
    public final cuq a;
    public final hlq b;
    public final hpn c;
    public final cuo d;
    public final cup e;
    public final long f;
    public final int g;
    private final int h;

    public /* synthetic */ cuf(cuq cuq2, long l2, hlq hlq2, hpn hpn2, cuo cuo2, cup cup2, int n2, int n3) {
        this.h = n3;
        this.a = cuq2;
        this.f = l2;
        this.b = hlq2;
        this.c = hpn2;
        this.d = cuo2;
        this.e = cup2;
        this.g = n2;
    }

    public /* synthetic */ cuf(cuq cuq2, hlq hlq2, hpn hpn2, cuo cuo2, cup cup2, int n2, long l2, int n3) {
        this.h = n3;
        this.a = cuq2;
        this.b = hlq2;
        this.c = hpn2;
        this.d = cuo2;
        this.e = cup2;
        this.g = n2;
        this.f = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        hyg hyg2;
        Object object;
        int n2;
        Object object2;
        Object object3;
        block28: {
            block27: {
                if (this.h != 0) {
                    long l2 = this.f;
                    long l3 = cgw.o();
                    cuq cuq2 = this.a;
                    fxf.ag(new cuf(cuq2, this.b, this.c, this.d, this.e, this.g, l3 - l2, 0), cuq2.d);
                    return;
                }
                object3 = this.d;
                object2 = this.c;
                try {
                    object2 = hhk.S((Future)object2);
                }
                catch (Throwable throwable) {
                    object2 = null;
                    break block27;
                }
                try {
                    n2 = object3.a(object2);
                    object3 = object2;
                    break block28;
                }
                catch (Throwable throwable) {}
            }
            object = object3;
            if (object3 instanceof ExecutionException) {
                object = ((Throwable)object3).getCause();
            }
            if (object instanceof CancellationException) {
                n2 = 5;
                object3 = object2;
            } else if (object instanceof InterruptedException) {
                n2 = 6;
                object3 = object2;
            } else if (object instanceof IOException) {
                n2 = 7;
                object3 = object2;
            } else if (object instanceof IllegalStateException) {
                n2 = 8;
                object3 = object2;
            } else if (object instanceof IllegalArgumentException) {
                n2 = 9;
                object3 = object2;
            } else if (object instanceof UnsupportedOperationException) {
                n2 = 10;
                object3 = object2;
            } else if (object instanceof css) {
                n2 = 11;
                object3 = object2;
            } else {
                n2 = 4;
                object3 = object2;
            }
        }
        object2 = object = this.b;
        if (object3 != null) {
            object2 = this.e;
            hyg2 = (hwp)((hwv)object).C(5);
            ((hwp)hyg2).x((hwv)object);
            ((hwp)hyg2).x(object2.a(object3));
            object2 = (hlq)((hwp)hyg2).o();
        }
        object3 = hly.a.l();
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        int n3 = this.g;
        object = ((hwp)object3).b;
        hyg2 = (hly)object;
        ((hly)hyg2).c = n3 - 2;
        ((hly)hyg2).b |= 1;
        if (!((hwv)object).B()) {
            ((hwp)object3).u();
        }
        hyg2 = ((hwp)object3).b;
        object = (hly)hyg2;
        ((hly)object).d = n2 - 2;
        ((hly)object).b |= 2;
        if (!((hwv)hyg2).B()) {
            ((hwp)object3).u();
        }
        long l4 = this.f;
        hyg2 = ((hwp)object3).b;
        object = (hly)hyg2;
        ((hly)object).b = 4 | ((hly)object).b;
        ((hly)object).f = l4;
        if (!((hwv)hyg2).B()) {
            ((hwp)object3).u();
        }
        hyg2 = (hly)((hwp)object3).b;
        object2.getClass();
        object = ((hly)hyg2).e;
        if (!object.c()) {
            ((hly)hyg2).e = hwv.s((hxk)object);
        }
        object = this.a;
        ((hly)hyg2).e.add(object2);
        object2 = (hly)((hwp)object3).o();
        object3 = hls.a.l();
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object = ((cuq)object).h;
        hyg2 = (hls)((hwp)object3).b;
        object2.getClass();
        ((hls)hyg2).s = object2;
        ((hls)hyg2).d |= 0x100;
        ((cyu)object).i(1110, (hwp)object3, (int)ioa.a.b().a());
    }
}

