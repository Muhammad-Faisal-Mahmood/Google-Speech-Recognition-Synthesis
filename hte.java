/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

public final class hte
extends itz {
    public final Executor a;
    public final Set b = hhk.t();
    public final Deque c;
    public int d;
    public htd e;
    public boolean f = false;
    public final htc g;
    public boolean h = false;
    public itz i;
    public fvc j;
    private final itx k;
    private final ixb l;
    private final gzx m;
    private final LinkedHashMap n = new LinkedHashMap();
    private final Set o = hhk.t();
    private final Queue p;
    private itw q;
    private final Queue r;
    private int s;
    private iwx t;

    public hte(itx object, ixb object2, itw itw2, gzx gzx2) {
        this.k = object;
        this.l = object2;
        this.q = itw2;
        this.m = gzx2;
        this.c = new ArrayDeque();
        this.r = new ArrayDeque();
        this.p = new ArrayDeque();
        this.e = new htd(((hct)gzx2).c, 1, 0, 0);
        object = object2 = itw2.c;
        if (object2 == null) {
            object = hom.a;
        }
        this.g = object = new htc((Executor)object);
        this.a = new gaj((Object)this, (Executor)new hpz((Executor)object), 5);
    }

    private final void k() {
        while (!this.c.isEmpty()) {
            Object object = (htb)this.c.peek();
            if (!((htb)object).b.isEmpty() || ((htb)object).c != ((htb)object).d.e.a) break;
            object = ((htb)this.c.poll()).a;
            if (this.e.e == 4) {
                this.i.f(object);
                continue;
            }
            this.p.add(object);
        }
    }

    private final void l(htb htb2, int n2, int n3) {
        block4: {
            bzq bzq2 = new bzq(htb2.a);
            while (n2 < n3) {
                gzx gzx2 = (gzx)this.m.get(n2);
                int n4 = gzx2.size();
                for (int i2 = 0; i2 < n4; ++i2) {
                    hsy hsy2 = (hsy)gzx2.get(i2);
                    htl htl2 = hsy2.d(bzq2);
                    if (htl2.c.equals((Object)htk.d)) {
                        hpn hpn2 = htl2.a();
                        htb2.b.put(hsy2, hpn2);
                        hpn2.c(gqk.i(new hst(this, bzq2, htb2, 3, null)), this.a);
                    }
                    boolean bl2 = this.n(htl2);
                    if (!bl2) continue;
                    break block4;
                }
                ++n2;
            }
            htb2.c = n3;
            if (htb2.b.isEmpty()) {
                this.k();
                this.b();
            }
        }
    }

    private final void m() {
        int n2;
        Object object = this.e;
        int n3 = ((htd)object).e != 4 ? 0 : 1;
        fxf.B(n3 ^ true, "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        n3 = ((htd)object).e;
        if (n3 == 3) {
            object = new htd(((htd)object).a, 4, ((htd)object).b, ((htd)object).c);
        } else if (n3 == 1 && ((htd)object).d) {
            n3 = ((htd)object).a;
            n2 = ((htd)object).b;
            object = new htd(n3, 2, n2, n2);
        } else {
            int n4 = ((htd)object).b;
            n3 = n4 + 1;
            n2 = ((htd)object).a;
            int n5 = ((htd)object).c;
            object = n3 < n2 ? new htd(n2, 1, n3, n5) : new htd(n2, 3, n4, n5);
        }
        this.e = object;
        n3 = ((htd)object).e - 1;
        if (n3 != 0) {
            if (n3 != 2) {
                this.g();
                return;
            }
            object = this.k.a(this.l, this.q);
            this.i = object;
            ((itz)object).a(this.j, this.t);
            n3 = this.d;
            if (n3 > 0) {
                this.i.e(n3);
            }
            for (Object e2 : this.p) {
                this.i.f(e2);
            }
            if (this.f && this.c.isEmpty()) {
                this.i.d();
            }
            this.m();
            return;
        }
        this.h(this.t);
    }

    private final boolean n(htl object) {
        int n2 = ((htl)object).c.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            this.e.d = true;
                            return false;
                        }
                        throw new IllegalStateException("Unrecognized outcome type: ".concat(((Object)((Object)((htl)object).c)).toString()));
                    }
                    object = ((htl)object).a();
                    this.b.add(object);
                    object.c(gqk.i(new hsk((Object)this, object, 4, null)), this.a);
                    return false;
                }
                throw null;
            }
            object = ((htl)object).d;
            fvc fvc2 = this.j;
            Object object2 = ((hth)object).a;
            iwx iwx2 = (iwx)((hth)object).b;
            fvc2.a((iyh)object2, iwx2);
            if (this.e.e == 4) {
                this.i.c("Aborted RPC with exception", ((iyh)((hth)object).a).p);
            }
            this.h = true;
            return true;
        }
        object = ((htl)object).e;
        if (object != null) {
            if (this.e.e != 1) {
                object = new IllegalStateException("Cannot return proceedWithCallOptions() from message processing methods");
                this.j.a(iyh.c((Throwable)object), new iwx());
                if (this.e.e == 4) {
                    this.i.c("Interceptor returned invalid outcome", (Throwable)object);
                }
                return true;
            }
            this.q = object;
        }
        return false;
    }

    private final gpm o(itw itw2, iwx iwx2, String string) {
        fxf.K(itw2);
        fxf.K(iwx2);
        fxf.K(string);
        return new gpm(this.l, itw2, iwx2, string);
    }

    private final gpm p(gpm object) {
        itw itw2 = this.q;
        if (itw2 == ((gpm)object).a) {
            return object;
        }
        Object object2 = ((gpm)object).c;
        object = (String)((gpm)object).d;
        return this.o(itw2, (iwx)object2, (String)object);
    }

    @Override
    public final void a(fvc object, iwx iwx2) {
        this.j = new hta(this, new htm(new htg((fvc)object, this.m, this.o)));
        this.t = iwx2;
        object = gqk.i(new hsk(this, iwx2, 5));
        this.a.execute((Runnable)object);
    }

    public final void b() {
        if (this.f) {
            htb htb2 = (htb)this.c.peekLast();
            int n2 = this.e.e - 1;
            if (n2 != 1) {
                if (n2 == 3 && htb2 == null) {
                    this.i.d();
                    return;
                }
            } else if (htb2 == null || htb2.b.isEmpty() && htb2.c == htb2.d.e.c + 1) {
                this.m();
            }
        }
    }

    @Override
    public final void c(String object, Throwable throwable) {
        object = gqk.i(new hst(this, object, (Object)throwable, 4));
        this.a.execute((Runnable)object);
    }

    @Override
    public final void d() {
        Runnable runnable = gqk.i(new gjf(this, 19));
        this.a.execute(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(int n2) {
        ArrayDeque arrayDeque2 = this.r;
        synchronized (arrayDeque2) {
            this.s += n2;
        }
        arrayDeque2 = new ArrayDeque();
        Queue queue = this.r;
        synchronized (queue) {
            if (this.r.isEmpty()) {
            } else {
                int n3 = this.s;
                for (int i2 = 0; i2 < n3; ++i2) {
                    Object e2 = this.r.poll();
                    if (e2 == null) continue;
                    arrayDeque2.add(e2);
                    --this.s;
                }
                boolean bl2 = this.r.isEmpty();
                // MONITOREXIT @DISABLED, blocks:[6, 10] lbl20 : MonitorExitStatement: MONITOREXIT : var5_3
                for (ArrayDeque arrayDeque2 : arrayDeque2) {
                    this.j.X(arrayDeque2);
                }
                if (bl2) {
                    this.j.a(iyh.b, null);
                }
            }
        }
        this.a.execute(gqk.i(new cdw((Object)this, n2, 7, null)));
    }

    @Override
    public final void f(Object object) {
        object = gqk.i(new hsk(this, object, 6));
        this.a.execute((Runnable)object);
    }

    public final void g() {
        block3: {
            int n2;
            block2: {
                n2 = this.e.e - 1;
                if (n2 == 1) break block2;
                if (n2 != 3) break block3;
                for (htb htb2 : this.c) {
                    this.l(htb2, htb2.c, this.e.a);
                }
                break block3;
            }
            for (htb htb3 : this.c) {
                n2 = htb3.c;
                int n3 = this.e.c;
                if (n2 > n3) continue;
                this.l(htb3, n2, n3 + 1);
            }
        }
    }

    public final void h(iwx object) {
        block4: {
            gpm gpm2 = this.o(this.q, (iwx)object, this.k.b());
            int n2 = this.e.b;
            gzx gzx2 = (gzx)this.m.get(n2);
            int n3 = gzx2.size();
            for (n2 = 0; n2 < n3; ++n2) {
                hsy hsy2 = (hsy)gzx2.get(n2);
                htl htl2 = hsy2.c(this.p(gpm2));
                if (htl2.c.equals((Object)htk.d)) {
                    object = htl2.a();
                    this.n.put(hsy2, object);
                    object.c(gqk.i(new hsk((Object)this, (Object)gpm2, 7, null)), this.a);
                }
                if (!this.n(htl2)) {
                    this.o.add(hsy2);
                    continue;
                }
                break block4;
            }
            if (this.n.isEmpty()) {
                this.m();
            }
        }
    }

    public final void i(gpm gpm2) {
        block4: {
            if (!this.n.isEmpty()) {
                Object object;
                Iterator iterator = this.n.entrySet().iterator();
                while (iterator.hasNext() && ((hpn)(object = iterator.next()).getValue()).isDone()) {
                    iterator.remove();
                    hsy hsy2 = (hsy)object.getKey();
                    htl htl2 = hsy2.b(this.p(gpm2));
                    if (htl2.c.equals((Object)htk.d)) {
                        object = htl2.a();
                        this.n.put(hsy2, object);
                        object.c(gqk.i(new hsk((Object)this, (Object)gpm2, 9, null)), this.a);
                    }
                    if (!this.n(htl2)) continue;
                    break block4;
                }
                if (this.n.isEmpty() && !this.h) {
                    this.m();
                }
            }
        }
    }

    public final void j(bzq bzq2, htb htb2) {
        block3: {
            Object object;
            Iterator iterator = htb2.b.entrySet().iterator();
            while (iterator.hasNext() && ((hpn)(object = iterator.next()).getValue()).isDone()) {
                iterator.remove();
                hsy hsy2 = (hsy)object.getKey();
                htl htl2 = hsy2.a();
                if (htl2.c.equals((Object)htk.d)) {
                    object = htl2.a();
                    htb2.b.put(hsy2, object);
                    object.c(gqk.i(new hst(this, bzq2, htb2, 5, null)), this.a);
                }
                if (!this.n(htl2)) continue;
                break block3;
            }
            if (htb2.b.isEmpty()) {
                this.k();
                this.b();
            }
        }
    }
}

