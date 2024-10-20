/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;

public final class hxd
extends AbstractList {
    private final hxb a;
    private final hxc b;

    public hxd(hxb hxb2, hxc hxc2) {
        this.a = hxb2;
        this.b = hxc2;
    }

    @Override
    public final Object get(int n2) {
        hxb hxb2 = this.a;
        return this.b.a(hxb2.e(n2));
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

