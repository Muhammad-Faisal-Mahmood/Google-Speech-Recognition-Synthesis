/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class hbb
extends gzd {
    final Iterable a;
    final gtq b;

    public hbb(Iterable iterable, gtq gtq2) {
        this.a = iterable;
        this.b = gtq2;
    }

    public final Iterator iterator() {
        return fvd.C(this.a.iterator(), this.b);
    }
}

