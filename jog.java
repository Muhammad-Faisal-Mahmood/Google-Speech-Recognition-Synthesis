/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class jog
implements Serializable,
jny {
    private jqz a;
    private volatile Object b;
    private final Object c;

    public /* synthetic */ jog(jqz jqz2) {
        this.a = jqz2;
        this.b = jok.a;
        this.c = this;
    }

    private final Object writeReplace() {
        return new jnw(this.a());
    }

    @Override
    public final Object a() {
        Object object = this.b;
        if (object != jok.a) {
            return object;
        }
        Object object2 = this.c;
        synchronized (object2) {
            object = this.b;
            if (object == jok.a) {
                object = this.a;
                jse.b(object);
                this.b = object = object.a();
                this.a = null;
            }
            return object;
        }
    }

    @Override
    public final boolean b() {
        return this.b != jok.a;
    }

    public final String toString() {
        String string = this.b() ? String.valueOf(this.a()) : "Lazy value not initialized yet.";
        return string;
    }
}

