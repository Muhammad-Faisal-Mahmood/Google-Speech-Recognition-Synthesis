/*
 * Decompiled with CFR 0.152.
 */
final class jzu
extends jqs
implements jro {
    int a;
    Object b;
    final Object c;
    private final int d;

    public jzu(jyy jyy2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = jyy2;
        super(2, jqb2);
    }

    public jzu(jzt jzt2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = jzt2;
        super(2, jqb2);
    }

    public jzu(jzv jzv2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = jzv2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                jqh jqh2 = jqh.a;
                n2 = this.a;
                jns.ak(object);
                if (n2 == 0) {
                    Object object2 = this.b;
                    object = this.c;
                    this.a = 1;
                    if (object.bJ(object2, this) == jqh2) {
                        return jqh2;
                    }
                }
                return jon.a;
            }
            jqh jqh3 = jqh.a;
            if (this.a != 0) {
                jns.ak(object);
            } else {
                jns.ak(object);
                object = (jyh)this.b;
                Object object3 = this.c;
                this.a = 1;
                if (((jzt)object3).b((jyh)object, this) == jqh3) {
                    return jqh3;
                }
            }
            return jon.a;
        }
        jqh jqh4 = jqh.a;
        if (this.a != 0) {
            jns.ak(object);
        } else {
            jns.ak(object);
            object = (jyy)this.b;
            Object object4 = this.c;
            this.a = 1;
            if (((jzv)object4).f((jyy)object, this) == jqh4) {
                return jqh4;
            }
        }
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                object = ((jqm)this).c(object, (jqb)object2);
                object2 = jon.a;
                return ((jzu)object).a(object2);
            }
            object = ((jqm)this).c((jyh)object, (jqb)object2);
            object2 = jon.a;
            return ((jzu)object).a(object2);
        }
        object = ((jqm)this).c((jyy)object, (jqb)object2);
        object2 = jon.a;
        return ((jzu)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                jqb2 = new jzu((jyy)this.c, jqb2, 2);
                ((jzu)jqb2).b = object;
                return jqb2;
            }
            jqb2 = new jzu((jzt)this.c, jqb2, 1);
            ((jzu)jqb2).b = object;
            return jqb2;
        }
        jqb2 = new jzu((jzv)this.c, jqb2, 0);
        ((jzu)jqb2).b = object;
        return jqb2;
    }
}

