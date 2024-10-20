/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.SortedSet;

public final class hdn
extends hdm
implements SortedSet {
    public hdn(SortedSet sortedSet, gtq gtq2) {
        super(sortedSet, gtq2);
    }

    public final Comparator comparator() {
        return ((SortedSet)this.a).comparator();
    }

    public final Object first() {
        return fvd.E(this.a.iterator(), this.b);
    }

    public final SortedSet headSet(Object object) {
        return new hdn(((SortedSet)this.a).headSet(object), this.b);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet)this.a;
        Object e2;
        gtq gtq2;
        while (!(gtq2 = this.b).a(e2 = sortedSet.last())) {
            sortedSet = sortedSet.headSet(e2);
        }
        return e2;
    }

    public final SortedSet subSet(Object object, Object object2) {
        return new hdn(((SortedSet)this.a).subSet(object, object2), this.b);
    }

    public final SortedSet tailSet(Object object) {
        return new hdn(((SortedSet)this.a).tailSet(object), this.b);
    }
}

