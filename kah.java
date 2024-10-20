/*
 * Decompiled with CFR 0.152.
 */
public final class kah
extends jqo
implements jyy,
jqp {
    public final jyy a;
    public final jqf b;
    public final int c;
    private jqf d;
    private jqb e;

    public kah(jyy jyy2, jqf jqf2) {
        super(kae.a, jqg.a);
        this.a = jyy2;
        this.b = jqf2;
        this.c = ((Number)jqf2.fold(0, ghk.h)).intValue();
    }

    @Override
    protected final Object a(Object object) {
        Object object2 = joe.a(object);
        if (object2 != null) {
            this.d = new kab((Throwable)object2, ((jqo)this).d());
        }
        if ((object2 = this.e) != null) {
            object2.bD(object);
        }
        return jqh.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bJ(Object object, jqb jqb2) {
        block8: {
            try {
                Object object2 = jqb2.d();
                jns.at((jqf)object2);
                Object object3 = this.d;
                if (object3 != object2) {
                    if (object3 instanceof kab) {
                        object3 = (kab)object3;
                        Throwable throwable = ((kab)object3).a;
                        object3 = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                        ((StringBuilder)object3).append(throwable);
                        ((StringBuilder)object3).append(", but then emission attempt of value '");
                        ((StringBuilder)object3).append(object);
                        ((StringBuilder)object3).append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                        object2 = new IllegalStateException(jse.s(((StringBuilder)object3).toString()));
                        throw object2;
                    }
                    object3 = new kak(this, 0);
                    if (((Number)object2.fold(0, (jro)object3)).intValue() != this.c) {
                        object3 = this.b;
                        StringBuilder stringBuilder = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
                        stringBuilder.append(object3);
                        stringBuilder.append(",\n\t\tbut emission happened in ");
                        stringBuilder.append(object2);
                        stringBuilder.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                        object = new IllegalStateException(stringBuilder.toString());
                        throw object;
                    }
                    this.d = object2;
                }
                this.e = jqb2;
                object2 = kaj.a;
                object2 = this.a;
                jse.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
                object = object2.bJ(object, this);
                if (!jse.i(object, (Object)jqh.a)) {
                    this.e = null;
                }
                if (object != jqh.a) break block8;
            }
            catch (Throwable throwable) {
                this.d = new kab(throwable, jqb2.d());
                throw throwable;
            }
            jsd.j(jqb2);
        }
        if (object == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    public final jqp bx() {
        jqb jqb2 = this.e;
        if (jqb2 instanceof jqp) {
            return jqb2;
        }
        return null;
    }

    @Override
    public final void by() {
    }

    @Override
    public final jqf d() {
        jqf jqf2;
        jqf jqf3 = jqf2 = this.d;
        if (jqf2 == null) {
            jqf3 = jqg.a;
        }
        return jqf3;
    }

    @Override
    public final void g() {
        super.g();
    }
}

