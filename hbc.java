/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class hbc
extends gzd {
    final Iterable a;
    final gte b;

    public hbc(Iterable iterable, gte gte2) {
        this.a = iterable;
        this.b = gte2;
    }

    public final Iterator iterator() {
        return fvd.H(((gzx)this.a).v(), this.b);
    }
}

