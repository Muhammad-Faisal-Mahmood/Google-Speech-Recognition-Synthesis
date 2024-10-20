/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public abstract class gto
implements Serializable {
    private static final long serialVersionUID = 0L;

    public static gto h(Object object) {
        object = object == null ? gsl.a : new gtt(object);
        return object;
    }

    public static gto i(Object object) {
        fxf.K(object);
        return new gtt(object);
    }

    public abstract gto a(gto var1);

    public abstract gto b(gte var1);

    public abstract Object c();

    public abstract Object d(gui var1);

    public abstract Object e(Object var1);

    public abstract boolean equals(Object var1);

    public abstract Object f();

    public abstract boolean g();

    public abstract int hashCode();
}

