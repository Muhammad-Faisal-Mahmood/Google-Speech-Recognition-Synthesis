/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;

final class gxf
extends gxi
implements NavigableMap {
    final gxp c;

    public gxf(gxp gxp2, NavigableMap navigableMap) {
        this.c = gxp2;
        super(gxp2, navigableMap);
    }

    final Map.Entry c(Iterator iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry)iterator.next();
        Collection collection = this.c.a();
        collection.addAll((Collection)entry.getValue());
        iterator.remove();
        return new gzn(entry.getKey(), DesugarCollections.unmodifiableList(collection));
    }

    public final Map.Entry ceilingEntry(Object entry) {
        entry = this.d().ceilingEntry(entry);
        if (entry == null) {
            return null;
        }
        return this.a(entry);
    }

    public final Object ceilingKey(Object object) {
        return this.d().ceilingKey(object);
    }

    final NavigableMap d() {
        return (NavigableMap)super.h();
    }

    public final NavigableSet descendingKeySet() {
        return ((gxf)this.descendingMap()).f();
    }

    public final NavigableMap descendingMap() {
        NavigableMap navigableMap = this.d().descendingMap();
        return new gxf(this.c, navigableMap);
    }

    final NavigableSet e() {
        return new gxg(this.c, this.d());
    }

    public final NavigableSet f() {
        return (NavigableSet)super.j();
    }

    @Override
    public final Map.Entry firstEntry() {
        Map.Entry entry = this.d().firstEntry();
        if (entry == null) {
            return null;
        }
        return this.a(entry);
    }

    public final Map.Entry floorEntry(Object entry) {
        entry = this.d().floorEntry(entry);
        if (entry == null) {
            return null;
        }
        return this.a(entry);
    }

    public final Object floorKey(Object object) {
        return this.d().floorKey(object);
    }

    public final NavigableMap headMap(Object navigableMap, boolean bl2) {
        navigableMap = this.d().headMap(navigableMap, bl2);
        return new gxf(this.c, navigableMap);
    }

    public final Map.Entry higherEntry(Object entry) {
        entry = this.d().higherEntry(entry);
        if (entry == null) {
            return null;
        }
        return this.a(entry);
    }

    public final Object higherKey(Object object) {
        return this.d().higherKey(object);
    }

    @Override
    public final Map.Entry lastEntry() {
        Map.Entry entry = this.d().lastEntry();
        if (entry == null) {
            return null;
        }
        return this.a(entry);
    }

    public final Map.Entry lowerEntry(Object entry) {
        entry = this.d().lowerEntry(entry);
        if (entry == null) {
            return null;
        }
        return this.a(entry);
    }

    public final Object lowerKey(Object object) {
        return this.d().lowerKey(object);
    }

    public final NavigableSet navigableKeySet() {
        return this.f();
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        return this.c(this.entrySet().iterator());
    }

    @Override
    public final Map.Entry pollLastEntry() {
        return this.c(this.descendingMap().entrySet().iterator());
    }

    public final NavigableMap subMap(Object navigableMap, boolean bl2, Object object, boolean bl3) {
        navigableMap = this.d().subMap(navigableMap, bl2, object, bl3);
        return new gxf(this.c, navigableMap);
    }

    public final NavigableMap tailMap(Object navigableMap, boolean bl2) {
        navigableMap = this.d().tailMap(navigableMap, bl2);
        return new gxf(this.c, navigableMap);
    }
}

