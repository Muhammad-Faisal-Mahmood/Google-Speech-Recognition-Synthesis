/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Process
 */
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;

public final class izg
extends izi
implements jcu {
    public final iyx a;
    public final iza b;
    public final long c;
    public ScheduledFuture d;
    private final jgp n;
    private final Executor o;
    private final AtomicInteger p;
    private jge q;
    private int r;
    private final kmp s;

    public izg(izc izc2, iyp iyp2, jcn object) {
        jgp jgp2 = izc2.c;
        object = ((jcn)object).b;
        Object object2 = izc2.a;
        Object object3 = izc2.g;
        Object object4 = its.a;
        object4 = new kpy(its.a);
        ((kpy)object4).b(jdx.a, (Object)ixv.a);
        ((kpy)object4).b(jdx.b, object);
        ((kpy)object4).b(ivd.b, iyp.a(object2));
        ((kpy)object4).b(ivd.a, iyp2);
        ((kpy)object4).b(h, object3);
        object = ((kpy)object4).a();
        object3 = izc2.a.getClass().getSimpleName();
        object2 = String.valueOf(iyp2);
        object4 = new StringBuilder();
        ((StringBuilder)object4).append((String)object3);
        ((StringBuilder)object4).append("->");
        ((StringBuilder)object4).append((String)object2);
        super(jgp2, (its)object, ivn.a(izg.class, ((StringBuilder)object4).toString()));
        this.r = 1001;
        this.n = object = izc2.d;
        this.a = izc2.e;
        this.o = object.a();
        this.c = 60000L;
        this.p = new AtomicInteger();
        this.s = new kmp();
        this.b = new jao(izc2.b, izc2.a, iyp2.a.cloneFilter(), this);
    }

    private static jcj A(iyh iyh2, its its2, iuc[] iucArray) {
        jjo.g(iucArray, its2).a();
        return new jdq(iyh2, iucArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final jcj b(ixb object, iwx iwx2, itw object2, iuc[] iucArray) {
        synchronized (this) {
            int n2;
            if (!this.z(3)) {
                object = this.w() ? this.l : iyh.j.e("newStream() before transportReady()");
                return izg.A((iyh)object, this.k, iucArray);
            }
            int n3 = this.r;
            this.r = n2 = n3 + 1;
            if (n2 == 0xFFFFFF) {
                this.r = 1001;
            }
            jjo jjo2 = jjo.g(iucArray, this.k);
            izq izq2 = new izq(this, this.k, n3, jeb.i((itw)object2));
            if (this.j.putIfAbsent(n3, izq2) != null) {
                object = iyh.j.e("Clashing call IDs");
                this.t((iyh)object, true);
                return izg.A((iyh)object, this.k, iucArray);
            }
            if (izq2.a && this.p.getAndIncrement() == 0) {
                this.q.a(true);
            }
            object2 = new jae(this, n3, (ixb)object, iwx2, jjo2);
            if (!((ixb)object).a.a()) return new izz(izq2, (jae)object2);
            return new jap(izq2, (jae)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Runnable d(jge object) {
        synchronized (this) {
            this.q = object;
            return new iuk(this, 4, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(Throwable throwable) {
        synchronized (this) {
            this.t(iyh.j.e("Could not evaluate SecurityPolicy").d(throwable), true);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(IBinder object, iyh object2) {
        synchronized (this) {
            if (this.z(2)) {
                if (!((iyh)object2).g()) {
                    this.t((iyh)object2, true);
                    return;
                }
                if (!this.x(jad.b((IBinder)object, this.o))) {
                    this.t(iyh.k.e("Failed to observe outgoing binder"), true);
                    return;
                }
                if (!this.w()) {
                    this.y(3);
                    object2 = this.q;
                    object = this.k;
                    object2.e();
                    this.k = object;
                    this.q.b();
                    object = this.d;
                    if (object != null) {
                        object.cancel(false);
                        this.d = null;
                        return;
                    }
                }
            }
            return;
        }
    }

    @Override
    protected final void g(Parcel parcel) {
        parcel.readInt();
        this.s.J();
    }

    @Override
    protected final void h(Parcel parcel) {
        int n2 = Binder.getCallingUid();
        kpy kpy2 = new kpy(this.k);
        kpy2.b(f, n2);
        itr itr2 = jdx.a;
        ixv ixv2 = n2 == Process.myUid() ? ixv.c : ixv.b;
        kpy2.b(itr2, (Object)ixv2);
        this.k = kpy2.a();
        if (this.z(2)) {
            int n3 = parcel.readInt();
            parcel = parcel.readStrongBinder();
            if (n3 != 1) {
                this.t(iyh.k.e("Wire format version mismatch"), true);
                return;
            }
            if (parcel == null) {
                this.t(iyh.k.e("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            hhk.T(hhk.O(new fjh(this, n2, 2), this.o), new ena(this, parcel, 12), this.o);
        }
    }

    @Override
    public final void i(iyh iyh2) {
        this.q.c(iyh2);
    }

    @Override
    public final void j() {
        Object object;
        if (this.p.getAndSet(0) > 0) {
            this.q.a(false);
        }
        if ((object = this.d) != null) {
            object.cancel(false);
            this.d = null;
        }
        object = this.b;
        iyh iyh2 = iyh.c;
        ((jao)object).c(iyh2);
        this.q.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(IBinder iBinder) {
        synchronized (this) {
            this.r(jad.b(iBinder, this.o));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l() {
        synchronized (this) {
            if (this.z(2)) {
                this.d = null;
                long l2 = this.c;
                iyh iyh2 = iyh.e;
                StringBuilder stringBuilder = new StringBuilder("Connect timeout ");
                stringBuilder.append(l2);
                stringBuilder.append("ms lapsed");
                this.t(iyh2.e(stringBuilder.toString()), true);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(iyh iyh2) {
        synchronized (this) {
            this.t(iyh2, true);
            return;
        }
    }

    @Override
    public final void n() {
        super.n();
        this.n.b(this.o);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o(iyh iyh2) {
        synchronized (this) {
            a.s(iyh2, "reason");
            this.t(iyh2, false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void p(iyh iyh2) {
        synchronized (this) {
            throw null;
        }
    }

    @Override
    protected final void q(izu izu2) {
        if (izu2.e() && this.p.decrementAndGet() == 0) {
            this.q.a(false);
        }
        super.q(izu2);
    }
}

