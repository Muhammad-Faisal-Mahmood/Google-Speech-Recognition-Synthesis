/*
 * Decompiled with CFR 0.152.
 */
public class jue
extends jwp
implements jwi,
jqb,
jvb,
jvi {
    public final jqf a;

    public jue(jqf jqf2, boolean bl2) {
        super(bl2);
        this.I((jwi)jqf2.get(jwi.c));
        this.a = jqf2.plus(this);
    }

    @Override
    protected final String a() {
        return String.valueOf(jvf.a(this)).concat(" was cancelled");
    }

    @Override
    public String b() {
        Object object;
        Object object2;
        boolean bl2 = jve.a;
        Object object3 = null;
        if (bl2 && (object2 = (juz)(object = this.a).get(juz.b)) != null) {
            object3 = (jva)object.get(jva.b);
            object3 = object3 != null ? ((jva)object3).a : "coroutine";
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append("#");
            ((StringBuilder)object).append(((juz)object2).a);
            object3 = ((StringBuilder)object).toString();
        }
        if (object3 == null) {
            return jvf.a(this);
        }
        object2 = jvf.a(this);
        object = new StringBuilder("\"");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append("\":");
        ((StringBuilder)object).append((String)object2);
        return ((StringBuilder)object).toString();
    }

    @Override
    public final jqf bA() {
        return this.a;
    }

    protected void bB(Object object) {
        this.bG(object);
    }

    @Override
    protected final void bC(Object object) {
        if (object instanceof jut) {
            object = (jut)object;
            this.j(((jut)object).b, ((jut)object).c.b());
            return;
        }
        this.k(object);
    }

    @Override
    public final void bD(Object object) {
        if ((object = this.C(jsl.n(object))) == jwq.b) {
            return;
        }
        this.bB(object);
    }

    @Override
    public final Object bE() {
        return this.A();
    }

    @Override
    public final jqf d() {
        return this.a;
    }

    @Override
    public final void i(Throwable throwable) {
        jvf.i(this.a, throwable);
    }

    protected void j(Throwable throwable, boolean bl2) {
    }

    protected void k(Object object) {
    }

    @Override
    public final Object m(jqb jqb2) {
        return this.y(jqb2);
    }
}

