/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class epy
extends jqs
implements jro {
    int a;
    final Object b;
    final Object c;
    private Object d;
    private final int e;

    public epy(dzl dzl2, Executor executor, jqb jqb2, int n2) {
        this.e = n2;
        this.b = dzl2;
        this.c = executor;
        super(2, jqb2);
    }

    public epy(eqa eqa2, jrk jrk2, jqb jqb2, int n2) {
        this.e = n2;
        this.b = eqa2;
        this.c = jrk2;
        super(2, jqb2);
    }

    public epy(jrk jrk2, epz epz2, jqb jqb2, int n2) {
        this.e = n2;
        this.c = jrk2;
        this.b = epz2;
        super(2, jqb2);
    }

    public epy(jro jro2, po po2, jqb jqb2, int n2) {
        this.e = n2;
        this.c = jro2;
        this.b = po2;
        super(2, jqb2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        Throwable throwable422222;
        Object object2;
        Object object3;
        block26: {
            block27: {
                Object object4;
                block25: {
                    block28: {
                        Object object5;
                        block30: {
                            Throwable throwable2222222;
                            block29: {
                                block24: {
                                    int n2 = this.e;
                                    if (n2 == 0) break block27;
                                    if (n2 == 1) break block28;
                                    if (n2 != 2) {
                                        Object object6;
                                        jqh jqh2 = jqh.a;
                                        n2 = this.a;
                                        if (n2 != 0) {
                                            if (n2 != 1) {
                                                jns.ak(object);
                                                return jon.a;
                                            }
                                            object6 = (jyh)this.d;
                                            jns.ak(object);
                                            object = object6;
                                        } else {
                                            jns.ak(object);
                                            object = (jyh)this.d;
                                            object6 = this.b.a(new ewi((jyh)object, (Executor)this.c));
                                            this.d = object;
                                            this.a = 1;
                                            if (jsd.l((hpn)object6, this) == jqh2) return jqh2;
                                        }
                                        object6 = aud.e;
                                        this.d = null;
                                        this.a = 2;
                                        if (jns.am((jyh)object, (jqz)object6, this) != jqh2) return jon.a;
                                        return jqh2;
                                    }
                                    object5 = jqh.a;
                                    if (this.a != 0) {
                                        jns.ak(object);
                                        break block24;
                                    }
                                    jns.ak(object);
                                    object = (jvb)this.d;
                                    object = this.b;
                                    try {
                                        Object object7;
                                        this.a = 1;
                                        object = object7 = object.g(this);
                                        if (object7 != object5) break block24;
                                        return object5;
                                    }
                                    catch (Throwable throwable2222222) {}
                                }
                                boolean bl2 = ((ebt)object).b == 1;
                                break block29;
                                object = bl2;
                                break block30;
                            }
                            object = jns.aj(throwable2222222);
                        }
                        object5 = object;
                        if (object instanceof jod) {
                            object5 = false;
                        }
                        if ((Boolean)object5 != false) return jon.a;
                        this.c.a(ebv.g);
                        return jon.a;
                    }
                    object4 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(object);
                        break block25;
                    }
                    jns.ak(object);
                    object = (jvb)this.d;
                    Object object8 = this.c;
                    this.a = 1;
                    object = object8 = object8.b(object, this);
                    if (object8 != object4) break block25;
                    return object4;
                }
                try {
                    ((po)this.b).c(object);
                    return jon.a;
                }
                catch (Throwable throwable3) {}
                ((po)this.b).d(throwable3);
                return jon.a;
                catch (CancellationException cancellationException) {
                    object = (po)this.b;
                    ((po)object).d = true;
                    object4 = ((po)object).b;
                    if (object4 == null) return jon.a;
                    if (!((ps)object4).b.cancel(true)) return jon.a;
                    ((po)object).b();
                }
                return jon.a;
            }
            object3 = jqh.a;
            if (this.a != 0) {
                jns.ak(object);
                break block26;
            }
            jns.ak(object);
            object = (jvb)this.d;
            object = this.b;
            try {
                object = hhk.L(object.f());
                jse.d(object, "nonCancellationPropagating(...)");
                this.a = 1;
                object = object2 = jsd.l((hpn)object, this);
                if (object2 != object3) break block26;
                return object3;
            }
            catch (Throwable throwable422222) {}
        }
        object = (eav)object;
        object = jns.aj(throwable422222);
        object2 = this.c;
        object3 = joe.a(object);
        if (object3 == null) {
            object3 = ebg.b(((eav)object).c);
            object = object3;
            if (object3 == null) {
                object = ebg.a;
            }
            jse.d(object, "getDisconnectReason(...)");
            object2.a(object);
            return jon.a;
        } else {
            if (object3 instanceof CancellationException) return jon.a;
            object2.a(ebg.G);
        }
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    object = ((jqm)this).c((jyh)object, (jqb)object2);
                    object2 = jon.a;
                    return ((epy)object).a(object2);
                }
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((epy)object).a(object2);
            }
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((epy)object2).a(object);
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((epy)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    jqb2 = new epy((dzl)this.b, (Executor)this.c, jqb2, 3);
                    ((epy)jqb2).d = object;
                    return jqb2;
                }
                jqb2 = new epy((jrk)this.c, (epz)this.b, jqb2, 2);
                ((epy)jqb2).d = object;
                return jqb2;
            }
            jqb2 = new epy((jro)this.c, (po)this.b, jqb2, 1);
            ((epy)jqb2).d = object;
            return jqb2;
        }
        jqb2 = new epy((eqa)this.b, (jrk)this.c, jqb2, 0);
        ((epy)jqb2).d = object;
        return jqb2;
    }
}

