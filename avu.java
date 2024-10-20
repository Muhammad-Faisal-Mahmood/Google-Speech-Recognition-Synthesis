/*
 * Decompiled with CFR 0.152.
 */
public final class avu
extends jqs
implements jro {
    final jrk a;
    private Object b;

    public avu(jqb jqb2, jrk jrk2) {
        this.a = jrk2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jns.ak(object);
        object = (avi)this.b;
        jse.c(object, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
        object = ((avi)object).a.a;
        return this.a.a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new avu(jqb2, this.a);
        ((avu)jqb2).b = object;
        return jqb2;
    }
}

