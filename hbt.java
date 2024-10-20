/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public final class hbt
extends AbstractSequentialList
implements Serializable {
    private static final long serialVersionUID = 0L;
    final List a;
    final gte b;

    public hbt(List list, gte gte2) {
        fxf.K(list);
        this.a = list;
        this.b = gte2;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int n2) {
        return new hbs(this, this.a.listIterator(n2));
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.a.subList(n2, n3).clear();
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

