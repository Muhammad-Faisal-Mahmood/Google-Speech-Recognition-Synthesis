/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

class gxi
extends gxb
implements SortedMap {
    SortedSet d;
    final gxp e;

    public gxi(gxp gxp2, SortedMap sortedMap) {
        this.e = gxp2;
        super(gxp2, sortedMap);
    }

    public final Comparator comparator() {
        return this.h().comparator();
    }

    public final Object firstKey() {
        return this.h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap)this.a;
    }

    public SortedMap headMap(Object sortedMap) {
        sortedMap = this.h().headMap(sortedMap);
        return new gxi(this.e, sortedMap);
    }

    public SortedSet i() {
        return new gxj(this.e, this.h());
    }

    public SortedSet j() {
        SortedSet sortedSet;
        SortedSet sortedSet2 = sortedSet = this.d;
        if (sortedSet == null) {
            this.d = sortedSet2 = this.i();
        }
        return sortedSet2;
    }

    public final Object lastKey() {
        return this.h().lastKey();
    }

    public SortedMap subMap(Object sortedMap, Object object) {
        sortedMap = this.h().subMap(sortedMap, object);
        return new gxi(this.e, sortedMap);
    }

    public SortedMap tailMap(Object sortedMap) {
        sortedMap = this.h().tailMap(sortedMap);
        return new gxi(this.e, sortedMap);
    }
}

