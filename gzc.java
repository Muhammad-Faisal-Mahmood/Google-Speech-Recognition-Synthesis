/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class gzc
extends gzd {
    final Iterable[] a;

    public gzc(Iterable[] iterableArray) {
        this.a = iterableArray;
    }

    public final Iterator iterator() {
        return new hbj(new gzb(this.a));
    }
}

