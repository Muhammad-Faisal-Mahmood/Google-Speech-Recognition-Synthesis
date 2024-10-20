/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

public abstract class gwx
extends hdx {
    private Object a;
    private int b = 2;

    protected gwx() {
    }

    protected abstract Object a();

    protected final void b() {
        this.b = 3;
    }

    @Override
    public final boolean hasNext() {
        boolean bl2 = this.b != 4;
        fxf.A(bl2);
        int n2 = this.b;
        int n3 = n2 - 1;
        if (n2 != 0) {
            if (n3 != 0) {
                if (n3 != 2) {
                    this.b = 4;
                    this.a = this.a();
                    if (this.b != 3) {
                        this.b = 1;
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        throw null;
    }

    public final Object next() {
        if (this.hasNext()) {
            this.b = 2;
            Object object = this.a;
            this.a = null;
            return object;
        }
        throw new NoSuchElementException();
    }
}

