/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class jia
implements jcl {
    final jib a;
    public final jid b;

    public jia(jid jid2, jib jib2) {
        this.b = jid2;
        this.a = jib2;
    }

    private static final Integer b(iwx object) {
        if ((object = (String)((iwx)object).b(jid.b)) != null) {
            try {
                object = Integer.valueOf((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                object = -1;
            }
        } else {
            object = null;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void a(iyh object, jck object2, iwx object3) {
        block33: {
            Object object4;
            Object object5;
            Object object6;
            block34: {
                boolean bl2;
                long l2;
                block40: {
                    block39: {
                        block37: {
                            block38: {
                                block36: {
                                    boolean bl3;
                                    Object object7;
                                    Collection collection;
                                    block35: {
                                        object6 = this.b.l;
                                        // MONITORENTER : object6
                                        collection = this.b;
                                        object5 = ((jid)((Object)collection)).q;
                                        object7 = this.a;
                                        bl3 = true;
                                        ((jib)object7).b = true;
                                        object4 = object5;
                                        if (((jhy)object5).c.contains(object7)) {
                                            object4 = new ArrayList(((jhy)object5).c);
                                            object4.remove(object7);
                                            object7 = DesugarCollections.unmodifiableCollection(object4);
                                            object4 = new jhy(((jhy)object5).b, (Collection)object7, ((jhy)object5).d, ((jhy)object5).f, ((jhy)object5).g, ((jhy)object5).a, ((jhy)object5).h, ((jhy)object5).e);
                                        }
                                        ((jid)((Object)collection)).q = object4;
                                        this.b.p.a((Object)((iyh)object).n);
                                        // MONITOREXIT : object6
                                        if (this.b.t.decrementAndGet() == Integer.MIN_VALUE) {
                                            object = this.b;
                                            object2 = new jhz(this, 0);
                                            ((jid)object).g.execute((Runnable)object2);
                                            return;
                                        }
                                        object4 = this.a;
                                        if (((jib)object4).c) {
                                            this.b.r((jib)object4);
                                            if (this.b.q.f != this.a) return;
                                            this.b.v((iyh)object, (jck)((Object)object2), (iwx)object3);
                                            return;
                                        }
                                        if (object2 == jck.d && this.b.s.incrementAndGet() > 1000) {
                                            this.b.r(this.a);
                                            if (this.b.q.f != this.a) return;
                                            object = iyh.j.e("Too many transparent retries. Might be a bug in gRPC").d(new iyj((iyh)object));
                                            this.b.v((iyh)object, (jck)((Object)object2), (iwx)object3);
                                            return;
                                        }
                                        if (this.b.q.f != null) break block33;
                                        if (object2 == jck.d || object2 == jck.b && this.b.r.compareAndSet(false, true)) break block34;
                                        if (object2 != jck.c) break block35;
                                        object4 = this.b;
                                        if (((jid)object4).k) {
                                            ((jid)object4).u();
                                        }
                                        break block33;
                                    }
                                    this.b.r.set(true);
                                    object4 = this.b;
                                    if (!((jid)object4).k) break block36;
                                    object5 = jia.b((iwx)object3);
                                    object6 = this.b;
                                    object4 = ((iyh)object).n;
                                    boolean bl4 = ((jid)object6).j.c.contains(object4);
                                    boolean bl5 = this.b.o != null && (bl4 || object5 != null && (Integer)object5 < 0) ? this.b.o.b() ^ true : false;
                                    object4 = object5;
                                    if (bl4) {
                                        object4 = object5;
                                        if (!bl5) {
                                            object4 = object5;
                                            if (!((iyh)object).g()) {
                                                object4 = object5;
                                                if (object5 != null) {
                                                    object4 = object5;
                                                    if ((Integer)object5 > 0) {
                                                        object4 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (bl5 = bl4 && !bl5 ? bl3 : false) {
                                        object6 = this.b;
                                        if (object4 != null) {
                                            if ((Integer)object4 < 0) {
                                                ((jid)object6).u();
                                            } else {
                                                object5 = ((jid)object6).l;
                                                // MONITORENTER : object5
                                                collection = ((jid)object6).x;
                                                if (collection == null) {
                                                    // MONITOREXIT : object5
                                                } else {
                                                    object7 = ((jhw)((Object)collection)).a();
                                                    collection = new Collection(((jid)object6).l);
                                                    ((jid)object6).x = collection;
                                                    // MONITOREXIT : object5
                                                    if (object7 != null) {
                                                        object7.cancel(false);
                                                    }
                                                    ((jhw)((Object)collection)).b(((jid)object6).h.schedule(new cdn(object6, collection, 3), (long)((Integer)object4).intValue(), TimeUnit.MILLISECONDS));
                                                }
                                            }
                                        }
                                    }
                                    object4 = this.b.l;
                                    // MONITORENTER : object4
                                    object6 = this.b;
                                    object5 = ((jid)object6).q;
                                    collection = this.a;
                                    object7 = new ArrayList(((jhy)object5).d);
                                    object7.remove(collection);
                                    collection = DesugarCollections.unmodifiableCollection(object7);
                                    ((jid)object6).q = object7 = new jhy(((jhy)object5).b, ((jhy)object5).c, collection, ((jhy)object5).f, ((jhy)object5).g, ((jhy)object5).a, ((jhy)object5).h, ((jhy)object5).e);
                                    if (bl5 && (((jid)(object5 = this.b)).w(((jid)object5).q) || !this.b.q.d.isEmpty())) {
                                        // MONITOREXIT : object4
                                        return;
                                    }
                                    // MONITOREXIT : object4
                                    break block33;
                                }
                                object4 = ((jid)object4).i;
                                l2 = 0L;
                                if (object4 == null) break block37;
                                object5 = ((iyh)object).n;
                                boolean bl6 = ((jie)object4).f.contains(object5);
                                object6 = jia.b((iwx)object3);
                                bl2 = this.b.o != null && (bl6 || object6 != null && (Integer)object6 < 0) ? this.b.o.b() ^ true : false;
                                object4 = this.b;
                                object5 = this.a;
                                if (((jid)object4).i.a <= ((jib)object5).d + 1 || bl2) break block37;
                                if (object6 != null) break block38;
                                if (!bl6) break block37;
                                double d2 = ((jid)object4).y;
                                double d3 = jid.d.nextDouble();
                                object4 = this.b;
                                double d4 = ((jid)object4).y;
                                object5 = ((jid)object4).i;
                                ((jid)object4).y = Math.min((long)(d4 * ((jie)object5).d), ((jie)object5).c);
                                l2 = (long)(d2 * d3);
                                break block39;
                            }
                            if ((Integer)object6 < 0) break block37;
                            l2 = TimeUnit.MILLISECONDS.toNanos(((Integer)object6).intValue());
                            object4 = this.b;
                            ((jid)object4).y = ((jid)object4).i.b;
                            break block39;
                        }
                        bl2 = false;
                        break block40;
                    }
                    bl2 = true;
                }
                if (bl2) {
                    object2 = this.b.p(this.a.d + 1, false);
                    if (object2 == null) return;
                    object3 = this.b.l;
                    // MONITORENTER : object3
                    object4 = this.b;
                    ((jid)object4).w = object = new jhw(((jid)object4).l);
                    // MONITOREXIT : object3
                    object3 = this.b;
                    object2 = new hst(this, (jhw)object, (jib)object2, 12);
                    ((jhw)object).b(((jid)object3).h.schedule((Runnable)object2, l2, TimeUnit.NANOSECONDS));
                    return;
                }
                break block33;
            }
            object = this.b.p(this.a.d, true);
            if (object == null) return;
            object2 = this.b;
            if (((jid)object2).k) {
                object2 = ((jid)object2).l;
                // MONITORENTER : object2
                object3 = this.b;
                object4 = ((jid)object3).q;
                object5 = this.a;
                object6 = new ArrayList(((jhy)object4).d);
                object6.remove(object5);
                object6.add(object);
                object6 = DesugarCollections.unmodifiableCollection(object6);
                ((jid)object3).q = object5 = new jhy(((jhy)object4).b, ((jhy)object4).c, (Collection)object6, ((jhy)object4).f, ((jhy)object4).g, ((jhy)object4).a, ((jhy)object4).h, ((jhy)object4).e);
                // MONITOREXIT : object2
            }
            object2 = this.b;
            object = new jdg(this, object, 18, null);
            ((jid)object2).f.execute((Runnable)object);
            return;
        }
        this.b.r(this.a);
        if (this.b.q.f != this.a) return;
        this.b.v((iyh)object, (jck)((Object)object2), (iwx)object3);
    }

    @Override
    public final void c(iwx object) {
        Object object2;
        if (this.a.d > 0) {
            ((iwx)object).e(jid.a);
            object2 = this.a;
            ((iwx)object).g(jid.a, String.valueOf(((jib)object2).d));
        }
        this.b.r(this.a);
        if (this.b.q.f == this.a) {
            object2 = this.b.o;
            if (object2 != null) {
                int n2;
                int n3;
                int n4;
                while ((n4 = ((jic)object2).d.get()) != (n3 = ((jic)object2).a) && !((jic)object2).d.compareAndSet(n4, Math.min((n2 = ((jic)object2).c) + n4, n3))) {
                }
            }
            object2 = this.b;
            object = new jdg(this, object, 16);
            ((jid)object2).g.execute((Runnable)object);
        }
    }

    @Override
    public final void d(jjq object) {
        Object object2 = this.b.q;
        boolean bl2 = ((jhy)object2).f != null;
        fxf.B(bl2, "Headers should be received prior to messages.");
        if (((jhy)object2).f != this.a) {
            jeb.g((jjq)object);
            return;
        }
        object2 = this.b;
        object = new jdg(this, object, 19, null);
        ((jid)object2).g.execute((Runnable)object);
    }

    @Override
    public final void e() {
        if (!this.b.o()) {
            return;
        }
        jid jid2 = this.b;
        jhz jhz2 = new jhz(this, 2);
        jid2.g.execute(jhz2);
    }
}

