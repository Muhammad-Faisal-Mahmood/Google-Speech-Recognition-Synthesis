/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class hbg
extends gwx {
    final Iterator a;
    final gtq b;

    public hbg(Iterator iterator, gtq gtq2) {
        this.a = iterator;
        this.b = gtq2;
    }

    @Override
    protected final Object a() {
        while (this.a.hasNext()) {
            Iterator iterator = this.a;
            gtq gtq2 = this.b;
            if (!gtq2.a(iterator = iterator.next())) continue;
            return iterator;
        }
        this.b();
        return null;
    }
}

