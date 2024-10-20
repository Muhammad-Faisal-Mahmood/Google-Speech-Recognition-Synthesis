/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;

final class gxg
extends gxj
implements NavigableSet {
    final gxp b;

    public gxg(gxp gxp2, NavigableMap navigableMap) {
        this.b = gxp2;
        super(gxp2, navigableMap);
    }

    final NavigableMap a() {
        return (NavigableMap)super.b();
    }

    public final Object ceiling(Object object) {
        return this.a().ceilingKey(object);
    }

    public final Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        NavigableMap navigableMap = this.a().descendingMap();
        return new gxg(this.b, navigableMap);
    }

    public final Object floor(Object object) {
        return this.a().floorKey(object);
    }

    public final NavigableSet headSet(Object navigableMap, boolean bl2) {
        navigableMap = this.a().headMap(navigableMap, bl2);
        return new gxg(this.b, navigableMap);
    }

    public final Object higher(Object object) {
        return this.a().higherKey(object);
    }

    public final Object lower(Object object) {
        return this.a().lowerKey(object);
    }

    public final Object pollFirst() {
        return fvd.G(((hbz)this).iterator());
    }

    public final Object pollLast() {
        return fvd.G(this.descendingIterator());
    }

    public final NavigableSet subSet(Object navigableMap, boolean bl2, Object object, boolean bl3) {
        navigableMap = this.a().subMap(navigableMap, bl2, object, bl3);
        return new gxg(this.b, navigableMap);
    }

    public final NavigableSet tailSet(Object navigableMap, boolean bl2) {
        navigableMap = this.a().tailMap(navigableMap, bl2);
        return new gxg(this.b, navigableMap);
    }
}

