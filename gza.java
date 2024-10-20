/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class gza
extends gzh
implements Serializable {
    private static final long serialVersionUID = 0L;
    final int a;
    private final Queue b;

    public gza(int n2) {
        fxf.t(true, "maxSize (%s) must >= 0", n2);
        this.b = new ArrayDeque(n2);
        this.a = n2;
    }

    @Override
    protected final /* synthetic */ Object a() {
        return this.b;
    }

    @Override
    public final boolean add(Object object) {
        fxf.K(object);
        if (this.size() == this.a) {
            this.b.remove();
        }
        this.b.add(object);
        return true;
    }

    @Override
    public final boolean addAll(Collection collection) {
        int n2 = collection.size();
        if (n2 >= this.a) {
            this.clear();
            int n3 = this.a;
            fxf.K(collection);
            boolean bl2 = (n2 -= n3) >= 0;
            fxf.r(bl2, "number to skip cannot be negative");
            return fvd.R(this, new hbe(collection, n2));
        }
        return fvd.J(this, collection.iterator());
    }

    @Override
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override
    protected final Queue c() {
        return this.b;
    }

    @Override
    public final boolean offer(Object object) {
        ((gze)this).add(object);
        return true;
    }
}

