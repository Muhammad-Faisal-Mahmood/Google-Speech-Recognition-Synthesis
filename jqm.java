/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Objects;

public abstract class jqm
implements Serializable,
jqb,
jqp {
    public final jqb k;

    public jqm(jqb jqb2) {
        this.k = jqb2;
    }

    protected abstract Object a(Object var1);

    @Override
    public final void bD(Object object) {
        jqb jqb2 = this;
        do {
            jsd.i(jqb2);
            jqm jqm2 = jqb2;
            jqb2 = jqm2.k;
            jse.b(jqb2);
            try {
                object = jqm2.a(object);
                jqh jqh2 = jqh.a;
                if (object == jqh2) {
                    return;
                }
            }
            catch (Throwable throwable) {
                object = jns.aj(throwable);
            }
            jqm2.g();
        } while (jqb2 instanceof jqm);
        jqb2.bD(object);
    }

    @Override
    public jqp bx() {
        jqb jqb2 = this.k;
        if (jqb2 instanceof jqp) {
            return (jqp)((Object)jqb2);
        }
        return null;
    }

    @Override
    public void by() {
    }

    public jqb c(Object object, jqb jqb2) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void g() {
    }

    public String toString() {
        String string = this.getClass().getName();
        Objects.toString(string);
        return "Continuation at ".concat(String.valueOf(string));
    }
}

