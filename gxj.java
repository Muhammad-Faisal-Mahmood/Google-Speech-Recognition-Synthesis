/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

class gxj
extends gxe
implements SortedSet {
    final gxp c;

    public gxj(gxp gxp2, SortedMap sortedMap) {
        this.c = gxp2;
        super(gxp2, sortedMap);
    }

    public SortedMap b() {
        return (SortedMap)this.d;
    }

    public final Comparator comparator() {
        return this.b().comparator();
    }

    public final Object first() {
        return this.b().firstKey();
    }

    public SortedSet headSet(Object sortedMap) {
        sortedMap = this.b().headMap(sortedMap);
        return new gxj(this.c, sortedMap);
    }

    public final Object last() {
        return this.b().lastKey();
    }

    public SortedSet subSet(Object sortedMap, Object object) {
        sortedMap = this.b().subMap(sortedMap, object);
        return new gxj(this.c, sortedMap);
    }

    public SortedSet tailSet(Object sortedMap) {
        sortedMap = this.b().tailMap(sortedMap);
        return new gxj(this.c, sortedMap);
    }
}

