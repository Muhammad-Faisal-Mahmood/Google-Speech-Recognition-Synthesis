/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

final class hbm
extends hdx {
    private final Object a;
    private boolean b;

    public hbm(Object object) {
        this.a = object;
    }

    @Override
    public final boolean hasNext() {
        return !this.b;
    }

    public final Object next() {
        if (!this.b) {
            this.b = true;
            return this.a;
        }
        throw new NoSuchElementException();
    }
}

