/*
 * Decompiled with CFR 0.152.
 */
public final class avv
extends jqs
implements jro {
    int a;
    Object b;
    final boolean c;
    final aum d;
    final jrk e;

    public avv(boolean bl2, aum aum2, jqb jqb2, jrk jrk2) {
        this.c = bl2;
        this.d = aum2;
        this.e = jrk2;
        super(2, jqb2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object a(Object object) {
        Object object2;
        Object object3;
        block6: {
            block2: {
                jqh jqh2;
                block7: {
                    block8: {
                        block3: {
                            block4: {
                                block5: {
                                    jqh2 = jqh.a;
                                    int n2 = this.a;
                                    if (n2 == 0) break block2;
                                    if (n2 == 1) break block3;
                                    if (n2 == 2) break block4;
                                    if (n2 == 3) break block5;
                                    object3 = this.b;
                                    jns.ak(object);
                                    object2 = object;
                                    break block6;
                                }
                                object2 = (avk)this.b;
                                jns.ak(object);
                                break block7;
                            }
                            object3 = (avk)this.b;
                            jns.ak(object);
                            break block8;
                        }
                        object2 = (avk)this.b;
                        jns.ak(object);
                        object3 = object2;
                        if (!((Boolean)object).booleanValue()) {
                            object = this.d.b();
                            this.b = object2;
                            this.a = 2;
                            if (((aue)object).a(this) == jqh2) return jqh2;
                            object3 = object2;
                        }
                    }
                    object = new avu(null, this.e);
                    this.b = object3;
                    this.a = 3;
                    Object object4 = ((avk)object3).c(0, (jro)object, this);
                    object2 = object3;
                    object = object4;
                    if (object4 == jqh2) {
                        return jqh2;
                    }
                }
                object3 = object;
                if (this.c) return object3;
                this.b = object;
                this.a = 4;
                if ((object2 = ((avk)object2).b()) == jqh2) return jqh2;
                object3 = object;
                break block6;
            }
            jns.ak(object);
            object = (avk)this.b;
            jse.c(object, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            object = ((avk)object).a;
            return this.e.a(object);
        }
        if ((Boolean)object2 != false) return object3;
        object = this.d.b();
        ((aue)object).c.f(((aue)object).f, ((aue)object).g);
        return object3;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jrk jrk2 = this.e;
        jqb2 = new avv(this.c, this.d, jqb2, jrk2);
        ((avv)jqb2).b = object;
        return jqb2;
    }
}

