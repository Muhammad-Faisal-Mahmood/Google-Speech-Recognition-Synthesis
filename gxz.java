/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

public abstract class gxz
extends hdx {
    private Object a;

    protected gxz(Object object) {
        this.a = object;
    }

    protected abstract Object a(Object var1);

    @Override
    public final boolean hasNext() {
        return this.a != null;
    }

    public final Object next() {
        Object object = this.a;
        if (object != null) {
            this.a = this.a(object);
            return object;
        }
        throw new NoSuchElementException();
    }
}

