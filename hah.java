/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class hah
extends hdx {
    final hdx a;
    final hak b;

    public hah(hak hak2) {
        this.b = hak2;
        this.a = hak2.a.k().k();
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return ((Map.Entry)this.a.next()).getValue();
    }
}

