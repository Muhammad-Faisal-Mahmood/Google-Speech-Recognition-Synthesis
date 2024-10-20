/*
 * Decompiled with CFR 0.152.
 */
import java.util.IdentityHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jfl
extends ixf {
    final jfk a;
    final ixi b;
    final jfs c;

    public jfl(jfs jfs2, jfk jfk2, ixi ixi2) {
        this.c = jfs2;
        this.a = jfk2;
        a.s(ixi2, "resolver");
        this.b = ixi2;
    }

    @Override
    public final iyh a(ixg object) {
        block33: {
            block34: {
                block35: {
                    Object object2;
                    Object object3;
                    block37: {
                        Object object4;
                        block36: {
                            Object object5;
                            block32: {
                                block31: {
                                    this.c.m.c();
                                    object4 = this.c;
                                    if (((jfs)object4).r != this.b) break block33;
                                    object3 = ((ixg)object).a;
                                    ((jfs)object4).G.b(1, "Resolved address: {0}, config={1}", object3, ((ixg)object).b);
                                    object4 = this.c;
                                    if (((jfs)object4).S != 2) {
                                        ((jfs)object4).G.b(2, "Address resolved: {0}", object3);
                                        this.c.S = 2;
                                    }
                                    Object object6 = ((ixg)object).c;
                                    object5 = (ivl)((ixg)object).b.a(ivl.a);
                                    object2 = object6 != null && (object4 = ((ixd)object6).b) != null ? (jgd)object4 : null;
                                    object4 = object6 != null ? ((ixd)object6).a : null;
                                    Object object7 = this.c;
                                    if (!((jfs)object7).M) {
                                        if (object2 != null) {
                                            ((jfs)object7).G.a(2, "Service config from name resolver discarded by channel settings");
                                        }
                                        object6 = this.c;
                                        object4 = object2 = ((jfs)object6).K;
                                        if (object2 == null) {
                                            object4 = jfs.d;
                                        }
                                        if (object5 != null) {
                                            ((jfs)object6).G.a(2, "Config selector from name resolver discarded by channel settings");
                                        }
                                        object2 = this.c;
                                        object5 = ((jgd)object4).a();
                                        ((jfs)object2).I.d((ivl)object5);
                                    } else {
                                        if (object2 != null) {
                                            if (object5 != null) {
                                                ((jfs)object7).I.d((ivl)object5);
                                                object4 = object2;
                                                if (((jgd)object2).a() != null) {
                                                    this.c.G.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                                                    object4 = object2;
                                                }
                                            } else {
                                                ((jfs)object7).I.d(((jgd)object2).a());
                                                object4 = object2;
                                            }
                                        } else {
                                            object2 = ((jfs)object7).K;
                                            if (object2 != null) {
                                                ((jfs)object7).I.d(((jgd)object2).a());
                                                this.c.G.a(2, "Received no service config, using default service config");
                                                object4 = object2;
                                            } else if (object4 != null) {
                                                if (!((jfs)object7).L) {
                                                    ((jfs)object7).G.a(2, "Fallback to error due to invalid first service config without default config");
                                                    this.b(((ixd)object6).a);
                                                    return ((ixd)object6).a;
                                                }
                                                object4 = ((jfs)object7).J;
                                            } else {
                                                object2 = ((jfs)object7).I;
                                                object4 = jfs.d;
                                                ((jfp)object2).d(null);
                                            }
                                        }
                                        if (!((jgd)object4).equals(this.c.J)) {
                                            object5 = this.c;
                                            object2 = object4 == jfs.d ? " to empty" : "";
                                            ((jfs)object5).G.b(2, "Service config changed{0}", object2);
                                            object5 = this.c;
                                            ((jfs)object5).J = object4;
                                            ((jfs)object5).R.a = object2 = ((jgd)object4).a;
                                        }
                                        try {
                                            this.c.L = true;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            object7 = this.c.h;
                                            object6 = jfs.a;
                                            object5 = Level.WARNING;
                                            String string = String.valueOf(object7);
                                            object7 = new StringBuilder("[");
                                            ((StringBuilder)object7).append(string);
                                            ((StringBuilder)object7).append("] Unexpected exception from parsing service config");
                                            ((Logger)object6).logp((Level)object5, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", ((StringBuilder)object7).toString(), runtimeException);
                                        }
                                    }
                                    object = ((ixg)object).b;
                                    if (this.a != this.c.t) break block34;
                                    object = new kpy((its)object);
                                    object2 = ivl.a;
                                    if (((its)((kpy)object).a).b.containsKey(object2)) {
                                        object5 = new IdentityHashMap(((its)((kpy)object).a).b);
                                        ((IdentityHashMap)object5).remove(object2);
                                        ((kpy)object).a = new its((IdentityHashMap)object5);
                                    }
                                    if ((object5 = ((kpy)object).b) != null) {
                                        ((IdentityHashMap)object5).remove(object2);
                                    }
                                    if ((object2 = ((jgd)object4).c) != null) {
                                        ((kpy)object).b(iwh.a, object2);
                                        ((kpy)object).a();
                                    }
                                    object = ((kpy)object).a();
                                    object2 = this.a.a;
                                    object3 = new iwd((List)object3, (its)object, ((jgd)object4).b);
                                    object = object4 = (jji)((iwd)object3).c;
                                    if (object4 != null) break block32;
                                    object4 = ((jbp)object2).d;
                                    object = ((ksb)object4).a;
                                    object4 = ((iwj)((ksb)object4).b).a((String)object);
                                    if (object4 == null) break block31;
                                    object = new jji((iwi)object4, null);
                                    break block32;
                                }
                                try {
                                    object4 = new jbt(a.aq("using default policy", (String)object, "Trying to load '", "' because ", ", but it's unavailable"));
                                    throw object4;
                                }
                                catch (jbt jbt2) {
                                    object = iyh.j.e(jbt2.getMessage());
                                    ((jbp)object2).a.f(iui.c, new jbr((iyh)object));
                                    ((jbp)object2).b.e();
                                    ((jbp)object2).c = null;
                                    ((jbp)object2).b = new jbs();
                                    object = iyh.b;
                                }
                                break block35;
                            }
                            if ((object5 = ((jbp)object2).c) == null) break block36;
                            object4 = ((jji)object).a;
                            object5 = ((iwi)object5).c();
                            if (((iwi)object4).c().equals(object5)) break block37;
                        }
                        ((jbp)object2).a.f(iui.a, new jbq());
                        ((jbp)object2).b.e();
                        ((jbp)object2).c = ((jji)object).a;
                        object4 = ((jbp)object2).b;
                        ((jbp)object2).b = ((jbp)object2).c.a(((jbp)object2).a);
                        ((jbp)object2).a.a().b(2, "Load balancer changed from {0} to {1}", object4.getClass().getSimpleName(), ((jbp)object2).b.getClass().getSimpleName());
                    }
                    if ((object = ((jji)object).b) != null) {
                        ((jbp)object2).a.a().b(1, "Load-balancing config: {0}", object);
                    }
                    object = ((jbp)object2).b.a(new iwd(((iwd)object3).a, ((iwd)object3).b, object));
                }
                return object;
            }
            return iyh.b;
        }
        return iyh.b;
    }

    @Override
    public final void b(iyh object) {
        fxf.r(((iyh)object).g() ^ true, "the error status must not be OK");
        object = new jdg(this, object, 11);
        this.c.m.execute((Runnable)object);
    }

    @Override
    public final void c(ixg object) {
        object = new jdg(this, object, 12);
        this.c.m.execute((Runnable)object);
    }
}

