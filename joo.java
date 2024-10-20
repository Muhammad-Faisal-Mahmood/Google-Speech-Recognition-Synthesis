/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class joo
implements Serializable,
jny {
    private jqz a;
    private Object b;

    public joo(jqz jqz2) {
        this.a = jqz2;
        this.b = jok.a;
    }

    private final Object writeReplace() {
        return new jnw(this.a());
    }

    @Override
    public final Object a() {
        if (this.b == jok.a) {
            jqz jqz2 = this.a;
            jse.b(jqz2);
            this.b = jqz2.a();
            this.a = null;
        }
        return this.b;
    }

    @Override
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        String string = this.b != jok.a ? String.valueOf(this.a()) : "Lazy value not initialized yet.";
        return string;
    }
}

