/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;

final class hbs
extends hdw {
    final hbt a;

    public hbs(hbt hbt2, ListIterator listIterator) {
        this.a = hbt2;
        super(listIterator);
    }

    @Override
    public final Object a(Object object) {
        return this.a.b.apply(object);
    }
}

