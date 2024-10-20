/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;

final class hbq
extends hdw {
    final hbr a;

    public hbq(hbr hbr2, ListIterator listIterator) {
        this.a = hbr2;
        super(listIterator);
    }

    @Override
    public final Object a(Object object) {
        return this.a.b.apply(object);
    }
}

