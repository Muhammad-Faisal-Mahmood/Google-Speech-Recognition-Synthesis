/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  hom
 */
import android.os.IBinder;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class izh
extends izi
implements ivm {
    public final List a;
    private jjg b;

    public izh(jgp jgp2, its its2, List list, IBinder iBinder) {
        super(jgp2, its2, ivn.a(izh.class, "from ".concat(String.valueOf(String.valueOf(its2.a(ivd.a))))));
        this.a = list;
        this.x(jad.b(iBinder, this.i));
    }

    @Override
    protected final izu B(int n2) {
        return new izr(this, this.k, n2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final iyh b(jje object, String object2, iwx iwx2) {
        synchronized (this) {
            Object object3;
            block15: {
                Object object4;
                Object object5;
                jjo jjo2;
                Object object6;
                Executor executor;
                jjg jjg2;
                block16: {
                    block17: {
                        block18: {
                            if (this.w()) {
                                return iyh.k.e("transport is shutdown");
                            }
                            jjg2 = ((iyy)this.b).a;
                            int n2 = jnr.a;
                            executor = ((jiz)jjg2).b.d != hom.a ? new jim(((jiz)jjg2).b.d) : new jii();
                            boolean bl2 = iwx2.h(jeb.c);
                            int n3 = 1;
                            if (bl2 && ((jiz)jjg2).b.p.a((String)(object6 = (String)iwx2.b(jeb.c))) == null) {
                                object.i(jja.c);
                                object2 = iyh.i.e(String.format("Can't find decompressor for %s", object6));
                                iwx2 = new iwx();
                                object.e((iyh)object2, iwx2);
                                return iyh.b;
                            }
                            jjo2 = object.b();
                            a.s(jjo2, "statsTraceCtx not present from stream");
                            object6 = (Long)iwx2.b(jeb.b);
                            object5 = ((jiz)jjg2).b.o;
                            object3 = jjo2.b;
                            if (((kmp[])object3).length > 0) break block15;
                            object4 = ((ius)object5).l(ivq.a, ((jiz)jjg2).b);
                            if (object6 == null) {
                                object6 = new iul((ius)object4);
                                break block16;
                            }
                            object5 = iut.g((Long)object6, TimeUnit.NANOSECONDS, ((jiz)jjg2).b.s);
                            ScheduledExecutorService scheduledExecutorService = ((jiz)jjg2).c.i;
                            a.s(scheduledExecutorService, "scheduler");
                            object3 = ((ius)object4).b();
                            object6 = object5;
                            n2 = n3;
                            if (object3 != null) {
                                object6 = object5;
                                n2 = n3;
                                if (((iut)object3).a((iut)object5) <= 0) {
                                    n2 = 0;
                                    object6 = object3;
                                }
                            }
                            object5 = new iul((ius)object4, (iut)object6);
                            if (n2 == 0) break block17;
                            if (((iut)object6).f()) break block18;
                            synchronized (object5) {
                                object3 = new iuk(object5, 0);
                            }
                            {
                                a.s(scheduledExecutorService, "scheduler");
                                ((iul)object5).b = scheduledExecutorService.schedule((Runnable)object3, ((iut)object6).a - System.nanoTime(), TimeUnit.NANOSECONDS);
                                break block17;
                            }
                        }
                        object6 = new TimeoutException("context timed out");
                        ((iul)object5).j((Throwable)object6);
                    }
                    object6 = object5;
                }
                object5 = new jiu(executor, ((jiz)jjg2).b.d, (jje)object, (iul)object6);
                object.i((jjf)object5);
                object3 = new hqa();
                object4 = new jiy((jiz)jjg2, (iul)object6, (String)object2, (jje)object, (jiu)object5, (hqa)object3, jjo2, iwx2);
                executor.execute((Runnable)object4);
                object2 = new jix((iul)object6, (hqa)object3, iwx2, (jje)object, (jiu)object5);
                executor.execute((Runnable)object2);
                return iyh.b;
            }
            object = object3[0];
            {
                throw null;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(jjg object) {
        synchronized (this) {
            this.b = object;
            if (this.w()) {
                this.y(5);
                this.j();
                this.n();
                return;
            }
            Object object2 = this.m;
            fxf.K(object2);
            this.r((jad)object2);
            if (this.w()) {
                return;
            }
            this.y(3);
            object2 = this.k;
            object = ((iyy)object).a;
            ((jiz)object).a.cancel(false);
            ((jiz)object).a = null;
            object = ((jiz)object).b.g.iterator();
            if (!object.hasNext()) {
                this.k = object2;
                return;
            }
            object = (kmp)object.next();
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        synchronized (this) {
            this.t(iyh.b, false);
            return;
        }
    }

    @Override
    public final void i(iyh iyh2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void j() {
        Object object = this.b;
        if (object == null) return;
        object = (iyy)object;
        Object object2 = (jiz)((iyy)object).a;
        Object object3 = ((jiz)object2).a;
        if (object3 != null) {
            object3.cancel(false);
            ((jiz)object2).a = null;
        }
        if ((object3 = ((jiz)object2).b.g.iterator()).hasNext()) {
            object = (kmp)object3.next();
            throw null;
        }
        object3 = ((jiz)object2).b;
        izh izh2 = ((jiz)object2).c;
        object2 = ((jja)object3).l;
        // MONITORENTER : object2
        if (((jja)object3).n.remove(izh2)) {
            ivk.c((ivj)((jja)object3).q.g.get(ivk.a((ivs)object3)), izh2);
            ((jja)object3).d();
            // MONITOREXIT : object2
            object = ((iyy)object).b;
            // MONITORENTER : object
            --((iyz)object).c;
            object2 = ((iyz)object).a();
            // MONITOREXIT : object
            if (object2 == null) return;
            object2.run();
            return;
        }
        object = new AssertionError((Object)"Transport already removed");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(iyh iyh2) {
        synchronized (this) {
            this.t(iyh2, true);
            return;
        }
    }
}

