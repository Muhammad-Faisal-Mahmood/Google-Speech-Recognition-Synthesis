/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hak
extends gzm {
    public final hac a;

    public hak(hac hac2) {
        this.a = hac2;
    }

    @Override
    public final boolean contains(Object object) {
        return object != null && fvd.K(new hah(this), object);
    }

    @Override
    public final gzx f() {
        return new hai(((gzm)this.a.k()).f());
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        return new hah(this);
    }

    @Override
    public final hdx k() {
        return new hah(this);
    }

    @Override
    public final boolean l() {
        throw null;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public Object writeReplace() {
        return new haj(this.a);
    }
}

