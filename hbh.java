/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class hbh
extends hdv {
    final gte a;

    public hbh(Iterator iterator, gte gte2) {
        this.a = gte2;
        super(iterator);
    }

    @Override
    public final Object a(Object object) {
        return this.a.apply(object);
    }
}

