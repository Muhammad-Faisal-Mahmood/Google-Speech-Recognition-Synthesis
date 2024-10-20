/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class hag
extends hba {
    private final hac a;

    public hag(hac hac2) {
        this.a = hac2;
    }

    @Override
    public final Object a(int n2) {
        return ((Map.Entry)((gzm)this.a.k()).f().get(n2)).getKey();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public final hdx k() {
        return this.a.b();
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public Object writeReplace() {
        return new haf(this.a);
    }
}

