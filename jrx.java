/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public abstract class jrx
implements Serializable,
jsz {
    public static final Object b = jrw.a;
    private transient jsz a;
    public final Object c;
    public final String d;
    public final String e;
    private final Class f;
    private final boolean g;

    protected jrx(Object object, Class clazz, String string, String string2, boolean bl2) {
        this.c = object;
        this.f = clazz;
        this.d = string;
        this.e = string2;
        this.g = bl2;
    }

    public final jsz c() {
        jsz jsz2 = this.a;
        if (jsz2 == null) {
            this.f();
            this.a = this;
            return this;
        }
        return jsz2;
    }

    public final jtb d() {
        Object object = this.f;
        if (object == null) {
            object = null;
        } else if (this.g) {
            object = new jsg((Class)object);
        } else {
            int n2 = jsk.a;
            object = new jrz((Class)object);
        }
        return object;
    }

    @Override
    public final Object e() {
        throw null;
    }

    protected abstract void f();
}

